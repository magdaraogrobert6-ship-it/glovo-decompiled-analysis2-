package o;

import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextDirectionHeuristicui_text {
    private static int read = 0;
    private static int serializer = 1;
    public final MetricsBatchProcessor write;

    public getTextDirectionHeuristicui_text(MetricsBatchProcessor metricsBatchProcessor) {
        this.write = metricsBatchProcessor;
    }

    public final EntrancePictureIconUiModelImpl serializer(ContextScope contextScope) {
        int i = 2 % 2;
        MetricsBatchProcessor metricsBatchProcessor = this.write;
        EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl = new EntrancePictureIconUiModelImpl(contextScope, (ObserveEntrancePicture) ((accessgetTextBottomcp) metricsBatchProcessor.RemoteActionCompatParcelizer).write(), (transferSessionPackageI) ((mergeJsonObjects) metricsBatchProcessor.serializer).write(), new getQueryContext(), (EntrancePictureRepository) ((mergeJsonObjects) metricsBatchProcessor.write).write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) metricsBatchProcessor.read).write(), (isResumed) ((mergeJsonObjects) metricsBatchProcessor.MediaSessionCompatQueueItem).write(), (createCharSequence) ((accessgetTextBottomcp) metricsBatchProcessor.IconCompatParcelizer).write());
        int i2 = serializer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return entrancePictureIconUiModelImpl;
    }
}
