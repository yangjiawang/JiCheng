package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class StudentAchievement extends Subject_Score {
    StudentAchievement(int s1, int s2, int s3, int s4) {
        super(s1, s2, s3, s4);
        System.out.println(s1+""+s2+""+s3+""+s4);
    }

    @Override
    void sum() {
        super.sum();
    }

    @Override
    public String getReview() {
        return super.getReview();
    }

    @Override
    public void setReview(String review) {
        super.setReview(review);
    }
}
