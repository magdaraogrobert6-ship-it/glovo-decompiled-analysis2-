package o;

import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getActivityState extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Gen2FunWithFlagsConfigRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getActivityState(Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = gen2FunWithFlagsConfigRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$syncAndPersist = Gen2FunWithFlagsConfigRepository.access$syncAndPersist(this.serializer, this);
        int i4 = write + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return objAccess$syncAndPersist;
    }
}
