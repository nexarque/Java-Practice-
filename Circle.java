class Circle{
    double radius ;

    Circle(double r ){
        radius = r;
    }

    double area(){
        return Math.PI * radius * radius;
    }

    double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class cicleMain{
    public static void main(String[] args) {
        Circle c1 = new Circle(10);

        System.out.println("The area of Circle is : %f\n"+ c1.area());
        System.out.println("The perimeter of Circle is : %2f\n"+ c1.perimeter());
    }
}