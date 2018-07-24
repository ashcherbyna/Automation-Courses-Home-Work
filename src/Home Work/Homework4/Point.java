public class Point{
    public int x;
    public int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float distance(Point f){

        return (float) Math.sqrt((x-f.x)*(x-f.x)+(y-f.y)*(y-f.y));
    }
}