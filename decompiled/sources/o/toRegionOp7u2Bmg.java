package o;

import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class toRegionOp7u2Bmg implements GraphicsContext {
    public static final accessgetWcp IconCompatParcelizer = new accessgetWcp(4);
    public final Object write;

    public androidx.lifecycle.ViewModel write(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) this.write;
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedk.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            return imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedk, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public toRegionOp7u2Bmg(getFilterQualityfv9h1I getfilterqualityfv9h1i, createImageBitmap createimagebitmap, setStrokeCapBeK7IIE setstrokecapbek7iie) {
        getfilterqualityfv9h1i.getClass();
        createimagebitmap.getClass();
        setstrokecapbek7iie.getClass();
        this.write = new ImageLoader$Builder(getfilterqualityfv9h1i, createimagebitmap, setstrokecapbek7iie);
    }

    public toRegionOp7u2Bmg() {
        this.write = new AtomicReference(null);
    }

    public toRegionOp7u2Bmg(androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner) {
        this.write = processLifecycleOwner;
    }
}
