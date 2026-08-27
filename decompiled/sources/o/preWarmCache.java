package o;

import android.graphics.Bitmap;
import android.net.Uri;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class preWarmCache extends accessgetRotatecp {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final setNavigationOnClickListener IconCompatParcelizer;
    public final String read;
    public final Uri serializer;
    public final /* synthetic */ int write;

    public preWarmCache(Uri uri, setNavigationOnClickListener setnavigationonclicklistener, int i) {
        this.write = i;
        if (i != 1) {
            setnavigationonclicklistener.getClass();
            this.serializer = uri;
            this.IconCompatParcelizer = setnavigationonclicklistener;
            this.read = SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "photo_");
            return;
        }
        setnavigationonclicklistener.getClass();
        this.serializer = uri;
        this.IconCompatParcelizer = setnavigationonclicklistener;
        this.read = SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "photo_");
    }

    @Override // o.accessgetRotatecp
    public final String read() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 89;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.write != 0) {
            return this.read;
        }
        String str = this.read;
        int i4 = i2 + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    @Override // o.accessgetRotatecp
    public final Bitmap read(Bitmap bitmap, accessgetLayerBlockp accessgetlayerblockp) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        Uri uri = this.serializer;
        setNavigationOnClickListener setnavigationonclicklistener = this.IconCompatParcelizer;
        float f = 270.0f;
        if (i3 != 0) {
            try {
                int iMediaSessionCompatResultReceiverWrapper = setnavigationonclicklistener.MediaSessionCompatResultReceiverWrapper();
                if (iMediaSessionCompatResultReceiverWrapper == 1) {
                    f = 90.0f;
                } else if (iMediaSessionCompatResultReceiverWrapper != 2) {
                    int i4 = RemoteActionCompatParcelizer + 101;
                    MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    if (iMediaSessionCompatResultReceiverWrapper != 3) {
                        f = 0.0f;
                    }
                } else {
                    f = 180.0f;
                }
            } catch (Throwable th) {
                Timber.RemoteActionCompatParcelizer.serializer(th, SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "can't read EXIF data from "), new Object[0]);
            }
            if (f == 0.0f) {
                return bitmap;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmapCreateBitmap.getClass();
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        try {
            int iMediaSessionCompatResultReceiverWrapper2 = setnavigationonclicklistener.MediaSessionCompatResultReceiverWrapper();
            if (iMediaSessionCompatResultReceiverWrapper2 != 1) {
                int i6 = RemoteActionCompatParcelizer + 71;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (iMediaSessionCompatResultReceiverWrapper2 == 2) {
                    f = 180.0f;
                } else if (iMediaSessionCompatResultReceiverWrapper2 != 3) {
                    f = 0.0f;
                }
            } else {
                f = 90.0f;
            }
        } catch (Throwable th2) {
            Timber.RemoteActionCompatParcelizer.serializer(th2, SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "can't read EXIF data from "), new Object[0]);
        }
        if (f == 0.0f) {
            return bitmap;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postRotate(f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
        bitmapCreateBitmap2.getClass();
        bitmap.recycle();
        int i8 = RemoteActionCompatParcelizer + 95;
        MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return bitmapCreateBitmap2;
    }
}
