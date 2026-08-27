package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class DerivedSize {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final DerivedSize Zero = new DerivedSize(IntSize.Companion.m3849getZeroYbymL2g(), DpSize.Companion.m3781getZeroMYxV2XQ(), null);
    private final long dpSize;
    private final long pxSize;

    /* JADX INFO: renamed from: getDpSize-MYxV2XQ, reason: not valid java name */
    public final long m2718getDpSizeMYxV2XQ() {
        return this.dpSize;
    }

    /* JADX INFO: renamed from: getPxSize-YbymL2g, reason: not valid java name */
    public final long m2719getPxSizeYbymL2g() {
        return this.pxSize;
    }

    public int hashCode() {
        return DpSize.m3773hashCodeimpl(this.dpSize) + (IntSize.m3845hashCodeimpl(this.pxSize) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DerivedSize getZero() {
            return DerivedSize.Zero;
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: fromDpSize-itqla9I, reason: not valid java name */
        public final DerivedSize m2720fromDpSizeitqla9I(long j, Density density) {
            return new DerivedSize(IntSizeKt.m3855toIntSizeuvyYCjk(density.mo49toSizeXkaWNTQ(j)), j, null);
        }

        /* JADX INFO: renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public final DerivedSize m2721fromPxSizeviCIZxY(long j, Density density) {
            return new DerivedSize(j, density.mo46toDpSizekrfVVM(IntSizeKt.m3856toSizeozmzZPI(j)), null);
        }
    }

    private DerivedSize(long j, long j2) {
        this.pxSize = j;
        this.dpSize = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedSize)) {
            return false;
        }
        DerivedSize derivedSize = (DerivedSize) obj;
        return IntSize.m3842equalsimpl0(this.pxSize, derivedSize.pxSize) && DpSize.m3768equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    public /* synthetic */ DerivedSize(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
