import java.lang.Math;

public class EasyJoe {

  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int multiple;
    double answer = 0;
    multiple = (int) (Math.log10(num) / Math.log10(2));
    answer = num - Math.pow(2, multiple);
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

    System.out.println("Soldier #" + (int) answer + " survives");

  }

}
