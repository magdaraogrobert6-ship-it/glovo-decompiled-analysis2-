package o;

import com.roadrunner.rider.state.offertowork.presentation.GetOfferToWorkUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getCode extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ GetOfferToWorkUiState RemoteActionCompatParcelizer;
    public int read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCode(GetOfferToWorkUiState getOfferToWorkUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getOfferToWorkUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.invoke(this);
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 47 / 0;
        return this.RemoteActionCompatParcelizer.invoke(this);
    }
}
