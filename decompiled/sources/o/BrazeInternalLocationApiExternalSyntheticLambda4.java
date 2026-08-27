package o;

import android.content.Context;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BrazeInternalLocationApiExternalSyntheticLambda4 extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    public BrazeInternalLocationApiExternalSyntheticLambda4(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
    }

    public abstract int read();

    public abstract String serializer();

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 read(String str, Long l) {
        java.util.Locale locale = java.util.Locale.US;
        String strSerializer = serializer();
        int i = read();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("tile/", strSerializer, "/", str, "?schemaVersion=v");
        sbM.append(i);
        String string = sbM.toString();
        if (l != null) {
            string = string + "&cts=" + l;
        }
        setSessionTimeout setsessiontimeoutIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(string);
        if (setsessiontimeoutIconCompatParcelizer == null) {
            return null;
        }
        return this.read.RemoteActionCompatParcelizer(setsessiontimeoutIconCompatParcelizer);
    }
}
