package o;

import bo.app.d$$ExternalSyntheticOutline0;
import kotlinx.datetime.DateTimeUnit$MonthBased$Companion;
import kotlinx.serialization.Serializable;
import o.getModalizedImageRadiusDpannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = getModalizedImageRadiusDpannotations.class)
public final class setCustomInAppMessageViewFactory extends setCustomInAppMessageManagerListener {
    public static final DateTimeUnit$MonthBased$Companion Companion = new Object() { // from class: kotlinx.datetime.DateTimeUnit$MonthBased$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return getModalizedImageRadiusDpannotations.IconCompatParcelizer;
        }
    };
    public final int months;

    public final int hashCode() {
        return this.months ^ androidx.compose.ui.graphics.Fields.RenderEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setCustomInAppMessageViewFactory) {
            return this.months == ((setCustomInAppMessageViewFactory) obj).months;
        }
        return false;
    }

    public setCustomInAppMessageViewFactory(int i) {
        this.months = i;
        if (i > 0) {
            return;
        }
        DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Unit duration must be positive, but was ", " months."));
        throw null;
    }

    public final String toString() {
        int i = this.months;
        if (i % 1200 == 0) {
            return setCustomHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(i / 1200, "CENTURY");
        }
        if (i % 12 == 0) {
            return setCustomHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(i / 12, "YEAR");
        }
        return i % 3 == 0 ? setCustomHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(i / 3, "QUARTER") : setCustomHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(i, "MONTH");
    }
}
