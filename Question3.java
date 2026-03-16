class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;
  
    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
        Rent = GetRent(); 
    }

 
    float GetRent() {
        switch (CarType) {
            case "Small Car": return 1000;
            case "Van": return 800;
            case "SUV": return 2500;
            default: return 0;
        }
    }

    
    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}
