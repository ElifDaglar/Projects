public class FarmVille {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Plant plant1 = new TomatoPlant("Tomato Plant", 3);
        Plant plant2 = new CarrotPlant("Carrot Plant", 5);
        farm.addPlant(plant1);
        farm.addPlant(plant2);
        System.out.println();


        for (int day = 1; day <= 3; day++) {
            System.out.println("Day " + day + ":");
            farm.simulateDay();


        }
    }
}


