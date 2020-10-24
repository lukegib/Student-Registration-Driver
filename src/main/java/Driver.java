public class Driver {

    /*
    creating a handful of fictional students with mock data,
    adding the students to a number of modules and
    adding a number of modules to a course. Further on,
    the program should print out alist of all the courses,
    their respective modules,
    and all students,
    theirusernames,
    assigned modules and
    the course(s)they are registered for to the console.
    */

    public static void main(String[] args){

        // Create Students
        Student phoebe = new Student("Phoebe Buffay", 1965, 2, 16);
        Student ross = new Student("Ross Geller", 1967, 10, 18);
        Student monica = new Student("Monica Geller", 1969, 4, 2);
        Student joey = new Student("Joey Tribbiani", 1967, 1, 10);
        Student rachel = new Student("Rachel Green", 1969, 5, 5);
        Student chandler = new Student("Chandler Bing", 1968, 4, 12);

        // Create Modules
        Module french = new Module("French", "FR101", "Pierre Gasly");
        Module spanish = new Module("Spanish", "SP101", "Sergio Ramos");
        Module english = new Module("English", "EN101", "Lewis Hamilton");
        Module math = new Module("Mathematics", "MA101", "Leonardo da Vinci");
        Module science = new Module("Science", "SC101", "David Attenborough");
        Module business = new Module("Business", "BS101", "Steve Jobs");

        // Create Courses
        Course language = new Course("Languages", "L100", "Sergio Ramos", 1, 10, 12);
        Course comp_sci = new Course("Computer Science", "CS100", "Alan Turing", 1, 9, 24);
        Course general = new Course("General", "G100", "Leonardo Da Vinci", 1, 1, 6);

        // Add Modules to the Courses
        language.addModule(french);
        language.addModule(spanish);
        language.addModule(english);

        comp_sci.addModule(math);
        comp_sci.addModule(science);

        general.addModule(french);
        general.addModule(math);
        general.addModule(science);
        general.addModule(business);

        // Add Students to the Courses
        language.enrollStudent(phoebe);
        language.enrollStudent(joey);

        comp_sci.enrollStudent(ross);
        comp_sci.enrollStudent(chandler);
        comp_sci.enrollStudent(rachel);

        general.enrollStudent(rachel);
        general.enrollStudent(monica);

        // Print Out Data

    }

}
