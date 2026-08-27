package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.AnimatedVisibilitySearchInfo;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.uiMode;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateTaskUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final TasksRepository read;

    public UpdateTaskUseCaseImpl(TasksRepository tasksRepository) {
        tasksRepository.getClass();
        this.read = tasksRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[PHI: r6 r9
  0x003a: PHI (r6v8 o.AnimatedVisibilitySearchInfo) = (r6v7 o.AnimatedVisibilitySearchInfo), (r6v10 o.AnimatedVisibilitySearchInfo) binds: [B:10:0x0038, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r9v11 int) = (r9v10 int), (r9v13 int) binds: [B:10:0x0038, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    /* JADX WARN: Code duplicated, block: B:78:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x011f A[SYNTHETIC] */
    public final Object invoke(long j, String str, uiMode uimode, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, ShortNewsContentCardView shortNewsContentCardView) {
        AnimatedVisibilitySearchInfo animatedVisibilitySearchInfo;
        uiMode uimode2;
        uiMode uimode3;
        Object objM4932getCachedTasks0E7RQCE$implementation;
        String str2;
        int i;
        int i2;
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk2;
        long j2;
        ArrayList arrayList;
        uiMode uimode4;
        int i3;
        Throwable thSerializer;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer;
        int i7 = i6 + 35;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (!(shortNewsContentCardView instanceof AnimatedVisibilitySearchInfo)) {
            animatedVisibilitySearchInfo = new AnimatedVisibilitySearchInfo(this, shortNewsContentCardView);
        } else {
            int i9 = i6 + 125;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                animatedVisibilitySearchInfo = (AnimatedVisibilitySearchInfo) shortNewsContentCardView;
                i4 = animatedVisibilitySearchInfo.RatingCompat;
                int i10 = 46 / 0;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    animatedVisibilitySearchInfo.RatingCompat = i4 - Integer.MIN_VALUE;
                } else {
                    animatedVisibilitySearchInfo = new AnimatedVisibilitySearchInfo(this, shortNewsContentCardView);
                }
            } else {
                animatedVisibilitySearchInfo = (AnimatedVisibilitySearchInfo) shortNewsContentCardView;
                i4 = animatedVisibilitySearchInfo.RatingCompat;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    animatedVisibilitySearchInfo.RatingCompat = i4 - Integer.MIN_VALUE;
                } else {
                    animatedVisibilitySearchInfo = new AnimatedVisibilitySearchInfo(this, shortNewsContentCardView);
                }
            }
        }
        Object objUpdateTaskCache$implementation = animatedVisibilitySearchInfo.MediaSessionCompatQueueItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = animatedVisibilitySearchInfo.RatingCompat;
        try {
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objUpdateTaskCache$implementation);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("UpdateTaskUseCaseImpl: invoke called", new Object[0]);
                try {
                    TasksRepository tasksRepository = this.read;
                    animatedVisibilitySearchInfo.RemoteActionCompatParcelizer = str;
                    try {
                        animatedVisibilitySearchInfo.read = uimode;
                        animatedVisibilitySearchInfo.MediaDescriptionCompat = r8lambdaucgighn8fiyv_vccodeafjfpedk;
                        animatedVisibilitySearchInfo.serializer = j;
                        animatedVisibilitySearchInfo.write = 0;
                        animatedVisibilitySearchInfo.IconCompatParcelizer = 0;
                        animatedVisibilitySearchInfo.RatingCompat = 1;
                        objM4932getCachedTasks0E7RQCE$implementation = tasksRepository.m4932getCachedTasks0E7RQCE$implementation(j, str, animatedVisibilitySearchInfo);
                        if (objM4932getCachedTasks0E7RQCE$implementation != coroutineSingletons) {
                            str2 = str;
                            i = 0;
                            i2 = 0;
                            r8lambdaucgighn8fiyv_vccodeafjfpedk2 = r8lambdaucgighn8fiyv_vccodeafjfpedk;
                            uimode3 = uimode;
                            j2 = j;
                            ExtrasKt.RemoteActionCompatParcelizer(objM4932getCachedTasks0E7RQCE$implementation);
                            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk<uiMode> r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objM4932getCachedTasks0E7RQCE$implementation;
                            arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
                            for (uiMode uimode5 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                                int i12 = RemoteActionCompatParcelizer + 65;
                                serializer = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedk2.read(uimode5)) {
                                    int i14 = RemoteActionCompatParcelizer + 61;
                                    serializer = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{uimode5.IconCompatParcelizer(), uimode3.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                                        i3 = RemoteActionCompatParcelizer + 67;
                                        serializer = i3 % Fields.SpotShadowColor;
                                        if (i3 % 2 == 0) {
                                            throw null;
                                        }
                                        uimode5 = uimode3;
                                    } else {
                                        continue;
                                    }
                                }
                                arrayList.add(uimode5);
                            }
                            TasksRepository tasksRepository2 = this.read;
                            animatedVisibilitySearchInfo.RemoteActionCompatParcelizer = null;
                            animatedVisibilitySearchInfo.read = uimode3;
                            animatedVisibilitySearchInfo.MediaDescriptionCompat = null;
                            animatedVisibilitySearchInfo.serializer = j2;
                            animatedVisibilitySearchInfo.write = i2;
                            animatedVisibilitySearchInfo.IconCompatParcelizer = i;
                            animatedVisibilitySearchInfo.RatingCompat = 2;
                            objUpdateTaskCache$implementation = tasksRepository2.updateTaskCache$implementation(j2, str2, arrayList, animatedVisibilitySearchInfo);
                            if (objUpdateTaskCache$implementation != coroutineSingletons) {
                                uimode4 = uimode3;
                                thSerializer = onItemDismiss.serializer(objUpdateTaskCache$implementation);
                                if (thSerializer != null) {
                                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("UpdateTaskUseCaseImpl: unable to update the tasks ", uimode4.IconCompatParcelizer()), new Object[0]);
                                }
                                return createFromParcel.INSTANCE;
                            }
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        uimode3 = uimode;
                        uimode2 = uimode3;
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                        objUpdateTaskCache$implementation = new isItemDismissable(th);
                        uimode4 = uimode2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    uimode2 = uimode;
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                    objUpdateTaskCache$implementation = new isItemDismissable(th);
                    uimode4 = uimode2;
                }
            } else {
                if (i11 == 1) {
                    i = animatedVisibilitySearchInfo.IconCompatParcelizer;
                    i2 = animatedVisibilitySearchInfo.write;
                    j2 = animatedVisibilitySearchInfo.serializer;
                    r8lambdaucgighn8fiyv_vccodeafjfpedk2 = animatedVisibilitySearchInfo.MediaDescriptionCompat;
                    uimode3 = animatedVisibilitySearchInfo.read;
                    str2 = animatedVisibilitySearchInfo.RemoteActionCompatParcelizer;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objUpdateTaskCache$implementation);
                        objM4932getCachedTasks0E7RQCE$implementation = ((onItemDismiss) objUpdateTaskCache$implementation).IconCompatParcelizer;
                        ExtrasKt.RemoteActionCompatParcelizer(objM4932getCachedTasks0E7RQCE$implementation);
                        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk<uiMode> r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objM4932getCachedTasks0E7RQCE$implementation;
                        arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, 10));
                        while (r4.hasNext()) {
                            int i16 = RemoteActionCompatParcelizer + 65;
                            serializer = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            if (r8lambdaucgighn8fiyv_vccodeafjfpedk2.read(uimode5)) {
                                int i18 = RemoteActionCompatParcelizer + 61;
                                serializer = i18 % Fields.SpotShadowColor;
                                int i19 = i18 % 2;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{uimode5.IconCompatParcelizer(), uimode3.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                                    i3 = RemoteActionCompatParcelizer + 67;
                                    serializer = i3 % Fields.SpotShadowColor;
                                    if (i3 % 2 == 0) {
                                        throw null;
                                    }
                                    uimode5 = uimode3;
                                } else {
                                    continue;
                                }
                            }
                            arrayList.add(uimode5);
                        }
                        TasksRepository tasksRepository3 = this.read;
                        animatedVisibilitySearchInfo.RemoteActionCompatParcelizer = null;
                        animatedVisibilitySearchInfo.read = uimode3;
                        animatedVisibilitySearchInfo.MediaDescriptionCompat = null;
                        animatedVisibilitySearchInfo.serializer = j2;
                        animatedVisibilitySearchInfo.write = i2;
                        animatedVisibilitySearchInfo.IconCompatParcelizer = i;
                        animatedVisibilitySearchInfo.RatingCompat = 2;
                        objUpdateTaskCache$implementation = tasksRepository3.updateTaskCache$implementation(j2, str2, arrayList, animatedVisibilitySearchInfo);
                        if (objUpdateTaskCache$implementation != coroutineSingletons) {
                            uimode4 = uimode3;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        uimode2 = uimode3;
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                        objUpdateTaskCache$implementation = new isItemDismissable(th);
                        uimode4 = uimode2;
                    }
                } else if (i11 == 2) {
                    uimode4 = animatedVisibilitySearchInfo.read;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objUpdateTaskCache$implementation);
                    } catch (Throwable th4) {
                        th = th4;
                        uimode2 = uimode4;
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "runSuspendCatching: Failed to execute suspend task", new Object[0]);
                        objUpdateTaskCache$implementation = new isItemDismissable(th);
                        uimode4 = uimode2;
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                thSerializer = onItemDismiss.serializer(objUpdateTaskCache$implementation);
                if (thSerializer != null) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("UpdateTaskUseCaseImpl: unable to update the tasks ", uimode4.IconCompatParcelizer()), new Object[0]);
                }
                return createFromParcel.INSTANCE;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
