package o;

import android.annotation.SuppressLint;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.auth.data.TokenData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class SemanticsPropertiesAndroidAccessibilityClassName1 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final TokenData$Companion Companion = new TokenData$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final List countries;
    public final String email;
    public final Long expiry;
    public final Long iat;
    public final String name;
    public final String role;
    public final List roles;
    public final String tokenIssuer;
    public final Long userId;
    public final String userName;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(0)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(1))};
        int i = write + 27;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.countries;
        }
        int i3 = 23 / 0;
        return this.countries;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 87;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 119;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return str;
    }

    public final Long read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Long l = this.userId;
        int i5 = i2 + 19;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return l;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 25;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.roles;
        int i5 = i2 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public /* synthetic */ SemanticsPropertiesAndroidAccessibilityClassName1(int i, String str, Long l, Long l2, String str2, Long l3, String str3, String str4, String str5, List list, List list2) {
        if ((i & 1) == 0) {
            this.tokenIssuer = null;
        } else {
            this.tokenIssuer = str;
        }
        if ((i & 2) == 0) {
            int i2 = serializer + 75;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.expiry = null;
        } else {
            this.expiry = l;
        }
        if ((i & 4) == 0) {
            this.iat = null;
        } else {
            this.iat = l2;
        }
        if ((i & 8) == 0) {
            int i4 = read + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.email = null;
            int i6 = 2 % 2;
        } else {
            this.email = str2;
        }
        if ((i & 16) == 0) {
            int i7 = read + 75;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            this.userId = null;
        } else {
            this.userId = l3;
        }
        if ((i & 32) == 0) {
            this.userName = null;
            int i9 = read + 61;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            this.userName = str3;
        }
        if ((i & 64) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i12 = read + 123;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            this.role = null;
            int i14 = 2 % 2;
        } else {
            this.role = str5;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.roles = null;
            int i15 = read + 81;
            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                int i16 = 2 % 2;
            }
        } else {
            this.roles = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.countries = null;
        } else {
            this.countries = list2;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("TokenData(tokenIssuer=");
        sb.append(this.tokenIssuer);
        sb.append(", expiry=");
        sb.append(this.expiry);
        sb.append(", iat=");
        sb.append(this.iat);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", name=");
        c8$$ExternalSyntheticOutline0.m(sb, this.name, ", role=", this.role, ", roles=");
        sb.append(this.roles);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(")");
        String string = sb.toString();
        int i2 = serializer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof SemanticsPropertiesAndroidAccessibilityClassName1)) {
                return false;
            }
            SemanticsPropertiesAndroidAccessibilityClassName1 semanticsPropertiesAndroidAccessibilityClassName1 = (SemanticsPropertiesAndroidAccessibilityClassName1) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tokenIssuer, semanticsPropertiesAndroidAccessibilityClassName1.tokenIssuer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expiry, semanticsPropertiesAndroidAccessibilityClassName1.expiry}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iat, semanticsPropertiesAndroidAccessibilityClassName1.iat}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, semanticsPropertiesAndroidAccessibilityClassName1.email}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, semanticsPropertiesAndroidAccessibilityClassName1.userId}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userName, semanticsPropertiesAndroidAccessibilityClassName1.userName}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, semanticsPropertiesAndroidAccessibilityClassName1.name}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.role, semanticsPropertiesAndroidAccessibilityClassName1.role}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roles, semanticsPropertiesAndroidAccessibilityClassName1.roles}, getCieXyz.write())).booleanValue()) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, semanticsPropertiesAndroidAccessibilityClassName1.countries}, getCieXyz.write())).booleanValue();
                    }
                    int i2 = serializer + 31;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                } else {
                    int i4 = read + 115;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
            }
            return false;
        }
        int i6 = serializer + 69;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.tokenIssuer;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Long l = this.expiry;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        Long l2 = this.iat;
        int iHashCode7 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.email;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Long l3 = this.userId;
        if (l3 == null) {
            int i2 = serializer + 117;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l3.hashCode();
        }
        String str3 = this.userName;
        if (str3 == null) {
            int i4 = read + 67;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.name;
        if (str4 == null) {
            int i6 = serializer + 27;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.role;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        List list = this.roles;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        List list2 = this.countries;
        if (list2 == null) {
            int i8 = read + 97;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 2 % 4;
            }
        } else {
            iHashCode4 = list2.hashCode();
        }
        return (((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode4;
    }
}
