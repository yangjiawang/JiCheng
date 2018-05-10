package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class Subject_Score {
    String name;
    String classroom;
    String sub1;
    String sub2;
    String sub3;
    String sub4;
    int s1;
    int s2;
    int s3;
    int s4;
    String review;
    Subject_Score(String sub1,String sub2,String sub3,String sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    Subject_Score(int s1,int s2,int s3,int s4){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
    }
    void sum(){
        int c=s1+s2+s3+s4;
        int a=c/4;
        System.out.println("和"+c+"平均分是"+a);
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
