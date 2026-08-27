package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.api.data.TwoFaErrorResponse$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getFillableData {
    public static final TwoFaErrorResponse$Companion Companion = new TwoFaErrorResponse$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String code;
    public final String exceptionType;
    public final String message;

    static {
        int i = serializer + 29;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getFillableData(int i, String str, String str2, String str3) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
            int i2 = read + 77;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            int i4 = IconCompatParcelizer + 7;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.message = null;
                obj.hashCode();
                throw null;
            }
            this.message = null;
            int i5 = 2 % 2;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.exceptionType = null;
            return;
        }
        this.exceptionType = str3;
        int i6 = read + 31;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("TwoFaErrorResponse(code=", this.code, ", message=", this.message, ", exceptionType="), this.exceptionType, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("TwoFaErrorResponse(code=", this.code, ", message=", this.message, ", exceptionType="), this.exceptionType, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.code;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        if (str2 == null) {
            int i2 = read + 15;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i4 = read + 81;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str3 = this.exceptionType;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            int i6 = read + 113;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 / 4;
            }
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 23;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getFillableData) {
            getFillableData getfillabledata = (getFillableData) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, getfillabledata.code}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, getfillabledata.message}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.exceptionType, getfillabledata.exceptionType}, getCieXyz.write())).booleanValue();
            }
            int i4 = read + 31;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i5;
            boolean z = i4 % 2 != 0;
            int i6 = i5 + 17;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return z;
        }
        int i8 = read + 33;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
