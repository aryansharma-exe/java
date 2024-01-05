import java.utils.*;

public class area-of-circle{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  double radius = sc.nextInt();
  double pie = 3.14;
  double area = (radius*radius)*pie;

  System.out.print(area);
  }
}
