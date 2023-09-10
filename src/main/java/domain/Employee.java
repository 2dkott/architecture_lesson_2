package domain;

import java.util.UUID;

public class Employee {

    private final String id;
    private final String name;
    private final String lastName;

    public Employee(String name, String lastName) {
        this(UUID.randomUUID().toString(), name, lastName);
    }

    public Employee(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getNames() {
        return name + " " + lastName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
