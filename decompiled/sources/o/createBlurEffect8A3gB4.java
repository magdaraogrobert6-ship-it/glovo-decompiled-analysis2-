package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class createBlurEffect8A3gB4 {
    public final getGraphicsDensityui IconCompatParcelizer;
    public final long MediaDescriptionCompat;
    public final getLayoutDirectionui RemoteActionCompatParcelizer;
    public final long read;
    public final Object serializer;
    public final int write;

    public createBlurEffect8A3gB4(int i, long j, long j2, getGraphicsDensityui getgraphicsdensityui, getLayoutDirectionui getlayoutdirectionui, Object obj) {
        this.write = i;
        this.read = j;
        this.MediaDescriptionCompat = j2;
        this.IconCompatParcelizer = getgraphicsdensityui;
        this.RemoteActionCompatParcelizer = getlayoutdirectionui;
        this.serializer = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createBlurEffect8A3gB4)) {
            return false;
        }
        createBlurEffect8A3gB4 createblureffect8a3gb4 = (createBlurEffect8A3gB4) obj;
        if (this.write != createblureffect8a3gb4.write || this.read != createblureffect8a3gb4.read || this.MediaDescriptionCompat != createblureffect8a3gb4.MediaDescriptionCompat) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, createblureffect8a3gb4.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, createblureffect8a3gb4.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, createblureffect8a3gb4.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.write);
        sb.append(", requestMillis=");
        sb.append(this.read);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", responseMillis=", this.MediaDescriptionCompat, ", headers=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", body=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", delegate=");
        sb.append(this.serializer);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.write * 31, 31, this.read), 31, this.MediaDescriptionCompat), this.IconCompatParcelizer.serializer, 31);
        getLayoutDirectionui getlayoutdirectionui = this.RemoteActionCompatParcelizer;
        int iHashCode = getlayoutdirectionui == null ? 0 : getlayoutdirectionui.serializer.hashCode();
        Object obj = this.serializer;
        return ((iRemoteActionCompatParcelizer + iHashCode) * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
