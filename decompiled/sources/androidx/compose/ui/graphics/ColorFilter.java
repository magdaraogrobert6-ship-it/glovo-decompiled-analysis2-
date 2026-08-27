package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class ColorFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics() {
        return this.nativeColorFilter;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m764colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m766tintxETnrds(long j, int i) {
            return new BlendModeColorFilter(j, i, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m763tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.Companion.m660getSrcIn0nO6VwU();
            }
            return companion.m766tintxETnrds(j, i);
        }

        /* JADX INFO: renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m765lightingOWjLjI(long j, long j2) {
            return new LightingColorFilter(j, j2, (DefaultConstructorMarker) null);
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }
}
