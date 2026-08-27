package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i4 = serializer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objEmit;
        }
        throw null;
    }
}
