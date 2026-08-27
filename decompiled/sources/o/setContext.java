package o;

import android.location.Location;
import com.sentiance.sdk.geofence.states.Type;
import com.sentiance.sdk.util.Optional;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class setContext extends setConversationShortcutId {
    private final boolean RemoteActionCompatParcelizer;

    @Override // o.setConversationShortcutId
    public final Type serializer() {
        return Type.WAITING_ENTER;
    }

    @Override // o.setConversationShortcutId
    public final long MediaMetadataCompat() {
        Long l = MediaBrowserCompatMediaItem().MediaSessionCompatResultReceiverWrapper().read() ? null : 7200000L;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId MediaSessionCompatQueueItem() {
        Optional<setConfigurationProvider> optionalMediaSessionCompatResultReceiverWrapper = MediaBrowserCompatMediaItem().MediaSessionCompatResultReceiverWrapper();
        if (!optionalMediaSessionCompatResultReceiverWrapper.IconCompatParcelizer() || optionalMediaSessionCompatResultReceiverWrapper.write().RemoteActionCompatParcelizer < 5000.0f) {
            return super.MediaSessionCompatQueueItem();
        }
        MediaBrowserCompatMediaItem().MediaBrowserCompatMediaItem();
        return null;
    }

    @Override // o.setConversationShortcutId
    public final void RemoteActionCompatParcelizer() {
        Location locationIconCompatParcelizer = IconCompatParcelizer();
        if (RatingCompat() || locationIconCompatParcelizer == null) {
            return;
        }
        serializer(MediaBrowserCompatMediaItem().write(locationIconCompatParcelizer, this.RemoteActionCompatParcelizer));
    }

    public setContext(setCampaignId setcampaignid, Type type, Location location, Integer num) {
        this(setcampaignid, type, location, num, false);
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId read(Integer num, Location location) {
        if (write(num) && !MediaBrowserCompatMediaItem().write(location)) {
            return (IconCompatParcelizer(location.getTime()) && MediaBrowserCompatMediaItem().read(location)) ? new setContext(MediaBrowserCompatMediaItem(), Type.WAITING_ENTER, location, null) : new setCustomNotificationId(MediaBrowserCompatMediaItem(), Type.WAITING_ENTER, location, num);
        }
        return null;
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId serializer(Integer num, Location location) {
        if (write(num)) {
            return new setFlushMinMinutes(MediaBrowserCompatMediaItem(), Type.WAITING_ENTER, location, num);
        }
        return null;
    }

    public setContext(setCampaignId setcampaignid, JSONObject jSONObject) {
        super(setcampaignid, jSONObject);
        this.RemoteActionCompatParcelizer = false;
    }

    public setContext(setCampaignId setcampaignid, Type type, Location location, Integer num, boolean z) {
        super(setcampaignid, type, location, num);
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // o.setConversationShortcutId
    public final void serializer(setCampaignId setcampaignid) {
        setcampaignid.MediaDescriptionCompat();
    }
}
