import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Write Number:"+"/t");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number>7){
        System.out.println("Hello");
    }

    System.out.println("Write Name:"+"/t");
    String name = sc.next();
    Name Name = new Name(name);
    Name.Match();


    }
}

class Name{
    String name;

    public Name(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void Match(){
        if(name.equals("Jhon")){
            System.out.println("Hello, Jhon");
        }else {
            System.out.println("There is no such name");
        }
    }
}