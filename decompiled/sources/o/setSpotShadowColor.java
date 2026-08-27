package o;

import com.deliveryhero.contract.model.WebViewPreloadingType$Companion;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.SurfaceVerificationHelper;
import o.ViewLayer;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.isLockHardwareCanvasAvailable;
import o.lockCanvas;
import o.lockCanvasFallback;
import o.setGraphicModalMaxWidthDp;
import o.setSpotShadowColor;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public interface setSpotShadowColor {
    public static final WebViewPreloadingType$Companion Companion = new Object() { // from class: com.deliveryhero.contract.model.WebViewPreloadingType$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return new DefaultInAppMessageHtmlFullViewFactory("com.deliveryhero.contract.model.WebViewPreloadingType", displayInAppMessagelambda1.serializer(setSpotShadowColor.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(lockCanvasFallback.class), displayInAppMessagelambda1.serializer(ViewLayer.class), displayInAppMessagelambda1.serializer(lockCanvas.class), displayInAppMessagelambda1.serializer(SurfaceVerificationHelper.class), displayInAppMessagelambda1.serializer(isLockHardwareCanvasAvailable.class)}, new setGraphicModalMaxWidthDp[]{new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.CreateWebView", lockCanvasFallback.INSTANCE, new Annotation[0]), new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.FullPreload", ViewLayer.INSTANCE, new Annotation[0]), new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.None", lockCanvas.INSTANCE, new Annotation[0]), new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.PrefetchNativeApis", SurfaceVerificationHelper.INSTANCE, new Annotation[0]), new EnumSerializer("com.deliveryhero.contract.model.WebViewPreloadingType.PreloadWarmupAssetsFromUrl", isLockHardwareCanvasAvailable.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    };
}
