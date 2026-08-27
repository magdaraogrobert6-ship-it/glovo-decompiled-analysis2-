package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.usercreation.UserCreationFailureReason;
import com.sentiance.sdk.util.Optional;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "UserCreator")
public class registerGeofencesWithGooglePlayIfNecessarylambda11 extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    private final requestSingleLocationUpdateFromGooglePlaylambda30 IconCompatParcelizer;
    private final registerGeofencesWithGooglePlayIfNecessarylambda10 MediaBrowserCompatMediaItem;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private registerGeofencesWithGooglePlayIfNecessarylambda6 RatingCompat;
    private final r8lambdaI5dYrJApTBX5XA8keG9hJD19Zgw RemoteActionCompatParcelizer;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs read;
    private final parseLonglambda0 serializer;
    private final getVerticalAccuracy write;

    public registerGeofencesWithGooglePlayIfNecessarylambda11(r8lambdaI5dYrJApTBX5XA8keG9hJD19Zgw r8lambdai5dyrjaptbx5xa8keg9hjd19zgw, getVerticalAccuracy getverticalaccuracy, parseLonglambda0 parselonglambda0, requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.RemoteActionCompatParcelizer = r8lambdai5dyrjaptbx5xa8keg9hjd19zgw;
        this.write = getverticalaccuracy;
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = requestsinglelocationupdatefromgoogleplaylambda30;
        this.read = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.MediaBrowserCompatMediaItem = registergeofenceswithgoogleplayifnecessarylambda10;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        String string;
        Object[] objArr = {Integer.valueOf(setshouldpersistwebviewwhenbackgroundingapp.serializer), setshouldpersistwebviewwhenbackgroundingapp.read};
        parseLonglambda0 parselonglambda0 = this.serializer;
        parselonglambda0.RemoteActionCompatParcelizer("User creation response received: %d %s", objArr);
        if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
            write(UserCreationFailureReason.UNEXPECTED_ERROR, "Response has no body");
            return;
        }
        if (!setshouldpersistwebviewwhenbackgroundingapp.write()) {
            UserCreationFailureReason userCreationFailureReason = UserCreationFailureReason.SERVER_ERROR;
            int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
            try {
                string = setsmallnotificationiconnameandroid_sdk_base_release.serializer();
            } catch (IOException e) {
                StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "response code: ", ", exception: ");
                sbM.append(e.getMessage());
                string = sbM.toString();
            }
            write(userCreationFailureReason, string);
            return;
        }
        Optional optional = this.write.read(setsmallnotificationiconnameandroid_sdk_base_release.write(), setCustomUserAttributelambda7.IconCompatParcelizer, true);
        if (optional.read()) {
            parselonglambda0.RemoteActionCompatParcelizer("Couldn't deserialize SdkAuth thrift", new Object[0]);
            write(UserCreationFailureReason.UNEXPECTED_ERROR, "Failed to parse the response");
            return;
        }
        setCustomUserAttributelambda7 setcustomuserattributelambda7 = (setCustomUserAttributelambda7) optional.write();
        parselonglambda0.serializer("Successfully received token exchange result for user " + setcustomuserattributelambda7.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, new Object[0]);
        this.IconCompatParcelizer.write(setcustomuserattributelambda7.read);
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatMediaItem.serializer());
        sb.append("users/");
        setHomeCitylambda0 sethomecitylambda0 = setcustomuserattributelambda7.RemoteActionCompatParcelizer;
        sb.append(sethomecitylambda0.RatingCompat);
        r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M r8lambdar7ywl9ynsudagvjliqatfcbze4m = new r8lambdar7Ywl9ynSuDaGVjLiqaTFcBzE4M(sb.toString(), sethomecitylambda0.MediaBrowserCompatMediaItem, true, true);
        String str = sethomecitylambda0.IconCompatParcelizer;
        String strC = com.sentiance.sdk.util.x.c(sethomecitylambda0.serializer.longValue());
        String str2 = sethomecitylambda0.write;
        Long lValueOf = sethomecitylambda0.MediaSessionCompatQueueItem;
        this.MediaMetadataCompat.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lValueOf == null) {
            lValueOf = Long.valueOf(jCurrentTimeMillis);
        }
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty = new r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY(r8lambdar7ywl9ynsudagvjliqatfcbze4m, new r8lambdazGDcm_k4mTBwE6bMDWJk2bEesA(str, strC, str2, com.sentiance.sdk.util.x.c(lValueOf.longValue())));
        r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs = this.read;
        r8lambdaw447glwjfoun4bg91upxnadqezs.RemoteActionCompatParcelizer(r8lambdazcbg_e0hjusjy78mvgh54swzqty);
        String str3 = sethomecitylambda0.MediaDescriptionCompat;
        if (str3 != null) {
            r8lambdaw447glwjfoun4bg91upxnadqezs.serializer(str3);
        }
        registerGeofencesWithGooglePlayIfNecessarylambda6 registergeofenceswithgoogleplayifnecessarylambda6 = this.RatingCompat;
        if (registergeofenceswithgoogleplayifnecessarylambda6 != null) {
            registergeofenceswithgoogleplayifnecessarylambda6.onSuccess();
        }
    }

    public final void write(String str, registerGeofencesWithGooglePlayIfNecessarylambda6 registergeofenceswithgoogleplayifnecessarylambda6) {
        this.RatingCompat = registergeofenceswithgoogleplayifnecessarylambda6;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, this);
    }

    private void write(UserCreationFailureReason userCreationFailureReason, String str) {
        this.serializer.RemoteActionCompatParcelizer("Error creating user: %s %s", userCreationFailureReason.name(), str);
        registerGeofencesWithGooglePlayIfNecessarylambda6 registergeofenceswithgoogleplayifnecessarylambda6 = this.RatingCompat;
        if (registergeofenceswithgoogleplayifnecessarylambda6 != null) {
            registergeofenceswithgoogleplayifnecessarylambda6.RemoteActionCompatParcelizer(userCreationFailureReason, str);
        }
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.serializer.IconCompatParcelizer(false, iOException, "User creation error", new Object[0]);
        registerGeofencesWithGooglePlayIfNecessarylambda6 registergeofenceswithgoogleplayifnecessarylambda6 = this.RatingCompat;
        if (registergeofenceswithgoogleplayifnecessarylambda6 != null) {
            String message = iOException.getMessage();
            if (message == null) {
                message = "";
            }
            registergeofenceswithgoogleplayifnecessarylambda6.RemoteActionCompatParcelizer(UserCreationFailureReason.NETWORK_ERROR, message);
        }
    }
}
