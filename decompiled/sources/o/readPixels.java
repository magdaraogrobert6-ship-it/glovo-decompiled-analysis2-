package o;

import android.os.Bundle;
import bo.app.a5$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class readPixels implements getGreen0d7_KjU {
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final getLightGray0d7_KjU read;
    public Bundle serializer;
    public boolean write;

    @Override // o.getGreen0d7_KjU
    public final Bundle saveState() {
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        Bundle bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
        Bundle bundle2 = this.serializer;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((AndroidImageBitmap_androidKt) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).RemoteActionCompatParcelizer.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleSaveState = ((r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) ((getBitmapui_graphics) entry.getValue()).read.serializer).saveState();
            if (!getCyan0d7_KjU.read(bundleSaveState)) {
                str.getClass();
                bundle.putBundle(str, bundleSaveState);
            }
        }
        this.write = false;
        return bundle;
    }

    public readPixels(getLightGray0d7_KjU getlightgray0d7_kju, asFrameworkPaint asframeworkpaint) {
        getlightgray0d7_kju.getClass();
        this.read = getlightgray0d7_kju;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new a5$$ExternalSyntheticLambda0(8, asframeworkpaint));
    }

    public final void IconCompatParcelizer() {
        if (this.write) {
            return;
        }
        Bundle bundleWrite = this.read.write("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        Bundle bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
        Bundle bundle2 = this.serializer;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleWrite != null) {
            bundle.putAll(bundleWrite);
        }
        this.serializer = bundle;
        this.write = true;
    }
}
