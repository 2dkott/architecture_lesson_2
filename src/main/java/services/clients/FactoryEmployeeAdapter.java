package services.clients;

import domain.Employee;

public class FactoryEmployeeAdapter extends Employee {

    public FactoryEmployeeAdapter(FactoryEmployee factoryEmployee) {
        super(String.valueOf(factoryEmployee.getId()),
                getName(factoryEmployee.getFio()),
                getLastName(factoryEmployee.getFio()));
    }

    private static String getName(String fio) {
        return fio.split("_")[0];
    }

    private static String getLastName(String fio) {
        return fio.split("_")[1];
    }
}
