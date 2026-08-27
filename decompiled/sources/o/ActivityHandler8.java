package o;

import com.foodora.courier.app.application.TextPrewarmInitializer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler8 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ TextPrewarmInitializer IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHandler8(TextPrewarmInitializer textPrewarmInitializer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = textPrewarmInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.init(this);
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.init(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
