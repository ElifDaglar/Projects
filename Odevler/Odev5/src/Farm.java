import java.util.ArrayList;

public class Farm {
    ArrayList<Plant> plants = new ArrayList<>();

    public void simulateDay() {
        for (Plant plant : plants) {
            plant.water();
            plant.grow();
            plant.harvest();
        }
        System.out.println();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
        System.out.println(plant.getName() + " has been added to farm.");


    }


}
