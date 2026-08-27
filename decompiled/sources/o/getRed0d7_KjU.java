package o;

import android.os.Bundle;
import androidx.savedstate.internal.SavedStateRegistryImpl$$ExternalSyntheticLambda0;
import bo.app.a5$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getRed0d7_KjU {
    public final getTransparent0d7_KjU MediaDescriptionCompat;
    public final a5$$ExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    public Bundle RatingCompat;
    public boolean serializer;
    public boolean write;
    public final speculativeHit RemoteActionCompatParcelizer = new speculativeHit(5);
    public final LinkedHashMap IconCompatParcelizer = new LinkedHashMap();
    public boolean read = true;

    public final void RemoteActionCompatParcelizer() {
        getTransparent0d7_KjU gettransparent0d7_kju = this.MediaDescriptionCompat;
        if (((accessregisterComponentCallback) gettransparent0d7_kju.getLifecycle()).RatingCompat != toColorLong8_81llA.INITIALIZED) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.serializer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("SavedStateRegistry was already attached.");
                return;
            }
            this.MediaSessionCompatQueueItem.invoke();
            gettransparent0d7_kju.getLifecycle().IconCompatParcelizer(new SavedStateRegistryImpl$$ExternalSyntheticLambda0(0, this));
            this.serializer = true;
        }
    }

    public getRed0d7_KjU(getTransparent0d7_KjU gettransparent0d7_kju, a5$$ExternalSyntheticLambda0 a5__externalsyntheticlambda0) {
        this.MediaDescriptionCompat = gettransparent0d7_kju;
        this.MediaSessionCompatQueueItem = a5__externalsyntheticlambda0;
    }
}
