package o;

import com.roadrunner.user.properties.domain.ClearUserPropertiesUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToChangeUserEventslambda0 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ ClearUserPropertiesUseCaseImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public subscribeToChangeUserEventslambda0(ClearUserPropertiesUseCaseImpl clearUserPropertiesUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = clearUserPropertiesUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.IconCompatParcelizer.invoke(this);
        int i4 = read + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
