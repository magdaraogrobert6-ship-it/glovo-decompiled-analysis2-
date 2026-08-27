package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.RiderStatisticsItem$Companion;
import com.roadrunner.home.nest.api.data.TierType;
import com.roadrunner.home.nest.api.data.Type;
import kotlinx.serialization.Serializable;
import o.closeQuietly;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MultiDexV14JBMR2ElementConstructor {
    public static final RiderStatisticsItem$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.RiderStatisticsItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 35;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return closeQuietly.RemoteActionCompatParcelizer;
            }
            closeQuietly closequietly = closeQuietly.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String deeplink;
    public final String label;
    public final TierType tierType;
    public final Type type;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.RiderStatisticsItem$Companion] */
    static {
        int i = write + 11;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ MultiDexV14JBMR2ElementConstructor(int i, String str, String str2, String str3, Type type, TierType tierType) {
        int i2;
        if (3 != (i & 3)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, closeQuietly.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.label = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.deeplink = null;
            i2 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            this.deeplink = str3;
            i2 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        if ((i & 8) == 0) {
            int i5 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.type = Type.UNKNOWN;
        } else {
            this.type = type;
        }
        int i7 = 2 % 2;
        if ((i & 16) == 0) {
            this.tierType = TierType.UNKNOWN;
        } else {
            this.tierType = tierType;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[PHI: r1 r3
  0x0037: PHI (r1v15 int) = (r1v7 int), (r1v19 int) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v7 java.lang.String) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v8 int) = (r1v7 int), (r1v19 int) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.label.hashCode() / 8, 3, this.value);
            str = this.deeplink;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.value);
            str = this.deeplink;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        int iHashCode2 = this.tierType.hashCode() + ((this.type.hashCode() + ((iM + iHashCode) * 31)) * 31);
        int i3 = IconCompatParcelizer + 39;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RiderStatisticsItem(label=", this.label, ", value=", this.value, ", deeplink=");
        sbM.append(this.deeplink);
        sbM.append(", type=");
        sbM.append(this.type);
        sbM.append(", tierType=");
        sbM.append(this.tierType);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof MultiDexV14JBMR2ElementConstructor) {
                MultiDexV14JBMR2ElementConstructor multiDexV14JBMR2ElementConstructor = (MultiDexV14JBMR2ElementConstructor) obj;
                Object[] objArr = {this.label, multiDexV14JBMR2ElementConstructor.label};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.value, multiDexV14JBMR2ElementConstructor.value};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr3 = {this.deeplink, multiDexV14JBMR2ElementConstructor.deeplink};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.type != multiDexV14JBMR2ElementConstructor.type) {
                    int i2 = RemoteActionCompatParcelizer + 37;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (this.tierType != multiDexV14JBMR2ElementConstructor.tierType) {
                    return false;
                }
                int i4 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
