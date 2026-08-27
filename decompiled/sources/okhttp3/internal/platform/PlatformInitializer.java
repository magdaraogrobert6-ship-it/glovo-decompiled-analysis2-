package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.getMaxSafeLeftInset;
import o.getMaxSafeTopInset;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes5.dex */
public final class PlatformInitializer implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        return instance_delegatelambda0.write;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        context.getClass();
        getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
        Object obj = getMaxSafeTopInset.MediaDescriptionCompat;
        getMaxSafeLeftInset getmaxsafeleftinset = obj != null ? (getMaxSafeLeftInset) obj : null;
        if (getmaxsafeleftinset != null) {
            getmaxsafeleftinset.RemoteActionCompatParcelizer(context);
        }
        return getMaxSafeTopInset.MediaDescriptionCompat;
    }
}
