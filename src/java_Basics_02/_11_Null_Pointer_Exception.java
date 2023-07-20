package java_Basics_02;

public class _11_Null_Pointer_Exception {
    public static void main(String[] args) {
        String a = null;
        System.out.println(a); // null
        System.out.println(a.length());
        /*
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "a" is null
	     * at java_Basics_02._11_Null_Pointer_Exception.main(_11_Null_Pointer_Exception.java:7)
	     */
    }
}
