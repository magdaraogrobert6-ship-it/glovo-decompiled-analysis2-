package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.login.data.forgotpassword.User$Companion;
import kotlinx.serialization.Serializable;
import o.getPostRollbackHooksruntime;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class getPendingTablesruntime {
    public static final User$Companion Companion = new Object() { // from class: com.roadrunner.login.data.forgotpassword.User$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 19;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPostRollbackHooksruntime getpostrollbackhooksruntime = getPostRollbackHooksruntime.write;
            int i4 = write + 105;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getpostrollbackhooksruntime;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String country;
    public final String email;
    public final String phone;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.login.data.forgotpassword.User$Companion] */
    static {
        int i = write + 47;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getPendingTablesruntime(int i, String str, String str2, String str3) {
        if (4 == (i & 4)) {
            if ((i & 1) == 0) {
                this.email = null;
            } else {
                this.email = str;
                int i2 = read + 67;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 2) == 0) {
                this.phone = null;
            } else {
                this.phone = str2;
                int i5 = IconCompatParcelizer + 109;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            this.country = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4, getPostRollbackHooksruntime.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("User(email=", this.email, ", phone=", this.phone, ", country="), this.country, ")");
        int i4 = IconCompatParcelizer + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = 0;
        if (i2 % 2 != 0) {
            str = this.email;
            iHashCode = 1;
            if (str != null) {
                i3 = 1;
                int iHashCode2 = str.hashCode();
                int i4 = IconCompatParcelizer + 119;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode = i3;
                i3 = iHashCode2;
            }
        } else {
            str = this.email;
            if (str == null) {
                iHashCode = 0;
            } else {
                int iHashCode3 = str.hashCode();
                int i6 = IconCompatParcelizer + 119;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode = i3;
                i3 = iHashCode3;
            }
        }
        String str2 = this.phone;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return this.country.hashCode() + (((i3 * 31) + iHashCode) * 31);
    }

    public getPendingTablesruntime(String str, String str2, String str3) {
        str3.getClass();
        this.email = str;
        this.phone = str2;
        this.country = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPendingTablesruntime)) {
            return false;
        }
        getPendingTablesruntime getpendingtablesruntime = (getPendingTablesruntime) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, getpendingtablesruntime.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phone, getpendingtablesruntime.phone}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, getpendingtablesruntime.country}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 97;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
