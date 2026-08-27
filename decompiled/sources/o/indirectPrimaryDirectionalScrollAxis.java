package o;

import com.foodora.courier.main.usecases.GetHelpCenterParamsUseCase;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes2.dex */
public final class indirectPrimaryDirectionalScrollAxis extends androidx.lifecycle.ViewModel {
    public final GetCourierShiftInfoImpl RemoteActionCompatParcelizer;
    public final GetHelpCenterParamsUseCase serializer;
    public final SharedResourcePool write;

    public indirectPrimaryDirectionalScrollAxis(GetCourierShiftInfoImpl getCourierShiftInfoImpl, GetHelpCenterParamsUseCase getHelpCenterParamsUseCase, SharedResourcePool sharedResourcePool) {
        getCourierShiftInfoImpl.getClass();
        getHelpCenterParamsUseCase.getClass();
        sharedResourcePool.getClass();
        this.RemoteActionCompatParcelizer = getCourierShiftInfoImpl;
        this.serializer = getHelpCenterParamsUseCase;
        this.write = sharedResourcePool;
    }
}
