package o;

import android.content.Context;
import android.os.Build;
import com.roadrunner.liveness.domain.CreateMultipartForLivenessUploadImpl;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class compare {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static CreateMultipartForLivenessUploadImpl IconCompatParcelizer(onExitLayoutOrScroll onexitlayoutorscroll, setDistanceToTriggerSync setdistancetotriggersync, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        int i = 2 % 2;
        onexitlayoutorscroll.getClass();
        setdistancetotriggersync.getClass();
        isopeninternalroom_runtime.getClass();
        CreateMultipartForLivenessUploadImpl createMultipartForLivenessUploadImpl = new CreateMultipartForLivenessUploadImpl(onexitlayoutorscroll, setdistancetotriggersync, isopeninternalroom_runtime);
        int i2 = IconCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createMultipartForLivenessUploadImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[PHI: r3
  0x003a: PHI (r3v6 int) = (r3v5 int), (r3v7 int) binds: [B:10:0x0038, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    public static Context RemoteActionCompatParcelizer(Context context) {
        int iWrite;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Context applicationContext = context.getApplicationContext();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            int i5 = IconCompatParcelizer + 5;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                iWrite = AudioStreamAudioStreamException.write(context);
                int i6 = 52 / 0;
                if (iWrite != AudioStreamAudioStreamException.write(applicationContext)) {
                    applicationContext = AudioStreamAudioStreamException.write(applicationContext, iWrite);
                }
            } else {
                iWrite = AudioStreamAudioStreamException.write(context);
                if (iWrite != AudioStreamAudioStreamException.write(applicationContext)) {
                    applicationContext = AudioStreamAudioStreamException.write(applicationContext, iWrite);
                }
            }
        }
        if (i4 >= 30) {
            String strIconCompatParcelizer = FocusRequesterCompanionFocusRequesterFactory.IconCompatParcelizer(context);
            if (!Objects.equals(strIconCompatParcelizer, FocusRequesterCompanionFocusRequesterFactory.IconCompatParcelizer(applicationContext))) {
                Context context2 = FocusRequesterCompanionFocusRequesterFactory.read(applicationContext, strIconCompatParcelizer);
                int i7 = read + 5;
                IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return context2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return applicationContext;
    }
}
