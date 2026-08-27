package o;

import android.os.Handler;
import android.os.Looper;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class getViewModelStore {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public static volatile Handler write;

    public static Handler read() {
        if (write != null) {
            return write;
        }
        synchronized (getViewModelStore.class) {
            if (write == null) {
                write = Handler.createAsync(Looper.getMainLooper());
            }
        }
        return write;
    }

    public static EntrancePictureFragment IconCompatParcelizer() {
        int i = 2 % 2;
        EntrancePictureFragment entrancePictureFragment = new EntrancePictureFragment();
        int i2 = IconCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return entrancePictureFragment;
    }

    public static String serializer(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 81;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (i == -1) {
            return "RESULT_OK";
        }
        int i6 = i4 + 27;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i != 0) {
            return String.valueOf(i);
        }
        return "RESULT_CANCELED";
    }
}
