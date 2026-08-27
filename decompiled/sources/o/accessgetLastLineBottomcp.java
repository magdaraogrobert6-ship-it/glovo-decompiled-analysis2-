package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetLastLineBottomcp extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetLastLineBottomcp(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.serializer.emit(null, this);
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 85 / 0;
        return this.serializer.emit(null, this);
    }
}
