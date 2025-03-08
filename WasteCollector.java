public interface WasteCollector {
    void setNextCollector(WasteCollector nextCollector);
    void handleDisposal(WasteContainer container);
}
