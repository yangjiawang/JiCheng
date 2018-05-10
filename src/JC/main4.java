package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class main4 {
    public static void main(String[] args) {
Pet a=new Pet();
        Pet2 a2=new Pet2();
a.setAge(8);
a.setName("公爵");
a.setPartner("没有");
a.setGender("母");
        a2.setAge(8);
        a2.setName("公爵");
        a2.setPartner("没有");
        a2.setGender("公");
        if (a.getAge()>5&&a2.getAge()>4){
         if (!a.getGender().equals(a2.getGender())){
             if (a.getPartner().equals("没有")&&a2.getPartner().equals("没有")){
                 System.out.print("条件满足可以结婚");
             }else
             {
                 System.out.print("不行");
             }
         }
         else {
             System.out.print("不行");
         }
        }else {
            System.out.print("不行");
        }
    }
}
