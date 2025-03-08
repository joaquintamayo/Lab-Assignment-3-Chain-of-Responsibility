public class WasteManagement {
    public static void main(String[] args) {
        WasteManagementSystem system = new WasteManagementSystem();

        WasteContainer organicContainer = new WasteContainer(150, "organic");
        organicContainer.fill(150);
        system.processContainer(organicContainer);

        WasteContainer recyclableContainer = new WasteContainer(100, "recyclable");
        recyclableContainer.fill(100);
        system.processContainer(recyclableContainer);

        WasteContainer hazardousContainer = new WasteContainer(50, "hazardous");
        hazardousContainer.fill(50);
        system.processContainer(hazardousContainer);

        WasteContainer emptyOrganicContainer = new WasteContainer(150, "organic");
        emptyOrganicContainer.fill(0);
        system.processContainer(emptyOrganicContainer);

        WasteContainer halfRecyclableContainer = new WasteContainer(100, "recyclable");
        halfRecyclableContainer.fill(50);
        system.processContainer(halfRecyclableContainer);

        WasteContainer overHazardousContainer = new WasteContainer(50, "hazardous");
        overHazardousContainer.fill(60);
        system.processContainer(overHazardousContainer);

    }
}
