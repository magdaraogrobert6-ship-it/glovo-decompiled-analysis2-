package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accesslocalToScreenMKHz9Ujd implements accessdetachAndRemoveNode {
    public static final accesslocalToScreenMKHz9Ujd RemoteActionCompatParcelizer = new accesslocalToScreenMKHz9Ujd();
    public static final accessgetAggregateChildKindSet serializer = new accessgetAggregateChildKindSet("durationMs", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(1, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet read = new accessgetAggregateChildKindSet("errorCode", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(2, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet write = new accessgetAggregateChildKindSet("isColdCall", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(3, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = new accessgetAggregateChildKindSet("autoManageModelOnBackground", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(4, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = new accessgetAggregateChildKindSet("autoManageModelOnLowMemory", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(5, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet RatingCompat = new accessgetAggregateChildKindSet("isNnApiEnabled", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(6, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = new accessgetAggregateChildKindSet("eventsCount", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(7, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = new accessgetAggregateChildKindSet("otherErrors", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(8, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = new accessgetAggregateChildKindSet("remoteConfigValueForAcceleration", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(9, computeFillMinDimensioniLBOSCw.DEFAULT))));
    public static final accessgetAggregateChildKindSet PlaybackStateCompat = new accessgetAggregateChildKindSet("isAccelerated", m1$$ExternalSyntheticOutline0.m(getBitmapFromCache.RemoteActionCompatParcelizer(accesscomputeFillMaxDimensioniLBOSCw.class, new computeFillHeightiLBOSCw(10, computeFillMinDimensioniLBOSCw.DEFAULT))));

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessgetCurrentIndexp accessgetcurrentindexp = (accessgetCurrentIndexp) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(serializer, accessgetcurrentindexp.write);
        accessupdatenode.write(read, accessgetcurrentindexp.RemoteActionCompatParcelizer);
        accessupdatenode.write(write, accessgetcurrentindexp.IconCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, accessgetcurrentindexp.read);
        accessupdatenode.write(MediaSessionCompatQueueItem, accessgetcurrentindexp.serializer);
        accessupdatenode.write(RatingCompat, (Object) null);
        accessupdatenode.write(MediaDescriptionCompat, (Object) null);
        accessupdatenode.write(MediaMetadataCompat, (Object) null);
        accessupdatenode.write(MediaBrowserCompatMediaItem, (Object) null);
        accessupdatenode.write(PlaybackStateCompat, (Object) null);
    }
}
