package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$InfoSummary$Companion;
import kotlinx.serialization.Serializable;
import o.FontWeightAdjustmentHelperApi31;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "info_summary")
public final class GenericFontFamily extends getW800 {
    public static final ScrollableComponent$LocationDetail$InfoSummary$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$InfoSummary$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 121;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontWeightAdjustmentHelperApi31 fontWeightAdjustmentHelperApi31 = FontWeightAdjustmentHelperApi31.read;
            int i4 = RemoteActionCompatParcelizer + 61;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontWeightAdjustmentHelperApi31;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String reference;
    public final String shortCode;
    public final String summary;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$InfoSummary$Companion] */
    static {
        int i = read + 5;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ GenericFontFamily(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.summary = null;
            int i2 = IconCompatParcelizer + 109;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.summary = str;
        }
        if ((i & 2) == 0) {
            this.reference = null;
        } else {
            this.reference = str2;
        }
        if ((i & 4) != 0) {
            this.shortCode = str3;
            return;
        }
        this.shortCode = null;
        int i5 = serializer + 93;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("InfoSummary(summary=", this.summary, ", reference=", this.reference, ", shortCode="), this.shortCode, ")");
        int i4 = IconCompatParcelizer + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 99;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.summary;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i2 + 65;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.reference;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.shortCode;
        if (str3 == null) {
            int i6 = serializer + 103;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = str3.hashCode();
            int i8 = serializer + 95;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 19;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof GenericFontFamily) {
            GenericFontFamily genericFontFamily = (GenericFontFamily) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.summary, genericFontFamily.summary}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reference, genericFontFamily.reference}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shortCode, genericFontFamily.shortCode}, getCieXyz.write())).booleanValue();
            }
            int i7 = IconCompatParcelizer + 7;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 84 / 0;
            }
            return false;
        }
        int i9 = IconCompatParcelizer + 63;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
