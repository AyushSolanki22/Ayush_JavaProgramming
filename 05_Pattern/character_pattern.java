public class character_pattern {
    public static void main(String[] args) {
        char c=65;                              //or char c='A' simple  //implicit typecasting - from int to char
        for (int line=1; line<=4; ++line) {
            for (int ch=1; ch<=line; ++ch ) {
                System.out.print(c);
                ++c;
            }
            System.out.println();
        }
    }
}