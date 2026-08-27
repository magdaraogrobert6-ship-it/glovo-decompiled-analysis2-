package o;

/* JADX INFO: loaded from: classes.dex */
public final class SensitiveContentNode {
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.RemoteActionCompatParcelizer) + getBitmapFromCache.serializer(this.serializer, getBitmapFromCache.serializer(this.read, getBitmapFromCache.serializer(this.IconCompatParcelizer, androidx.compose.ui.unit.Dp.m3679hashCodeimpl(this.write) * 31, 31), 31), 31);
    }

    public SensitiveContentNode(float f, float f2, float f3, float f4, float f5) {
        this.write = f;
        this.IconCompatParcelizer = f2;
        this.read = f3;
        this.serializer = f4;
        this.RemoteActionCompatParcelizer = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SensitiveContentNode)) {
            return false;
        }
        SensitiveContentNode sensitiveContentNode = (SensitiveContentNode) obj;
        return androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.write, sensitiveContentNode.write) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.IconCompatParcelizer, sensitiveContentNode.IconCompatParcelizer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.read, sensitiveContentNode.read) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.serializer, sensitiveContentNode.serializer) && androidx.compose.ui.unit.Dp.m3678equalsimpl0(this.RemoteActionCompatParcelizer, sensitiveContentNode.RemoteActionCompatParcelizer);
    }
}
