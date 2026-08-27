package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getDecimalPjHm6EEannotations extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ CrowdSourcingDataStore serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDecimalPjHm6EEannotations(CrowdSourcingDataStore crowdSourcingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = crowdSourcingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object termsOfUseAccepted;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            termsOfUseAccepted = this.serializer.setTermsOfUseAccepted(this);
            int i3 = 24 / 0;
        } else {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            termsOfUseAccepted = this.serializer.setTermsOfUseAccepted(this);
        }
        int i4 = read + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return termsOfUseAccepted;
    }
}
