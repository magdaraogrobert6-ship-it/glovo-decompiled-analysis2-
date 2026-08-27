package o;

import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyListeners extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ RouterLogger write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public notifyListeners(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objLogNoMobileServices = this.write.logNoMobileServices(this);
        int i4 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return objLogNoMobileServices;
    }
}
