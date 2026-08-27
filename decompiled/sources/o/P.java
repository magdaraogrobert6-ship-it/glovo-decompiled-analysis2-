package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    public static final P RemoteActionCompatParcelizer = new P();
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 95;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = read + 55;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return createfromparcel;
    }
}
