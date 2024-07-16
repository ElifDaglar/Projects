public class CarrotPlant extends Plant {

    private int waterLevel;

    public CarrotPlant(String name, int growthTime) {
        super(name, growthTime);
        this.waterLevel = 0;
    }

    @Override
    public void water() {
        waterLevel++;
        if (waterLevel < 5) {
            System.out.println(getName() + " is growing. Growth time: " + waterLevel + "/" + getGrowthTime() + ".");
            System.out.println(getName() + " is not ready to harvest yet.");
        }
    }


    @Override
    public void harvest() {
        if (isHarvestable()) {
            System.out.println(getName() + " is growing. Growth time: " + waterLevel + "/" + getGrowthTime() + ".");
            System.out.println(getName() + " is ready to harvest.");
            System.out.println(getName() + " has been harvested. Congratulations!!!");
            setHarvestable(false);
        }
    }





    @Override
    public void grow() {
        if (waterLevel >= 5) {
            setHarvestable(true);
        }
    }

    public int getWaterLevel() {
        return waterLevel;
    }

}