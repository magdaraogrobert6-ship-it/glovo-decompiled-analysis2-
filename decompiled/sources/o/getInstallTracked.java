package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getInstallTracked extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getInstallTracked(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.serializer.emit((Object) null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        this.serializer.emit((Object) null, this);
        throw null;
    }
}
