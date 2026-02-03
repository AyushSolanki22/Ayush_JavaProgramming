public class test {
    public static void main(String[] args){
        String s="appnnacollege";
        String newStr="";
        newStr+=s.charAt(0);
        for(int i=1;i<s.length(); ++i){
            boolean found=false;
            for (int j=i-1; j>=0; --j){
                if(s.charAt(i)==s.charAt(j)){
                    found=true;
                }
            }
            if(found==false){
                newStr+=s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
