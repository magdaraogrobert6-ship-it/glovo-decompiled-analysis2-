package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.remote.dto.VariantResponse$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.withStyle;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AnnotationContentHandler {
    public static final VariantResponse$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.VariantResponse$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 105;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            withStyle withstyle = withStyle.read;
            int i4 = read + 125;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return withstyle;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String decisionSource;
    public final String variant;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.VariantResponse$Companion] */
    static {
        int i = serializer + 29;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AnnotationContentHandler(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.variant = str;
            this.decisionSource = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, withStyle.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("VariantResponse(variant=", this.variant, ", decisionSource=", this.decisionSource, ")");
        int i4 = write + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.decisionSource.hashCode() / (this.variant.hashCode() - 122);
        } else {
            iHashCode = this.decisionSource.hashCode() + (this.variant.hashCode() * 31);
        }
        int i3 = write + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 97;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotationContentHandler)) {
            int i4 = i3 + 121;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        AnnotationContentHandler annotationContentHandler = (AnnotationContentHandler) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variant, annotationContentHandler.variant}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.decisionSource, annotationContentHandler.decisionSource}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = read + 55;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
