package o;

import android.os.Trace;
import com.sentiance.core.model.thrift.k$c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class minIntrinsicWidth {
    public static final minIntrinsicWidth IconCompatParcelizer;
    public final k$c read;

    public final void read() {
        this.read.write();
    }

    public minIntrinsicWidth(k$c k_c) {
        this.read = k_c;
    }

    public final maxIntrinsicHeight RemoteActionCompatParcelizer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getLogoDescription getlogodescription, androidx.camera.core.UseCase... useCaseArr) {
        accessisrendernodecompatiblecp.getClass();
        getlogodescription.getClass();
        k$c k_c = this.read;
        androidx.camera.core.UseCase[] useCaseArr2 = (androidx.camera.core.UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length);
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:bindToLifecycle");
        try {
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
            if (getcurrentcontentinsetright != null) {
                androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright.RemoteActionCompatParcelizer;
                if (camera2CameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                if (camera2CameraFactory.IconCompatParcelizer.IconCompatParcelizer() == 2) {
                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                }
            }
            k$c.write(k_c, 1);
            maxIntrinsicHeight maxintrinsicheightSerializer = k$c.serializer(k_c, accessisrendernodecompatiblecp, getlogodescription, new androidx.camera.core.LegacySessionConfig(onContentCardClicked.RemoteActionCompatParcelizer((Object[]) useCaseArr2)));
            Trace.endSection();
            return maxintrinsicheightSerializer;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean read(getLogoDescription getlogodescription) {
        boolean z;
        getlogodescription.getClass();
        k$c k_c = this.read;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:hasCamera");
        try {
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
            getcurrentcontentinsetright.getClass();
            getlogodescription.IconCompatParcelizer(getcurrentcontentinsetright.MediaBrowserCompatMediaItem.serializer());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } finally {
            Trace.endSection();
        }
        return z;
    }

    static {
        ObjectListtoString1 objectListtoString1;
        k$c k_c = new k$c();
        k_c.RemoteActionCompatParcelizer = new Object();
        k_c.IconCompatParcelizer = EncoderImplMediaCodecCallback.IconCompatParcelizer;
        synchronized (ObjectListtoString1.IconCompatParcelizer) {
            if (ObjectListtoString1.write == null) {
                ObjectListtoString1.write = new ObjectListtoString1();
            }
            objectListtoString1 = ObjectListtoString1.write;
        }
        objectListtoString1.getClass();
        k_c.read = objectListtoString1;
        k_c.MediaSessionCompatQueueItem = new HashMap();
        k_c.MediaDescriptionCompat = new HashSet();
        IconCompatParcelizer = new minIntrinsicWidth(k_c);
    }
}
