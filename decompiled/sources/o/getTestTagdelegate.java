package o;

import com.roadrunner.auth.data.entity.AuthStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getTestTagdelegate {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[AuthStatus.values().length];
        try {
            iArr[AuthStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AuthStatus.TWO_FA_REQUIRED.ordinal()] = 2;
            int i = serializer + 33;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i4 = serializer + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
