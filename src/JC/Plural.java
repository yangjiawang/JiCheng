package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class Plural {
double a;
double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void Jia(int a, int b){
int c=a+b;
System.out.println(c);
    }
    public void Jian(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
    public void Cheng(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    public void Chu(int a,int b){
        int c=a/b;
        System.out.println(c);
    }

}
