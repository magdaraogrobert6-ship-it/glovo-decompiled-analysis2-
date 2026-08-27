package o;

import com.sentiance.okhttp3.u$a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNode implements shutdown {
    public static final HashMap RemoteActionCompatParcelizer;
    public final shutdown IconCompatParcelizer;
    public final u$a MediaDescriptionCompat;
    public final FocusMeteringAction read;

    static {
        HashMap map = new HashMap();
        RemoteActionCompatParcelizer = map;
        map.put(1, AnimatedVisibilityKt.serializer);
        map.put(8, AnimatedVisibilityKt.RatingCompat);
        map.put(6, AnimatedVisibilityKt.read);
        map.put(5, AnimatedVisibilityKt.RemoteActionCompatParcelizer);
        map.put(4, AnimatedVisibilityKt.MediaBrowserCompatMediaItem);
        map.put(0, AnimatedVisibilityKt.IconCompatParcelizer);
    }

    @Override // o.shutdown
    public final boolean serializer(int i) {
        if (!this.IconCompatParcelizer.serializer(i)) {
            return false;
        }
        AnimatedVisibilityKt animatedVisibilityKt = (AnimatedVisibilityKt) RemoteActionCompatParcelizer.get(Integer.valueOf(i));
        if (animatedVisibilityKt == null) {
            return true;
        }
        for (androidx.camera.video.internal.compat.quirk.VideoQualityQuirk videoQualityQuirk : this.MediaDescriptionCompat.serializer(androidx.camera.video.internal.compat.quirk.VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.read(this.read, animatedVisibilityKt) && (!(videoQualityQuirk instanceof androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) || !((androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) videoQualityQuirk).RatingCompat())) {
                return false;
            }
        }
        return true;
    }

    public AbstractClickableNode(FocusMeteringAction focusMeteringAction, shutdown shutdownVar, u$a u_a) {
        this.IconCompatParcelizer = shutdownVar;
        this.read = focusMeteringAction;
        this.MediaDescriptionCompat = u_a;
    }

    @Override // o.shutdown
    public final SurfaceRequest write(int i) {
        if (serializer(i)) {
            return this.IconCompatParcelizer.write(i);
        }
        return null;
    }
}
