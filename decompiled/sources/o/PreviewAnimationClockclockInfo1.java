package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewAnimationClockclockInfo1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClockclockInfo1(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.emit((Object) null, this);
            throw null;
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objEmit = this.IconCompatParcelizer.emit((Object) null, this);
        int i3 = read + 77;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objEmit;
        }
        throw null;
    }
}
