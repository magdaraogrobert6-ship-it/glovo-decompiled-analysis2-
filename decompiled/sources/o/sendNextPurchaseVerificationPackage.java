package o;

import com.roadrunner.rider.state.searchshifts.domain.GetSearchShiftsWithBonusUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class sendNextPurchaseVerificationPackage extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetSearchShiftsWithBonusUiState serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sendNextPurchaseVerificationPackage(GetSearchShiftsWithBonusUiState getSearchShiftsWithBonusUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getSearchShiftsWithBonusUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i4 = read + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
