package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class logBannerImpressionlambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public static final subscribeToBannersUpdates serializer = new subscribeToBannersUpdates(5);

    static {
        int i = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
