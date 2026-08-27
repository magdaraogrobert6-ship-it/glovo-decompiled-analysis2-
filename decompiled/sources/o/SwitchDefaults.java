package o;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchDefaults implements SwitchKt {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;

    @Override // o.SwitchKt
    public final float IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.SwitchKt
    public final float RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.RemoteActionCompatParcelizer) + getBitmapFromCache.serializer(this.IconCompatParcelizer, getBitmapFromCache.serializer(this.read, androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.serializer) * 31, 31), 31);
    }

    public SwitchDefaults(float f, float f2, float f3, float f4) {
        this.serializer = f;
        this.read = f2;
        this.IconCompatParcelizer = f3;
        this.RemoteActionCompatParcelizer = f4;
        boolean z = f >= 0.0f;
        boolean z2 = f2 >= 0.0f;
        if (!(z & z2 & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            TooltipKtTooltipBoxwrappedContent1.read("Padding must be non-negative");
        }
    }

    @Override // o.SwitchKt
    public final float read(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? this.serializer : this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.serializer, ", top=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.read, ", end=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ", bottom=", sb);
        sb.append((Object) androidx.compose.ui.unit.Dp.m3684toStringimpl(this.RemoteActionCompatParcelizer));
        sb.append(')');
        return sb.toString();
    }

    @Override // o.SwitchKt
    public final float write(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? this.IconCompatParcelizer : this.serializer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SwitchDefaults)) {
            return false;
        }
        SwitchDefaults switchDefaults = (SwitchDefaults) obj;
        return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.serializer, switchDefaults.serializer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, switchDefaults.read) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.IconCompatParcelizer, switchDefaults.IconCompatParcelizer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, switchDefaults.RemoteActionCompatParcelizer);
    }
}
