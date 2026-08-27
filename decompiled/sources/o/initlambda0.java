package o;

import com.roadrunner.delivery.state.pudo.ValidationType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class initlambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[ValidationType.values().length];
        try {
            iArr[ValidationType.IsLessThan.ordinal()] = 1;
            int i = read + 7;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ValidationType.IsGreaterThan.ordinal()] = 2;
            int i3 = read + 67;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}
