public class Main {
    public static void main(String[] args)
    {
        final int x = 10;
        final int y = 10;

        int[][] mass = new int [x][y];
      for (int i = 1; i < x; i ++)
      {
          for (int j = 1; j < y;  j ++)
          {
              mass[i][j] = i * j;
              System.out.print("\t" + mass[i][j] + " ");
          }
          System.out.println();
      }
    }
}