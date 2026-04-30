public class builtIn_func{
    public static void main(String[] args) {
        String s="ayush solanki";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        String s1="Ayush Solanki";
        System.out.println(s1.toLowerCase());    //functions follows camel case naming 
        System.out.println(s.contains("an"));
        if("harsh".contains("ar")){   
            System.out.println("ar");
        }
        if(s1.startsWith("Ayush")) System.out.println(true);

        s1.toUpperCase();
        System.out.println(s1);    //s1 mai koi change ni hoga , if u want to make all in upper case then either u can do is s=s1.toUpperCase()

        //compareTo -- lexographic largest file
        

        //concat
        String a="Ayush";
        String b="Solanki";
        System.out.println(a.concat(b));
        System.out.println(a+" "+b);        //+ --> also results in concatenation.  We can add String/character/integer anything     
        a.concat(b); 
        System.out.println(a);  //Agaon there will be no change in result, if u need to concat it really(not temporarily), use a=a.concat(b)

        System.out.println('A'+2+"Ayush");  //will print 67Ayush  //left to right associativity (A+2 --> Integer}

        //int n ko input kra skte' & add krrskte (integer me 0, initial zeroes--> useless, so not printed in string) (same as for trailing zeroes in double)
        // String s=    ""+n;   


        //Conversion of String to Int
        //String str="7567854";
        //int n=Integer.parseInt(str);    //Integer.parseInt(str)

        //Conversion of String to Int
        //int n=5; 
        //String s=Integer.toString(n);    //Integer.toString(n)

        //Conversion of String to Array
        //String s="Ayush";
        //char arr[]=s.toCharArray();

    
}