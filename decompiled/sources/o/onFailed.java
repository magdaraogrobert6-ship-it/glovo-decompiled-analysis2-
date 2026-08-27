package o;

import com.roadrunner.delivery.ontheway.navigation.domain.GetNavigationButtonAction;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onFailed extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetNavigationButtonAction RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onFailed(GetNavigationButtonAction getNavigationButtonAction, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getNavigationButtonAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.getExternalNavigationAction(null, this);
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 75 / 0;
        return this.RemoteActionCompatParcelizer.getExternalNavigationAction(null, this);
    }
}
