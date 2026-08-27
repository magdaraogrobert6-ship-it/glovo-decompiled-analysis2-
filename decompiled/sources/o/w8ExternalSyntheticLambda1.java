package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.StartNowResponse$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.w8;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w8ExternalSyntheticLambda1 {
    public static final StartNowResponse$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.StartNowResponse$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 119;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            w8 w8Var = w8.IconCompatParcelizer;
            int i4 = serializer + 97;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return w8Var;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String description;
    public final String id;
    public final String startTime;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.StartNowResponse$Companion] */
    static {
        int i = write + 69;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ w8ExternalSyntheticLambda1(String str, int i, String str2, String str3, String str4) {
        if (3 == (i & 3)) {
            this.id = str;
            this.type = str2;
            if ((i & 4) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            int i2 = 2 % 2;
            if ((i & 8) == 0) {
                int i3 = RemoteActionCompatParcelizer;
                int i4 = i3 + 95;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                this.startTime = null;
                int i6 = i3 + 75;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.startTime = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, w8.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("StartNowResponse(id=", this.id, ", type=", this.type, ", description="), this.description, ", startTime=", this.startTime, ")");
        int i4 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.type), 31, this.description);
        String str = this.startTime;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = iM + iHashCode;
        int i5 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 27;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        if (!(obj instanceof w8ExternalSyntheticLambda1)) {
            return false;
        }
        w8ExternalSyntheticLambda1 w8externalsyntheticlambda1 = (w8ExternalSyntheticLambda1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, w8externalsyntheticlambda1.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, w8externalsyntheticlambda1.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, w8externalsyntheticlambda1.description}, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 109;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startTime, w8externalsyntheticlambda1.startTime}, getCieXyz.write())).booleanValue()) {
            int i7 = IconCompatParcelizer + 91;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
