package o;

import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidFontLoader_androidKt extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ChatDeliveryRepositoryImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt(ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = chatDeliveryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$getEmail;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$getEmail = ChatDeliveryRepositoryImpl.access$getEmail(this.serializer, this);
            int i3 = 86 / 0;
        } else {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$getEmail = ChatDeliveryRepositoryImpl.access$getEmail(this.serializer, this);
        }
        int i4 = IconCompatParcelizer + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$getEmail;
        }
        throw null;
    }
}
