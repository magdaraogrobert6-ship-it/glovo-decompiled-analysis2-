package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class preceding extends AccessibilityIteratorsCharacterTextSegmentIteratorCompanion {
    public String IconCompatParcelizer;
    public getInstance MediaBrowserCompatMediaItem;
    public byte MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public String RemoteActionCompatParcelizer;
    public long read;
    public String serializer;
    public String write;

    public final preceding RemoteActionCompatParcelizer(getInstance getinstance) {
        if (getinstance != null) {
            this.MediaBrowserCompatMediaItem = getinstance;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null registrationStatus");
        return null;
    }

    public final following read() {
        getInstance getinstance;
        if (this.MediaDescriptionCompat == 3 && (getinstance = this.MediaBrowserCompatMediaItem) != null) {
            return new following(this.write, getinstance, this.serializer, this.IconCompatParcelizer, this.read, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        if (this.MediaBrowserCompatMediaItem == null) {
            sb.append(" registrationStatus");
        }
        if ((this.MediaDescriptionCompat & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.MediaDescriptionCompat & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
