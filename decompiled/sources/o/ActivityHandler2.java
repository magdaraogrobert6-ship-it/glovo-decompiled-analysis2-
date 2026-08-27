package o;

import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler2 extends androidx.lifecycle.ViewModel {
    public final MutableStateFlow IconCompatParcelizer;
    public final GetAppStateImpl RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final getQueryContext serializer;
    public final OtpLogger write;

    public ActivityHandler2(GetAppStateImpl getAppStateImpl, OtpLogger otpLogger, getQueryContext getquerycontext) {
        getAppStateImpl.getClass();
        otpLogger.getClass();
        getquerycontext.getClass();
        this.RemoteActionCompatParcelizer = getAppStateImpl;
        this.write = otpLogger;
        this.serializer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
    }
}
