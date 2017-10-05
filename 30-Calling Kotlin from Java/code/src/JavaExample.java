
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Calling Kotlin from Java
 */
import hello.*;
import java.util.*;

import static hello.hello.f;
import static hello.hello.functionInPackage2;

class MyJavaProgram {

    public static void main(String []args) {
        System.out.println("Hello World");
        Person person = new Person("Nguyen", "DucHoang", 35);
        System.out.println("Person details. Firstname: "+person.getFirstName() +
                "Lastname: "+person.getLastName() +
                "Age: "+person.getAge());
        System.out.println("Creditcard number is: "+person.creditCardNumber);
        functionInPackage2();
        //companion object(Kotlin) => static field(Java)
        System.out.println("PI number is: "+Calculation.PI);
        //const
        System.out.println("VERSION = "+Calculation.VERSION);
        //lateinit
        (new Calculation()).aRandomString = "abc";
        //static function
        Calculation.aStaticFunction();
        Calculation.Companion.aStaticFunction();//the same
        //function with default parameters
        f("string a");
        f("string a", 113);
        f("string a", 123, "string c");
    }

}

