package o;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getNumPad0EK5gGoQ {
    public static final SimpleDateFormat IconCompatParcelizer;
    public static final StringBuilder RemoteActionCompatParcelizer;

    static {
        java.util.Locale locale = java.util.Locale.ROOT;
        IconCompatParcelizer = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        RemoteActionCompatParcelizer = new StringBuilder(33);
    }

    public static String IconCompatParcelizer(long j) {
        String string;
        StringBuilder sb = RemoteActionCompatParcelizer;
        synchronized (sb) {
            sb.setLength(0);
            RemoteActionCompatParcelizer(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public static void RemoteActionCompatParcelizer(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL) {
            sb.append(j / CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
            sb.append(com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
            j %= CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}
