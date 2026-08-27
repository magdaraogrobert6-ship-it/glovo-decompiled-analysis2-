package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.core.ImageCapture$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Locale;
import o.SoftwareJpegEncodingPreferredQuirk;
import o.setController;
import o.setTrackTintList;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayInfoManager {
    public static volatile DisplayInfoManager serializer;
    public final DisplayManager MediaBrowserCompatMediaItem;
    public static final Size write = new Size(1920, 1080);
    public static final Size IconCompatParcelizer = new Size(320, 240);
    public static final Size RemoteActionCompatParcelizer = new Size(640, 480);
    public static final Object read = new Object();
    public volatile Size RatingCompat = null;
    public final setTrackTintList MediaSessionCompatQueueItem = new setTrackTintList(0);
    public final ImageCapture$1 MediaDescriptionCompat = new ImageCapture$1(17);

    public final Size serializer() {
        Size sizeIconCompatParcelizer;
        Point point = new Point();
        serializer(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = setController.MediaDescriptionCompat;
        if (size.getHeight() * size.getWidth() < setController.write(IconCompatParcelizer)) {
            size = ((SmallDisplaySizeQuirk) this.MediaDescriptionCompat.MediaSessionCompatQueueItem) != null ? (Size) SmallDisplaySizeQuirk.read.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = RemoteActionCompatParcelizer;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int width = size.getWidth();
        int height = size.getHeight();
        Size size3 = write;
        if (height * width > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer != null && (sizeIconCompatParcelizer = ExtraCroppingQuirk.IconCompatParcelizer(SoftwareJpegEncodingPreferredQuirk.PRIV)) != null) {
            if (sizeIconCompatParcelizer.getHeight() * sizeIconCompatParcelizer.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeIconCompatParcelizer;
            }
        }
        return size;
    }

    public final Display serializer(boolean z) {
        Display[] displays = this.MediaBrowserCompatMediaItem.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayIconCompatParcelizer = IconCompatParcelizer(displays, z);
        if (displayIconCompatParcelizer == null && z) {
            displayIconCompatParcelizer = IconCompatParcelizer(displays, false);
        }
        if (displayIconCompatParcelizer != null) {
            return displayIconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No display can be found from the input display manager!");
        return null;
    }

    public DisplayInfoManager(Context context) {
        this.MediaBrowserCompatMediaItem = (DisplayManager) context.getSystemService("display");
    }

    public static DisplayInfoManager IconCompatParcelizer(Context context) {
        if (serializer == null) {
            synchronized (read) {
                if (serializer == null) {
                    serializer = new DisplayInfoManager(context);
                }
            }
        }
        return serializer;
    }

    public final Size RemoteActionCompatParcelizer() {
        if (this.RatingCompat != null) {
            return this.RatingCompat;
        }
        this.RatingCompat = serializer();
        return this.RatingCompat;
    }

    public static Display IconCompatParcelizer(Display[] displayArr, boolean z) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x * point.y;
                if (i2 > i) {
                    display = display2;
                    i = i2;
                }
            }
        }
        return display;
    }
}
