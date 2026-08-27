package o;

/* JADX INFO: loaded from: classes.dex */
public final class position {
    public final androidx.compose.ui.graphics.SolidColor IconCompatParcelizer;
    public final float read;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.read) * 31);
    }

    public position(float f, androidx.compose.ui.graphics.SolidColor solidColor) {
        this.read = f;
        this.IconCompatParcelizer = solidColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof position)) {
            return false;
        }
        position positionVar = (position) obj;
        return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, positionVar.read) && this.IconCompatParcelizer.equals(positionVar.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.read, ", brush=", sb);
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
