public class Main {
    public static void main(String[] args)
    {
       combinations("Мама", "Мыла", "Раму");
    }

    public static void combinations (String word1, String word2, String word3)
    {
       String temp;
        for(int i = 0; i <= 5; i ++)
        {
            temp = word1;
            word1 = word2;
            word2 = word3;
            word3 = temp;

            System.out.println(word1 + word2 + word3);
        }
    }
}