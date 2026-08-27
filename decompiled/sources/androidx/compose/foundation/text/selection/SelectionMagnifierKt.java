package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import o.UiMediaScopeViewingDistance;
import o.animateToZero;
import o.requiredSizeInqDBjuR0default;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class SelectionMagnifierKt {
    public static final width read;
    public static final long write;
    public static final animateToZero IconCompatParcelizer = new animateToZero(Float.NaN, Float.NaN);
    public static final requiredSizeInqDBjuR0default serializer = new requiredSizeInqDBjuR0default(new UiMediaScopeViewingDistance(8), new UiMediaScopeViewingDistance(9));

    static {
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L));
        write = jM469constructorimpl;
        read = new width(3, Offset.m466boximpl(jM469constructorimpl));
    }
}
