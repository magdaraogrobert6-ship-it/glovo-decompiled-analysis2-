package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNewListSize extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNewListSize(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.read.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
