package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Sizes$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toUpperCaselambda0;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toUpperCasedefault {
    public static final ReleasesResponse$Sizes$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Sizes$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 117;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            toUpperCaselambda0 touppercaselambda0 = toUpperCaselambda0.read;
            int i4 = RemoteActionCompatParcelizer + 37;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return touppercaselambda0;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final long criticalRawBytes;
    public final long rawBytes;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Sizes$Companion] */
    static {
        int i = read + 121;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    public /* synthetic */ toUpperCasedefault(long j, long j2, int i) {
        if (3 == (i & 3)) {
            this.rawBytes = j;
            this.criticalRawBytes = j2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, toUpperCaselambda0.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Long.hashCode(this.rawBytes);
            iHashCode = Long.hashCode(this.criticalRawBytes);
            i = iHashCode2 / 120;
        } else {
            int iHashCode3 = Long.hashCode(this.rawBytes);
            iHashCode = Long.hashCode(this.criticalRawBytes);
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = write + 99;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = c8$$ExternalSyntheticOutline0.m(this.criticalRawBytes, ")", c8$$ExternalSyntheticOutline0.m(this.rawBytes, "Sizes(rawBytes=", ", criticalRawBytes="));
        int i4 = serializer + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 39;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toUpperCasedefault)) {
            return false;
        }
        toUpperCasedefault touppercasedefault = (toUpperCasedefault) obj;
        if (this.rawBytes != touppercasedefault.rawBytes) {
            return false;
        }
        if (this.criticalRawBytes == touppercasedefault.criticalRawBytes) {
            return true;
        }
        int i4 = i2 + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
