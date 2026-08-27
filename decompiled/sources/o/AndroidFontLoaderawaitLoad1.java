package o;

import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidFontLoaderawaitLoad1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1.AnonymousClass2 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoaderawaitLoad1(ChatDeliveryRepositoryImpl$observeDeliveryStateV3$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return this.serializer.emit(null, this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 62 / 0;
        return this.serializer.emit(null, this);
    }
}
