package o;

import android.app.Application;
import android.os.Bundle;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.math.MathKt;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class ActualImageBitmapx__hDU extends AndroidPaint implements createImageBitmap {
    public final Bundle IconCompatParcelizer;
    public final supportsColorMatrixQuery RemoteActionCompatParcelizer;
    public final Application read;
    public final asImageBitmap serializer;
    public final getLightGray0d7_KjU write;

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls, setStrokeMiterLimit setstrokemiterlimit) {
        LinkedHashMap linkedHashMap = setstrokemiterlimit.read;
        String str = (String) linkedHashMap.get(toRegionOp7u2Bmg.IconCompatParcelizer);
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(prepareToDraw.read) == null || linkedHashMap.get(prepareToDraw.write) == null) {
            if (this.RemoteActionCompatParcelizer != null) {
                return serializer(cls, str);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(asImageBitmap.IconCompatParcelizer);
        boolean zIsAssignableFrom = saveLayer.class.isAssignableFrom(cls);
        Constructor constructorSerializer = (!zIsAssignableFrom || application == null) ? AndroidMatrixConversions_androidKt.serializer(AndroidMatrixConversions_androidKt.read, cls) : AndroidMatrixConversions_androidKt.serializer(AndroidMatrixConversions_androidKt.RemoteActionCompatParcelizer, cls);
        if (constructorSerializer == null) {
            return this.serializer.serializer(cls, setstrokemiterlimit);
        }
        return (!zIsAssignableFrom || application == null) ? AndroidMatrixConversions_androidKt.serializer(cls, constructorSerializer, prepareToDraw.IconCompatParcelizer(setstrokemiterlimit)) : AndroidMatrixConversions_androidKt.serializer(cls, constructorSerializer, application, prepareToDraw.IconCompatParcelizer(setstrokemiterlimit));
    }

    public ActualImageBitmapx__hDU(Application application, getTransparent0d7_KjU gettransparent0d7_kju, Bundle bundle) {
        asImageBitmap asimagebitmap;
        gettransparent0d7_kju.getClass();
        this.write = gettransparent0d7_kju.getSavedStateRegistry();
        this.RemoteActionCompatParcelizer = gettransparent0d7_kju.getLifecycle();
        this.IconCompatParcelizer = bundle;
        this.read = application;
        if (application != null) {
            if (asImageBitmap.serializer == null) {
                asImageBitmap.serializer = new asImageBitmap(application);
            }
            asimagebitmap = asImageBitmap.serializer;
            asimagebitmap.getClass();
        } else {
            asimagebitmap = new asImageBitmap(null);
        }
        this.serializer = asimagebitmap;
    }

    @Override // o.AndroidPaint
    public final void read(androidx.lifecycle.ViewModel viewModel) {
        supportsColorMatrixQuery supportscolormatrixquery = this.RemoteActionCompatParcelizer;
        if (supportscolormatrixquery != null) {
            getLightGray0d7_KjU getlightgray0d7_kju = this.write;
            getlightgray0d7_kju.getClass();
            TuplesKt.write(viewModel, getlightgray0d7_kju, supportscolormatrixquery);
        }
    }

    public final androidx.lifecycle.ViewModel serializer(Class cls, String str) {
        supportsColorMatrixQuery supportscolormatrixquery = this.RemoteActionCompatParcelizer;
        if (supportscolormatrixquery == null) {
            IBraze$$ExternalSyntheticBUOutline0.m("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = saveLayer.class.isAssignableFrom(cls);
        Application application = this.read;
        Constructor constructorSerializer = (!zIsAssignableFrom || application == null) ? AndroidMatrixConversions_androidKt.serializer(AndroidMatrixConversions_androidKt.read, cls) : AndroidMatrixConversions_androidKt.serializer(AndroidMatrixConversions_androidKt.RemoteActionCompatParcelizer, cls);
        if (constructorSerializer == null) {
            if (application != null) {
                return this.serializer.serializer(cls);
            }
            if (setFromtUYjHk.RemoteActionCompatParcelizer == null) {
                setFromtUYjHk.RemoteActionCompatParcelizer = new setFromtUYjHk();
            }
            setFromtUYjHk.RemoteActionCompatParcelizer.getClass();
            return (androidx.lifecycle.ViewModel) MathKt.RemoteActionCompatParcelizer(new Object[]{cls}, extractAuthorizationHeader.write(), -430013990, 430013990, extractAuthorizationHeader.write(), extractAuthorizationHeader.write(), extractAuthorizationHeader.write());
        }
        getLightGray0d7_KjU getlightgray0d7_kju = this.write;
        getlightgray0d7_kju.getClass();
        getHasAlpha gethasalphaIconCompatParcelizer = TuplesKt.IconCompatParcelizer(getlightgray0d7_kju, supportscolormatrixquery, str, this.IconCompatParcelizer);
        getBitmapui_graphics getbitmapui_graphics = gethasalphaIconCompatParcelizer.read;
        androidx.lifecycle.ViewModel viewModelSerializer = (!zIsAssignableFrom || application == null) ? AndroidMatrixConversions_androidKt.serializer(cls, constructorSerializer, getbitmapui_graphics) : AndroidMatrixConversions_androidKt.serializer(cls, constructorSerializer, application, getbitmapui_graphics);
        viewModelSerializer.addCloseable("androidx.lifecycle.savedstate.vm.tag", gethasalphaIconCompatParcelizer);
        return viewModelSerializer;
    }

    public ActualImageBitmapx__hDU() {
        this.serializer = new asImageBitmap(null);
    }

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, setStrokeMiterLimit setstrokemiterlimit) {
        return serializer(Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk), setstrokemiterlimit);
    }

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return serializer(cls, canonicalName);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
