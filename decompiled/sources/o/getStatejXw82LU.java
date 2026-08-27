package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getStatejXw82LU extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStatejXw82LU(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.IconCompatParcelizer.emit(null, this);
        int i4 = write + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
