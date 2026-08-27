package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.removeNodeAtDepth;
import o.uiMode;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetTaskByTypeAndIdUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final TasksRepository write;

    public GetTaskByTypeAndIdUseCaseImpl(TasksRepository tasksRepository) {
        tasksRepository.getClass();
        this.write = tasksRepository;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[Catch: all -> 0x0173, CancellationException -> 0x0191, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:18:0x005a, B:33:0x00a0, B:35:0x00ab, B:37:0x00cc, B:39:0x00d9, B:41:0x00df, B:44:0x0111, B:47:0x0117, B:49:0x0136, B:52:0x013d, B:25:0x0072, B:27:0x0085), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc A[Catch: all -> 0x0173, CancellationException -> 0x0191, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:18:0x005a, B:33:0x00a0, B:35:0x00ab, B:37:0x00cc, B:39:0x00d9, B:41:0x00df, B:44:0x0111, B:47:0x0117, B:49:0x0136, B:52:0x013d, B:25:0x0072, B:27:0x0085), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00df A[Catch: all -> 0x0173, CancellationException -> 0x0191, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:18:0x005a, B:33:0x00a0, B:35:0x00ab, B:37:0x00cc, B:39:0x00d9, B:41:0x00df, B:44:0x0111, B:47:0x0117, B:49:0x0136, B:52:0x013d, B:25:0x0072, B:27:0x0085), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0117 A[Catch: all -> 0x0173, CancellationException -> 0x0191, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:18:0x005a, B:33:0x00a0, B:35:0x00ab, B:37:0x00cc, B:39:0x00d9, B:41:0x00df, B:44:0x0111, B:47:0x0117, B:49:0x0136, B:52:0x013d, B:25:0x0072, B:27:0x0085), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[Catch: all -> 0x0173, CancellationException -> 0x0191, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:18:0x005a, B:33:0x00a0, B:35:0x00ab, B:37:0x00cc, B:39:0x00d9, B:41:0x00df, B:44:0x0111, B:47:0x0117, B:49:0x0136, B:52:0x013d, B:25:0x0072, B:27:0x0085), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[Catch: all -> 0x0173, CancellationException -> 0x0191, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0191, blocks: (B:18:0x005a, B:33:0x00a0, B:35:0x00ab, B:37:0x00cc, B:39:0x00d9, B:41:0x00df, B:44:0x0111, B:47:0x0117, B:49:0x0136, B:52:0x013d, B:25:0x0072, B:27:0x0085), top: B:64:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:0: B:39:0x00d9->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00ab, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0117, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x013d, please report this as an issue */
    /* JADX INFO: renamed from: invoke-yxL6bBk, reason: not valid java name */
    public final Object m4940invokeyxL6bBk(long j, String str, String str2, Class cls, ContinuationImpl continuationImpl) {
        GetTaskByTypeAndIdUseCaseImpl$invoke$1 getTaskByTypeAndIdUseCaseImpl$invoke$1;
        Class cls2;
        String str3;
        Object objM4932getCachedTasks0E7RQCE$implementation;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        uiMode uimode;
        long j2 = j;
        String str4 = str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof GetTaskByTypeAndIdUseCaseImpl$invoke$1;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof GetTaskByTypeAndIdUseCaseImpl$invoke$1) {
            getTaskByTypeAndIdUseCaseImpl$invoke$1 = (GetTaskByTypeAndIdUseCaseImpl$invoke$1) continuationImpl;
            int i3 = getTaskByTypeAndIdUseCaseImpl$invoke$1.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = read + 91;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getTaskByTypeAndIdUseCaseImpl$invoke$1.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getTaskByTypeAndIdUseCaseImpl$invoke$1 = new GetTaskByTypeAndIdUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            getTaskByTypeAndIdUseCaseImpl$invoke$1 = new GetTaskByTypeAndIdUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object obj2 = getTaskByTypeAndIdUseCaseImpl$invoke$1.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getTaskByTypeAndIdUseCaseImpl$invoke$1.IconCompatParcelizer;
        try {
            if (i6 != 0) {
                int i7 = IconCompatParcelizer + 17;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = getTaskByTypeAndIdUseCaseImpl$invoke$1.write;
                Class cls3 = getTaskByTypeAndIdUseCaseImpl$invoke$1.read;
                String str5 = getTaskByTypeAndIdUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
                String str6 = getTaskByTypeAndIdUseCaseImpl$invoke$1.serializer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    objM4932getCachedTasks0E7RQCE$implementation = ((onItemDismiss) obj2).IconCompatParcelizer;
                    str3 = str5;
                    str4 = str6;
                    cls2 = cls3;
                    ExtrasKt.RemoteActionCompatParcelizer(objM4932getCachedTasks0E7RQCE$implementation);
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objM4932getCachedTasks0E7RQCE$implementation;
                    if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                        return new isItemDismissable(new IllegalStateException("GetTaskByTypeAndIdUseCaseImpl: No Task available for deliveryId " + j2 + " and deliveryState " + str4));
                    }
                    int i8 = IconCompatParcelizer + 105;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    for (Object obj3 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((uiMode) obj3).IconCompatParcelizer(), str3}, getCieXyz.write())).booleanValue()) {
                            obj = obj3;
                            break;
                        }
                    }
                    uimode = (uiMode) obj;
                    if (uimode == null) {
                        return new isItemDismissable(new IllegalStateException("GetTaskByTypeAndIdUseCaseImpl: Task with id " + str3 + " is not found"));
                    }
                    if (cls2.isInstance(uimode)) {
                        return uimode;
                    }
                    return new isItemDismissable(new IllegalStateException("GetTaskByTypeAndIdUseCaseImpl: Task with id " + str3 + " was found, but it is of type " + uimode.getClass().getSimpleName() + ", not the expected type " + cls2.getSimpleName()));
                } catch (Throwable th) {
                    th = th;
                    cls2 = cls3;
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, ff$$ExternalSyntheticOutline0.m("GetTaskByTypeAndIdUseCaseImpl: ", cls2.getSimpleName(), " could not be retrieved."), new Object[0]);
                    return new isItemDismissable(th);
                }
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            try {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("GetTaskByTypeAndIdUseCaseImpl: invoke called", new Object[0]);
                TasksRepository tasksRepository = this.write;
                getTaskByTypeAndIdUseCaseImpl$invoke$1.serializer = str4;
                str3 = str2;
                getTaskByTypeAndIdUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = str3;
                cls2 = cls;
                try {
                    getTaskByTypeAndIdUseCaseImpl$invoke$1.read = cls2;
                    getTaskByTypeAndIdUseCaseImpl$invoke$1.write = j2;
                    getTaskByTypeAndIdUseCaseImpl$invoke$1.IconCompatParcelizer = 1;
                    objM4932getCachedTasks0E7RQCE$implementation = tasksRepository.m4932getCachedTasks0E7RQCE$implementation(j2, str4, getTaskByTypeAndIdUseCaseImpl$invoke$1);
                    if (objM4932getCachedTasks0E7RQCE$implementation == coroutineSingletons) {
                        int i10 = IconCompatParcelizer + 123;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            int i11 = 74 / 0;
                        }
                        return coroutineSingletons;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(objM4932getCachedTasks0E7RQCE$implementation);
                    r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objM4932getCachedTasks0E7RQCE$implementation;
                    if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                        return new isItemDismissable(new IllegalStateException("GetTaskByTypeAndIdUseCaseImpl: No Task available for deliveryId " + j2 + " and deliveryState " + str4));
                    }
                    int i12 = IconCompatParcelizer + 105;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    while (r0.hasNext()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((uiMode) obj3).IconCompatParcelizer(), str3}, getCieXyz.write())).booleanValue()) {
                            obj = obj3;
                            break;
                        }
                    }
                    uimode = (uiMode) obj;
                    if (uimode == null) {
                        return new isItemDismissable(new IllegalStateException("GetTaskByTypeAndIdUseCaseImpl: Task with id " + str3 + " is not found"));
                    }
                    if (cls2.isInstance(uimode)) {
                        return uimode;
                    }
                    return new isItemDismissable(new IllegalStateException("GetTaskByTypeAndIdUseCaseImpl: Task with id " + str3 + " was found, but it is of type " + uimode.getClass().getSimpleName() + ", not the expected type " + cls2.getSimpleName()));
                } catch (Throwable th2) {
                    th = th2;
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, ff$$ExternalSyntheticOutline0.m("GetTaskByTypeAndIdUseCaseImpl: ", cls2.getSimpleName(), " could not be retrieved."), new Object[0]);
                    return new isItemDismissable(th);
                }
            } catch (Throwable th3) {
                th = th3;
                cls2 = cls;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
