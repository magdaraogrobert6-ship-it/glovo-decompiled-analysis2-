package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayLocationUtils {
    private final registerGeofencesWithGooglePlayIfNecessarylambda10 IconCompatParcelizer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs RemoteActionCompatParcelizer;
    private final initializeGeofenceslambda1 serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    private setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release write(String str, String str2, Map<String, String> map) {
        if (!str.startsWith("http")) {
            str = this.IconCompatParcelizer.serializer().concat(str);
        }
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer(str);
        if (str2 != null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Authorization", str2);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(entry.getKey(), entry.getValue());
            }
        }
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(ConstantKt.USER_AGENT_HEADER, write());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Date", read());
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer();
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer != null) {
            setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Sentiance-User", r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.serializer());
        }
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release;
    }

    public final String read() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Calendar calendar = Calendar.getInstance();
        this.write.getClass();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return simpleDateFormat.format(calendar.getTime());
    }

    public final String write() {
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer();
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivugWrite = this.serializer.write();
        String strSerializer = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer != null ? r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.serializer() : null;
        String str = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.MediaDescriptionCompat;
        String str2 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.read + " " + r8lambdafjifijxjxuf3vopuwrut7txivugWrite.MediaMetadataCompat;
        String str3 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.ResultReceiver;
        String str4 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.PlaybackStateCompat;
        String str5 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        String str6 = r8lambdafjifijxjxuf3vopuwrut7txivugWrite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        StringBuilder sb = new StringBuilder("SDK/6.27.1 ");
        java.util.Locale locale = java.util.Locale.ENGLISH;
        if (strSerializer != null) {
            sb.append("User/" + strSerializer + " ");
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("(Android ", str, "; ", str2, "; Build/");
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ") (BundleId/", str4, "; Version/");
        sb.append(ff$$ExternalSyntheticOutline0.m(sbM, str5, "; Build/", str6, ")"));
        return sb.toString();
    }

    public GooglePlayLocationUtils(initializeGeofenceslambda1 initializegeofenceslambda1, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        this.serializer = initializegeofenceslambda1;
        this.RemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = registergeofenceswithgoogleplayifnecessarylambda10;
    }

    public final setSessionTimeout RemoteActionCompatParcelizer() {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            return null;
        }
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite = write("sdk/link-legacy-install", strIconCompatParcelizer, null);
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.serializer("POST", new setShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release(0, new byte[0]));
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.write();
    }

    public final setSessionTimeout read(String str, migrateTriggersReeligibilityToJsonlambda0 migratetriggersreeligibilitytojsonlambda0) {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            return null;
        }
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite = write(str, strIconCompatParcelizer, null);
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.serializer("POST", new r8lambda6MZWPRxuxsRm623E9MVHkpHRJ4(migratetriggersreeligibilitytojsonlambda0));
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.write();
    }

    public final setSessionTimeout write(String str, setCustomUserAttributedefault setcustomuserattributedefault) {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            return null;
        }
        return RemoteActionCompatParcelizer(str, setcustomuserattributedefault, strIconCompatParcelizer, Collections.EMPTY_MAP);
    }

    public final setSessionTimeout RemoteActionCompatParcelizer(String str, setCustomUserAttributedefault setcustomuserattributedefault, String str2, Map map) {
        setLocationManagerandroid_sdk_location_release setlocationmanagerandroid_sdk_location_release = new setLocationManagerandroid_sdk_location_release(setcustomuserattributedefault);
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite = write(str, str2, map);
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.serializer("POST", setlocationmanagerandroid_sdk_location_release);
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.write();
    }

    public final setSessionTimeout IconCompatParcelizer(String str) {
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            return null;
        }
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite = write(str, strIconCompatParcelizer, null);
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.serializer("GET", null);
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_releaseWrite.write();
    }

    private String IconCompatParcelizer() {
        String strMediaSessionCompatQueueItem;
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer();
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer == null || (strMediaSessionCompatQueueItem = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaSessionCompatQueueItem()) == null) {
            return null;
        }
        return "Bearer ".concat(strMediaSessionCompatQueueItem);
    }
}
