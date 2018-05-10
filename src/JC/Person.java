package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class Person {
String name;
String    sex;
int    age;
public Person(){
  name="公爵";
sex="公";
age=3;
}
Person(Person name,Person sex,Person age){
    name=name;
    sex=sex;
    age=age;
}

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
