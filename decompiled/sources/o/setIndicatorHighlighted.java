package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setIndicatorHighlighted implements isTest {
    private final setDismissType read;
    private final setCropType serializer;

    @Override // o.isTest
    public final setCropType read() {
        return this.serializer;
    }

    public setIndicatorHighlighted(setDismissType setdismisstype, setCropType setcroptype) {
        setdismisstype.getClass();
        setcroptype.getClass();
        this.read = setdismisstype;
        this.serializer = setcroptype;
    }

    @Override // o.isTest
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k write(String str, long j, long j2, Boolean bool) {
        Double dValueOf;
        str.getClass();
        setListener setlistenerRemoteActionCompatParcelizer = setDismissibleByUser.RemoteActionCompatParcelizer(this, j, j2, bool);
        if (setlistenerRemoteActionCompatParcelizer != null) {
            double dSerializer = setlistenerRemoteActionCompatParcelizer.serializer();
            double dWrite = setlistenerRemoteActionCompatParcelizer.write();
            double dRemoteActionCompatParcelizer = setlistenerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            double d = (j2 - j) / 1000;
            if (d <= 0.0d) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(RangesKt.read(1.0d - ((((1.0d - serializer((dRemoteActionCompatParcelizer * (-35.0d)) / d, 1.25d, 1.0d, 5.0d, 1.0d)) * 0.3333333333333333d) + ((1.0d - serializer(-dWrite, 1.0d, 0.03d, 4.4d, -1.0d)) * 0.6666666666666666d)) + ((1.0d - serializer(-dSerializer, 1.0d, 0.03d, 4.4d, -1.0d)) * 1.0d)), 0.0d, 1.0d));
            }
            if (dValueOf != null) {
                return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.ATTENTION, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(dValueOf.doubleValue()));
            }
        }
        return null;
    }

    @Override // o.isTest
    public final setDismissType RemoteActionCompatParcelizer() {
        return this.read;
    }

    private static double serializer(double d, double d2, double d3, double d4, double d5) {
        return RangesKt.read(((d2 - 0.0d) / Math.pow((Math.exp((-d3) * d) * 2.0d) + d5, 1.0d / d4)) + 0.0d, 0.0d, 1.0d);
    }
}
