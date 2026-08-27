package o;

import android.content.ContentValues;
import com.sentiance.sdk.ondevicecommon.CrashDetectorModeInternal;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final Short MediaBrowserCompatMediaItem;
    private final Float MediaDescriptionCompat;
    private final Float MediaMetadataCompat;
    private final Float MediaSessionCompatQueueItem;
    private final r8lambdajVa0HW0zFC0lycNBZuexuYnMifw MediaSessionCompatResultReceiverWrapper;
    private final Float MediaSessionCompatToken;
    private final CrashSeverityInternal ParcelableVolumeInfo;
    private final Float PlaybackStateCompat;
    private final Float PlaybackStateCompatCustomAction;
    private final CrashDetectorModeInternal r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    public final Float MediaBrowserCompatMediaItem() {
        return this.MediaSessionCompatToken;
    }

    public final Float MediaDescriptionCompat() {
        return this.MediaSessionCompatQueueItem;
    }

    public final Float MediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final CrashSeverityInternal MediaSessionCompatResultReceiverWrapper() {
        return this.ParcelableVolumeInfo;
    }

    public final Float PlaybackStateCompat() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final Float RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    public final Short read() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final Float serializer() {
        return this.PlaybackStateCompat;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> write() {
        return setClickBehaviorlambda0.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "Screen";
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        String strWrite;
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("latitude", this.MediaMetadataCompat);
        contentValues.put("longitude", this.MediaSessionCompatQueueItem);
        contentValues.put("accuracy", this.MediaBrowserCompatMediaItem);
        contentValues.put("magnitude", this.MediaDescriptionCompat);
        contentValues.put("confidence", this.PlaybackStateCompat);
        contentValues.put("speed_at_impact", this.PlaybackStateCompatCustomAction);
        contentValues.put("delta_v", this.MediaSessionCompatToken);
        r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw = this.MediaSessionCompatResultReceiverWrapper;
        if (r8lambdajva0hw0zfc0lycnbzuexuynmifw == null) {
            strWrite = null;
        } else {
            try {
                strWrite = r8lambdajva0hw0zfc0lycnbzuexuynmifw.write();
            } catch (JSONException unused) {
                strWrite = null;
            }
        }
        contentValues.put("models", strWrite);
        CrashSeverityInternal crashSeverityInternal = this.ParcelableVolumeInfo;
        if (crashSeverityInternal != null) {
            contentValues.put("severity", Integer.valueOf(crashSeverityInternal.getLevel()));
        }
        contentValues.put("detector_mode", Integer.valueOf(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getMode()));
        return contentValues;
    }

    public final List<r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA> MediaSessionCompatQueueItem() {
        r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw = this.MediaSessionCompatResultReceiverWrapper;
        return r8lambdajva0hw0zfc0lycnbzuexuynmifw != null ? r8lambdajva0hw0zfc0lycnbzuexuynmifw.RemoteActionCompatParcelizer() : new ArrayList();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashEntry{latitude=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", longitude=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", accuracy=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", magnitudeMps2=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", confidence=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", speedAtImpactMps=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", deltaVMps=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", models=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", severity=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", detectorMode=");
        sb.append(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 r8lambda5plvmmyc7msph8a8xignikxwbe0 = (r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0) obj;
        return Objects.equals(this.MediaMetadataCompat, r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaMetadataCompat) && Objects.equals(this.MediaSessionCompatQueueItem, r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatQueueItem) && Objects.equals(this.MediaBrowserCompatMediaItem, r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaBrowserCompatMediaItem) && Objects.equals(this.MediaDescriptionCompat, r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaDescriptionCompat) && Objects.equals(this.PlaybackStateCompat, r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompat) && Objects.equals(this.PlaybackStateCompatCustomAction, r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompatCustomAction) && Objects.equals(this.MediaSessionCompatToken, r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatToken) && Objects.equals(this.MediaSessionCompatResultReceiverWrapper, r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatResultReceiverWrapper) && this.ParcelableVolumeInfo == r8lambda5plvmmyc7msph8a8xignikxwbe0.ParcelableVolumeInfo && this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == r8lambda5plvmmyc7msph8a8xignikxwbe0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        int iHashCode = super.hashCode();
        CrashSeverityInternal crashSeverityInternal = this.ParcelableVolumeInfo;
        CrashDetectorModeInternal crashDetectorModeInternal = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return Objects.hash(Integer.valueOf(iHashCode), this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.PlaybackStateCompat, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatToken, this.MediaSessionCompatResultReceiverWrapper, crashSeverityInternal, crashDetectorModeInternal);
    }

    public r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0(long j, String str, long j2, long j3, Float f, Float f2, Short sh, Float f3, Float f4, Float f5, Float f6, r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw, long j4, long j5, CrashSeverityInternal crashSeverityInternal, CrashDetectorModeInternal crashDetectorModeInternal) {
        super(j, str, j2, j3, j4, j5);
        this.MediaMetadataCompat = f;
        this.MediaSessionCompatQueueItem = f2;
        this.MediaBrowserCompatMediaItem = sh;
        this.MediaDescriptionCompat = f3;
        this.PlaybackStateCompat = f4;
        this.PlaybackStateCompatCustomAction = f5;
        this.MediaSessionCompatToken = f6;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdajva0hw0zfc0lycnbzuexuynmifw;
        this.ParcelableVolumeInfo = crashSeverityInternal;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = crashDetectorModeInternal;
    }

    public r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0(String str, long j, long j2, Float f, Float f2, Short sh, Float f3, Float f4, Float f5, Float f6, r8lambdajVa0HW0zFC0lycNBZuexuYnMifw r8lambdajva0hw0zfc0lycnbzuexuynmifw, long j3, long j4, CrashSeverityInternal crashSeverityInternal, CrashDetectorModeInternal crashDetectorModeInternal) {
        super(str, j, j2, j3, j4);
        this.MediaMetadataCompat = f;
        this.MediaSessionCompatQueueItem = f2;
        this.MediaBrowserCompatMediaItem = sh;
        this.MediaDescriptionCompat = f3;
        this.PlaybackStateCompat = f4;
        this.PlaybackStateCompatCustomAction = f5;
        this.MediaSessionCompatToken = f6;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdajva0hw0zfc0lycnbzuexuynmifw;
        this.ParcelableVolumeInfo = crashSeverityInternal;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = crashDetectorModeInternal;
    }
}
