package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetNumberPasswordcp extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ CrowdSourcingDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetNumberPasswordcp(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.write.getExistingPhotosTooltipShownCount(this);
        }
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.write.getExistingPhotosTooltipShownCount(this);
        throw null;
    }
}
