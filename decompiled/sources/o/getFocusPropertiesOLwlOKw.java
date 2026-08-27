package o;

import bo.app.hg$$ExternalSyntheticLambda5;
import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getFocusPropertiesOLwlOKw {
    public static final hg$$ExternalSyntheticLambda5 MediaDescriptionCompat;
    public static final hg$$ExternalSyntheticLambda5 read;
    public static final getFocusTargetOLwlOKwannotations serializer;
    public static final getFocusEventOLwlOKwannotations write;
    public static final hg$$ExternalSyntheticLambda5 RemoteActionCompatParcelizer = new hg$$ExternalSyntheticLambda5(15);
    public static final hg$$ExternalSyntheticLambda5 MediaSessionCompatQueueItem = new hg$$ExternalSyntheticLambda5(16);
    public static final dispatch MediaMetadataCompat = new dispatch(23);
    public static final dispatch IconCompatParcelizer = new dispatch(22);
    public static final dispatch RatingCompat = new dispatch(24);
    public static final dispatch MediaBrowserCompatMediaItem = new dispatch(25);

    static {
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer = Value.RemoteActionCompatParcelizer.INTEGER_VALUE;
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = Value.RemoteActionCompatParcelizer.DOUBLE_VALUE;
        write = new getFocusEventOLwlOKwannotations(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        serializer = new getFocusTargetOLwlOKwannotations(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        MediaDescriptionCompat = new hg$$ExternalSyntheticLambda5(17);
        read = new hg$$ExternalSyntheticLambda5(18);
    }
}
