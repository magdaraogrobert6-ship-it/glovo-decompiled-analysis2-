package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.SuspendedStateAction$Companion;
import kotlinx.serialization.Serializable;
import o.computeCrcOfCentralDir;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MultiDexExtractorExtractedDex {
    public static final SuspendedStateAction$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.SuspendedStateAction$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 33;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                computeCrcOfCentralDir computecrcofcentraldir = computeCrcOfCentralDir.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            computeCrcOfCentralDir computecrcofcentraldir2 = computeCrcOfCentralDir.write;
            int i3 = serializer + 65;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return computecrcofcentraldir2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String text;
    public final String type;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.SuspendedStateAction$Companion] */
    static {
        int i = write + 49;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ MultiDexExtractorExtractedDex(int i, String str, String str2, String str3) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.type = str;
            this.text = str2;
            if ((i & 4) == 0) {
                this.url = null;
                int i2 = RemoteActionCompatParcelizer + 37;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.url = str3;
            int i3 = RemoteActionCompatParcelizer + 23;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, computeCrcOfCentralDir.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SuspendedStateAction(type=", this.type, ", text=", this.text, ", url="), this.url, ")");
        int i4 = RemoteActionCompatParcelizer + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[PHI: r1 r3
  0x0039: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r3v7 java.lang.String) = (r3v1 java.lang.String), (r3v10 java.lang.String) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.type.hashCode() % 102, 118, this.text);
            str = this.url;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.text);
            str = this.url;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        int i3 = iM + iHashCode;
        int i4 = RemoteActionCompatParcelizer + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiDexExtractorExtractedDex)) {
            int i5 = i2 + 1;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        MultiDexExtractorExtractedDex multiDexExtractorExtractedDex = (MultiDexExtractorExtractedDex) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, multiDexExtractorExtractedDex.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, multiDexExtractorExtractedDex.text}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 27;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, multiDexExtractorExtractedDex.url}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = serializer + 111;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}
