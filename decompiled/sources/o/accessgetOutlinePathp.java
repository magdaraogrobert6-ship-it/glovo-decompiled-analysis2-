package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.data.error.ApiError$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetUsePathForClipp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class accessgetOutlinePathp {
    public static final ApiError$Companion Companion = new Object() { // from class: com.data.error.ApiError$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return accessgetUsePathForClipp.RemoteActionCompatParcelizer;
        }
    };
    public static final accessgetOutlinePathp EMPTY = new accessgetOutlinePathp("", null);
    public final String localizeKey;
    public final String message;
    public final String originalMessage;

    public final int hashCode() {
        String str = this.message;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.localizeKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.originalMessage;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetOutlinePathp)) {
            return false;
        }
        accessgetOutlinePathp accessgetoutlinepathp = (accessgetOutlinePathp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, accessgetoutlinepathp.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.localizeKey, accessgetoutlinepathp.localizeKey}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.originalMessage, accessgetoutlinepathp.originalMessage}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ApiError(message=", this.message, ", localizeKey=", this.localizeKey, ", originalMessage="), this.originalMessage, ")");
    }

    public /* synthetic */ accessgetOutlinePathp(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.localizeKey = null;
        } else {
            this.localizeKey = str2;
        }
        if ((i & 4) == 0) {
            this.originalMessage = null;
        } else {
            this.originalMessage = str3;
        }
    }

    public accessgetOutlinePathp(String str, String str2) {
        this.message = str;
        this.localizeKey = "";
        this.originalMessage = str2;
    }
}
