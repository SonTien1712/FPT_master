package Week6;

import java.util.Date;

public class History extends Worker implements Comparable<Worker>
{
    private String status;
    private String data;

    public History(String id, String name, Date age, int salary, String workPlace, String status, String data) {
        super(id, name, age, salary, workPlace);
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int compareTo(Worker other) {
        return this.getId().compareTo(other.getId());
    }
}
