public class Person {

    String name,age,favoriteFood;

    public Person(){
        name = "Unknown";
        age = "Unknown";
        favoriteFood = "Unknown";
    }
    public Person(String name, String age,String favoriteFood){
        this.name= name;
        this.age = age;
        this.favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    public String toString(){
        String message = name + "\n" + age + "\n" + favoriteFood + "\n";
        return  message;
    }
}
