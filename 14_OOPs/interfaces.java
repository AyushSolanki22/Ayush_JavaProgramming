//Interface- is a blueprint of class ((like class is a blueprint of object))
//car's features(class),, car's features specifications/blueprint(interface)--- like car[wheels, speed, engine](interface)--- maruti 800(class)

// It is used to implement multiple inheritance, achieve total/full abstraction(we didn't have full abstraction- we had choice 0-100%)

//All methods are public, abstract and without implementation., BY DEFAULT 
//Used to achieve full abstraction.
//Variables in the interface are final, public and static
public class interfaces {
    public static void main(String[] args) {
        
    }
}
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
    public void moves() {     //we write public keyword as to ensure that this doesn't be default function.& also interface(PARENT) has made public moves() method.
         System.out.println("up,down,left,right,diagonal(in all 4 directions )");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal -(all 1 step only)");
    }
}


//Multiple Inheritance
interface Herbivore{

}
interface Carnivore{

}
class Bear implements Herbivore,Carnivore{
    
}