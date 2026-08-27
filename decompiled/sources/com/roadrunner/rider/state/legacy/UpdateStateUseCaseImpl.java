package com.roadrunner.rider.state.legacy;

import androidx.compose.animation.core.TransitionState;
import androidx.compose.ui.graphics.Fields;
import com.data.util.AndroidScheduleProvider;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.subjects.BehaviorSubject;
import o.getPivotOffsetF1C5BW0;
import o.setOnRemoteTriggerListener;
import o.setOnSessionTrackingFailedListener;
import o.setOnThirdPartySharingSettingsChangedListener;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateStateUseCaseImpl extends TransitionState {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final setOnRemoteTriggerListener serializer;

    public UpdateStateUseCaseImpl(setOnRemoteTriggerListener setonremotetriggerlistener, getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0) {
        super(((AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        this.serializer = setonremotetriggerlistener;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final RetryWithDelay MediaDescriptionCompat() {
        int i = 2 % 2;
        RetryWithDelay retryWithDelay = new RetryWithDelay(3, (Scheduler) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return retryWithDelay;
    }

    public static BehaviorSubject write(UpdateStateUseCaseImpl updateStateUseCaseImpl) {
        int i = 2 % 2;
        BehaviorSubject behaviorSubjectIconCompatParcelizer = updateStateUseCaseImpl.IconCompatParcelizer(new setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener.OTHER, false));
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return behaviorSubjectIconCompatParcelizer;
        }
        throw null;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Completable RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        setOnThirdPartySharingSettingsChangedListener setonthirdpartysharingsettingschangedlistener = (setOnThirdPartySharingSettingsChangedListener) obj;
        setonthirdpartysharingsettingschangedlistener.getClass();
        CompletableCreate completableCreate = new CompletableCreate(new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 23, setonthirdpartysharingsettingschangedlistener));
        int i2 = write + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return completableCreate;
        }
        throw null;
    }
}
