public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void handleDisposal(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println("Hazardous Waste Collector: Container (Capacity: " + container.getCapacity() + ") is full. Activating hazardous material disposal protocols.");
        } else if (nextCollector != null) {
            nextCollector.handleDisposal(container);
        } else {
            System.out.println("Warning: No collector found for container type: " + container.getWasteType());
        }
    }
}
