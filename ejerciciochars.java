import java.util.Scanner;

class ejerciciochars {
    static final int MAX_CHAR = 512;
 
    static void getchar(String str)
    {
         
        int count = 0;
        System.out.println("Ingrese un texto de Lorem Ipsum :");
        Scanner sc = new Scanner(System.in);
        
 
        int len = str.length();
 
        
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println(
                    "La letra "
                    + str.charAt(i)
                    + " aparece: " + count[str.charAt(i)] + " veces");
        }
    }
   
  
    public static void main(String[] args)
    {
        String str = "ejercicio chars";
        getchar(str);
    }
}
