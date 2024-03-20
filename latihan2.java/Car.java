
class Car {
 
    // Buat method injak Gas
    public void InjakGas() {
      System.out.println("Mobil saya melaju dengan kecapatan tinggi!");
    }
  
    // Buat method speed dan parameter kecepatan
    public void speed(int maxKecepatan) {
      System.out.println("Max speed adalah: " + maxKecepatan + "Km/Jam");
    }
  
    // Panggil method diatas
    public static void main (String[] args) {
      Car myCar = new Car();     // 
      myCar.InjakGas();      //  method injak gas
      myCar.speed(200);         // Method kecepatan
    }
  }
  