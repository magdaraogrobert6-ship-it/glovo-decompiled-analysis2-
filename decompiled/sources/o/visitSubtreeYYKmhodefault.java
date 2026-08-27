package o;

import java.util.concurrent.TimeUnit;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class visitSubtreeYYKmhodefault {
    public boolean RemoteActionCompatParcelizer;
    public long write;

    public final long RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            return System.nanoTime() - this.write;
        }
        return 0L;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jNanoTime = this.RemoteActionCompatParcelizer ? System.nanoTime() - this.write : 0L;
        long j = jNanoTime / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jNanoTime / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jNanoTime / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jNanoTime / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jNanoTime / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jNanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        int i = visitSubtreeIfYYKmho.IconCompatParcelizer;
        sb.append(String.format(java.util.Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb.append(" ");
        switch (visitSubtreeIf.read[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE;
                break;
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                return null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void write() {
        TextStreamsKt.RemoteActionCompatParcelizer("This stopwatch is already running.", !this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = true;
        this.write = System.nanoTime();
    }
}
