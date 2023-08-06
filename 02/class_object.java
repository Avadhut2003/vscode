
class student{
    int id;
    String name,dept;

    void display(){
        System.out.println(id + " " + name + " " + dept);
    }

    boolean update(String newname){
        name = newname;
        return true;
    }
}

public class class_object {
    public static void main(String[] args) {
        student obj = new student();
        obj.id = 1;
        obj.name = "luffy";
        obj.dept = "CS";

        obj.display();
        obj.update("Zoro");
        obj.display();
    }
}
