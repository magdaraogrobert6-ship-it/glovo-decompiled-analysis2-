package o;

import com.huawei.location.Vw$Vw;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmButtonV1MapperImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmDeliveryUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletonsComposeViewAdapter_androidKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final i2 read;

    public ComposableSingletonsComposeViewAdapter_androidKt(i2 i2Var) {
        this.read = i2Var;
    }

    public final ConfirmButtonV1UiModelImpl write(fastFilterNotNull fastfilternotnull, ContextScope contextScope) {
        int i = 2 % 2;
        i2 i2Var = this.read;
        ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl = new ConfirmButtonV1UiModelImpl(fastfilternotnull, contextScope, (findRememberedData) ((mergeJsonObjects) i2Var.MediaDescriptionCompat).write(), (parseParametersToValueparametersHasTheSameType) ((mergeJsonObjects) i2Var.MediaBrowserCompatMediaItem).write(), (FontVariationSettingTextUnit) ((mergeJsonObjects) i2Var.write).write(), (ConfirmButtonV1MapperImpl) ((mergeJsonObjects) i2Var.MediaMetadataCompat).write(), (attach) ((mergeJsonObjects) i2Var.serializer).write(), (createAnimation) ((mergeJsonObjects) i2Var.ParcelableVolumeInfo).write(), (UpdateTaskUseCaseImpl) ((mergeJsonObjects) i2Var.MediaSessionCompatResultReceiverWrapper).write(), (UpdateStateUseCaseImpl) ((mergeJsonObjects) i2Var.RemoteActionCompatParcelizer).write(), (ConfirmDeliveryUseCaseImpl) ((mergeJsonObjects) i2Var.IconCompatParcelizer).write(), (GetDeliveryAnalyticsUseCaseImpl) ((mergeJsonObjects) i2Var.MediaSessionCompatQueueItem).write(), (Vw$Vw) ((setVerticalBias) i2Var.RatingCompat).write(), (DeliveryConfirmationLoggerImpl) ((mergeJsonObjects) i2Var.read).write(), (clearTmpDetachFlag) ((r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw) i2Var.PlaybackStateCompatCustomAction).write(), (MultipleCodeScanEventLoggerImpl) ((mergeJsonObjects) i2Var.PlaybackStateCompat).write(), new getQueryContext());
        int i2 = serializer + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return confirmButtonV1UiModelImpl;
    }
}
