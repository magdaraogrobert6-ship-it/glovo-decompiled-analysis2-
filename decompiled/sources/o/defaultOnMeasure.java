package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class defaultOnMeasure extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defaultOnMeasure(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
            int i3 = 89 / 0;
        } else {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        }
        int i4 = read + 91;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return objEmit;
    }
}
