package o;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class boundsInImportantForBoundsAncestor extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ ThumbNode$onAttach$1$1 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boundsInImportantForBoundsAncestor(ThumbNode$onAttach$1$1 thumbNode$onAttach$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = thumbNode$onAttach$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.emit(null, this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
