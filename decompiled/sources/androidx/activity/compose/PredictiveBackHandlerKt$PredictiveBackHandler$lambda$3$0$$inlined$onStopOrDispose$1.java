package androidx.activity.compose;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.api.PickUpDropOffUiModel;
import com.roadrunner.delivery.pickupdropoff.api.PickupDropOffSingleDeliveryUiModel;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.PickUpDropOffTasksUiModelV2;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.PickUpDropOffTasksUiModelV2Impl;
import java.util.concurrent.CancellationException;
import o.addOnPictureInPictureModeChangedListener;
import o.getStrokeWidth;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.setShader;

/* JADX INFO: loaded from: classes.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1 implements setShader {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1(getStrokeWidth getstrokewidth, Object obj, int i) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.setShader
    public final void read() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i2 == 0) {
            ((addOnPictureInPictureModeChangedListener) obj).RemoteActionCompatParcelizer(false);
            return;
        }
        Object obj2 = null;
        if (i2 == 1) {
            PickUpDropOffUiModelImpl pickUpDropOffUiModelImpl = (PickUpDropOffUiModelImpl) ((PickUpDropOffUiModel) obj);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = pickUpDropOffUiModelImpl.ParcelableVolumeInfo;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i3 = read + 1;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    int i4 = 8 / 0;
                } else {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
            }
            pickUpDropOffUiModelImpl.ParcelableVolumeInfo = null;
            return;
        }
        if (i2 != 2) {
            PickUpDropOffTasksUiModelV2Impl pickUpDropOffTasksUiModelV2Impl = (PickUpDropOffTasksUiModelV2Impl) ((PickUpDropOffTasksUiModelV2) obj);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = pickUpDropOffTasksUiModelV2Impl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
            }
            pickUpDropOffTasksUiModelV2Impl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            return;
        }
        PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl = (PickupDropOffSingleDeliveryUiModelImpl) ((PickupDropOffSingleDeliveryUiModel) obj);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = pickupDropOffSingleDeliveryUiModelImpl.ParcelableVolumeInfo;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
            int i5 = read + 25;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
                obj2.hashCode();
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
            int i6 = serializer + 125;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        pickupDropOffSingleDeliveryUiModelImpl.ParcelableVolumeInfo = null;
    }
}
