package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;


public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isValidEmail() {
        return c -> c.getEmail().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isValidMob() {
        return c -> c.getMobNo().length() == 10 ? ValidationResult.SUCCESS : ValidationResult.MOB_NO_NOT_VALID;
    }

    static CustomerRegistrationValidator isValidDOB() {
        return c -> Period.between(c.getBirthDay(), LocalDate.now()).getYears() > 18
                ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult apply = this.apply(customer);
            return apply.equals(ValidationResult.SUCCESS) ? other.apply(customer) : apply;
        };
    }

    static enum ValidationResult {
        SUCCESS,
        MOB_NO_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT;
    }
}
