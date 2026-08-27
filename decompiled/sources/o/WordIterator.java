package o;

import android.app.Application;
import com.roadrunner.delivery.accept.orderitems.presentation.OrderItemsNavigationUiModelImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class WordIterator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final checkOffsetIsValid write;

    public WordIterator(checkOffsetIsValid checkoffsetisvalid) {
        this.write = checkoffsetisvalid;
    }

    public final OrderItemsNavigationUiModelImpl RemoteActionCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, boolean z) {
        int i = 2 % 2;
        getcontentviewgroupparentlayout.getClass();
        checkOffsetIsValid checkoffsetisvalid = this.write;
        Object objWrite = checkoffsetisvalid.serializer.write();
        objWrite.getClass();
        isHiraganaKatakanaBoundary ishiraganakatakanaboundary = (isHiraganaKatakanaBoundary) objWrite;
        Object objWrite2 = checkoffsetisvalid.write.write();
        objWrite2.getClass();
        Application application = (Application) objWrite2;
        Object objWrite3 = checkoffsetisvalid.IconCompatParcelizer.write();
        objWrite3.getClass();
        Object objWrite4 = checkoffsetisvalid.RemoteActionCompatParcelizer.write();
        objWrite4.getClass();
        OrderItemsNavigationUiModelImpl orderItemsNavigationUiModelImpl = new OrderItemsNavigationUiModelImpl(ishiraganakatakanaboundary, application, (q4ExternalSyntheticLambda9) objWrite3, (createGraphemeClusterSegmentFinder) objWrite4, getcontentviewgroupparentlayout, z);
        int i2 = RemoteActionCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return orderItemsNavigationUiModelImpl;
    }
}
