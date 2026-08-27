package o;

import android.location.Location;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.geofence.states.Type;

/* JADX INFO: loaded from: classes3.dex */
final class isPushStory extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ getUseWebView IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isPushStory(getUseWebView getusewebview, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "GeofenceStateManager");
        this.IconCompatParcelizer = getusewebview;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (controlMessage == ControlMessage.GEOFENCE_TRANSITION_TIMEOUT) {
            synchronized (this) {
                this.IconCompatParcelizer.read("Timeout", new Object[0]);
                setConversationShortcutId setconversationshortcutidMediaSessionCompatQueueItem = this.IconCompatParcelizer.PlaybackStateCompat.MediaSessionCompatQueueItem();
                if (setconversationshortcutidMediaSessionCompatQueueItem != null) {
                    this.IconCompatParcelizer.IconCompatParcelizer(setconversationshortcutidMediaSessionCompatQueueItem);
                }
            }
            return;
        }
        if (controlMessage == ControlMessage.GEOFENCE_STATE_RESET) {
            boolean z = obj instanceof Location;
            getUseWebView getusewebview = this.IconCompatParcelizer;
            if (!z) {
                getusewebview.IconCompatParcelizer(new setContentCardSyncUserId(getusewebview.PlaybackStateCompatCustomAction, this.IconCompatParcelizer.PlaybackStateCompat.serializer(), 4));
                return;
            }
            getusewebview.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Received a reset request with a location", new Object[0]);
            getUseWebView getusewebview2 = this.IconCompatParcelizer;
            getusewebview2.IconCompatParcelizer(new setContext(getusewebview2.PlaybackStateCompatCustomAction, this.IconCompatParcelizer.PlaybackStateCompat.serializer(), (Location) obj, null, false));
            return;
        }
        if (controlMessage == ControlMessage.GEOFENCE_STATE_STOP) {
            if (this.IconCompatParcelizer.RemoteActionCompatParcelizer(Type.STOPPED)) {
                return;
            }
            getUseWebView getusewebview3 = this.IconCompatParcelizer;
            getusewebview3.IconCompatParcelizer(new setDeeplink(getusewebview3.PlaybackStateCompatCustomAction, this.IconCompatParcelizer.PlaybackStateCompat.serializer()));
            return;
        }
        if (controlMessage == ControlMessage.ENSURE_STATIONARY_GEOFENCE && this.IconCompatParcelizer.MediaMetadataCompat.serializer("geofence").read() && (obj instanceof Location)) {
            this.IconCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer("Stationary, but the main geofence is absent.", new Object[0]);
            getUseWebView getusewebview4 = this.IconCompatParcelizer;
            getusewebview4.IconCompatParcelizer(new setContext(getusewebview4.PlaybackStateCompatCustomAction, this.IconCompatParcelizer.PlaybackStateCompat.serializer(), (Location) obj, null, false));
        }
    }
}
