
import com.Model.Model;

import java.util.logging.Logger;
import java.lang.String;
import java.lang.*;

public final class Main {
    protected static String headline = "This is main class";
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static final int[] arr={1,2,3,4,5};
     public static final String arr3[]=new String[3];
     public static final String arr3[]=new String[3];
    public static final String arr4[];
     public static final String[][] arr7;

    public static void main(String[] args) {
        String welcome_msg = "WelCome";
        System.out.println(welcome_msg);
        honda honda = new honda(3, 100, 25);
        Delux$ delux$ = new Delux$(4, 120, 25);
        LOGGER.info(honda.toString());
        LOGGER.info(delux$.toString());
        System.out.println(honda);
         System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        System.out.println(honda);
        
        
        mercedes mercedes = new mercedes(5, 200, 45);
        BMW bmw = new BMW(4, 180, 50);
        int length = bmw.getLength(new String[]{"Welcome", "To", "Embold"});
        LOGGER.info(mercedes.toString());
        LOGGER.info(bmw.toString());
        System.out.println(bmw);
         System.out.println(bmw);
         System.out.println(bmw);
         System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        System.out.println(bmw);
        

        Category category= new Category();
        category.setCategory("FourWheeler",1);
        boolean isSame = category.bar(5,5);
        category.set(Model.BMW);
        String categoryName = category.getCategory();
        LOGGER.info(categoryName);

        category.set(Model.Audi);
        String categoryName1 = category.getCategory();
        LOGGER.info(categoryName1);

        category.set(Model.Ferrari);
        String categoryName2 = category.getCategory();
        LOGGER.info(categoryName2);
        try{
            int a=10, b=0, c=0;
            c=(a/b);
        } catch(Exception e){
        
        }

        while (isSame)
            LOGGER.info(String.valueOf(isSame));

        Some_JNIclass some_jnIclass=new Some_JNIclass();
        String stringValue = some_jnIclass.getstringvalue(2);
        System.out.println(stringValue);
        System.out.println(stringValue);
    }

    protected void whichClass(){
        LOGGER.info(headline);
    }
}
