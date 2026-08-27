package o;

import com.sentiance.core.model.thrift.k$c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getEnvironment extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ k$c IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEnvironment(k$c k_c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = k_c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.getGreetingState(this);
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object greetingState = this.IconCompatParcelizer.getGreetingState(this);
        int i3 = write + 97;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return greetingState;
    }
}
