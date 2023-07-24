package java_Basics_02.access_modifier_package_1;

public class Access1 {
    /*
     - default : only accessible by all Classes in the same package
     - public : accessible by all Class in all packages
     - private: only accessible in the same class
     - protected: only accessible by the same package Classes OR inherited subClasses
     */

    int hours = 3;
    int minutes = 74;

    public int seconds = 45;

    private int accountNumber = 1_236_568_484;
}
