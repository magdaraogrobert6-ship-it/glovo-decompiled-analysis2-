package o;

import com.sentiance.sdk.events.ControlMessage;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class aExternalSyntheticLambda0 extends deepcopyandroid_sdk_base_release {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aExternalSyntheticLambda0(migrateTriggersStorageToJsonlambda21 migratetriggersstoragetojsonlambda21, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "VenueMapUpdater");
        this.serializer = migratetriggersstoragetojsonlambda21;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (this.IconCompatParcelizer == 0) {
            if (controlMessage == ControlMessage.VENUEMAP_UPDATE_REQUEST) {
                ((migrateTriggersStorageToJsonlambda21) this.serializer).write(null, true);
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            boolean z = false;
            ((r8lambdaNhlkRWz5iIYpTs8A0990satz5JA) this.serializer).serializer.IconCompatParcelizer("TileAvailableConsumer got this quad key: ".concat(str), new Object[0]);
            synchronized (this) {
                Iterator it = ((Set) ((r8lambdaNhlkRWz5iIYpTs8A0990satz5JA) this.serializer).PlaybackStateCompatCustomAction.read()).iterator();
                while (it.hasNext()) {
                    if (shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.IconCompatParcelizer(((deleteDataStoreFilelambda0) it.next()).RemoteActionCompatParcelizer(), 14)).equals(str)) {
                        it.remove();
                        z = true;
                    }
                }
            }
            if (z) {
                ((r8lambdaNhlkRWz5iIYpTs8A0990satz5JA) this.serializer).read();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aExternalSyntheticLambda0(r8lambdaNhlkRWz5iIYpTs8A0990satz5JA r8lambdanhlkrwz5iiypts8a0990satz5ja, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "VenueMapper");
        this.serializer = r8lambdanhlkrwz5iiypts8a0990satz5ja;
    }
}
