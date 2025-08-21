public class StringsE {

    public static void main (String[] args){

        String a = " hola";
        String b = "gent ";

        String c = "";

        //c= a+" "+b;

        int alog = a.length();
        int blog = b.length();

        c = a.concat("  ").concat(b);

        System.out.println(c);


        System.out.println(c.length());
        int u = c.length();

        System.out.println(c.charAt(0));
        System.out.println(c.charAt(c.length()-1));

        System.out.println(c.contains("ho5a"));

        System.out.println(c.trim());
        System.out.println(c.replace(" ","-"));

        System.out.println(a.equals(b));
        System.out.println(alog==blog);
    }

}
