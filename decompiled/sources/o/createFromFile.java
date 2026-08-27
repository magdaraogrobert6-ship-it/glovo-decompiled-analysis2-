package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.errorhandler.DeliveryErrorHandlerUiModelImpl$1;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class createFromFile implements findNestedRecyclerView {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final MutableStateFlow IconCompatParcelizer;
    public final accessrequireViewFactoryHolder MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final setTransactionSuccessful RatingCompat;
    public final StateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final MutableStateFlow serializer;
    public final DeliveryErrorProviderImpl write;

    @Override // o.findNestedRecyclerView
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i3 + 13;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public createFromFile(getContentViewGroupParentLayout getcontentviewgroupparentlayout, getQueryContext getquerycontext, accessrequireViewFactoryHolder accessrequireviewfactoryholder, DeliveryErrorProviderImpl deliveryErrorProviderImpl, setTransactionSuccessful settransactionsuccessful) {
        getcontentviewgroupparentlayout.getClass();
        this.MediaDescriptionCompat = getquerycontext;
        this.MediaBrowserCompatMediaItem = accessrequireviewfactoryholder;
        this.write = deliveryErrorProviderImpl;
        this.RatingCompat = settransactionsuccessful;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.TRUE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(null);
        this.serializer = mutableStateFlow2;
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new DeliveryErrorHandlerUiModelImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new DeliveryErrorHandlerUiModelImpl$1(this, shortNewsContentCardView, 1), 3);
    }

    public static final void RemoteActionCompatParcelizer(createFromFile createfromfile, obtainAndroidOutline obtainandroidoutline) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = obtainandroidoutline instanceof drawWithChildTracking;
            obj.hashCode();
            throw null;
        }
        if (!(obtainandroidoutline instanceof drawWithChildTracking)) {
            if (!(obtainandroidoutline instanceof resolveOutlinePosition)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            } else {
                resolveOutlinePosition resolveoutlineposition = (resolveOutlinePosition) obtainandroidoutline;
                createfromfile.MediaDescriptionCompat.serializer(new TypefaceHelperMethodsApi28(resolveoutlineposition.title, accessgetEntercp.serializer(resolveoutlineposition)));
                return;
            }
        }
        MutableStateFlow mutableStateFlow = createfromfile.serializer;
        drawWithChildTracking drawwithchildtracking = (drawWithChildTracking) obtainandroidoutline;
        String str = drawwithchildtracking.title;
        String str2 = drawwithchildtracking.description;
        String strIconCompatParcelizer = drawwithchildtracking.action;
        if (strIconCompatParcelizer == null) {
            int i3 = MediaSessionCompatQueueItem + 109;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                createfromfile.RatingCompat.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_ok);
                throw null;
            }
            strIconCompatParcelizer = createfromfile.RatingCompat.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_ok);
        }
        mutableStateFlow.IconCompatParcelizer(new TypefaceCompatApi26(str, str2, strIconCompatParcelizer));
    }
}
