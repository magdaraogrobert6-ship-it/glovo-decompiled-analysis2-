package o;

import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.GetOnPauseUiState;
import com.roadrunner.rider.state.onpause.presentation.OnPauseUiModelImpl;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getImeiParameters {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final MetricsBatchProcessor read;

    public getImeiParameters(MetricsBatchProcessor metricsBatchProcessor) {
        this.read = metricsBatchProcessor;
    }

    public final OnPauseUiModelImpl IconCompatParcelizer(ContextScope contextScope) {
        int i = 2 % 2;
        MetricsBatchProcessor metricsBatchProcessor = this.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        GetOnPauseUiState getOnPauseUiState = (GetOnPauseUiState) objWrite;
        getHardwareName gethardwarename = (getHardwareName) ((lambdaverifyPlayStorePurchase45) metricsBatchProcessor.serializer).write();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.write).write();
        objWrite2.getClass();
        EndBreakUseCaseImpl endBreakUseCaseImpl = (EndBreakUseCaseImpl) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.read).write();
        objWrite3.getClass();
        restoreChildFragmentState restorechildfragmentstate = (restoreChildFragmentState) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.MediaSessionCompatQueueItem).write();
        objWrite4.getClass();
        getQueryContext getquerycontext = new getQueryContext();
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.IconCompatParcelizer).write();
        objWrite5.getClass();
        OnPauseUiModelImpl onPauseUiModelImpl = new OnPauseUiModelImpl(getOnPauseUiState, gethardwarename, endBreakUseCaseImpl, restorechildfragmentstate, (NetworkErrorMapperImpl) objWrite4, getquerycontext, contextScope, (dispatchChildDetached) objWrite5);
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return onPauseUiModelImpl;
        }
        throw null;
    }
}
