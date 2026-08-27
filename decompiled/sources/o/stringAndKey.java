package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.EventUploadResult;
import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "OnDemandLogFulfillmentService")
public class stringAndKey implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final parseLonglambda0 IconCompatParcelizer;
    private final parseNonBlankStringlambda0 MediaBrowserCompatMediaItem;
    private final BrazeNotificationPayloadConversationMessage MediaMetadataCompat;
    private r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 MediaSessionCompatToken;
    private boolean ParcelableVolumeInfo;
    private d0$$ExternalSyntheticLambda0 PlaybackStateCompatCustomAction;
    private final forJsonPutlambda0 RatingCompat;
    private final getBitmapUrl RemoteActionCompatParcelizer;
    private final setStoryPageId read;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 serializer;
    private final readandroid_sdk_base_release write;
    private final Object MediaSessionCompatQueueItem = new Object();
    private RemoteActionCompatParcelizer MediaSessionCompatResultReceiverWrapper = null;
    private final LinkedList MediaDescriptionCompat = new LinkedList();

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    public static void MediaDescriptionCompat(stringAndKey stringandkey) {
        stringandkey.serializer.read();
        stringandkey.write.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(26, stringandkey));
    }

    private void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        boolean z;
        synchronized (this.MediaSessionCompatQueueItem) {
            remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) this.MediaDescriptionCompat.poll();
            this.MediaSessionCompatResultReceiverWrapper = remoteActionCompatParcelizer;
            z = remoteActionCompatParcelizer == null;
        }
        if (z) {
            d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0 = this.PlaybackStateCompatCustomAction;
            if (d0__externalsyntheticlambda0 != null) {
                d0__externalsyntheticlambda0.IconCompatParcelizer();
            }
            synchronized (this.MediaSessionCompatQueueItem) {
                this.ParcelableVolumeInfo = false;
                this.PlaybackStateCompatCustomAction = null;
            }
            return;
        }
        this.IconCompatParcelizer.IconCompatParcelizer(String.format("Fulfilling request %s [from %s to %s]", remoteActionCompatParcelizer.read(), this.MediaSessionCompatResultReceiverWrapper.write(), this.MediaSessionCompatResultReceiverWrapper.MediaSessionCompatQueueItem()), new Object[0]);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.MediaSessionCompatResultReceiverWrapper;
        if (remoteActionCompatParcelizer2 != null) {
            if (remoteActionCompatParcelizer2.IconCompatParcelizer()) {
                this.MediaBrowserCompatMediaItem.serializer(new getStableKey(remoteActionCompatParcelizer2.read(), "OnDemandLogFulfillmentService", remoteActionCompatParcelizer2.RemoteActionCompatParcelizer(), remoteActionCompatParcelizer2.MediaBrowserCompatMediaItem(), false, new BrazeNotificationPayloadCompanionExternalSyntheticLambda0(this, this.write)));
            } else {
                this.IconCompatParcelizer.IconCompatParcelizer("Text logs were not requested for request " + remoteActionCompatParcelizer2.read(), new Object[0]);
                remoteActionCompatParcelizer2.read = true;
                remoteActionCompatParcelizer2.IconCompatParcelizer = true;
                serializer();
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.MediaSessionCompatResultReceiverWrapper;
        if (remoteActionCompatParcelizer3 != null) {
            if (!remoteActionCompatParcelizer3.serializer().isEmpty()) {
                this.RatingCompat.RemoteActionCompatParcelizer(new getEnabledannotations(remoteActionCompatParcelizer3.read(), "OnDemandLogFulfillmentService", remoteActionCompatParcelizer3.write(), remoteActionCompatParcelizer3.MediaSessionCompatQueueItem(), remoteActionCompatParcelizer3.serializer(), new BrazeNotificationPayloadPushStoryPage(this, this.write)));
                return;
            }
            this.IconCompatParcelizer.IconCompatParcelizer("No events were requested for request " + remoteActionCompatParcelizer3.read(), new Object[0]);
            remoteActionCompatParcelizer3.RemoteActionCompatParcelizer = true;
            remoteActionCompatParcelizer3.write = true;
            serializer();
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(stringAndKey stringandkey, d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0) {
        boolean z;
        synchronized (stringandkey.MediaSessionCompatQueueItem) {
            z = true;
            if (stringandkey.ParcelableVolumeInfo) {
                stringandkey.IconCompatParcelizer.IconCompatParcelizer("Service is already polling/fulfilling requests, aborting", new Object[0]);
            } else {
                stringandkey.PlaybackStateCompatCustomAction = d0__externalsyntheticlambda0;
                stringandkey.ParcelableVolumeInfo = true;
                r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer = stringandkey.read.RemoteActionCompatParcelizer(new isBot(stringandkey), stringandkey.write);
                stringandkey.MediaSessionCompatToken = r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer;
                if (r8lambda4gsaww0uf5fhes0li0lym_jwy38RemoteActionCompatParcelizer == null) {
                    stringandkey.IconCompatParcelizer.RemoteActionCompatParcelizer("Failed to request on demand log upload requests", new Object[0]);
                    stringandkey.ParcelableVolumeInfo = false;
                    stringandkey.PlaybackStateCompatCustomAction = null;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            if (d0__externalsyntheticlambda0 != null) {
                d0__externalsyntheticlambda0.IconCompatParcelizer();
            }
            stringandkey.serializer.IconCompatParcelizer();
        }
    }

    public static /* synthetic */ void read(stringAndKey stringandkey) {
        boolean z;
        synchronized (stringandkey.MediaSessionCompatQueueItem) {
            if (stringandkey.MediaSessionCompatResultReceiverWrapper == null) {
                stringandkey.MediaSessionCompatResultReceiverWrapper = (RemoteActionCompatParcelizer) stringandkey.MediaDescriptionCompat.peek();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            stringandkey.RemoteActionCompatParcelizer();
        }
        stringandkey.serializer.IconCompatParcelizer();
    }

    private void serializer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper;
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.write;
        if (remoteActionCompatParcelizer == null) {
            this.serializer.read();
            readandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(26, this));
            return;
        }
        boolean z = remoteActionCompatParcelizer.read && remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        boolean z2 = remoteActionCompatParcelizer.IconCompatParcelizer && remoteActionCompatParcelizer.write;
        if (z) {
            this.IconCompatParcelizer.IconCompatParcelizer("Finished uploading logs and events for request " + remoteActionCompatParcelizer.read(), new Object[0]);
            if (z2) {
                this.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer.read(), remoteActionCompatParcelizer.RatingCompat(), readandroid_sdk_base_releaseVar, new d0$$ExternalSyntheticLambda0(8, this));
            }
            RemoteActionCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this.MediaSessionCompatQueueItem) {
            this.MediaDescriptionCompat.clear();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper;
            if (remoteActionCompatParcelizer != null) {
                this.MediaBrowserCompatMediaItem.IconCompatParcelizer(remoteActionCompatParcelizer.read());
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.MediaSessionCompatResultReceiverWrapper;
            if (remoteActionCompatParcelizer2 != null) {
                this.RatingCompat.write(remoteActionCompatParcelizer2.read());
            }
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = this.MediaSessionCompatToken;
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer();
                this.MediaSessionCompatToken = null;
            }
            this.MediaSessionCompatResultReceiverWrapper = null;
            this.PlaybackStateCompatCustomAction = null;
            this.ParcelableVolumeInfo = false;
        }
    }

    public static class RemoteActionCompatParcelizer extends isImportant {
        boolean IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        boolean read;
        boolean write;

        public RemoteActionCompatParcelizer(isImportant isimportant) {
            super(isimportant.read(), isimportant.write(), isimportant.MediaSessionCompatQueueItem(), isimportant.RemoteActionCompatParcelizer(), isimportant.MediaBrowserCompatMediaItem(), isimportant.RatingCompat(), isimportant.IconCompatParcelizer(), isimportant.serializer());
        }
    }

    public static void MediaSessionCompatQueueItem(stringAndKey stringandkey) {
        d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0 = stringandkey.PlaybackStateCompatCustomAction;
        if (d0__externalsyntheticlambda0 != null) {
            d0__externalsyntheticlambda0.IconCompatParcelizer();
        }
        synchronized (stringandkey.MediaSessionCompatQueueItem) {
            stringandkey.ParcelableVolumeInfo = false;
            stringandkey.PlaybackStateCompatCustomAction = null;
        }
    }

    public static void RemoteActionCompatParcelizer(stringAndKey stringandkey, getBitmapUrl.read readVar) {
        if (readVar.write && readVar.IconCompatParcelizer) {
            stringandkey.MediaMetadataCompat.read(readVar.serializer);
        }
    }

    public stringAndKey(parseLonglambda0 parselonglambda0, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, setStoryPageId setstorypageid, BrazeNotificationPayloadConversationMessage brazeNotificationPayloadConversationMessage, getBitmapUrl getbitmapurl, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, forJsonPutlambda0 forjsonputlambda0, parseNonBlankStringlambda0 parsenonblankstringlambda0) {
        this.serializer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.IconCompatParcelizer = parselonglambda0;
        this.write = readandroid_sdk_base_releaseVar;
        this.read = setstorypageid;
        this.RemoteActionCompatParcelizer = getbitmapurl;
        this.MediaMetadataCompat = brazeNotificationPayloadConversationMessage;
        this.RatingCompat = forjsonputlambda0;
        this.MediaBrowserCompatMediaItem = parsenonblankstringlambda0;
    }

    public final void write(d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0) {
        this.serializer.read();
        this.write.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 11, d0__externalsyntheticlambda0));
    }

    public static void RemoteActionCompatParcelizer(stringAndKey stringandkey, LogUploadResult logUploadResult) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = stringandkey.MediaSessionCompatResultReceiverWrapper;
        if (remoteActionCompatParcelizer == null || !logUploadResult.write().equals(remoteActionCompatParcelizer.read())) {
            return;
        }
        remoteActionCompatParcelizer.read = true;
        remoteActionCompatParcelizer.IconCompatParcelizer = logUploadResult.serializer();
        stringandkey.serializer();
    }

    public static void serializer(stringAndKey stringandkey, EventUploadResult eventUploadResult) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = stringandkey.MediaSessionCompatResultReceiverWrapper;
        if (remoteActionCompatParcelizer == null || !eventUploadResult.read().equals(remoteActionCompatParcelizer.read())) {
            return;
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer = true;
        remoteActionCompatParcelizer.write = eventUploadResult.write();
        stringandkey.serializer();
    }
}
