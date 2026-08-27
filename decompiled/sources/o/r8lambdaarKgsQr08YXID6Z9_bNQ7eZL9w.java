package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaarKgsQr08YXID6Z9_bNQ7eZL9w extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    public r8lambdaarKgsQr08YXID6Z9_bNQ7eZL9w(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 IconCompatParcelizer(r8lambda0CqsV9PzHXzu3fvW17nz6eF0Wk r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk) {
        setSessionTimeout setsessiontimeout = this.RemoteActionCompatParcelizer.read("auth/token", r8lambda0cqsv9pzhxzu3fvw17nz6ef0wk);
        if (setsessiontimeout == null) {
            return null;
        }
        return this.read.RemoteActionCompatParcelizer(setsessiontimeout);
    }
}
