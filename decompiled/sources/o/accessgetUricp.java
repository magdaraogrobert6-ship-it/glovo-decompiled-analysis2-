package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetUricp extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ CrowdSourcingDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetUricp(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.write.setAddPhotosTooltipShownLastAddress(null, this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object addPhotosTooltipShownLastAddress = this.write.setAddPhotosTooltipShownLastAddress(null, this);
        int i3 = serializer + 67;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
        return addPhotosTooltipShownLastAddress;
    }
}
