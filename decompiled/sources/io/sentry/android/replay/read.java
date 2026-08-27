package io.sentry.android.replay;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.onOtherUrlActionlambda1;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class read {
    public final List IconCompatParcelizer;
    public final onOtherUrlActionlambda1 MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final Date MediaMetadataCompat;
    public final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg RemoteActionCompatParcelizer;
    public final long read;
    public final int serializer;
    public final MediaBrowserCompatMediaItem write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer, (this.MediaMetadataCompat.hashCode() + ((this.write.hashCode() + (iHashCode * 31)) * 31)) * 31, 31), 31, this.read);
        int iHashCode2 = this.MediaBrowserCompatMediaItem.hashCode();
        String str = this.MediaDescriptionCompat;
        return this.IconCompatParcelizer.hashCode() + ((((iHashCode2 + iM) * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public read(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, Date date, int i, long j, onOtherUrlActionlambda1 onotherurlactionlambda1, String str, List list) {
        this.RemoteActionCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.write = mediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = date;
        this.serializer = i;
        this.read = j;
        this.MediaBrowserCompatMediaItem = onotherurlactionlambda1;
        this.MediaDescriptionCompat = str;
        this.IconCompatParcelizer = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof read) {
            read readVar = (read) obj;
            if (this.RemoteActionCompatParcelizer.equals(readVar.RemoteActionCompatParcelizer) && this.write == readVar.write && this.MediaMetadataCompat.equals(readVar.MediaMetadataCompat) && this.serializer == readVar.serializer && this.read == readVar.read && this.MediaBrowserCompatMediaItem == readVar.MediaBrowserCompatMediaItem) {
                Object[] objArr = {this.MediaDescriptionCompat, readVar.MediaDescriptionCompat};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer.equals(readVar.IconCompatParcelizer)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastSegmentData(recorderConfig=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", cache=");
        sb.append(this.write);
        sb.append(", timestamp=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", id=");
        sb.append(this.serializer);
        sb.append(", duration=");
        sb.append(this.read);
        sb.append(", replayType=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", screenAtStart=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", events=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.IconCompatParcelizer, ')');
    }
}
