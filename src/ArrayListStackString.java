import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class ArrayListStackString {
    public static void main(String[] args) {
// ArrayList<Stack>
        ArrayList<Stack<String>> bigBox = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Stack<String> stackSmallBox = new Stack<>();
            for (int j = 0; j < 3; j++)
                stackSmallBox.push(generateString(3, 4));
            bigBox.add(stackSmallBox);
        }

        for (Stack<String> stackSmallBox : bigBox) {
            for (String s : stackSmallBox) {
                System.out.print(s + " | ");
            }
            System.out.println();
        }
        //Примеры изменений
        //1.Заменить один stack на другой
        Stack<String> stackSmallBox1 = new Stack<>();
        stackSmallBox1.add("aaaa");
        stackSmallBox1.add("bbbb");
        stackSmallBox1.add("ccccc");

        bigBox.set(2, stackSmallBox1);

        //замена строки в стеке по индексу например 2
            for (Stack<String> smallbox:bigBox)
                for (int i = 0; i < smallbox.size(); i++) {
                    if (i==2)
                        smallbox.set(i,"ooo");

                }





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