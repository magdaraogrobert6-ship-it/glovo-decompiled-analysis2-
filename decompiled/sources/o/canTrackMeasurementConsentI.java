package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class canTrackMeasurementConsentI {
    public static final checkEventI IconCompatParcelizer;
    private static int MediaBrowserCompatMediaItem = 1;
    public static final checkEventI RemoteActionCompatParcelizer;
    public static final checkEventI read;
    private static int serializer;
    public static final checkEventI write;

    static {
        int color = android.graphics.Color.parseColor("#00FF00");
        checkForPreinstallI checkforpreinstalli = checkForPreinstallI.HIGH;
        IconCompatParcelizer = new checkEventI("com.foodora.other", "Other", "low_prio", color, null, checkforpreinstalli);
        read = new checkEventI("com.foodora.location", "Location Service", "low_prio", color, null, checkForPreinstallI.MIN);
        write = new checkEventI("com.foodora.customer.chat", "Customer Chat", "low_prio", color, null, checkforpreinstalli);
        checkForPreinstallI.LOW.getClass();
        RemoteActionCompatParcelizer = new checkEventI("com.foodora.helpcenter.chat", "Help Center Chat", "low_prio", color, null, checkforpreinstalli);
        int i = serializer + 105;
        MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
