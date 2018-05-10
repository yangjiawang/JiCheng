package JC;

/**
 * Created by YANGJIAWANG on 2018/5/10.
 */
public class Box {
    int width;
    int height;
    int depth;

    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
        System.out.println("I am aBox");
    }

    public Box(Box width, Box height, Box depth) {
        width = width;
        height = height;
        depth = depth;
    }

    public Box(int a, int b, int c) {
        this.width = a;
        this.height = b;
        this.depth = c;
    }
}