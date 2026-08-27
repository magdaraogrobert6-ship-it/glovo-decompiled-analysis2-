package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class drawRoundRectuAw5IA implements getPrimaries {
    public static final String[] serializer = {"_data"};
    public final drawImage9jGpkUE IconCompatParcelizer;
    public final getEotfFuncui_graphics MediaBrowserCompatMediaItem;
    public final drawImage9jGpkUE MediaDescriptionCompat;
    public volatile boolean MediaMetadataCompat;
    public final Uri MediaSessionCompatQueueItem;
    public final int PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public volatile getPrimaries RemoteActionCompatParcelizer;
    public final Class read;
    public final Context write;

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final void read() {
        this.MediaMetadataCompat = true;
        getPrimaries getprimaries = this.RemoteActionCompatParcelizer;
        if (getprimaries != null) {
            getprimaries.read();
        }
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return this.read;
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) throws Throwable {
        try {
            getPrimaries getprimariesIconCompatParcelizer = IconCompatParcelizer();
            if (getprimariesIconCompatParcelizer == null) {
                getinversetransformui_graphics.write(new IllegalArgumentException("Failed to build fetcher for: " + this.MediaSessionCompatQueueItem));
            } else {
                this.RemoteActionCompatParcelizer = getprimariesIconCompatParcelizer;
                if (this.MediaMetadataCompat) {
                    read();
                } else {
                    getprimariesIconCompatParcelizer.read(renderIntentCompanion, getinversetransformui_graphics);
                }
            }
        } catch (FileNotFoundException e) {
            getinversetransformui_graphics.write(e);
        }
    }

    public drawRoundRectuAw5IA(Context context, drawImage9jGpkUE drawimage9jgpkue, drawImage9jGpkUE drawimage9jgpkue2, Uri uri, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics, Class cls) {
        this.write = context.getApplicationContext();
        this.IconCompatParcelizer = drawimage9jgpkue;
        this.MediaDescriptionCompat = drawimage9jgpkue2;
        this.MediaSessionCompatQueueItem = uri;
        this.PlaybackStateCompatCustomAction = i;
        this.RatingCompat = i2;
        this.MediaBrowserCompatMediaItem = geteotffuncui_graphics;
        this.read = cls;
    }

    @Override // o.getPrimaries
    public final void write() {
        getPrimaries getprimaries = this.RemoteActionCompatParcelizer;
        if (getprimaries != null) {
            getprimaries.write();
        }
    }

    public final getPrimaries IconCompatParcelizer() throws Throwable {
        drawLine1RTmtNc drawline1rtmtncRemoteActionCompatParcelizer;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Context context = this.write;
        getEotfFuncui_graphics geteotffuncui_graphics = this.MediaBrowserCompatMediaItem;
        int i = this.RatingCompat;
        int i2 = this.PlaybackStateCompatCustomAction;
        Cursor cursor = null;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.MediaSessionCompatQueueItem;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, serializer, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            drawline1rtmtncRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(file, i2, i, geteotffuncui_graphics);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.MediaSessionCompatQueueItem;
            boolean zIconCompatParcelizer = computeVerticalBoundsdefault.IconCompatParcelizer(requireOriginal);
            drawImage9jGpkUE drawimage9jgpkue = this.MediaDescriptionCompat;
            if (zIconCompatParcelizer && requireOriginal.getPathSegments().contains("picker")) {
                drawline1rtmtncRemoteActionCompatParcelizer = drawimage9jgpkue.RemoteActionCompatParcelizer(requireOriginal, i2, i, geteotffuncui_graphics);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                drawline1rtmtncRemoteActionCompatParcelizer = drawimage9jgpkue.RemoteActionCompatParcelizer(requireOriginal, i2, i, geteotffuncui_graphics);
            }
        }
        if (drawline1rtmtncRemoteActionCompatParcelizer != null) {
            return drawline1rtmtncRemoteActionCompatParcelizer.IconCompatParcelizer;
        }
        return null;
    }
}
