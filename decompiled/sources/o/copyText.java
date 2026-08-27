package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.AuthResponseWith2Fa$Companion;
import com.roadrunner.auth.data.entity.AuthStatus;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.cutTextdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class copyText {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final AuthResponseWith2Fa$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.AuthResponseWith2Fa$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 7;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            cutTextdefault cuttextdefault = cutTextdefault.serializer;
            int i4 = write + 51;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return cuttextdefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String accessToken;
    public final Long cityId;
    public final String cityName;
    public final String contractType;
    public final List countries;
    public final String deviceToken;
    public final String email;
    public final Long expiresAt;
    public final Long expiresIn;
    public final String flowId;
    public final List idVerificationLocations;
    public final Boolean isApplicationPending;
    public final Boolean isNewPasswordRequired;
    public final Boolean isRiderOnboardingEligible;
    public final String name;
    public final String refreshToken;
    public final String role;
    public final List roles;
    public final AuthStatus status;
    public final String userId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.AuthResponseWith2Fa$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(6)), null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(7)), null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(8)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(9)), null};
        int i = read + 39;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ copyText(int i, AuthStatus authStatus, String str, Long l, String str2, String str3, String str4, Long l2, Long l3, List list, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, String str9, String str10, List list2, List list3, Boolean bool3) {
        Boolean bool4;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, cutTextdefault.serializer.getDescriptor());
            throw null;
        }
        this.status = authStatus;
        if ((i & 2) == 0) {
            this.flowId = null;
        } else {
            this.flowId = str;
        }
        if ((i & 4) == 0) {
            this.expiresAt = null;
        } else {
            this.expiresAt = l;
        }
        if ((i & 8) == 0) {
            int i2 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.accessToken = null;
        } else {
            this.accessToken = str2;
        }
        if ((i & 16) == 0) {
            int i4 = RemoteActionCompatParcelizer + 47;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.deviceToken = null;
                throw null;
            }
            this.deviceToken = null;
        } else {
            this.deviceToken = str3;
        }
        if ((i & 32) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str4;
        }
        if ((i & 64) == 0) {
            this.expiresIn = null;
        } else {
            this.expiresIn = l2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.cityId = null;
        } else {
            this.cityId = l3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.idVerificationLocations = null;
        } else {
            this.idVerificationLocations = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.contractType = null;
            int i5 = 2 % 2;
        } else {
            this.contractType = str5;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.cityName = null;
        } else {
            this.cityName = str6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            int i6 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                Boolean bool5 = Boolean.FALSE;
                throw null;
            }
            bool4 = Boolean.FALSE;
        } else {
            bool4 = bool;
        }
        this.isApplicationPending = bool4;
        int i7 = 2 % 2;
        this.isNewPasswordRequired = (i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0 ? Boolean.FALSE : bool2;
        if ((i & 8192) == 0) {
            this.userId = null;
        } else {
            this.userId = str7;
            int i8 = RemoteActionCompatParcelizer + 73;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 2 % 3;
            }
        }
        if ((i & androidx.compose.ui.graphics.Fields.Clip) == 0) {
            int i10 = RemoteActionCompatParcelizer + 9;
            int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i11;
            int i12 = i10 % 2;
            this.email = null;
            int i13 = i11 + 25;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            this.email = str8;
        }
        if ((32768 & i) == 0) {
            int i15 = IconCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            this.name = null;
        } else {
            this.name = str9;
        }
        if ((65536 & i) == 0) {
            this.role = null;
        } else {
            this.role = str10;
        }
        if ((131072 & i) == 0) {
            int i17 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            this.roles = null;
        } else {
            this.roles = list2;
        }
        if ((262144 & i) == 0) {
            int i19 = RemoteActionCompatParcelizer + 111;
            IconCompatParcelizer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i20 = i19 % 2;
            this.countries = null;
        } else {
            this.countries = list3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.BlendMode) == 0) {
            this.isRiderOnboardingEligible = null;
        } else {
            this.isRiderOnboardingEligible = bool3;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("AuthResponseWith2Fa(status=");
        sb.append(this.status);
        sb.append(", flowId=");
        sb.append(this.flowId);
        sb.append(", expiresAt=");
        sb.append(this.expiresAt);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", deviceToken=");
        c8$$ExternalSyntheticOutline0.m(sb, this.deviceToken, ", refreshToken=", this.refreshToken, ", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", cityId=");
        sb.append(this.cityId);
        sb.append(", idVerificationLocations=");
        sb.append(this.idVerificationLocations);
        sb.append(", contractType=");
        sb.append(this.contractType);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", isApplicationPending=");
        sb.append(this.isApplicationPending);
        sb.append(", isNewPasswordRequired=");
        sb.append(this.isNewPasswordRequired);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", email=");
        c8$$ExternalSyntheticOutline0.m(sb, this.email, ", name=", this.name, ", role=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.role, ", roles=", this.roles, ", countries=");
        sb.append(this.countries);
        sb.append(", isRiderOnboardingEligible=");
        sb.append(this.isRiderOnboardingEligible);
        sb.append(")");
        String string = sb.toString();
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof copyText) {
            copyText copytext = (copyText) obj;
            if (this.status != copytext.status) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.flowId, copytext.flowId}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expiresAt, copytext.expiresAt}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, copytext.accessToken}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, copytext.deviceToken}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, copytext.refreshToken}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expiresIn, copytext.expiresIn}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityId, copytext.cityId}, getCieXyz.write())).booleanValue()) {
                        int i3 = RemoteActionCompatParcelizer + 111;
                        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.idVerificationLocations, copytext.idVerificationLocations}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.contractType, copytext.contractType}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cityName, copytext.cityName}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isApplicationPending, copytext.isApplicationPending}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isNewPasswordRequired, copytext.isNewPasswordRequired}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, copytext.userId}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, copytext.email}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, copytext.name}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.role, copytext.role}, getCieXyz.write())).booleanValue()) {
                                int i5 = RemoteActionCompatParcelizer + 99;
                                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                return i5 % 2 == 0;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roles, copytext.roles}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, copytext.countries}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isRiderOnboardingEligible, copytext.isRiderOnboardingEligible}, getCieXyz.write())).booleanValue()) {
                                return true;
                            }
                            int i6 = IconCompatParcelizer + 97;
                            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i7 = i6 % 2;
                            return false;
                        }
                        int i8 = RemoteActionCompatParcelizer + 47;
                        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        return i8 % 2 == 0;
                    }
                    int i9 = RemoteActionCompatParcelizer + 103;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return false;
                }
                int i11 = IconCompatParcelizer + 125;
                RemoteActionCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return false;
            }
            int i13 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return false;
        }
        int i15 = RemoteActionCompatParcelizer + 31;
        IconCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i = 2 % 2;
        int iHashCode8 = this.status.hashCode();
        String str = this.flowId;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Long l = this.expiresAt;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        String str2 = this.accessToken;
        if (str2 == null) {
            int i4 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i6 = IconCompatParcelizer + 71;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        String str3 = this.deviceToken;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.refreshToken;
        if (str4 == null) {
            int i8 = IconCompatParcelizer + 15;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        Long l2 = this.expiresIn;
        int iHashCode11 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.cityId;
        int iHashCode12 = l3 == null ? 0 : l3.hashCode();
        List list = this.idVerificationLocations;
        if (list == null) {
            int i10 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        String str5 = this.contractType;
        if (str5 == null) {
            int i12 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        String str6 = this.cityName;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.isApplicationPending;
        int iHashCode14 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isNewPasswordRequired;
        int iHashCode15 = bool2 == null ? 0 : bool2.hashCode();
        String str7 = this.userId;
        int iHashCode16 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.email;
        int iHashCode17 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.name;
        if (str9 == null) {
            int i14 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str9.hashCode();
        }
        String str10 = this.role;
        int iHashCode18 = str10 == null ? 0 : str10.hashCode();
        List list2 = this.roles;
        if (list2 == null) {
            int i16 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = list2.hashCode();
        }
        List list3 = this.countries;
        int iHashCode19 = list3 == null ? 0 : list3.hashCode();
        Boolean bool3 = this.isRiderOnboardingEligible;
        return (((((((((((((((((((((((((((((((((((((iHashCode8 * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode6) * 31) + iHashCode18) * 31) + iHashCode7) * 31) + iHashCode19) * 31) + (bool3 == null ? 0 : bool3.hashCode());
    }
}
