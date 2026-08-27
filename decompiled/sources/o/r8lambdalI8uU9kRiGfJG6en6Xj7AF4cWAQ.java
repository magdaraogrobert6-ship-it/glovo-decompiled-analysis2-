package o;

import android.content.ContentValues;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final String MediaBrowserCompatMediaItem;
    private final TransportChangeType MediaMetadataCompat;
    private final boolean MediaSessionCompatQueueItem;

    public final boolean MediaDescriptionCompat() {
        return this.MediaSessionCompatQueueItem;
    }

    public final TransportChangeType read() {
        return this.MediaMetadataCompat;
    }

    public final String serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> write() {
        return InAppMessageFull.read();
    }

    public r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq, long j, boolean z) {
        this(r8lambdali8uu9krigfjg6en6xj7af4cwaq.read, r8lambdali8uu9krigfjg6en6xj7af4cwaq.RemoteActionCompatParcelizer, r8lambdali8uu9krigfjg6en6xj7af4cwaq.write, r8lambdali8uu9krigfjg6en6xj7af4cwaq.IconCompatParcelizer, r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaMetadataCompat, r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaBrowserCompatMediaItem, r8lambdali8uu9krigfjg6en6xj7af4cwaq.serializer, j, z);
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "TransportChange";
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.MediaMetadataCompat.isVehicleTransport();
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.MediaMetadataCompat.isOfTypeTransport();
    }

    public final boolean RatingCompat() {
        return this.MediaMetadataCompat.isMotorcycleTransport();
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("type", Integer.valueOf(this.MediaMetadataCompat.value));
        contentValues.put("event_correlation_id", this.MediaBrowserCompatMediaItem);
        contentValues.put("is_provisional", Boolean.valueOf(this.MediaSessionCompatQueueItem));
        return contentValues;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportChangeEntry{type=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", sessionId='");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append("', isProvisional=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", uniqueId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', eventTime=");
        sb.append(this.write);
        sb.append(", timeHorizon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", id=");
        sb.append(this.read);
        sb.append(", creationTime=");
        sb.append(this.serializer);
        sb.append(", updateTime=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RatingCompat, '}');
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int iHashCode2 = this.MediaMetadataCompat.hashCode();
        return Boolean.hashCode(this.MediaSessionCompatQueueItem) + ((Objects.hashCode(this.MediaBrowserCompatMediaItem) + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) obj;
        return this.MediaSessionCompatQueueItem == r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaSessionCompatQueueItem && this.MediaMetadataCompat == r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaMetadataCompat && Objects.equals(this.MediaBrowserCompatMediaItem, r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaBrowserCompatMediaItem);
    }

    public r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(long j, String str, long j2, long j3, TransportChangeType transportChangeType, String str2, long j4, long j5, boolean z) {
        this(str, j2, j3, transportChangeType, str2, j4, j5, z);
        this.read = j;
    }

    public r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ(String str, long j, long j2, TransportChangeType transportChangeType, String str2, long j3, long j4, boolean z) {
        super(str, j, j2, j3, j4);
        this.MediaMetadataCompat = transportChangeType;
        this.MediaBrowserCompatMediaItem = str2;
        this.MediaSessionCompatQueueItem = z;
    }
}
