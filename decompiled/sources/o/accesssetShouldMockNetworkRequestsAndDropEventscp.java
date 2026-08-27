package o;

import com.roadrunner.home.stickyfooter.HomeStickyFooterUiModelImpl$1$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetShouldMockNetworkRequestsAndDropEventscp extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public FlowCollector RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final /* synthetic */ HomeStickyFooterUiModelImpl$1$1$1$1$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesssetShouldMockNetworkRequestsAndDropEventscp(HomeStickyFooterUiModelImpl$1$1$1$1$1 homeStickyFooterUiModelImpl$1$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = homeStickyFooterUiModelImpl$1$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 43;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objEmit = this.write.emit(null, this);
        int i4 = MediaSessionCompatQueueItem + 101;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
