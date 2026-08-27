package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.auth.domain.entity.AuthEntity$Companion;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class getTraversalIndexdelegate {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final AuthEntity$Companion Companion = new AuthEntity$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String accessToken;
    public final long cityId;
    public final String cityName;
    public final String contractType;
    public final List countries;
    public final String deviceToken;
    public final String email;
    public final long expiresIn;
    public final List idVerificationLocations;
    public final boolean isApplicationPending;
    public final boolean isIdentityVerified;
    public final boolean isNewPasswordRequired;
    public final Boolean isRiderOnboardingEligible;
    public final String name;
    public final String refreshToken;
    public final List roles;
    public final boolean shouldVerifyIdentityPostLogin;
    public final String userId;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(9)), null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(10)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(11)), null};
        int i = RemoteActionCompatParcelizer + 77;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getTraversalIndexdelegate(int i, String str, String str2, String str3, long j, String str4, String str5, long j2, boolean z, boolean z2, boolean z3, boolean z4, List list, String str6, String str7, String str8, List list2, List list3, Boolean bool) {
        Object obj = null;
        if (127 != (i & 127)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, getToggleableStatedelegate.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.accessToken = str;
        this.refreshToken = str2;
        this.deviceToken = str3;
        this.expiresIn = j;
        this.contractType = str4;
        this.cityName = str5;
        this.cityId = j2;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.isIdentityVerified = false;
        } else {
            this.isIdentityVerified = z;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            int i2 = serializer + 15;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            this.shouldVerifyIdentityPostLogin = false;
            int i5 = i3 + 45;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.shouldVerifyIdentityPostLogin = z2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.isApplicationPending = false;
            int i7 = serializer + 81;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            this.isApplicationPending = z3;
        }
        int i9 = 2 % 2;
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.isNewPasswordRequired = false;
        } else {
            this.isNewPasswordRequired = z4;
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            this.idVerificationLocations = instance_delegatelambda0Var;
            int i10 = 2 % 2;
        } else {
            this.idVerificationLocations = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
            this.userId = "";
        } else {
            this.userId = str6;
        }
        if ((i & 8192) == 0) {
            this.email = "";
            int i11 = IconCompatParcelizer + 79;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        } else {
            this.email = str7;
        }
        if ((i & androidx.compose.ui.graphics.Fields.Clip) == 0) {
            int i14 = serializer + 121;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                this.name = "";
                obj.hashCode();
                throw null;
            }
            this.name = "";
        } else {
            this.name = str8;
        }
        if ((32768 & i) == 0) {
            int i15 = IconCompatParcelizer + 77;
            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                this.roles = instance_delegatelambda0Var;
                int i16 = 68 / 0;
            } else {
                this.roles = instance_delegatelambda0Var;
            }
        } else {
            this.roles = list2;
        }
        if ((65536 & i) == 0) {
            this.countries = instance_delegatelambda0Var;
        } else {
            this.countries = list3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RenderEffect) == 0) {
            this.isRiderOnboardingEligible = null;
        } else {
            this.isRiderOnboardingEligible = bool;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int iHashCode = 1;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.countries, c8$$ExternalSyntheticOutline0.m(this.roles, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.idVerificationLocations, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.deviceToken), 31, this.expiresIn), 31, this.contractType), 31, this.cityName), 31, this.cityId), 31, this.isIdentityVerified), 31, this.shouldVerifyIdentityPostLogin), 31, this.isApplicationPending), 31, this.isNewPasswordRequired), 31), 31, this.userId), 31, this.email), 31, this.name), 31), 31);
        Boolean bool = this.isRiderOnboardingEligible;
        if (bool == null) {
            int i4 = IconCompatParcelizer + 35;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                iHashCode = 0;
            }
        } else {
            iHashCode = bool.hashCode();
            int i5 = IconCompatParcelizer + 45;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return iM + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AuthEntity(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", deviceToken=");
        sbM.append(this.deviceToken);
        sbM.append(", expiresIn=");
        sbM.append(this.expiresIn);
        c8$$ExternalSyntheticOutline0.m(sbM, ", contractType=", this.contractType, ", cityName=", this.cityName);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", cityId=", this.cityId, ", isIdentityVerified=");
        af$$ExternalSyntheticOutline0.m(sbM, this.isIdentityVerified, ", shouldVerifyIdentityPostLogin=", this.shouldVerifyIdentityPostLogin, ", isApplicationPending=");
        af$$ExternalSyntheticOutline0.m(sbM, this.isApplicationPending, ", isNewPasswordRequired=", this.isNewPasswordRequired, ", idVerificationLocations=");
        sbM.append(this.idVerificationLocations);
        sbM.append(", userId=");
        sbM.append(this.userId);
        sbM.append(", email=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.email, ", name=", this.name, ", roles=");
        sbM.append(this.roles);
        sbM.append(", countries=");
        sbM.append(this.countries);
        sbM.append(", isRiderOnboardingEligible=");
        String strM = c8$$ExternalSyntheticOutline0.m(sbM, ")", this.isRiderOnboardingEligible);
        int i4 = IconCompatParcelizer + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public getTraversalIndexdelegate(String str, String str2, String str3, long j, String str4, String str5, long j2, boolean z, boolean z2, boolean z3, boolean z4, List list, String str6, String str7, String str8, List list2, List list3, Boolean bool) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.deviceToken = str3;
        this.expiresIn = j;
        this.contractType = str4;
        this.cityName = str5;
        this.cityId = j2;
        this.isIdentityVerified = z;
        this.shouldVerifyIdentityPostLogin = z2;
        this.isApplicationPending = z3;
        this.isNewPasswordRequired = z4;
        this.idVerificationLocations = list;
        this.userId = str6;
        this.email = str7;
        this.name = str8;
        this.roles = list2;
        this.countries = list3;
        this.isRiderOnboardingEligible = bool;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[PHI: r2
  0x0074: PHI (r2v2 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:28:0x0072, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[PHI: r2
  0x007b: PHI (r2v4 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:28:0x0072, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    public static getTraversalIndexdelegate RemoteActionCompatParcelizer(getTraversalIndexdelegate gettraversalindexdelegate, String str, String str2, long j, boolean z, String str3, String str4, String str5, List list, List list2, int i) {
        String str6;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = 2 % 2;
        String str7 = (i & 1) != 0 ? gettraversalindexdelegate.accessToken : str;
        if ((i & 2) != 0) {
            int i3 = IconCompatParcelizer + 97;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            str6 = gettraversalindexdelegate.refreshToken;
        } else {
            str6 = str2;
        }
        String str8 = gettraversalindexdelegate.deviceToken;
        if ((i & 8) != 0) {
            int i5 = IconCompatParcelizer + 53;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                j2 = gettraversalindexdelegate.expiresIn;
            } else {
                long j3 = gettraversalindexdelegate.expiresIn;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            j2 = j;
        }
        String str9 = gettraversalindexdelegate.contractType;
        String str10 = gettraversalindexdelegate.cityName;
        long j4 = gettraversalindexdelegate.cityId;
        boolean z6 = gettraversalindexdelegate.isIdentityVerified;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            int i6 = IconCompatParcelizer + 23;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = gettraversalindexdelegate.shouldVerifyIdentityPostLogin;
        } else {
            z2 = false;
        }
        boolean z7 = z2;
        int i8 = IconCompatParcelizer + 29;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            z3 = gettraversalindexdelegate.isApplicationPending;
            if ((i & 30420) != 0) {
                z4 = z3;
                z5 = gettraversalindexdelegate.isNewPasswordRequired;
            } else {
                z5 = z;
                z4 = z3;
            }
        } else {
            z3 = gettraversalindexdelegate.isApplicationPending;
            if ((i & androidx.compose.ui.graphics.Fields.RotationZ) != 0) {
                z4 = z3;
                z5 = gettraversalindexdelegate.isNewPasswordRequired;
            } else {
                z5 = z;
                z4 = z3;
            }
        }
        List list3 = gettraversalindexdelegate.idVerificationLocations;
        String str11 = (i & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? gettraversalindexdelegate.userId : str3;
        String str12 = (i & 8192) != 0 ? gettraversalindexdelegate.email : str4;
        String str13 = (i & androidx.compose.ui.graphics.Fields.Clip) != 0 ? gettraversalindexdelegate.name : str5;
        List list4 = (32768 & i) != 0 ? gettraversalindexdelegate.roles : list;
        List list5 = (i & 65536) != 0 ? gettraversalindexdelegate.countries : list2;
        Boolean bool = gettraversalindexdelegate.isRiderOnboardingEligible;
        gettraversalindexdelegate.getClass();
        str7.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        list3.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        list4.getClass();
        list5.getClass();
        return new getTraversalIndexdelegate(str7, str6, str8, j2, str9, str10, j4, z6, z7, z4, z5, list3, str11, str12, str13, list4, list5, bool);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getTraversalIndexdelegate) {
            getTraversalIndexdelegate gettraversalindexdelegate = (getTraversalIndexdelegate) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, gettraversalindexdelegate.accessToken}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, gettraversalindexdelegate.refreshToken}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, gettraversalindexdelegate.deviceToken}, getCieXyz.write())).booleanValue() || this.expiresIn != gettraversalindexdelegate.expiresIn) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contractType, gettraversalindexdelegate.contractType}, getCieXyz.write())).booleanValue()) {
                    int i5 = IconCompatParcelizer + 89;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i5 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityName, gettraversalindexdelegate.cityName}, getCieXyz.write())).booleanValue() || this.cityId != gettraversalindexdelegate.cityId || this.isIdentityVerified != gettraversalindexdelegate.isIdentityVerified || this.shouldVerifyIdentityPostLogin != gettraversalindexdelegate.shouldVerifyIdentityPostLogin || this.isApplicationPending != gettraversalindexdelegate.isApplicationPending) {
                    return false;
                }
                if (this.isNewPasswordRequired != gettraversalindexdelegate.isNewPasswordRequired) {
                    int i6 = IconCompatParcelizer + 41;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i6 % 2 != 0;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.idVerificationLocations, gettraversalindexdelegate.idVerificationLocations}, getCieXyz.write())).booleanValue())) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, gettraversalindexdelegate.userId}, getCieXyz.write())).booleanValue()) {
                        int i7 = serializer + 65;
                        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, gettraversalindexdelegate.email}, getCieXyz.write())).booleanValue()) {
                        int i9 = serializer + 117;
                        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, gettraversalindexdelegate.name}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roles, gettraversalindexdelegate.roles}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, gettraversalindexdelegate.countries}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isRiderOnboardingEligible, gettraversalindexdelegate.isRiderOnboardingEligible}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i11 = IconCompatParcelizer + 43;
                        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        return false;
                    }
                    int i13 = serializer + 77;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return false;
                }
                int i15 = serializer + 13;
                IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return false;
            }
            int i17 = serializer + 103;
            IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            return false;
        }
        int i19 = i2 + 107;
        serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i20 = i19 % 2;
        return false;
    }
}
