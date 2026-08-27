package o;

import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class parseui_tooling {
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU IconCompatParcelizer;
    public final decode RemoteActionCompatParcelizer;
    public final ContextScope read;
    public final SendTestPushUseCase serializer;
    public getButtonXEK5gGoQ write;

    public parseui_tooling(isOpenInternalroom_runtime isopeninternalroom_runtime, SendTestPushUseCase sendTestPushUseCase, decode decodeVar) {
        this.serializer = sendTestPushUseCase;
        this.RemoteActionCompatParcelizer = decodeVar;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.read = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer);
    }
}
