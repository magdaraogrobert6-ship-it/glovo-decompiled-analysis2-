package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class SelectionHandlesKt {
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(25.0f);
    public static final float IconCompatParcelizer = Dp.m3673constructorimpl(25.0f);
    public static final SemanticsPropertyKey read = new SemanticsPropertyKey("SelectionHandleInfo", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m111getAdjustedCoordinatesk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
    }
}
