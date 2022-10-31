import java.util.Locale;

public class Vector2D {

    static int count;

    public double Vx, Vy;

    public Vector2D(){
        this.Vx = 1;
        this.Vy = 1;
        count++;
    }

    public Vector2D(double Vx, double Vy){
        this.Vx = Vx;
        this.Vy = Vy;
        count++;
    }

    public Vector2D(Vector2D v){
        this.Vx = v.Vx;
        this.Vy = v.Vy;
        count++;
    }

    public void print(){
        System.out.println("(" + String.format(Locale.US, "%.2f", Vx) + ", " + String.format(Locale.US, "%.2f", Vy) + ")");
    }

    public void add(Vector2D v){
        this.Vx = Vx + v.Vx;
        this.Vy = Vy + v.Vy;
    }
    public void sub(Vector2D v){
        this.Vx = Vx - v.Vx;
        this.Vy = Vy - v.Vy;
    }

    public void scale(double scaleFactor){
        this.Vx = Vx * scaleFactor;
        this.Vy = Vy * scaleFactor;
    }

    public double length(){
        return Math.sqrt((Vx * Vx) + (Vy * Vy));
    }

    public void normalized(){
        double temp = length();
        this.Vx = Vx / temp;
        this.Vy = Vy / temp;
    }

    public double dotProduct(Vector2D v){
        return Vx * v.Vx + Vy * v.Vy;
    }

}
