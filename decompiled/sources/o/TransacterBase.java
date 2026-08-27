package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.login.data.forgotpassword.entity.GenerateMagicLinkRequest$Companion;
import kotlinx.serialization.Serializable;
import o.getTransacterruntime;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class TransacterBase {
    public static final GenerateMagicLinkRequest$Companion Companion = new Object() { // from class: com.roadrunner.login.data.forgotpassword.entity.GenerateMagicLinkRequest$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 51;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getTransacterruntime gettransacterruntime = getTransacterruntime.serializer;
            int i4 = read + 5;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return gettransacterruntime;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String countryCode;
    public final String email;
    public final String grantType;
    public final String preferredLanguage;
    public final String screen;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.login.data.forgotpassword.entity.GenerateMagicLinkRequest$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 23;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ TransacterBase(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 == (i & 31)) {
            this.email = str;
            this.grantType = str2;
            this.screen = str3;
            this.countryCode = str4;
            this.preferredLanguage = str5;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, getTransacterruntime.serializer.getDescriptor());
        throw null;
    }

    public TransacterBase(String str, String str2, String str3, String str4, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.email = str;
        this.grantType = str2;
        this.screen = str3;
        this.countryCode = str4;
        this.preferredLanguage = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 109;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("GenerateMagicLinkRequest(email=", this.email, ", grantType=", this.grantType, ", screen=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.screen, ", countryCode=", this.countryCode, ", preferredLanguage=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.preferredLanguage, ")");
        int i4 = serializer + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.preferredLanguage.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.email.hashCode() * 31, 31, this.grantType), 31, this.screen), 31, this.countryCode);
        int i4 = read + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransacterBase)) {
            return false;
        }
        TransacterBase transacterBase = (TransacterBase) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, transacterBase.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.grantType, transacterBase.grantType}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.screen, transacterBase.screen}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, transacterBase.countryCode}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.preferredLanguage, transacterBase.preferredLanguage}, getCieXyz.write())).booleanValue()) {
                    int i2 = read + 63;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = serializer + 39;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = serializer + 11;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        int i7 = serializer + 111;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
