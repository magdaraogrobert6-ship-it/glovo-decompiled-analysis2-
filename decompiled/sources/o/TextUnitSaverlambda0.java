package o;

import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextUnitSaverlambda0 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final /* synthetic */ MetricsBatchProcessor IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public androidx.work.impl.WorkManagerImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUnitSaverlambda0(MetricsBatchProcessor metricsBatchProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = metricsBatchProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MetricsBatchProcessor metricsBatchProcessor;
        String str;
        long j;
        String str2;
        long j2;
        int i = 2 % 2;
        int i2 = read + 33;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            metricsBatchProcessor = this.IconCompatParcelizer;
            str = null;
            j = 0;
            str2 = null;
            j2 = 1;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            metricsBatchProcessor = this.IconCompatParcelizer;
            str = null;
            j = 0;
            str2 = null;
            j2 = 0;
        }
        return MetricsBatchProcessor.access$fireAcknowledgeWorker(metricsBatchProcessor, str, j, str2, j2, this);
    }
}
