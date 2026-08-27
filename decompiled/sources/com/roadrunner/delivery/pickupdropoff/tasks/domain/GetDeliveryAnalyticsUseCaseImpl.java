package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.PreviewLogger;
import o.getPositionannotations;
import o.isItemDismissable;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDeliveryAnalyticsUseCaseImpl {
    private static int read = 0;
    private static int write = 1;
    public final TasksRepository serializer;

    public GetDeliveryAnalyticsUseCaseImpl(TasksRepository tasksRepository) {
        tasksRepository.getClass();
        this.serializer = tasksRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    public final Object m4939invoke0E7RQCE(long j, String str, ContinuationImpl continuationImpl) {
        GetDeliveryAnalyticsUseCaseImpl$invoke$1 getDeliveryAnalyticsUseCaseImpl$invoke$1;
        String str2;
        Object obj;
        int i;
        int i2;
        Object objM4934getDeliveryTrackingEvents0E7RQCE$implementation;
        getPositionannotations getpositionannotations;
        int i3 = 2 % 2;
        if (continuationImpl instanceof GetDeliveryAnalyticsUseCaseImpl$invoke$1) {
            getDeliveryAnalyticsUseCaseImpl$invoke$1 = (GetDeliveryAnalyticsUseCaseImpl$invoke$1) continuationImpl;
            int i4 = getDeliveryAnalyticsUseCaseImpl$invoke$1.RatingCompat;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 77;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getDeliveryAnalyticsUseCaseImpl$invoke$1.RatingCompat = i4 - Integer.MIN_VALUE;
            } else {
                getDeliveryAnalyticsUseCaseImpl$invoke$1 = new GetDeliveryAnalyticsUseCaseImpl$invoke$1(this, continuationImpl);
                int i7 = read + 1;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            getDeliveryAnalyticsUseCaseImpl$invoke$1 = new GetDeliveryAnalyticsUseCaseImpl$invoke$1(this, continuationImpl);
            int i9 = read + 1;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Object obj2 = getDeliveryAnalyticsUseCaseImpl$invoke$1.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = getDeliveryAnalyticsUseCaseImpl$invoke$1.RatingCompat;
        TasksRepository tasksRepository = this.serializer;
        try {
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("GetDeliveryAnalyticsUseCaseImpl: invoke called", new Object[0]);
                getDeliveryAnalyticsUseCaseImpl$invoke$1.read = str;
                getDeliveryAnalyticsUseCaseImpl$invoke$1.serializer = j;
                getDeliveryAnalyticsUseCaseImpl$invoke$1.IconCompatParcelizer = 0;
                getDeliveryAnalyticsUseCaseImpl$invoke$1.write = 0;
                getDeliveryAnalyticsUseCaseImpl$invoke$1.RatingCompat = 1;
                Object objM4933getDeliveryAnalytics0E7RQCE$implementation = tasksRepository.m4933getDeliveryAnalytics0E7RQCE$implementation(j, str, getDeliveryAnalyticsUseCaseImpl$invoke$1);
                if (objM4933getDeliveryAnalytics0E7RQCE$implementation == coroutineSingletons) {
                    int i12 = read + 59;
                    write = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    str2 = str;
                    obj = objM4933getDeliveryAnalytics0E7RQCE$implementation;
                    i = 0;
                    i2 = 0;
                }
                return coroutineSingletons;
            }
            if (i11 != 1) {
                int i14 = write + 41;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (i11 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getpositionannotations = getDeliveryAnalyticsUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                objM4934getDeliveryTrackingEvents0E7RQCE$implementation = ((onItemDismiss) obj2).IconCompatParcelizer;
            } else {
                int i16 = getDeliveryAnalyticsUseCaseImpl$invoke$1.write;
                int i17 = getDeliveryAnalyticsUseCaseImpl$invoke$1.IconCompatParcelizer;
                long j2 = getDeliveryAnalyticsUseCaseImpl$invoke$1.serializer;
                String str3 = getDeliveryAnalyticsUseCaseImpl$invoke$1.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                str2 = str3;
                obj = ((onItemDismiss) obj2).IconCompatParcelizer;
                i = i16;
                i2 = i17;
                j = j2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objM4934getDeliveryTrackingEvents0E7RQCE$implementation);
            return new PreviewLogger(getpositionannotations, (List) objM4934getDeliveryTrackingEvents0E7RQCE$implementation);
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getPositionannotations getpositionannotations2 = (getPositionannotations) obj;
            getDeliveryAnalyticsUseCaseImpl$invoke$1.read = null;
            getDeliveryAnalyticsUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = getpositionannotations2;
            getDeliveryAnalyticsUseCaseImpl$invoke$1.serializer = j;
            getDeliveryAnalyticsUseCaseImpl$invoke$1.IconCompatParcelizer = i2;
            getDeliveryAnalyticsUseCaseImpl$invoke$1.write = i;
            getDeliveryAnalyticsUseCaseImpl$invoke$1.RatingCompat = 2;
            objM4934getDeliveryTrackingEvents0E7RQCE$implementation = tasksRepository.m4934getDeliveryTrackingEvents0E7RQCE$implementation(j, str2, getDeliveryAnalyticsUseCaseImpl$invoke$1);
            if (objM4934getDeliveryTrackingEvents0E7RQCE$implementation != coroutineSingletons) {
                getpositionannotations = getpositionannotations2;
                ExtrasKt.RemoteActionCompatParcelizer(objM4934getDeliveryTrackingEvents0E7RQCE$implementation);
                return new PreviewLogger(getpositionannotations, (List) objM4934getDeliveryTrackingEvents0E7RQCE$implementation);
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
            return new isItemDismissable(th);
        }
    }
}
