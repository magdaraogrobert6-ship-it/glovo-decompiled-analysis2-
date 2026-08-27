package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.geofence.states.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "GeofenceStateCache", componentName = "GeofenceStateCache")
public class isConversationalPush {
    private final com.sentiance.sdk.util.c read;
    private final parseLonglambda0 write;

    public isConversationalPush(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        this.read = cVar;
        this.write = parselonglambda0;
    }

    public final setConversationShortcutId serializer(setCampaignId setcampaignid) {
        com.sentiance.sdk.util.c cVar = this.read;
        String strWrite = cVar.write("current_state_type", (String) null);
        String strWrite2 = cVar.write("current_state", (String) null);
        Type typeFromName = strWrite != null ? Type.fromName(strWrite) : null;
        JSONObject jSONObject = new JSONObject();
        parseLonglambda0 parselonglambda0 = this.write;
        if (typeFromName == null || strWrite2 == null) {
            parselonglambda0.IconCompatParcelizer("Cached state is null. Defaulting to lost state.", new Object[0]);
            typeFromName = Type.LOST;
        } else {
            try {
                jSONObject = new JSONObject(strWrite2);
            } catch (JSONException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to deserialize cached state. Defaulting to stopped state.", new Object[0]);
                typeFromName = Type.LOST;
            }
        }
        int i = isNewlyReceivedPushStory.IconCompatParcelizer[typeFromName.ordinal()];
        if (i == 1) {
            return new setContext(setcampaignid, jSONObject);
        }
        if (i == 2) {
            return new setCustomNotificationId(setcampaignid, jSONObject);
        }
        if (i != 3) {
            return i != 4 ? new setDeeplink(setcampaignid, jSONObject) : new setContentCardSyncUserId(setcampaignid, jSONObject);
        }
        return new setFlushMinMinutes(setcampaignid, jSONObject);
    }

    public final void write(setConversationShortcutId setconversationshortcutid) {
        com.sentiance.sdk.util.c cVar = this.read;
        try {
            cVar.RemoteActionCompatParcelizer("current_state_type", setconversationshortcutid.serializer().getName());
            cVar.RemoteActionCompatParcelizer("current_state", setconversationshortcutid.write());
        } catch (JSONException e) {
            this.write.IconCompatParcelizer(false, e, "Failed to save current state", new Object[0]);
        }
    }

    public final void read() {
        this.read.read();
    }
}
