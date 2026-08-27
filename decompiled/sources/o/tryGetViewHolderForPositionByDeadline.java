package o;

import com.roadrunner.incognia.implementation.IncogniaInitializerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class tryGetViewHolderForPositionByDeadline extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int read;
    public MutexImpl IconCompatParcelizer;
    public final /* synthetic */ IncogniaInitializerImpl RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tryGetViewHolderForPositionByDeadline(IncogniaInitializerImpl incogniaInitializerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = incogniaInitializerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objDisable;
        int i = 2 % 2;
        int i2 = read + 39;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            objDisable = this.RemoteActionCompatParcelizer.disable(this);
            int i3 = 52 / 0;
        } else {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            objDisable = this.RemoteActionCompatParcelizer.disable(this);
        }
        int i4 = RatingCompat + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objDisable;
    }
}
