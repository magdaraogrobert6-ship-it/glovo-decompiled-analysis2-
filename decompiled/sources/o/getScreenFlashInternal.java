package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class getScreenFlashInternal {
    public final ArrayList IconCompatParcelizer;
    public final setScreenFlashUiInfo MediaBrowserCompatMediaItem;
    public final LruCache MediaDescriptionCompat;
    public final androidx.camera.core.UseCase MediaMetadataCompat;
    public final HashMap MediaSessionCompatQueueItem;
    public final setScreenFlashUiInfo RatingCompat;
    public final LinkedHashSet RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final ArrayList serializer;
    public final ArrayList write;

    public final int hashCode() {
        int iWrite = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.read, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.serializer, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.write, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer.hashCode() * 31, 31), 31), 31), 31);
        LruCache lruCache = this.MediaDescriptionCompat;
        int iHashCode = lruCache == null ? 0 : lruCache.hashCode();
        androidx.camera.core.UseCase useCase = this.MediaMetadataCompat;
        int iHashCode2 = useCase == null ? 0 : useCase.hashCode();
        int iHashCode3 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode4 = this.MediaBrowserCompatMediaItem.hashCode();
        setScreenFlashUiInfo setscreenflashuiinfo = this.RatingCompat;
        return ((iHashCode4 + ((iHashCode3 + ((((iWrite + iHashCode) * 31) + iHashCode2) * 31)) * 31)) * 31) + (setscreenflashuiinfo != null ? setscreenflashuiinfo.hashCode() : 0);
    }

    public getScreenFlashInternal(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, LruCache lruCache, androidx.camera.core.UseCase useCase, HashMap map, setScreenFlashUiInfo setscreenflashuiinfo, setScreenFlashUiInfo setscreenflashuiinfo2) {
        setscreenflashuiinfo.getClass();
        this.RemoteActionCompatParcelizer = linkedHashSet;
        this.IconCompatParcelizer = arrayList;
        this.write = arrayList2;
        this.serializer = arrayList3;
        this.read = arrayList4;
        this.MediaDescriptionCompat = lruCache;
        this.MediaMetadataCompat = useCase;
        this.MediaSessionCompatQueueItem = map;
        this.MediaBrowserCompatMediaItem = setscreenflashuiinfo;
        this.RatingCompat = setscreenflashuiinfo2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getScreenFlashInternal)) {
            return false;
        }
        getScreenFlashInternal getscreenflashinternal = (getScreenFlashInternal) obj;
        if (!this.RemoteActionCompatParcelizer.equals(getscreenflashinternal.RemoteActionCompatParcelizer) || !this.IconCompatParcelizer.equals(getscreenflashinternal.IconCompatParcelizer) || !this.write.equals(getscreenflashinternal.write) || !this.serializer.equals(getscreenflashinternal.serializer) || !this.read.equals(getscreenflashinternal.read)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, getscreenflashinternal.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, getscreenflashinternal.MediaMetadataCompat}, getCieXyz.write())).booleanValue() || !this.MediaSessionCompatQueueItem.equals(getscreenflashinternal.MediaSessionCompatQueueItem)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, getscreenflashinternal.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, getscreenflashinternal.RatingCompat}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.RemoteActionCompatParcelizer + ", cameraUseCases=" + this.IconCompatParcelizer + ", cameraUseCasesToAttach=" + this.write + ", cameraUseCasesToKeep=" + this.serializer + ", cameraUseCasesToDetach=" + this.read + ", streamSharing=" + this.MediaDescriptionCompat + ", placeholderForExtensions=" + this.MediaMetadataCompat + ", useCaseConfigs=" + this.MediaSessionCompatQueueItem + ", primaryStreamSpecResult=" + this.MediaBrowserCompatMediaItem + ", secondaryStreamSpecResult=" + this.RatingCompat + ')';
    }
}
