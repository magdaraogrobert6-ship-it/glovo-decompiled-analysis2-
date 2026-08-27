package o;

import android.app.PendingIntent;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDrop_androidKt implements setBlock, updateBuffersOnDisappeared {
    public alpha IconCompatParcelizer;
    public final CoroutineLiveData$$ExternalSyntheticLambda0 MediaMetadataCompat = new CoroutineLiveData$$ExternalSyntheticLambda0(22, this);
    public Object MediaSessionCompatQueueItem;
    public BlockDropShadowElement RemoteActionCompatParcelizer;
    public Object[] read;
    public invalidateShadow serializer;
    public String write;

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() throws PendingIntent.CanceledException {
        write();
    }

    public final void write() throws PendingIntent.CanceledException {
        String strSerializer;
        alpha alphaVar = this.IconCompatParcelizer;
        BlockDropShadowElement blockDropShadowElement = this.RemoteActionCompatParcelizer;
        if (blockDropShadowElement != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("entry(", blockDropShadowElement, ") is not null");
            return;
        }
        if (alphaVar != null) {
            CoroutineLiveData$$ExternalSyntheticLambda0 coroutineLiveData$$ExternalSyntheticLambda0 = this.MediaMetadataCompat;
            Object objInvoke = coroutineLiveData$$ExternalSyntheticLambda0.invoke();
            if (objInvoke == null || alphaVar.canBeSaved(objInvoke)) {
                this.RemoteActionCompatParcelizer = alphaVar.registerProvider(this.write, coroutineLiveData$$ExternalSyntheticLambda0);
                return;
            }
            if (objInvoke instanceof setColor8_81llA) {
                setColor8_81llA setcolor8_81lla = (setColor8_81llA) objInvoke;
                if (setcolor8_81lla.write() == AndroidContentCaptureManager.RemoteActionCompatParcelizer || setcolor8_81lla.write() == AndroidContentCaptureManager.write || setcolor8_81lla.write() == AndroidContentCaptureManager.read) {
                    strSerializer = "MutableState containing " + setcolor8_81lla.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strSerializer = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strSerializer = getEventType.serializer(objInvoke);
            }
            throw new IllegalArgumentException(strSerializer);
        }
    }

    public DragAndDrop_androidKt(invalidateShadow invalidateshadow, alpha alphaVar, String str, Object obj, Object[] objArr) {
        this.serializer = invalidateshadow;
        this.IconCompatParcelizer = alphaVar;
        this.write = str;
        this.MediaSessionCompatQueueItem = obj;
        this.read = objArr;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
        BlockDropShadowElement blockDropShadowElement = this.RemoteActionCompatParcelizer;
        if (blockDropShadowElement != null) {
            ((androidx.navigation.NavArgsLazy) blockDropShadowElement).ResultReceiver();
        }
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        BlockDropShadowElement blockDropShadowElement = this.RemoteActionCompatParcelizer;
        if (blockDropShadowElement != null) {
            ((androidx.navigation.NavArgsLazy) blockDropShadowElement).ResultReceiver();
        }
    }
}
