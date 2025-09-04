class Rectangle {
    int lenght;
    int breadth;

    int area(){
        return lenght * breadth;
    }

    int perimeter(){
        return 2 * (lenght + breadth); 
    }

    Rectangle(int l, int b){
        lenght = l;
        breadth = b;
    }
}

class mainClass{
    public static void main(String [] args){
        Rectangle r1 = new Rectangle(10,7);
        Rectangle r2 = new Rectangle(20,8);

        System.out.println("The area of Rectangle  1 is : "+ r1.area());
        System.out.println("The perimeter of Rectangle 1 is : "+ r1.perimeter());

        System.out.println("The Area of Rectangle 2 is : "+ r2.area());
        System.out.println("The perimeter of Rectangle 2 is : "+ r2.perimeter());
    }
}