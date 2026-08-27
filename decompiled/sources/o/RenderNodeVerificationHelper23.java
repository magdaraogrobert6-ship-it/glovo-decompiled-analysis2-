package o;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderNodeVerificationHelper23 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final RenderNodeVerificationHelper23 IconCompatParcelizer;
    public static final RenderNodeVerificationHelper23 MediaBrowserCompatMediaItem;
    public static final RenderNodeVerificationHelper23 MediaDescriptionCompat;
    public static final RenderNodeVerificationHelper23 MediaMetadataCompat;
    public static final RenderNodeVerificationHelper23 MediaSessionCompatQueueItem;
    public static final RenderNodeVerificationHelper23 MediaSessionCompatResultReceiverWrapper;
    public static final RenderNodeVerificationHelper23 RatingCompat;
    public static final RenderNodeVerificationHelper23 RemoteActionCompatParcelizer;
    public static final RenderNodeVerificationHelper23 read;
    public static final RenderNodeVerificationHelper23 serializer;
    public static final RenderNodeVerificationHelper23 write;
    public final /* synthetic */ int PlaybackStateCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RenderNodeVerificationHelper23(int i, int i2) {
        super(i);
        this.PlaybackStateCompat = i2;
    }

    static {
        int i = 0;
        RemoteActionCompatParcelizer = new RenderNodeVerificationHelper23(i, 1);
        write = new RenderNodeVerificationHelper23(i, 2);
        IconCompatParcelizer = new RenderNodeVerificationHelper23(i, i);
        serializer = new RenderNodeVerificationHelper23(i, 3);
        MediaDescriptionCompat = new RenderNodeVerificationHelper23(i, 4);
        MediaBrowserCompatMediaItem = new RenderNodeVerificationHelper23(i, 5);
        MediaSessionCompatQueueItem = new RenderNodeVerificationHelper23(i, 6);
        RatingCompat = new RenderNodeVerificationHelper23(i, 7);
        MediaMetadataCompat = new RenderNodeVerificationHelper23(i, 8);
        MediaSessionCompatResultReceiverWrapper = new RenderNodeVerificationHelper23(i, 9);
        read = new RenderNodeVerificationHelper23(i, 10);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.PlaybackStateCompat) {
            case 0:
                return new EnumSerializer("com.deliveryhero.contract.model.PhoneCallType.None", com.deliveryhero.contract.model.PhoneCallType.None.INSTANCE, new Annotation[0]);
            case 1:
                return new DefaultInAppMessageHtmlFullViewFactory("com.deliveryhero.contract.model.PhoneCallType", displayInAppMessagelambda1.serializer(com.deliveryhero.contract.model.PhoneCallType.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(com.deliveryhero.contract.model.PhoneCallType.Masked.class), displayInAppMessagelambda1.serializer(com.deliveryhero.contract.model.PhoneCallType.None.class), displayInAppMessagelambda1.serializer(com.deliveryhero.contract.model.PhoneCallType.Normal.class)}, new setGraphicModalMaxWidthDp[]{new EnumSerializer("com.deliveryhero.contract.model.PhoneCallType.Masked", com.deliveryhero.contract.model.PhoneCallType.Masked.INSTANCE, new Annotation[0]), new EnumSerializer("com.deliveryhero.contract.model.PhoneCallType.None", com.deliveryhero.contract.model.PhoneCallType.None.INSTANCE, new Annotation[0]), new EnumSerializer("com.deliveryhero.contract.model.PhoneCallType.Normal", com.deliveryhero.contract.model.PhoneCallType.Normal.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 2:
                return new EnumSerializer("com.deliveryhero.contract.model.PhoneCallType.Masked", com.deliveryhero.contract.model.PhoneCallType.Masked.INSTANCE, new Annotation[0]);
            case 3:
                return new EnumSerializer("com.deliveryhero.contract.model.PhoneCallType.Normal", com.deliveryhero.contract.model.PhoneCallType.Normal.INSTANCE, new Annotation[0]);
            case 4:
                return new DefaultInAppMessageHtmlFullViewFactory("com.deliveryhero.contract.model.Translations", displayInAppMessagelambda1.serializer(getAmbientShadowColor.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(RenderNodeVerificationHelper24.class), displayInAppMessagelambda1.serializer(RenderNodeVerificationHelper28.class)}, new setGraphicModalMaxWidthDp[]{new EnumSerializer("com.deliveryhero.contract.model.Translations.DISABLED", RenderNodeVerificationHelper24.INSTANCE, new Annotation[0]), destroyDisplayListData.RemoteActionCompatParcelizer}, new Annotation[0]);
            case 5:
                return new EnumSerializer("com.deliveryhero.contract.model.Translations.DISABLED", RenderNodeVerificationHelper24.INSTANCE, new Annotation[0]);
            case 6:
                return new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.CreateWebView", lockCanvasFallback.INSTANCE, new Annotation[0]);
            case 7:
                return new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.FullPreload", ViewLayer.INSTANCE, new Annotation[0]);
            case 8:
                return new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.None", lockCanvas.INSTANCE, new Annotation[0]);
            case 9:
                return new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.PrefetchNativeApis", SurfaceVerificationHelper.INSTANCE, new Annotation[0]);
            default:
                return new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.PreloadWarmupAssetsFromUrl", isLockHardwareCanvasAvailable.INSTANCE, new Annotation[0]);
        }
    }
}
