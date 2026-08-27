package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKtLocalImageVectorCache1 implements Serializable {
    public AndroidCompositionLocals_androidKtLocalResources1 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public String MediaSessionCompatToken;
    public String PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;
    public String write;

    public final int hashCode() {
        return ((this.PlaybackStateCompatCustomAction.hashCode() + ((this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m((((af$$ExternalSyntheticOutline0.m((Long.valueOf(this.MediaDescriptionCompat).hashCode() + ((this.read + 2173) * 53)) * 53, 53, this.write) + (this.MediaBrowserCompatMediaItem ? 1231 : 1237)) * 53) + this.RatingCompat) * 53, 53, this.MediaSessionCompatToken)) * 53)) * 53) + 1237;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AndroidCompositionLocals_androidKtLocalImageVectorCache1)) {
            return false;
        }
        AndroidCompositionLocals_androidKtLocalImageVectorCache1 androidCompositionLocals_androidKtLocalImageVectorCache1 = (AndroidCompositionLocals_androidKtLocalImageVectorCache1) obj;
        if (this == androidCompositionLocals_androidKtLocalImageVectorCache1) {
            return true;
        }
        return this.read == androidCompositionLocals_androidKtLocalImageVectorCache1.read && this.MediaDescriptionCompat == androidCompositionLocals_androidKtLocalImageVectorCache1.MediaDescriptionCompat && this.write.equals(androidCompositionLocals_androidKtLocalImageVectorCache1.write) && this.MediaBrowserCompatMediaItem == androidCompositionLocals_androidKtLocalImageVectorCache1.MediaBrowserCompatMediaItem && this.RatingCompat == androidCompositionLocals_androidKtLocalImageVectorCache1.RatingCompat && this.MediaSessionCompatToken.equals(androidCompositionLocals_androidKtLocalImageVectorCache1.MediaSessionCompatToken) && this.IconCompatParcelizer == androidCompositionLocals_androidKtLocalImageVectorCache1.IconCompatParcelizer && this.PlaybackStateCompatCustomAction.equals(androidCompositionLocals_androidKtLocalImageVectorCache1.PlaybackStateCompatCustomAction);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.read);
        sb.append(" National Number: ");
        sb.append(this.MediaDescriptionCompat);
        if (this.MediaSessionCompatQueueItem && this.MediaBrowserCompatMediaItem) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.MediaMetadataCompat) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.RatingCompat);
        }
        if (this.RemoteActionCompatParcelizer) {
            sb.append(" Extension: ");
            sb.append(this.write);
        }
        return sb.toString();
    }
}
