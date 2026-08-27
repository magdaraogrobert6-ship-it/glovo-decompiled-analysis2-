package o;

import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class cacheIfAlive extends CompositionLocalsKtLocalHapticFeedback1 {
    public final void IconCompatParcelizer(long j) {
        RemoteActionCompatParcelizer();
        ((RateLimitProto$Counter) this.RemoteActionCompatParcelizer).setStartTimeEpoch(j);
    }

    public final void RemoteActionCompatParcelizer(long j) {
        RemoteActionCompatParcelizer();
        ((RateLimitProto$Counter) this.RemoteActionCompatParcelizer).setValue(j);
    }

    public cacheIfAlive(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
