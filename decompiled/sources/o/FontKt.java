package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.PickUpDropOffComponent$Companion;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.AsyncTypefaceCacheKey;
import o.DefaultFontFamily;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.DelegatingFontLoaderForBridgeUsage;
import o.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import o.DeviceFontFamilyNameFont;
import o.FileBasedFontFamily;
import o.Font;
import o.FontF3nL8kkdefault;
import o.FontFamilyResolverImpl;
import o.FontKt;
import o.FontResourceLoader;
import o.FontRetOiIg;
import o.FontSynthesisCompanion;
import o.FontYpTlLL0default;
import o.accessgetDropExceptionHandlercp;
import o.accessgetItaliccp;
import o.createFontFamilyResolver;
import o.displayInAppMessagelambda1;
import o.filterByClosestWeightui_textdefault;
import o.firstImmediatelyAvailable;
import o.getAllGVVA2EU;
import o.getDropExceptionHandler;
import o.getFonts;
import o.getLoaderui_text;
import o.getNormal_LCdwAannotations;
import o.getOptionalLocalPKNRLFQ;
import o.getSerif;
import o.getStyleGVVA2EU;
import o.getUnregisteredInAppMessageannotations;
import o.handleException;
import o.isWeightOnimplui_text;
import o.matchFontRetOiIg;
import o.preload;
import o.preloadlambda10;
import o.r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI;
import o.r8lambdaYHXaXOSqDriYitZELtPU6VY2U0;
import o.r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc;
import o.r8lambdawcGwO_lN9j0aDVBccAfzvxeQggA;
import o.resolveDPcqOEQ;
import o.setGraphicModalMaxWidthDp;
import o.toFontFamily;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public interface FontKt {
    public static final PickUpDropOffComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.PickUpDropOffComponent$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        private static int serializer = 0;
        private static int write = 1;

        static {
            int i = IconCompatParcelizer + 65;
            read = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.common.data.model.tasks.PickUpDropOffComponent", displayInAppMessagelambda1.serializer(FontKt.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(DefaultFontFamily.class), displayInAppMessagelambda1.serializer(getLoaderui_text.class), displayInAppMessagelambda1.serializer(DelegatingFontLoaderForBridgeUsage.class), displayInAppMessagelambda1.serializer(DeviceFontFamilyNameFont.class), displayInAppMessagelambda1.serializer(getSerif.class), displayInAppMessagelambda1.serializer(r8lambda9Qm9DZbhOse2Hc4fMyNBL__D5ZI.class), displayInAppMessagelambda1.serializer(preloadlambda10.class), displayInAppMessagelambda1.serializer(FontRetOiIg.class), displayInAppMessagelambda1.serializer(toFontFamily.class), displayInAppMessagelambda1.serializer(r8lambdajVpNp1g4NPXUhV7kC_gm_6H5DIc.class), displayInAppMessagelambda1.serializer(getDropExceptionHandler.class), displayInAppMessagelambda1.serializer(firstImmediatelyAvailable.class), displayInAppMessagelambda1.serializer(matchFontRetOiIg.class), displayInAppMessagelambda1.serializer(accessgetItaliccp.class), displayInAppMessagelambda1.serializer(getStyleGVVA2EU.class), displayInAppMessagelambda1.serializer(isWeightOnimplui_text.class), displayInAppMessagelambda1.serializer(FontResourceLoader.class), displayInAppMessagelambda1.serializer(resolveDPcqOEQ.class), displayInAppMessagelambda1.serializer(FontYpTlLL0default.class)}, new setGraphicModalMaxWidthDp[]{AsyncTypefaceCacheKey.write, createFontFamilyResolver.IconCompatParcelizer, DelegatingFontLoaderForDeprecatedUsage_androidKt.write, FileBasedFontFamily.IconCompatParcelizer, r8lambdaYHXaXOSqDriYitZELtPU6VY2U0.write, FontFamilyResolverImpl.read, r8lambdawcGwO_lN9j0aDVBccAfzvxeQggA.RemoteActionCompatParcelizer, FontF3nL8kkdefault.serializer, getFonts.IconCompatParcelizer, accessgetDropExceptionHandlercp.write, handleException.write, getOptionalLocalPKNRLFQ.serializer, filterByClosestWeightui_textdefault.IconCompatParcelizer, getNormal_LCdwAannotations.IconCompatParcelizer, FontSynthesisCompanion.IconCompatParcelizer, getAllGVVA2EU.serializer, Font.read, preload.IconCompatParcelizer, new EnumSerializer("com.roadrunner.delivery.common.data.model.tasks.PickUpDropOffComponent.UnknownComponent", FontYpTlLL0default.INSTANCE, new Annotation[0])}, new Annotation[0]);
            int i2 = serializer + 17;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return defaultInAppMessageHtmlFullViewFactory;
            }
            throw null;
        }
    };
}
