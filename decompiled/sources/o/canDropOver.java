package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class canDropOver extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public canDropOver(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.emit((Object) null, this);
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit((Object) null, this);
        int i3 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
