package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.RiderProfileMetaData$Companion;
import kotlinx.serialization.Serializable;
import o.isVMMultidexCapable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MultiDexV14 {
    public static final RiderProfileMetaData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.RiderProfileMetaData$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 125;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                isVMMultidexCapable isvmmultidexcapable = isVMMultidexCapable.IconCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            isVMMultidexCapable isvmmultidexcapable2 = isVMMultidexCapable.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 103;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return isvmmultidexcapable2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String imageUrl;
    public final String joinedOn;
    public final String name;
    public final String status;
    public final String style;
    public final String subtitleTemplate;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.RiderProfileMetaData$Companion] */
    static {
        int i = read + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ MultiDexV14(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 == (i & 63)) {
            this.name = str;
            this.imageUrl = str2;
            this.status = str3;
            this.subtitleTemplate = str4;
            this.joinedOn = str5;
            this.style = str6;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, isVMMultidexCapable.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RiderProfileMetaData(name=", this.name, ", imageUrl=", this.imageUrl, ", status=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.status, ", subtitleTemplate=", this.subtitleTemplate, ", joinedOn=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.joinedOn, ", style=", this.style, ")");
        int i4 = IconCompatParcelizer + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.imageUrl), 31, this.status), 31, this.subtitleTemplate), 31, this.joinedOn);
        int i4 = write + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 61;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        Object obj2 = null;
        if (!(obj instanceof MultiDexV14)) {
            int i7 = i3 + 33;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            int i9 = i3 + 67;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        MultiDexV14 multiDexV14 = (MultiDexV14) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, multiDexV14.name}, getCieXyz.write())).booleanValue()) {
            int i10 = write + 105;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageUrl, multiDexV14.imageUrl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, multiDexV14.status}, getCieXyz.write())).booleanValue()) {
            int i12 = write + 15;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i12 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitleTemplate, multiDexV14.subtitleTemplate}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.joinedOn, multiDexV14.joinedOn}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, multiDexV14.style}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i13 = write + 47;
        IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
