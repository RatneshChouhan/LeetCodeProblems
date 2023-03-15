package com.rc.tech;

import java.util.*;
import java.util.stream.Collectors;

public class DeutscheBankOA_Que1 {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        final Map<String, Optional<Employee>> collect = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingInt(Employee::getCommit))));
    }

}

class Employee {
    private String id;
    private String name;
    private String dept;
    private int commit;

    public Employee(String id, String name, String dept, int commit) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.commit = commit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getCommit() {
        return commit;
    }

    public void setCommit(int commit) {
        this.commit = commit;
    }
}
