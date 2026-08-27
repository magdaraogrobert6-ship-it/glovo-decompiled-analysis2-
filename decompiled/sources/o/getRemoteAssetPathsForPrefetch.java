package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "SmoothScoreCalculatorV1")
public final class getRemoteAssetPathsForPrefetch implements getMessageExtras {
    private final setExpirationTimestamp RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;

    @Override // o.getMessageExtras
    public final parseLonglambda0 write() {
        return this.read;
    }

    public getRemoteAssetPathsForPrefetch(parseLonglambda0 parselonglambda0, setExpirationTimestamp setexpirationtimestamp) {
        parselonglambda0.getClass();
        setexpirationtimestamp.getClass();
        this.read = parselonglambda0;
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
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.SMOOTH, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(iWrite != 0 ? (1.0d / Math.exp(((((double) iWrite) / ((double) onafterclosedIconCompatParcelizer.serializer())) + 0.05d) * 12.0d)) + 0.45d : 1.0d));
    }

    @Override // o.getMessageExtras
    public final setExpirationTimestamp serializer() {
        return this.RemoteActionCompatParcelizer;
    }
}
