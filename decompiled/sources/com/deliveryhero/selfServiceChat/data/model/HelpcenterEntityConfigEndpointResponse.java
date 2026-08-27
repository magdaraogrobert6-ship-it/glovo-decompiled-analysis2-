package com.deliveryhero.selfServiceChat.data.model;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes4.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class HelpcenterEntityConfigEndpointResponse {
    public final List write;

    @getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
    public static final class GlobalEntityConfig {
        public final String IconCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;
        public final String read;

        public final int hashCode() {
            return Boolean.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.read);
        }

        public GlobalEntityConfig(@getDensityDpi(serializer = "global_entity_id") String str, @getDensityDpi(serializer = "self_service_region") String str2, @getDensityDpi(serializer = "register_device_token_for_p2p_chat") boolean z) {
            str.getClass();
            str2.getClass();
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.RemoteActionCompatParcelizer = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GlobalEntityConfig)) {
                return false;
            }
            GlobalEntityConfig globalEntityConfig = (GlobalEntityConfig) obj;
            return this.IconCompatParcelizer.equals(globalEntityConfig.IconCompatParcelizer) && this.read.equals(globalEntityConfig.read) && this.RemoteActionCompatParcelizer == globalEntityConfig.RemoteActionCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GlobalEntityConfig(globalEntityId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", selfServiceRegion=");
            sb.append(this.read);
            sb.append(", registerDeviceTokenForP2PChat=");
            return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ')');
        }
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public HelpcenterEntityConfigEndpointResponse(@getDensityDpi(serializer = "global_entity_configs") List<GlobalEntityConfig> list) {
        list.getClass();
        this.write = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpcenterEntityConfigEndpointResponse) && this.write.equals(((HelpcenterEntityConfigEndpointResponse) obj).write);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("HelpcenterEntityConfigEndpointResponse(globalEntityConfigs="), this.write, ')');
    }
}
