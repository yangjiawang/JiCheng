package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class CarHonda extends Car {
    CarHonda(){
        colour="黑色";
System.out.println(colour);
    }
    String produce;




    public CarHonda(String a){
        produce=a;
        System.out.println(produce);
    }
public  CarHonda(String  b,int c,String d){
        colour=b;
        model=c;
        produce=d;
        System.out.println(colour);
        System.out.println(model);
    System.out.println(produce);

}


}
