package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class entryRemoved implements awaitNavigationRoutes {
    public final /* synthetic */ LruCache IconCompatParcelizer;
    public final /* synthetic */ SmallDisplaySizeQuirk MediaDescriptionCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ SmallDisplaySizeQuirk read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ ImageUtilCodecFailedException write;

    @Override // o.awaitNavigationRoutes
    public final void IconCompatParcelizer(mapToBase maptobase, CameraUseCaseAdapter cameraUseCaseAdapter) {
        LruCache lruCache = this.IconCompatParcelizer;
        if (lruCache.RatingCompat() == null) {
            return;
        }
        lruCache.read();
        lruCache.RemoteActionCompatParcelizer(lruCache.serializer(this.RemoteActionCompatParcelizer, this.serializer, this.write, this.read, this.MediaDescriptionCompat));
        lruCache.ParcelableVolumeInfo();
        get getVar = lruCache.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        getVar.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        Iterator it = getVar.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            getVar.IconCompatParcelizer((androidx.camera.core.UseCase) it.next());
        }
    }

    public /* synthetic */ entryRemoved(LruCache lruCache, String str, String str2, ImageUtilCodecFailedException imageUtilCodecFailedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        this.IconCompatParcelizer = lruCache;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.write = imageUtilCodecFailedException;
        this.read = smallDisplaySizeQuirk;
        this.MediaDescriptionCompat = smallDisplaySizeQuirk2;
    }
}
