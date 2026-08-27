package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Companion;
import kotlinx.serialization.Serializable;
import o.getWEAR_OS_SQUAREannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getWEAR_OS_SMALL_ROUNDannotations implements backgroundColor {
    public static final OverlayItems$Instruction$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 41;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getWEAR_OS_SQUAREannotations.read;
            }
            getWEAR_OS_SQUAREannotations getwear_os_squareannotations = getWEAR_OS_SQUAREannotations.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final C0183locale config;
    public final int icon;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Companion] */
    static {
        int i = read + 5;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getWEAR_OS_SMALL_ROUNDannotations(int i, int i2, String str, C0183locale c0183locale) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.icon = i2;
            this.text = str;
            if ((i & 4) == 0) {
                this.config = null;
                int i3 = serializer + 7;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.config = c0183locale;
            int i4 = serializer + 73;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getWEAR_OS_SQUAREannotations.read.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r1 r2
  0x0041: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r2v6 o.locale) = (r2v2 o.locale), (r2v8 o.locale) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0034, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        C0183locale c0183locale;
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.icon) - 74, 19, this.text);
            c0183locale = this.config;
            if (c0183locale == null) {
                int i3 = serializer + 117;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = c0183locale.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.icon) * 31, 31, this.text);
            c0183locale = this.config;
            if (c0183locale == null) {
                int i5 = serializer + 117;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = c0183locale.hashCode();
            }
        }
        return iM + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Instruction(icon=", this.icon, ", text=", this.text, ", config=");
            sbM.append(this.config);
            sbM.append(")");
            return sbM.toString();
        }
        StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m("Instruction(icon=", this.icon, ", text=", this.text, ", config=");
        sbM2.append(this.config);
        sbM2.append(")");
        sbM2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getWEAR_OS_SMALL_ROUNDannotations(int i, String str, C0183locale c0183locale) {
        str.getClass();
        this.icon = i;
        this.text = str;
        this.config = c0183locale;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = serializer + 7;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof getWEAR_OS_SMALL_ROUNDannotations) {
            getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations = (getWEAR_OS_SMALL_ROUNDannotations) obj;
            if (this.icon != getwear_os_small_roundannotations.icon) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, getwear_os_small_roundannotations.text}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.config, getwear_os_small_roundannotations.config}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i3 = write;
        int i4 = i3 + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i3 + 29;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
