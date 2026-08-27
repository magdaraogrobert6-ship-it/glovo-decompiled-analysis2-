package o;

import android.net.Uri;
import android.text.TextUtils;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class WrappedCompositionsetContent12 {
    public String IconCompatParcelizer;
    public TreeMap MediaBrowserCompatMediaItem;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public byte[] RemoteActionCompatParcelizer;
    public final String read;
    public final /* synthetic */ int serializer;
    public com.airbnb.lottie.PerformanceTracker write;

    public WrappedCompositionsetContent12(WrappedCompositionsetContent12 wrappedCompositionsetContent12) {
        this.serializer = 0;
        String str = wrappedCompositionsetContent12.MediaMetadataCompat;
        this.read = str;
        this.write = wrappedCompositionsetContent12.write;
        this.RemoteActionCompatParcelizer = wrappedCompositionsetContent12.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = wrappedCompositionsetContent12.IconCompatParcelizer;
        this.IconCompatParcelizer = wrappedCompositionsetContent12.RatingCompat;
        String str2 = wrappedCompositionsetContent12.read;
        this.RatingCompat = str2;
        this.MediaBrowserCompatMediaItem = wrappedCompositionsetContent12.MediaBrowserCompatMediaItem;
        if (str2.contains("?")) {
            if (this.MediaBrowserCompatMediaItem == null) {
                this.MediaBrowserCompatMediaItem = new TreeMap();
            }
            try {
                String strDecode = str + this.RatingCompat;
                try {
                    strDecode = URLDecoder.decode(strDecode, com.adjust.sdk.Constants.ENCODING);
                } catch (Exception unused) {
                }
                URI uriCreate = URI.create(strDecode);
                String query = uriCreate.getQuery();
                if (query == null) {
                    return;
                }
                this.read = uriCreate.getScheme() + "://" + uriCreate.getHost();
                this.RatingCompat = uriCreate.getPath();
                String[] strArrSplit = query.split(ContainerUtils.FIELD_DELIMITER);
                int length = strArrSplit.length;
                for (int i = 0; i < length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (strArrSplit2.length == 2) {
                        this.MediaBrowserCompatMediaItem.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                }
            } catch (IllegalArgumentException unused2) {
                WrappedCompositionsetContent1211.read("BaseRequest", "parse query failed");
            }
        }
    }

    public WrappedCompositionsetContent12 IconCompatParcelizer() {
        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12(this.RatingCompat);
        wrappedCompositionsetContent12.MediaMetadataCompat = this.read;
        byte[] bArr = this.RemoteActionCompatParcelizer;
        String str = this.IconCompatParcelizer;
        wrappedCompositionsetContent12.RemoteActionCompatParcelizer = bArr;
        wrappedCompositionsetContent12.RatingCompat = str;
        wrappedCompositionsetContent12.write = this.write;
        wrappedCompositionsetContent12.IconCompatParcelizer = this.MediaMetadataCompat;
        TreeMap treeMap = this.MediaBrowserCompatMediaItem;
        if (treeMap == null) {
            return wrappedCompositionsetContent12;
        }
        if (wrappedCompositionsetContent12.MediaBrowserCompatMediaItem == null) {
            wrappedCompositionsetContent12.MediaBrowserCompatMediaItem = new TreeMap();
        }
        wrappedCompositionsetContent12.MediaBrowserCompatMediaItem.putAll(treeMap);
        return wrappedCompositionsetContent12;
    }

    public WrappedCompositionsetContent12 RemoteActionCompatParcelizer() {
        if (TextUtils.isEmpty(this.MediaMetadataCompat)) {
            this.MediaMetadataCompat = onChange.IconCompatParcelizer(com.huawei.hms.location.BuildConfig.LIBRARY_PACKAGE_NAME);
        }
        return new WrappedCompositionsetContent12(this);
    }

    public String write() {
        Uri.Builder builderBuildUpon = Uri.parse(this.read).buildUpon();
        if (!TextUtils.isEmpty(this.RatingCompat)) {
            builderBuildUpon.path(this.RatingCompat);
        }
        TreeMap treeMap = this.MediaBrowserCompatMediaItem;
        if (treeMap == null) {
            String string = builderBuildUpon.build().toString();
            try {
                return URLDecoder.decode(string, com.adjust.sdk.Constants.ENCODING);
            } catch (Exception unused) {
                return string;
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string2 = builderBuildUpon.build().toString();
        try {
            return URLDecoder.decode(string2, com.adjust.sdk.Constants.ENCODING);
        } catch (Exception unused2) {
            return string2;
        }
    }

    public String toString() {
        if (this.serializer != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("BaseRequest{method='");
        sb.append(this.MediaMetadataCompat);
        sb.append("', baseUrl='");
        sb.append(this.read);
        sb.append("', path='");
        sb.append(this.RatingCompat);
        sb.append("', heads=");
        sb.append(this.write);
        sb.append(", contentType='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', body=");
        return ff$$ExternalSyntheticOutline0.m(sb, new String(this.RemoteActionCompatParcelizer, StandardCharsets.UTF_8), '}');
    }

    public void write(String str, String str2) {
        if (this.write == null) {
            this.write = new com.airbnb.lottie.PerformanceTracker(4);
        }
        com.airbnb.lottie.PerformanceTracker performanceTracker = this.write;
        performanceTracker.getClass();
        if (str2 != null) {
            performanceTracker.IconCompatParcelizer.put(str, str2);
        }
    }

    public WrappedCompositionsetContent12(String str) {
        this.serializer = 1;
        this.IconCompatParcelizer = "POST";
        this.read = str;
    }
}
