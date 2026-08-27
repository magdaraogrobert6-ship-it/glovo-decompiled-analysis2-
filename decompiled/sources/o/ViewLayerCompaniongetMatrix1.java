package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewLayerCompaniongetMatrix1 {
    public static final int IconCompatParcelizer;
    public static final int read;
    public static final ViewLayerCompaniongetMatrix1 write = new ViewLayerCompaniongetMatrix1();
    public final accessgetSubCompositionViewjd RemoteActionCompatParcelizer = new accessgetSubCompositionViewjd(0);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        IconCompatParcelizer = iAvailableProcessors + 1;
        read = (iAvailableProcessors * 2) + 1;
    }
}
