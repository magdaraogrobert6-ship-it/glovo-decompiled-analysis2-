package com.deliveryhero.selfServiceChat.data.config;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class HelpcenterEntityConfigEndpointResponse {
    public final List globalEntityConfigs;

    @getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
    public static final class GlobalEntityConfig {
        public final String IconCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;
        public final String serializer;

        public final int hashCode() {
            return Boolean.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer);
        }

        public GlobalEntityConfig(@getDensityDpi(serializer = "global_entity_id") String str, @getDensityDpi(serializer = "self_service_region") String str2, @getDensityDpi(serializer = "register_device_token_for_p2p_chat") boolean z) {
            str.getClass();
            str2.getClass();
            this.serializer = str;
            this.IconCompatParcelizer = str2;
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
            return this.serializer.equals(globalEntityConfig.serializer) && this.IconCompatParcelizer.equals(globalEntityConfig.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == globalEntityConfig.RemoteActionCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GlobalEntityConfig(globalEntityId=");
            sb.append(this.serializer);
            sb.append(", selfServiceRegion=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", registerDeviceTokenForP2PChat=");
            return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ')');
        }
    }

    public final int hashCode() {
        return this.globalEntityConfigs.hashCode();
    }

    public HelpcenterEntityConfigEndpointResponse(@getDensityDpi(serializer = "global_entity_configs") List<GlobalEntityConfig> list) {
        list.getClass();
        this.globalEntityConfigs = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpcenterEntityConfigEndpointResponse) && this.globalEntityConfigs.equals(((HelpcenterEntityConfigEndpointResponse) obj).globalEntityConfigs);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("HelpcenterEntityConfigEndpointResponse(globalEntityConfigs="), this.globalEntityConfigs, ')');
    }
}
