package o;

import com.roadrunner.delivery.accept.acceptbutton.domain.GetDeliveryAcknowledgments;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SpanStyleSaverlambda1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ GetDeliveryAcknowledgments write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanStyleSaverlambda1(GetDeliveryAcknowledgments getDeliveryAcknowledgments, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = getDeliveryAcknowledgments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.write.invoke(this);
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        int i3 = 70 / 0;
        return this.write.invoke(this);
    }
}
