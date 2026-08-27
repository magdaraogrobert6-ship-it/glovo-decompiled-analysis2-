package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheMetadata$Companion;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class hasLinkAnnotations {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final ChatAssetCacheMetadata$Companion Companion = new ChatAssetCacheMetadata$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List assets;
    public final String assetsCdnPrefix;
    public final String releaseId;
    public final List routes;
    public final List routesWithSsg;
    public final ChatAssetCacheStatus status;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(22)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(23)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(24)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ActionPropertyKey(25))};
        int i = write + 93;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List list = this.routes;
        int i4 = i3 + 113;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return list;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.assetsCdnPrefix;
        int i5 = i3 + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.assets;
        }
        int i3 = 52 / 0;
        return this.assets;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        List list = this.routesWithSsg;
        int i4 = i2 + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.releaseId;
        int i5 = i2 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ hasLinkAnnotations(int i, String str, String str2, ChatAssetCacheStatus chatAssetCacheStatus, List list, List list2, List list3) {
        Object obj = null;
        if (47 == (i & 47)) {
            this.releaseId = str;
            this.assetsCdnPrefix = str2;
            this.status = chatAssetCacheStatus;
            this.routes = list;
            if ((i & 16) == 0) {
                this.routesWithSsg = instance_delegatelambda0.write;
            } else {
                this.routesWithSsg = list2;
                int i2 = read + 13;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.assets = list3;
            int i5 = IconCompatParcelizer + 33;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 47, hasEqualAnnotations.write.getDescriptor());
        throw null;
    }

    public hasLinkAnnotations(String str, String str2, ChatAssetCacheStatus chatAssetCacheStatus, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        str.getClass();
        str2.getClass();
        chatAssetCacheStatus.getClass();
        this.releaseId = str;
        this.assetsCdnPrefix = str2;
        this.status = chatAssetCacheStatus;
        this.routes = arrayList;
        this.routesWithSsg = arrayList2;
        this.assets = arrayList3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.releaseId.hashCode() * 31, 31, this.assetsCdnPrefix);
        int iHashCode = this.assets.hashCode() + c8$$ExternalSyntheticOutline0.m(this.routesWithSsg, c8$$ExternalSyntheticOutline0.m(this.routes, (this.status.hashCode() + iM) * 31, 31), 31);
        int i4 = read + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ChatAssetCacheMetadata(releaseId=", this.releaseId, ", assetsCdnPrefix=", this.assetsCdnPrefix, ", status=");
        sbM.append(this.status);
        sbM.append(", routes=");
        sbM.append(this.routes);
        sbM.append(", routesWithSsg=");
        sbM.append(this.routesWithSsg);
        sbM.append(", assets=");
        sbM.append(this.assets);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 69;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasLinkAnnotations)) {
            int i5 = i3 + 81;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        hasLinkAnnotations haslinkannotations = (hasLinkAnnotations) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.releaseId, haslinkannotations.releaseId}, getCieXyz.write())).booleanValue()) {
            int i7 = read + 53;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 3 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.assetsCdnPrefix, haslinkannotations.assetsCdnPrefix}, getCieXyz.write())).booleanValue() || this.status != haslinkannotations.status) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routes, haslinkannotations.routes}, getCieXyz.write())).booleanValue()) {
            int i9 = IconCompatParcelizer + 43;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routesWithSsg, haslinkannotations.routesWithSsg}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.assets, haslinkannotations.assets}, getCieXyz.write())).booleanValue();
    }
}
