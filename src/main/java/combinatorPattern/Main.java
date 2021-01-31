package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Abhi", "abhi@patil", "8844551199",
                LocalDate.of(1980, 7, 6));

        ValidationResult res = isValidEmail().and(isValidMob()).and(isValidDOB()).apply(cust);
        System.out.println(res);
    }
}
