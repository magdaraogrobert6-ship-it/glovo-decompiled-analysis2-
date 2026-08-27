package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.custom.password.data.model.CustomPasswordRequest$Companion;
import kotlinx.serialization.Serializable;
import o.dispatchCallbacks;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class insertOrUpdateTransformedNode {
    public static final CustomPasswordRequest$Companion Companion = new Object() { // from class: com.roadrunner.custom.password.data.model.CustomPasswordRequest$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 107;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return dispatchCallbacks.serializer;
            }
            dispatchCallbacks dispatchcallbacks = dispatchCallbacks.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final boolean isMagicLink;
    public final String oldPassword;
    public final String password;
    public final String userId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.custom.password.data.model.CustomPasswordRequest$Companion] */
    static {
        int i = write + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ insertOrUpdateTransformedNode(int i, String str, String str2, String str3, boolean z) {
        int i2;
        if (13 == (i & 13)) {
            this.userId = str;
            if ((i & 2) == 0) {
                this.oldPassword = null;
                i2 = IconCompatParcelizer + 113;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                this.oldPassword = str2;
                i2 = RemoteActionCompatParcelizer + 45;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            this.password = str3;
            this.isMagicLink = z;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, dispatchCallbacks.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.userId.hashCode();
        String str = this.oldPassword;
        if (str == null) {
            int i3 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = RemoteActionCompatParcelizer + 15;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return Boolean.hashCode(this.isMagicLink) + af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + i) * 31, 31, this.password);
    }

    public insertOrUpdateTransformedNode(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.userId = str;
        this.oldPassword = str2;
        this.password = str3;
        this.isMagicLink = z;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CustomPasswordRequest(userId=", this.userId, ", oldPassword=", this.oldPassword, ", password=");
        sbM.append(this.password);
        sbM.append(", isMagicLink=");
        sbM.append(this.isMagicLink);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof insertOrUpdateTransformedNode)) {
            return false;
        }
        insertOrUpdateTransformedNode insertorupdatetransformednode = (insertOrUpdateTransformedNode) obj;
        Object[] objArr = {this.userId, insertorupdatetransformednode.userId};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 6 / 0;
            }
            return false;
        }
        Object[] objArr2 = {this.oldPassword, insertorupdatetransformednode.oldPassword};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr3 = {this.password, insertorupdatetransformednode.password};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() || this.isMagicLink != insertorupdatetransformednode.isMagicLink) {
            return false;
        }
        int i8 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 1 / 0;
        }
        return true;
    }
}
