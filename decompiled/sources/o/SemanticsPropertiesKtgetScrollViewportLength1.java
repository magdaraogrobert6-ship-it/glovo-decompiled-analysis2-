package o;

import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesKtgetScrollViewportLength1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ H$b IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsPropertiesKtgetScrollViewportLength1(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = h$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.IconCompatParcelizer.invoke(null, this);
        int i4 = write + 33;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
