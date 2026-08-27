package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.AuthRequestWith2Fa$Companion;
import com.roadrunner.auth.data.entity.LoginType;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessthrowSemanticsGetNotSupported;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class clearTextSubstitution {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String countryCode;
    public final LoginType loginType;
    public final String password;
    public final String sessionToken;
    public final String username;
    public static final AuthRequestWith2Fa$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.AuthRequestWith2Fa$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessthrowSemanticsGetNotSupported accessthrowsemanticsgetnotsupported = accessthrowSemanticsGetNotSupported.read;
            int i4 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accessthrowsemanticsgetnotsupported;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ActionPropertyKey(2))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.AuthRequestWith2Fa$Companion] */
    static {
        int i = IconCompatParcelizer + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }

    public /* synthetic */ clearTextSubstitution(int i, String str, String str2, String str3, String str4, LoginType loginType) {
        if (31 == (i & 31)) {
            this.username = str;
            this.password = str2;
            this.countryCode = str3;
            this.sessionToken = str4;
            this.loginType = loginType;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, accessthrowSemanticsGetNotSupported.read.getDescriptor());
        throw null;
    }

    public clearTextSubstitution(String str, String str2, String str3, String str4, LoginType loginType) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        loginType.getClass();
        this.username = str;
        this.password = str2;
        this.countryCode = str3;
        this.sessionToken = str4;
        this.loginType = loginType;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.loginType.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.username.hashCode() * 31, 31, this.password), 31, this.countryCode), 31, this.sessionToken);
        int i4 = RemoteActionCompatParcelizer + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AuthRequestWith2Fa(username=", this.username, ", password=", this.password, ", countryCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.countryCode, ", sessionToken=", this.sessionToken, ", loginType=");
        sbM.append(this.loginType);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 89;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearTextSubstitution)) {
            return false;
        }
        clearTextSubstitution cleartextsubstitution = (clearTextSubstitution) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.username, cleartextsubstitution.username}, getCieXyz.write())).booleanValue()) {
            int i3 = read + 65;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.password, cleartextsubstitution.password}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, cleartextsubstitution.countryCode}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 91;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionToken, cleartextsubstitution.sessionToken}, getCieXyz.write())).booleanValue()) {
            int i7 = RemoteActionCompatParcelizer + 83;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        if (this.loginType == cleartextsubstitution.loginType) {
            return true;
        }
        int i8 = RemoteActionCompatParcelizer;
        int i9 = i8 + 45;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = i8 + 73;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
