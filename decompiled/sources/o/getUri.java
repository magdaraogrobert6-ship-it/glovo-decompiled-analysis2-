package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SmoothScoreCalculatorV2")
public final class getUri implements getMessageExtras {
    private final setExpirationTimestamp RemoteActionCompatParcelizer;
    private final parseLonglambda0 write;

    @Override // o.getMessageExtras
    public final parseLonglambda0 write() {
        return this.write;
    }

    public getUri(parseLonglambda0 parselonglambda0, setExpirationTimestamp setexpirationtimestamp) {
        parselonglambda0.getClass();
        setexpirationtimestamp.getClass();
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = setexpirationtimestamp;
    }

    @Override // o.getMessageExtras
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k read(String str, long j, long j2, TransportChangeType transportChangeType) {
        str.getClass();
        transportChangeType.getClass();
        onAfterClosed onafterclosedIconCompatParcelizer = getMessageTextAlign.IconCompatParcelizer(this, str, j, j2, transportChangeType);
        if (onafterclosedIconCompatParcelizer == null) {
            return null;
        }
        int iWrite = onafterclosedIconCompatParcelizer.write();
        int iSerializer = onafterclosedIconCompatParcelizer.serializer();
        double dPow = 1.0d;
        if (iWrite != 0) {
            dPow = Math.pow(1.0d - ((((double) iWrite) * 3.0d) / ((double) iSerializer)), 3.0d);
        }
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.SMOOTH, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(dPow));
    }

    @Override // o.getMessageExtras
    public final setExpirationTimestamp serializer() {
        return this.RemoteActionCompatParcelizer;
    }
}
