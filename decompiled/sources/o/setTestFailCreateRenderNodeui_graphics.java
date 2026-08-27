package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class setTestFailCreateRenderNodeui_graphics implements applyCompositingStrategyZ1X6vPc {
    public final int IconCompatParcelizer;
    public final Uri read;

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer);
        Uri uri = this.read;
        return (iHashCode * 31) + (uri == null ? 0 : uri.hashCode());
    }

    public setTestFailCreateRenderNodeui_graphics(int i, Uri uri) {
        this.IconCompatParcelizer = i;
        this.read = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTestFailCreateRenderNodeui_graphics)) {
            return false;
        }
        setTestFailCreateRenderNodeui_graphics settestfailcreaterendernodeui_graphics = (setTestFailCreateRenderNodeui_graphics) obj;
        if (this.IconCompatParcelizer != settestfailcreaterendernodeui_graphics.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, settestfailcreaterendernodeui_graphics.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Success(requestCode=" + this.IconCompatParcelizer + ", uri=" + this.read + ')';
    }
}
