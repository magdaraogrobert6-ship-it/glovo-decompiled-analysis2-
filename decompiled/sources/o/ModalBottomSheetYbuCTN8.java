package o;

import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetYbuCTN8 implements androidx.compose.ui.layout.MeasurePolicy, TextFieldColors {
    public final androidx.compose.foundation.layout.Arrangement.Vertical RemoteActionCompatParcelizer;
    public final androidx.compose.ui.Alignment.Horizontal serializer;

    @Override // o.TextFieldColors
    public final int read(androidx.compose.ui.layout.Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // o.TextFieldColors
    public final int write(androidx.compose.ui.layout.Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // o.TextFieldColors
    public final void IconCompatParcelizer(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.MeasureScope measureScope) {
        this.RemoteActionCompatParcelizer.read(measureScope, i, iArr, iArr2);
    }

    public final int hashCode() {
        return this.serializer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.RemoteActionCompatParcelizer(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.MediaBrowserCompatMediaItem(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.RatingCompat(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.MediaMetadataCompat(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    public ModalBottomSheetYbuCTN8(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal) {
        this.RemoteActionCompatParcelizer = vertical;
        this.serializer = horizontal;
    }

    @Override // o.TextFieldColors
    public final long read(int i, int i2, int i3, boolean z) {
        if (!z) {
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(0, i3, i, i2);
        }
        return androidx.compose.ui.unit.Constraints.Companion.m3634fitPrioritizingHeightZbe2FdA(0, i3, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetYbuCTN8)) {
            return false;
        }
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8 = (ModalBottomSheetYbuCTN8) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, modalBottomSheetYbuCTN8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, modalBottomSheetYbuCTN8.serializer}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, List list, long j) {
        return LazyKt__LazyJVMKt.write(this, androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), measureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer.mo64getSpacingD9Ej5fM()), measureScope, list, new androidx.compose.ui.layout.Placeable[list.size()], 0, list.size(), null, 0);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.RemoteActionCompatParcelizer + ", horizontalAlignment=" + this.serializer + ')';
    }

    @Override // o.TextFieldColors
    public final androidx.compose.ui.layout.MeasureResult serializer(androidx.compose.ui.layout.Placeable[] placeableArr, androidx.compose.ui.layout.MeasureScope measureScope, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i3, i2, null, new IconButtonKtSurfaceIconButton2(placeableArr, this, i3, i, measureScope, iArr), 4, null);
    }
}
