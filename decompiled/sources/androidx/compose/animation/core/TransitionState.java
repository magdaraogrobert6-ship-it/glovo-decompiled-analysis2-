package androidx.compose.animation.core;

import android.content.Context;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.operators.completable.CompletableFromPublisher;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableToFlowable;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.HashMap;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputComposite2cp;
import o.accessgetWcp;
import o.createFromParcel;
import o.getLookaheadDelegate;
import o.layoutdefault;
import o.onViewAdded;
import o.onViewRemoved;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionState implements layoutdefault {
    private static int read = 0;
    private static int write = 1;
    public final Object r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    public abstract Object IconCompatParcelizer();

    @Override // o.layoutdefault
    public accessgetWcp MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = write + 43;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = 98 / 0;
        throw null;
    }

    @Override // o.layoutdefault
    public accessgetTvInputComposite2cp ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = read + 63;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = 64 / 0;
        throw null;
    }

    @Override // o.layoutdefault
    public LookaheadScopeKtLookaheadScope4 PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = write + 71;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = 6 / 0;
        throw null;
    }

    @Override // o.layoutdefault
    public Context PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.layoutdefault
    public getLookaheadDelegate RatingCompat() {
        int i = 2 % 2;
        int i2 = write + 61;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = 71 / 0;
        throw null;
    }

    public abstract Completable RemoteActionCompatParcelizer(Object obj);

    public abstract Object RemoteActionCompatParcelizer();

    public abstract Object read(Object obj);

    public abstract void read(Transition transition);

    public abstract void write();

    public abstract void write(Object obj);

    public Object serializer(Object obj) {
        synchronized (((HashMap) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)) {
            if (((HashMap) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).containsKey(obj)) {
                return ((HashMap) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).get(obj);
            }
            Object obj2 = read(obj);
            ((HashMap) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).put(obj, obj2);
            return obj2;
        }
    }

    public TransitionState(int i) {
        if (i != 2) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        } else {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new HashMap();
        }
    }

    public RetryWithDelay MediaDescriptionCompat() {
        int i = 2 % 2;
        RetryWithDelay retryWithDelay = new RetryWithDelay(0, (Scheduler) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        int i2 = write + 81;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return retryWithDelay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = write + 91;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        int i4 = read + 17;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TransitionState(Scheduler scheduler) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = scheduler;
    }

    public TransitionState(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(lookaheadScopeKtLookaheadScope221);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = lookaheadScopeKtLookaheadScope221;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BehaviorSubject IconCompatParcelizer(Object obj) {
        Flowable completableToFlowable;
        int i = 2;
        int i2 = 2 % 2;
        BehaviorSubject behaviorSubjectIconCompatParcelizer = BehaviorSubject.IconCompatParcelizer(new onViewAdded());
        ObservableFlatMapCompletableCompletable observableFlatMapCompletableCompletable = new ObservableFlatMapCompletableCompletable(Observable.read(createFromParcel.INSTANCE), new RetryWithDelay$$ExternalSyntheticLambda1(21, new SuspendingWorkUseCase$$ExternalSyntheticLambda0(this, 0, obj)));
        RetryWithDelay retryWithDelayMediaDescriptionCompat = MediaDescriptionCompat();
        if (observableFlatMapCompletableCompletable instanceof FuseToFlowable) {
            int i3 = write + 119;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ((FuseToFlowable) observableFlatMapCompletableCompletable).read();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            completableToFlowable = ((FuseToFlowable) observableFlatMapCompletableCompletable).read();
        } else {
            completableToFlowable = new CompletableToFlowable(observableFlatMapCompletableCompletable);
            int i4 = read + 107;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        new CompletableSubscribeOn(new CompletableFromPublisher(new FlowableRetryWhen(completableToFlowable, retryWithDelayMediaDescriptionCompat)), (Scheduler) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).subscribe(new RetryWithDelay$$ExternalSyntheticLambda1(22, behaviorSubjectIconCompatParcelizer), new RetryWithDelay$$ExternalSyntheticLambda1(23, new onViewRemoved(behaviorSubjectIconCompatParcelizer, i)));
        return behaviorSubjectIconCompatParcelizer;
    }
}
