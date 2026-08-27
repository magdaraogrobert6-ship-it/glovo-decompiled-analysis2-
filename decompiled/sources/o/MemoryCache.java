package o;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCache {
    public static final ViewRootForInspectorDefaultImpls serializer;
    public final getNetworkModule IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int write;

    static {
        getNetworkModule getnetworkmodule = TranslationsENABLEDCompanion.read;
        MemoryCache memoryCache = new MemoryCache(5, 32, 5, getnetworkmodule);
        MemoryCache memoryCache2 = new MemoryCache(6, 32, 10, getnetworkmodule);
        MemoryCache memoryCache3 = new MemoryCache(7, 32, 15, getnetworkmodule);
        MemoryCache memoryCache4 = new MemoryCache(8, 32, 20, getnetworkmodule);
        MemoryCache memoryCache5 = new MemoryCache(9, 32, 25, getnetworkmodule);
        MemoryCache memoryCache6 = new MemoryCache(10, 24, 5, getnetworkmodule);
        MemoryCache memoryCache7 = new MemoryCache(11, 24, 10, getnetworkmodule);
        MemoryCache memoryCache8 = new MemoryCache(12, 24, 15, getnetworkmodule);
        MemoryCache memoryCache9 = new MemoryCache(13, 24, 20, getnetworkmodule);
        MemoryCache memoryCache10 = new MemoryCache(14, 24, 25, getnetworkmodule);
        getNetworkModule getnetworkmodule2 = TranslationsENABLEDCompanion.MediaSessionCompatQueueItem;
        MemoryCache memoryCache11 = new MemoryCache(15, 32, 5, getnetworkmodule2);
        MemoryCache memoryCache12 = new MemoryCache(16, 32, 10, getnetworkmodule2);
        MemoryCache memoryCache13 = new MemoryCache(17, 32, 15, getnetworkmodule2);
        MemoryCache memoryCache14 = new MemoryCache(18, 32, 20, getnetworkmodule2);
        MemoryCache memoryCache15 = new MemoryCache(19, 32, 25, getnetworkmodule2);
        MemoryCache memoryCache16 = new MemoryCache(20, 24, 5, getnetworkmodule2);
        MemoryCache memoryCache17 = new MemoryCache(21, 24, 10, getnetworkmodule2);
        MemoryCache memoryCache18 = new MemoryCache(22, 24, 15, getnetworkmodule2);
        MemoryCache memoryCache19 = new MemoryCache(23, 24, 20, getnetworkmodule2);
        MemoryCache memoryCache20 = new MemoryCache(24, 24, 25, getnetworkmodule2);
        ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = new ViewRootForInspectorDefaultImpls();
        viewRootForInspectorDefaultImpls.put(5, memoryCache);
        viewRootForInspectorDefaultImpls.put(6, memoryCache2);
        viewRootForInspectorDefaultImpls.put(7, memoryCache3);
        viewRootForInspectorDefaultImpls.put(8, memoryCache4);
        viewRootForInspectorDefaultImpls.put(9, memoryCache5);
        viewRootForInspectorDefaultImpls.put(10, memoryCache6);
        viewRootForInspectorDefaultImpls.put(11, memoryCache7);
        viewRootForInspectorDefaultImpls.put(12, memoryCache8);
        viewRootForInspectorDefaultImpls.put(13, memoryCache9);
        viewRootForInspectorDefaultImpls.put(14, memoryCache10);
        viewRootForInspectorDefaultImpls.put(15, memoryCache11);
        viewRootForInspectorDefaultImpls.put(16, memoryCache12);
        viewRootForInspectorDefaultImpls.put(17, memoryCache13);
        viewRootForInspectorDefaultImpls.put(18, memoryCache14);
        viewRootForInspectorDefaultImpls.put(19, memoryCache15);
        viewRootForInspectorDefaultImpls.put(20, memoryCache16);
        viewRootForInspectorDefaultImpls.put(21, memoryCache17);
        viewRootForInspectorDefaultImpls.put(22, memoryCache18);
        viewRootForInspectorDefaultImpls.put(23, memoryCache19);
        viewRootForInspectorDefaultImpls.put(24, memoryCache20);
        serializer = viewRootForInspectorDefaultImpls;
    }

    public MemoryCache(int i, int i2, int i3, getNetworkModule getnetworkmodule) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
        this.IconCompatParcelizer = getnetworkmodule;
    }
}
