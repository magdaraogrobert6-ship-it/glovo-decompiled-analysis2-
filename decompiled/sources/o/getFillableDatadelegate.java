package o;

import com.roadrunner.auth.domain.GetUserAuthenticationStateUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getFillableDatadelegate extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetUserAuthenticationStateUseCaseImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFillableDatadelegate(GetUserAuthenticationStateUseCaseImpl getUserAuthenticationStateUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getUserAuthenticationStateUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i4 = read + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
