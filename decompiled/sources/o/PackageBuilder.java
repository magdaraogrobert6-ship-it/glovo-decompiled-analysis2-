package o;

import io.grpc.CallOptions$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageBuilder extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ CallOptions$Builder read;
    public getInstallReferrer write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageBuilder(CallOptions$Builder callOptions$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = callOptions$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.read.saveStatus(null, this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objSaveStatus = this.read.saveStatus(null, this);
        int i3 = RatingCompat + 3;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objSaveStatus;
    }
}
