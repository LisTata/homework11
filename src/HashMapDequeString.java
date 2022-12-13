import java.util.*;

public class HashMapDequeString {
    public static void main(String[] args) {
        HashMap<Integer,Deque> bigBox=new HashMap<>();
        for (int i = 0; i < 3; i++) {
           Deque<String> smallBox = new ArrayDeque<>();
            for (int j = 0; j < 3; j++)
                smallBox.add(generateString(3, 4));
            bigBox.put((Integer) i,smallBox);
        }
        for (Map.Entry<Integer,Deque> s :bigBox.entrySet()) {
            Integer key=s.getKey();
            Deque<String> value=s.getValue();

                System.out.print(key + " : "+value+" "+"\n");
            }
            System.out.println();
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
