import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = getName(sc);
        String contact = getContactInfo(sc);
        String education = getEducation(sc);
        String experience = getWorkExperience(sc);
        String skills = getSkills(sc);
        System.out.println(buildResume(name,contact,education,experience,skills));

    }
    public static String getName(Scanner sc) {
        System.out.println("what is your name?");
        return sc.nextLine();
    }
    public static String getContactInfo(Scanner sc) {
        System.out.println("Please enter your contact info:");
        return sc.nextLine();
    }
    public static String getEducation(Scanner sc) {
        System.out.println("Please enter your education school, major and gradudation year:");
        return sc.nextLine();
    }
    public static String getWorkExperience(Scanner sc) {
        System.out.println("Please enter your most recent work experience:");
        return sc.nextLine();
    }
    public static String getSkills(Scanner sc) {
        System.out.println("Please enter list of skills:");
        return sc.nextLine();
    }
    public static String buildResume(String name,String contact,String education,String work,String skills) {
        String op = "Resume for "+name+"\n";
        op += "Contact information: "+contact+"\n";
        op += "Education: "+education+"\n";
        op += "Work Experience: " + work +'\n';
        op += "List of skills "+skills +'\n';

        return op;
    }




}
