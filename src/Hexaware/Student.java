package Hexaware;

public class Student implements Comparable<Student>{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student()
    {

    }

    @Override
    public String toString() {
        return id+" "+name;
    }

    public Student(Integer id,String name){
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Student o){
//        return this.getId().compareTo(o.getId());
//        return o.getName().compareTo(this.getName());
        return this.getName().compareTo(o.getName());
    }

}
