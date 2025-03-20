package Week8.CandidateManagement;



import Week8.CandidateManagement.DataInput;

import java.util.ArrayList;
import java.util.Calendar;


public class Manager {



    //allow user input information common of candidate
    public static void createCandidate(ArrayList<Candidate> candidates,
                                       int type) {
        //loop until user don't want to create new candidate
        while (true) {
            System.out.print("Enter id: ");
            String id = DataInput.InputString();
            System.out.print("Enter first name: ");
            String firstName = DataInput.InputString();
            System.out.print("Enter last name: ");
            String lastName = DataInput.InputString();
            System.out.print("Enter birth date: ");
            int birthDate ;
            while(true)
            {
                birthDate=DataInput.InputInteger();
                if
                (birthDate>=1900&&birthDate<=Calendar.getInstance().get(Calendar.YEAR))
                {
                    break;
                }
                else {
                    System.out.println("Invalid, input again");
                }
            }
            System.out.print("Enter address: ");
            String address = DataInput.InputString();
            System.out.print("Enter phone: ");
            String phone = DataInput.InputPhone();
            System.out.print("Enter email: ");
            String email = DataInput.InputEmail();
            Candidate candidate = new Candidate(id, firstName, lastName,
                    birthDate, address, phone, email, type);
            //check id exist or not
            if (!candidate.getId().equals(id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            String option;
            while (true) {
                System.out.print("Do you want to continue? (Y/N): ");
                option = DataInput.InputString().trim();

                if (option.equalsIgnoreCase("Y")) {
                    break;
                } else if (option.equalsIgnoreCase("N")) {
                    System.out.println("Exiting ");
                    return;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }
        }
    }

    //allow user create experience
    public static void createExperience(ArrayList<Candidate> candidates,
                                        Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = DataInput.InputInteger();
        System.out.print("Enter professional skill: ");
        String professionalSkill = DataInput.InputString();
        candidates.add(new Experience(yearExperience, professionalSkill,
                candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    //allow user create fresher
    public static void createFresher(ArrayList<Candidate> candidates,
                                     Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = DataInput.InputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank ;
        while (true) {
            graduationRank = DataInput.InputString();
            if (graduationRank.equalsIgnoreCase("Excellence")
                    || graduationRank.equalsIgnoreCase("Good")
                    || graduationRank.equalsIgnoreCase("Fair")
                    || graduationRank.equalsIgnoreCase("Poor"))
            {
                break;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Enter again: ");
            }
        }
        candidates.add(new Fresher(graduationDate, graduationRank, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    //allow user create internship
    public static void createInternship(ArrayList<Candidate> candidates,
                                        Candidate candidate) {
        System.out.print("Enter major: ");
        String major = DataInput.InputString();
        System.out.print("Enter semester: ");
        String semester = DataInput.InputString();
        System.out.print("Enter university: ");
        String university = DataInput.InputString();
        candidates.add(new Internship(major, semester, university, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getTypeCandidate()));
        System.err.println("Create success.");
    }

    //allow user search candidate by name
    public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = DataInput.InputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate ;
        while(true)
        {
            typeCandidate=DataInput.InputInteger();
            if(typeCandidate>=0&&typeCandidate<=2)
            {
                break;
            }else {
                System.out.println("Invalid, input again");
            }
        }
        for (Candidate candidate : candidates) {
            if (candidate.getTypeCandidate() == typeCandidate
                    && candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                System.out.println(candidate.toString());
            }
        }
    }

    //display list name candidate
    public static void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }

}

