package o;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment$$ExternalSyntheticLambda2;
import bo.app.a5$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class toPorterDuffModes9anfk8 implements AndroidColorFilter_androidKt, getTransparent0d7_KjU, asFrameworkPaint {
    public final Fragment$$ExternalSyntheticLambda2 IconCompatParcelizer;
    public final getFilterQualityfv9h1I MediaMetadataCompat;
    public final androidx.fragment.app.Fragment RemoteActionCompatParcelizer;
    public createImageBitmap serializer;
    public accessregisterComponentCallback write = null;
    public getWhite0d7_KjU read = null;

    public final void IconCompatParcelizer(AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        this.write.serializer(androidColorSpace_androidKt);
    }

    @Override // o.AndroidColorFilter_androidKt
    public final setStrokeCapBeK7IIE getDefaultViewModelCreationExtras() {
        Application application;
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        setStrokeMiterLimit setstrokemiterlimit = new setStrokeMiterLimit(0);
        LinkedHashMap linkedHashMap = setstrokemiterlimit.read;
        if (application != null) {
            linkedHashMap.put(asImageBitmap.IconCompatParcelizer, application);
        }
        linkedHashMap.put(prepareToDraw.read, fragment);
        linkedHashMap.put(prepareToDraw.write, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(prepareToDraw.RemoteActionCompatParcelizer, fragment.getArguments());
        }
        return setstrokemiterlimit;
    }

    @Override // o.AndroidColorFilter_androidKt
    public final createImageBitmap getDefaultViewModelProviderFactory() {
        Application application;
        androidx.fragment.app.Fragment fragment = this.RemoteActionCompatParcelizer;
        createImageBitmap defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs)) {
            this.serializer = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.serializer == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.serializer = new ActualImageBitmapx__hDU(application, fragment, fragment.getArguments());
        }
        return this.serializer;
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        IconCompatParcelizer();
        return this.write;
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        IconCompatParcelizer();
        return this.read.read;
    }

    @Override // o.asFrameworkPaint
    public final getFilterQualityfv9h1I getViewModelStore() {
        IconCompatParcelizer();
        return this.MediaMetadataCompat;
    }

    public toPorterDuffModes9anfk8(androidx.fragment.app.Fragment fragment, getFilterQualityfv9h1I getfilterqualityfv9h1i, Fragment$$ExternalSyntheticLambda2 fragment$$ExternalSyntheticLambda2) {
        this.RemoteActionCompatParcelizer = fragment;
        this.MediaMetadataCompat = getfilterqualityfv9h1i;
        this.IconCompatParcelizer = fragment$$ExternalSyntheticLambda2;
    }

    public final void IconCompatParcelizer() {
        if (this.write == null) {
            this.write = new accessregisterComponentCallback(this, true);
            getRed0d7_KjU getred0d7_kju = new getRed0d7_KjU(this, new a5$$ExternalSyntheticLambda0(12, this));
            this.read = new getWhite0d7_KjU(getred0d7_kju);
            getred0d7_kju.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer.run();
        }
    }
}
