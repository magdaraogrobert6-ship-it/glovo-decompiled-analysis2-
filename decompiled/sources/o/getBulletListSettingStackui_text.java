package o;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class getBulletListSettingStackui_text {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final accessisSetgyyYBs write;

    public getBulletListSettingStackui_text(accessisSetgyyYBs accessissetgyyybs) {
        accessissetgyyybs.getClass();
        this.write = accessissetgyyybs;
    }

    public final getDefaultSizeXSAIIZE IconCompatParcelizer(androidx.lifecycle.BlockRunner blockRunner, String str, boolean z) {
        Object next;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        blockRunner.getClass();
        str.getClass();
        boolean z2 = false;
        getDefaultSizeXSAIIZE getdefaultsizexsaiize = (getDefaultSizeXSAIIZE) ((LinkedHashMap) blockRunner.write()).get(hideCurrentlyDisplayingInAppMessage.write(hideCurrentlyDisplayingInAppMessage.read(str, '/'), "native-cache/"));
        getDefaultSizeXSAIIZE getdefaultsizexsaiizeRemoteActionCompatParcelizer = null;
        if (getdefaultsizexsaiize == null) {
            int i4 = serializer + 7;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String str2 = hideCurrentlyDisplayingInAppMessage.read(str, '/');
            getdefaultsizexsaiize = setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, "chat/", false) ? (getDefaultSizeXSAIIZE) ((LinkedHashMap) blockRunner.write()).get(hideCurrentlyDisplayingInAppMessage.write(str2, "chat/")) : null;
        }
        if (getdefaultsizexsaiize == null) {
            int i6 = IconCompatParcelizer + 19;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (z) {
                removeScheduledCallback removescheduledcallbackSerializer = this.write.serializer();
                removescheduledcallbackSerializer.getClass();
                if (removescheduledcallbackSerializer == removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG) {
                    int i7 = IconCompatParcelizer + 63;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    z2 = true;
                }
                Iterator it = blockRunner.IconCompatParcelizer(z2).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((hasStringAnnotations) next).read().read(str));
                hasStringAnnotations hasstringannotations = (hasStringAnnotations) next;
                if (hasstringannotations != null) {
                    int i8 = serializer + 71;
                    IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        hasstringannotations.RemoteActionCompatParcelizer();
                        throw null;
                    }
                    getdefaultsizexsaiizeRemoteActionCompatParcelizer = hasstringannotations.RemoteActionCompatParcelizer();
                }
            }
        }
        return getdefaultsizexsaiize == null ? getdefaultsizexsaiizeRemoteActionCompatParcelizer : getdefaultsizexsaiize;
    }
}
