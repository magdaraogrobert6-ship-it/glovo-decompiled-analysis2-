package o;

import com.roadrunner.auth.domain.logout.ClearServicesUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class hideFromAccessibility extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ClearServicesUseCase serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hideFromAccessibility(ClearServicesUseCase clearServicesUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = clearServicesUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return ClearServicesUseCase.access$deleteToken(this.serializer, this);
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        ClearServicesUseCase.access$deleteToken(this.serializer, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
