package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerScopeDefaultImpls {
    public final long IconCompatParcelizer;
    public final setTranslationY MediaBrowserCompatMediaItem;
    public final setTranslationX MediaDescriptionCompat;
    public final accessgetAmbientShadowColor0d7_KjUjd MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int MediaSessionCompatToken;
    public final HashSet ParcelableVolumeInfo;
    public final accessgetAmbientShadowColor0d7_KjUjd RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final UUID read;
    public final int serializer;
    public final toolingGraphicsLayer write;

    public final setTranslationX RemoteActionCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.MediaDescriptionCompat.hashCode();
        int iHashCode3 = this.RatingCompat.hashCode();
        int iHashCode4 = this.ParcelableVolumeInfo.hashCode();
        int iHashCode5 = this.MediaMetadataCompat.hashCode();
        int i = this.MediaSessionCompatQueueItem;
        int iM = d$$ExternalSyntheticOutline0.m((this.write.hashCode() + ((((((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31) + i) * 31) + this.serializer) * 31)) * 31, 31, this.IconCompatParcelizer);
        setTranslationY settranslationy = this.MediaBrowserCompatMediaItem;
        return Integer.hashCode(this.MediaSessionCompatToken) + d$$ExternalSyntheticOutline0.m((iM + (settranslationy != null ? settranslationy.hashCode() : 0)) * 31, 31, this.RemoteActionCompatParcelizer);
    }

    public GraphicsLayerScopeDefaultImpls(UUID uuid, setTranslationX settranslationx, HashSet hashSet, accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd, accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2, int i, int i2, toolingGraphicsLayer toolinggraphicslayer, long j, setTranslationY settranslationy, long j2, int i3) {
        settranslationx.getClass();
        accessgetambientshadowcolor0d7_kjujd.getClass();
        accessgetambientshadowcolor0d7_kjujd2.getClass();
        this.read = uuid;
        this.MediaDescriptionCompat = settranslationx;
        this.ParcelableVolumeInfo = hashSet;
        this.RatingCompat = accessgetambientshadowcolor0d7_kjujd;
        this.MediaMetadataCompat = accessgetambientshadowcolor0d7_kjujd2;
        this.MediaSessionCompatQueueItem = i;
        this.serializer = i2;
        this.write = toolinggraphicslayer;
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompatMediaItem = settranslationy;
        this.RemoteActionCompatParcelizer = j2;
        this.MediaSessionCompatToken = i3;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.read + "', state=" + this.MediaDescriptionCompat + ", outputData=" + this.RatingCompat + ", tags=" + this.ParcelableVolumeInfo + ", progress=" + this.MediaMetadataCompat + ", runAttemptCount=" + this.MediaSessionCompatQueueItem + ", generation=" + this.serializer + ", constraints=" + this.write + ", initialDelayMillis=" + this.IconCompatParcelizer + ", periodicityInfo=" + this.MediaBrowserCompatMediaItem + ", nextScheduleTimeMillis=" + this.RemoteActionCompatParcelizer + "}, stopReason=" + this.MediaSessionCompatToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !GraphicsLayerScopeDefaultImpls.class.equals(obj.getClass())) {
            return false;
        }
        GraphicsLayerScopeDefaultImpls graphicsLayerScopeDefaultImpls = (GraphicsLayerScopeDefaultImpls) obj;
        if (this.MediaSessionCompatQueueItem != graphicsLayerScopeDefaultImpls.MediaSessionCompatQueueItem || this.serializer != graphicsLayerScopeDefaultImpls.serializer || !this.read.equals(graphicsLayerScopeDefaultImpls.read) || this.MediaDescriptionCompat != graphicsLayerScopeDefaultImpls.MediaDescriptionCompat) {
            return false;
        }
        Object[] objArr = {this.RatingCompat, graphicsLayerScopeDefaultImpls.RatingCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() || !this.write.equals(graphicsLayerScopeDefaultImpls.write) || this.IconCompatParcelizer != graphicsLayerScopeDefaultImpls.IconCompatParcelizer) {
            return false;
        }
        Object[] objArr2 = {this.MediaBrowserCompatMediaItem, graphicsLayerScopeDefaultImpls.MediaBrowserCompatMediaItem};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != graphicsLayerScopeDefaultImpls.RemoteActionCompatParcelizer || this.MediaSessionCompatToken != graphicsLayerScopeDefaultImpls.MediaSessionCompatToken || !this.ParcelableVolumeInfo.equals(graphicsLayerScopeDefaultImpls.ParcelableVolumeInfo)) {
            return false;
        }
        Object[] objArr3 = {this.MediaMetadataCompat, graphicsLayerScopeDefaultImpls.MediaMetadataCompat};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue();
    }
}
