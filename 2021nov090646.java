import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Utils {

    public static void sortUsers(List<User> users) {
        // your code here
        Comparator<User> usersort = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                if (!(u1.getName().equals(u2.getName()))) {
                    return u1.getName().compareTo(u2.getName());
                } else {
                    return Integer.compare(u2.getAge(), u1.getAge());
                }
            }
        };

        users.sort(usersort);
    }
}

// class Utils {

//     public static void sortUsers(List<User> users) {
//         users.sort(Comparator.comparing(User::getName).thenComparing(User::getAge, Comparator.reverseOrder()));
//     }


// Multiple fields
// You have a User class with two fields: String name and int age. Implement a method that takes a list of users, List<User>, and sorts it according to the following rule:
// Users should be sorted by their names in lexicographic order and if two or more users have the same names, they should be sorted by their age in descending order. You don't need to read or write anything from or to the console, just implement the method.

// Hint


// Sample Input:
// John=25, Jane=25, Jim=18, Jack=18, John=30

// Sample Output:
// Jack=18, Jane=25, Jim=18, John=30, John=25


// Sample Input:
// Abby=19, Alice=19, Abby=21, Alice=21, Ashley=19

// Sample Output:
// Abby=21, Abby=19, Alice=21, Alice=19, Ashley=19



// Memory limit: 256 MB
// Time limit: 8 seconds

// Caution

// You may see errors in your code or execution results due to missing context. Don’t worry about it, just write the solution and press Check.
