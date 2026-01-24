//If class' properties are private, then getters & setters (functions) are used to update(modify),access(return) values of the class.
//this --> this keyword is used to refer to current object --- 

public class getters_setters {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Blue");
        // System.out.println(p1.color); //error
        p1.setTip(10);
        // System.out.println(p1.tip); //error
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }    
}
class Pen{
    private String color="red";
    private int tip;

    String getColor() {   //getters also allow to give the private varible values' to any class.
        return this.color;
    }
    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color=color;  //this keyword is used to refer to the current object. 
    }
    void setTip(int tip) {
        this.tip=tip; 
    }
}
