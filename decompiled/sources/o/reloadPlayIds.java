package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class reloadPlayIds extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reloadPlayIds(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
