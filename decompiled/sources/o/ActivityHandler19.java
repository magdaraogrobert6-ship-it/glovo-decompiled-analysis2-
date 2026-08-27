package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationRequest$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandler18;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandler19 {
    public static final AccountCreationRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationRequest$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 83;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                ActivityHandler18 activityHandler18 = ActivityHandler18.read;
                throw null;
            }
            ActivityHandler18 activityHandler19 = ActivityHandler18.read;
            int i3 = serializer + 5;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return activityHandler19;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String cf;
    public final String confirmPassword;
    public final String email;
    public final String password;
    public final String phone;
    public final String woowaMessageId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationRequest$Companion] */
    static {
        int i = serializer + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public /* synthetic */ ActivityHandler19(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (30 != (i & 30)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 30, ActivityHandler18.read.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.email = null;
            int i2 = IconCompatParcelizer + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
            this.phone = str2;
            this.password = str3;
            this.confirmPassword = str4;
            this.cf = str5;
            if ((i & 32) == 0) {
                this.woowaMessageId = str6;
                return;
            }
            this.woowaMessageId = null;
            int i4 = IconCompatParcelizer + 59;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        this.email = str;
        int i6 = 2 % 2;
        this.phone = str2;
        this.password = str3;
        this.confirmPassword = str4;
        this.cf = str5;
        if ((i & 32) == 0) {
            this.woowaMessageId = str6;
            return;
        }
        this.woowaMessageId = null;
        int i7 = IconCompatParcelizer + 59;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AccountCreationRequest(email=", this.email, ", phone=", this.phone, ", password=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.password, ", confirmPassword=", this.confirmPassword, ", cf=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.cf, ", woowaMessageId=", this.woowaMessageId, ")");
        int i4 = IconCompatParcelizer + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public ActivityHandler19(String str, String str2, String str3, String str4, String str5, String str6) {
        d$$ExternalSyntheticOutline0.m(str2, str3, str4, str5);
        this.email = str;
        this.phone = str2;
        this.password = str3;
        this.confirmPassword = str4;
        this.cf = str5;
        this.woowaMessageId = str6;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 45;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.email;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i2 + 27;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = read + 51;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.phone), 31, this.password), 31, this.confirmPassword), 31, this.cf);
        String str2 = this.woowaMessageId;
        if (str2 == null) {
            int i8 = read + 5;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return iM + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHandler19)) {
            return false;
        }
        ActivityHandler19 activityHandler19 = (ActivityHandler19) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, activityHandler19.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phone, activityHandler19.phone}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.password, activityHandler19.password}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmPassword, activityHandler19.confirmPassword}, getCieXyz.write())).booleanValue()) {
                int i4 = IconCompatParcelizer + 111;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cf, activityHandler19.cf}, getCieXyz.write())).booleanValue())) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.woowaMessageId, activityHandler19.woowaMessageId}, getCieXyz.write())).booleanValue();
            }
            int i5 = read + 117;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i6 = IconCompatParcelizer + 37;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
