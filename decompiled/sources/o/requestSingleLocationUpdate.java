package o;

import android.content.Context;
import android.util.Base64;
import com.sentiance.sdk.api.requests.SdkInitConfigRequestReason;
import com.sentiance.sdk.authentication.UserCreationType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class requestSingleLocationUpdate extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    private final getMaxNumToRegister write;

    public final void read(String str, String str2, UserCreationType userCreationType, r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        setCustomUserAttributedefault setcustomuserattributedefaultSerializer = this.write.serializer();
        String apiHeaderType = userCreationType.toApiHeaderType();
        HashMap map = new HashMap();
        if (apiHeaderType != null) {
            map.put("sentiance-user-link-type", apiHeaderType);
        }
        GooglePlayLocationUtils googlePlayLocationUtils = this.RemoteActionCompatParcelizer;
        googlePlayLocationUtils.getClass();
        this.read.RemoteActionCompatParcelizer(googlePlayLocationUtils.RemoteActionCompatParcelizer("sdk/auth", setcustomuserattributedefaultSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Basic ", Base64.encodeToString((str + ":" + str2).getBytes(), 2)), map)).serializer(r8lambda2qd0wtxyngtmhspveumb06dloaq);
    }

    public requestSingleLocationUpdate(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10, getMaxNumToRegister getmaxnumtoregister) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
        this.write = getmaxnumtoregister;
    }

    public final boolean serializer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, migrateTriggersStorageToJsonlambda21 migratetriggersstoragetojsonlambda21) {
        setSessionTimeout setsessiontimeoutIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer("sdk/" + r8lambdazcbg_e0hjusjy78mvgh54swzqty.serializer() + "/points-of-interest");
        if (setsessiontimeoutIconCompatParcelizer == null) {
            return false;
        }
        this.read.RemoteActionCompatParcelizer(setsessiontimeoutIconCompatParcelizer).serializer(migratetriggersstoragetojsonlambda21);
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        setSessionTimeout setsessiontimeoutRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        if (setsessiontimeoutRemoteActionCompatParcelizer == null) {
            return false;
        }
        this.read.RemoteActionCompatParcelizer(setsessiontimeoutRemoteActionCompatParcelizer).serializer(r8lambda2qd0wtxyngtmhspveumb06dloaq);
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty, requestSingleLocationUpdateFromGooglePlaylambda30 requestsinglelocationupdatefromgoogleplaylambda30) {
        setSessionTimeout setsessiontimeoutWrite = this.RemoteActionCompatParcelizer.write("sdk/".concat(r8lambdazcbg_e0hjusjy78mvgh54swzqty.serializer()), this.write.serializer());
        if (setsessiontimeoutWrite == null) {
            return false;
        }
        this.read.RemoteActionCompatParcelizer(setsessiontimeoutWrite).serializer(requestsinglelocationupdatefromgoogleplaylambda30);
        return true;
    }

    public final boolean serializer(r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        setSessionTimeout setsessiontimeoutIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer("sdk/person");
        if (setsessiontimeoutIconCompatParcelizer == null) {
            return false;
        }
        this.read.RemoteActionCompatParcelizer(setsessiontimeoutIconCompatParcelizer).serializer(r8lambda2qd0wtxyngtmhspveumb06dloaq);
        return true;
    }

    public final void IconCompatParcelizer(SdkInitConfigRequestReason sdkInitConfigRequestReason, r8lambdarLM3a25JFHhmldwryG6FQri4B1g r8lambdarlm3a25jfhhmldwryg6fqri4b1g) {
        r8lambda3as_JYXGcNkV4fEz04nIZ5zXEJs.serializer.getClass();
        sdkInitConfigRequestReason.getClass();
        this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.read("sdk/init-config", new r8lambda3as_JYXGcNkV4fEz04nIZ5zXEJs(sdkInitConfigRequestReason, null))).serializer(r8lambdarlm3a25jfhhmldwryg6fqri4b1g);
    }
}
