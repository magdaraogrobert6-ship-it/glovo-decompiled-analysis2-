package o;

import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class logEcommerceEventlambda0 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public handleInternalBannerRefreshlambda1 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ OneClickStartWorkingViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logEcommerceEventlambda0(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = oneClickStartWorkingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 1;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$startWorkingWithLocation = OneClickStartWorkingViewModel.access$startWorkingWithLocation(this.write, null, null, this);
        int i4 = MediaMetadataCompat + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$startWorkingWithLocation;
        }
        throw null;
    }
}
