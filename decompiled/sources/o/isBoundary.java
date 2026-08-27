package o;

import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isBoundary extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isBoundary(WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
            int i3 = 49 / 0;
        } else {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
        }
        int i4 = IconCompatParcelizer + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
