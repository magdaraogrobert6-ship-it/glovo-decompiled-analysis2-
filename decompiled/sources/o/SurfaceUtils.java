package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.contract.model.UserInfo$Companion;
import kotlinx.serialization.Serializable;
import o.setAmbientShadowColor;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class SurfaceUtils {
    public static final UserInfo$Companion Companion = new Object() { // from class: com.deliveryhero.contract.model.UserInfo$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return setAmbientShadowColor.RemoteActionCompatParcelizer;
        }
    };
    public final String dhAuthToken;
    public final String id;

    public final int hashCode() {
        return this.dhAuthToken.hashCode() + (this.id.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceUtils)) {
            return false;
        }
        SurfaceUtils surfaceUtils = (SurfaceUtils) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, surfaceUtils.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dhAuthToken, surfaceUtils.dhAuthToken}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(id=");
        sb.append(this.id);
        sb.append(", dhAuthToken=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.dhAuthToken, ')');
    }

    public /* synthetic */ SurfaceUtils(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.id = str;
            this.dhAuthToken = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setAmbientShadowColor.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public SurfaceUtils(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.dhAuthToken = str2;
    }
}
