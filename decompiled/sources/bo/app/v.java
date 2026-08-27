package bo.app;

import coil3.ExtrasKt;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.afterClosed;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class v extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.b = arrayList;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        v vVar = new v(this.b, this.c, shortNewsContentCardView);
        vVar.a = obj;
        return vVar;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object[] objArr = {DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT.getKey()};
        int iWrite = BackspaceCommand.write();
        isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite);
        backwardfocussearch.getClass();
        String str = (String) backwardfocussearch.RemoteActionCompatParcelizer.get(isroot);
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
            linkedHashMap = new LinkedHashMap();
        } else {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2);
            Map map = SimpleItemTouchHelperCallback.serializer;
            if (!zSerializer) {
                Object[] objArr2 = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString(), "null"};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    try {
                        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Long.class);
                        if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                            beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                            beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                            Object[] objArr3 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                            beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                            Object[] objArr4 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                            beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4);
                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                            Object[] objArr5 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                            beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr5);
                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                            Object[] objArr6 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                            beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr6);
                        } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                            Object[] objArr7 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                            beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr7);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) u.a, 6, (Object) null);
                        }
                        Object objSerializer = resetTransientState.read.serializer(str2, beforeopened);
                        objSerializer.getClass();
                        map = (Map) objSerializer;
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str2), 4, (Object) null);
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(map);
        }
        ArrayList arrayList = this.b;
        long j = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            linkedHashMap.put((String) obj2, new Long(j));
        }
        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMap);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
            strRemoteActionCompatParcelizer = "{}";
        }
        backwardfocussearch.serializer(isroot, strRemoteActionCompatParcelizer);
        return createFromParcel.INSTANCE;
    }
}
