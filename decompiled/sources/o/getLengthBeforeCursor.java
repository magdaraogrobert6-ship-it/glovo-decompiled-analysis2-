package o;

import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLengthBeforeCursor extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ MidShiftIdVerificationCoordinator RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLengthBeforeCursor(MidShiftIdVerificationCoordinator midShiftIdVerificationCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = midShiftIdVerificationCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$navigateIfSelfieRequired = MidShiftIdVerificationCoordinator.access$navigateIfSelfieRequired(this.RemoteActionCompatParcelizer, this);
        int i4 = IconCompatParcelizer + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return objAccess$navigateIfSelfieRequired;
    }
}
