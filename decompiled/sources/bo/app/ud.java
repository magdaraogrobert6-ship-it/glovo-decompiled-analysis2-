package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Migrated Int key: ", str);
    }

    public static final String c(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Migrated Boolean key: ", str);
    }

    public final getNoActiveChildannotations a(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(11), 7, (Object) null);
        try {
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            for (Map.Entry entry : getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    int iWrite = BackspaceCommand.write();
                    backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), -220732894, iWrite), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 23), 7, (Object) null);
                } else if (value instanceof Integer) {
                    backwardfocussearchIconCompatParcelizer.serializer(RangesKt.IconCompatParcelizer(str), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 24), 7, (Object) null);
                } else if (value instanceof Boolean) {
                    int iWrite2 = BackspaceCommand.write();
                    backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(-293359906, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), 293359908, iWrite2), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 25), 7, (Object) null);
                } else if (value instanceof Set) {
                    Set set = (Set) value;
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(set);
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
                    }
                    int iWrite3 = BackspaceCommand.write();
                    backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), -220732894, iWrite3), strRemoteActionCompatParcelizer);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(str, set, 13), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda9(1, str, value), 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(12), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(13), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public static final String b() {
        return "Migration for RuntimeAppConfiguration completed successfully.";
    }

    public static final String c() {
        return "Failed to migrate runtime configuration to DataStore.";
    }

    public static final String a() {
        return "Starting migration for RuntimeAppConfiguration";
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Migrated String key: ", str);
    }

    public static final String a(String str, Set set) {
        return "Migrated StringSet key: " + str + " with " + set.size() + " items";
    }

    public static final String a(String str, Object obj) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
        StringBuilder sb = new StringBuilder("Unknown type for key: ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(obj);
        sb.append(" (type: ");
        return ff$$ExternalSyntheticOutline0.m(sb, simpleName, ") - skipping migration");
    }
}
