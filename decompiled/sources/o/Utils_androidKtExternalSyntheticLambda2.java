package o;

import com.roadrunner.home.CreateHomeScope;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class Utils_androidKtExternalSyntheticLambda2 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ CreateHomeScope write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utils_androidKtExternalSyntheticLambda2(CreateHomeScope createHomeScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = createHomeScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.write.invoke(0L, null, this);
    }
}
