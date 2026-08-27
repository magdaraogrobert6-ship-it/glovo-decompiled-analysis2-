package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes4.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    /* JADX INFO: renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m1051createBlurEffect8A3gB4(RenderEffect renderEffect, float f, float f2, int i) {
        if (f == 0.0f && f2 == 0.0f) {
            return android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f);
        }
        if (renderEffect == null) {
            return android.graphics.RenderEffect.createBlurEffect(f, f2, AndroidTileMode_androidKt.m625toAndroidTileMode0vamqd0(i));
        }
        return android.graphics.RenderEffect.createBlurEffect(f, f2, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m625toAndroidTileMode0vamqd0(i));
    }

    /* JADX INFO: renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m1052createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j) {
        if (renderEffect == null) {
            return android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect.asAndroidRenderEffect());
    }
}
