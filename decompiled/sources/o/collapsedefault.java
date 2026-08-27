package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.AuthRequest$Companion;
import kotlinx.serialization.Serializable;
import o.collapse;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class collapsedefault {
    public static final AuthRequest$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.AuthRequest$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 23;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            collapse collapseVar = collapse.serializer;
            int i4 = read + 37;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return collapseVar;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String countryCode;
    public final String password;
    public final String sessionToken;
    public final String username;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.AuthRequest$Companion] */
    static {
        int i = IconCompatParcelizer + 101;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ collapsedefault(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.username = str;
            this.password = str2;
            this.countryCode = str3;
            this.sessionToken = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, collapse.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("AuthRequest(username=", this.username, ", password=", this.password, ", countryCode="), this.countryCode, ", sessionToken=", this.sessionToken, ")");
        int i4 = write + 77;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.sessionToken.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.username.hashCode() * 31, 31, this.password), 31, this.countryCode);
        int i4 = read + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return iHashCode;
    }

    public collapsedefault(String str, String str2, String str3, String str4) {
        this.username = str;
        this.password = str2;
        this.countryCode = str3;
        this.sessionToken = str4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 79;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof collapsedefault)) {
            return false;
        }
        collapsedefault collapsedefaultVar = (collapsedefault) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.username, collapsedefaultVar.username}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 113;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.password, collapsedefaultVar.password}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, collapsedefaultVar.countryCode}, getCieXyz.write())).booleanValue()) {
            int i6 = write + 29;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionToken, collapsedefaultVar.sessionToken}, getCieXyz.write())).booleanValue();
    }
}
