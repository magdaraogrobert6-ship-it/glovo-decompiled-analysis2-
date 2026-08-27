package o;

import android.location.Location;
import com.sentiance.sdk.geofence.states.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class setCustomNotificationId extends setConversationShortcutId {
    public setCustomNotificationId(setCampaignId setcampaignid, JSONObject jSONObject) {
        super(setcampaignid, jSONObject);
    }

    @Override // o.setConversationShortcutId
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId read(Integer num, Location location) {
        return null;
    }

    @Override // o.setConversationShortcutId
    public final Type serializer() {
        return Type.WAITING_DWELL;
    }

    @Override // o.setConversationShortcutId
    public final void serializer(setCampaignId setcampaignid) {
    }

    public setCustomNotificationId(setCampaignId setcampaignid, Type type, Location location, Integer num) {
        super(setcampaignid, type, location, num);
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId serializer(Integer num, Location location) {
        if (!MediaBrowserCompatMediaItem().MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer()) {
            MediaBrowserCompatMediaItem().MediaMetadataCompat().IconCompatParcelizer("Main geofence doesn't exit.", new Object[0]);
            return new setContentCardSyncUserId(MediaBrowserCompatMediaItem(), Type.WAITING_DWELL, 4);
        }
        if (MediaBrowserCompatMediaItem().MediaSessionCompatResultReceiverWrapper().write().RemoteActionCompatParcelizer <= 100.0f || write(location)) {
            return (MediaBrowserCompatMediaItem().read(location) || !write(num)) ? new setContext(MediaBrowserCompatMediaItem(), Type.WAITING_DWELL, location, num) : new setFlushMinMinutes(MediaBrowserCompatMediaItem(), Type.WAITING_DWELL, location, num);
        }
        MediaBrowserCompatMediaItem().MediaMetadataCompat().IconCompatParcelizer("Triggering location is old.", new Object[0]);
        return new setContentCardSyncUserId(MediaBrowserCompatMediaItem(), Type.WAITING_DWELL, 4);
    }
}
