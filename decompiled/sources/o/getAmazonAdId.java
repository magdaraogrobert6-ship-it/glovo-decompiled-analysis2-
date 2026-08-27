package o;

import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAmazonAdId extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ N$b write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAmazonAdId(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.invoke(null, this);
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.write.invoke(null, this);
        throw null;
    }
}
