package o;

import android.location.Location;
import com.sentiance.sdk.geofence.states.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class setDeeplink extends setConversationShortcutId {
    public setDeeplink(setCampaignId setcampaignid, Type type) {
        super(setcampaignid, type, null, null);
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId read(Integer num, Location location) {
        return null;
    }

    @Override // o.setConversationShortcutId
    public final Type serializer() {
        return Type.STOPPED;
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId serializer(Integer num, Location location) {
        return null;
    }

    @Override // o.setConversationShortcutId
    public final void serializer(setCampaignId setcampaignid) {
    }

    @Override // o.setConversationShortcutId, o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        return new JSONObject().toString();
    }

    public setDeeplink(setCampaignId setcampaignid, JSONObject jSONObject) {
        super(setcampaignid, jSONObject);
    }

    @Override // o.setConversationShortcutId
    public final void RemoteActionCompatParcelizer() {
        if (RatingCompat()) {
            return;
        }
        MediaBrowserCompatMediaItem().ParcelableVolumeInfo();
    }
}
