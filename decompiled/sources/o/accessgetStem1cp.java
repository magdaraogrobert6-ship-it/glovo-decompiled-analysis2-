package o;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetStem1cp {
    public final Bundle IconCompatParcelizer;
    public final /* synthetic */ BaseGmsClient MediaDescriptionCompat;
    public Boolean RemoteActionCompatParcelizer;
    public boolean read;
    public final int serializer;
    public final /* synthetic */ BaseGmsClient write;

    public abstract boolean read();

    public abstract void serializer(ConnectionResult connectionResult);

    public accessgetStem1cp(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        this.write = baseGmsClient;
        Boolean bool = Boolean.TRUE;
        this.MediaDescriptionCompat = baseGmsClient;
        this.RemoteActionCompatParcelizer = bool;
        this.read = false;
        this.serializer = i;
        this.IconCompatParcelizer = bundle;
    }
}
