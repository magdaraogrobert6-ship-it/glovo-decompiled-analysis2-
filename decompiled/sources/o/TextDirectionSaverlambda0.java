package o;

import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class TextDirectionSaverlambda0 implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ DeliveryAcceptButtonUiModelImpl serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ TextDirectionSaverlambda0(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, int i) {
        this.write = i;
        this.serializer = deliveryAcceptButtonUiModelImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            shortNewsContentCardView2.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl = this.serializer;
        if (i3 == 0) {
            FontWeightSaverlambda0 fontWeightSaverlambda0 = (FontWeightSaverlambda0) obj;
            deliveryAcceptButtonUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(fontWeightSaverlambda0);
            deliveryAcceptButtonUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(fontWeightSaverlambda0 instanceof HyphensSaverlambda0));
            deliveryAcceptButtonUiModelImpl.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.write.serializer.set(false);
            return createfromparcel2;
        }
        ParagraphStyleSaverlambda1 paragraphStyleSaverlambda1 = (ParagraphStyleSaverlambda1) obj;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = deliveryAcceptButtonUiModelImpl.MediaMetadataCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        if (paragraphStyleSaverlambda1 != null) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl.RatingCompat;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            deliveryAcceptButtonUiModelImpl.MediaMetadataCompat = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new BridgeManager$trackEvent$2(deliveryAcceptButtonUiModelImpl, paragraphStyleSaverlambda1, shortNewsContentCardView2, 7), 2);
            int i4 = read + 55;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return createfromparcel2;
    }
}
