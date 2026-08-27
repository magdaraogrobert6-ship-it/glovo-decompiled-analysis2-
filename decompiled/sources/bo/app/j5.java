package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class j5 {
    public final getNoActiveChildannotations a(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String str = "";
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.LEGACY_DEVICE_ID;
        Object[] objArr = {dataStoreKey.getKey()};
        int iWrite = BackspaceCommand.write();
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite))) {
            return getnoactivechildannotations;
        }
        try {
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            String strWrite = getsystemdefinedlcbbffg.write(DataStoreKey.DEVICE_ID.getKey(), "");
            if (strWrite != null) {
                str = strWrite;
            }
            Object[] objArr2 = {dataStoreKey.getKey()};
            int iWrite2 = BackspaceCommand.write();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2), str);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(8), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}
