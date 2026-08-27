package o;

import android.content.ContentValues;
import com.sentiance.sdk.eventtimeline.timelines.creators.CallType;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final int MediaBrowserCompatMediaItem;
    private Long MediaMetadataCompat;
    private Long MediaSessionCompatQueueItem;

    public final Long read() {
        return this.MediaMetadataCompat;
    }

    public final Long serializer() {
        return this.MediaSessionCompatQueueItem;
    }

    public final CallType MediaBrowserCompatMediaItem() {
        return CallType.findByValue(this.MediaBrowserCompatMediaItem);
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("type", Integer.valueOf(this.MediaBrowserCompatMediaItem));
        contentValues.put("last_active", this.MediaMetadataCompat);
        contentValues.put("end_time", this.MediaSessionCompatQueueItem);
        return contentValues;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.MediaSessionCompatQueueItem = Long.valueOf(j);
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4) || !super.equals(obj)) {
            return false;
        }
        r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 = (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4) obj;
        return this.MediaBrowserCompatMediaItem == r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.MediaBrowserCompatMediaItem && Objects.equals(this.MediaMetadataCompat, r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.MediaMetadataCompat) && Objects.equals(this.MediaSessionCompatQueueItem, r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.MediaSessionCompatQueueItem);
    }

    public final void serializer(long j) {
        this.MediaMetadataCompat = Long.valueOf(j);
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("CallEntry{type=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", uniqueId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', eventTime=");
        sb.append(this.write);
        sb.append(", timeHorizon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", endTime=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", lastActiveTime=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", id=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, '}');
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "Call";
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> write() {
        return logImpressionlambda1.read();
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int i = this.MediaBrowserCompatMediaItem;
        return Objects.hash(Integer.valueOf(iHashCode), Integer.valueOf(i), this.MediaMetadataCompat, this.MediaSessionCompatQueueItem);
    }

    public r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4(long j, String str, int i, long j2, long j3, Long l, Long l2, long j4, long j5) {
        super(j, str, j2, j3, j4, j5);
        this.MediaBrowserCompatMediaItem = i;
        this.MediaMetadataCompat = l;
        this.MediaSessionCompatQueueItem = l2;
    }

    public r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4(String str, CallType callType, long j, long j2, Long l, Long l2, long j3, long j4) {
        super(str, j, j2, j3, j4);
        this.MediaBrowserCompatMediaItem = callType.value;
        this.MediaMetadataCompat = l;
        this.MediaSessionCompatQueueItem = l2;
    }
}
