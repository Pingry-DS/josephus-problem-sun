import java.lang.Math;

public class EasyJoe {

  public static void main(String[] args) {
    long num = Long.parseLong(args[0]);
    long multiple;
    double answer = 0;
    multiple = (long) (Math.log10(num) / Math.log10(2));
    System.out.println(multiple);
    answer = num - Math.pow(2, multiple);
    System.out.println((long) answer);
    answer = answer * 2 + 1;

    /*
    for (int n = 0; n < 100000; n++){
      if (Math.pow(2, n) > num){
        multiple = n - 1;
        answer = num - Math.pow(2, multiple) ;
        n = 100001;
      }
    }
    */

    System.out.println("Soldier #" + (long) answer + " survives");

  }

}
