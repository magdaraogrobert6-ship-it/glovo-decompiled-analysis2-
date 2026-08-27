package o;

import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeeplinkReferrer extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDeeplinkReferrer(GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.write.emit(null, this);
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.write.emit(null, this);
        int i3 = read + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objEmit;
        }
        throw null;
    }
}
