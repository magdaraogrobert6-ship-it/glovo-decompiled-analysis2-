package o;

import android.os.Bundle;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamite.zzj;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class prepareToDraw {
    public static final accessgetVcp RemoteActionCompatParcelizer;
    public static final FlingCancellationException read = new FlingCancellationException(3);
    public static final setRoundRectOutlineTNW_H78default write;

    public static final AndroidImageBitmap_androidKt serializer(asFrameworkPaint asframeworkpaint) {
        toRegionOp7u2Bmg toregionop7u2bmgSerializer = zzj.serializer(asframeworkpaint, new asAndroidBitmap(), 4);
        return (AndroidImageBitmap_androidKt) ((ImageLoader$Builder) toregionop7u2bmgSerializer.write).write(displayInAppMessagelambda1.serializer(AndroidImageBitmap_androidKt.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    static {
        int i = 4;
        write = new setRoundRectOutlineTNW_H78default(i);
        RemoteActionCompatParcelizer = new accessgetVcp(i);
    }

    public static final getBitmapui_graphics IconCompatParcelizer(setStrokeCapBeK7IIE setstrokecapbek7iie) {
        getBitmapui_graphics getbitmapui_graphics;
        setstrokecapbek7iie.getClass();
        getTransparent0d7_KjU gettransparent0d7_kju = (getTransparent0d7_KjU) setstrokecapbek7iie.write(read);
        Bundle bundle = null;
        if (gettransparent0d7_kju == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        asFrameworkPaint asframeworkpaint = (asFrameworkPaint) setstrokecapbek7iie.write(write);
        if (asframeworkpaint == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) setstrokecapbek7iie.write(RemoteActionCompatParcelizer);
        String str = (String) setstrokecapbek7iie.write(toRegionOp7u2Bmg.IconCompatParcelizer);
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        getGreen0d7_KjU getgreen0d7_kjuIconCompatParcelizer = gettransparent0d7_kju.getSavedStateRegistry().IconCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider");
        readPixels readpixels = getgreen0d7_kjuIconCompatParcelizer instanceof readPixels ? (readPixels) getgreen0d7_kjuIconCompatParcelizer : null;
        if (readpixels == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = serializer(asframeworkpaint).RemoteActionCompatParcelizer;
        getBitmapui_graphics getbitmapui_graphics2 = (getBitmapui_graphics) linkedHashMap.get(str);
        if (getbitmapui_graphics2 != null) {
            return getbitmapui_graphics2;
        }
        readpixels.IconCompatParcelizer();
        Bundle bundle3 = readpixels.serializer;
        if (bundle3 != null && getCyan0d7_KjU.IconCompatParcelizer(bundle3, str)) {
            Bundle bundleSerializer = getCyan0d7_KjU.serializer(bundle3, str);
            if (bundleSerializer == null) {
                bundleSerializer = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), 1771348320);
            }
            bundle3.remove(str);
            if (getCyan0d7_KjU.read(bundle3)) {
                readpixels.serializer = null;
            }
            bundle = bundleSerializer;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            getbitmapui_graphics = new getBitmapui_graphics();
        } else {
            ClassLoader classLoader = getBitmapui_graphics.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            getbitmapui_graphics = new getBitmapui_graphics(getCyan0d7_KjU.serializer(bundle2));
        }
        linkedHashMap.put(str, getbitmapui_graphics);
        return getbitmapui_graphics;
    }

    public static final void serializer(getTransparent0d7_KjU gettransparent0d7_kju) {
        toColorLong8_81llA tocolorlong8_81lla = ((accessregisterComponentCallback) gettransparent0d7_kju.getLifecycle()).RatingCompat;
        if (tocolorlong8_81lla != toColorLong8_81llA.INITIALIZED && tocolorlong8_81lla != toColorLong8_81llA.CREATED) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
        } else if (gettransparent0d7_kju.getSavedStateRegistry().IconCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            readPixels readpixels = new readPixels(gettransparent0d7_kju.getSavedStateRegistry(), (asFrameworkPaint) gettransparent0d7_kju);
            gettransparent0d7_kju.getSavedStateRegistry().RemoteActionCompatParcelizer("androidx.lifecycle.internal.SavedStateHandlesProvider", readpixels);
            gettransparent0d7_kju.getLifecycle().IconCompatParcelizer(new getConfig_sVssgQ(readpixels));
        }
    }
}
