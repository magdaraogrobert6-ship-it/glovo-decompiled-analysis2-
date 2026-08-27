package o;

import com.roadrunner.delivery.pickupdropoff.confirmbutton.domain.ConfirmButtonV1MapperImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class findCompatibleComposeMethod extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ ConfirmButtonV1MapperImpl RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public findCompatibleComposeMethod(ConfirmButtonV1MapperImpl confirmButtonV1MapperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = confirmButtonV1MapperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.invoke(null, this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.invoke(null, this);
        throw null;
    }
}
