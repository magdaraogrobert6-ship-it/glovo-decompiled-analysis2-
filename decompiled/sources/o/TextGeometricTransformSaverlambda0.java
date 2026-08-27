package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl;
import com.roadrunner.delivery.accept.acceptbutton.presentation.DeliveryAcceptButtonUiModelImpl$startCountdown$1$1$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
public final class TextGeometricTransformSaverlambda0 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ DeliveryAcceptButtonUiModelImpl read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ TextGeometricTransformSaverlambda0(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, int i) {
        this.serializer = i;
        this.read = deliveryAcceptButtonUiModelImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl = this.read;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i4 != 0) {
            LocaleSaverlambda1 localeSaverlambda1 = (LocaleSaverlambda1) obj;
            MutableStateFlow mutableStateFlow = deliveryAcceptButtonUiModelImpl.RemoteActionCompatParcelizer;
            FontWeightSaverlambda0 fontWeightSaverlambda0 = (FontWeightSaverlambda0) mutableStateFlow.read();
            if (fontWeightSaverlambda0 instanceof FontSynthesisSaverlambda1) {
                float f = localeSaverlambda1.RemoteActionCompatParcelizer;
                long j = localeSaverlambda1.write;
                int i5 = 0;
                mutableStateFlow.IconCompatParcelizer(FontSynthesisSaverlambda1.IconCompatParcelizer((FontSynthesisSaverlambda1) fontWeightSaverlambda0, false, new HyphensSaverlambda1(f, j), 31));
                if (j == 0) {
                    BuildersKt.RemoteActionCompatParcelizer(deliveryAcceptButtonUiModelImpl.RatingCompat, null, null, new DeliveryAcceptButtonUiModelImpl$startCountdown$1$1$1(deliveryAcceptButtonUiModelImpl, shortNewsContentCardView2, i5), 3);
                }
            }
            return createfromparcel;
        }
        getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
        if (!(!(getoptimizationlevel instanceof onViewAdded))) {
            int i6 = write + 5;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            deliveryAcceptButtonUiModelImpl.RemoteActionCompatParcelizer();
        } else if (getoptimizationlevel instanceof getSceneString) {
            int i8 = IconCompatParcelizer + 53;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            deliveryAcceptButtonUiModelImpl.IconCompatParcelizer();
            MutableStateFlow mutableStateFlow2 = deliveryAcceptButtonUiModelImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read;
            if (!(!((Boolean) mutableStateFlow2.read()).booleanValue())) {
                mutableStateFlow2.IconCompatParcelizer(Boolean.FALSE);
            }
        } else if (getoptimizationlevel instanceof getMaxWidth) {
            deliveryAcceptButtonUiModelImpl.IconCompatParcelizer();
            MutableStateFlow mutableStateFlow3 = deliveryAcceptButtonUiModelImpl.read;
            setTransactionSuccessful settransactionsuccessful = deliveryAcceptButtonUiModelImpl.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            mutableStateFlow3.IconCompatParcelizer(new LineHeightStyleTrimSaverlambda1(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_error), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.state_api_error_dialog_message), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_retry), deliveryAcceptButtonUiModelImpl.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg));
            int i10 = write + 117;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            createfromparcel = null;
        }
        int i12 = write + 11;
        IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return createfromparcel;
    }
}
