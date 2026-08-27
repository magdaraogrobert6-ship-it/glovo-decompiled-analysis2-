package o;

import android.text.TextUtils;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.location.tiles.utils.LW;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getTheme {
    public static double IconCompatParcelizer;
    public static String MediaDescriptionCompat;
    public static final String RatingCompat;
    public static final String RemoteActionCompatParcelizer;
    public static double read;
    public static final String serializer;
    public static final String write;
    public loadVectorResource MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat;
    public ImageVectorCache MediaSessionCompatQueueItem;
    public final int MediaSessionCompatToken;

    public static void IconCompatParcelizer(getTheme gettheme) {
        synchronized (gettheme) {
            loadVectorResource loadvectorresource = gettheme.MediaBrowserCompatMediaItem;
            if (loadvectorresource != null) {
                String strSerializer = loadvectorresource.serializer();
                String str = gettheme.MediaBrowserCompatMediaItem.read();
                String strRemoteActionCompatParcelizer = gettheme.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                String str2 = RemoteActionCompatParcelizer;
                String strSerializer2 = integerResource.serializer(str2, strSerializer);
                if (!TextUtils.isEmpty(strSerializer2) && !TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                    File file = new File(strSerializer2);
                    if (file.exists()) {
                        String strSerializer3 = dimensionResource.serializer(strSerializer2, str);
                        if (TextUtils.isEmpty(strSerializer3) || !strSerializer3.equals(strRemoteActionCompatParcelizer)) {
                            if (file.getParentFile().delete()) {
                                WrappedCompositionsetContent1211.read("TileStoreManager", "Failed to delete the file.");
                            }
                        }
                    }
                    if (LW.serializer(strSerializer2, strSerializer, str, strRemoteActionCompatParcelizer) && !integerResource.write(strSerializer2, str2, file.getName().replace(".zip", ""))) {
                        WrappedCompositionsetContent1211.read("TileStoreManager", "Failed to unzip the adminJson file.");
                    }
                }
                WrappedCompositionsetContent1211.read();
            }
        }
    }

    static {
        String str;
        try {
            str = placeAtf8xVGno.read().getCacheDir().getCanonicalPath() + File.separator;
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("FileUtils", "Failed to obtain the store dir path.");
            str = null;
        }
        write = str;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, "CityAdmin");
        String str2 = File.separator;
        sbM.append(str2);
        RemoteActionCompatParcelizer = sbM.toString();
        serializer = af$$ExternalSyntheticOutline0.m(str, "CityInfo", str2);
        RatingCompat = af$$ExternalSyntheticOutline0.m(str, "TileList", str2);
        IconCompatParcelizer = 0.0d;
        read = 0.0d;
    }

    public final prune IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(write)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "store dir is empty");
            return new prune(3, 0, null);
        }
        if (TextUtils.isEmpty(MediaDescriptionCompat)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "Failed to get tile,currCityCode is empty");
            return new prune(3, 0, null);
        }
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = serializer(MediaDescriptionCompat);
        }
        ImageVectorCache imageVectorCache = this.MediaSessionCompatQueueItem;
        if (imageVectorCache == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "Failed to get tile,cityInfo cache is null");
            String str2 = MediaDescriptionCompat;
            synchronized (this) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "get cityInfo form cloud");
                onCreateActionMode.write.IconCompatParcelizer(new getImageVector(this, str2));
            }
            return new prune(2, 0, null);
        }
        fontResourceFromContext fontresourcefromcontext = read(str, imageVectorCache.write());
        if (fontresourcefromcontext == null) {
            WrappedCompositionsetContent1211.read();
            return new prune(3, 0, null);
        }
        String strRemoteActionCompatParcelizer = fontresourcefromcontext.RemoteActionCompatParcelizer();
        String str3 = RatingCompat;
        String strSerializer = integerResource.serializer(str3, strRemoteActionCompatParcelizer);
        String strWrite = fontresourcefromcontext.write();
        String strSerializer2 = fontresourcefromcontext.serializer();
        if (TextUtils.isEmpty(strSerializer)) {
            WrappedCompositionsetContent1211.read();
            return new prune(3, 0, null);
        }
        File file = new File(strSerializer);
        if (!file.exists()) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "tile zip file does not exist");
            if (painterResource.serializer() >= this.MediaSessionCompatToken) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "The maximum number of downloads per day is exceeded.");
            } else {
                painterResource.read();
                integerResource.IconCompatParcelizer(this.MediaMetadataCompat, str3);
                onCreateActionMode.write.IconCompatParcelizer(new ImageVectorCacheImageVectorEntry(0, strSerializer, strRemoteActionCompatParcelizer, strWrite, strSerializer2, false));
            }
            return new prune(2, 0, null);
        }
        String strSerializer3 = dimensionResource.serializer(strSerializer, strWrite);
        if (!TextUtils.isEmpty(strSerializer3) && strSerializer3.equals(strSerializer2)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "get tilePath success from the tileStore.");
            return new prune(1, 0, strSerializer);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "The signature information is incorrect.");
        if (file.delete()) {
            WrappedCompositionsetContent1211.read("TileStoreManager", "Failed to delete the file.");
        }
        if (painterResource.serializer() >= this.MediaSessionCompatToken) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "The maximum number of downloads per day is exceeded.");
        } else {
            painterResource.read();
            integerResource.IconCompatParcelizer(this.MediaMetadataCompat, str3);
            onCreateActionMode.write.IconCompatParcelizer(new ImageVectorCacheImageVectorEntry(0, strSerializer, strRemoteActionCompatParcelizer, strWrite, strSerializer2, false));
        }
        return new prune(2, 0, null);
    }

    public getTheme(int i, int i2) {
        this.MediaSessionCompatToken = 25;
        this.MediaMetadataCompat = 30;
        if (i > 0) {
            this.MediaSessionCompatToken = i;
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "tileDailyMaxNum is Invalid.");
        }
        if (i2 > 0) {
            this.MediaMetadataCompat = i2;
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "storeFileMaxNum is Invalid.");
        }
    }

    public static ImageVectorCache serializer(String str) {
        String str2;
        File file = new File(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), serializer, str));
        if (!file.exists() || System.currentTimeMillis() - file.lastModified() >= 604800000) {
            return null;
        }
        try {
            return (ImageVectorCache) new Gson().fromJson(integerResource.IconCompatParcelizer(file.getCanonicalPath()), new loadImageBitmapResource().getType());
        } catch (JsonSyntaxException unused) {
            str2 = "json syntax error";
            WrappedCompositionsetContent1211.read("TileStoreManager", str2);
            return null;
        } catch (IOException unused2) {
            str2 = "Invalid file path";
            WrappedCompositionsetContent1211.read("TileStoreManager", str2);
            return null;
        }
    }

    public static fontResourceFromContext read(String str, List list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fontResourceFromContext fontresourcefromcontext = (fontResourceFromContext) it.next();
            if (fontresourcefromcontext != null) {
                String strRemoteActionCompatParcelizer = fontresourcefromcontext.RemoteActionCompatParcelizer();
                if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                    continue;
                } else {
                    if (strRemoteActionCompatParcelizer.endsWith(str + ".zip")) {
                        return fontresourcefromcontext;
                    }
                }
            }
        }
        return null;
    }
}
