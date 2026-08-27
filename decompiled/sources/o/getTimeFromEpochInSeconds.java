package o;

import com.ui.common.base.BaseRxViewModel;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes4.dex */
public final class getTimeFromEpochInSeconds extends BaseRxViewModel {
    public final SharedResourcePool IconCompatParcelizer;
    public final SharedResourcePool read;

    public final SharedResourcePool read() {
        return this.IconCompatParcelizer;
    }

    public final SharedResourcePool write() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer() {
        this.read.serializer(networkTimeClock_delegatelambda0.read);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTimeFromEpochInSeconds(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, SharedResourcePool sharedResourcePool, SharedResourcePool sharedResourcePool2) {
        super(getpivotoffsetf1c5bw0);
        getpivotoffsetf1c5bw0.getClass();
        sharedResourcePool.getClass();
        sharedResourcePool2.getClass();
        this.read = sharedResourcePool;
        this.IconCompatParcelizer = sharedResourcePool2;
    }
}
