package kea.spring2022.sorting;

public class Person implements Sammenlignbar , Comparable{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean sorteresEfter(Sammenlignbar andetObject) {

        return ((Person) andetObject).lastName.compareTo(this.lastName) > 0;
        /*

        if (((Person) andetObject).lastName.compareTo(this.lastName) < 0){
            return true;
        }
        return false;
    }*/

        // TODO: Gør det muligt at sammenligne (og dermed sortere) to personer

    }

    @Override
    public int compareTo(Object o) {
        return ((Person)o).firstName.compareTo(this.firstName);
    }
}
