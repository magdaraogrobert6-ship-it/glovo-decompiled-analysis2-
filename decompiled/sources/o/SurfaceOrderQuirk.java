package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceOrderQuirk {
    public final mapToBase IconCompatParcelizer;
    public final ImageUtilCodecFailedException MediaMetadataCompat;
    public final List read;
    public final SmallDisplaySizeQuirk write;
    public boolean serializer = false;
    public boolean RemoteActionCompatParcelizer = false;

    public SurfaceOrderQuirk(mapToBase maptobase, ImageUtilCodecFailedException imageUtilCodecFailedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk, List list) {
        this.IconCompatParcelizer = maptobase;
        this.MediaMetadataCompat = imageUtilCodecFailedException;
        this.write = smallDisplaySizeQuirk;
        this.read = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mUseCaseConfig=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", mStreamSpec=");
        sb.append(this.write);
        sb.append(", mCaptureTypes=");
        sb.append(this.read);
        sb.append(", mAttached=");
        sb.append(this.serializer);
        sb.append(", mActive=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, '}');
    }
}
