package o;

/* JADX INFO: loaded from: classes.dex */
public final class then implements androidx.compose.ui.window.PopupPositionProvider {
    public final accessthenjd IconCompatParcelizer;
    public long read = androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0();
    public final androidx.compose.ui.Alignment write;

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo134calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect intRect, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, long j2) {
        long jSerializer = this.IconCompatParcelizer.serializer();
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & jSerializer) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            jSerializer = this.read;
        }
        this.read = jSerializer;
        return androidx.compose.ui.unit.IntOffset.m3805plusqkQi6aY(androidx.compose.ui.unit.IntOffset.m3805plusqkQi6aY(intRect.m3830getTopLeftnOccac(), androidx.compose.ui.unit.IntOffsetKt.m3818roundk4lQ0M(jSerializer)), this.write.mo139alignKFBX0sM(j2, androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g(), layoutDirection));
    }

    public then(androidx.compose.ui.Alignment alignment, accessthenjd accessthenjdVar) {
        this.write = alignment;
        this.IconCompatParcelizer = accessthenjdVar;
    }
}
