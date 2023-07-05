package lesson7.task5;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" + "Телефон: " + number;
    }
}


