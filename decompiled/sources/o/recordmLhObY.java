package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class recordmLhObY extends getTopLeftnOccac {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final List MediaSessionCompatQueueItem;
    public final getSizeYbymL2g RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final getTopLeftnOccac read;
    public final List serializer;
    public final String write;

    @Override // o.getTopLeftnOccac
    public final getTopLeftnOccac IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.getTopLeftnOccac
    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.getTopLeftnOccac
    public final String read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getTopLeftnOccac
    public final List serializer() {
        return this.MediaSessionCompatQueueItem;
    }

    public static recordmLhObY IconCompatParcelizer(recordmLhObY recordmlhoby, getSizeYbymL2g getsizeybyml2g) {
        String str = recordmlhoby.IconCompatParcelizer;
        List list = recordmlhoby.MediaSessionCompatQueueItem;
        String str2 = recordmlhoby.write;
        getTopLeftnOccac gettopleftnoccac = recordmlhoby.read;
        String str3 = recordmlhoby.RemoteActionCompatParcelizer;
        String str4 = recordmlhoby.MediaBrowserCompatMediaItem;
        List list2 = recordmlhoby.serializer;
        str.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        return new recordmLhObY(str, list, str2, gettopleftnoccac, str3, str4, list2, getsizeybyml2g);
    }

    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, this.IconCompatParcelizer.hashCode() * 31, 31);
        String str = this.write;
        int iHashCode = str == null ? 0 : str.hashCode();
        getTopLeftnOccac gettopleftnoccac = this.read;
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + (gettopleftnoccac == null ? 0 : gettopleftnoccac.hashCode())) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.MediaBrowserCompatMediaItem);
        List list = this.serializer;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        getSizeYbymL2g getsizeybyml2g = this.RatingCompat;
        return ((iM2 + iHashCode2) * 31) + (getsizeybyml2g != null ? getsizeybyml2g.hashCode() : 0);
    }

    public recordmLhObY(String str, List list, String str2, getTopLeftnOccac gettopleftnoccac, String str3, String str4, List list2, getSizeYbymL2g getsizeybyml2g) {
        str.getClass();
        str4.getClass();
        this.IconCompatParcelizer = str;
        this.MediaSessionCompatQueueItem = list;
        this.write = str2;
        this.read = gettopleftnoccac;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.serializer = list2;
        this.RatingCompat = getsizeybyml2g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof recordmLhObY)) {
            return false;
        }
        recordmLhObY recordmlhoby = (recordmLhObY) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, recordmlhoby.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, recordmlhoby.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, recordmlhoby.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, recordmlhoby.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, recordmlhoby.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, recordmlhoby.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, recordmlhoby.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, recordmlhoby.RatingCompat}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Customer(channelId=", this.IconCompatParcelizer, ", visibleMessages=", this.MediaSessionCompatQueueItem, ", badgeContent=");
        sbSerializer.append(this.write);
        sbSerializer.append(", bgCardContent=");
        sbSerializer.append(this.read);
        sbSerializer.append(", headerDetailsContent=");
        c8$$ExternalSyntheticOutline0.m(sbSerializer, this.RemoteActionCompatParcelizer, ", senderName=", this.MediaBrowserCompatMediaItem, ", quickReplies=");
        sbSerializer.append(this.serializer);
        sbSerializer.append(", quickReplyResultAnimation=");
        sbSerializer.append(this.RatingCompat);
        sbSerializer.append(")");
        return sbSerializer.toString();
    }

    public /* synthetic */ recordmLhObY(String str, ArrayList arrayList, String str2, getTopLeftnOccac gettopleftnoccac, String str3, String str4, List list) {
        this(str, arrayList, str2, gettopleftnoccac, str3, str4, list, null);
    }
}
