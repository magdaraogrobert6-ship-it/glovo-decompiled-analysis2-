package o;

import bo.app.d$$ExternalSyntheticOutline0;
import kotlinx.datetime.DateTimeUnit$DayBased$Companion;
import kotlinx.serialization.Serializable;
import o.getGraphicModalMaxWidthDp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = getGraphicModalMaxWidthDp.class)
public final class setCustomInAppMessageAnimationFactory extends setCustomInAppMessageManagerListener {
    public static final DateTimeUnit$DayBased$Companion Companion = new Object() { // from class: kotlinx.datetime.DateTimeUnit$DayBased$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return getGraphicModalMaxWidthDp.serializer;
        }
    };
    public final int days;

    public final int hashCode() {
        return this.days ^ 65536;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setCustomInAppMessageAnimationFactory) {
            return this.days == ((setCustomInAppMessageAnimationFactory) obj).days;
        }
        return false;
    }

    public setCustomInAppMessageAnimationFactory(int i) {
        this.days = i;
        if (i > 0) {
            return;
        }
        DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Unit duration must be positive, but was ", " days."));
        throw null;
    }

    public final String toString() {
        int i = this.days;
        return i % 7 == 0 ? setCustomHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(i / 7, "WEEK") : setCustomHtmlInAppMessageActionListener.RemoteActionCompatParcelizer(i, "DAY");
    }
}
