package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.math.MathKt;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    public static final int composeToViewOffset(float f) {
        return extractIntegerPixels(f) * (-1);
    }

    private static final int extractIntegerPixels(float f) {
        return MathKt.write(f);
    }

    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0060 A[PHI: r10
  0x0060: PHI (r10v4 float) = (r10v3 float), (r10v11 float) binds: [B:16:0x005e, B:13:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a A[PHI: r10
  0x008a: PHI (r10v7 float) = (r10v6 float), (r10v10 float) binds: [B:24:0x0088, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: toOffset-moWRBKg, reason: not valid java name */
    public static final long m2776toOffsetmoWRBKg(int i, int i2, int[] iArr, long j) {
        float fReverseAxis;
        float fIntBitsToFloat;
        float fReverseAxis2;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3 = Math.abs(iArr[0]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j >> 32)) - reverseAxis(i);
        float fIntBitsToFloat4 = Math.abs(iArr[1]) == 0 ? 0.0f : Float.intBitsToFloat((int) (j & 4294967295L)) - reverseAxis(i2);
        int i3 = (int) (j >> 32);
        if (Float.intBitsToFloat(i3) >= 0.0f) {
            fReverseAxis = reverseAxis(iArr[0]) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i3);
            if (fReverseAxis > fIntBitsToFloat) {
                fReverseAxis = fIntBitsToFloat;
            }
        } else {
            fReverseAxis = reverseAxis(iArr[0]) + fIntBitsToFloat3;
            fIntBitsToFloat = Float.intBitsToFloat(i3);
            if (fReverseAxis < fIntBitsToFloat) {
                fReverseAxis = fIntBitsToFloat;
            }
        }
        int i4 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) >= 0.0f) {
            fReverseAxis2 = reverseAxis(iArr[1]) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            if (fReverseAxis2 > fIntBitsToFloat2) {
                fReverseAxis2 = fIntBitsToFloat2;
            }
        } else {
            fReverseAxis2 = reverseAxis(iArr[1]) + fIntBitsToFloat4;
            fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            if (fReverseAxis2 < fIntBitsToFloat2) {
                fReverseAxis2 = fIntBitsToFloat2;
            }
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fReverseAxis)) << 32) | (((long) Float.floatToRawIntBits(fReverseAxis2)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m2777toViewTypeGyEprt8(int i) {
        return !NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1938getUserInputWNlRxjI()) ? 1 : 0;
    }

    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, getBirthDateFull getbirthdatefull, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (View) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        ViewConfiguration viewConfiguration = (ViewConfiguration) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalViewConfiguration());
        boolean z = getpostalcode.read(view);
        boolean z2 = getpostalcode.read(viewConfiguration);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new NestedScrollInteropConnection(view, viewConfiguration.getMinimumFlingVelocity());
            getpostalcode.write(objComponentActivity);
        }
        return (NestedScrollInteropConnection) objComponentActivity;
    }

    /* JADX INFO: renamed from: scrollAxes-sF-c-tU, reason: not valid java name */
    private static final int m2775scrollAxessFctU(long j, float f) {
        int i = Math.abs(Velocity.m3911getXimpl(j)) >= f ? 1 : 0;
        return Math.abs(Velocity.m3912getYimpl(j)) >= f ? i | 2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m2774getScrollAxesk4lQ0M(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= ScrollingAxesThreshold ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= ScrollingAxesThreshold ? i | 2 : i;
    }

    private static final float ceilAwayFromZero(float f) {
        double dFloor;
        if (f >= 0.0f) {
            dFloor = Math.ceil(f);
        } else {
            dFloor = Math.floor(f);
        }
        return (float) dFloor;
    }
}
