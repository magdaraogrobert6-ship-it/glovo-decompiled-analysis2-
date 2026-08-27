package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BottomSheetScaffoldKtStandardBottomSheet3;
import o.BottomSheetScaffoldsdMYb0k;
import o.Button;
import o.ButtonDefaults;
import o.ButtonKt;
import o.createFromParcel;
import o.performFling;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes.dex */
public abstract class ElevationKt {
    public static final requiredWidthInVpY3zN4default IconCompatParcelizer;
    public static final requiredWidthInVpY3zN4default read;
    public static final requiredWidthInVpY3zN4default write;

    /* JADX WARN: Code duplicated, block: B:27:0x0031 A[PHI: r0
  0x0031: PHI (r0v1 o.requiredWidthInVpY3zN4default) = 
  (r0v0 o.requiredWidthInVpY3zN4default)
  (r0v0 o.requiredWidthInVpY3zN4default)
  (r0v0 o.requiredWidthInVpY3zN4default)
  (r0v2 o.requiredWidthInVpY3zN4default)
  (r0v2 o.requiredWidthInVpY3zN4default)
  (r0v2 o.requiredWidthInVpY3zN4default)
  (r0v2 o.requiredWidthInVpY3zN4default)
 binds: [B:17:0x001e, B:20:0x0023, B:26:0x002f, B:4:0x0006, B:7:0x000b, B:10:0x0010, B:13:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0033  */
    /* JADX INFO: renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m135animateElevationrAjV9yQ(Animatable animatable, float f, ButtonDefaults buttonDefaults, ButtonDefaults buttonDefaults2, ContinuationImpl continuationImpl) {
        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default;
        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default2;
        if (buttonDefaults2 != null) {
            boolean z = buttonDefaults2 instanceof Button;
            requiredwidthinvpy3zn4default = write;
            if (z || (buttonDefaults2 instanceof BottomSheetScaffoldsdMYb0k) || (buttonDefaults2 instanceof ButtonKt) || (buttonDefaults2 instanceof BottomSheetScaffoldKtStandardBottomSheet3)) {
                requiredwidthinvpy3zn4default2 = requiredwidthinvpy3zn4default;
            } else {
                requiredwidthinvpy3zn4default2 = null;
            }
        } else if (buttonDefaults != null) {
            boolean z2 = buttonDefaults instanceof Button;
            requiredwidthinvpy3zn4default = IconCompatParcelizer;
            if (z2 || (buttonDefaults instanceof BottomSheetScaffoldsdMYb0k)) {
                requiredwidthinvpy3zn4default2 = requiredwidthinvpy3zn4default;
            } else if (buttonDefaults instanceof ButtonKt) {
                requiredwidthinvpy3zn4default2 = read;
            } else if (buttonDefaults instanceof BottomSheetScaffoldKtStandardBottomSheet3) {
                requiredwidthinvpy3zn4default2 = requiredwidthinvpy3zn4default;
            } else {
                requiredwidthinvpy3zn4default2 = null;
            }
        } else {
            requiredwidthinvpy3zn4default2 = null;
        }
        Dp dpM3671boximpl = Dp.m3671boximpl(f);
        if (requiredwidthinvpy3zn4default2 != null) {
            Object objIconCompatParcelizer = Animatable.IconCompatParcelizer(animatable, dpM3671boximpl, requiredwidthinvpy3zn4default2, continuationImpl, 12);
            if (objIconCompatParcelizer == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objIconCompatParcelizer;
            }
        } else {
            Object objSnapTo = animatable.snapTo(dpM3671boximpl, continuationImpl);
            if (objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objSnapTo;
            }
        }
        return createFromParcel.INSTANCE;
    }

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        write = new requiredWidthInVpY3zN4default(120, performFling.RemoteActionCompatParcelizer, 2);
        IconCompatParcelizer = new requiredWidthInVpY3zN4default(150, cubicBezierEasing, 2);
        read = new requiredWidthInVpY3zN4default(120, cubicBezierEasing, 2);
    }
}
