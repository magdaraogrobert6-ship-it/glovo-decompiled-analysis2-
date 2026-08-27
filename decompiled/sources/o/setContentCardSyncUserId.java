package o;

import android.location.Location;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.controlmessageextras.StartLocationFixRequest$Purpose;
import com.sentiance.sdk.geofence.states.Type;
import com.sentiance.sdk.services.ServiceForegroundMode;
import com.sentiance.sdk.util.Optional;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class setContentCardSyncUserId extends setConversationShortcutId {
    private final component4android_sdk_base_release IconCompatParcelizer;
    private boolean MediaBrowserCompatMediaItem;
    private final setConversationalPush MediaDescriptionCompat;
    private final ConfigurationManager MediaMetadataCompat;
    private final int MediaSessionCompatQueueItem;
    private final setContentCardSyncData RatingCompat;
    private final getAnalyticsEnabledEnterannotations RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final getVerticalAccuracy write;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface write {
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId read(Integer num, Location location) {
        return null;
    }

    @Override // o.setConversationShortcutId
    public final Type serializer() {
        return Type.LOST;
    }

    @Override // o.setConversationShortcutId
    public final setConversationShortcutId serializer(Integer num, Location location) {
        return null;
    }

    public setContentCardSyncUserId(setCampaignId setcampaignid, JSONObject jSONObject) {
        super(setcampaignid, jSONObject);
        try {
            if (jSONObject.has("reason")) {
                this.MediaSessionCompatQueueItem = jSONObject.getInt("reason");
            }
        } catch (JSONException e) {
            setcampaignid.MediaMetadataCompat().IconCompatParcelizer(false, e, "Failed to deserialize LostState", new Object[0]);
        }
        this.RemoteActionCompatParcelizer = setcampaignid.RatingCompat();
        this.read = setcampaignid.read();
        this.IconCompatParcelizer = setcampaignid.PlaybackStateCompatCustomAction();
        this.write = setcampaignid.serializer();
        this.serializer = setcampaignid.MediaSessionCompatQueueItem();
        this.MediaMetadataCompat = setcampaignid.write();
        this.RatingCompat = new setContentCardSyncData(this, setcampaignid.RemoteActionCompatParcelizer());
        this.MediaDescriptionCompat = new setConversationalPush(this, setcampaignid.RemoteActionCompatParcelizer());
    }

    public static Location write(setContentCardSyncUserId setcontentcardsyncuserid) {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4;
        component4android_sdk_base_release component4android_sdk_base_releaseVar = setcontentcardsyncuserid.IconCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy = setcontentcardsyncuserid.write;
        setcontentcardsyncuserid.serializer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Optional<getCooldownEnterSeconds.read> optionalRemoteActionCompatParcelizer = setcontentcardsyncuserid.read.RemoteActionCompatParcelizer(Arrays.asList(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class), (Long) null, false);
        if (optionalRemoteActionCompatParcelizer.IconCompatParcelizer()) {
            getCooldownEnterSeconds.read readVarWrite = optionalRemoteActionCompatParcelizer.write();
            if (readVarWrite.serializer() >= jCurrentTimeMillis - 300000) {
                Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(readVarWrite, getverticalaccuracy);
                if (clsIconCompatParcelizer == r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU.class) {
                    r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 = readVarWrite.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                    if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 != null && (r8lambdazeccixubf3xvz58yt5bojkwhdu = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.serializer.fullyDrawnReporter_delegatelambda0) != null && (brazeCompanionExternalSyntheticLambda4 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer) != null) {
                        return getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                    }
                } else if (clsIconCompatParcelizer == r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class && (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVarWrite.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar)) != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                    return getVerticalAccuracy.write(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer);
                }
            }
        }
        return null;
    }

    @Override // o.setConversationShortcutId
    public final void RemoteActionCompatParcelizer() {
        if (!MediaBrowserCompatMediaItem().IconCompatParcelizer().MediaBrowserCompatMediaItem()) {
            write(MediaBrowserCompatMediaItem(), "No location fix.", new Object[0]);
            MediaBrowserCompatMediaItem().PlaybackStateCompat();
            return;
        }
        setContentCardSyncData setcontentcardsyncdata = this.RatingCompat;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.RemoteActionCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, setcontentcardsyncdata);
        getanalyticsenabledenterannotations.read(ControlMessage.LOCATION_FIX_TIMEDOUT, this.MediaDescriptionCompat);
        getanalyticsenabledenterannotations.IconCompatParcelizer(ControlMessage.LOCATION_FIX_START, r8lambdaQhqZpxPfyF_Skw25Fw_j7F1Lxn0.IconCompatParcelizer("LostState", ServiceForegroundMode.O_ONLY, StartLocationFixRequest$Purpose.DETECTIONS));
    }

    public static void RemoteActionCompatParcelizer(setContentCardSyncUserId setcontentcardsyncuserid, Location location) {
        setConversationShortcutId setcontentcardsyncuserid2;
        if (getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.IconCompatParcelizer(location)) {
            setcontentcardsyncuserid2 = new setContext(setcontentcardsyncuserid.MediaBrowserCompatMediaItem(), Type.LOST, location, null, setcontentcardsyncuserid.MediaMetadataCompat.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() && setcontentcardsyncuserid.MediaSessionCompatQueueItem == 2);
        } else {
            setcontentcardsyncuserid2 = new setContentCardSyncUserId(setcontentcardsyncuserid.MediaBrowserCompatMediaItem(), Type.LOST, 4);
        }
        setcontentcardsyncuserid.MediaBrowserCompatMediaItem().write(setcontentcardsyncuserid2);
    }

    @Override // o.setConversationShortcutId
    public final void serializer(setCampaignId setcampaignid) {
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // o.setConversationShortcutId, o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reason", this.MediaSessionCompatQueueItem);
        return jSONObject.toString();
    }

    public setContentCardSyncUserId(setCampaignId setcampaignid, Type type, int i) {
        super(setcampaignid, type, null, null);
        this.MediaSessionCompatQueueItem = i;
        this.RemoteActionCompatParcelizer = setcampaignid.RatingCompat();
        this.read = setcampaignid.read();
        this.IconCompatParcelizer = setcampaignid.PlaybackStateCompatCustomAction();
        this.write = setcampaignid.serializer();
        this.serializer = setcampaignid.MediaSessionCompatQueueItem();
        this.MediaMetadataCompat = setcampaignid.write();
        this.RatingCompat = new setContentCardSyncData(this, setcampaignid.RemoteActionCompatParcelizer());
        this.MediaDescriptionCompat = new setConversationalPush(this, setcampaignid.RemoteActionCompatParcelizer());
    }
}
