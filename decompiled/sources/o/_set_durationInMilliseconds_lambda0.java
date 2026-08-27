package o;

import android.content.ContentValues;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class _set_durationInMilliseconds_lambda0 extends r8lambdaSl6HfpkWhWo6LDjCw2JoZqjyIyY {
    private final double IconCompatParcelizer;
    private final VenueType MediaBrowserCompatMediaItem;
    private VenueSignificance MediaSessionCompatQueueItem;
    private final logClick RatingCompat;
    private final double read;
    private final short serializer;
    private final short write;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final VenueType MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final double MediaDescriptionCompat() {
        return this.IconCompatParcelizer;
    }

    public final double MediaMetadataCompat() {
        return this.read;
    }

    public final short MediaSessionCompatQueueItem() {
        return this.write;
    }

    public final logClick MediaSessionCompatToken() {
        return this.RatingCompat;
    }

    public final VenueSignificance RatingCompat() {
        return this.MediaSessionCompatQueueItem;
    }

    public final short read() {
        return this.serializer;
    }

    public final String serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void serializer(VenueSignificance venueSignificance) {
        this.MediaSessionCompatQueueItem = venueSignificance;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<_set_durationInMilliseconds_lambda0> write() {
        return r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        String strWrite;
        ContentValues contentValues = new ContentValues();
        contentValues.put("unique_id", this.RemoteActionCompatParcelizer);
        contentValues.put("latitude", Double.valueOf(this.read));
        contentValues.put("longitude", Double.valueOf(this.IconCompatParcelizer));
        contentValues.put("accuracy", Short.valueOf(this.serializer));
        contentValues.put(com.braze.models.IBrazeLocation.ALTITUDE, Short.valueOf(this.write));
        logClick logclick = this.RatingCompat;
        if (logclick == null) {
            strWrite = null;
        } else {
            try {
                strWrite = logclick.write();
            } catch (JSONException unused) {
                strWrite = null;
            }
        }
        contentValues.put("wifi_info", strWrite);
        contentValues.put("venue_significance", Integer.valueOf(this.MediaSessionCompatQueueItem.value));
        VenueType venueType = this.MediaBrowserCompatMediaItem;
        if (venueType != null) {
            contentValues.put("venue_type", Integer.valueOf(venueType.value));
        }
        return contentValues;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Double.valueOf(this.read).hashCode();
        int iHashCode3 = Double.valueOf(this.IconCompatParcelizer).hashCode();
        short s = this.serializer;
        short s2 = this.write;
        logClick logclick = this.RatingCompat;
        int iHashCode4 = logclick == null ? 0 : logclick.hashCode();
        int iHashCode5 = this.MediaSessionCompatQueueItem.hashCode();
        VenueType venueType = this.MediaBrowserCompatMediaItem;
        return ((iHashCode5 + ((((((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + s) * 31) + s2) * 31) + iHashCode4) * 31)) * 31) + (venueType != null ? venueType.hashCode() : 0);
    }

    public _set_durationInMilliseconds_lambda0(String str, double d, double d2, short s, short s2, logClick logclick, VenueSignificance venueSignificance, VenueType venueType) {
        super(str);
        this.read = d;
        this.IconCompatParcelizer = d2;
        this.serializer = s;
        this.write = s2;
        this.RatingCompat = logclick;
        this.MediaSessionCompatQueueItem = venueSignificance;
        this.MediaBrowserCompatMediaItem = venueType;
    }

    public final boolean equals(Object obj) {
        short s;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof _set_durationInMilliseconds_lambda0)) {
            return false;
        }
        _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = (_set_durationInMilliseconds_lambda0) obj;
        return this.RemoteActionCompatParcelizer.equals(_set_durationinmilliseconds_lambda0.RemoteActionCompatParcelizer) && this.read == _set_durationinmilliseconds_lambda0.read && this.IconCompatParcelizer == _set_durationinmilliseconds_lambda0.IconCompatParcelizer && this.serializer == (s = _set_durationinmilliseconds_lambda0.serializer) && this.write == s && Objects.equals(this.RatingCompat, _set_durationinmilliseconds_lambda0.RatingCompat) && this.MediaSessionCompatQueueItem == _set_durationinmilliseconds_lambda0.MediaSessionCompatQueueItem && this.MediaBrowserCompatMediaItem == _set_durationinmilliseconds_lambda0.MediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("StationaryMetadataEntry{latitude=");
        sb.append(this.read);
        sb.append(", longitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accuracy=");
        sb.append((int) this.serializer);
        sb.append(", altitude=");
        sb.append((int) this.write);
        sb.append(", wifiInfo=");
        sb.append(this.RatingCompat);
        sb.append(", venueSignificance=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", venueType=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", uniqueId='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "'}");
    }
}
