package o;

import com.mapbox.search.utils.file.InternalFileSystem;

/* JADX INFO: loaded from: classes.dex */
public final class materializeModifier implements androidx.compose.ui.window.PopupPositionProvider {
    public final InternalFileSystem IconCompatParcelizer;
    public androidx.compose.ui.unit.IntSize RemoteActionCompatParcelizer;
    public androidx.compose.ui.unit.LayoutDirection read;
    public androidx.compose.ui.unit.IntOffset serializer;
    public androidx.compose.ui.unit.IntSize write;

    public materializeModifier(InternalFileSystem internalFileSystem) {
        this.IconCompatParcelizer = internalFileSystem;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo134calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect intRect, long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, long j2) {
        androidx.compose.ui.unit.IntSize intSize;
        androidx.compose.ui.unit.IntSize intSize2;
        androidx.compose.ui.unit.IntOffset intOffset = this.serializer;
        if (intOffset != null && (intSize = this.write) != null && androidx.compose.ui.unit.IntSize.m3842equalsimpl0(intSize.m3848unboximpl(), j) && this.read == layoutDirection && (intSize2 = this.RemoteActionCompatParcelizer) != null && androidx.compose.ui.unit.IntSize.m3842equalsimpl0(intSize2.m3848unboximpl(), j2)) {
            return intOffset.m3810unboximpl();
        }
        long jMo134calculatePositionllwVHH4 = this.IconCompatParcelizer.mo134calculatePositionllwVHH4(intRect, j, layoutDirection, j2);
        this.write = androidx.compose.ui.unit.IntSize.m3836boximpl(j);
        this.read = layoutDirection;
        this.RemoteActionCompatParcelizer = androidx.compose.ui.unit.IntSize.m3836boximpl(j2);
        this.serializer = androidx.compose.ui.unit.IntOffset.m3792boximpl(jMo134calculatePositionllwVHH4);
        return jMo134calculatePositionllwVHH4;
    }
}
