package com.roadrunner.domain.usecase;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ObservableUseCase {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final Scheduler IconCompatParcelizer;
    public final BehaviorSubject MediaSessionCompatQueueItem = new BehaviorSubject();
    public Disposable serializer;

    public abstract Flowable write(Object obj);

    public ObservableUseCase(Scheduler scheduler) {
        this.IconCompatParcelizer = scheduler;
    }

    public final FlowableDoFinally RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        FlowableDoFinally flowableDoFinally = new FlowableDoFinally(this.MediaSessionCompatQueueItem.serializer(BackpressureStrategy.LATEST), new PerseusInitializerImpl$$ExternalSyntheticLambda0(16, this));
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return flowableDoFinally;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r1 r13
  0x0029: PHI (r1v5 io.reactivex.disposables.Disposable) = (r1v4 io.reactivex.disposables.Disposable), (r1v10 io.reactivex.disposables.Disposable) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r13v2 io.reactivex.Flowable) = (r13v1 io.reactivex.Flowable), (r13v11 io.reactivex.Flowable) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void invoke(Object obj) {
        Flowable flowableWrite;
        Disposable disposable;
        int i = 2 % 2;
        int i2 = write + 93;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            obj.getClass();
            flowableWrite = write(obj);
            disposable = this.serializer;
            int i3 = 64 / 0;
            if (disposable != null) {
                disposable.dispose();
            }
        } else {
            obj.getClass();
            flowableWrite = write(obj);
            disposable = this.serializer;
            if (disposable != null) {
                disposable.dispose();
            }
        }
        Scheduler scheduler = this.IconCompatParcelizer;
        int i4 = 18;
        this.serializer = new FlowableSubscribeOn(flowableWrite.write(scheduler), scheduler, true).subscribe(new PerseusInitializerImpl$$ExternalSyntheticLambda0(17, new RoomDatabase$$ExternalSyntheticLambda2(21, this)), new PerseusInitializerImpl$$ExternalSyntheticLambda0(i4, new HomeFragment.AnonymousClass1(1, this.MediaSessionCompatQueueItem, BehaviorSubject.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, 11)));
        int i5 = RemoteActionCompatParcelizer + 79;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
