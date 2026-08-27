package bo.app;

import coil3.ExtrasKt;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.createFromParcel;
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
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class bc extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public setCustomInAppMessageAnimationFactorylambda0 a;
    public com.braze.storage.i b;
    public String c;
    public int d;
    public final /* synthetic */ com.braze.storage.i e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.braze.storage.i iVar, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.e = iVar;
        this.f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new bc(this.e, this.f, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new bc(this.e, this.f, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0212  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.braze.storage.i iVar;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        String str;
        Map linkedHashMap;
        Map map;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            iVar = this.e;
            setcustominappmessageanimationfactorylambda0 = iVar.a;
            str = this.f;
            this.a = setcustominappmessageanimationfactorylambda0;
            this.b = iVar;
            this.c = str;
            this.d = 1;
            if (setcustominappmessageanimationfactorylambda0.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = this.c;
            iVar = this.b;
            setcustominappmessageanimationfactorylambda0 = this.a;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str = str2;
        }
        try {
            DataStoreKey dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = iVar.readData(dataStoreKey, "");
                    data.getClass();
                    String str3 = (String) data;
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3);
                        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                        if (zSerializer) {
                            map = simpleItemTouchHelperCallback;
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hideCurrentlyDisplayingInAppMessage.read((CharSequence) str3).toString(), "null"}, getCieXyz.write())).booleanValue()) {
                                map = simpleItemTouchHelperCallback;
                            } else {
                                try {
                                    r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Integer.class);
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ac.a, 6, (Object) null);
                                        map = simpleItemTouchHelperCallback;
                                    }
                                    Object objSerializer = resetTransientState.read.serializer(str3, beforeopened);
                                    objSerializer.getClass();
                                    map = (Map) objSerializer;
                                } catch (Exception e) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str3), 4, (Object) null);
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
            Integer num = (Integer) linkedHashMap.get(str);
            linkedHashMap.put(str, new Integer((num != null ? num.intValue() : 0) + 1));
            DataStoreKey dataStoreKey2 = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer), linkedHashMap);
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = "{}";
                    }
                    iVar.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
                }
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            setcustominappmessageanimationfactorylambda0.write(null);
            return createfromparcel;
        } catch (Throwable th) {
            setcustominappmessageanimationfactorylambda0.write(null);
            throw th;
        }
    }
}
