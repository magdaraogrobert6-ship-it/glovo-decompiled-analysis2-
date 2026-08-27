package o;

import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import bo.app.a5$$ExternalSyntheticLambda0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class obtainPainter implements alpha, getTransparent0d7_KjU {
    public accessregisterComponentCallback IconCompatParcelizer;
    public final /* synthetic */ getShape read;
    public getWhite0d7_KjU write;

    @Override // o.alpha
    public final boolean canBeSaved(Object obj) {
        return this.read.canBeSaved(obj);
    }

    @Override // o.alpha
    public final Object consumeRestored(String str) {
        return this.read.consumeRestored(str);
    }

    @Override // o.alpha
    public final Map performSave() {
        return this.read.performSave();
    }

    @Override // o.alpha
    public final BlockDropShadowElement registerProvider(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return this.read.registerProvider(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public obtainPainter(getShape getshape) {
        this.read = getshape;
        Object objConsumeRestored = getshape.consumeRestored("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objConsumeRestored instanceof Bundle ? (Bundle) objConsumeRestored : null;
        if (bundle != null && this.write == null) {
            getWhite0d7_KjU getwhite0d7_kju = new getWhite0d7_KjU(new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this)));
            this.write = getwhite0d7_kju;
            getwhite0d7_kju.RemoteActionCompatParcelizer(bundle);
        }
        getshape.registerProvider("androidx.savedstate.SavedStateRegistry", new CoroutineLiveData$$ExternalSyntheticLambda0(23, this));
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        accessregisterComponentCallback accessregistercomponentcallback = this.IconCompatParcelizer;
        if (accessregistercomponentcallback != null) {
            return accessregistercomponentcallback;
        }
        accessregisterComponentCallback accessregistercomponentcallback2 = new accessregisterComponentCallback(this, false);
        this.IconCompatParcelizer = accessregistercomponentcallback2;
        return accessregistercomponentcallback2;
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        getWhite0d7_KjU getwhite0d7_kju = this.write;
        if (getwhite0d7_kju == null) {
            getwhite0d7_kju = new getWhite0d7_KjU(new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this)));
            this.write = getwhite0d7_kju;
            getwhite0d7_kju.RemoteActionCompatParcelizer(null);
        }
        return getwhite0d7_kju.read;
    }
}
