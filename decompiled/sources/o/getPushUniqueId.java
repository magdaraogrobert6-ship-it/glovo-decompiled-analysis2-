package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "geofence-manager", componentName = "GeofenceCache")
public class getPushUniqueId {
    private final com.sentiance.sdk.util.c RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;

    public final void read(String str, setConfigurationProvider setconfigurationprovider) {
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, setconfigurationprovider.write());
        } catch (JSONException e) {
            this.read.IconCompatParcelizer(false, e, "Couldn't serialize: " + setconfigurationprovider, new Object[0]);
        }
    }

    public getPushUniqueId(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        this.RemoteActionCompatParcelizer = cVar;
        this.read = parselonglambda0;
    }

    public final Optional<setConfigurationProvider> serializer(String str) {
        String strWrite = this.RemoteActionCompatParcelizer.write(str, (String) null);
        if (strWrite == null) {
            return Optional.MediaSessionCompatQueueItem();
        }
        try {
            setConfigurationProvider setconfigurationprovider = new setConfigurationProvider();
            setconfigurationprovider.RemoteActionCompatParcelizer(strWrite);
            return Optional.RemoteActionCompatParcelizer(setconfigurationprovider);
        } catch (JSONException unused) {
            return Optional.MediaSessionCompatQueueItem();
        }
    }

    public final void write(String str) {
        this.RemoteActionCompatParcelizer.read(str);
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.read();
    }
}
