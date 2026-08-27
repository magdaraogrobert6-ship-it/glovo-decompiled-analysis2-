package o;

import com.google.android.gms.common.Feature;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.internal.zzl;
import com.huawei.location.logic.zp;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class isShowingLayoutBounds extends accessgetCursorBasedcp implements tryUnwrapContext {
    public final boolean RemoteActionCompatParcelizer;

    @Override // o.accessgetCursorBasedcp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            super.close();
        }
    }

    public isShowingLayoutBounds(calculateWindowSize calculatewindowsize, zzl zzlVar, Executor executor, toMotionEventScoped4ec7I tomotioneventscoped4ec7i) {
        super(zzlVar, executor);
        boolean zWrite = Api30Impl.write();
        this.RemoteActionCompatParcelizer = zWrite;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(9);
        dropShadowEffect.RatingCompat = Api30Impl.IconCompatParcelizer(calculatewindowsize);
        PointerInteropFilter_androidKt pointerInteropFilter_androidKt = new PointerInteropFilter_androidKt(dropShadowEffect);
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        blockRunner.RatingCompat = zWrite ? setDisallowInterceptui.TYPE_THICK : setDisallowInterceptui.TYPE_THIN;
        blockRunner.write = pointerInteropFilter_androidKt;
        getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) tomotioneventscoped4ec7i, (Object) new zp(blockRunner, 1), (Enum) PointerInteropFilterpointerInputFilter1dispatchToView2.ON_DEVICE_BARCODE_CREATE, tomotioneventscoped4ec7i.write(), 4));
    }

    @Override // o.accessgetNumPad9cp
    public final Feature[] write() {
        return this.RemoteActionCompatParcelizer ? OptionalModuleUtils.write : new Feature[]{OptionalModuleUtils.read};
    }
}
