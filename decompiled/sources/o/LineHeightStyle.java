package o;

import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShowNavigationSettingsTooltipUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LineHeightStyle extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ ShowNavigationSettingsTooltipUseCaseImpl RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineHeightStyle(ShowNavigationSettingsTooltipUseCaseImpl showNavigationSettingsTooltipUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = showNavigationSettingsTooltipUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(this);
        int i4 = read + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
