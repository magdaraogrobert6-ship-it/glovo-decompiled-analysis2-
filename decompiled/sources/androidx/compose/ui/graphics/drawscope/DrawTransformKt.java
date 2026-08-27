package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f, float f2) {
        drawTransform.inset(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m1371scale0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo1232scale0AR0LA0(f, f, j);
    }

    public static final void inset(DrawTransform drawTransform, float f) {
        drawTransform.inset(f, f, f, f);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m1369rotateRad0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo1231rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m1370rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo1229getCenterF1C5BW0();
        }
        drawTransform.mo1231rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m1372scale0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo1229getCenterF1C5BW0();
        }
        drawTransform.mo1232scale0AR0LA0(f, f, j);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.inset(f, f2, f, f2);
    }
}
