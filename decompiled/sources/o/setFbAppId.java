package o;

import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setFbAppId extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SentianceGuard read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFbAppId(SentianceGuard sentianceGuard, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sentianceGuard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objCheckAndCreateSentianceUser = this.read.checkAndCreateSentianceUser(this);
        int i4 = IconCompatParcelizer + 37;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objCheckAndCreateSentianceUser;
        }
        throw null;
    }
}
