public class Booleans {
    public static void main(String[] args) {
        // Test CompareBooleans
        testCompareBooleans();
    }
    
    public static boolean CompareBooleans(boolean orig, boolean val){
        return AreBooleansEqual(orig, val);
    }
    
    private static boolean AreBooleansEqual(boolean orig, boolean val){
        if(orig == val)
            return true;
        return false;
    }
    
    // Test method
    public static void testCompareBooleans() {
        // Test Case 1: true, true → true
        System.out.println("Test Case 1 (true, true): " + 
            (CompareBooleans(true, true) == true ? "PASS" : "FAIL"));

        // Test Case 2: true, false → false
        System.out.println("Test Case 2 (true, false): " + 
            (CompareBooleans(true, false) == false ? "PASS" : "FAIL"));

        // Test Case 3: false, true → false
        System.out.println("Test Case 3 (false, true): " + 
            (CompareBooleans(false, true) == false ? "PASS" : "FAIL"));

        // Test Case 4: false, false → true
        System.out.println("Test Case 4 (false, false): " + 
            (CompareBooleans(false, false) == true ? "PASS" : "FAIL"));
    }
}