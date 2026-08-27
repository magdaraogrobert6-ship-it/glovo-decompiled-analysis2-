package o;

import com.roadrunner.rider.state.ondemand.presentation.GetOnDemandUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAppInstallTime extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ GetOnDemandUiState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAppInstallTime(GetOnDemandUiState getOnDemandUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = getOnDemandUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.write.invoke(this);
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        this.write.invoke(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
