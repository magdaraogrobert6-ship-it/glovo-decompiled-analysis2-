package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class clearMetaKeyStates extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ CrowdSourcingFloatingImageButtonUiModelImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clearMetaKeyStates(CrowdSourcingFloatingImageButtonUiModelImpl crowdSourcingFloatingImageButtonUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = crowdSourcingFloatingImageButtonUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return CrowdSourcingFloatingImageButtonUiModelImpl.access$saveTooltipShownRecord(this.serializer, null, this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        CrowdSourcingFloatingImageButtonUiModelImpl.access$saveTooltipShownRecord(this.serializer, null, this);
        throw null;
    }
}
