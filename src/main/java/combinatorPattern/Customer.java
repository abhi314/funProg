package combinatorPattern;

import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;
    private final String mobNo;
    private final LocalDate birthDay;

    public Customer(String name, String email, String mobNo, LocalDate birthDay) {
        this.name = name;
        this.email = email;
        this.mobNo = mobNo;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
}
