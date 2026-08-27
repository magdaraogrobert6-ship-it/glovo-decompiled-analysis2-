package o;

import com.roadrunner.appmigration.model.GarnetResponse$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class findCoordinatorToGetBoundsui {
    public static final GarnetResponse$Companion Companion = new GarnetResponse$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final findOneLayerOfMergingSemanticsNodes banner;
    public final getBoundsInRoot popup;

    static {
        int i = IconCompatParcelizer + 21;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ findCoordinatorToGetBoundsui(int i, getBoundsInRoot getboundsinroot, findOneLayerOfMergingSemanticsNodes findonelayerofmergingsemanticsnodes) {
        if ((i & 1) == 0) {
            this.popup = null;
            int i2 = RemoteActionCompatParcelizer + 59;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.popup = getboundsinroot;
        }
        if ((i & 2) != 0) {
            this.banner = findonelayerofmergingsemanticsnodes;
            return;
        }
        int i5 = RemoteActionCompatParcelizer + 125;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            this.banner = null;
        } else {
            this.banner = null;
            int i6 = 96 / 0;
        }
    }

    public static findCoordinatorToGetBoundsui IconCompatParcelizer(findCoordinatorToGetBoundsui findcoordinatortogetboundsui) {
        int i = 2 % 2;
        findCoordinatorToGetBoundsui findcoordinatortogetboundsui2 = new findCoordinatorToGetBoundsui(null, findcoordinatortogetboundsui.banner);
        int i2 = RemoteActionCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return findcoordinatortogetboundsui2;
        }
        throw null;
    }

    public findCoordinatorToGetBoundsui(getBoundsInRoot getboundsinroot, findOneLayerOfMergingSemanticsNodes findonelayerofmergingsemanticsnodes) {
        this.popup = getboundsinroot;
        this.banner = findonelayerofmergingsemanticsnodes;
    }

    public final int hashCode() {
        getBoundsInRoot getboundsinroot;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            getboundsinroot = this.popup;
            iHashCode = 1;
            if (getboundsinroot != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = getboundsinroot.hashCode();
            }
        } else {
            getboundsinroot = this.popup;
            if (getboundsinroot == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = getboundsinroot.hashCode();
            }
        }
        findOneLayerOfMergingSemanticsNodes findonelayerofmergingsemanticsnodes = this.banner;
        if (findonelayerofmergingsemanticsnodes != null) {
            iHashCode = findonelayerofmergingsemanticsnodes.hashCode();
            int i3 = RemoteActionCompatParcelizer + 43;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 3 % 3;
            }
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GarnetResponse(popup=" + this.popup + ", banner=" + this.banner + ")";
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 87;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof findCoordinatorToGetBoundsui) {
            findCoordinatorToGetBoundsui findcoordinatortogetboundsui = (findCoordinatorToGetBoundsui) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.popup, findcoordinatortogetboundsui.popup}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.banner, findcoordinatortogetboundsui.banner}, getCieXyz.write())).booleanValue();
        }
        int i4 = serializer + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
