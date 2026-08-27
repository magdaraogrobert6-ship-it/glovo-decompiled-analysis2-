package o;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaI5dYrJApTBX5XA8keG9hJD19Zgw extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    private final getMaxNumToRegister write;

    public final void RemoteActionCompatParcelizer(String str, String str2, r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        setCustomUserAttributedefault setcustomuserattributedefaultSerializer = this.write.serializer();
        HashMap map = new HashMap();
        map.put("Sentiance-Authentication-Code", str);
        map.put("Sentiance-Person-Id", str2);
        this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("users/link-anonymous-user", setcustomuserattributedefaultSerializer, null, map)).serializer(r8lambda2qd0wtxyngtmhspveumb06dloaq);
    }

    public r8lambdaI5dYrJApTBX5XA8keG9hJD19Zgw(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10, getMaxNumToRegister getmaxnumtoregister) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
        this.write = getmaxnumtoregister;
    }

    public final void IconCompatParcelizer(String str, registerGeofencesWithGooglePlayIfNecessarylambda11 registergeofenceswithgoogleplayifnecessarylambda11) {
        setCustomUserAttributedefault setcustomuserattributedefaultSerializer = this.write.serializer();
        HashMap map = new HashMap();
        map.put("Sentiance-Authentication-Code", str);
        this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("users/token-exchange", setcustomuserattributedefaultSerializer, null, map)).serializer(registergeofenceswithgoogleplayifnecessarylambda11);
    }
}
