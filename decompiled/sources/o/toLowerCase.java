package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.toLowerCasedefault;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toLowerCase {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final ReleasesResponse$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 121;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            toLowerCasedefault tolowercasedefault = toLowerCasedefault.write;
            int i4 = read + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return tolowercasedefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String appId;
    public final String assetsCdnPrefix;
    public final List bypassUrlPatterns;
    public final List criticalContentArtifactList;
    public final String generatedAt;
    public final List modules;
    public final String releaseId;
    public final String responseHash;
    public final List routes;
    public final List routesWithSsg;
    public final toUpperCasedefault sizes;
    public final String version;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.remote.dto.ReleasesResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(29)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(1)), null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(2)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(3)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new accessgetAboveBaselinecp(4))};
        int i = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.releaseId;
            int i4 = 26 / 0;
        } else {
            str = this.releaseId;
        }
        int i5 = i2 + 117;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.modules;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 117;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.routes;
        int i5 = i2 + 117;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.assetsCdnPrefix;
        int i5 = i3 + 17;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final List write() {
        int i = 2 % 2;
        int i2 = write + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        List list = this.routesWithSsg;
        int i5 = i3 + 91;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return list;
    }

    public /* synthetic */ toLowerCase(int i, String str, String str2, String str3, String str4, List list, toUpperCasedefault touppercasedefault, List list2, String str5, String str6, List list3, List list4, List list5) {
        Object obj = null;
        if (255 != (i & 255)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, toLowerCasedefault.write.getDescriptor());
            throw null;
        }
        this.releaseId = str;
        this.responseHash = str2;
        this.appId = str3;
        this.version = str4;
        this.modules = list;
        this.sizes = touppercasedefault;
        this.criticalContentArtifactList = list2;
        this.generatedAt = str5;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.assetsCdnPrefix = "";
            int i2 = 2 % 2;
        } else {
            this.assetsCdnPrefix = str6;
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            int i3 = read + 57;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.routes = instance_delegatelambda0Var;
        } else {
            this.routes = list3;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            int i5 = read + 87;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.routesWithSsg = instance_delegatelambda0Var;
            int i7 = 2 % 2;
        } else {
            this.routesWithSsg = list4;
        }
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            this.bypassUrlPatterns = instance_delegatelambda0Var;
            return;
        }
        this.bypassUrlPatterns = list5;
        int i8 = read + 25;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.modules, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.releaseId.hashCode() * 31, 31, this.responseHash), 31, this.appId), 31, this.version), 31);
        int iHashCode = this.bypassUrlPatterns.hashCode() + c8$$ExternalSyntheticOutline0.m(this.routesWithSsg, c8$$ExternalSyntheticOutline0.m(this.routes, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.criticalContentArtifactList, (this.sizes.hashCode() + iM) * 31, 31), 31, this.generatedAt), 31, this.assetsCdnPrefix), 31), 31);
        int i4 = write + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ReleasesResponse(releaseId=", this.releaseId, ", responseHash=", this.responseHash, ", appId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.appId, ", version=", this.version, ", modules=");
        sbM.append(this.modules);
        sbM.append(", sizes=");
        sbM.append(this.sizes);
        sbM.append(", criticalContentArtifactList=");
        sbM.append(this.criticalContentArtifactList);
        sbM.append(", generatedAt=");
        sbM.append(this.generatedAt);
        sbM.append(", assetsCdnPrefix=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.assetsCdnPrefix, ", routes=", this.routes, ", routesWithSsg=");
        sbM.append(this.routesWithSsg);
        sbM.append(", bypassUrlPatterns=");
        sbM.append(this.bypassUrlPatterns);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toLowerCase)) {
            return false;
        }
        toLowerCase tolowercase = (toLowerCase) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.releaseId, tolowercase.releaseId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseHash, tolowercase.responseHash}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.appId, tolowercase.appId}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, tolowercase.version}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modules, tolowercase.modules}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sizes, tolowercase.sizes}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.criticalContentArtifactList, tolowercase.criticalContentArtifactList}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.generatedAt, tolowercase.generatedAt}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.assetsCdnPrefix, tolowercase.assetsCdnPrefix}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routes, tolowercase.routes}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routesWithSsg, tolowercase.routesWithSsg}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bypassUrlPatterns, tolowercase.bypassUrlPatterns}, getCieXyz.write())).booleanValue();
            }
            int i2 = write + 23;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
