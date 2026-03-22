class Staff {
    void work() {
        System.out.println("Staff is working");
    }
}

class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor is diagnosing and treating patients");
    }
}

class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse is assisting doctors and caring for patients");
    }
}

class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist is managing appointments and front desk");
    }
}

public class Main {
    public static void main(String[] args) {
        Staff[] staffMembers = new Staff[3];

        staffMembers[0] = new Doctor();
        staffMembers[1] = new Nurse();
        staffMembers[2] = new Receptionist();

        for (Staff staff : staffMembers) {
            staff.work();
        }
    }
}
