package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$InfoSummary$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderlayoutNode11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "info_summary")
public final class r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE implements accessobtainMeasureSpec {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$InfoSummary$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$InfoSummary$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 95;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                AndroidViewHolderlayoutNode11 androidViewHolderlayoutNode11 = AndroidViewHolderlayoutNode11.RemoteActionCompatParcelizer;
                throw null;
            }
            AndroidViewHolderlayoutNode11 androidViewHolderlayoutNode12 = AndroidViewHolderlayoutNode11.RemoteActionCompatParcelizer;
            int i3 = serializer + 85;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return androidViewHolderlayoutNode12;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String reference;
    public final String shortCode;
    public final String summary;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$InfoSummary$Companion] */
    static {
        int i = read + 53;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    public /* synthetic */ r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.summary = null;
        } else {
            this.summary = str;
            int i2 = write + 115;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i5 = write + 65;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                this.reference = null;
                throw null;
            }
            this.reference = null;
        } else {
            this.reference = str2;
            int i6 = write + 97;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = 2 % 2;
        if ((i & 4) == 0) {
            this.shortCode = null;
        } else {
            this.shortCode = str3;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("InfoSummary(summary=", this.summary, ", reference=", this.reference, ", shortCode="), this.shortCode, ")");
        }
        int i3 = 81 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("InfoSummary(summary=", this.summary, ", reference=", this.reference, ", shortCode="), this.shortCode, ")");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v11 java.lang.String) = (r1v4 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v6 int) = (r3v0 int), (r3v7 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v7 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = serializer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = this.summary;
            iHashCode = 1;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.summary;
            iHashCode = 0;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.reference;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.shortCode;
        if (str3 == null) {
            int i3 = serializer + 115;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode = str3.hashCode();
        }
        int i5 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i6 = serializer + 89;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 73;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE)) {
            return false;
        }
        r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE r8lambdaonkzdslej3y5sxq3mz_ny0yjnxe = (r8lambdaONKzdSlEJ3y5SXQ3mz_NY0YjNXE) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.summary, r8lambdaonkzdslej3y5sxq3mz_ny0yjnxe.summary}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reference, r8lambdaonkzdslej3y5sxq3mz_ny0yjnxe.reference}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shortCode, r8lambdaonkzdslej3y5sxq3mz_ny0yjnxe.shortCode}, getCieXyz.write())).booleanValue();
        }
        int i7 = serializer;
        int i8 = i7 + 33;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        int i10 = i7 + 69;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
