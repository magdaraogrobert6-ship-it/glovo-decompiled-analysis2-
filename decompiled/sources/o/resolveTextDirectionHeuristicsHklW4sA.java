package o;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveTextDirectionHeuristicsHklW4sA extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ ThumbNode$onAttach$1$1 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resolveTextDirectionHeuristicsHklW4sA(ThumbNode$onAttach$1$1 thumbNode$onAttach$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = thumbNode$onAttach$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.emit(null, this);
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i3 = IconCompatParcelizer + 57;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
