package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItem$Companion;
import kotlinx.serialization.Serializable;
import o.PreferencesProtoPreferenceMap;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getNumber {
    public static final BusinessMetricItem$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItem$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return PreferencesProtoPreferenceMap.serializer;
            }
            PreferencesProtoPreferenceMap preferencesProtoPreferenceMap = PreferencesProtoPreferenceMap.serializer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final shouldMigrate detail;
    public final String name;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricItem$Companion] */
    static {
        int i = serializer + 49;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getNumber(int i, String str, shouldMigrate shouldmigrate) {
        if (3 == (i & 3)) {
            this.name = str;
            this.detail = shouldmigrate;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PreferencesProtoPreferenceMap.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Integer.hashCode(this.detail.type) * (this.name.hashCode() / 96);
        }
        return Integer.hashCode(this.detail.type) + (this.name.hashCode() * 31);
    }

    public getNumber(shouldMigrate shouldmigrate) {
        this.name = "help_center_client_error";
        this.detail = shouldmigrate;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BusinessMetricItem(name=" + this.name + ", detail=" + this.detail + ")";
        int i2 = read + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 29;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getNumber)) {
            return false;
        }
        getNumber getnumber = (getNumber) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, getnumber.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.detail, getnumber.detail}, getCieXyz.write())).booleanValue()) {
            int i3 = read + 45;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i4 = read + 69;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 73;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
