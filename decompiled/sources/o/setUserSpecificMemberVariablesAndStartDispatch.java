package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class setUserSpecificMemberVariablesAndStartDispatch extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public FlowCollector read;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUserSpecificMemberVariablesAndStartDispatch(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.serializer.emit(null, this);
            int i3 = 94 / 0;
        } else {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.serializer.emit(null, this);
        }
        int i4 = MediaBrowserCompatMediaItem + 27;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
