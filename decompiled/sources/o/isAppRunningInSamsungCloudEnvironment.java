package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isAppRunningInSamsungCloudEnvironment extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isAppRunningInSamsungCloudEnvironment(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.write.emit((Object) null, this);
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.write.emit((Object) null, this);
        int i3 = read + 15;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
