package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.AuthResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.cutText;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class copyTextdefault {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final AuthResponse$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.AuthResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 53;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            cutText cuttext = cutText.write;
            int i4 = read + 43;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return cuttext;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String accessToken;
    public final Long cityId;
    public final String cityName;
    public final String contractType;
    public final List countries;
    public final String deviceToken;
    public final String email;
    public final long expiresIn;
    public final List idVerificationLocations;
    public final boolean isApplicationPending;
    public final Boolean isNewPasswordRequired;
    public final Boolean isRiderOnboardingEligible;
    public final String name;
    public final String refreshToken;
    public final String role;
    public final List roles;
    public final String userId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.AuthResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(3)), null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(4)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(5)), null};
        int i = IconCompatParcelizer + 19;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ copyTextdefault(int i, String str, String str2, String str3, long j, Long l, List list, String str4, String str5, boolean z, Boolean bool, String str6, String str7, String str8, String str9, List list2, List list3, Boolean bool2) {
        Object obj = null;
        if (271 != (i & 271)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 271, cutText.write.getDescriptor());
            throw null;
        }
        this.accessToken = str;
        this.deviceToken = str2;
        this.refreshToken = str3;
        this.expiresIn = j;
        if ((i & 16) == 0) {
            this.cityId = null;
        } else {
            this.cityId = l;
        }
        if ((i & 32) == 0) {
            this.idVerificationLocations = null;
        } else {
            this.idVerificationLocations = list;
        }
        if ((i & 64) == 0) {
            this.contractType = null;
        } else {
            this.contractType = str4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i2 = RemoteActionCompatParcelizer + 19;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.cityName = null;
                int i3 = 4 / 0;
            } else {
                this.cityName = null;
            }
        } else {
            this.cityName = str5;
        }
        this.isApplicationPending = z;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.isNewPasswordRequired = Boolean.FALSE;
        } else {
            this.isNewPasswordRequired = bool;
            int i4 = serializer + 73;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.userId = null;
        } else {
            this.userId = str6;
            int i7 = serializer + 21;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        }
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            this.email = null;
        } else {
            this.email = str7;
        }
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
            this.name = null;
        } else {
            this.name = str8;
        }
        if ((i & 8192) == 0) {
            this.role = null;
        } else {
            this.role = str9;
        }
        if ((i & androidx.compose.ui.graphics.Fields.Clip) == 0) {
            this.roles = null;
        } else {
            this.roles = list2;
        }
        if ((32768 & i) == 0) {
            int i9 = serializer;
            int i10 = i9 + 27;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            this.countries = null;
            int i12 = i9 + 43;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            this.countries = list3;
        }
        int i14 = 2 % 2;
        if ((i & 65536) != 0) {
            this.isRiderOnboardingEligible = bool2;
            return;
        }
        int i15 = serializer + 37;
        RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            this.isRiderOnboardingEligible = null;
        } else {
            this.isRiderOnboardingEligible = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AuthResponse(accessToken=", this.accessToken, ", deviceToken=", this.deviceToken, ", refreshToken=");
        sbM.append(this.refreshToken);
        sbM.append(", expiresIn=");
        sbM.append(this.expiresIn);
        sbM.append(", cityId=");
        sbM.append(this.cityId);
        sbM.append(", idVerificationLocations=");
        sbM.append(this.idVerificationLocations);
        c8$$ExternalSyntheticOutline0.m(sbM, ", contractType=", this.contractType, ", cityName=", this.cityName);
        sbM.append(", isApplicationPending=");
        sbM.append(this.isApplicationPending);
        sbM.append(", isNewPasswordRequired=");
        sbM.append(this.isNewPasswordRequired);
        c8$$ExternalSyntheticOutline0.m(sbM, ", userId=", this.userId, ", email=", this.email);
        c8$$ExternalSyntheticOutline0.m(sbM, ", name=", this.name, ", role=", this.role);
        sbM.append(", roles=");
        sbM.append(this.roles);
        sbM.append(", countries=");
        sbM.append(this.countries);
        sbM.append(", isRiderOnboardingEligible=");
        sbM.append(this.isRiderOnboardingEligible);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public copyTextdefault(String str, String str2, String str3, long j, Long l, List list, String str4, String str5, boolean z, Boolean bool, String str6, String str7, String str8, String str9, List list2, List list3, Boolean bool2) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.accessToken = str;
        this.deviceToken = str2;
        this.refreshToken = str3;
        this.expiresIn = j;
        this.cityId = l;
        this.idVerificationLocations = list;
        this.contractType = str4;
        this.cityName = str5;
        this.isApplicationPending = z;
        this.isNewPasswordRequired = bool;
        this.userId = str6;
        this.email = str7;
        this.name = str8;
        this.role = str9;
        this.roles = list2;
        this.countries = list3;
        this.isRiderOnboardingEligible = bool2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        int i2 = serializer + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.deviceToken), 31, this.refreshToken), 31, this.expiresIn);
        Long l = this.cityId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        List list = this.idVerificationLocations;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        String str = this.contractType;
        if (str == null) {
            int i4 = serializer + 3;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.cityName;
        if (str2 == null) {
            int i6 = serializer + 89;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((((((iM + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode2) * 31, 31, this.isApplicationPending);
        Boolean bool = this.isNewPasswordRequired;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        String str3 = this.userId;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.email;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.name;
        if (str5 == null) {
            int i8 = RemoteActionCompatParcelizer + 67;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.role;
        if (str6 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str6.hashCode();
            int i10 = serializer + 105;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        List list2 = this.roles;
        int iHashCode11 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.countries;
        if (list3 == null) {
            int i12 = RemoteActionCompatParcelizer + 17;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode5 = i12 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode5 = list3.hashCode();
        }
        Boolean bool2 = this.isRiderOnboardingEligible;
        int iHashCode12 = ((((((((((((((iM2 + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode11) * 31) + iHashCode5) * 31) + (bool2 == null ? 0 : bool2.hashCode());
        int i13 = serializer + 5;
        RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            int i14 = 61 / 0;
        }
        return iHashCode12;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 87;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof copyTextdefault)) {
            return false;
        }
        copyTextdefault copytextdefault = (copyTextdefault) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, copytextdefault.accessToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object obj2 = null;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, copytextdefault.deviceToken}, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 107;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, copytextdefault.refreshToken}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 1;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (this.expiresIn != copytextdefault.expiresIn) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityId, copytextdefault.cityId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.idVerificationLocations, copytextdefault.idVerificationLocations}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contractType, copytextdefault.contractType}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 5;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityName, copytextdefault.cityName}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 121;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.isApplicationPending != copytextdefault.isApplicationPending) {
            int i8 = serializer + 99;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isNewPasswordRequired, copytextdefault.isNewPasswordRequired}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, copytextdefault.userId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, copytextdefault.email}, getCieXyz.write())).booleanValue()) {
            int i10 = serializer + 47;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 28 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, copytextdefault.name}, getCieXyz.write())).booleanValue()) {
            int i12 = RemoteActionCompatParcelizer + 19;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.role, copytextdefault.role}, getCieXyz.write())).booleanValue()) {
            int i14 = serializer + 27;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roles, copytextdefault.roles}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, copytextdefault.countries}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isRiderOnboardingEligible, copytextdefault.isRiderOnboardingEligible}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i16 = serializer + 73;
        RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i17 = i16 % 2;
        return false;
    }
}
