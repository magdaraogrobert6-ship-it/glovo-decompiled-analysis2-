package o;

import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class finishedTrackingActivity extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Gen2FunWithFlagsConfigRepository IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public finishedTrackingActivity(Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = gen2FunWithFlagsConfigRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objEagerEvaluateAll = this.IconCompatParcelizer.eagerEvaluateAll(this);
        int i4 = RemoteActionCompatParcelizer + 77;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEagerEvaluateAll;
        }
        throw null;
    }
}
