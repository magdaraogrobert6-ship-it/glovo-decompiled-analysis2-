package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.api.model.TwoFaVerifyRequest$Companion;
import kotlinx.serialization.Serializable;
import o.getSelected;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class getSelectableGroup {
    public static final TwoFaVerifyRequest$Companion Companion = new Object() { // from class: com.roadrunner.auth.api.model.TwoFaVerifyRequest$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            getSelected getselected;
            int i = 2 % 2;
            int i2 = serializer + 71;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                getselected = getSelected.serializer;
                int i3 = 33 / 0;
            } else {
                getselected = getSelected.serializer;
            }
            int i4 = read + 51;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getselected;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final getTestTag data;
    public final String flowId;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.api.model.TwoFaVerifyRequest$Companion] */
    static {
        int i = serializer + 23;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    public /* synthetic */ getSelectableGroup(int i, getTestTag gettesttag, String str, String str2) {
        if (7 == (i & 7)) {
            this.data = gettesttag;
            this.flowId = str;
            this.type = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getSelected.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode() + af$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.flowId);
        int i4 = IconCompatParcelizer + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public getSelectableGroup(getTestTag gettesttag, String str) {
        str.getClass();
        this.data = gettesttag;
        this.flowId = str;
        this.type = "otp";
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("TwoFaVerifyRequest(data=");
        sb.append(this.data);
        sb.append(", flowId=");
        sb.append(this.flowId);
        sb.append(", type=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.type, ")");
        int i2 = write + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSelectableGroup)) {
            return false;
        }
        getSelectableGroup getselectablegroup = (getSelectableGroup) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, getselectablegroup.data}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.flowId, getselectablegroup.flowId}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 115;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, getselectablegroup.type}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 7;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return !(i4 % 2 != 0);
        }
        int i5 = write + 5;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
