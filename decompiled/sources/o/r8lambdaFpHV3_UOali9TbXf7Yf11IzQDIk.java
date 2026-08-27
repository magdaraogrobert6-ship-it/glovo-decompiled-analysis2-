package o;

import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public checkAdjustAdRevenue RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ AutoAcceptNotificationMapperImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaFpHV3_UOali9TbXf7Yf11IzQDIk(AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = autoAcceptNotificationMapperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AutoAcceptNotificationMapperImpl autoAcceptNotificationMapperImpl;
        boolean z;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            autoAcceptNotificationMapperImpl = this.write;
            z = true;
        } else {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            autoAcceptNotificationMapperImpl = this.write;
            z = false;
        }
        return autoAcceptNotificationMapperImpl.invoke(null, null, this, z);
    }
}
