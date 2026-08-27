package o;

import com.sentiance.protobuf.NullValue;
import com.sentiance.protobuf.Syntax;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeNetworkFailureEvent implements getFeatureFlags {
    public final /* synthetic */ int write;

    public /* synthetic */ BrazeNetworkFailureEvent(int i) {
        this.write = i;
    }

    @Override // o.getFeatureFlags
    public IEventSubscriber read(int i) {
        return this.write != 0 ? NullValue.forNumber(i) : Syntax.forNumber(i);
    }
}
