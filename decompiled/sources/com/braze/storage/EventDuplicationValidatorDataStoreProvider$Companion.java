package com.braze.storage;

import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class EventDuplicationValidatorDataStoreProvider$Companion {
    public /* synthetic */ EventDuplicationValidatorDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$3() {
        return "Failed to migrate event duplication map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence migrateEventDuplicationMap$lambda$1(Map.Entry entry) {
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        value.getClass();
        return str + ":" + ((Long) value);
    }

    public final getNoActiveChildannotations migrateEventDuplicationMap(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(14), 7, (Object) null);
        Object[] objArr = {DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey()};
        int iWrite = BackspaceCommand.write();
        isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite);
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey(isroot)) {
            return getnoactivechildannotations;
        }
        try {
            String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet(), ",", null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$1((Map.Entry) obj);
                }
            }, 30);
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            backwardfocussearchIconCompatParcelizer.serializer(isroot, strIconCompatParcelizer);
            BrazeLogger.brazelog$default(brazeLogger, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$c$$ExternalSyntheticLambda0(1, getsystemdefinedlcbbffg), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(15), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    private EventDuplicationValidatorDataStoreProvider$Companion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$2$0(getSystemDefinedLCbbffg getsystemdefinedlcbbffg) {
        return d$$ExternalSyntheticOutline0.m(getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().size(), "Migration for event duplication map completed. Migrated ", " events.");
    }
}
