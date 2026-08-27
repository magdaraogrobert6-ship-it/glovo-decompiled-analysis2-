package androidx.camera.core.internal.compat.quirk;

import com.sentiance.okhttp3.u$a;
import java.util.Iterator;
import o.CameraUpdateException;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends CameraUpdateException {
    default boolean RatingCompat() {
        return true;
    }

    static boolean write(u$a u_a) {
        Iterator it = u_a.serializer(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).RatingCompat()) {
                return true;
            }
        }
        return false;
    }
}
