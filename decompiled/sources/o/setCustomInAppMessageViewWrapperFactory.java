package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import kotlinx.datetime.DateTimeUnit$TimeBased$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setModalizedImageRadiusDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = setModalizedImageRadiusDp.class)
public final class setCustomInAppMessageViewWrapperFactory extends setCustomHtmlInAppMessageActionListener {
    public static final DateTimeUnit$TimeBased$Companion Companion = new Object() { // from class: kotlinx.datetime.DateTimeUnit$TimeBased$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return setModalizedImageRadiusDp.RemoteActionCompatParcelizer;
        }
    };
    public final long nanoseconds;
    public final String unitName;
    public final long unitScale;

    public final int hashCode() {
        long j = this.nanoseconds;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setCustomInAppMessageViewWrapperFactory) {
            return this.nanoseconds == ((setCustomInAppMessageViewWrapperFactory) obj).nanoseconds;
        }
        return false;
    }

    public final setCustomInAppMessageViewWrapperFactory read(int i) {
        return new setCustomInAppMessageViewWrapperFactory(Math.multiplyExact(this.nanoseconds, i));
    }

    public final String toString() {
        String str = this.unitName;
        str.getClass();
        long j = this.unitScale;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }

    public setCustomInAppMessageViewWrapperFactory(long j) {
        this.nanoseconds = j;
        if (j <= 0) {
            DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m(j, "Unit duration must be positive, but was ", " ns."));
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.unitName = "HOUR";
            this.unitScale = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.unitName = "MINUTE";
            this.unitScale = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.unitName = "SECOND";
            this.unitScale = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.unitName = "MILLISECOND";
            this.unitScale = j / 1000000;
        } else if (j % 1000 == 0) {
            this.unitName = "MICROSECOND";
            this.unitScale = j / 1000;
        } else {
            this.unitName = "NANOSECOND";
            this.unitScale = j;
        }
    }
}
