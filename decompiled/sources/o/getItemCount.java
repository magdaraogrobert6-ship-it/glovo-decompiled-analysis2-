package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getItemCount implements notifyItemChanged, hasObservers {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final androidx.compose.ui.layout.ContentScale IconCompatParcelizer;
    public final List read;
    public final Float serializer;
    public final String write;

    public getItemCount(String str, List list, androidx.compose.ui.layout.ContentScale contentScale, Float f) {
        str.getClass();
        list.getClass();
        contentScale.getClass();
        this.write = str;
        this.read = list;
        this.IconCompatParcelizer = contentScale;
        this.serializer = f;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.read, this.write.hashCode() * 31, 31);
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        Float f = this.serializer;
        if (f == null) {
            int i2 = MediaBrowserCompatMediaItem + 105;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = f.hashCode();
        }
        int i4 = ((iHashCode2 + iM) * 31) + iHashCode;
        int i5 = RemoteActionCompatParcelizer + 41;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("AnimationViewEntity(json=", this.write, ", highlights=", this.read, ", contentScale=");
        sbSerializer.append(this.IconCompatParcelizer);
        sbSerializer.append(", weight=");
        sbSerializer.append(this.serializer);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = MediaBrowserCompatMediaItem + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 87;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getItemCount)) {
            return false;
        }
        getItemCount getitemcount = (getItemCount) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getitemcount.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getitemcount.read}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getitemcount.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i4 = RemoteActionCompatParcelizer + 81;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getitemcount.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i6 = RemoteActionCompatParcelizer + 55;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 17;
        MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
