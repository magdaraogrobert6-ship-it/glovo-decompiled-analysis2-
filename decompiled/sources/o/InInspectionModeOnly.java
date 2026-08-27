package o;

import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class InInspectionModeOnly extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ AcknowledgementTaskUiModelImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InInspectionModeOnly(AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = acknowledgementTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$loadAnalytics;
        int i = 2 % 2;
        int i2 = serializer + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objAccess$loadAnalytics = AcknowledgementTaskUiModelImpl.access$loadAnalytics(this.write, this);
            int i3 = 65 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objAccess$loadAnalytics = AcknowledgementTaskUiModelImpl.access$loadAnalytics(this.write, this);
        }
        int i4 = RemoteActionCompatParcelizer + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return objAccess$loadAnalytics;
    }
}
