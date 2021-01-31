package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isValidEmail(String e) {
        return e.contains("@");
    }

    public boolean isValidMobile(String no) {
        return no.length() == 10;
    }

    public boolean isValidDate(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }

}
