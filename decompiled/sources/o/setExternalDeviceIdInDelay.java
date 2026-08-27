package o;

import com.roadrunner.rider.recruitment.accountcreation.navigation.AccountCreationButtonUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setExternalDeviceIdInDelay extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ AccountCreationButtonUiModelImpl read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setExternalDeviceIdInDelay(AccountCreationButtonUiModelImpl accountCreationButtonUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = accountCreationButtonUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object accountCreationButtonUiState = this.read.getAccountCreationButtonUiState(this);
        int i4 = IconCompatParcelizer + 91;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return accountCreationButtonUiState;
        }
        throw null;
    }
}
