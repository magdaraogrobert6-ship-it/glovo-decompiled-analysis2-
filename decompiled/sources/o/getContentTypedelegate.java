package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.entity.UserDetailsResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getCollectionInfodelegate;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
@SuppressLint
public final class getContentTypedelegate {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final UserDetailsResponse$Companion Companion = new Object() { // from class: com.roadrunner.auth.data.entity.UserDetailsResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 101;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getCollectionInfodelegate getcollectioninfodelegate = getCollectionInfodelegate.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 93;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getcollectioninfodelegate;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final List countries;
    public final String email;
    public final List idVerificationLocations;
    public final Boolean idVerificationRequired;
    public final Boolean isApplicationPending;
    public final Boolean isNewPasswordRequired;
    public final Boolean isRiderOnboardingEligible;
    public final String name;
    public final String role;
    public final List roles;
    public final String userId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.auth.data.entity.UserDetailsResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(10)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(11)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(12)), null};
        int i = read + 69;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getContentTypedelegate(int i, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, List list, List list2, Boolean bool3, List list3, Boolean bool4) {
        if ((i & 1) == 0) {
            bool = Boolean.FALSE;
            int i2 = 2 % 2;
        }
        this.idVerificationRequired = bool;
        if ((i & 2) == 0) {
            this.isNewPasswordRequired = Boolean.FALSE;
        } else {
            this.isNewPasswordRequired = bool2;
        }
        if ((i & 4) == 0) {
            this.userId = null;
        } else {
            this.userId = str;
        }
        if ((i & 8) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i & 16) == 0) {
            this.name = null;
        } else {
            this.name = str3;
            int i3 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.role = null;
        } else {
            this.role = str4;
        }
        if ((i & 64) == 0) {
            this.roles = null;
        } else {
            this.roles = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i4 = IconCompatParcelizer + 77;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i5;
            int i6 = i4 % 2;
            this.countries = null;
            int i7 = i5 + 61;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            this.countries = list2;
        }
        int i9 = 2 % 2;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.isApplicationPending = Boolean.FALSE;
        } else {
            this.isApplicationPending = bool3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            int i10 = IconCompatParcelizer + 103;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                this.idVerificationLocations = null;
                throw null;
            }
            this.idVerificationLocations = null;
        } else {
            this.idVerificationLocations = list3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.isRiderOnboardingEligible = Boolean.FALSE;
        } else {
            this.isRiderOnboardingEligible = bool4;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("UserDetailsResponse(idVerificationRequired=");
        sb.append(this.idVerificationRequired);
        sb.append(", isNewPasswordRequired=");
        sb.append(this.isNewPasswordRequired);
        sb.append(", userId=");
        c8$$ExternalSyntheticOutline0.m(sb, this.userId, ", email=", this.email, ", name=");
        c8$$ExternalSyntheticOutline0.m(sb, this.name, ", role=", this.role, ", roles=");
        sb.append(this.roles);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(", isApplicationPending=");
        sb.append(this.isApplicationPending);
        sb.append(", idVerificationLocations=");
        sb.append(this.idVerificationLocations);
        sb.append(", isRiderOnboardingEligible=");
        String strM = c8$$ExternalSyntheticOutline0.m(sb, ")", this.isRiderOnboardingEligible);
        int i2 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getContentTypedelegate)) {
            return false;
        }
        getContentTypedelegate getcontenttypedelegate = (getContentTypedelegate) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.idVerificationRequired, getcontenttypedelegate.idVerificationRequired}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isNewPasswordRequired, getcontenttypedelegate.isNewPasswordRequired}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, getcontenttypedelegate.userId}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, getcontenttypedelegate.email}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, getcontenttypedelegate.name}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.role, getcontenttypedelegate.role}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roles, getcontenttypedelegate.roles}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, getcontenttypedelegate.countries}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isApplicationPending, getcontenttypedelegate.isApplicationPending}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.idVerificationLocations, getcontenttypedelegate.idVerificationLocations}, getCieXyz.write())).booleanValue()) {
                    int i4 = IconCompatParcelizer + 97;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 == 0;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isRiderOnboardingEligible, getcontenttypedelegate.isRiderOnboardingEligible}, getCieXyz.write())).booleanValue();
            }
            int i5 = RemoteActionCompatParcelizer + 41;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = IconCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        Boolean bool = this.idVerificationRequired;
        if (bool == null) {
            int i5 = i3 + 1;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        Boolean bool2 = this.isNewPasswordRequired;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.userId;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        if (str2 == null) {
            int i7 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.name;
        if (str3 == null) {
            int i8 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.role;
        if (str4 == null) {
            int i10 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        List list = this.roles;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        List list2 = this.countries;
        if (list2 == null) {
            int i12 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = list2.hashCode();
        }
        Boolean bool3 = this.isApplicationPending;
        int iHashCode10 = bool3 == null ? 0 : bool3.hashCode();
        List list3 = this.idVerificationLocations;
        if (list3 == null) {
            int i14 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = list3.hashCode();
        }
        Boolean bool4 = this.isRiderOnboardingEligible;
        return (((((((((((((((((((iHashCode * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode5) * 31) + iHashCode10) * 31) + iHashCode6) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }
}
