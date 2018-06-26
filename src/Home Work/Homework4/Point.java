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
        float dX = (oldPointX-newPoint.getX());
        float dY = (oldPointY-newPoint.getY());
        return (float) Math.sqrt(dX*dX +dY*dY);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return y;
    }
}