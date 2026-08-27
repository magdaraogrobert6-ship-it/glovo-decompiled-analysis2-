package o;

import com.sentiance.core.model.thrift.DetectionTrigger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeUserExternalSyntheticLambda3 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getBRAZE_PUSH_DELIVERY_FLUSH_MAX_KEYannotations RemoteActionCompatParcelizer = new getBRAZE_PUSH_DELIVERY_FLUSH_MAX_KEYannotations();
    public final List IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final DetectionTrigger ParcelableVolumeInfo;
    public final List PlaybackStateCompat;
    public final List PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final setCustomUserAttributelambda3 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final IBrazeNotificationFactory read;
    public final String serializer;
    public final List write;

    public final int hashCode() {
        String str = this.serializer;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.write;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        IBrazeNotificationFactory iBrazeNotificationFactory = this.read;
        int iHashCode3 = iBrazeNotificationFactory == null ? 0 : iBrazeNotificationFactory.hashCode();
        List list2 = this.IconCompatParcelizer;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.RatingCompat;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaDescriptionCompat;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        List list3 = this.MediaSessionCompatQueueItem;
        int iHashCode7 = list3 == null ? 0 : list3.hashCode();
        String str4 = this.MediaMetadataCompat;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        List list4 = this.MediaBrowserCompatMediaItem;
        int iHashCode9 = list4 == null ? 0 : list4.hashCode();
        List list5 = this.PlaybackStateCompat;
        int iHashCode10 = list5 == null ? 0 : list5.hashCode();
        String str5 = this.MediaSessionCompatResultReceiverWrapper;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.MediaSessionCompatToken;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        List list6 = this.PlaybackStateCompatCustomAction;
        int iHashCode13 = list6 == null ? 0 : list6.hashCode();
        DetectionTrigger detectionTrigger = this.ParcelableVolumeInfo;
        int iHashCode14 = detectionTrigger == null ? 0 : detectionTrigger.hashCode();
        setCustomUserAttributelambda3 setcustomuserattributelambda3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        return (((((((((((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ iHashCode11) * (-2128831035)) ^ iHashCode12) * (-2128831035)) ^ iHashCode13) * (-2128831035)) ^ iHashCode14) * (-2128831035)) ^ (setcustomuserattributelambda3 == null ? 0 : setcustomuserattributelambda3.hashCode())) * (-2128831035);
    }

    public BrazeUserExternalSyntheticLambda3(IBraze iBraze) {
        this.serializer = (String) iBraze.read;
        ArrayList arrayList = (ArrayList) iBraze.serializer;
        this.write = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.read = (IBrazeNotificationFactory) iBraze.write;
        ArrayList arrayList2 = (ArrayList) iBraze.IconCompatParcelizer;
        this.IconCompatParcelizer = arrayList2 == null ? null : Collections.unmodifiableList(arrayList2);
        this.RatingCompat = (String) iBraze.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = (String) iBraze.MediaMetadataCompat;
        ArrayList arrayList3 = (ArrayList) iBraze.MediaBrowserCompatMediaItem;
        this.MediaSessionCompatQueueItem = arrayList3 == null ? null : Collections.unmodifiableList(arrayList3);
        this.MediaMetadataCompat = (String) iBraze.RatingCompat;
        ArrayList arrayList4 = (ArrayList) iBraze.MediaDescriptionCompat;
        this.MediaBrowserCompatMediaItem = arrayList4 == null ? null : Collections.unmodifiableList(arrayList4);
        ArrayList arrayList5 = (ArrayList) iBraze.MediaSessionCompatQueueItem;
        this.PlaybackStateCompat = arrayList5 == null ? null : Collections.unmodifiableList(arrayList5);
        this.MediaSessionCompatResultReceiverWrapper = (String) iBraze.ParcelableVolumeInfo;
        this.MediaSessionCompatToken = (String) iBraze.PlaybackStateCompat;
        ArrayList arrayList6 = (ArrayList) iBraze.MediaSessionCompatResultReceiverWrapper;
        this.PlaybackStateCompatCustomAction = arrayList6 != null ? Collections.unmodifiableList(arrayList6) : null;
        this.ParcelableVolumeInfo = (DetectionTrigger) iBraze.MediaSessionCompatToken;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (setCustomUserAttributelambda3) iBraze.PlaybackStateCompatCustomAction;
    }

    public final String toString() {
        return "AugmentedTransport{atomid=" + this.serializer + ", augmented_trajectory=" + this.write + ", behavior_events=" + this.read + ", behavior_features=" + this.IconCompatParcelizer + ", endedAt=" + this.RatingCompat + ", generatedAt=" + this.MediaDescriptionCompat + ", interpolated_trajectory=" + this.MediaSessionCompatQueueItem + ", label=" + this.MediaMetadataCompat + ", session_ids=" + this.MediaBrowserCompatMediaItem + ", smooth_trajectory=" + this.PlaybackStateCompat + ", startedAt=" + this.MediaSessionCompatResultReceiverWrapper + ", userid=" + this.MediaSessionCompatToken + ", waypoints=" + this.PlaybackStateCompatCustomAction + ", external_trigger=" + this.ParcelableVolumeInfo + ", driver_passenger=" + this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        r2 = r5.PlaybackStateCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        r2 = r5.MediaSessionCompatResultReceiverWrapper;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
    
        r2 = r5.MediaSessionCompatToken;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        r2 = r5.PlaybackStateCompatCustomAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        r2 = r5.ParcelableVolumeInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d3, code lost:
    
        r5 = r5.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeUserExternalSyntheticLambda3.equals(java.lang.Object):boolean");
    }
}
