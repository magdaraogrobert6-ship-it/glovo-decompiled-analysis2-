package o;

import android.content.Intent;
import android.content.IntentSender;
import androidx.camera.core.ImageCapture$1;
import coil3.Extras$Key;
import com.huawei.location.logic.zp;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class renderUrlIntoViewlambda1 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ renderUrlIntoViewlambda1(androidx.camera.camera2.internal.TorchControl torchControl, onDrawWithContent ondrawwithcontent, int i) {
        this.serializer = 5;
        this.IconCompatParcelizer = torchControl;
        this.write = ondrawwithcontent;
        this.read = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Object obj = this.write;
        int i2 = this.read;
        Object obj2 = this.IconCompatParcelizer;
        switch (i) {
            case 0:
                ((Sentiance) obj2).lambda$performAsyncReset$7(i2, (handlePushperformWorklambda1) obj);
                break;
            case 1:
                ((r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) obj2).dispatchResult(i2, (Serializable) ((ImageCapture$1) obj).MediaSessionCompatQueueItem);
                break;
            case 2:
                ((r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) obj2).dispatchResult(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                ((StillCaptureFlashStopRepeatingQuirk) obj2).RemoteActionCompatParcelizer(i2, (androidx.camera.view.PendingValue) obj);
                break;
            case 4:
                ((StillCaptureFlashStopRepeatingQuirk) obj2).serializer(i2, (CameraXExternalSyntheticLambda0) obj);
                break;
            case 5:
                ((androidx.camera.camera2.internal.TorchControl) obj2).serializer((onDrawWithContent) obj, i2);
                break;
            case 6:
                ((accessgetDarkencp) ((androidx.camera.core.LegacySessionConfig) obj2).MediaMetadataCompat).IconCompatParcelizer(i2, obj);
                break;
            case 7:
                ((Extras$Key) obj2).IconCompatParcelizer(i2, obj);
                break;
            case 8:
                reuseLayer reuselayer = (reuseLayer) ((zp) obj2).IconCompatParcelizer;
                if (onEndApplyChanges.RemoteActionCompatParcelizer()) {
                    onEndApplyChanges.read(reuselayer.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(reuselayer)), Integer.valueOf(i2), obj);
                }
                if (i2 != 1) {
                    reuselayer.serializer(obj);
                } else {
                    reuselayer.read(obj);
                }
                break;
            default:
                parsePayloadFieldsFromBundleparsePushDeliveryEventData.serializer((parsePayloadFieldsFromBundleparsePushDeliveryEventData) obj2, i2, (d0$$ExternalSyntheticLambda0) obj);
                break;
        }
    }

    public /* synthetic */ renderUrlIntoViewlambda1(int i, int i2, Object obj, Object obj2) {
        this.serializer = i2;
        this.IconCompatParcelizer = obj;
        this.read = i;
        this.write = obj2;
    }
}
