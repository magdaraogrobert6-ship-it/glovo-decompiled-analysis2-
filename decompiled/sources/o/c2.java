package o;

import com.roadrunner.login.presentation.router.RemoteConfigStartupTask;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ RemoteConfigStartupTask RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(RemoteConfigStartupTask remoteConfigStartupTask, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = remoteConfigStartupTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInit = this.RemoteActionCompatParcelizer.init(this);
        int i4 = write + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInit;
    }
}
