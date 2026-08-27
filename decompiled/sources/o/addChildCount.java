package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class addChildCount {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[androidx.compose.ui.window.SecureFlagPolicy.values().length];
        try {
            iArr[androidx.compose.ui.window.SecureFlagPolicy.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.compose.ui.window.SecureFlagPolicy.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[androidx.compose.ui.window.SecureFlagPolicy.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}
