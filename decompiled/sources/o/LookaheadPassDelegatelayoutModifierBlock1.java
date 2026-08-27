package o;

import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadPassDelegatelayoutModifierBlock1 implements accessdetachAndRemoveNode {
    public static final LookaheadPassDelegatelayoutModifierBlock1 MediaSessionCompatQueueItem = new LookaheadPassDelegatelayoutModifierBlock1();
    public static final accessgetAggregateChildKindSet RatingCompat = accessgetAggregateChildKindSet.read("generator");
    public static final accessgetAggregateChildKindSet MediaDescriptionCompat = accessgetAggregateChildKindSet.read("identifier");
    public static final accessgetAggregateChildKindSet write = accessgetAggregateChildKindSet.read("appQualitySessionId");
    public static final accessgetAggregateChildKindSet ParcelableVolumeInfo = accessgetAggregateChildKindSet.read("startedAt");
    public static final accessgetAggregateChildKindSet IconCompatParcelizer = accessgetAggregateChildKindSet.read("endedAt");
    public static final accessgetAggregateChildKindSet serializer = accessgetAggregateChildKindSet.read("crashed");
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer = accessgetAggregateChildKindSet.read("app");
    public static final accessgetAggregateChildKindSet PlaybackStateCompatCustomAction = accessgetAggregateChildKindSet.read(FeedbackEvent.UI);
    public static final accessgetAggregateChildKindSet PlaybackStateCompat = accessgetAggregateChildKindSet.read("os");
    public static final accessgetAggregateChildKindSet read = accessgetAggregateChildKindSet.read("device");
    public static final accessgetAggregateChildKindSet MediaBrowserCompatMediaItem = accessgetAggregateChildKindSet.read("events");
    public static final accessgetAggregateChildKindSet MediaMetadataCompat = accessgetAggregateChildKindSet.read("generatorType");

    @Override // o.accessgetLoggerp
    public final void serializer(Object obj, Object obj2) {
        accessupdateNode accessupdatenode = (accessupdateNode) obj2;
        performMeasureAndLayout performmeasureandlayout = (performMeasureAndLayout) ((trackMeasurementByParent) obj);
        accessupdatenode.write(RatingCompat, performmeasureandlayout.MediaBrowserCompatMediaItem);
        accessupdatenode.write(MediaDescriptionCompat, performmeasureandlayout.MediaSessionCompatQueueItem.getBytes(traceMeasureLayout.PlaybackStateCompat));
        accessupdatenode.write(write, performmeasureandlayout.write);
        accessupdatenode.write(ParcelableVolumeInfo, performmeasureandlayout.MediaSessionCompatToken);
        accessupdatenode.write(IconCompatParcelizer, performmeasureandlayout.read);
        accessupdatenode.read(serializer, performmeasureandlayout.RemoteActionCompatParcelizer);
        accessupdatenode.write(RemoteActionCompatParcelizer, performmeasureandlayout.serializer);
        accessupdatenode.write(PlaybackStateCompatCustomAction, performmeasureandlayout.MediaSessionCompatResultReceiverWrapper);
        accessupdatenode.write(PlaybackStateCompat, performmeasureandlayout.MediaDescriptionCompat);
        accessupdatenode.write(read, performmeasureandlayout.IconCompatParcelizer);
        accessupdatenode.write(MediaBrowserCompatMediaItem, performmeasureandlayout.MediaMetadataCompat);
        accessupdatenode.write(MediaMetadataCompat, performmeasureandlayout.RatingCompat);
    }
}
