package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class performFling {
    public static final androidx.compose.animation.core.CubicBezierEasing RemoteActionCompatParcelizer = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    public static final toClipEntry read;
    public static final androidx.compose.animation.core.CubicBezierEasing write;

    /* JADX WARN: Type inference failed for: r0v3, types: [o.toClipEntry] */
    static {
        new androidx.compose.animation.core.CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
        write = new androidx.compose.animation.core.CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        read = new fling() { // from class: o.toClipEntry
            public final /* synthetic */ int IconCompatParcelizer = 0;

            @Override // o.fling
            public final float transform(float f) {
                float f2;
                float f3;
                if (this.IconCompatParcelizer == 0) {
                    return f;
                }
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            }
        };
    }
}
