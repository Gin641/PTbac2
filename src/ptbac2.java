import java.util.Scanner;

public class ptbac2 {
    double a;
    double b;
    double c;
    public ptbac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDis(){
        return Math.pow(this.b,2)-(4 * this.a * this.c);
    }
    public double getRoot1(){
        return ((-this.b)+Math.pow(this.getDis(),0.5))/(2 * this.a);
    }
    public double getRoot2(){
        return ((-this.b)-Math.pow(this.getDis(),0.5))/(2 * this.a);
    }
    public double get2Root(){
        return (-this.b)/(2 * this.a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a: ");
        double a = sc.nextDouble();
        System.out.print("nhập b: ");
        double b = sc.nextDouble();
        System.out.print("nhập c: ");
        double c = sc.nextDouble();
        System.out.printf("phương trình vừa nhập là : %-3.1fX^2-*%-3.1fX+%-3.1f=0\n",a,b,c);
        ptbac2 ptbac2 = new ptbac2(a,b,c);
        if (a==0){
            System.out.print("k phải PT bậc 2!");
        }else {
            double dis = ptbac2.getDis();
            if (dis < 0){
                System.out.print("PTVN");
            }else if (dis == 0){
                System.out.print("PT có nghiệm kép là: " + ptbac2.get2Root());
            }else {
                System.out.println("PT có 2 nghiêm: ");
                System.out.printf("Nghiệm 1 = %-4.1f\n",ptbac2.getRoot1());
                System.out.printf("Nghiệm 2 = %-4.1f",ptbac2.getRoot2());
            }
        }
    }
}
