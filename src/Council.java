import java.util.Scanner;

public class Council {


    //Symbol for array are []
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

System.out.println("how many persons would you like in your council");
int councilNumber = read.nextInt();
read.nextLine();

Person[] council = new Person[councilNumber];
int sumAges=0;
int averageAge=0;
for(int i = 0; i < councilNumber; i++){
    System.out.println("name of council person"+ (i+1) + ":");
    String name = read.nextLine();
    System.out.println("Age of council person" + (i +1) + ";");
    String age = read.nextLine();
    System.out.println("favorite food of person"+ (i+1) +";");
    String food = read.nextLine();

    Person person = new Person(name,age,food);
    council[i] = person;
}
for(int i =0; i < council.length; i++){
    System.out.println(council[1]);

    sumAges += Integer.parseInt(council[i].age());
    int averageAge = sumAges/council.length;

}

System.out.println("the average age is:"+ averageAge );
    }
}
