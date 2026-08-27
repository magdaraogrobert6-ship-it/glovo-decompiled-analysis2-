package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Map;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {
    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("DataStoreKey not found for key: ", str);
    }

    public final DataStoreKey a(String str) {
        str.getClass();
        DataStoreKey dataStoreKey = (DataStoreKey) ((Map) DataStoreKey.keyMap$delegate.MediaSessionCompatResultReceiverWrapper()).get(str);
        if (dataStoreKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 4), 6, (Object) null);
        }
        return dataStoreKey;
    }
}
