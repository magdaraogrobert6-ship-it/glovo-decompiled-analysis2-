package o;

import com.roadrunner.appmigration.model.UrgencyVariant;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getOuterSemanticsNodeui {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[UrgencyVariant.values().length];
        try {
            iArr[UrgencyVariant.NEUTRAL.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 47;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UrgencyVariant.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UrgencyVariant.URGENT.ordinal()] = 3;
            int i4 = serializer + 13;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i7 = RemoteActionCompatParcelizer + 5;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
