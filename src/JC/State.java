package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class State extends Person {
String name;
public State(String name){
    name=name;
    System.out.print(name);
}
State(String a,String b,int c){
      name=a;
      sex=b;
      age=c;
    System.out.println(name+""+age+""+sex);
}

}
