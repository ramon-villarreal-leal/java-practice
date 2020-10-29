package practice;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class Student {
    public String name;
    public String cohort;

    public Student(String studentName) {
        name = studentName;
        cohort = "Unassigned";
    }

    public Student(String studentName, String assignedCohort) {
        name = studentName;
        cohort = assignedCohort;
    }

    public String getInfo() {
        return String.format("name: %s, cohort: %s", name, cohort);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Student A");
        Student s2 = new Student("Student B", "Voyagers");
        System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
        System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"


        // Zone Id with Zone Europe/Paris
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        // create a clock which ticks in whole minute
        Clock clock = Clock.tickMinutes(zoneId);

        // get ZonedDateTime object to print time
        ZonedDateTime time = clock.instant()
                .atZone(clock.getZone());

        // print time variable value
        System.out.println("Date and Time :" + time);
    }
}