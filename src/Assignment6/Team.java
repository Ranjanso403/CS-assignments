package Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class Team{

    Scanner sc = new Scanner(System.in);

    private static ArrayList<Person> teams = new ArrayList<Person>();

    String teamName = "TeamTeam";
    String coachName = "Mr. J";
    String conferenceName = "conference name";

    public static void main(String[] args) {
        Team tm = new Team();
        tm.display();
        tm.find();

    }

    public Team() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Name"+i+":");
            String name = sc.nextLine();
            System.out.println("Phone number"+i+":");
            String phonenumber = sc.nextLine();
            System.out.println("Birthday"+i+":");
            String birthday = sc.nextLine();
            System.out.println("Jersey Number"+i+":");
            String jerseynumber = sc.nextLine();
            this.teams.add(new Person(name,phonenumber,birthday,jerseynumber));
        }

    }


    public void display() {
        for (Person i :teams) {
            System.out.println(i.getName());
            System.out.println(i.getPhoneNumber());
            System.out.println(i.getBirthday());
            System.out.println(i.getJerseyNumber());
            System.out.println("--------------------");
        }
    }

    public void find() {
        System.out.println("find:");
        String name = sc.nextLine();

        for (Person i : teams) {
            if (name.equals(i.getName())) {
                System.out.println(i.getName());
                System.out.println(i.getJerseyNumber());
            }
        }
    }

}


