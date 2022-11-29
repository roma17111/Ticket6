public class Main {

  public static void getNum (int [] num) {
      for (int i = 2; i <= 6; i++) {
          if (num[i] % 2 ==0) {
              num[i] +=1;
          }
          System.out.println(num[i]);

      }
  }

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        getNum(num);

  }
}