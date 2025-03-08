public class WasteContainer {
    private int capacity;
    private int currentLevel;
    private String wasteType;

    public WasteContainer(int capacity, String wasteType) {
        this.capacity = capacity;
        this.wasteType = wasteType;
        this.currentLevel = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getWasteType() {
        return wasteType;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void fill(int amount) {
        currentLevel += amount;
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }
}
