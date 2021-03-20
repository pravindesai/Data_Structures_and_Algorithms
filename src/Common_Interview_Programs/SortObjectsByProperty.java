package Common_Interview_Programs;

import java.util.ArrayList;

public class SortObjectsByProperty {

    public static void main(String[] args) {
        ArrayList<Student> arrayList= new ArrayList<>();

        arrayList.add(new Student(3,"CCC"));
        arrayList.add(new Student(1,"AAA"));
        arrayList.add(new Student(2,"BBB"));
        arrayList.add(new Student(5,"EEE"));
        arrayList.add(new Student(4,"DDD"));
        arrayList.add(new Student(6,"FFF"));

        sortlistbyId(arrayList);
    }

    private static void sortlistbyId(ArrayList<Student> arrayList) {

        int n = arrayList.size();
        for(int itr = 0; itr< n-1; itr++){
            for (int j = 0; j < n-itr-1; j++)

                if (arrayList.get(j).getId() > arrayList.get(j+1).getId())
                {
                    // swap arr[j+1] and arr[j]
                    Student temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                }
        }


        for (Student student : arrayList) {
            System.out.println(student.getId()+" : "+student.getName());
        }
    }


}

class Student{
        int id;
        String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
