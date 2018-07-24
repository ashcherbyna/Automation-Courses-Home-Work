import java.util.Random;
import java.util.Scanner;

 public class Triangel{

        private Point a;
        private Point b;
        private Point c;

        private float perimetr(){
            return a.distance(b)+ b.distance(c) + c.distance(a);
        }

        private double square(){
            float halfPerimetr = perimetr()/2.0f;
            return Math.sqrt(halfPerimetr*(halfPerimetr-a.distance(b))*
                    (halfPerimetr-b.distance(c))*(halfPerimetr-c.distance(a)));
        }

        private int typeOfTriangel(){
            int dA = (int)a.distance(b);
            int dB = (int)b.distance(c);
            int dC = (int)c.distance(a);

            //Равнобедренный
            if(dA == dB && dA != dC){return 1;}
            if(dB == dC && dB != dA){return 1;}
            if(dC == dA && dC != dB){return 1;}
            //Равносторонний
            if((dA == dB) && (dB == dC)) { return 2;}
            //Прямоугольный
            if(dA*dA+dB*dB == dC*dC){return 3;}
            if(dB*dB + dC*dC == dA*dA){return 3;}
            if(dC*dC + dA*dA == dB*dB){return 3;}
            //Разносторонний
            return 4;
        }
        public String getInfo(){
            return String.format("[a[%d,%d], b[%d,%d], c[%d,%d]", a.x, a.y, b.x, b.y, c.x, c.y);
        }


    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);

        final int triangelSize = 100000;
        Triangel[] triArray = new Triangel[triangelSize];
        Random rnd = new Random();
        for (int i=0; i<triangelSize; i++){
            Triangel newTriangel = new Triangel();
            newTriangel.a = new Point (rnd.nextInt(10),rnd.nextInt(10));
            newTriangel.b = new Point (rnd.nextInt(10),rnd.nextInt(10));
            newTriangel.c = new Point(rnd.nextInt(10),rnd.nextInt(10));
            triArray[i] = newTriangel;
        }

        System.out.println("Выбери класс треугольника");
        System.out.println("1. Равнобедренный");
        System.out.println("2. Равносторонний");
        System.out.println("3. Прямоугольный");
        System.out.println("4. Произвольный");

        int read = choose.nextInt();

        for (int i = 0; i < triangelSize; i++){
            if (triArray[i].typeOfTriangel() == read){
                System.out.println("Индекс: " +Integer.toString(i));
                System.out.println("Треугольник: " + triArray[i].getInfo());
                System.out.println("Периметр: " + triArray[i].perimetr());
                System.out.println("Площадь: " +triArray[i].square());
                break;
            }
        }


    }

 }