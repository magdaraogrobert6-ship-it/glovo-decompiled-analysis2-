package o;

import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getCachedDeeplink extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCachedDeeplink(GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = IconCompatParcelizer + 19;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
