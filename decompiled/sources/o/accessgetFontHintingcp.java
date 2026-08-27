package o;

import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetFontHintingcp extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ BleScanningLifecycleObserverImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetFontHintingcp(BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = bleScanningLifecycleObserverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            BleScanningLifecycleObserverImpl.access$showBluetoothReadinessDialog(this.serializer, this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$showBluetoothReadinessDialog = BleScanningLifecycleObserverImpl.access$showBluetoothReadinessDialog(this.serializer, this);
        int i3 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$showBluetoothReadinessDialog;
    }
}
