import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*

A sample array of names is below. The format of each element is  "firstname middlename lastname"
each separated by a space or tab. The firstname and lastname are both  required, middlename is optional.
Write a method that takes an array of names and a  stream as inputs.
It must print each last name that occurs more than once, followed by a count of how many times it occurs.
The result must be ordered by the count of occurrences, in descending order.
Write a unit test to validate your solution.

Sample output is below

Gates 3
Johnson 2


A skeleton  Java program is below to help you get started.
Keep the code simple. No need to use any advanced language features.

Good Luck!

*/
public class CountLastName {

    static final String[] names = {
            "Melinda Ann	Gates",
            "John Michael",
            "Bill Gates",
            "Michael Peterson",
            "George W Bush",
            "Rod Johnson",
            "Michael Johnson",
            "Mary Sue Gates"

    };

    public static void main(String[] args) {
        printLastNameCounts(names, System.out);
    }

    public static void printLastNameCounts(String[] names, java.io.PrintStream out) {
        ArrayList<String> lastnames = new ArrayList<>();
        HashSet<String> noRepetition = new HashSet<>();
        ArrayList<Person> persons = new ArrayList<>();
        //Getting the lastnames from 'names'
        for (String s :
                names) {
            String temp = "";
            temp = s.replaceAll("\t", " ");
            String[] split = temp.split(" ");
            if (split.length > 2) {
                lastnames.add(split[2]);
            } else {
                lastnames.add(split[1]);
            }
        }

        //Adding lastnames to Set to prevent duplicating
        noRepetition.addAll(lastnames);

        //Calculating the occurrences
        for (String s : noRepetition) {
            int hits = 0;
            for (String s1 : lastnames) {
                if (s.equals(s1)) {
                    hits++;
                }
            }
            persons.add(new Person(s, hits));
        }

        //Sorting in to descending order & printing
        Collections.sort(persons);
        for (Person p : persons) {
            if (p.hits > 1) {
                out.println(p.lastName + " " + p.hits);
            }
        }


    }
}

class Person implements Comparable<Person> {
    public String lastName = "";
    public Integer hits;

    public Person(String lastName, Integer hits) {
        this.lastName = lastName;
        this.hits = hits;
    }

    @Override
    public int compareTo(Person person) {
        return person.hits.compareTo(hits);
    }
}