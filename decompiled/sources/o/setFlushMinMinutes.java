package o;

import android.location.Location;
import com.sentiance.sdk.geofence.states.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class setFlushMinMinutes extends setConversationShortcutId {
    public setFlushMinMinutes(setCampaignId setcampaignid, JSONObject jSONObject) {
        super(setcampaignid, jSONObject);
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId read(Integer num, Location location) {
        return null;
    }

    @Override // o.setConversationShortcutId
    public final Type serializer() {
        return Type.WAITING_EXIT;
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId serializer(Integer num, Location location) {
        return null;
    }

    @Override // o.setConversationShortcutId
    public final void serializer(setCampaignId setcampaignid) {
    }

    public setFlushMinMinutes(setCampaignId setcampaignid, Type type, Location location, Integer num) {
        super(setcampaignid, type, location, num);
    }

    @Override // o.setConversationShortcutId
    public final void RemoteActionCompatParcelizer() {
        if (IconCompatParcelizer() == null || RatingCompat()) {
            return;
        }
        MediaBrowserCompatMediaItem().serializer(IconCompatParcelizer());
    }
}
