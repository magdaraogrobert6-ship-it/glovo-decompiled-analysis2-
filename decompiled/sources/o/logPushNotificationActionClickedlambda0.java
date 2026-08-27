package o;

import io.sentry.JsonObjectSerializer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationActionClickedlambda0 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ JsonObjectSerializer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logPushNotificationActionClickedlambda0(JsonObjectSerializer jsonObjectSerializer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = jsonObjectSerializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = serializer + 49;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
