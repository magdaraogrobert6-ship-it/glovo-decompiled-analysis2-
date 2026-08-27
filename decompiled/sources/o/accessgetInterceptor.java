package o;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.vision.face.internal.zza;
import com.google.mlkit.vision.face.internal.zzh;
import com.google.mlkit.vision.face.internal.zzm;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetInterceptor extends androidx.compose.animation.core.TransitionState {
    public final AndroidUriHandler read;

    public accessgetInterceptor(AndroidUriHandler androidUriHandler) {
        super(2);
        this.read = androidUriHandler;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final /* synthetic */ Object read(Object obj) {
        CalculateMatrixToWindow calculateMatrixToWindow = (CalculateMatrixToWindow) obj;
        Context contextIconCompatParcelizer = this.read.IconCompatParcelizer();
        resetLayoutState resetlayoutstate = zzon.read(ChainedPlatformTextInputInterceptor.write());
        return new zzh(zzon.read(ChainedPlatformTextInputInterceptor.write()), calculateMatrixToWindow, (zza.read(contextIconCompatParcelizer) || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextIconCompatParcelizer) >= 204500000) ? new zza(contextIconCompatParcelizer, calculateMatrixToWindow, resetlayoutstate) : new zzm(contextIconCompatParcelizer, calculateMatrixToWindow, resetlayoutstate));
    }
}
