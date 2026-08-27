package o;

import android.annotation.SuppressLint;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class getCampaignIdannotations implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private String IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private int MediaDescriptionCompat;
    private ClassifiedTransportMode MediaMetadataCompat;
    private Long MediaSessionCompatQueueItem;
    private String PlaybackStateCompat;
    private Integer RatingCompat;
    private String RemoteActionCompatParcelizer;
    private String read;
    private int serializer;
    private long write;

    public final String IconCompatParcelizer() {
        return this.PlaybackStateCompat;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.read;
    }

    public final long MediaDescriptionCompat() {
        return this.write;
    }

    public final Integer MediaMetadataCompat() {
        return this.RatingCompat;
    }

    public final int MediaSessionCompatQueueItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final ClassifiedTransportMode PlaybackStateCompatCustomAction() {
        return this.MediaMetadataCompat;
    }

    public final int RatingCompat() {
        return this.serializer;
    }

    public final Long RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    @SuppressLint
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.RemoteActionCompatParcelizer = jSONObject.getString("session_id");
        this.write = jSONObject.getLong("start_time");
        this.serializer = jSONObject.getInt("start_timezone");
        this.read = jSONObject.getString("start_timezone_id");
        this.IconCompatParcelizer = jSONObject.getString("compression_algorithm");
        this.MediaMetadataCompat = ClassifiedTransportMode.valueOf(jSONObject.getString("transport_mode"));
        this.MediaBrowserCompatMediaItem = jSONObject.getInt("location_count");
        this.MediaDescriptionCompat = jSONObject.getInt("accel_sample_count");
        if (jSONObject.has("end_time")) {
            this.MediaSessionCompatQueueItem = Long.valueOf(jSONObject.getLong("end_time"));
        }
        if (jSONObject.has("end_timezone")) {
            this.RatingCompat = Integer.valueOf(jSONObject.getInt("end_timezone"));
        }
        if (jSONObject.has("end_timezone_id")) {
            this.PlaybackStateCompat = jSONObject.getString("end_timezone_id");
        }
    }

    public getCampaignIdannotations(String str, long j, int i, String str2, ClassifiedTransportMode classifiedTransportMode, Long l, Integer num) {
        this.RemoteActionCompatParcelizer = str;
        this.write = j;
        this.serializer = i;
        this.read = str2;
        this.IconCompatParcelizer = "";
        this.MediaMetadataCompat = classifiedTransportMode;
        this.MediaSessionCompatQueueItem = l;
        this.RatingCompat = num;
    }

    public final void serializer() {
        this.MediaBrowserCompatMediaItem++;
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer = "gzip";
    }

    public final int read() {
        return this.MediaDescriptionCompat;
    }

    public getCampaignIdannotations() {
    }

    public final void serializer(int i) {
        this.MediaDescriptionCompat += i;
    }

    public final void read(int i, long j, String str) {
        this.MediaSessionCompatQueueItem = Long.valueOf(j);
        this.RatingCompat = Integer.valueOf(i);
        this.PlaybackStateCompat = str;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_id", this.RemoteActionCompatParcelizer);
        jSONObject.put("start_time", this.write);
        jSONObject.put("start_timezone", this.serializer);
        jSONObject.put("start_timezone_id", this.read);
        jSONObject.put("compression_algorithm", this.IconCompatParcelizer);
        jSONObject.put("transport_mode", this.MediaMetadataCompat.name());
        jSONObject.put("location_count", this.MediaBrowserCompatMediaItem);
        jSONObject.put("accel_sample_count", this.MediaDescriptionCompat);
        jSONObject.put("accel_data_format", "binary: <x:float32><y:float32><z:float32><timestamp_millis:i64><x::float32>...");
        jSONObject.put("loc_data_format", "json");
        jSONObject.put(HianalyticsBaseData.SDK_VERSION, "6.27.1");
        Long l = this.MediaSessionCompatQueueItem;
        if (l != null) {
            jSONObject.put("end_time", l);
        }
        Integer num = this.RatingCompat;
        if (num != null) {
            jSONObject.put("end_timezone", num);
        }
        String str = this.PlaybackStateCompat;
        if (str != null) {
            jSONObject.put("end_timezone_id", str);
        }
        return jSONObject.toString();
    }
}
