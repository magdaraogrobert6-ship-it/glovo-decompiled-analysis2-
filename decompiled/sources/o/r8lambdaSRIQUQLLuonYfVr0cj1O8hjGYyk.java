package o;

import com.roadrunner.home.nest.data.NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaSRIQUQLLuonYfVr0cj1O8hjGYyk(NestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2 nestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = nestComponentRepositoryImpl$getb5cc6E$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.write.emit(null, this);
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        this.write.emit(null, this);
        throw null;
    }
}
