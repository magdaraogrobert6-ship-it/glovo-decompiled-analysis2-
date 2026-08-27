package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetPasswordcp extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ CrowdSourcingDataStore IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetPasswordcp(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object termsOfUseAccepted = this.IconCompatParcelizer.getTermsOfUseAccepted(this);
        int i4 = write + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return termsOfUseAccepted;
        }
        throw null;
    }
}
