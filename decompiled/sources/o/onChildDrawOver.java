package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onChildDrawOver extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onChildDrawOver(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.emit((Object) null, this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.emit((Object) null, this);
        throw null;
    }
}
