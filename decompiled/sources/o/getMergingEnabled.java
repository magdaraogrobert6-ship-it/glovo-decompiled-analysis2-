package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.appmigration.model.PopupAnalytics$Companion;
import kotlinx.serialization.Serializable;
import o.getBoundsInParentui;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMergingEnabled {
    public static final PopupAnalytics$Companion Companion = new Object() { // from class: com.roadrunner.appmigration.model.PopupAnalytics$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 79;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getBoundsInParentui getboundsinparentui = getBoundsInParentui.read;
            int i4 = write + 123;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return getboundsinparentui;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final int daysUntilMigration;
    public final String templateVariant;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.appmigration.model.PopupAnalytics$Companion] */
    static {
        int i = write + 59;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getMergingEnabled(int i, int i2, String str) {
        if (1 == (i & 1)) {
            this.daysUntilMigration = i2;
            if ((i & 2) == 0) {
                this.templateVariant = null;
                int i3 = RemoteActionCompatParcelizer + 61;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            }
            this.templateVariant = str;
            int i5 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getBoundsInParentui.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Integer.hashCode(this.daysUntilMigration);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Integer.hashCode(this.daysUntilMigration);
        String str = this.templateVariant;
        if (str == null) {
            int i4 = IconCompatParcelizer + 71;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i6 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 47;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof getMergingEnabled) {
            getMergingEnabled getmergingenabled = (getMergingEnabled) obj;
            if (this.daysUntilMigration == getmergingenabled.daysUntilMigration) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.templateVariant, getmergingenabled.templateVariant}, getCieXyz.write())).booleanValue();
            }
            int i4 = i2 + 93;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i4 % 2 != 0);
        }
        int i5 = i2 + 31;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 35;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 67 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PopupAnalytics(daysUntilMigration=" + this.daysUntilMigration + ", templateVariant=" + this.templateVariant + ")";
        int i2 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
