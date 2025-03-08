public class WasteManagementSystem {
    private WasteCollector collectorChain;

    public WasteManagementSystem() {
        WasteCollector hazardousCollector = new HazardousWasteCollector();
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();

        hazardousCollector.setNextCollector(organicCollector);
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(null);

        collectorChain = hazardousCollector;
    }

    public void processContainer(WasteContainer container) {
        collectorChain.handleDisposal(container);
    }
}
