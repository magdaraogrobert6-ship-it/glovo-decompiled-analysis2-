package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetEmailcp extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ CrowdSourcingDataStore read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetEmailcp(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.read.getAddPhotosTooltipShownCount(this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object addPhotosTooltipShownCount = this.read.getAddPhotosTooltipShownCount(this);
        int i3 = serializer + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return addPhotosTooltipShownCount;
    }
}
