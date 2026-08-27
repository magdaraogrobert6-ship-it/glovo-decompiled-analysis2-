package o;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.geofence.states.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setConversationShortcutId implements migrateTriggersReeligibilityToJsonlambda0 {
    private final Location IconCompatParcelizer;
    private boolean RatingCompat;
    private Long RemoteActionCompatParcelizer;
    private final Type read;
    private final setCampaignId serializer;
    private Integer write;

    public final Location IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final setCampaignId MediaBrowserCompatMediaItem() {
        return this.serializer;
    }

    public long MediaMetadataCompat() {
        return -1L;
    }

    public final boolean RatingCompat() {
        return this.RatingCompat;
    }

    public abstract void RemoteActionCompatParcelizer();

    public abstract setConversationShortcutId read(Integer num, Location location);

    public final void read() {
        this.RatingCompat = true;
    }

    public abstract Type serializer();

    public abstract setConversationShortcutId serializer(Integer num, Location location);

    public final void serializer(Integer num) {
        this.write = num;
    }

    public abstract void serializer(setCampaignId setcampaignid);

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Type type = this.read;
        if (type != null) {
            jSONObject.put("previous_state_type", type.getName());
        }
        Location location = this.IconCompatParcelizer;
        if (location != null) {
            jSONObject.put("location", new JSONObject(new migrateMetadataToJsonlambda1(location).write()));
        }
        Integer num = this.write;
        if (num != null) {
            jSONObject.put("geofence_id", num.intValue());
        }
        Long l = this.RemoteActionCompatParcelizer;
        if (l != null) {
            jSONObject.put("start_time", l.longValue());
        }
        return jSONObject.toString();
    }

    public setConversationShortcutId(setCampaignId setcampaignid, JSONObject jSONObject) {
        this.serializer = setcampaignid;
        try {
            if (jSONObject.has("previous_state_type")) {
                this.read = Type.fromName(jSONObject.getString("previous_state_type"));
            }
            if (jSONObject.has("location")) {
                migrateMetadataToJsonlambda1 migratemetadatatojsonlambda1 = new migrateMetadataToJsonlambda1();
                migratemetadatatojsonlambda1.RemoteActionCompatParcelizer(jSONObject.getString("location"));
                this.IconCompatParcelizer = migratemetadatatojsonlambda1.serializer();
            }
            if (jSONObject.has("geofence_id")) {
                this.write = Integer.valueOf(jSONObject.getInt("geofence_id"));
            }
            if (jSONObject.has("start_time")) {
                this.RemoteActionCompatParcelizer = Long.valueOf(jSONObject.getLong("start_time"));
            }
        } catch (JSONException e) {
            this.serializer.MediaMetadataCompat().IconCompatParcelizer(false, e, "Failed to construct State object", new Object[0]);
        }
    }

    public setConversationShortcutId MediaSessionCompatQueueItem() {
        if (MediaMetadataCompat() <= 0) {
            return null;
        }
        setCampaignId setcampaignid = this.serializer;
        return setcampaignid.write().r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() ? new setContentCardSyncUserId(setcampaignid, serializer(), 2) : setcampaignid.MediaSessionCompatToken();
    }

    public final void serializer(Context context) {
        Long l = this.RemoteActionCompatParcelizer;
        setCampaignId setcampaignid = this.serializer;
        if (l == null) {
            setcampaignid.MediaSessionCompatQueueItem().getClass();
            this.RemoteActionCompatParcelizer = Long.valueOf(System.currentTimeMillis());
        }
        RemoteActionCompatParcelizer();
        if (MediaMetadataCompat() == -1 || MediaMetadataCompat() <= 0) {
            return;
        }
        getShouldRefreshBanners.read(context, setcampaignid.RatingCompat(), MediaMetadataCompat());
    }

    public final boolean write(Location location) {
        this.serializer.MediaSessionCompatQueueItem().getClass();
        return location.getTime() > System.currentTimeMillis() - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    }

    public final void write(setCampaignId setcampaignid, String str, Object... objArr) {
        parseLonglambda0 parselonglambda0MediaMetadataCompat = setcampaignid.MediaMetadataCompat();
        java.util.Locale locale = java.util.Locale.ENGLISH;
        parselonglambda0MediaMetadataCompat.IconCompatParcelizer(Type.LOST.getName() + ": " + str, objArr);
    }

    public final boolean write(Integer num) {
        return (num == null || this.write == null || num.intValue() != this.write.intValue()) ? false : true;
    }

    public final boolean IconCompatParcelizer(long j) {
        return j > this.RemoteActionCompatParcelizer.longValue();
    }

    public setConversationShortcutId(setCampaignId setcampaignid, Type type, Location location, Integer num) {
        this.read = type;
        this.serializer = setcampaignid;
        this.IconCompatParcelizer = location;
        this.write = num;
    }
}
