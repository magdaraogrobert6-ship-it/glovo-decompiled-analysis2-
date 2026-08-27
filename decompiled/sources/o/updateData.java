package o;

import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.presentation.description.HeatmapDescriptionUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class updateData {
    public final SendTestPushUseCase IconCompatParcelizer;
    public final StateFlow RatingCompat;
    public final DataMigrationInitializerCompanionrunMigrations2 RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final isAdapterPositionOnScreen serializer;
    public final ContextScope write;

    public updateData(ContextScope contextScope, DataMigrationInitializerCompanionrunMigrations2 dataMigrationInitializerCompanionrunMigrations2, SingleProcessDataStorereadAndInitapi1 singleProcessDataStorereadAndInitapi1, SendTestPushUseCase sendTestPushUseCase) {
        this.write = contextScope;
        this.RemoteActionCompatParcelizer = dataMigrationInitializerCompanionrunMigrations2;
        this.IconCompatParcelizer = sendTestPushUseCase;
        this.serializer = new isAdapterPositionOnScreen(new DeviceManager$$ExternalSyntheticLambda1(singleProcessDataStorereadAndInitapi1, 21, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getMaxScrollAmount.serializer);
        this.read = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new HeatmapDescriptionUiModelImpl$1(this, null, 0), 3);
    }
}
