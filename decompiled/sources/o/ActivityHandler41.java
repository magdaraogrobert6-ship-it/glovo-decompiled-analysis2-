package o;

import com.roadrunner.login.logging.OtpLogger;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler41 extends androidx.lifecycle.ViewModel {
    public static final Set IconCompatParcelizer = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"0001", "0002", "0003", "0004", "0005"});
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final OtpLogger write;

    public ActivityHandler41(OtpLogger otpLogger) {
        otpLogger.getClass();
        this.write = otpLogger;
    }

    static {
        int i = serializer + 109;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r3
  0x002a: PHI (r3v1 com.roadrunner.login.logging.OtpLogger) = (r3v0 com.roadrunner.login.logging.OtpLogger), (r3v3 com.roadrunner.login.logging.OtpLogger) binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void write(int i, String str) {
        OtpLogger otpLogger;
        int i2 = 2 % 2;
        int i3 = read + 19;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str.getClass();
            int length = str.length();
            otpLogger = this.write;
            int i4 = 17 / 0;
            if (length > 0) {
                otpLogger.IconCompatParcelizer.logEvent("pass_verification_completed", null);
            }
        } else {
            str.getClass();
            int length2 = str.length();
            otpLogger = this.write;
            if (length2 > 0) {
                otpLogger.IconCompatParcelizer.logEvent("pass_verification_completed", null);
            }
        }
        if (!str.equals("0003")) {
            if (IconCompatParcelizer.contains(str)) {
                decode decodeVar = otpLogger.IconCompatParcelizer;
                Map mapSingletonMap = Collections.singletonMap("retry_count", String.valueOf(i));
                mapSingletonMap.getClass();
                decodeVar.logEvent("pass_verification_failed", mapSingletonMap);
                return;
            }
            return;
        }
        int i5 = MediaDescriptionCompat + 61;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        decode decodeVar2 = otpLogger.IconCompatParcelizer;
        Map mapSingletonMap2 = Collections.singletonMap("retry_count", String.valueOf(i));
        mapSingletonMap2.getClass();
        decodeVar2.logEvent("pass_verification_failed", mapSingletonMap2);
        otpLogger.IconCompatParcelizer.logEvent("pass_no_baemin_account", null);
        int i7 = MediaDescriptionCompat + 79;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 81 / 0;
        }
    }
}
