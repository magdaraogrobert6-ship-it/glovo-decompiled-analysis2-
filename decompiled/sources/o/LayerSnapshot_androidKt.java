package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.contract.model.ClientConfig$Companion;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.OutlineUtils;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class LayerSnapshot_androidKt {
    public final String country;
    public final rebuildOutline dhEnvironment;
    public final String globalEntityID;
    public final getSpotShadowColor pushNotificationsTokenType;
    public final resolveLockHardwareCanvasMethod userType;
    public static final ClientConfig$Companion Companion = new Object() { // from class: com.deliveryhero.contract.model.ClientConfig$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return OutlineUtils.serializer;
        }
    };
    public static final setGraphicModalMaxWidthDp[] $childSerializers = {null, null, new EnumSerializer("com.deliveryhero.contract.model.UserType", (Enum[]) resolveLockHardwareCanvasMethod.values()), new EnumSerializer("com.deliveryhero.contract.model.TokenType", (Enum[]) getSpotShadowColor.values()), new EnumSerializer("com.deliveryhero.contract.model.DhEnvironment", (Enum[]) rebuildOutline.values())};

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.country.hashCode() * 31, 31, this.globalEntityID);
        int iHashCode = this.userType.hashCode();
        return this.dhEnvironment.hashCode() + ((this.pushNotificationsTokenType.hashCode() + ((iHashCode + iM) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayerSnapshot_androidKt)) {
            return false;
        }
        LayerSnapshot_androidKt layerSnapshot_androidKt = (LayerSnapshot_androidKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, layerSnapshot_androidKt.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityID, layerSnapshot_androidKt.globalEntityID}, getCieXyz.write())).booleanValue() && this.userType == layerSnapshot_androidKt.userType && this.pushNotificationsTokenType == layerSnapshot_androidKt.pushNotificationsTokenType && this.dhEnvironment == layerSnapshot_androidKt.dhEnvironment;
    }

    public final String toString() {
        return "ClientConfig(country=" + this.country + ", globalEntityID=" + this.globalEntityID + ", userType=" + this.userType + ", pushNotificationsTokenType=" + this.pushNotificationsTokenType + ", dhEnvironment=" + this.dhEnvironment + ')';
    }

    public /* synthetic */ LayerSnapshot_androidKt(int i, String str, String str2, resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod, getSpotShadowColor getspotshadowcolor, rebuildOutline rebuildoutline) {
        if (15 == (i & 15)) {
            this.country = str;
            this.globalEntityID = str2;
            this.userType = resolvelockhardwarecanvasmethod;
            this.pushNotificationsTokenType = getspotshadowcolor;
            if ((i & 16) == 0) {
                this.dhEnvironment = rebuildOutline.PRODUCTION;
                return;
            } else {
                this.dhEnvironment = rebuildoutline;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, OutlineUtils.serializer.getDescriptor());
        throw null;
    }

    public LayerSnapshot_androidKt(String str, String str2, resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod, getSpotShadowColor getspotshadowcolor, rebuildOutline rebuildoutline) {
        this.country = str;
        this.globalEntityID = str2;
        this.userType = resolvelockhardwarecanvasmethod;
        this.pushNotificationsTokenType = getspotshadowcolor;
        this.dhEnvironment = rebuildoutline;
    }
}
