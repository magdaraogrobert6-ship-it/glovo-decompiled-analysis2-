package com.roadrunner.rider.state.provider.database.dao;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ObjectInputFilterStream;
import o.OnEventTrackingSucceededListener;
import o.createFromParcel;
import o.getAndroidLogLevel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShiftInfoDao {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public static Object clearAndInsert$suspendImpl(ShiftInfoDao shiftInfoDao, OnEventTrackingSucceededListener onEventTrackingSucceededListener, ContinuationImpl continuationImpl) throws Throwable {
        ObjectInputFilterStream objectInputFilterStream;
        int i = 2 % 2;
        if (continuationImpl instanceof ObjectInputFilterStream) {
            objectInputFilterStream = (ObjectInputFilterStream) continuationImpl;
            int i2 = objectInputFilterStream.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = read + 87;
                write = i3 % Fields.SpotShadowColor;
                objectInputFilterStream.write = i3 % 2 != 0 ? i2 % Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                objectInputFilterStream = new ObjectInputFilterStream(shiftInfoDao, continuationImpl);
            }
        } else {
            objectInputFilterStream = new ObjectInputFilterStream(shiftInfoDao, continuationImpl);
        }
        Object obj = objectInputFilterStream.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = objectInputFilterStream.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objectInputFilterStream.IconCompatParcelizer = shiftInfoDao;
            objectInputFilterStream.serializer = onEventTrackingSucceededListener;
            objectInputFilterStream.write = 1;
            Object objPerformSuspending = TuplesKt.performSuspending(((getAndroidLogLevel) shiftInfoDao).write, false, true, new MapApiError$$ExternalSyntheticLambda1(27), objectInputFilterStream);
            if (objPerformSuspending == coroutineSingletons) {
                int i5 = read + 105;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 3;
                }
            } else {
                objPerformSuspending = createfromparcel;
            }
            if (objPerformSuspending != coroutineSingletons) {
            }
        }
        if (i4 != 1) {
            int i7 = read + 121;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? i4 != 2 : i4 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        onEventTrackingSucceededListener = objectInputFilterStream.serializer;
        shiftInfoDao = objectInputFilterStream.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i8 = write + 71;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        objectInputFilterStream.IconCompatParcelizer = null;
        objectInputFilterStream.serializer = null;
        objectInputFilterStream.write = 2;
        getAndroidLogLevel getandroidloglevel = (getAndroidLogLevel) shiftInfoDao;
        Object objPerformSuspending2 = TuplesKt.performSuspending(getandroidloglevel.write, false, true, new Recomposer$$ExternalSyntheticLambda4(getandroidloglevel, 28, onEventTrackingSucceededListener), objectInputFilterStream);
        if (objPerformSuspending2 != coroutineSingletons) {
            objPerformSuspending2 = createfromparcel;
        }
        return objPerformSuspending2 == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }
}
