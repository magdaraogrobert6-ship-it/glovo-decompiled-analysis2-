package o;

import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FontVariationSettings extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontVariationSettings(WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.read.emit(null, this);
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        this.read.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
