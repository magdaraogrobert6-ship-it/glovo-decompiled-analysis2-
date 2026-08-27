package o;

import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class IntSizeKt {
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] serializer;
    private static int write;

    static {
        int[] iArr = new int[OverlayComponent$OverlayInstruction$Config$Trim.values().length];
        try {
            iArr[OverlayComponent$OverlayInstruction$Config$Trim.START.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OverlayComponent$OverlayInstruction$Config$Trim.CENTER.ordinal()] = 2;
            int i = write + 3;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OverlayComponent$OverlayInstruction$Config$Trim.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        serializer = iArr;
        int i3 = RemoteActionCompatParcelizer + 85;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
