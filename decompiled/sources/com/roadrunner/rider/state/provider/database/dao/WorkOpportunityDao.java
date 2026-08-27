package com.roadrunner.rider.state.provider.database.dao;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.IInAppMessageViewWrapperFactory;
import o.createFromParcel;
import o.onAdidRead;
import o.resolveClass;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkOpportunityDao {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static Object clearAndInsert$suspendImpl(WorkOpportunityDao workOpportunityDao, List list, ContinuationImpl continuationImpl) throws Throwable {
        onAdidRead onadidread;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof onAdidRead) {
            onadidread = (onAdidRead) continuationImpl;
            int i3 = onadidread.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onadidread.write = i3 - Integer.MIN_VALUE;
            } else {
                onadidread = new onAdidRead(workOpportunityDao, continuationImpl);
            }
        } else {
            onadidread = new onAdidRead(workOpportunityDao, continuationImpl);
        }
        Object obj = onadidread.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = onadidread.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = 1;
        Object obj2 = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            onadidread.RemoteActionCompatParcelizer = workOpportunityDao;
            onadidread.read = list;
            onadidread.write = 1;
            Object objPerformSuspending = TuplesKt.performSuspending(((resolveClass) workOpportunityDao).serializer, false, true, new MapApiError$$ExternalSyntheticLambda1(29), onadidread);
            if (objPerformSuspending != coroutineSingletons) {
                objPerformSuspending = createfromparcel;
            }
            if (objPerformSuspending != coroutineSingletons) {
            }
            i = serializer + 43;
            write = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                return coroutineSingletons;
            }
            obj2.hashCode();
            throw null;
        }
        int i6 = write;
        int i7 = i6 + 45;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0 ? i4 != 1 : i4 != 0) {
            if (i4 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = write + 51;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i9 = i6 + 121;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            List list2 = onadidread.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i11 = write + 43;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return createfromparcel;
            }
            obj2.hashCode();
            throw null;
        }
        list = onadidread.read;
        workOpportunityDao = onadidread.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        onadidread.RemoteActionCompatParcelizer = null;
        onadidread.read = null;
        onadidread.write = 2;
        resolveClass resolveclass = (resolveClass) workOpportunityDao;
        Object objPerformSuspending2 = TuplesKt.performSuspending(resolveclass.serializer, false, true, new IInAppMessageViewWrapperFactory(resolveclass, i5, list), onadidread);
        if (objPerformSuspending2 != coroutineSingletons) {
            objPerformSuspending2 = createfromparcel;
        }
        if (objPerformSuspending2 != coroutineSingletons) {
            return createfromparcel;
        }
        i = serializer + 43;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return coroutineSingletons;
        }
        obj2.hashCode();
        throw null;
    }
}
