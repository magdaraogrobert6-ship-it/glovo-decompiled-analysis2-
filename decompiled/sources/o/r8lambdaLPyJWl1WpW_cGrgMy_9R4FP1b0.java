package o;

import android.content.ContentValues;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0 extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final boolean MediaBrowserCompatMediaItem;
    private final HarshDrivingEntryType MediaDescriptionCompat;
    private final Integer MediaMetadataCompat;
    private final HarshDrivingEntryType MediaSessionCompatQueueItem;
    private final Long MediaSessionCompatResultReceiverWrapper;
    private final Long MediaSessionCompatToken;
    private final Integer ParcelableVolumeInfo;
    private final Double PlaybackStateCompatCustomAction;

    public final Long MediaBrowserCompatMediaItem() {
        return this.MediaSessionCompatToken;
    }

    public final HarshDrivingEntryType MediaDescriptionCompat() {
        return this.MediaSessionCompatQueueItem;
    }

    public final Long MediaMetadataCompat() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final Double MediaSessionCompatQueueItem() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final HarshDrivingEntryType RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    public final Integer read() {
        return this.ParcelableVolumeInfo;
    }

    public final Integer serializer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0> write() {
        return setBrazeManager.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "HarshDrivingEvaluationEntry";
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("is_harsh_event", Boolean.valueOf(this.MediaBrowserCompatMediaItem));
        HarshDrivingEntryType harshDrivingEntryType = this.MediaSessionCompatQueueItem;
        contentValues.put("type", harshDrivingEntryType == null ? null : Integer.valueOf(harshDrivingEntryType.value));
        contentValues.put("confidence", this.MediaMetadataCompat);
        contentValues.put("type_motorcycle", Integer.valueOf(this.MediaDescriptionCompat.value));
        contentValues.put("confidence_motorcycle", this.ParcelableVolumeInfo);
        contentValues.put("magnitude", this.PlaybackStateCompatCustomAction);
        contentValues.put("start_time", this.MediaSessionCompatToken);
        contentValues.put("end_time", this.MediaSessionCompatResultReceiverWrapper);
        return contentValues;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        return "HarshDrivingEvaluationEntry{isHarshEvent=" + this.MediaBrowserCompatMediaItem + ", type=" + this.MediaSessionCompatQueueItem + ", confidence=" + this.MediaMetadataCompat + ", typeMotorcycle=" + this.MediaDescriptionCompat + ", confidenceMotorcycle=" + this.ParcelableVolumeInfo + ", magnitude=" + this.PlaybackStateCompatCustomAction + ", startTime=" + this.MediaSessionCompatToken + ", endTime=" + this.MediaSessionCompatResultReceiverWrapper + '}';
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0 r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0 = (r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0) obj;
        return this.MediaSessionCompatQueueItem == r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaSessionCompatQueueItem && Objects.equals(this.MediaMetadataCompat, r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaMetadataCompat) && this.MediaDescriptionCompat == r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaDescriptionCompat && Objects.equals(this.ParcelableVolumeInfo, r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.ParcelableVolumeInfo) && Objects.equals(this.PlaybackStateCompatCustomAction, r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.PlaybackStateCompatCustomAction) && Objects.equals(this.MediaSessionCompatToken, r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaSessionCompatToken) && Objects.equals(this.MediaSessionCompatResultReceiverWrapper, r8lambdalpyjwl1wpw_cgrgmy_9r4fp1b0.MediaSessionCompatResultReceiverWrapper);
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        int iHashCode = super.hashCode();
        Long l = this.MediaSessionCompatToken;
        Long l2 = this.MediaSessionCompatResultReceiverWrapper;
        return Objects.hash(Integer.valueOf(iHashCode), this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.ParcelableVolumeInfo, this.PlaybackStateCompatCustomAction, l, l2);
    }

    public r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0(long j, String str, long j2, long j3, boolean z, HarshDrivingEntryType harshDrivingEntryType, Integer num, HarshDrivingEntryType harshDrivingEntryType2, Integer num2, Double d, Long l, Long l2, long j4, long j5) {
        super(j, str, j2, j3, j4, j5);
        this.MediaBrowserCompatMediaItem = z;
        this.MediaSessionCompatQueueItem = harshDrivingEntryType;
        this.MediaMetadataCompat = num;
        this.MediaDescriptionCompat = harshDrivingEntryType2;
        this.ParcelableVolumeInfo = num2;
        this.PlaybackStateCompatCustomAction = d;
        this.MediaSessionCompatToken = l;
        this.MediaSessionCompatResultReceiverWrapper = l2;
    }

    public r8lambdaLPyJWl1WpW_cGrgMy_9R4FP1b0(String str, long j, long j2, boolean z, HarshDrivingEntryType harshDrivingEntryType, Integer num, HarshDrivingEntryType harshDrivingEntryType2, Integer num2, Double d, Long l, Long l2, long j3, long j4) {
        super(str, j, j2, j3, j4);
        this.MediaBrowserCompatMediaItem = z;
        this.MediaSessionCompatQueueItem = harshDrivingEntryType;
        this.MediaMetadataCompat = num;
        this.MediaDescriptionCompat = harshDrivingEntryType2;
        this.ParcelableVolumeInfo = num2;
        this.PlaybackStateCompatCustomAction = d;
        this.MediaSessionCompatToken = l;
        this.MediaSessionCompatResultReceiverWrapper = l2;
    }
}
