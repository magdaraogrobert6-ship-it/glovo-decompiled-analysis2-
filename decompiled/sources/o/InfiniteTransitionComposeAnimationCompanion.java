package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class InfiniteTransitionComposeAnimationCompanion {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[AnimationSearchAnimatedVisibilitySearch.values().length];
        try {
            iArr[AnimationSearchAnimatedVisibilitySearch.POST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnimationSearchAnimatedVisibilitySearch.PUT.ordinal()] = 2;
            int i = IconCompatParcelizer + 121;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i3 = IconCompatParcelizer + 81;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
