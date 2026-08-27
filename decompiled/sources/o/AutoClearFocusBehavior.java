package o;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoClearFocusBehavior {
    public static final toZui_graphics RemoteActionCompatParcelizer = new toZui_graphics("StreamingFormatChecker", "");
    public final LinkedList serializer = new LinkedList();
    public long IconCompatParcelizer = -1;

    public final void write(setRequestedFrameRate setrequestedframerate) {
        if (setrequestedframerate.MediaSessionCompatQueueItem != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.serializer;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(l);
            if (jElapsedRealtime - l.longValue() < DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                long j = this.IconCompatParcelizer;
                if (j == -1 || jElapsedRealtime - j >= DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                    this.IconCompatParcelizer = jElapsedRealtime;
                    toZui_graphics tozui_graphics = RemoteActionCompatParcelizer;
                    if (Log.isLoggable(tozui_graphics.serializer, 5)) {
                        SentryLogcatAdapter.IconCompatParcelizer("StreamingFormatChecker", tozui_graphics.read("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
