package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class UiComposable {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[androidx.compose.ui.state.ToggleableState.values().length];
        try {
            iArr[androidx.compose.ui.state.ToggleableState.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.compose.ui.state.ToggleableState.Indeterminate.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[androidx.compose.ui.state.ToggleableState.Off.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
