package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firestore.v1.Value;
import java.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOnObserveReadsChangedui {
    public static final observeReads IconCompatParcelizer;
    public static final observeReads MediaDescriptionCompat;
    public static final observeReads MediaMetadataCompat;
    public static final observeReads RatingCompat;
    public static final observeReads RemoteActionCompatParcelizer;
    public static final ObserverModifierNodeKt read;
    public static final ObserverModifierNodeKt serializer;
    public static final observeReads write;

    public static final boolean serializer(int i, long j) {
        return j >= -62135596800L && j <= 253402300799L && i >= 0 && ((long) i) < 1000000000;
    }

    static {
        int i = 2;
        serializer = new ObserverModifierNodeKt(i);
        int i2 = 3;
        read = new ObserverModifierNodeKt(i2);
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer = Value.RemoteActionCompatParcelizer.TIMESTAMP_VALUE;
        IconCompatParcelizer = new observeReads(remoteActionCompatParcelizer, 5);
        write = new observeReads(remoteActionCompatParcelizer, 6);
        RemoteActionCompatParcelizer = new observeReads(remoteActionCompatParcelizer, 7);
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = Value.RemoteActionCompatParcelizer.INTEGER_VALUE;
        MediaMetadataCompat = new observeReads(remoteActionCompatParcelizer2, i);
        MediaDescriptionCompat = new observeReads(remoteActionCompatParcelizer2, i2);
        RatingCompat = new observeReads(remoteActionCompatParcelizer2, 4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ChronoUnit serializer(String str) {
        switch (str.hashCode()) {
            case -1074026988:
                if (str.equals("minute")) {
                    return ChronoUnit.MINUTES;
                }
                break;
            case -906279820:
                if (str.equals("second")) {
                    return ChronoUnit.SECONDS;
                }
                break;
            case -368353224:
                if (str.equals("microsecond")) {
                    return ChronoUnit.MICROS;
                }
                break;
            case 99228:
                if (str.equals("day")) {
                    return ChronoUnit.DAYS;
                }
                break;
            case 3208676:
                if (str.equals("hour")) {
                    return ChronoUnit.HOURS;
                }
                break;
            case 1942410881:
                if (str.equals("millisecond")) {
                    return ChronoUnit.MILLIS;
                }
                break;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected timestamp unit: ".concat(str));
        return null;
    }
}
