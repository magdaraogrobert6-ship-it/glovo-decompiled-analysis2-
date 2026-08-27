package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    protected final registerGeofencesWithGooglePlayIfNecessarylambda10 IconCompatParcelizer;
    protected final GooglePlayLocationUtils RemoteActionCompatParcelizer;
    protected final getLastKnownGpsLocationIfValidlambda0 read;
    protected final Context serializer;

    public r8lambdabkLMk0V9hJhnciUMVieoORp5FU(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10) {
        this.serializer = context;
        this.read = getlastknowngpslocationifvalidlambda0;
        this.RemoteActionCompatParcelizer = googlePlayLocationUtils;
        this.IconCompatParcelizer = registergeofenceswithgoogleplayifnecessarylambda10;
    }
}
