package o;

import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setLogger extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setLogger(GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i4 = write + 1;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
