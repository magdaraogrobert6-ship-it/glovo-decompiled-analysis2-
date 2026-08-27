package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class getStatic implements FlowCollector {
    public static final getStatic IconCompatParcelizer = new getStatic();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 27;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        createFromParcel createfromparcel;
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createfromparcel = createFromParcel.INSTANCE;
            int i3 = 90 / 0;
        } else {
            createfromparcel = createFromParcel.INSTANCE;
        }
        int i4 = serializer + 69;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
