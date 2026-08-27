package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.camera.view.PendingValue;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import kotlin.math.MathKt;
import o.PagerStateKt;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PagerStateKt {
    public static final PlatformMagnifierFactoryApi29Impl write = new PlatformMagnifierFactoryApi29Impl();

    public final class PlatformMagnifierImpl extends PendingValue {
        @Override // androidx.camera.view.PendingValue
        /* JADX INFO: renamed from: update-Wko1d7g */
        public final void mo5updateWko1d7g(long j, long j2, float f) {
            Magnifier magnifier = (Magnifier) this.serializer;
            if (!Float.isNaN(f)) {
                magnifier.setZoom(f);
            }
            if ((InlineClassHelperKt.DualUnsignedFloatMask & j2) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }

        public PlatformMagnifierImpl(int i, Object obj) {
            super(i, obj);
        }
    }

    @Override // o.PagerStateKt
    public final boolean write() {
        return true;
    }

    @Override // o.PagerStateKt
    /* JADX INFO: renamed from: create-nHHXs2Y, reason: not valid java name */
    public final PendingValue mo25createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3) {
        if (z) {
            return new PlatformMagnifierImpl(15, new Magnifier(view));
        }
        long jMo49toSizeXkaWNTQ = density.mo49toSizeXkaWNTQ(j);
        float fMo48toPx0680j_4 = density.mo48toPx0680j_4(f);
        float fMo48toPx0680j_5 = density.mo48toPx0680j_4(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo49toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(MathKt.write(Float.intBitsToFloat((int) (jMo49toSizeXkaWNTQ >> 32))), MathKt.write(Float.intBitsToFloat((int) (jMo49toSizeXkaWNTQ & 4294967295L))));
        }
        if (!Float.isNaN(fMo48toPx0680j_4)) {
            builder.setCornerRadius(fMo48toPx0680j_4);
        }
        if (!Float.isNaN(fMo48toPx0680j_5)) {
            builder.setElevation(fMo48toPx0680j_5);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new PlatformMagnifierImpl(15, builder.build());
    }
}
