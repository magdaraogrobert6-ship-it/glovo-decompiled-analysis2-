package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class performMeasureAndLayout extends trackMeasurementByParent {
    public final placeOuterCoordinatorMLgxB_4 IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final MergedViewAdapter MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final isInLookaheadPass MediaSessionCompatResultReceiverWrapper;
    public final long MediaSessionCompatToken;
    public final int RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final Long read;
    public final getLookaheadPassDelegate serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode2 = this.MediaSessionCompatQueueItem.hashCode();
        String str = this.write;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j = this.MediaSessionCompatToken;
        int i = (int) (j ^ (j >>> 32));
        Long l = this.read;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        int i2 = this.RemoteActionCompatParcelizer ? 1231 : 1237;
        int iHashCode5 = this.serializer.hashCode();
        isInLookaheadPass isinlookaheadpass = this.MediaSessionCompatResultReceiverWrapper;
        int iHashCode6 = isinlookaheadpass == null ? 0 : isinlookaheadpass.hashCode();
        MergedViewAdapter mergedViewAdapter = this.MediaDescriptionCompat;
        int iHashCode7 = mergedViewAdapter == null ? 0 : mergedViewAdapter.hashCode();
        placeOuterCoordinatorMLgxB_4 placeoutercoordinatormlgxb_4 = this.IconCompatParcelizer;
        int iHashCode8 = placeoutercoordinatormlgxb_4 == null ? 0 : placeoutercoordinatormlgxb_4.hashCode();
        List list = this.MediaMetadataCompat;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i) * 1000003) ^ iHashCode4) * 1000003) ^ i2) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.RatingCompat;
    }

    @Override // o.trackMeasurementByParent
    public final remeasureAndRelayoutIfNeeded read() {
        remeasureAndRelayoutIfNeeded remeasureandrelayoutifneeded = new remeasureAndRelayoutIfNeeded();
        remeasureandrelayoutifneeded.MediaBrowserCompatMediaItem = this.MediaBrowserCompatMediaItem;
        remeasureandrelayoutifneeded.MediaDescriptionCompat = this.MediaSessionCompatQueueItem;
        remeasureandrelayoutifneeded.read = this.write;
        remeasureandrelayoutifneeded.MediaSessionCompatToken = this.MediaSessionCompatToken;
        remeasureandrelayoutifneeded.write = this.read;
        remeasureandrelayoutifneeded.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        remeasureandrelayoutifneeded.serializer = this.serializer;
        remeasureandrelayoutifneeded.PlaybackStateCompat = this.MediaSessionCompatResultReceiverWrapper;
        remeasureandrelayoutifneeded.MediaSessionCompatQueueItem = this.MediaDescriptionCompat;
        remeasureandrelayoutifneeded.IconCompatParcelizer = this.IconCompatParcelizer;
        remeasureandrelayoutifneeded.MediaMetadataCompat = this.MediaMetadataCompat;
        remeasureandrelayoutifneeded.RatingCompat = this.RatingCompat;
        remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) 7;
        return remeasureandrelayoutifneeded;
    }

    public performMeasureAndLayout(String str, String str2, String str3, long j, Long l, boolean z, getLookaheadPassDelegate getlookaheadpassdelegate, isInLookaheadPass isinlookaheadpass, MergedViewAdapter mergedViewAdapter, placeOuterCoordinatorMLgxB_4 placeoutercoordinatormlgxb_4, List list, int i) {
        this.MediaBrowserCompatMediaItem = str;
        this.MediaSessionCompatQueueItem = str2;
        this.write = str3;
        this.MediaSessionCompatToken = j;
        this.read = l;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = getlookaheadpassdelegate;
        this.MediaSessionCompatResultReceiverWrapper = isinlookaheadpass;
        this.MediaDescriptionCompat = mergedViewAdapter;
        this.IconCompatParcelizer = placeoutercoordinatormlgxb_4;
        this.MediaMetadataCompat = list;
        this.RatingCompat = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof trackMeasurementByParent)) {
            return false;
        }
        performMeasureAndLayout performmeasureandlayout = (performMeasureAndLayout) ((trackMeasurementByParent) obj);
        if (!this.MediaBrowserCompatMediaItem.equals(performmeasureandlayout.MediaBrowserCompatMediaItem) || !this.MediaSessionCompatQueueItem.equals(performmeasureandlayout.MediaSessionCompatQueueItem)) {
            return false;
        }
        String str = performmeasureandlayout.write;
        String str2 = this.write;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.MediaSessionCompatToken != performmeasureandlayout.MediaSessionCompatToken) {
            return false;
        }
        Long l = performmeasureandlayout.read;
        Long l2 = this.read;
        if (l2 == null) {
            if (l != null) {
                return false;
            }
        } else if (!l2.equals(l)) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer != performmeasureandlayout.RemoteActionCompatParcelizer || !this.serializer.equals(performmeasureandlayout.serializer)) {
            return false;
        }
        isInLookaheadPass isinlookaheadpass = performmeasureandlayout.MediaSessionCompatResultReceiverWrapper;
        isInLookaheadPass isinlookaheadpass2 = this.MediaSessionCompatResultReceiverWrapper;
        if (isinlookaheadpass2 == null) {
            if (isinlookaheadpass != null) {
                return false;
            }
        } else if (!isinlookaheadpass2.equals(isinlookaheadpass)) {
            return false;
        }
        MergedViewAdapter mergedViewAdapter = performmeasureandlayout.MediaDescriptionCompat;
        MergedViewAdapter mergedViewAdapter2 = this.MediaDescriptionCompat;
        if (mergedViewAdapter2 == null) {
            if (mergedViewAdapter != null) {
                return false;
            }
        } else if (!mergedViewAdapter2.equals(mergedViewAdapter)) {
            return false;
        }
        placeOuterCoordinatorMLgxB_4 placeoutercoordinatormlgxb_4 = performmeasureandlayout.IconCompatParcelizer;
        placeOuterCoordinatorMLgxB_4 placeoutercoordinatormlgxb_5 = this.IconCompatParcelizer;
        if (placeoutercoordinatormlgxb_5 == null) {
            if (placeoutercoordinatormlgxb_4 != null) {
                return false;
            }
        } else if (!placeoutercoordinatormlgxb_5.equals(placeoutercoordinatormlgxb_4)) {
            return false;
        }
        List list = performmeasureandlayout.MediaMetadataCompat;
        List list2 = this.MediaMetadataCompat;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return this.RatingCompat == performmeasureandlayout.RatingCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", identifier=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", appQualitySessionId=");
        sb.append(this.write);
        sb.append(", startedAt=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", endedAt=");
        sb.append(this.read);
        sb.append(", crashed=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", app=");
        sb.append(this.serializer);
        sb.append(", user=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", os=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", device=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", events=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", generatorType=");
        return af$$ExternalSyntheticOutline0.m(this.RatingCompat, "}", sb);
    }
}
