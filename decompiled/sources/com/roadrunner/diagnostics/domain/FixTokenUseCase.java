package com.roadrunner.diagnostics.domain;

import androidx.compose.animation.core.TransitionState;
import androidx.compose.ui.graphics.Fields;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Completable;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import o.accessgetOldDependenciesSetp;
import o.getPivotOffsetF1C5BW0;

/* JADX INFO: loaded from: classes3.dex */
public final class FixTokenUseCase extends TransitionState {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final getPivotOffsetF1C5BW0 RemoteActionCompatParcelizer;
    public final accessgetOldDependenciesSetp read;
    public final NotificationsDiagnosticsRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixTokenUseCase(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, accessgetOldDependenciesSetp accessgetolddependenciessetp, NotificationsDiagnosticsRepository notificationsDiagnosticsRepository) {
        super(((AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        accessgetolddependenciessetp.getClass();
        notificationsDiagnosticsRepository.getClass();
        this.RemoteActionCompatParcelizer = getpivotoffsetf1c5bw0;
        this.read = accessgetolddependenciessetp;
        this.serializer = notificationsDiagnosticsRepository;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Completable RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        ((Number) obj).longValue();
        SingleFlatMapCompletable singleFlatMapCompletable = new SingleFlatMapCompletable(new SingleObserveOn(this.read.RemoteActionCompatParcelizer(), ((AndroidScheduleProvider) this.RemoteActionCompatParcelizer).IconCompatParcelizer()), new RetryWithDelay$$ExternalSyntheticLambda1(18, new RetryWithDelay$$ExternalSyntheticLambda0(15, this)));
        int i2 = IconCompatParcelizer + 11;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return singleFlatMapCompletable;
    }
}
