package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class Car {
 Car(){}
 String colour;
 int model;

    public String getColour() {
        return colour;
    }

    public int getModel() {
        return model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(int model) {
        this.model = model;
    }
  public void  show(){
        System.out.print(colour);
    }
    public void showModel(){
      System.out.print(model);
    }
}
