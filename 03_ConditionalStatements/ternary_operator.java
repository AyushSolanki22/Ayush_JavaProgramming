// ternary operator --> 3 operands
// variable = condition? stament1(if true):statement2(if false);
public class ternary_operator {
    public static void main(String[] args) {
        int num = 5; 
        int larger = (5>3 && 5>4)? 5:3;
        System.out.println(larger);
        String type = (num%2==0)? "even":"odd";
        System.out.println(type);

        int marks = 31;
        String ReportCard= (marks>=33) ? "Pass":"Fail";
        System.out.println(ReportCard);



    }
}
