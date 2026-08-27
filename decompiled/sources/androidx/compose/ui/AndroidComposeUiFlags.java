package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
public final class AndroidComposeUiFlags {
    public static final AndroidComposeUiFlags INSTANCE = new AndroidComposeUiFlags();
    public static boolean isSharedComposeViewContextEnabled = true;
    public static boolean isSharedWindowInfoEnabled = true;
    public static boolean isSharedAccessibilityManagerEnabled = true;
    public static boolean isSharedDrawingEnabled = true;
    public static boolean isSharedViewConfigurationEnabled = true;
    public static boolean isSharedClipboardManagerEnabled = true;
    public static boolean isAccessibilityShowOnScreenNestedScrollingEnabled = true;
    public static boolean isSharedHapticsEnabled = true;
    public static boolean isViewBasedSemanticsHandlerEnabled = true;
    public static boolean isSharedFontEnabled = true;
    public static final int $stable = 8;

    private AndroidComposeUiFlags() {
    }
}
