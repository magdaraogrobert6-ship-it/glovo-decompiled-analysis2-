package o;

import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class copyhu1Yfo extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyhu1Yfo(WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 40 / 0;
        return this.IconCompatParcelizer.emit(null, this);
    }
}
