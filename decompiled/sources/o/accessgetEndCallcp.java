package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEndCallcp extends accessgetFcp {
    public Long IconCompatParcelizer;
    public byte[] MediaBrowserCompatMediaItem;
    public Long MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public Integer MediaSessionCompatQueueItem;
    public String RatingCompat;
    public Integer RemoteActionCompatParcelizer;
    public accessgetF1cp read;
    public byte[] serializer;
    public HashMap write;

    public final accessgetDvrcp read() {
        String strConcat = this.MediaMetadataCompat == null ? " transportName" : "";
        if (this.read == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (this.IconCompatParcelizer == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (this.MediaDescriptionCompat == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (this.write == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new accessgetDvrcp(this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer.longValue(), this.MediaDescriptionCompat.longValue(), this.write, this.MediaSessionCompatQueueItem, this.RatingCompat, this.serializer, this.MediaBrowserCompatMediaItem);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
