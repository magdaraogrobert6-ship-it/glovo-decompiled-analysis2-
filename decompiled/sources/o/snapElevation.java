package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class snapElevation implements androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical {
    public final float IconCompatParcelizer;
    public final boolean read;
    public final FloatingActionButtonKtFloatingActionButton31 serializer;
    public final float write;

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
    /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
    public final float mo64getSpacingD9Ej5fM() {
        return this.write;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.IconCompatParcelizer) * 31, 31, this.read);
        FloatingActionButtonKtFloatingActionButton31 floatingActionButtonKtFloatingActionButton31 = this.serializer;
        return iM + (floatingActionButtonKtFloatingActionButton31 == null ? 0 : floatingActionButtonKtFloatingActionButton31.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ", ", sb);
        sb.append(this.serializer);
        sb.append(')');
        return sb.toString();
    }

    public snapElevation(float f, boolean z, FloatingActionButtonKtFloatingActionButton31 floatingActionButtonKtFloatingActionButton31) {
        this.IconCompatParcelizer = f;
        this.read = z;
        this.serializer = floatingActionButtonKtFloatingActionButton31;
        this.write = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snapElevation)) {
            return false;
        }
        snapElevation snapelevation = (snapElevation) obj;
        if (!androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.IconCompatParcelizer, snapelevation.IconCompatParcelizer) || this.read != snapelevation.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, snapelevation.serializer}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public final void RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, int i, int[] iArr, androidx.compose.ui.unit.LayoutDirection layoutDirection, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(this.IconCompatParcelizer);
        boolean z = this.read && layoutDirection == androidx.compose.ui.unit.LayoutDirection.Rtl;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo42roundToPx0680j_4, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iMo42roundToPx0680j_4, (i - iMin2) - i9);
                i5++;
                int i10 = iArr2[i8] + i9 + iMin3;
                i8++;
                i7 = iMin3;
                i6 = i10;
            }
            i2 = i - (i6 - i7);
        }
        FloatingActionButtonKtFloatingActionButton31 floatingActionButtonKtFloatingActionButton31 = this.serializer;
        if (floatingActionButtonKtFloatingActionButton31 == null || i2 <= 0) {
            return;
        }
        int iSerializer = floatingActionButtonKtFloatingActionButton31.serializer(layoutDirection, i2);
        if (z) {
            iSerializer -= i2;
        }
        if (iSerializer != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iSerializer;
            }
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public final void read(androidx.compose.ui.unit.Density density, int i, int[] iArr, int[] iArr2) {
        RemoteActionCompatParcelizer(density, i, iArr, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr2);
    }
}
