package o;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.face.internal.zzh;
import com.huawei.location.logic.zp;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateMatrixToWindowEL8BTi8 extends accessgetCursorBasedcp implements BringIntoViewOnScreenResponderNode {
    public static final CalculateMatrixToWindow RemoteActionCompatParcelizer;
    public final boolean RatingCompat;

    /* JADX WARN: Illegal instructions before constructor call */
    public calculateMatrixToWindowEL8BTi8(zzh zzhVar, AndroidViewConfiguration androidViewConfiguration, CalculateMatrixToWindow calculateMatrixToWindow) {
        Executor executor = (Executor) androidViewConfiguration.RemoteActionCompatParcelizer.write();
        resetLayoutState resetlayoutstate = zzon.read(ChainedPlatformTextInputInterceptor.write());
        super(zzhVar, executor);
        boolean zIconCompatParcelizer = ChainedPlatformTextInputInterceptor.IconCompatParcelizer();
        this.RatingCompat = zIconCompatParcelizer;
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        blockRunner.RatingCompat = zIconCompatParcelizer ? accessgetCurrentApproachIndexp.TYPE_THICK : accessgetCurrentApproachIndexp.TYPE_THIN;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(12);
        dropShadowEffect.write = ChainedPlatformTextInputInterceptor.RemoteActionCompatParcelizer(calculateMatrixToWindow);
        blockRunner.write = new accesssetCurrentApproachIndexp(dropShadowEffect);
        getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) resetlayoutstate, (Object) new zp(blockRunner, 1, (byte) 0), (Enum) accessgetRootp.ON_DEVICE_FACE_CREATE, resetlayoutstate.read(), 6));
    }

    @Override // o.accessgetNumPad9cp
    public final Feature[] write() {
        return this.RatingCompat ? OptionalModuleUtils.write : new Feature[]{OptionalModuleUtils.serializer};
    }

    static {
        int i = 1;
        RemoteActionCompatParcelizer = new CalculateMatrixToWindow(i, i, false, 0.1f);
    }
}
