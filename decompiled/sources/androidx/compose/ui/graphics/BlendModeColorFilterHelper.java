package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    public final BlendModeColorFilter createBlendModeColorFilter(android.graphics.BlendModeColorFilter blendModeColorFilter) {
        return new BlendModeColorFilter(ColorKt.Color(blendModeColorFilter.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(blendModeColorFilter.getMode()), blendModeColorFilter, null);
    }

    /* JADX INFO: renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m666BlendModeColorFilterxETnrds(long j, int i) {
        BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline1.m();
        return BlendModeColorFilterHelper$$ExternalSyntheticApiModelOutline0.m(ColorKt.m776toArgb8_81llA(j), AndroidBlendMode_androidKt.m569toAndroidBlendModes9anfk8(i));
    }
}
