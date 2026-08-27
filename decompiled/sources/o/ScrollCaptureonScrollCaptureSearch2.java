package o;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScrollCaptureonScrollCaptureSearch2 {
    public static String write(String str) {
        if (TextUtils.isEmpty(str)) {
            Pattern pattern = mapOffsetToViewport.read;
            if (TextUtils.isEmpty("url is null")) {
                return str;
            }
            mapOffsetToViewport.serializer("url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            mapOffsetToViewport.read("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e) {
            mapOffsetToViewport.read("UriUtil", "getHostByURI error  MalformedURLException : " + e.getMessage());
            return "";
        }
    }
}
