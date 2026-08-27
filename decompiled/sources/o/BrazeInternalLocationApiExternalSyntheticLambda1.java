package o;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class BrazeInternalLocationApiExternalSyntheticLambda1 extends BrazeInternalLocationApiExternalSyntheticLambda4 {
    public BrazeInternalLocationApiExternalSyntheticLambda1(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
    }

    @Override // o.BrazeInternalLocationApiExternalSyntheticLambda4
    public final int read() {
        return 1;
    }

    @Override // o.BrazeInternalLocationApiExternalSyntheticLambda4
    public final String serializer() {
        return "speedlimits";
    }
}
