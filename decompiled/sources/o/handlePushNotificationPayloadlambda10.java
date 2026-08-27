package o;

import com.huawei.riemann.location.common.utils.Constant;
import com.sentiance.okhttp3.Protocol;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class handlePushNotificationPayloadlambda10 extends migrateMetadataToJsonlambda2 {
    private boolean IconCompatParcelizer;

    public handlePushNotificationPayloadlambda10(registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(registergeofenceswithgoogleplayifnecessarylambda10);
    }

    @Override // o.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled
    public final setShouldPersistWebViewWhenBackgroundingApp serializer(_get_brazeApiKey_lambda1 _get_brazeapikey_lambda1) throws IOException {
        Charset charsetForName;
        isHtmlInAppMessageHtmlLinkTargetEnabled ishtmlinappmessagehtmllinktargetenabled;
        setSessionTimeout setsessiontimeout = _get_brazeapikey_lambda1.RatingCompat;
        if (!this.IconCompatParcelizer) {
            return _get_brazeapikey_lambda1.serializer(setsessiontimeout);
        }
        setShouldUseWindowFlagSecureInActivities setshouldusewindowflagsecureinactivities = new setShouldUseWindowFlagSecureInActivities();
        setshouldusewindowflagsecureinactivities.RemoteActionCompatParcelizer = setsessiontimeout;
        setshouldusewindowflagsecureinactivities.read = Protocol.HTTP_1_1;
        setshouldusewindowflagsecureinactivities.write = Constant.ERROR_UNKNOWN;
        setshouldusewindowflagsecureinactivities.IconCompatParcelizer = "Shutdown in progress";
        isHtmlInAppMessageHtmlLinkTargetEnabled ishtmlinappmessagehtmllinktargetenabledIconCompatParcelizer = isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer("text/plain");
        Charset charset = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaMetadataCompat;
        try {
            String str = ishtmlinappmessagehtmllinktargetenabledIconCompatParcelizer.read;
            charsetForName = str != null ? Charset.forName(str) : null;
        } catch (IllegalArgumentException unused) {
        }
        if (charsetForName == null) {
            try {
                ishtmlinappmessagehtmllinktargetenabledIconCompatParcelizer = isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer(ishtmlinappmessagehtmllinktargetenabledIconCompatParcelizer + "; charset=utf-8");
            } catch (IllegalArgumentException unused2) {
                ishtmlinappmessagehtmllinktargetenabled = null;
            }
        } else {
            charset = charsetForName;
        }
        ishtmlinappmessagehtmllinktargetenabled = ishtmlinappmessagehtmllinktargetenabledIconCompatParcelizer;
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        r8lambdabeyrnr8p6809bwlboro_stans.read("", 0, 0, charset);
        setshouldusewindowflagsecureinactivities.MediaSessionCompatQueueItem = new setSmallNotificationIconNameandroid_sdk_base_release(ishtmlinappmessagehtmllinktargetenabled, r8lambdabeyrnr8p6809bwlboro_stans.serializer, r8lambdabeyrnr8p6809bwlboro_stans, 0);
        return setshouldusewindowflagsecureinactivities.RemoteActionCompatParcelizer();
    }

    public final void read(boolean z) {
        this.IconCompatParcelizer = z;
    }
}
