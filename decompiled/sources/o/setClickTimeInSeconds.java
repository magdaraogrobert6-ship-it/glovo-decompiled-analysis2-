package o;

import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setClickTimeInSeconds extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int read;
    public final /* synthetic */ RiderSafetyLifecycleManager IconCompatParcelizer;
    public getCallbackId RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setClickTimeInSeconds(RiderSafetyLifecycleManager riderSafetyLifecycleManager, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = riderSafetyLifecycleManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 97;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$invalidateTripStatus = RiderSafetyLifecycleManager.access$invalidateTripStatus(this.IconCompatParcelizer, null, this);
        int i4 = read + 101;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$invalidateTripStatus;
    }
}
