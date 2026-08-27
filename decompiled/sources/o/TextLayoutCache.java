package o;

import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextLayoutCache extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ BackToBackOrdersDataRepositoryImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLayoutCache(BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = backToBackOrdersDataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objFetchBackToBackOrders = this.IconCompatParcelizer.fetchBackToBackOrders(false, this);
        int i4 = MediaBrowserCompatMediaItem + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objFetchBackToBackOrders;
    }
}
