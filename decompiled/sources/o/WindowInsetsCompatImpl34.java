package o;

import com.roadrunner.freelancing.presentation.tab.GetWorkOpportunityTypeSelectorUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class WindowInsetsCompatImpl34 extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int read;
    public Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetWorkOpportunityTypeSelectorUiState serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsCompatImpl34(GetWorkOpportunityTypeSelectorUiState getWorkOpportunityTypeSelectorUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getWorkOpportunityTypeSelectorUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i4 = RatingCompat + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
