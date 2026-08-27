package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.MediaSessionCompatQueueItem;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onContentCardDismissed;
import o.onDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.requestDisplayInAppMessagelambda7;
import o.resetAfterInAppMessageCloselambda2;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o8 {
    public final z7 a;
    public final u9 b;
    public final df c;
    public final h2 d;
    public final com.braze.storage.h e;
    public List f;
    public final AtomicBoolean g;
    public final AtomicInteger h;

    public static final String g() {
        return "Features flags have moved to disabled. Clearing feature flag data.";
    }

    public final void c() {
        ArrayList arrayList;
        List list;
        com.braze.storage.h hVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = hVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(FeatureFlag.Companion.serializer(), 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                                list = instance_delegatelambda0Var;
                            }
                        }
                        arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                    }
                    list = instance_delegatelambda0Var;
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(0), 6, (Object) null);
            this.f = instance_delegatelambda0Var;
        } else {
            this.f = arrayList;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda8(1, arrayList), 7, (Object) null);
        }
    }

    public final void e() {
        m2 m2Var = m2.CLIENT_INITIATED;
        m2Var.getClass();
        if (this.h.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda0(this, 1), 7, (Object) null);
            return;
        }
        int iN = this.c.n();
        if (iN <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(iN, 4), 6, (Object) null);
            this.a.b(new q8(), q8.class);
            return;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        Object data = this.e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        data.getClass();
        if (jNowInSeconds - ((Long) data).longValue() >= iN) {
            this.d.a(m2Var);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda11(this, jNowInSeconds, iN), 6, (Object) null);
            this.a.b(new q8(), q8.class);
        }
    }

    public o8(Context context, String str, String str2, z7 z7Var, u9 u9Var, df dfVar, h2 h2Var) {
        context.getClass();
        str.getClass();
        z7Var.getClass();
        u9Var.getClass();
        dfVar.getClass();
        h2Var.getClass();
        this.a = z7Var;
        this.b = u9Var;
        this.c = dfVar;
        this.d = h2Var;
        this.e = new com.braze.storage.h(context, str2, str);
        this.f = instance_delegatelambda0.write;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicInteger(0);
        c();
        f();
    }

    public final void a(String str) {
        Map linkedHashMap;
        beforeOpened beforeopened;
        str.getClass();
        FeatureFlag featureFlag = (FeatureFlag) onContentCardDismissed.MediaMetadataCompat((List) c(str));
        if ((featureFlag != null ? featureFlag.getTrackingString$android_sdk_base_release() : null) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 19), 6, (Object) null);
            return;
        }
        String id = featureFlag.getId();
        id.getClass();
        com.braze.storage.h hVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = hVar.readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString(), "null"}, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Boolean.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer});
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) n8.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str2, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str2), 4, (Object) null);
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
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{linkedHashMap.get(id), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda25(featureFlag, 1), 6, (Object) null);
            return;
        }
        g9 g9VarA = n1.g.a(featureFlag);
        if (g9VarA != null) {
            this.d.a(g9VarA);
        }
        d(featureFlag.getId());
    }

    public final void d(String str) {
        Map linkedHashMap;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        str.getClass();
        com.braze.storage.h hVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = hVar.readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Boolean.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) m8.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str2, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str2), 4, (Object) null);
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
        linkedHashMap.put(str, Boolean.TRUE);
        com.braze.storage.h hVar2 = this.e;
        DataStoreKey dataStoreKey2 = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write), linkedHashMap);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = "{}";
                }
                hVar2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 18), 7, (Object) null);
    }

    public final void h() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(jNowInSeconds, 6), 6, (Object) null);
        this.e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(jNowInSeconds));
    }

    public final void f() {
        final int i = 0;
        this.a.c(jd.class, new IEventSubscriber(this) { // from class: bo.app.o8$$ExternalSyntheticLambda1
            public final /* synthetic */ o8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                o8 o8Var = this.f$0;
                if (i2 == 0) {
                    o8.a(o8Var, (jd) obj);
                    return;
                }
                if (i2 == 1) {
                    o8.a(o8Var, (id) obj);
                    return;
                }
                if (i2 == 2) {
                    o8.a(o8Var, (r8) obj);
                } else if (i2 != 3) {
                    o8.a(o8Var, (u3) obj);
                } else {
                    o8.a(o8Var, (q8) obj);
                }
            }
        });
        final int i2 = 1;
        this.a.c(id.class, new IEventSubscriber(this) { // from class: bo.app.o8$$ExternalSyntheticLambda1
            public final /* synthetic */ o8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i3 = i2;
                o8 o8Var = this.f$0;
                if (i3 == 0) {
                    o8.a(o8Var, (jd) obj);
                    return;
                }
                if (i3 == 1) {
                    o8.a(o8Var, (id) obj);
                    return;
                }
                if (i3 == 2) {
                    o8.a(o8Var, (r8) obj);
                } else if (i3 != 3) {
                    o8.a(o8Var, (u3) obj);
                } else {
                    o8.a(o8Var, (q8) obj);
                }
            }
        });
        final int i3 = 2;
        this.a.c(r8.class, new IEventSubscriber(this) { // from class: bo.app.o8$$ExternalSyntheticLambda1
            public final /* synthetic */ o8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i4 = i3;
                o8 o8Var = this.f$0;
                if (i4 == 0) {
                    o8.a(o8Var, (jd) obj);
                    return;
                }
                if (i4 == 1) {
                    o8.a(o8Var, (id) obj);
                    return;
                }
                if (i4 == 2) {
                    o8.a(o8Var, (r8) obj);
                } else if (i4 != 3) {
                    o8.a(o8Var, (u3) obj);
                } else {
                    o8.a(o8Var, (q8) obj);
                }
            }
        });
        final int i4 = 3;
        this.a.c(q8.class, new IEventSubscriber(this) { // from class: bo.app.o8$$ExternalSyntheticLambda1
            public final /* synthetic */ o8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i5 = i4;
                o8 o8Var = this.f$0;
                if (i5 == 0) {
                    o8.a(o8Var, (jd) obj);
                    return;
                }
                if (i5 == 1) {
                    o8.a(o8Var, (id) obj);
                    return;
                }
                if (i5 == 2) {
                    o8.a(o8Var, (r8) obj);
                } else if (i5 != 3) {
                    o8.a(o8Var, (u3) obj);
                } else {
                    o8.a(o8Var, (q8) obj);
                }
            }
        });
        final int i5 = 4;
        this.a.c(u3.class, new IEventSubscriber(this) { // from class: bo.app.o8$$ExternalSyntheticLambda1
            public final /* synthetic */ o8 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i6 = i5;
                o8 o8Var = this.f$0;
                if (i6 == 0) {
                    o8.a(o8Var, (jd) obj);
                    return;
                }
                if (i6 == 1) {
                    o8.a(o8Var, (id) obj);
                    return;
                }
                if (i6 == 2) {
                    o8.a(o8Var, (r8) obj);
                } else if (i6 != 3) {
                    o8.a(o8Var, (u3) obj);
                } else {
                    o8.a(o8Var, (q8) obj);
                }
            }
        });
    }

    public static final String b(o8 o8Var) {
        return MediaSessionCompatQueueItem.read("Added new Feature Flags:", " to DataStore.", o8Var.f);
    }

    public static final String b(String str) {
        return ff$$ExternalSyntheticOutline0.m("Not logging a Feature Flag impression for Feature Flag with id ", str, ". The Feature Flag was not part of any matching campaign");
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public static final String e(String str) {
        return ff$$ExternalSyntheticOutline0.m("Stored impression logged for Feature Flag with id:", str, ".");
    }

    public final ArrayList c(String str) {
        List list = this.f;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Object[] objArr = {((FeatureFlag) obj).getId(), str};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList2;
    }

    public static final void a(o8 o8Var, u3 u3Var) {
        u3Var.getClass();
        if (!u3Var.a.m || u3Var.b.m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o8Var, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(14), 7, (Object) null);
        o8Var.a();
    }

    public static final void a(o8 o8Var, jd jdVar) {
        jdVar.getClass();
        if (jdVar.a instanceof s8) {
            o8Var.h.incrementAndGet();
        }
    }

    public static final void a(o8 o8Var, id idVar) {
        idVar.getClass();
        if (idVar.a instanceof s8) {
            o8Var.h.decrementAndGet();
        }
    }

    public static final String a(o8 o8Var, long j, int i) {
        Object data = o8Var.e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        data.getClass();
        return m1$$ExternalSyntheticOutline0.m((((Long) data).longValue() - j) + ((long) i), "Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. ", " seconds remaining until next available refresh.");
    }

    public static final void a(o8 o8Var, r8 r8Var) {
        r8Var.getClass();
        o8Var.g.set(true);
        o8Var.h();
    }

    public static final void a(o8 o8Var, q8 q8Var) {
        q8Var.getClass();
        o8Var.g.set(true);
        if (o8Var.g.get()) {
            List list = o8Var.f;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((z7) o8Var.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public static final String d() {
        return "Did not find stored Feature Flags in DataStore.";
    }

    public static final String a(o8 o8Var) {
        return d$$ExternalSyntheticOutline0.m(o8Var.h.get(), "Not refreshing Feature Flags since another ", " request is currently in-flight.");
    }

    public static final String a(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Feature Flags refresh rate limit is ", "; refreshes are disabled by server config. Not refreshing Feature Flags.");
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray jSONArray) {
        String strRemoteActionCompatParcelizer;
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        requestDisplayInAppMessagelambda7 requestdisplayinappmessagelambda7 = resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(jSONArray.length())}, BackspaceCommand.write(), -281231677, BackspaceCommand.write())), new t8(jSONArray));
        u8 u8Var = new u8(jSONArray);
        Iterator it = requestdisplayinappmessagelambda7.iterator();
        while (it.hasNext()) {
            FeatureFlag featureFlagA = com.braze.support.e.a.a((JSONObject) u8Var.invoke(it.next()));
            if (featureFlagA != null) {
                arrayList.add(featureFlagA);
            }
        }
        this.f = arrayList;
        com.braze.storage.h hVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(FeatureFlag.Companion.serializer(), 0), arrayList);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = arrayList instanceof Map ? "{}" : "[]";
                }
                hVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda0(this, 0), 7, (Object) null);
        List list = this.f;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    public static final String a(FeatureFlag featureFlag) {
        return ff$$ExternalSyntheticOutline0.m("Not logging a Feature Flag impression for Feature Flag with id ", featureFlag.getId(), ". The Feature Flag already had an impression logged in the current session");
    }

    public static final String a(long j) {
        return af$$ExternalSyntheticOutline0.m(j, "Updating last Feature Flags refresh time: ");
    }

    public static final String a(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Loaded ", " Feature Flags from DataStore.");
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(13), 7, (Object) null);
        this.e.clearData(DataStoreKey.FEATURE_FLAGS);
        this.f = instance_delegatelambda0.write;
        if (this.g.get()) {
            List list = this.f;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((z7) this.b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
