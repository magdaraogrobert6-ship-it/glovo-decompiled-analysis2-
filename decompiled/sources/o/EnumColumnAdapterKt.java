package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class EnumColumnAdapterKt extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumColumnAdapterKt(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.read.emit(null, this);
        int i4 = serializer + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return objEmit;
    }
}
