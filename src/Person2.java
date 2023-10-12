public class Person2 {
    public String name;
    public int age;
    public boolean gender;

    public void GetGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
    public void introduce(){
        System.out.println("Hi, Im"+name
                +", a "+age+"year old and"+(gender ? "male" : "female") + ".");
    }
    public Person2(){
        name="Jane Doe";
        age=30;
        gender=false;
    }
    public static void main(String[] args) {

    }
}