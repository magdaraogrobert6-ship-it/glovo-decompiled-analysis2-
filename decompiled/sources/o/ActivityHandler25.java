package o;

import android.annotation.SuppressLint;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.TokenData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandler25 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final TokenData$Companion Companion = new TokenData$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final List countries;
    public final String email;
    public final long expiry;
    public final Long iat;
    public final String name;
    public final String role;
    public final List roles;
    public final String tokenIssuer;
    public final long userId;
    public final String userName;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new getSessionParameters(3)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new getSessionParameters(4))};
        int i = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ActivityHandler25(int i, String str, long j, Long l, String str2, long j2, String str3, String str4, String str5, List list, List list2) {
        Object obj = null;
        if (18 != (i & 18)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 18, ActivityHandler251.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.tokenIssuer = null;
        } else {
            this.tokenIssuer = str;
            int i2 = 2 % 2;
        }
        this.expiry = j;
        if ((i & 4) == 0) {
            this.iat = null;
        } else {
            this.iat = l;
        }
        if ((i & 8) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        this.userId = j2;
        if ((i & 32) == 0) {
            int i3 = write + 57;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                this.userName = null;
                obj.hashCode();
                throw null;
            }
            this.userName = null;
            int i4 = 2 % 2;
        } else {
            this.userName = str3;
        }
        if ((i & 64) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.role = null;
        } else {
            this.role = str5;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.roles = null;
            int i5 = 2 % 2;
        } else {
            this.roles = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) != 0) {
            this.countries = list2;
            return;
        }
        int i6 = read;
        int i7 = i6 + 61;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        this.countries = null;
        int i9 = i6 + 49;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("TokenData(tokenIssuer=", this.tokenIssuer, this.expiry, ", expiry=");
        sbM.append(", iat=");
        sbM.append(this.iat);
        sbM.append(", email=");
        sbM.append(this.email);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", userId=", this.userId, ", userName=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.userName, ", name=", this.name, ", role=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.role, ", roles=", this.roles, ", countries=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.countries, ")");
        int i4 = read + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.tokenIssuer;
        int iHashCode4 = 0;
        int iM = d$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.expiry);
        Long l = this.iat;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str2 = this.email;
        if (str2 == null) {
            int i2 = read + 15;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((iM + iHashCode5) * 31) + iHashCode) * 31, 31, this.userId);
        String str3 = this.userName;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.name;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.role;
        if (str5 == null) {
            int i4 = write + 67;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
            int i6 = read + 25;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        List list = this.roles;
        if (list == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = list.hashCode();
            int i8 = write + 113;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        List list2 = this.countries;
        if (list2 == null) {
            int i10 = read + 125;
            write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            iHashCode4 = list2.hashCode();
        }
        return ((((((((iM2 + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHandler25)) {
            int i2 = write + 123;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 17;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return false;
        }
        ActivityHandler25 activityHandler25 = (ActivityHandler25) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tokenIssuer, activityHandler25.tokenIssuer}, getCieXyz.write())).booleanValue() || this.expiry != activityHandler25.expiry) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iat, activityHandler25.iat}, getCieXyz.write())).booleanValue()) {
            int i7 = write + 109;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, activityHandler25.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.userId != activityHandler25.userId) {
            int i9 = read + 125;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userName, activityHandler25.userName}, getCieXyz.write())).booleanValue()) {
            int i11 = write + 93;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, activityHandler25.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.role, activityHandler25.role}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.roles, activityHandler25.roles}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, activityHandler25.countries}, getCieXyz.write())).booleanValue();
    }
}
