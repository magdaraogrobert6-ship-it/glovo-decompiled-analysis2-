package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.SuspendedStateData$Companion;
import kotlinx.serialization.Serializable;
import o.NavigatorExternalSyntheticLambda1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ZipUtil {
    public static final SuspendedStateData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.SuspendedStateData$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 43;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return NavigatorExternalSyntheticLambda1.serializer;
            }
            int i3 = 36 / 0;
            return NavigatorExternalSyntheticLambda1.serializer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final MultiDexExtractorExtractedDex action;
    public final String description;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.SuspendedStateData$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 41;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
    }

    public /* synthetic */ ZipUtil(int i, String str, String str2, MultiDexExtractorExtractedDex multiDexExtractorExtractedDex) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.title = str;
            this.description = str2;
            if ((i & 4) == 0) {
                this.action = null;
                int i2 = read + 29;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.action = multiDexExtractorExtractedDex;
            int i3 = read + 49;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, NavigatorExternalSyntheticLambda1.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 15;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        MultiDexExtractorExtractedDex multiDexExtractorExtractedDex = this.action;
        if (multiDexExtractorExtractedDex == null) {
            int i5 = read + 71;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 2 % 4;
            }
            i = 0;
        } else {
            int iHashCode = multiDexExtractorExtractedDex.hashCode();
            int i7 = IconCompatParcelizer + 65;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SuspendedStateData(title=", this.title, ", description=", this.description, ", action=");
        sbM.append(this.action);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 101;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZipUtil)) {
            return false;
        }
        ZipUtil zipUtil = (ZipUtil) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, zipUtil.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, zipUtil.description}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, zipUtil.action}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = read;
            int i5 = i4 + 101;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 83;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = read + 29;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 != 0;
    }
}
