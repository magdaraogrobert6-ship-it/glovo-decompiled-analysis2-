package o;

import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onRequestFocusInDescendants extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ N$b RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onRequestFocusInDescendants(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            return N$b.access$baseParamMap(this.RemoteActionCompatParcelizer, this);
        }
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        N$b.access$baseParamMap(this.RemoteActionCompatParcelizer, this);
        throw null;
    }
}
