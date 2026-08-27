package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.SimpleItemTouchHelperCallback;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public final com.braze.storage.f a;

    public static final String c(g9 g9Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Adding event to storage with uid ", ((n1) g9Var).d);
    }

    public t1(Context context, String str, String str2) {
        context.getClass();
        this.a = new com.braze.storage.f(context, str, str2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Set set) {
        Map linkedHashMap;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        set.getClass();
        com.braze.storage.f fVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = fVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(String.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                                    Object[] objArr2 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                                    Object[] objArr3 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                                    Object[] objArr4 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                                    Object[] objArr5 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr5);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                                    Object[] objArr6 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr6);
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r1.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str), 4, (Object) null);
                            }
                        }
                    }
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map map2 = linkedHashMap;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = ((n1) ((g9) it.next())).d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str2, 21), 7, (Object) null);
            map2.remove(str2);
        }
        com.braze.storage.f fVar2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeinappmessageviewclosed2, beforeinappmessageviewclosed2), map2);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                if (map2 == null && (map2 instanceof List)) {
                    strRemoteActionCompatParcelizer = "[]";
                } else {
                    strRemoteActionCompatParcelizer = "{}";
                }
            }
            fVar2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public final Collection b() {
        Map linkedHashMap;
        beforeOpened beforeopened;
        Map map;
        String str;
        Object linkedHashMap2;
        Object linkedHashMap3;
        beforeOpened beforeopened2;
        Map map2;
        String strRemoteActionCompatParcelizer;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.braze.storage.f fVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        String str2 = "null";
        String str3 = "";
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = fVar.readData(dataStoreKey, "");
                data.getClass();
                String str4 = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str4).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(String.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls5))) {
                                    Object[] objArr2 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls4))) {
                                    Object[] objArr3 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls3))) {
                                    Object[] objArr4 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls2))) {
                                    Object[] objArr5 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr5);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(cls))) {
                                    Object[] objArr6 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr6);
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) s1.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str4, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str4), 4, (Object) null);
                            }
                        }
                        linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                    }
                    map = simpleItemTouchHelperCallback;
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) entry.getValue();
            try {
                g9 g9VarE = n1.g.e(str6, str5);
                if (g9VarE != null) {
                    linkedHashSet.add(g9VarE);
                }
            } catch (Exception e3) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                String str7 = str3;
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                String str8 = str2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t1$$ExternalSyntheticLambda1(str6, str5, 0), 4, (Object) null);
                com.braze.storage.f fVar2 = this.a;
                DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                    linkedHashMap3 = new LinkedHashMap();
                    str = str7;
                } else {
                    str = str7;
                    try {
                        Object data2 = fVar2.readData(dataStoreKey2, str);
                        data2.getClass();
                        String str9 = (String) data2;
                        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str9)) {
                            linkedHashMap2 = new LinkedHashMap();
                        } else {
                            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str9)) {
                                Object[] objArr7 = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str9).toString(), str8};
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
                                    try {
                                        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2 = displayInAppMessagelambda1.serializer(String.class);
                                        if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                            beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                            int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                            int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                            beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed2, beforeinappmessageviewclosed2});
                                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls5))) {
                                            Object[] objArr8 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                            beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr8);
                                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls4))) {
                                            Object[] objArr9 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                            beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr9);
                                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls3))) {
                                            Object[] objArr10 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                            beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr10);
                                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls2))) {
                                            Object[] objArr11 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                            beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr11);
                                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.equals(displayInAppMessagelambda1.serializer(cls))) {
                                            Object[] objArr12 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                            beforeopened2 = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr12);
                                        } else {
                                            BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) q1.a, 6, (Object) null);
                                        }
                                        Object objSerializer2 = resetTransientState.read.serializer(str9, beforeopened2);
                                        objSerializer2.getClass();
                                        map2 = (Map) objSerializer2;
                                    } catch (Exception e4) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str9), 4, (Object) null);
                                    }
                                }
                                linkedHashMap2 = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map2));
                            }
                            map2 = simpleItemTouchHelperCallback;
                            linkedHashMap2 = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map2));
                        }
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                        linkedHashMap2 = new LinkedHashMap();
                    }
                    linkedHashMap3 = linkedHashMap2;
                }
                pauseWebviewIfNecessarylambda10.serializer(linkedHashMap3).remove(str5);
                com.braze.storage.f fVar3 = this.a;
                DataStoreKey dataStoreKey3 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey3), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                        try {
                            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                            isverticalswipeinalloweddirection.getClass();
                            beforeInAppMessageViewClosed beforeinappmessageviewclosed3 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                            strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeinappmessageviewclosed3, beforeinappmessageviewclosed3), linkedHashMap3);
                        } catch (Exception e6) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e6, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                            if (linkedHashMap3 == null && (linkedHashMap3 instanceof List)) {
                                strRemoteActionCompatParcelizer = "[]";
                            } else {
                                strRemoteActionCompatParcelizer = "{}";
                            }
                        }
                        fVar3.writeData(dataStoreKey3, strRemoteActionCompatParcelizer);
                    } catch (Exception e7) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e7, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey3), 8, (Object) null);
                        str3 = str;
                        str2 = str8;
                        linkedHashSet = linkedHashSet2;
                    }
                }
                str3 = str;
                str2 = str8;
                linkedHashSet = linkedHashSet2;
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Could not create BrazeEvent from [serialized event string=", str, ", unique identifier=", str2, "] ... Deleting!");
    }

    public final void a(g9 g9Var) {
        Map linkedHashMap;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        g9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 6), 7, (Object) null);
        com.braze.storage.f fVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = fVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(String.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                                    Object[] objArr2 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                                    Object[] objArr3 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                                    Object[] objArr4 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                                    Object[] objArr5 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr5);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                                    Object[] objArr6 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr6);
                                } else {
                                    BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) p1.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str), 4, (Object) null);
                            }
                        }
                    }
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        n1 n1Var = (n1) g9Var;
        String str2 = n1Var.d;
        String string = n1Var.forJsonPut().toString();
        string.getClass();
        linkedHashMap.put(str2, string);
        com.braze.storage.f fVar2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                beforeInAppMessageViewClosed beforeinappmessageviewclosed2 = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeinappmessageviewclosed2, beforeinappmessageviewclosed2), linkedHashMap);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            fVar2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String a() {
        return "Storage provider is closed. Not getting all events.";
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Deleting event from storage with uid ", str);
    }

    public static final String b(g9 g9Var) {
        return "Storage provider is closed. Not adding event: " + g9Var;
    }

    public static final String b(Set set) {
        return "Storage provider is closed. Not deleting events: " + set;
    }
}
