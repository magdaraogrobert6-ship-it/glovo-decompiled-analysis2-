package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class ApproachIntrinsicsMeasureScope implements accessdetachAndRemoveNode {
    public static final ApproachIntrinsicsMeasureScope serializer = new ApproachIntrinsicsMeasureScope();
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("appId", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(1, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = new accessgetAggregateChildKindSet("appVersion", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(2, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet write = new accessgetAggregateChildKindSet("firebaseProjectId", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(3, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet read = new accessgetAggregateChildKindSet("mlSdkVersion", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(4, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = new accessgetAggregateChildKindSet("tfliteSchemaVersion", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(5, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaSessionCompatQueueItem = new accessgetAggregateChildKindSet("gcmSenderId", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(6, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = new accessgetAggregateChildKindSet("apiKey", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(7, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet RatingCompat = new accessgetAggregateChildKindSet("languages", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(8, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = new accessgetAggregateChildKindSet("mlSdkInstanceId", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(9, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet ParcelableVolumeInfo = new accessgetAggregateChildKindSet("isClearcutClient", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(10, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet PlaybackStateCompat = new accessgetAggregateChildKindSet("isStandaloneMlkit", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(11, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet PlaybackStateCompatCustomAction = new accessgetAggregateChildKindSet("isJsonLogging", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(12, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaSessionCompatResultReceiverWrapper = new accessgetAggregateChildKindSet("buildLevel", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(13, getStylusT8wyACA.DEFAULT))));
    public static final accessgetAggregateChildKindSet MediaSessionCompatToken = new accessgetAggregateChildKindSet("optionalModuleVersion", m1$$ExternalSyntheticOutline0.m(MediaSessionCompatQueueItem.serializer(getUnknownT8wyACA.class, new accessgetMousecp(14, getStylusT8wyACA.DEFAULT))));

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        setMeasureBlock setmeasureblock = (setMeasureBlock) obj;
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        accessupdatenode.write(RemoteActionCompatParcelizer, setmeasureblock.IconCompatParcelizer);
        accessupdatenode.write(IconCompatParcelizer, setmeasureblock.read);
        accessupdatenode.write(write, (Object) null);
        accessupdatenode.write(read, setmeasureblock.RemoteActionCompatParcelizer);
        accessupdatenode.write(MediaDescriptionCompat, setmeasureblock.serializer);
        accessupdatenode.write(MediaSessionCompatQueueItem, (Object) null);
        accessupdatenode.write(MediaMetadataCompat, (Object) null);
        accessupdatenode.write(RatingCompat, setmeasureblock.write);
        accessupdatenode.write(MediaBrowserCompatMediaItem, setmeasureblock.MediaDescriptionCompat);
        accessupdatenode.write(ParcelableVolumeInfo, setmeasureblock.MediaMetadataCompat);
        accessupdatenode.write(PlaybackStateCompat, setmeasureblock.MediaSessionCompatQueueItem);
        accessupdatenode.write(PlaybackStateCompatCustomAction, setmeasureblock.RatingCompat);
        accessupdatenode.write(MediaSessionCompatResultReceiverWrapper, setmeasureblock.MediaBrowserCompatMediaItem);
        accessupdatenode.write(MediaSessionCompatToken, setmeasureblock.MediaSessionCompatResultReceiverWrapper);
    }
}
