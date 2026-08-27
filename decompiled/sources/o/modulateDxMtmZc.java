package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class modulateDxMtmZc extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public modulateDxMtmZc(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = read + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
