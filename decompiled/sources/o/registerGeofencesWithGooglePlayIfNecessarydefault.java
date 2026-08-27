package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class registerGeofencesWithGooglePlayIfNecessarydefault implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaSessionCompatQueueItem;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("userid", this.write);
        jSONObject.putOpt("token", this.IconCompatParcelizer);
        jSONObject.putOpt("refresh_token", this.serializer);
        jSONObject.putOpt(com.braze.models.Banner.EXPIRATION, this.read);
        jSONObject.putOpt("person_id", this.RatingCompat);
        jSONObject.putOpt("third_party_linked", Boolean.valueOf(this.MediaBrowserCompatMediaItem));
        jSONObject.putOpt("refresh_token_expires_at", this.RemoteActionCompatParcelizer);
        jSONObject.putOpt("is_complete", Boolean.valueOf(this.MediaSessionCompatQueueItem));
        return jSONObject.toString();
    }

    public registerGeofencesWithGooglePlayIfNecessarydefault(registerGeofencesWithGooglePlayIfNecessarydefault registergeofenceswithgoogleplayifnecessarydefault) {
        this.write = registergeofenceswithgoogleplayifnecessarydefault.write;
        this.IconCompatParcelizer = registergeofenceswithgoogleplayifnecessarydefault.IconCompatParcelizer;
        this.serializer = registergeofenceswithgoogleplayifnecessarydefault.serializer;
        this.read = registergeofenceswithgoogleplayifnecessarydefault.read;
        this.RatingCompat = registergeofenceswithgoogleplayifnecessarydefault.RatingCompat;
        this.MediaBrowserCompatMediaItem = registergeofenceswithgoogleplayifnecessarydefault.MediaBrowserCompatMediaItem;
        this.RemoteActionCompatParcelizer = registergeofenceswithgoogleplayifnecessarydefault.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = registergeofenceswithgoogleplayifnecessarydefault.MediaSessionCompatQueueItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthInfo{installId='");
        sb.append(this.write);
        sb.append("', token='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', refresh_token='");
        sb.append(this.serializer);
        sb.append("', expires_at='");
        sb.append(this.read);
        sb.append("', personId='");
        sb.append(this.RatingCompat);
        sb.append("', thirdPartyLinked='");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append("', refreshTokenExpiresAt='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', isComplete='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, "'}");
    }

    public registerGeofencesWithGooglePlayIfNecessarydefault() {
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.write = jSONObject.getString("userid");
        this.IconCompatParcelizer = jSONObject.getString("token");
        this.serializer = jSONObject.getString("refresh_token");
        this.read = jSONObject.getString(com.braze.models.Banner.EXPIRATION);
        this.RatingCompat = jSONObject.optString("person_id", null);
        this.MediaBrowserCompatMediaItem = jSONObject.optBoolean("third_party_linked", false);
        this.RemoteActionCompatParcelizer = jSONObject.optString("refresh_token_expires_at", null);
        this.MediaSessionCompatQueueItem = jSONObject.optBoolean("is_complete", true);
    }
}
