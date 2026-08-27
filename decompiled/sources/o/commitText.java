package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageCameraOnlyUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class commitText extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ CrowdSourcingFloatingImageCameraOnlyUiModelImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public commitText(CrowdSourcingFloatingImageCameraOnlyUiModelImpl crowdSourcingFloatingImageCameraOnlyUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = crowdSourcingFloatingImageCameraOnlyUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return CrowdSourcingFloatingImageCameraOnlyUiModelImpl.access$saveTooltipShownRecord(this.IconCompatParcelizer, null, this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        CrowdSourcingFloatingImageCameraOnlyUiModelImpl.access$saveTooltipShownRecord(this.IconCompatParcelizer, null, this);
        throw null;
    }
}
