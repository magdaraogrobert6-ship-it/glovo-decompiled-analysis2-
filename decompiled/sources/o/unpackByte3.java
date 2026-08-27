package o;

import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class unpackByte3 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ShouldShowTooltip write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unpackByte3(ShouldShowTooltip shouldShowTooltip, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = shouldShowTooltip;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = IconCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return objInvoke;
    }
}
