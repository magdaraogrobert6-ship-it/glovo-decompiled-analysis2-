package o;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.mlkit.vision.barcode.internal.zzl;
import com.google.mlkit.vision.barcode.internal.zzo;
import com.huawei.location.logic.E5;

/* JADX INFO: loaded from: classes2.dex */
public final class Api29Impl extends androidx.compose.animation.core.TransitionState {
    public final AndroidUriHandler read;

    public Api29Impl(AndroidUriHandler androidUriHandler) {
        super(2);
        this.read = androidUriHandler;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final /* synthetic */ Object read(Object obj) {
        calculateWindowSize calculatewindowsize = (calculateWindowSize) obj;
        AndroidUriHandler androidUriHandler = this.read;
        Context contextIconCompatParcelizer = androidUriHandler.IconCompatParcelizer();
        toMotionEventScoped4ec7I tomotioneventscoped4ec7iWrite = com.airbnb.lottie.compose.RememberLottieCompositionKt.write(Api30Impl.RemoteActionCompatParcelizer());
        return new zzl(androidUriHandler, calculatewindowsize, (zzo.serializer(contextIconCompatParcelizer) || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextIconCompatParcelizer) >= 204500000) ? new zzo(contextIconCompatParcelizer, calculatewindowsize, tomotioneventscoped4ec7iWrite) : new E5(contextIconCompatParcelizer, calculatewindowsize, tomotioneventscoped4ec7iWrite), tomotioneventscoped4ec7iWrite);
    }
}
