package o;

import java.util.List;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class supportingTextPaddinga9UjIt4material3default implements androidx.compose.ui.layout.MeasurePolicy, TextFieldColors {
    public final androidx.compose.foundation.layout.Arrangement.Horizontal IconCompatParcelizer;
    public final androidx.compose.ui.Alignment.Vertical write;

    @Override // o.TextFieldColors
    public final int read(androidx.compose.ui.layout.Placeable placeable) {
        return placeable.getHeight();
    }

    @Override // o.TextFieldColors
    public final int write(androidx.compose.ui.layout.Placeable placeable) {
        return placeable.getWidth();
    }

    @Override // o.TextFieldColors
    public final void IconCompatParcelizer(int i, int[] iArr, int[] iArr2, androidx.compose.ui.layout.MeasureScope measureScope) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.IconCompatParcelizer(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.read(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.write(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return FontMuC2MFsdefault.serializer(list, i, intrinsicMeasureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer.mo64getSpacingD9Ej5fM()));
    }

    public supportingTextPaddinga9UjIt4material3default(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical) {
        this.IconCompatParcelizer = horizontal;
        this.write = vertical;
    }

    @Override // o.TextFieldColors
    public final long read(int i, int i2, int i3, boolean z) {
        if (!z) {
            return androidx.compose.ui.unit.ConstraintsKt.Constraints(i, i2, 0, i3);
        }
        return androidx.compose.ui.unit.Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof supportingTextPaddinga9UjIt4material3default)) {
            return false;
        }
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3default = (supportingTextPaddinga9UjIt4material3default) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, supportingtextpaddinga9ujit4material3default.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, supportingtextpaddinga9ujit4material3default.write}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, List list, long j) {
        return LazyKt__LazyJVMKt.write(this, androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), measureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer.mo64getSpacingD9Ej5fM()), measureScope, list, new androidx.compose.ui.layout.Placeable[list.size()], 0, list.size(), null, 0);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.IconCompatParcelizer + ", verticalAlignment=" + this.write + ')';
    }

    @Override // o.TextFieldColors
    public final androidx.compose.ui.layout.MeasureResult serializer(androidx.compose.ui.layout.Placeable[] placeableArr, androidx.compose.ui.layout.MeasureScope measureScope, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i2, i3, null, new calculatePositionllwVHH4(placeableArr, this, i3, i, iArr), 4, null);
    }
}
