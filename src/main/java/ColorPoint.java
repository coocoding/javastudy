import java.awt.*;

public class ColorPoint extends Point{
    private String color;

    public ColorPoint(){
        super(0, 0);
        this.color="BLACK";
    }

    public ColorPoint(int x, int y) {
        super(x,y);
        this.color="BLACK";
    }

    public void setXY(int x,int y) {
        super.move(x,y);
    }



    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String toString() {
        return color+"색의 ("+getX()+","+getY()+")의 점";
    }
}
