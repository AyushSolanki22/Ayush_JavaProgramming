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
        
    }
}