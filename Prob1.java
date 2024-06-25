package Java_Practice;

import java.util.Random;

public class Prob1 {

  public static void main(String[] args) {

    System.out.println("문제 1");
    int[][] data = {
        {2, 4, 5, 7, 10, 14, 17, 22, 24, 25},
        {3, 5, 9, 13, 14, 15, 20}
    };
int ia_odd = 0;
int ia_even = 0;
int ib_odd = 0;
int ib_even = 0;
    for (int i = 0; i < data.length; i++){
      for (int j= 0; j < data[i].length; j++){
        if(i==0){
          if(data[i][j]%2==1)       ia_odd += data[i][j];
          else if (data[i][j]%2==0) ia_even += data[i][j];
        }
        if(i==1){
          if(data[i][j]%2==1)       ib_odd += data[i][j];
          else if (data[i][j]%2==0) ib_even += data[i][j];
        }
      }
    }
    System.out.println("( 배열 ia )");
    System.out.println("홀수의 합 : "+ia_odd);
    System.out.println("짝수의 합 : "+ia_even);
    System.out.println("( 배열 ib )");
    System.out.println("홀수의 합 : "+ib_odd);
    System.out.println("짝수의 합 : "+ib_even);

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
