package o;

import io.sentry.metrics.MetricsBatchProcessor;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkSpecDaoKtdedupinlinedmap12 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final MetricsBatchProcessor read;

    public WorkSpecDaoKtdedupinlinedmap12(MetricsBatchProcessor metricsBatchProcessor) {
        this.read = metricsBatchProcessor;
    }

    public final WorkerWrapperKt serializer(ContextScope contextScope) {
        int i = 2 % 2;
        MetricsBatchProcessor metricsBatchProcessor = this.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.serializer).write();
        objWrite2.getClass();
        accessrunWorker accessrunworker = (accessrunWorker) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.write).write();
        objWrite3.getClass();
        WorkerWrapperBuilder workerWrapperBuilder = (WorkerWrapperBuilder) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.read).write();
        objWrite4.getClass();
        r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik r8lambda_dfitvnggdulnvz_azfzdrtp1ik = (r8lambda_DFitVNGGDuLNvZ_AZfzdRTp1Ik) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) metricsBatchProcessor.MediaSessionCompatQueueItem).write();
        objWrite5.getClass();
        WorkerWrapperKt workerWrapperKt = new WorkerWrapperKt(workManagerImpl, accessrunworker, workerWrapperBuilder, r8lambda_dfitvnggdulnvz_azfzdrtp1ik, (transferSessionPackageI) objWrite5, (WorkManagerInitializer) ((postAnimationRunner) metricsBatchProcessor.IconCompatParcelizer).write(), contextScope);
        int i2 = write + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return workerWrapperKt;
    }
}
