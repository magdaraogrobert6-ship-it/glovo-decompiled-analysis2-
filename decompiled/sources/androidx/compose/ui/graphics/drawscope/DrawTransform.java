package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
public interface DrawTransform {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m1366getCenterF1C5BW0(DrawTransform drawTransform) {
            return DrawTransform.super.mo1229getCenterF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo1227clipPathmtrdDE(Path path, int i);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo1228clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    long mo1230getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: rotate-Uv8p0NA */
    void mo1231rotateUv8p0NA(float f, long j);

    /* JADX INFO: renamed from: scale-0AR0LA0 */
    void mo1232scale0AR0LA0(float f, float f2, long j);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo1233transform58bKbWc(float[] fArr);

    void translate(float f, float f2);

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m1360clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m711getIntersectrtfAjoo();
            }
            drawTransform.mo1227clipPathmtrdDE(path, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* JADX INFO: renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m1362rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = drawTransform.mo1229getCenterF1C5BW0();
            }
            drawTransform.mo1231rotateUv8p0NA(f, j);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m1363scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = drawTransform.mo1229getCenterF1C5BW0();
            }
            drawTransform.mo1232scale0AR0LA0(f, f2, j);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    default long mo1229getCenterF1C5BW0() {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mo1230getSizeNHjbRc() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mo1230getSizeNHjbRc() & 4294967295L)) / 2.0f;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            drawTransform.translate(f, f2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: translate");
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m1361clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = Float.intBitsToFloat((int) (drawTransform.mo1230getSizeNHjbRc() >> 32));
            }
            if ((i2 & 8) != 0) {
                f4 = Float.intBitsToFloat((int) (drawTransform.mo1230getSizeNHjbRc() & 4294967295L));
            }
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m711getIntersectrtfAjoo();
            }
            drawTransform.mo1228clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }
}
