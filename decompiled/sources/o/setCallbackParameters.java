package o;

import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setCallbackParameters extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ RiderSafetyLifecycleManager RemoteActionCompatParcelizer;
    public getCallbackId read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCallbackParameters(RiderSafetyLifecycleManager riderSafetyLifecycleManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = riderSafetyLifecycleManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objStartTrip = this.RemoteActionCompatParcelizer.startTrip(null, this);
        int i4 = MediaSessionCompatQueueItem + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objStartTrip;
    }
}
