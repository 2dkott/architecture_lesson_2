package services.clients;

import java.util.Random;

public class FactoryEmployee {
    private long id;

    private String fio;

    public FactoryEmployee(String name, String lastName) {
        this(new Random().nextLong(), name, lastName);
    }

    public FactoryEmployee(long id, String name, String lastName) {
        this.fio = name + "_" + lastName;
    }

    public long getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }
}
