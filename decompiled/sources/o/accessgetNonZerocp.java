package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetNonZerocp implements IconButtonKt {
    public final androidx.compose.ui.layout.ContentScale IconCompatParcelizer;
    public final IconButtonKt MediaBrowserCompatMediaItem;
    public final androidx.compose.ui.graphics.ColorFilter RemoteActionCompatParcelizer;
    public final androidx.compose.ui.Alignment read;
    public final coil3.compose.AsyncImagePainter serializer;
    public final String write;

    @Override // o.IconButtonKt
    public final androidx.compose.ui.Modifier align(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment) {
        return this.MediaBrowserCompatMediaItem.align(modifier, alignment);
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        String str = this.write;
        int iM = af$$ExternalSyntheticOutline1.m(1.0f, (this.IconCompatParcelizer.hashCode() + ((this.read.hashCode() + ((((iHashCode2 + (iHashCode * 31)) * 31) + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        androidx.compose.ui.graphics.ColorFilter colorFilter = this.RemoteActionCompatParcelizer;
        return Boolean.hashCode(true) + ((iM + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31);
    }

    public accessgetNonZerocp(IconButtonKt iconButtonKt, coil3.compose.AsyncImagePainter asyncImagePainter, String str, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.MediaBrowserCompatMediaItem = iconButtonKt;
        this.serializer = asyncImagePainter;
        this.write = str;
        this.read = alignment;
        this.IconCompatParcelizer = contentScale;
        this.RemoteActionCompatParcelizer = colorFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessgetNonZerocp) {
            accessgetNonZerocp accessgetnonzerocp = (accessgetNonZerocp) obj;
            Object[] objArr = {this.MediaBrowserCompatMediaItem, accessgetnonzerocp.MediaBrowserCompatMediaItem};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || this.serializer != accessgetnonzerocp.serializer) {
                return false;
            }
            Object[] objArr2 = {this.write, accessgetnonzerocp.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {this.read, accessgetnonzerocp.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    Object[] objArr4 = {this.IconCompatParcelizer, accessgetnonzerocp.IconCompatParcelizer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue() && Float.compare(1.0f, 1.0f) == 0) {
                        Object[] objArr5 = {this.RemoteActionCompatParcelizer, accessgetnonzerocp.RemoteActionCompatParcelizer};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.MediaBrowserCompatMediaItem + ", painter=" + this.serializer + ", contentDescription=" + this.write + ", alignment=" + this.read + ", contentScale=" + this.IconCompatParcelizer + ", alpha=1.0, colorFilter=" + this.RemoteActionCompatParcelizer + ", clipToBounds=true)";
    }
}
