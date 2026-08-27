package o;

import android.location.Location;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getSummaryText implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    public double IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int RatingCompat;
    public float RemoteActionCompatParcelizer;
    public double read;
    public int serializer;
    public String write;

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.serializer = jSONObject.getInt("correlation_id");
        this.write = jSONObject.getString("request_id");
        this.read = jSONObject.getDouble("latitude");
        this.IconCompatParcelizer = jSONObject.getDouble("longitude");
        this.RemoteActionCompatParcelizer = (float) jSONObject.getDouble(com.braze.models.BrazeGeofence.RADIUS_METERS);
        this.MediaMetadataCompat = jSONObject.getBoolean("trigger_enter");
        this.MediaBrowserCompatMediaItem = jSONObject.getBoolean("trigger_dwell");
        this.MediaSessionCompatQueueItem = jSONObject.getBoolean("trigger_exit");
        this.RatingCompat = jSONObject.getInt("loitering_delay");
        this.MediaDescriptionCompat = jSONObject.has(RemoteMessageConst.Notification.TAG) ? jSONObject.getString(RemoteMessageConst.Notification.TAG) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaMetadataCompat ? "en|" : "");
        sb.append(this.MediaBrowserCompatMediaItem ? "dw|" : "");
        sb.append(this.MediaSessionCompatQueueItem ? "ex|" : "");
        String string = sb.toString();
        if (string.length() > 2) {
            string = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 0, string);
        }
        return "SimpleGeofence{correlationId='" + this.serializer + "'requestId='" + this.write + "', location=" + this.read + "," + this.IconCompatParcelizer + ", radius=" + this.RemoteActionCompatParcelizer + ", delay=" + this.RatingCompat + ", tag=" + this.MediaDescriptionCompat + ", transitions=" + string + '}';
    }

    public getSummaryText(int i, String str, double d, double d2, float f, String str2, boolean z, boolean z2, boolean z3, int i2) {
        this.serializer = i;
        this.write = str;
        this.read = d;
        this.IconCompatParcelizer = d2;
        this.RemoteActionCompatParcelizer = f;
        this.MediaMetadataCompat = z;
        this.MediaBrowserCompatMediaItem = z2;
        this.MediaSessionCompatQueueItem = z3;
        this.RatingCompat = i2;
        this.MediaDescriptionCompat = str2;
    }

    public final Location serializer() {
        Location location = new Location("");
        location.setLatitude(this.read);
        location.setLongitude(this.IconCompatParcelizer);
        location.setAccuracy(this.RemoteActionCompatParcelizer);
        return location;
    }

    public getSummaryText(int i, String str, double d, double d2, float f) {
        this(i, str, d, d2, f, null, true, true, true, 180);
    }

    public getSummaryText(int i, String str, double d, double d2, float f, String str2) {
        this(i, str, d, d2, f, str2, true, true, true, 180);
    }

    public getSummaryText() {
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("correlation_id", this.serializer);
        jSONObject.put("request_id", this.write);
        jSONObject.put("latitude", this.read);
        jSONObject.put("longitude", this.IconCompatParcelizer);
        jSONObject.put(com.braze.models.BrazeGeofence.RADIUS_METERS, this.RemoteActionCompatParcelizer);
        jSONObject.put("trigger_enter", this.MediaMetadataCompat);
        jSONObject.put("trigger_dwell", this.MediaBrowserCompatMediaItem);
        jSONObject.put("trigger_exit", this.MediaSessionCompatQueueItem);
        jSONObject.put("loitering_delay", this.RatingCompat);
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            jSONObject.put(RemoteMessageConst.Notification.TAG, str);
        }
        return jSONObject.toString();
    }
}
