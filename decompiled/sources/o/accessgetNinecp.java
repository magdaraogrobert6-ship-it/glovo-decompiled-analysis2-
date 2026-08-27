package o;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNinecp {
    public final /* synthetic */ int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final Bundle read;
    public final int serializer;
    public final ParentDataModifierDefaultImpls write = new ParentDataModifierDefaultImpls();

    public final boolean write() {
        return this.IconCompatParcelizer == 0;
    }

    public accessgetNinecp(int i, int i2, Bundle bundle, int i3) {
        this.IconCompatParcelizer = i3;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
        this.read = bundle;
    }

    public final void serializer(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.write.RemoteActionCompatParcelizer(zztVar);
    }

    public final String toString() {
        return "Request { what=" + this.serializer + " id=" + this.RemoteActionCompatParcelizer + " oneWay=" + write() + "}";
    }
}
