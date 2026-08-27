package o;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class setInAppMessageImageViewAttributes {
    public final String fragment;
    public final String host;
    public final String password;
    public final ArrayList pathSegments;
    public final int port;
    public final List queryNamesAndValues;
    public final String scheme;
    public final String url;
    public final String username;

    public final String toString() {
        return this.url;
    }

    public final ArrayList IconCompatParcelizer() {
        int length = this.scheme.length();
        String str = this.url;
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '/', length + 3, false, 4);
        int iWrite2 = InAppMessageHtmlBaseViewCompanion.write(iWrite, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iWrite < iWrite2) {
            int i = iWrite + 1;
            int iRemoteActionCompatParcelizer = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer('/', i, iWrite2, str);
            arrayList.add(str.substring(i, iRemoteActionCompatParcelizer));
            iWrite = iRemoteActionCompatParcelizer;
        }
        return arrayList;
    }

    public final createAppropriateViews MediaDescriptionCompat() {
        int i;
        createAppropriateViews createappropriateviews = new createAppropriateViews();
        ArrayList arrayList = (ArrayList) createappropriateviews.RemoteActionCompatParcelizer;
        String str = this.scheme;
        createappropriateviews.MediaMetadataCompat = str;
        createappropriateviews.MediaBrowserCompatMediaItem = write();
        createappropriateviews.write = serializer();
        createappropriateviews.RatingCompat = this.host;
        str.getClass();
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals(com.adjust.sdk.Constants.SCHEME) ? 443 : -1;
        }
        int i2 = this.port;
        createappropriateviews.MediaDescriptionCompat = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(IconCompatParcelizer());
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        String strSubstring = null;
        createappropriateviews.read = strRemoteActionCompatParcelizer != null ? createAppropriateViews.IconCompatParcelizer(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, 0, 0, 83, " \"'<>#")) : null;
        if (this.fragment != null) {
            String str2 = this.url;
            strSubstring = str2.substring(hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, '#', 0, false, 6) + 1);
        }
        createappropriateviews.IconCompatParcelizer = strSubstring;
        return createappropriateviews;
    }

    public final URL MediaMetadataCompat() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public final String MediaSessionCompatQueueItem() {
        createAppropriateViews createappropriateviews;
        try {
            createappropriateviews = new createAppropriateViews();
            createappropriateviews.read(this, "/...");
        } catch (IllegalArgumentException unused) {
            createappropriateviews = null;
        }
        createappropriateviews.getClass();
        createappropriateviews.MediaBrowserCompatMediaItem = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
        createappropriateviews.write = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer("", 0, 0, 123, " \"':;<=>@[]^`{}|/\\?#");
        return createappropriateviews.RemoteActionCompatParcelizer().url;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String read() {
        int length = this.scheme.length();
        String str = this.url;
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '/', length + 3, false, 4);
        return str.substring(iWrite, InAppMessageHtmlBaseViewCompanion.write(iWrite, str, str.length(), "?#"));
    }

    public final String serializer() {
        if (this.password.length() == 0) {
            return "";
        }
        int length = this.scheme.length();
        String str = this.url;
        return str.substring(hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ':', length + 3, false, 4) + 1, hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '@', 0, false, 6));
    }

    public final String write() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return str.substring(length, InAppMessageHtmlBaseViewCompanion.write(length, str, str.length(), ":@"));
    }

    public setInAppMessageImageViewAttributes(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = arrayList;
        this.queryNamesAndValues = arrayList2;
        this.fragment = str5;
        this.url = str6;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        Object[] objArr = {this.scheme, com.adjust.sdk.Constants.SCHEME};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final URI RatingCompat() {
        String strReplaceAll;
        createAppropriateViews createappropriateviewsMediaDescriptionCompat = MediaDescriptionCompat();
        ArrayList arrayList = (ArrayList) createappropriateviewsMediaDescriptionCompat.RemoteActionCompatParcelizer;
        String str = (String) createappropriateviewsMediaDescriptionCompat.RatingCompat;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        createappropriateviewsMediaDescriptionCompat.RatingCompat = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, setHeightOnViewLayoutParams.RemoteActionCompatParcelizer((String) arrayList.get(i), 0, 0, 99, "[]"));
        }
        ArrayList arrayList2 = (ArrayList) createappropriateviewsMediaDescriptionCompat.read;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str2, 0, 0, 67, "\\^`{|}") : null);
            }
        }
        String str3 = (String) createappropriateviewsMediaDescriptionCompat.IconCompatParcelizer;
        createappropriateviewsMediaDescriptionCompat.IconCompatParcelizer = str3 != null ? setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str3, 0, 0, 35, " \"#<>\\^`{|}") : null;
        String string = createappropriateviewsMediaDescriptionCompat.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                DrawableTransformation.read((Throwable) e);
                return null;
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof setInAppMessageImageViewAttributes) && ((setInAppMessageImageViewAttributes) obj).url.equals(this.url);
    }

    public final String RemoteActionCompatParcelizer() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        String str = this.url;
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '?', 0, false, 6) + 1;
        return str.substring(iWrite, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer('#', iWrite, str.length(), str));
    }
}
