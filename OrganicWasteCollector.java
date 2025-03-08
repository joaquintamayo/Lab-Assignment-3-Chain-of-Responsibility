public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void handleDisposal(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("organic") && container.isFull()) {
            System.out.println("Organic Waste Collector: Container (Capacity: " + container.getCapacity() + ") is full. Scheduling organic waste for immediate pickup.");
        } else if (nextCollector != null) {
            nextCollector.handleDisposal(container);
        } else {
            System.out.println("Warning: No collector found for container type: " + container.getWasteType());
        }
    }
}
