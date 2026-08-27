package o;

import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAndroidTypefaceStyle extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public Set IconCompatParcelizer;
    public final /* synthetic */ MetricsBatchProcessor RatingCompat;
    public int RemoteActionCompatParcelizer;
    public setOnSessionTrackingFailedListener read;
    public /* synthetic */ Object serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAndroidTypefaceStyle(MetricsBatchProcessor metricsBatchProcessor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = metricsBatchProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$checkForAndLogGhostOrder = MetricsBatchProcessor.access$checkForAndLogGhostOrder(this.RatingCompat, null, this);
        int i4 = MediaDescriptionCompat + 51;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$checkForAndLogGhostOrder;
    }
}
