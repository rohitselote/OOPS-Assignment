class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    void GetInfo(int roomNo, String custName, float charges, int days) {
        RNo = roomNo;
        Name = custName;
        Charges = charges;
        Days = days;
    }

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = 1.02f * amount; 
        }
        return amount;
    }

    void DispInfo() {
        System.out.println("Room No: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per day: " + Charges);
        System.out.println("Days of stay: " + Days);
        System.out.println("Total Amount: " + Compute());
    }
}
