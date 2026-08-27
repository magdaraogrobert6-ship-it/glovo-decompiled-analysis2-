package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes3.dex */
public final class setPinned implements isTest {
    private final setCropType read;
    private final setDismissType serializer;

    @Override // o.isTest
    public final setCropType read() {
        return this.read;
    }

    public setPinned(setDismissType setdismisstype, setCropType setcroptype) {
        setdismisstype.getClass();
        setcroptype.getClass();
        this.serializer = setdismisstype;
        this.read = setcroptype;
    }

    @Override // o.isTest
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k write(String str, long j, long j2, Boolean bool) {
        str.getClass();
        setListener setlistenerRemoteActionCompatParcelizer = setDismissibleByUser.RemoteActionCompatParcelizer(this, j, j2, bool);
        if (setlistenerRemoteActionCompatParcelizer == null) {
            return null;
        }
        double dSerializer = setlistenerRemoteActionCompatParcelizer.serializer();
        double dWrite = setlistenerRemoteActionCompatParcelizer.write();
        double dRemoteActionCompatParcelizer = setlistenerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        double d = (j2 - j) / 1000;
        if (d <= 0.0d) {
            return null;
        }
        double d2 = dRemoteActionCompatParcelizer / d;
        double d3 = dWrite / d;
        double d4 = dSerializer / d;
        double d5 = d2 + d3 + d4;
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.ATTENTION, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(Math.pow(1.0d - (((Math.pow(d5, 0.5d) * d3) + (d2 * d5)) + d4), 3.0d)));
    }

    @Override // o.isTest
    public final setDismissType RemoteActionCompatParcelizer() {
        return this.serializer;
    }
}
