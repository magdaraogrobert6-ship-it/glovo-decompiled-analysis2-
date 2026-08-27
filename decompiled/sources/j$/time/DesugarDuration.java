package j$.time;

import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public final class DesugarDuration {
    public static int toHoursPart(Duration duration) {
        return (int) (duration.toHours() % 24);
    }

    public static int toMinutesPart(Duration duration) {
        return (int) (duration.toMinutes() % 60);
    }

    public static long toSeconds(Duration duration) {
        return duration.getSeconds();
    }
}
