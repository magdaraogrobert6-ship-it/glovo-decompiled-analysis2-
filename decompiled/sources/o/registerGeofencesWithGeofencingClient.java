package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.authentication.UserCreationType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.util.Optional;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "Authenticator")
public class registerGeofencesWithGeofencingClient implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs IconCompatParcelizer;
    private final requestSingleLocationUpdateFromGooglePlaylambda30 MediaBrowserCompatMediaItem;
    private final registerGeofencesWithGooglePlayIfNecessarylambda0 MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private final getAnalyticsEnabledEnterannotations MediaSessionCompatQueueItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatToken;
    private final registerGeofencesWithGooglePlayIfNecessarylambda10 ParcelableVolumeInfo;
    private final registerGeofencesWithGeofencingClientlambda32 PlaybackStateCompat = new registerGeofencesWithGeofencingClientlambda30(2, this);
    private final r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg RatingCompat;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final requestSingleLocationUpdate read;
    private final parseLonglambda0 serializer;
    private final getVerticalAccuracy write;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface read {
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    public static void IconCompatParcelizer(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient, setCustomUserAttributelambda7 setcustomuserattributelambda7, UserCreationType userCreationType, registerGeofencesWithGeofencingClientlambda31 registergeofenceswithgeofencingclientlambda31, UserLinkerAsync userLinkerAsync) {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = registergeofenceswithgeofencingclient.IconCompatParcelizer;
        registergeofenceswithgeofencingclient.serializer.serializer("successfully requested access token for user " + setcustomuserattributelambda7.RemoteActionCompatParcelizer.read, new Object[0]);
        registergeofenceswithgeofencingclient.MediaBrowserCompatMediaItem.write(setcustomuserattributelambda7.read);
        setHomeCitylambda0 sethomecitylambda0 = setcustomuserattributelambda7.RemoteActionCompatParcelizer;
        String str = sethomecitylambda0.RatingCompat;
        if (str == null) {
            str = sethomecitylambda0.read;
        }
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(registergeofenceswithgeofencingclient.ParcelableVolumeInfo.serializer() + "users/" + str, null, false, false);
        String str2 = sethomecitylambda0.IconCompatParcelizer;
        String strC = com.sentiance.sdk.util.x.c(sethomecitylambda0.serializer.longValue());
        String str3 = sethomecitylambda0.write;
        Long lValueOf = sethomecitylambda0.MediaSessionCompatQueueItem;
        registergeofenceswithgeofencingclient.MediaSessionCompatToken.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lValueOf == null) {
            lValueOf = Long.valueOf(jCurrentTimeMillis);
        }
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty = new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7ywl9ynsudagvjliqatfcbze4m, new r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA(str2, strC, str3, com.sentiance.sdk.util.x.c(lValueOf.longValue())));
        r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
        String str4 = sethomecitylambda0.MediaDescriptionCompat;
        if (str4 != null) {
            r8lambdaw447glwjfoun4bg91upxnadqezs.serializer(str4);
        }
        String str5 = sethomecitylambda0.MediaBrowserCompatMediaItem;
        if (str5 != null) {
            r8lambdazcbg_e0hjusjy78mvgh54swzqty = r8lambdazcbg_e0hjusjy78mvgh54swzqty.read(str5);
        }
        int i = 1;
        if (userCreationType == UserCreationType.HARD) {
            if (r8lambdazcbg_e0hjusjy78mvgh54swzqty.IconCompatParcelizer() == null) {
                registergeofenceswithgeofencingclientlambda31.write(7, "Failed to do auto hard linking");
                return;
            } else {
                r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
                registergeofenceswithgeofencingclientlambda31.IconCompatParcelizer(true);
                return;
            }
        }
        if (userCreationType == UserCreationType.FULL) {
            registergeofenceswithgeofencingclient.read(userLinkerAsync, new registerGeofencesWithGeofencingClientlambda30(i, registergeofenceswithgeofencingclientlambda31), r8lambdazcbg_e0hjusjy78mvgh54swzqty);
            return;
        }
        if (userCreationType == UserCreationType.LEGACY_INIT) {
            Boolean boolDefaultViewModelProviderFactory_delegatelambda0 = registergeofenceswithgeofencingclient.RemoteActionCompatParcelizer.defaultViewModelProviderFactory_delegatelambda0();
            Boolean bool = Boolean.FALSE;
            if (boolDefaultViewModelProviderFactory_delegatelambda0 == null) {
                boolDefaultViewModelProviderFactory_delegatelambda0 = bool;
            }
            if (boolDefaultViewModelProviderFactory_delegatelambda0.booleanValue()) {
                registergeofenceswithgeofencingclient.read(userLinkerAsync, new registerGeofencesWithGeofencingClientlambda30(i, registergeofenceswithgeofencingclientlambda31), r8lambdazcbg_e0hjusjy78mvgh54swzqty);
            } else {
                r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty.read(r8lambdazcbg_e0hjusjy78mvgh54swzqty.write().replaceAll(".*/", "")));
                registergeofenceswithgeofencingclientlambda31.IconCompatParcelizer(true);
            }
        }
    }

    public static void serializer(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient) {
        Boolean boolDefaultViewModelProviderFactory_delegatelambda0 = registergeofenceswithgeofencingclient.RemoteActionCompatParcelizer.defaultViewModelProviderFactory_delegatelambda0();
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = registergeofenceswithgeofencingclient.IconCompatParcelizer.write().RemoteActionCompatParcelizer();
        if (boolDefaultViewModelProviderFactory_delegatelambda0 == null || !boolDefaultViewModelProviderFactory_delegatelambda0.booleanValue() || r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer == null || r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
            return;
        }
        registergeofenceswithgeofencingclient.serializer.IconCompatParcelizer("User linking is enabled. Third party linking is not yet complete.", new Object[0]);
        registergeofenceswithgeofencingclient.read(registergeofenceswithgeofencingclient.RatingCompat.RemoteActionCompatParcelizer(), registergeofenceswithgeofencingclient.PlaybackStateCompat, r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
    }

    public final void write() {
        this.RemoteActionCompatParcelizer.clearData();
        this.IconCompatParcelizer.clearData();
    }

    public registerGeofencesWithGeofencingClient(parseLonglambda0 parselonglambda0, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, requestSingleLocationUpdate requestsinglelocationupdate, getVerticalAccuracy getverticalaccuracy, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, registerGeofencesWithGooglePlayIfNecessarylambda0 registergeofenceswithgoogleplayifnecessarylambda0, requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30, r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.read = requestsinglelocationupdate;
        this.write = getverticalaccuracy;
        this.RemoteActionCompatParcelizer = configurationManager;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = getanalyticsenabledenterannotations;
        this.MediaDescriptionCompat = registergeofenceswithgoogleplayifnecessarylambda0;
        this.MediaBrowserCompatMediaItem = requestsinglelocationupdatefromgoogleplaylambda30;
        this.RatingCompat = r8lambda7zcvodb3ypljdzjmgkbnvobyklg;
        this.ParcelableVolumeInfo = registergeofenceswithgoogleplayifnecessarylambda10;
        this.MediaSessionCompatToken = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.MediaSessionCompatQueueItem.read(ControlMessage.CONFIGURATION_UPDATED, new registerGeofencesWithGeofencingClientlambda33(this, this.MediaMetadataCompat));
    }

    public static void write(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient, String str, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, setEmaillambda0 setemaillambda0) {
        if (!registergeofenceswithgeofencingclient.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
            registergeofenceswithgeofencingclient.read(str, r8lambdazcbg_e0hjusjy78mvgh54swzqty, registergeofenceswithgeofencingclientlambda32, setemaillambda0);
        } else {
            registergeofenceswithgeofencingclient.MediaDescriptionCompat.serializer(new registerGeofencesWithGeofencingClientlambda10(registergeofenceswithgeofencingclient, str, registergeofenceswithgeofencingclientlambda32, setemaillambda0));
        }
    }

    public final void serializer(String str, String str2, UserCreationType userCreationType, UserLinkerAsync userLinkerAsync, registerGeofencesWithGeofencingClientlambda31 registergeofenceswithgeofencingclientlambda31) {
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = this.IconCompatParcelizer;
        Optional<r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY> optionalWrite = r8lambdaw447glwjfoun4bg91upxnadqezs.write();
        boolean z = optionalWrite.read();
        parseLonglambda0 parselonglambda0 = this.serializer;
        if (z) {
            parselonglambda0.serializer("start authentication", new Object[0]);
            this.read.read(str, str2, userCreationType, new registerGeofencesWithGeofencingClientlambda3(this, userCreationType, registergeofenceswithgeofencingclientlambda31, userLinkerAsync));
            return;
        }
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite = optionalWrite.write();
        Boolean boolDefaultViewModelProviderFactory_delegatelambda0 = this.RemoteActionCompatParcelizer.defaultViewModelProviderFactory_delegatelambda0();
        if (boolDefaultViewModelProviderFactory_delegatelambda0 != null && boolDefaultViewModelProviderFactory_delegatelambda0.booleanValue()) {
            parselonglambda0.IconCompatParcelizer("Already authenticated, user linking enabled, verifying link", new Object[0]);
            read(userLinkerAsync, new registerGeofencesWithGeofencingClientlambda30(registergeofenceswithgeofencingclientlambda31, r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite), r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite);
        } else {
            if (userCreationType == UserCreationType.FULL) {
                registergeofenceswithgeofencingclientlambda31.write(5, "User linking is disabled for this app ID");
                return;
            }
            if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite.IconCompatParcelizer() == null) {
                parselonglambda0.IconCompatParcelizer("Already authenticated, user linking disabled and person ID not set, set it based on user ID", new Object[0]);
                r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite.read(r8lambdazcbg_e0hjusjy78mvgh54swzqtyWrite.write().replaceAll(".*/", "")));
                registergeofenceswithgeofencingclientlambda31.IconCompatParcelizer(false);
            } else {
                parselonglambda0.IconCompatParcelizer("Already authenticated, user linking disabled and person ID already set", new Object[0]);
                registergeofenceswithgeofencingclientlambda31.IconCompatParcelizer(false);
            }
        }
    }

    public final void read(UserLinkerAsync userLinkerAsync, registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        ConfigurationManager configurationManager = this.RemoteActionCompatParcelizer;
        setEmaillambda0 setemaillambda0ParcelableVolumeInfo = configurationManager.ParcelableVolumeInfo();
        String strIconCompatParcelizer = r8lambdazcbg_e0hjusjy78mvgh54swzqty.IconCompatParcelizer();
        parseLonglambda0 parselonglambda0 = this.serializer;
        if (strIconCompatParcelizer != null && r8lambdazcbg_e0hjusjy78mvgh54swzqty.MediaBrowserCompatMediaItem()) {
            parselonglambda0.IconCompatParcelizer("Already linked with third party", new Object[0]);
            registergeofenceswithgeofencingclientlambda32.serializer(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
            return;
        }
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqty.IconCompatParcelizer() != null && userLinkerAsync == null) {
            parselonglambda0.IconCompatParcelizer("Already hard linked", new Object[0]);
            registergeofenceswithgeofencingclientlambda32.serializer(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
            return;
        }
        Boolean boolDefaultViewModelProviderFactory_delegatelambda0 = configurationManager.defaultViewModelProviderFactory_delegatelambda0();
        Boolean bool = Boolean.FALSE;
        if (boolDefaultViewModelProviderFactory_delegatelambda0 == null) {
            boolDefaultViewModelProviderFactory_delegatelambda0 = bool;
        }
        if (!boolDefaultViewModelProviderFactory_delegatelambda0.booleanValue()) {
            registergeofenceswithgeofencingclientlambda32.serializer(5, "User linking is disabled for this app ID");
            return;
        }
        parselonglambda0.IconCompatParcelizer("Proceeding with user linking", new Object[0]);
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(new registerGeofencesWithGeofencingClientlambda1(this, r8lambdazcbg_e0hjusjy78mvgh54swzqty, userLinkerAsync, registergeofenceswithgeofencingclientlambda32, setemaillambda0ParcelableVolumeInfo), "Authenticator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(String str, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, setEmaillambda0 setemaillambda0) {
        parseLonglambda0 parselonglambda0 = this.serializer;
        parselonglambda0.IconCompatParcelizer("Hard-linking install %s", str);
        if (this.read.RemoteActionCompatParcelizer(new registerGeofencesWithGeofencingClientlambda34(registergeofenceswithgeofencingclientlambda32, setemaillambda0, this.serializer, this.IconCompatParcelizer, r8lambdazcbg_e0hjusjy78mvgh54swzqty, this.MediaBrowserCompatMediaItem, 0))) {
            return;
        }
        parselonglambda0.write("Failed to make hard link request. Request was blocked.", new Object[0]);
        registergeofenceswithgeofencingclientlambda32.serializer(6, "Request was blocked");
    }

    public static void a(registerGeofencesWithGeofencingClient registergeofenceswithgeofencingclient, r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, registerGeofencesWithGeofencingClientlambda32 registergeofenceswithgeofencingclientlambda32, setEmaillambda0 setemaillambda0) {
        parseLonglambda0 parselonglambda0 = registergeofenceswithgeofencingclient.serializer;
        parselonglambda0.IconCompatParcelizer("Getting person ID", new Object[0]);
        if (registergeofenceswithgeofencingclient.read.serializer(new registerGeofencesWithGeofencingClientlambda34(registergeofenceswithgeofencingclientlambda32, setemaillambda0, registergeofenceswithgeofencingclient.serializer, registergeofenceswithgeofencingclient.IconCompatParcelizer, r8lambdazcbg_e0hjusjy78mvgh54swzqty, registergeofenceswithgeofencingclient.MediaBrowserCompatMediaItem, 1))) {
            return;
        }
        parselonglambda0.write("Failed to make get person ID request. Request was blocked.", new Object[0]);
        registergeofenceswithgeofencingclientlambda32.serializer(6, "Request was blocked");
    }
}
