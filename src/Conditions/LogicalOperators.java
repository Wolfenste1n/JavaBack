package Conditions;
//        && (AND) - all conditions must be true
//        || (OR) - at least one condition must be true
//        ! (NOT) - reverses a condition (true = false, false = true)
public class LogicalOperators {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

// Try changing securityLevel to test different outcomes:
//
// securityLevel 1 = Access granted
// securityLevel 2 = Access granted
// securityLevel 3 = Access denied
// securityLevel 4 = Access denied
//
// If isAdmin = true, access is granted.
    }
}
