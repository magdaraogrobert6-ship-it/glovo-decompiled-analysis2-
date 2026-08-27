package o;

import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockUiModelImpl;
import io.grpc.internal.CallTracer;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getSubsessionInterval {
    private static int read = 1;
    private static int write;
    public final CallTracer IconCompatParcelizer;

    public getSubsessionInterval(CallTracer callTracer) {
        this.IconCompatParcelizer = callTracer;
    }

    public final CashBlockUiModelImpl write(ContextScope contextScope) {
        int i = 2 % 2;
        CallTracer callTracer = this.IconCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        GetCashBlockUiState getCashBlockUiState = (GetCashBlockUiState) objWrite;
        OtpLogger otpLogger = (OtpLogger) ((lambdaverifyPlayStorePurchase45) callTracer.write).write();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
        objWrite2.getClass();
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.IconCompatParcelizer).write();
        objWrite3.getClass();
        CashBlockUiModelImpl cashBlockUiModelImpl = new CashBlockUiModelImpl(getCashBlockUiState, otpLogger, contextScope, (PlatformStringDelegate) objWrite2, (dispatchChildDetached) objWrite3);
        int i2 = write + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return cashBlockUiModelImpl;
    }
}
