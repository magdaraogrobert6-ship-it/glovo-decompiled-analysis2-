package o;

import com.huawei.location.Vw$Vw;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputServiceAndroidonEditCommand1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ Vw$Vw write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroidonEditCommand1(Vw$Vw vw$Vw, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = vw$Vw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.invoke(this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.write.invoke(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
