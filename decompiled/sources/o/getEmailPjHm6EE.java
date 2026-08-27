package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.floating.data.CrowdSourcingFloatingImageRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getEmailPjHm6EE extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ CrowdSourcingFloatingImageRepositoryImpl RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEmailPjHm6EE(CrowdSourcingFloatingImageRepositoryImpl crowdSourcingFloatingImageRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = crowdSourcingFloatingImageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objIncrementTooltipShownCounts = this.RemoteActionCompatParcelizer.incrementTooltipShownCounts(null, this);
        int i4 = read + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objIncrementTooltipShownCounts;
        }
        throw null;
    }
}
