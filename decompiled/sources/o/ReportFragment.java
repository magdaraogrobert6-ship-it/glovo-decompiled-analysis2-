package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.LastStopDisclaimerData$Companion;
import kotlinx.serialization.Serializable;
import o.registerIn;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ReportFragment {
    public static final LastStopDisclaimerData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.LastStopDisclaimerData$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            registerIn registerin = registerIn.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 57;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return registerin;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String description;
    public final String style;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.LastStopDisclaimerData$Companion] */
    static {
        int i = serializer + 7;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ReportFragment(int i, String str, String str2, String str3) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.title = null;
            int i2 = IconCompatParcelizer + 9;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            int i4 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                this.description = null;
                obj.hashCode();
                throw null;
            }
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            int i5 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.style = null;
            return;
        }
        this.style = str3;
        int i7 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("LastStopDisclaimerData(title=", this.title, ", description=", this.description, ", style="), this.style, ")");
        int i4 = RemoteActionCompatParcelizer + 89;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.description;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.style;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i4 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReportFragment)) {
            return false;
        }
        ReportFragment reportFragment = (ReportFragment) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, reportFragment.title}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, reportFragment.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, reportFragment.style}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = RemoteActionCompatParcelizer;
        int i7 = i6 + 45;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 75;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
