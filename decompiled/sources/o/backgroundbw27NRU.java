package o;

import android.os.Trace;
import com.sentiance.core.model.thrift.k$c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class backgroundbw27NRU {
    public final minIntrinsicWidth RemoteActionCompatParcelizer;

    public final maxIntrinsicHeight read(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getLogoDescription getlogodescription, androidx.camera.core.UseCaseGroup useCaseGroup) {
        minIntrinsicWidth minintrinsicwidth = this.RemoteActionCompatParcelizer;
        minintrinsicwidth.getClass();
        accessisrendernodecompatiblecp.getClass();
        getlogodescription.getClass();
        k$c k_c = minintrinsicwidth.read;
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:bindToLifecycle-UseCaseGroup");
        try {
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
            if (getcurrentcontentinsetright != null) {
                androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright.RemoteActionCompatParcelizer;
                if (camera2CameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                if (camera2CameraFactory.IconCompatParcelizer.IconCompatParcelizer() == 2) {
                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
                }
            }
            k$c.write(k_c, 1);
            List list = (List) useCaseGroup.read;
            list.getClass();
            CameraIdUtil cameraIdUtil = (CameraIdUtil) useCaseGroup.serializer;
            List list2 = (List) useCaseGroup.RemoteActionCompatParcelizer;
            list2.getClass();
            maxIntrinsicHeight maxintrinsicheightSerializer = k$c.serializer(k_c, accessisrendernodecompatiblecp, getlogodescription, new androidx.camera.core.LegacySessionConfig(list, cameraIdUtil, list2));
            Trace.endSection();
            return maxintrinsicheightSerializer;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void write(androidx.camera.core.UseCase... useCaseArr) {
        minIntrinsicWidth minintrinsicwidth = this.RemoteActionCompatParcelizer;
        minintrinsicwidth.getClass();
        k$c k_c = minintrinsicwidth.read;
        androidx.camera.core.UseCase[] useCaseArr2 = (androidx.camera.core.UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length);
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.read("CX:unbind");
        try {
            PrematureEndOfStreamVideoQuirk.write();
            getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) k_c.serializer;
            if (getcurrentcontentinsetright != null) {
                androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright.RemoteActionCompatParcelizer;
                if (camera2CameraFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                if (camera2CameraFactory.IconCompatParcelizer.IconCompatParcelizer() == 2) {
                    throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
                }
            }
            ((ObjectListtoString1) k_c.read).IconCompatParcelizer(new androidx.camera.core.LegacySessionConfig(onContentCardClicked.RemoteActionCompatParcelizer((Object[]) useCaseArr2)), (HashSet) k_c.MediaDescriptionCompat);
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public backgroundbw27NRU(minIntrinsicWidth minintrinsicwidth) {
        this.RemoteActionCompatParcelizer = minintrinsicwidth;
    }
}
