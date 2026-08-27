package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$UiItem$Companion;
import java.lang.annotation.Annotation;
import kotlinx.serialization.Serializable;
import o.AnimatedVisibilityStateCompanion;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.TransitionBasedSearchInfo;
import o.TransitionSearchInfo;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public interface TransitionSearchInfo {
    public static final AcknowledgmentTaskUiItem$UiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$UiItem$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 1;
        private static int write;

        static {
            int i = read + 37;
            write = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem.UiItem", displayInAppMessagelambda1.serializer(TransitionSearchInfo.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(TransitionBasedSearchInfo.class)}, new setGraphicModalMaxWidthDp[]{AnimatedVisibilityStateCompanion.RemoteActionCompatParcelizer}, new Annotation[0]);
            int i2 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return defaultInAppMessageHtmlFullViewFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
}
