public class Point {
    public int x;
    public int y;
    private static final int oldPointX = 10;
    private static final int oldPointY = 10;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point newPoint = new Point(5,5);

        System.out.println(vectorLength(newPoint));
    }

    public static float vectorLength(Point newPoint){
        return (float) Math.sqrt((oldPointX-newPoint.getX())*2 + (oldPointY-newPoint.getY())*2);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return y;
    }
}