import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;

public class LinkedListPriorityQueueString {
    public static void main(String[] args) {
        LinkedList<PriorityQueue> bigBox=new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            PriorityQueue <String> smallBox = new PriorityQueue<>();
            for (int j = 0; j < 3; j++)
                smallBox.add(generateString(3, 4));
            bigBox.add(smallBox);
        }
        for (PriorityQueue <String> smallBox : bigBox) {
            for (String s : smallBox) {
                System.out.print(s + " * ");
            }
            System.out.println();
        }
        //Примеры изменений
        //1.Заменить один PriorityQueue  на другой
        PriorityQueue<String> newSmallBox=new PriorityQueue<>();
        newSmallBox.add("aaa");
        newSmallBox.add("bbb");
        newSmallBox.add("cccc");

        bigBox.set(1,newSmallBox);

    }
    public static String generateString(int minCount, int maxCount) {
        Random random = new Random();
        //Получить случайное число от minCount до maxCount
        int count = random.nextInt(maxCount - minCount) + minCount;
        int rand = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char c = (char) (random.nextInt((int) 'z' - (int) 'a') + 'a');
            rand = random.nextInt(10) + 1;
            sb.append(c);
        }

        return sb.toString() + rand;
    }
}

