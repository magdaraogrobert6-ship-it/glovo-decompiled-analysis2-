package o;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getDesiredWidthdefault extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ ThumbNode$onAttach$1$1 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDesiredWidthdefault(ThumbNode$onAttach$1$1 thumbNode$onAttach$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = thumbNode$onAttach$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            throw null;
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = RemoteActionCompatParcelizer + 53;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
        return objEmit;
    }
}
