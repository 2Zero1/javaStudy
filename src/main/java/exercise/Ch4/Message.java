package exercise.Ch4;

import java.util.ArrayList;

public final class Message implements Cloneable {
    private String sender;
    private ArrayList<String> recipients = new ArrayList<>();
    private String text;
    public ArrayList<Employee> employees = new ArrayList<>();
    public String[] array = new String[5];

    public void employeeAdd(Employee employee) {
        employees.add(employee);
    }

    public void employeeIterate() {
        employees.forEach(System.out::println);
    }

    @Override
    protected Message clone() {
        //ArrayList 요소들의 참조 들도 모두 복사 해주었음.
        try {
            Message cloned = (Message) super.clone();
            ArrayList<String> clonedRecipients = (ArrayList<String>) recipients.clone();
            ArrayList<Employee> coppied = new ArrayList<>();
            for (Employee item : employees) {
                coppied.add(item);
            }
            cloned.recipients = clonedRecipients;
            cloned.employees = coppied;
            cloned.array = array.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return null;
        }
    }

    public void iterate() {
        recipients.forEach(System.out::println);
    }

    public void add(String value) {
        recipients.add(value);
    }

    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public void addRecipient(String recipient) {

    }

}
