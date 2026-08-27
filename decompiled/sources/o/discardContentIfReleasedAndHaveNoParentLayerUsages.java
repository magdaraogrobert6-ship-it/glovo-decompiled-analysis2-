package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.data.error.ApiErrorResponse$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class discardContentIfReleasedAndHaveNoParentLayerUsages {
    public static final ApiErrorResponse$Companion Companion = new ApiErrorResponse$Companion();
    public final accessgetOutlinePathp error;
    public final String message;
    public final String originalMessage;

    public final int hashCode() {
        accessgetOutlinePathp accessgetoutlinepathp = this.error;
        int iHashCode = accessgetoutlinepathp == null ? 0 : accessgetoutlinepathp.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.originalMessage;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof discardContentIfReleasedAndHaveNoParentLayerUsages)) {
            return false;
        }
        discardContentIfReleasedAndHaveNoParentLayerUsages discardcontentifreleasedandhavenoparentlayerusages = (discardContentIfReleasedAndHaveNoParentLayerUsages) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, discardcontentifreleasedandhavenoparentlayerusages.error}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, discardcontentifreleasedandhavenoparentlayerusages.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.originalMessage, discardcontentifreleasedandhavenoparentlayerusages.originalMessage}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiErrorResponse(error=");
        sb.append(this.error);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", originalMessage=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.originalMessage, ")");
    }

    public /* synthetic */ discardContentIfReleasedAndHaveNoParentLayerUsages(int i, accessgetOutlinePathp accessgetoutlinepathp, String str, String str2) {
        if ((i & 1) == 0) {
            this.error = null;
        } else {
            this.error = accessgetoutlinepathp;
        }
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.originalMessage = null;
        } else {
            this.originalMessage = str2;
        }
    }
}
