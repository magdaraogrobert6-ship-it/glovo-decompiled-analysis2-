package o;

import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SqlDriver extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ RouterLogger serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SqlDriver(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objExecute = this.serializer.execute(null, this);
        int i4 = write + 21;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objExecute;
        }
        throw null;
    }
}
