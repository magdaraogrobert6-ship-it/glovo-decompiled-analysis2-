package o;

import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getOffsetY extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ AutoAcceptRequestStateRepositoryImpl RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOffsetY(AutoAcceptRequestStateRepositoryImpl autoAcceptRequestStateRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = autoAcceptRequestStateRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.getIsRequestRunning(this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object isRequestRunning = this.RemoteActionCompatParcelizer.getIsRequestRunning(this);
        int i3 = serializer + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return isRequestRunning;
    }
}
