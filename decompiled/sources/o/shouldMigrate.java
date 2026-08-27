package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItemDetail$Companion;
import kotlinx.serialization.Serializable;
import o.SharedPreferencesMigration3;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class shouldMigrate {
    public static final BusinessMetricItemDetail$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItemDetail$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 91;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                SharedPreferencesMigration3 sharedPreferencesMigration3 = SharedPreferencesMigration3.RemoteActionCompatParcelizer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SharedPreferencesMigration3 sharedPreferencesMigration4 = SharedPreferencesMigration3.RemoteActionCompatParcelizer;
            int i3 = write + 101;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
            return sharedPreferencesMigration4;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final int type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItemDetail$Companion] */
    static {
        int i = IconCompatParcelizer + 21;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ shouldMigrate(int i, int i2) {
        if (1 == (i & 1)) {
            this.type = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, SharedPreferencesMigration3.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Integer.hashCode(this.type);
        }
        Integer.hashCode(this.type);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(this.type, "BusinessMetricItemDetail(type=", ")");
        int i4 = write + 83;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 75;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shouldMigrate)) {
            return false;
        }
        if (this.type == ((shouldMigrate) obj).type) {
            return true;
        }
        int i4 = i2 + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public shouldMigrate(int i) {
        this.type = i;
    }
}
