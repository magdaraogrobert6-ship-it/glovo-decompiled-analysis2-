package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class l5 implements p9 {
    public final com.braze.storage.c a;

    /* JADX WARN: Code duplicated, block: B:10:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    public final String a() {
        com.braze.storage.c cVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.DEVICE_ID;
        String string = cVar.readString(dataStoreKey, null);
        if (string == null) {
            com.braze.storage.c cVar2 = this.a;
            DataStoreKey dataStoreKey2 = DataStoreKey.LEGACY_DEVICE_ID;
            string = cVar2.readString(dataStoreKey2, null);
            this.a.clearData(dataStoreKey2);
        }
        com.braze.storage.c cVar3 = this.a;
        DataStoreKey dataStoreKey3 = DataStoreKey.PERSISTENT_DEVICE_ID;
        if (cVar3.contains(dataStoreKey3)) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a.readString(dataStoreKey3, null), String.valueOf(722989291)}, getCieXyz.write())).booleanValue()) {
                string = d$$ExternalSyntheticOutline0.m();
            } else if (string == null) {
                string = d$$ExternalSyntheticOutline0.m();
            }
        } else if (string == null) {
            string = d$$ExternalSyntheticOutline0.m();
        }
        this.a.writeData(dataStoreKey, string);
        this.a.writeData(dataStoreKey3, String.valueOf(722989291));
        return string;
    }

    public l5(Context context, String str) {
        context.getClass();
        str.getClass();
        this.a = new com.braze.storage.c(context, str);
    }
}
