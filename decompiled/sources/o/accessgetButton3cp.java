package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton3cp implements accessdetachAndRemoveNode {
    public static final accessgetButton3cp MediaDescriptionCompat = new accessgetButton3cp();
    public static final accessgetAggregateChildKindSet PlaybackStateCompat = accessgetAggregateChildKindSet.read("sdkVersion");
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = accessgetAggregateChildKindSet.read("model");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("hardware");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("device");
    public static final accessgetAggregateChildKindSet MediaSessionCompatResultReceiverWrapper = accessgetAggregateChildKindSet.read("product");
    public static final accessgetAggregateChildKindSet MediaSessionCompatToken = accessgetAggregateChildKindSet.read("osBuild");
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("manufacturer");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("locale");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY);
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("mccMnc");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("applicationBuild");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessgetButtonCcp accessgetbuttonccp = (accessgetButtonCcp) ((accessgetButton14cp) obj);
        accessupdatenode.write(PlaybackStateCompat, accessgetbuttonccp.PlaybackStateCompatCustomAction);
        accessupdatenode.write(MediaSessionCompatQueueItem, accessgetbuttonccp.RatingCompat);
        accessupdatenode.write(IconCompatParcelizer, accessgetbuttonccp.IconCompatParcelizer);
        accessupdatenode.write(serializer, accessgetbuttonccp.write);
        accessupdatenode.write(MediaSessionCompatResultReceiverWrapper, accessgetbuttonccp.ParcelableVolumeInfo);
        accessupdatenode.write(MediaSessionCompatToken, accessgetbuttonccp.MediaSessionCompatQueueItem);
        accessupdatenode.write(RatingCompat, accessgetbuttonccp.MediaBrowserCompatMediaItem);
        accessupdatenode.write(write, accessgetbuttonccp.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaMetadataCompat, accessgetbuttonccp.MediaMetadataCompat);
        accessupdatenode.write(read, accessgetbuttonccp.serializer);
        accessupdatenode.write(MediaBrowserCompatMediaItem, accessgetbuttonccp.MediaDescriptionCompat);
        accessupdatenode.write(RemoteActionCompatParcelizer, accessgetbuttonccp.read);
    }
}
