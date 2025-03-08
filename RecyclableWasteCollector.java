public class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void handleDisposal(WasteContainer container) {
        if (container.getWasteType().equalsIgnoreCase("recyclable") && container.isFull()) {
            System.out.println("Recyclable Waste Collector: Container (Capacity: " + container.getCapacity() + ") is full. Initiating recycling process.");
        } else if (nextCollector != null) {
            nextCollector.handleDisposal(container);
        } else {
            System.out.println("Warning: No collector found for container type: " + container.getWasteType());
        }
    }
}
