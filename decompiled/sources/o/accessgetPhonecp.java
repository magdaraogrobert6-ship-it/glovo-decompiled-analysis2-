package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetPhonecp extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ CrowdSourcingDataStore IconCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetPhonecp(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.getHasPhotosTooltipShownLastAddress(this);
            throw null;
        }
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object hasPhotosTooltipShownLastAddress = this.IconCompatParcelizer.getHasPhotosTooltipShownLastAddress(this);
        int i3 = read + 81;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return hasPhotosTooltipShownLastAddress;
        }
        throw null;
    }
}
