import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Write Number:" + "\t");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 7) {
            System.out.println("Hello" + "\t");
        }

        System.out.println("Write Name:" + "\t");
        String name = sc.next();
        Name Name = new Name(name);
        Name.Match();

        int[] array;
        System.out.println("Write the number of elements in the array:" + "\t");
        int arrNum = sc.nextInt();
        array = new int[arrNum];
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println("Write the element in the array:" + "\t");
            int eleNum = sc.nextInt();
            array[i] = eleNum;
        }
        System.out.println("Elements which are are multiples of 3:" + "\t");
        for (i = 0; i < array.length; i++) {
            if (array[i]%3==0) {
                System.out.println(array[i]+" ");
            }
        }
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