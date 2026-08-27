package o;

import com.roadrunner.rider.safety.permission.domain.ShouldNavigateToRiderSafetyPermissions;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class enable extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ShouldNavigateToRiderSafetyPermissions serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enable(ShouldNavigateToRiderSafetyPermissions shouldNavigateToRiderSafetyPermissions, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = shouldNavigateToRiderSafetyPermissions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.invoke(this);
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i3 = write + 57;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }
}
