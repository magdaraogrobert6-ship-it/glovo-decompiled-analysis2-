package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.recentdeliveries.data.model.PhoneNumber$Companion;
import kotlinx.serialization.Serializable;
import o.queueGetAttributionWithTimeout;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class processDeeplinkI {
    public static final PhoneNumber$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.PhoneNumber$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 57;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return queueGetAttributionWithTimeout.RemoteActionCompatParcelizer;
            }
            int i3 = 17 / 0;
            return queueGetAttributionWithTimeout.RemoteActionCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String callee;
    public final String calleeName;
    public final String completedAt;
    public final boolean masked;
    public final String number;
    public final String orderCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.PhoneNumber$Companion] */
    static {
        int i = read + 103;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ processDeeplinkI(String str, int i, boolean z, String str2, String str3, String str4, String str5) {
        Object obj = null;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, queueGetAttributionWithTimeout.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.masked = z;
        if ((i & 2) == 0) {
            this.number = null;
        } else {
            this.number = str;
            int i2 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.callee = null;
        } else {
            this.callee = str2;
        }
        if ((i & 8) == 0) {
            int i5 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.calleeName = null;
        } else {
            this.calleeName = str3;
        }
        if ((i & 16) == 0) {
            int i7 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                this.orderCode = null;
                obj.hashCode();
                throw null;
            }
            this.orderCode = null;
        } else {
            this.orderCode = str4;
        }
        if ((i & 32) != 0) {
            this.completedAt = str5;
            return;
        }
        int i8 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            this.completedAt = null;
        } else {
            this.completedAt = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PhoneNumber(masked=");
        sb.append(this.masked);
        sb.append(", number=");
        sb.append(this.number);
        sb.append(", callee=");
        c8$$ExternalSyntheticOutline0.m(sb, this.callee, ", calleeName=", this.calleeName, ", orderCode=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.orderCode, ", completedAt=", this.completedAt, ")");
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.masked);
        String str = this.number;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str2 = this.callee;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.calleeName;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i4 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str4 = this.orderCode;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.completedAt;
        int iHashCode6 = (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
        int i6 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return iHashCode6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof processDeeplinkI)) {
            int i4 = IconCompatParcelizer + 41;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        processDeeplinkI processdeeplinki = (processDeeplinkI) obj;
        if (this.masked != processdeeplinki.masked) {
            int i6 = IconCompatParcelizer + 103;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.number, processdeeplinki.number}, getCieXyz.write())).booleanValue()) {
            int i8 = RemoteActionCompatParcelizer + 111;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callee, processdeeplinki.callee}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calleeName, processdeeplinki.calleeName}, getCieXyz.write())).booleanValue()) {
            int i9 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderCode, processdeeplinki.orderCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.completedAt, processdeeplinki.completedAt}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i10 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
