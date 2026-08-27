package o;

import androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getLastCustomNonConfigurationInstance implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getLastCustomNonConfigurationInstance(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.serializer = 2;
        this.read = z;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public /* synthetic */ getLastCustomNonConfigurationInstance(Object obj, boolean z, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = z;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            addOnPictureInPictureModeChangedListener addonpictureinpicturemodechangedlistener = (addOnPictureInPictureModeChangedListener) obj2;
            addonpictureinpicturemodechangedlistener.RemoteActionCompatParcelizer(z);
            return new PredictiveBackHandlerKt$PredictiveBackHandler$lambda$3$0$$inlined$onStopOrDispose$1((getStrokeWidth) obj, addonpictureinpicturemodechangedlistener, 0);
        }
        if (i4 == 1) {
            getWindowOffsetnOccac getwindowoffsetnoccac = (getWindowOffsetnOccac) obj;
            getwindowoffsetnoccac.getClass();
            ((LegacyCustomerChatCommunicatorImpl) obj2).serializer(getwindowoffsetnoccac, z);
            return createfromparcel;
        }
        if (i4 != 2) {
            PreviewContainer previewContainer = (PreviewContainer) obj;
            return PreviewContainer.RemoteActionCompatParcelizer(previewContainer, z, PreviewParameter.IconCompatParcelizer(previewContainer.qrScanScreen, accessgetCountjd.IconCompatParcelizer(previewContainer.qrScanScreen.fallbackScreen, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2)), 111);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
        androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope = (androidx.compose.ui.graphics.GraphicsLayerScope) obj;
        graphicsLayerScope.getClass();
        if (z) {
            int i5 = write + 111;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            fFloatValue = ((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).floatValue();
        } else {
            int i7 = IconCompatParcelizer + 7;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 5 % 5;
            }
            fFloatValue = 0.0f;
        }
        graphicsLayerScope.setTranslationY(fFloatValue);
        return createfromparcel;
    }
}
