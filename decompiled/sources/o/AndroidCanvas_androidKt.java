package o;

import android.os.Bundle;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class AndroidCanvas_androidKt extends AndroidPaint implements createImageBitmap {
    public final getLightGray0d7_KjU read;
    public final Bundle serializer;
    public final supportsColorMatrixQuery write;

    public abstract androidx.lifecycle.ViewModel IconCompatParcelizer(String str, Class cls, getBitmapui_graphics getbitmapui_graphics);

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls, setStrokeMiterLimit setstrokemiterlimit) {
        String str = (String) setstrokemiterlimit.read.get(toRegionOp7u2Bmg.IconCompatParcelizer);
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        getLightGray0d7_KjU getlightgray0d7_kju = this.read;
        if (getlightgray0d7_kju == null) {
            return IconCompatParcelizer(str, cls, prepareToDraw.IconCompatParcelizer(setstrokemiterlimit));
        }
        getlightgray0d7_kju.getClass();
        supportsColorMatrixQuery supportscolormatrixquery = this.write;
        supportscolormatrixquery.getClass();
        getHasAlpha gethasalphaIconCompatParcelizer = TuplesKt.IconCompatParcelizer(getlightgray0d7_kju, supportscolormatrixquery, str, this.serializer);
        androidx.lifecycle.ViewModel viewModelIconCompatParcelizer = IconCompatParcelizer(str, cls, gethasalphaIconCompatParcelizer.read);
        viewModelIconCompatParcelizer.addCloseable("androidx.lifecycle.savedstate.vm.tag", gethasalphaIconCompatParcelizer);
        return viewModelIconCompatParcelizer;
    }

    public AndroidCanvas_androidKt(getTransparent0d7_KjU gettransparent0d7_kju, Bundle bundle) {
        gettransparent0d7_kju.getClass();
        this.read = gettransparent0d7_kju.getSavedStateRegistry();
        this.write = gettransparent0d7_kju.getLifecycle();
        this.serializer = bundle;
    }

    @Override // o.AndroidPaint
    public final void read(androidx.lifecycle.ViewModel viewModel) {
        getLightGray0d7_KjU getlightgray0d7_kju = this.read;
        if (getlightgray0d7_kju != null) {
            supportsColorMatrixQuery supportscolormatrixquery = this.write;
            supportscolormatrixquery.getClass();
            TuplesKt.write(viewModel, getlightgray0d7_kju, supportscolormatrixquery);
        }
    }

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            supportsColorMatrixQuery supportscolormatrixquery = this.write;
            if (supportscolormatrixquery != null) {
                getLightGray0d7_KjU getlightgray0d7_kju = this.read;
                getlightgray0d7_kju.getClass();
                supportscolormatrixquery.getClass();
                getHasAlpha gethasalphaIconCompatParcelizer = TuplesKt.IconCompatParcelizer(getlightgray0d7_kju, supportscolormatrixquery, canonicalName, this.serializer);
                androidx.lifecycle.ViewModel viewModelIconCompatParcelizer = IconCompatParcelizer(canonicalName, cls, gethasalphaIconCompatParcelizer.read);
                viewModelIconCompatParcelizer.addCloseable("androidx.lifecycle.savedstate.vm.tag", gethasalphaIconCompatParcelizer);
                return viewModelIconCompatParcelizer;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
