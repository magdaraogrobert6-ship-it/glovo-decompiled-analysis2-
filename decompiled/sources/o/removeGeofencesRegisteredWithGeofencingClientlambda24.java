package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.init.SentianceOptions;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class removeGeofencesRegisteredWithGeofencingClientlambda24 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda24(Object obj, Object obj2, long j, Object obj3, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
        this.read = j;
        this.IconCompatParcelizer = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.IconCompatParcelizer;
        long j = this.read;
        Object obj2 = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ((Sentiance) obj3).lambda$initializeAsync$0((SentianceOptions) obj2, j, (BrazeNotificationUtilsExternalSyntheticLambda14) obj);
            return;
        }
        int i2 = removeGeofencesRegisteredWithGeofencingClientlambda22.serializer;
        requestSingleLocationUpdateFromGooglePlaylambda0.IconCompatParcelizer(new requestSingleLocationUpdateFromGooglePlaylambda0(j, (Context) obj2, (removeGeofencesRegisteredWithGeofencingClientlambda22) obj3), (Intent) obj);
    }
}
