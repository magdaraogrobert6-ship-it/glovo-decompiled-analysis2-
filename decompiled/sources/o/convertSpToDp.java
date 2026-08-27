package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Trim;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class convertSpToDp {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[OverlayItems$Instruction$Config$Trim.values().length];
        try {
            iArr[OverlayItems$Instruction$Config$Trim.START.ordinal()] = 1;
            int i = serializer + 109;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OverlayItems$Instruction$Config$Trim.CENTER.ordinal()] = 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OverlayItems$Instruction$Config$Trim.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
        int i4 = write + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
