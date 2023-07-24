package java_Basics_02.access_modifier_package_2;

import java_Basics_02.access_modifier_package_1.Access1;

public class Access3 {
    public static void main(String[] args) {
        Access1 one = new Access1();
        // System.out.println(one.hours); // Not accessible in other packages
        System.out.println(one.seconds); //  Accessible
    }
}
