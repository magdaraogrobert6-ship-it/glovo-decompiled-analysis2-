package o;

import com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class hasPreinstallBeenRead extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ GetBecomeRiderUriImpl read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hasPreinstallBeenRead(GetBecomeRiderUriImpl getBecomeRiderUriImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = getBecomeRiderUriImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.read.invoke(this);
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 18 / 0;
        return this.read.invoke(this);
    }
}
