package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class ServerConfigDataStoreProviderCompanion {
    private final String RemoteActionCompatParcelizer;
    private final containsandroid_sdk_base_release read;
    private final Context write;

    public final void RemoteActionCompatParcelizer(removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.read;
        Context context = this.write;
        if (i >= 33) {
            context.registerReceiver(removegeofencesregisteredwithgeofencingclientlambda22, intentFilter, null, containsandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(), 2);
        } else {
            context.registerReceiver(removegeofencesregisteredwithgeofencingclientlambda22, intentFilter, null, containsandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer());
        }
    }

    public ServerConfigDataStoreProviderCompanion(Context context, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, readList readlist) {
        this.write = context;
        this.read = readlist.read();
        getgeofencerequestlocationannotations.getClass();
        this.RemoteActionCompatParcelizer = Build.MANUFACTURER;
    }

    public final Intent RemoteActionCompatParcelizer(IntentFilter intentFilter) {
        return this.write.registerReceiver(null, intentFilter);
    }

    public final String read() {
        if (this.RemoteActionCompatParcelizer.equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
            return "com.samsung.android.app.memo.EDGE_";
        }
        return "";
    }

    public final void serializer(BroadcastReceiver broadcastReceiver) {
        try {
            this.write.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
    }
}
