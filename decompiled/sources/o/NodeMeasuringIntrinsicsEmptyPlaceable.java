package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NodeMeasuringIntrinsicsEmptyPlaceable {
    public static final dispatch IconCompatParcelizer;
    public static final dispatch MediaBrowserCompatMediaItem;
    public static final dispatch MediaDescriptionCompat;
    public static final dispatch MediaMetadataCompat;
    public static final minHeightui MediaSessionCompatQueueItem;
    public static final NodeMeasuringIntrinsicsMeasureBlock RatingCompat;
    public static final NodeMeasuringIntrinsicsIntrinsicMinMax RemoteActionCompatParcelizer;
    public static final dispatch read = new dispatch(2);
    public static final dispatch serializer;
    public static final minWidthui write;

    static {
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer = Value.RemoteActionCompatParcelizer.INTEGER_VALUE;
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = Value.RemoteActionCompatParcelizer.DOUBLE_VALUE;
        write = new minWidthui(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        IconCompatParcelizer = new dispatch(3);
        RemoteActionCompatParcelizer = new NodeMeasuringIntrinsicsIntrinsicMinMax(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        serializer = new dispatch(4);
        MediaMetadataCompat = new dispatch(5);
        MediaBrowserCompatMediaItem = new dispatch(1);
        RatingCompat = new NodeMeasuringIntrinsicsMeasureBlock(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        MediaSessionCompatQueueItem = new minHeightui(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        MediaDescriptionCompat = new dispatch(6);
    }
}
