package o;

import java.nio.file.attribute.FileTime;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class PushDataType {
    public static final PushDataType[] serializer = new PushDataType[0];
    public FileTime IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public FileTime ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public FileTime RemoteActionCompatParcelizer;
    public long ResultReceiver;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public List read;
    public long write;

    public final int hashCode() {
        String str = this.MediaSessionCompatResultReceiverWrapper;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || PushDataType.class != obj.getClass()) {
                return false;
            }
            PushDataType pushDataType = (PushDataType) obj;
            if (!Objects.equals(this.MediaSessionCompatResultReceiverWrapper, pushDataType.MediaSessionCompatResultReceiverWrapper) || this.MediaDescriptionCompat != pushDataType.MediaDescriptionCompat || this.MediaSessionCompatToken != pushDataType.MediaSessionCompatToken || this.PlaybackStateCompat != pushDataType.PlaybackStateCompat || this.RatingCompat != pushDataType.RatingCompat || this.MediaBrowserCompatMediaItem != pushDataType.MediaBrowserCompatMediaItem || this.MediaMetadataCompat != pushDataType.MediaMetadataCompat || !Objects.equals(this.RemoteActionCompatParcelizer, pushDataType.RemoteActionCompatParcelizer) || !Objects.equals(this.ParcelableVolumeInfo, pushDataType.ParcelableVolumeInfo) || !Objects.equals(this.IconCompatParcelizer, pushDataType.IconCompatParcelizer) || this.PlaybackStateCompatCustomAction != pushDataType.PlaybackStateCompatCustomAction || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != pushDataType.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || this.MediaSessionCompatQueueItem != pushDataType.MediaSessionCompatQueueItem || this.write != pushDataType.write || this.ResultReceiver != pushDataType.ResultReceiver) {
                return false;
            }
            List<getChannelType> list = this.read;
            List list2 = pushDataType.read;
            if (list == null) {
                if (list2 != null) {
                    return false;
                }
            } else {
                if (list2 == null) {
                    return false;
                }
                Iterator it = list2.iterator();
                for (getChannelType getchanneltype : list) {
                    if (!it.hasNext() || !getchanneltype.equals(it.next())) {
                        return false;
                    }
                }
                if (!(!it.hasNext())) {
                    return false;
                }
            }
        }
        return true;
    }
}
