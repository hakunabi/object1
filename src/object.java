public class object {
    public static void main(String[] args) {
        // challenge 1 (& 4)
        student student1 = new student("John Baeg",12,100);
        student student2 = new student("William Ballfour",12,200);
        student student3 = new student("Henry Tang",6,-100);
        student student4 = new student();

        System.out.println(student1.getName() + " Grade: " + student1.getGrade() + " Savings: " + student1.getSavings());
        System.out.println(student2.getName() + " Grade: " + student2.getGrade() + " Savings: " + student2.getSavings());
        System.out.println(student3.getName() + " Grade: " + student3.getGrade() + " Savings: " + student3.getSavings());
        System.out.println(student4.getName() + " Grade: " + student4.getGrade() + " Savings: " + student4.getSavings());

        // challenge 2
        school school1 = new school("SMSC","Private",200);
        school school2 = new school("Princeton","Public",1000);
        school school3 = new school("Brown","Public",2000);
        school school4 = new school();

        System.out.println("School name: " + school3.getSchoolName() + " Type: " + school3.getType() + " Class Size: " + school3.getClassSize());

        //challenge 3
        house house1 = new house("123 dober street", 100000,1010000,10);
        house house2 = new house("321 stupid street",200000,2115000,5);
        house house3 = new house("234 sms street",1234576,12345768,89);
        house house4 = new house();

        // i only printed one house
        System.out.println("Address: " + house1.getAddress());
        System.out.println("Size: " + house1.getSize());
        System.out.println("Price: " + house1.getPrice());
        System.out.println("Rooms: " + house1.getRooms());

    }
    }

