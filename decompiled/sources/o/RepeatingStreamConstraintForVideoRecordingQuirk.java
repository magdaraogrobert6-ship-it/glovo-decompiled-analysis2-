package o;

import android.util.Range;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class RepeatingStreamConstraintForVideoRecordingQuirk extends FuturesExternalSyntheticLambda3 {
    public InitializationException IconCompatParcelizer;
    public Integer MediaMetadataCompat;
    public Boolean MediaSessionCompatQueueItem;
    public Range RemoteActionCompatParcelizer;
    public android.util.Size read;
    public android.util.Size serializer;
    public getNavigationIcon write;

    public final SmallDisplaySizeQuirk read() {
        String strConcat = this.serializer == null ? " resolution" : "";
        if (this.read == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (this.write == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (this.MediaMetadataCompat == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (this.RemoteActionCompatParcelizer == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (this.MediaSessionCompatQueueItem == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new SmallDisplaySizeQuirk(this.serializer, this.read, this.write, this.MediaMetadataCompat.intValue(), this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem.booleanValue());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
