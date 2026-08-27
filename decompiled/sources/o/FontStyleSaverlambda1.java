package o;

import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FontStyleSaverlambda1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontStyleSaverlambda1(WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.read.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.read.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
