import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String name = "HARDIKyadav";
        String newname = new String("hardik");
        /*System.out.println(name);
        int value =newname.length();
        System.out.println(value);*/
        String val = name.toLowerCase();
        String  val2   = name.toUpperCase();
        String val3 = newname.trim();
        String  val4 = name.substring(0);
        String val5 = name.replace('y','s');
       String  my = newname.trim();
        //System.out.println(my.substring(0,4));

      //  System.out.println(val5);
        //  System.out.println(name.replace("a","sexy"));
       // System.out.println(name.startsWith("h"));
        //System.out.println(name.startsWith("v"));
       // System.out.println(name.endsWith("v"));
       // System.out.println(name.charAt(6));
        //System.out.println(name.indexOf("a"));
       /* String num = "harhardikdik";
        System.out.println(num.indexOf("dikdik",3));
        System.out.println(num.indexOf("a"));
        System.out.println(num.lastIndexOf("dik",8));
        System.out.println(newname.equals("hardik"));
        System.out.println(name.equalsIgnoreCase("hardikyadav"));
        System.out.println("ya he said this  \t\" yess he said this \" ");
        System.out.println();*/
        String name1 = " H A R D I K ";
        System.out.println(name1.toLowerCase());
        System.out.println(name1.replace(" ","_"));
        String user= "harshita";
        System.out.printf(" dear %s talks  a lot \n ",user);
        String nnewstring = " deo sthis  string contain   ";
        System.out.println(nnewstring.indexOf("  "));
        System.out.println(nnewstring.indexOf("   "));
        System.out.println("DEAR harry, \n \t this java coirse is nice \n thanks.");

    }
}
