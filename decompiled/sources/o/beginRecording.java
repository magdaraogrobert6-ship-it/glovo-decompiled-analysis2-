package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class beginRecording {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final com.deliveryhero.chatsdk.domain.model.PushDataType RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String serializer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.MediaSessionCompatQueueItem;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.serializer);
        String str = this.read;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaDescriptionCompat;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.MediaMetadataCompat;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.MediaSessionCompatQueueItem;
        return this.RatingCompat.hashCode() + ((((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public beginRecording(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, com.deliveryhero.chatsdk.domain.model.PushDataType pushDataType) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        pushDataType.getClass();
        this.MediaBrowserCompatMediaItem = str;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
        this.read = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaDescriptionCompat = str6;
        this.write = str7;
        this.MediaMetadataCompat = str8;
        this.MediaSessionCompatQueueItem = str9;
        this.RatingCompat = pushDataType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beginRecording)) {
            return false;
        }
        beginRecording beginrecording = (beginRecording) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, beginrecording.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, beginrecording.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, beginrecording.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, beginrecording.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, beginrecording.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, beginrecording.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, beginrecording.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, beginrecording.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, beginrecording.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue() && this.RatingCompat == beginrecording.RatingCompat;
    }

    public final String toString() {
        return "ChatPushData(orderID=" + this.MediaBrowserCompatMediaItem + ", message=" + this.IconCompatParcelizer + ", channelType=" + this.serializer + ", channelID=" + this.read + ", chatID=" + this.RemoteActionCompatParcelizer + ", senderName=" + this.MediaDescriptionCompat + ", country=" + this.write + ", pushID=" + this.MediaMetadataCompat + ", pushAlert=" + this.MediaSessionCompatQueueItem + ", pushDataType=" + this.RatingCompat + ')';
    }
}
