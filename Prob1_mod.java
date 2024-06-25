package Java_Practice;

public class Prob1_mod {

  public static void main(String[] args) {

    System.out.println("문제 1");
    int[][] data = {
        {2, 4, 5, 7, 10, 14, 17, 22, 24, 25},
        {3, 5, 9, 13, 14, 15, 20}
    };

    for (int i = 0; i < data.length; i++){
      int odd = 0;
      int even = 0;
      System.out.printf("( 배열 i%c )\n", 'a'+i);

      for (int j= 0; j < data[i].length; j++){
          if(data[i][j]%2==1)       odd += data[i][j];
          else if (data[i][j]%2==0) even += data[i][j];
      }
      System.out.println("홀수의 합 : "+odd);
      System.out.println("짝수의 합 : "+even);
    }

    System.out.println("===============");
    System.out.println("문제 2");
    int[] random = new int[5];
    for(int i = 0; i < random.length; i++){
      int a = (int)(1+Math.random()*100);
      random[i] += a;
      System.out.print(random[i]+ " ");
    }


  }


}
