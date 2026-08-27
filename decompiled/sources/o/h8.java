package o;

import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class h8 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ MetricsBatchProcessor serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(MetricsBatchProcessor metricsBatchProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = metricsBatchProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$waitForMapboxInitialization = MetricsBatchProcessor.access$waitForMapboxInitialization(this.serializer, this);
        int i4 = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$waitForMapboxInitialization;
    }
}
