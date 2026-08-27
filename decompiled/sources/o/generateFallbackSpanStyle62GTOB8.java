package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class generateFallbackSpanStyle62GTOB8 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public generateFallbackSpanStyle62GTOB8(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.read.emit((Object) null, this);
        int i4 = write + 55;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return objEmit;
    }
}
