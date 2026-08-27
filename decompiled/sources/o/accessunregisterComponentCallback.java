package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessunregisterComponentCallback {
    public static final Object MediaSessionCompatQueueItem = new Object();
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final Object MediaMetadataCompat;
    public final registerComponentCallback MediaSessionCompatResultReceiverWrapper;
    public final getSuperCaller MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public volatile Object PlaybackStateCompatCustomAction;
    public volatile Object RatingCompat;
    public int ResultReceiver;

    public void RemoteActionCompatParcelizer() {
    }

    public abstract void RemoteActionCompatParcelizer(Object obj);

    public void read() {
    }

    public Object IconCompatParcelizer() {
        Object obj = this.RatingCompat;
        if (obj != MediaSessionCompatQueueItem) {
            return obj;
        }
        return null;
    }

    public final void read(unregisterComponentCallback unregistercomponentcallback) {
        Object obj;
        write("observeForever");
        getUniqueDrawingId getuniquedrawingid = new getUniqueDrawingId(this, unregistercomponentcallback);
        getSuperCaller getsupercaller = this.MediaSessionCompatToken;
        getSupportImageTintMode getsupportimagetintmodeRemoteActionCompatParcelizer = getsupercaller.RemoteActionCompatParcelizer(unregistercomponentcallback);
        if (getsupportimagetintmodeRemoteActionCompatParcelizer != null) {
            obj = getsupportimagetintmodeRemoteActionCompatParcelizer.serializer;
        } else {
            getSupportImageTintMode getsupportimagetintmode = new getSupportImageTintMode(unregistercomponentcallback, getuniquedrawingid);
            getsupercaller.read++;
            getSupportImageTintMode getsupportimagetintmode2 = getsupercaller.serializer;
            if (getsupportimagetintmode2 == null) {
                getsupercaller.IconCompatParcelizer = getsupportimagetintmode;
                getsupercaller.serializer = getsupportimagetintmode;
            } else {
                getsupportimagetintmode2.RemoteActionCompatParcelizer = getsupportimagetintmode;
                getsupportimagetintmode.read = getsupportimagetintmode2;
                getsupercaller.serializer = getsupportimagetintmode;
            }
            obj = null;
        }
        obtainViewLayerContainer obtainviewlayercontainer = (obtainViewLayerContainer) obj;
        if (obtainviewlayercontainer instanceof clearShadowCache) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot add the same observer with different lifecycles");
        } else {
            if (obtainviewlayercontainer != null) {
                return;
            }
            getuniquedrawingid.serializer(true);
        }
    }

    public final void serializer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, unregisterComponentCallback unregistercomponentcallback) {
        Object obj;
        write("observe");
        if (((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat == toColorLong8_81llA.DESTROYED) {
            return;
        }
        clearShadowCache clearshadowcache = new clearShadowCache(this, accessisrendernodecompatiblecp, unregistercomponentcallback);
        getSuperCaller getsupercaller = this.MediaSessionCompatToken;
        getSupportImageTintMode getsupportimagetintmodeRemoteActionCompatParcelizer = getsupercaller.RemoteActionCompatParcelizer(unregistercomponentcallback);
        if (getsupportimagetintmodeRemoteActionCompatParcelizer != null) {
            obj = getsupportimagetintmodeRemoteActionCompatParcelizer.serializer;
        } else {
            getSupportImageTintMode getsupportimagetintmode = new getSupportImageTintMode(unregistercomponentcallback, clearshadowcache);
            getsupercaller.read++;
            getSupportImageTintMode getsupportimagetintmode2 = getsupercaller.serializer;
            if (getsupportimagetintmode2 == null) {
                getsupercaller.IconCompatParcelizer = getsupportimagetintmode;
                getsupercaller.serializer = getsupportimagetintmode;
            } else {
                getsupportimagetintmode2.RemoteActionCompatParcelizer = getsupportimagetintmode;
                getsupportimagetintmode.read = getsupportimagetintmode2;
                getsupercaller.serializer = getsupportimagetintmode;
            }
            obj = null;
        }
        obtainViewLayerContainer obtainviewlayercontainer = (obtainViewLayerContainer) obj;
        if (obtainviewlayercontainer != null && !obtainviewlayercontainer.read(accessisrendernodecompatiblecp)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot add the same observer with different lifecycles");
        } else {
            if (obtainviewlayercontainer != null) {
                return;
            }
            accessisrendernodecompatiblecp.getLifecycle().IconCompatParcelizer(clearshadowcache);
        }
    }

    public void RemoteActionCompatParcelizer(unregisterComponentCallback unregistercomponentcallback) {
        write("removeObserver");
        obtainViewLayerContainer obtainviewlayercontainer = (obtainViewLayerContainer) this.MediaSessionCompatToken.read(unregistercomponentcallback);
        if (obtainviewlayercontainer == null) {
            return;
        }
        obtainviewlayercontainer.serializer();
        obtainviewlayercontainer.serializer(false);
    }

    public static void write(String str) {
        if (setSupportButtonTintMode.IconCompatParcelizer().RemoteActionCompatParcelizer()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Cannot invoke ", str, " on a background thread"));
    }

    public accessunregisterComponentCallback() {
        this.MediaMetadataCompat = new Object();
        this.MediaSessionCompatToken = new getSuperCaller();
        this.MediaDescriptionCompat = 0;
        Object obj = MediaSessionCompatQueueItem;
        this.PlaybackStateCompatCustomAction = obj;
        this.MediaSessionCompatResultReceiverWrapper = new registerComponentCallback(this);
        this.RatingCompat = obj;
        this.ResultReceiver = -1;
    }

    public final void IconCompatParcelizer(obtainViewLayerContainer obtainviewlayercontainer) {
        if (obtainviewlayercontainer.serializer) {
            if (!obtainviewlayercontainer.IconCompatParcelizer()) {
                obtainviewlayercontainer.serializer(false);
                return;
            }
            int i = obtainviewlayercontainer.RemoteActionCompatParcelizer;
            int i2 = this.ResultReceiver;
            if (i >= i2) {
                return;
            }
            obtainviewlayercontainer.RemoteActionCompatParcelizer = i2;
            obtainviewlayercontainer.write.RemoteActionCompatParcelizer(this.RatingCompat);
        }
    }

    public final void RemoteActionCompatParcelizer(obtainViewLayerContainer obtainviewlayercontainer) {
        if (this.ParcelableVolumeInfo) {
            this.PlaybackStateCompat = true;
            return;
        }
        this.ParcelableVolumeInfo = true;
        do {
            this.PlaybackStateCompat = false;
            if (obtainviewlayercontainer != null) {
                IconCompatParcelizer(obtainviewlayercontainer);
                obtainviewlayercontainer = null;
            } else {
                getSuperCaller getsupercaller = this.MediaSessionCompatToken;
                getsupercaller.getClass();
                getSupportImageTintList getsupportimagetintlist = new getSupportImageTintList(getsupercaller);
                getsupercaller.write.put(getsupportimagetintlist, Boolean.FALSE);
                while (getsupportimagetintlist.hasNext()) {
                    IconCompatParcelizer((obtainViewLayerContainer) ((Map.Entry) getsupportimagetintlist.next()).getValue());
                    if (this.PlaybackStateCompat) {
                        break;
                    }
                }
            }
        } while (this.PlaybackStateCompat);
        this.ParcelableVolumeInfo = false;
    }

    public accessunregisterComponentCallback(Object obj) {
        this.MediaMetadataCompat = new Object();
        this.MediaSessionCompatToken = new getSuperCaller();
        this.MediaDescriptionCompat = 0;
        this.PlaybackStateCompatCustomAction = MediaSessionCompatQueueItem;
        this.MediaSessionCompatResultReceiverWrapper = new registerComponentCallback(this);
        this.RatingCompat = obj;
        this.ResultReceiver = 0;
    }
}
