package o;

import com.roadrunner.rider.state.ondemand.bonus.GetOnDemandWithBonusUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* JADX INFO: loaded from: classes3.dex */
public final class getAttributionI extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 IconCompatParcelizer;
    public final /* synthetic */ GetOnDemandWithBonusUiState RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAttributionI(GetOnDemandWithBonusUiState getOnDemandWithBonusUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getOnDemandWithBonusUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(this);
        int i4 = write + 103;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }
}
