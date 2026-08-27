package androidx.compose.ui;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
public final class ComposeUiFlags {
    public static boolean isFocusRestorationEnabled;
    public static boolean isInitialFocusOnFocusableAvailable;
    public static boolean isMediaQueryIntegrationEnabled;
    public static boolean isViewFocusFixEnabled;
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();
    public static boolean isBypassUnfocusableComposeViewEnabled = true;
    public static boolean isIndirectPointerNavigationGestureDetectorEnabled = true;
    public static boolean isOptimizedFocusEventDispatchEnabled = true;
    public static boolean isGraphicsLayerShapeSemanticsEnabled = true;
    public static boolean isTraversableDelegatesFixEnabled = true;
    public static boolean isAccessibilityShouldIncludeOffscreenChildrenEnabled = true;
    public static boolean isTrackpadGestureHandlingEnabled = true;
    public static boolean isSkipNonImportantSemanticsNodesHitTestEnabled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }
}
