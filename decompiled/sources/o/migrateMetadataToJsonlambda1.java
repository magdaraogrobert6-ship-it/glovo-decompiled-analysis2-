package o;

import android.location.Location;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class migrateMetadataToJsonlambda1 implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private float IconCompatParcelizer;
    private String MediaBrowserCompatMediaItem;
    private float MediaDescriptionCompat;
    private long MediaSessionCompatQueueItem;
    private float RemoteActionCompatParcelizer;
    private float read;
    private float serializer;
    private float write;

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.IconCompatParcelizer = (float) jSONObject.getDouble("latitude");
        this.write = (float) jSONObject.getDouble("longitude");
        this.read = (float) jSONObject.getDouble("speed");
        this.serializer = (float) jSONObject.getDouble(com.braze.models.IBrazeLocation.ALTITUDE);
        this.RemoteActionCompatParcelizer = (float) jSONObject.getDouble("bearing");
        this.MediaDescriptionCompat = (float) jSONObject.getDouble("accuracy");
        this.MediaSessionCompatQueueItem = jSONObject.getLong(CrashHianalyticsData.TIME);
        this.MediaBrowserCompatMediaItem = jSONObject.getString("provider");
    }

    public final Location serializer() {
        Location location = new Location(this.MediaBrowserCompatMediaItem);
        location.setLatitude(this.IconCompatParcelizer);
        location.setLongitude(this.write);
        location.setProvider(this.MediaBrowserCompatMediaItem);
        location.setTime(this.MediaSessionCompatQueueItem);
        float f = this.read;
        if (f >= 0.0f) {
            location.setSpeed(f);
        }
        float f2 = this.serializer;
        if (f2 >= 0.0f) {
            location.setAltitude(f2);
        }
        float f3 = this.RemoteActionCompatParcelizer;
        if (f3 >= 0.0f) {
            location.setBearing(f3);
        }
        float f4 = this.MediaDescriptionCompat;
        if (f4 >= 0.0f) {
            location.setAccuracy(f4);
        }
        return location;
    }

    public migrateMetadataToJsonlambda1(Location location) {
        this.read = -1.0f;
        this.serializer = -1.0f;
        this.RemoteActionCompatParcelizer = -1.0f;
        this.MediaDescriptionCompat = -1.0f;
        this.IconCompatParcelizer = (float) location.getLatitude();
        this.write = (float) location.getLongitude();
        this.read = location.hasSpeed() ? location.getSpeed() : -1.0f;
        this.serializer = (float) (location.hasAltitude() ? location.getAltitude() : -1.0d);
        this.RemoteActionCompatParcelizer = location.hasBearing() ? location.getBearing() : -1.0f;
        this.MediaDescriptionCompat = location.hasAccuracy() ? location.getAccuracy() : -1.0f;
        this.MediaSessionCompatQueueItem = location.getTime();
        this.MediaBrowserCompatMediaItem = location.getProvider();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{lat=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", lon=");
        sb.append(this.write);
        sb.append(", time=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", provider='");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append("', acc=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", speed=");
        sb.append(this.read);
        sb.append(", alt=");
        sb.append(this.serializer);
        sb.append(", bearing=");
        return MediaSessionCompatQueueItem.serializer(sb, this.RemoteActionCompatParcelizer, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        migrateMetadataToJsonlambda1 migratemetadatatojsonlambda1 = (migrateMetadataToJsonlambda1) obj;
        if (Float.compare(migratemetadatatojsonlambda1.IconCompatParcelizer, this.IconCompatParcelizer) == 0 && Float.compare(migratemetadatatojsonlambda1.write, this.write) == 0 && Float.compare(migratemetadatatojsonlambda1.read, this.read) == 0 && Float.compare(migratemetadatatojsonlambda1.serializer, this.serializer) == 0 && Float.compare(migratemetadatatojsonlambda1.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer) == 0 && Float.compare(migratemetadatatojsonlambda1.MediaDescriptionCompat, this.MediaDescriptionCompat) == 0 && this.MediaSessionCompatQueueItem == migratemetadatatojsonlambda1.MediaSessionCompatQueueItem) {
            return this.MediaBrowserCompatMediaItem.equals(migratemetadatatojsonlambda1.MediaBrowserCompatMediaItem);
        }
        return false;
    }

    public final int hashCode() {
        float f = this.IconCompatParcelizer;
        int iFloatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        float f2 = this.write;
        int iFloatToIntBits2 = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        float f3 = this.read;
        int iFloatToIntBits3 = f3 != 0.0f ? Float.floatToIntBits(f3) : 0;
        float f4 = this.serializer;
        int iFloatToIntBits4 = f4 != 0.0f ? Float.floatToIntBits(f4) : 0;
        float f5 = this.RemoteActionCompatParcelizer;
        int iFloatToIntBits5 = f5 != 0.0f ? Float.floatToIntBits(f5) : 0;
        float f6 = this.MediaDescriptionCompat;
        int iFloatToIntBits6 = f6 != 0.0f ? Float.floatToIntBits(f6) : 0;
        long j = this.MediaSessionCompatQueueItem;
        return this.MediaBrowserCompatMediaItem.hashCode() + (((((((((((((iFloatToIntBits * 31) + iFloatToIntBits2) * 31) + iFloatToIntBits3) * 31) + iFloatToIntBits4) * 31) + iFloatToIntBits5) * 31) + iFloatToIntBits6) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latitude", this.IconCompatParcelizer);
        jSONObject.put("longitude", this.write);
        jSONObject.put("speed", this.read);
        jSONObject.put(com.braze.models.IBrazeLocation.ALTITUDE, this.serializer);
        jSONObject.put("bearing", this.RemoteActionCompatParcelizer);
        jSONObject.put("accuracy", this.MediaDescriptionCompat);
        jSONObject.put(CrashHianalyticsData.TIME, this.MediaSessionCompatQueueItem);
        jSONObject.put("provider", this.MediaBrowserCompatMediaItem);
        return jSONObject.toString();
    }

    public migrateMetadataToJsonlambda1() {
        this.read = -1.0f;
        this.serializer = -1.0f;
        this.RemoteActionCompatParcelizer = -1.0f;
        this.MediaDescriptionCompat = -1.0f;
    }
}
