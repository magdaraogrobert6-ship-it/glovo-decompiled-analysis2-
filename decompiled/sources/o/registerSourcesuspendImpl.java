package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class registerSourcesuspendImpl extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerSourcesuspendImpl(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objEmit = this.IconCompatParcelizer.emit(null, this);
        int i4 = RemoteActionCompatParcelizer + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
