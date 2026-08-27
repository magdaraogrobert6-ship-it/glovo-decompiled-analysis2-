package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityNodeProviderCompat implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final AccessibilityNodeProviderCompat read = new AccessibilityNodeProviderCompat();
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 29;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        createFromParcel createfromparcel;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createfromparcel = createFromParcel.INSTANCE;
            int i3 = 47 / 0;
        } else {
            createfromparcel = createFromParcel.INSTANCE;
        }
        int i4 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return createfromparcel;
    }
}
