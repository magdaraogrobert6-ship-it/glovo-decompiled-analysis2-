package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.ReversedListReadOnly;

/* JADX INFO: loaded from: classes3.dex */
public final class withBulletListo2QH7mI {
    public static final getInAppMessageEventMap IconCompatParcelizer;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem = 1;
    public static final getInAppMessageEventMap RemoteActionCompatParcelizer;
    public static final getInAppMessageEventMap read;
    public static final getInAppMessageEventMap serializer;
    public static final getInAppMessageEventMap write;

    static {
        registerInAppMessageManager registerinappmessagemanager = registerInAppMessageManager.IGNORE_CASE;
        serializer = new getInAppMessageEventMap("<script\\b", registerinappmessagemanager);
        read = new getInAppMessageEventMap("<script\\b[^>]*(?<![\\w-])src\\s*=[^>]*>", registerinappmessagemanager);
        IconCompatParcelizer = new getInAppMessageEventMap("<link\\b(?=[^>]*(?<![\\w-])rel\\s*=\\s*[\"'][^\"']*\\bstylesheet\\b[^\"']*[\"'])[^>]*(?<![\\w-])href\\s*=[^>]*>", registerinappmessagemanager);
        write = new getInAppMessageEventMap("(?<![\\w-])src\\s*=\\s*[\"']([^\"']*)[\"']", registerinappmessagemanager);
        RemoteActionCompatParcelizer = new getInAppMessageEventMap("(?<![\\w-])href\\s*=\\s*[\"']([^\"']*)[\"']", registerinappmessagemanager);
        int i = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String write(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("\"", setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(str, "\\", "\\\\"), "\"", "\\\""), "<", "\\u003c"), "\"");
        int i4 = MediaBrowserCompatMediaItem + 105;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public static String read(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = MediaBrowserCompatMediaItem + 71;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = i4 >> 4;
                String strSubstring = str.substring(i6, i6 % 4);
                TuplesKt.RemoteActionCompatParcelizer(71);
                bArr[i4] = (byte) Integer.parseInt(strSubstring, 25);
                i4 += 51;
            } else {
                int i7 = i4 * 2;
                String strSubstring2 = str.substring(i7, i7 + 2);
                TuplesKt.RemoteActionCompatParcelizer(16);
                bArr[i4] = (byte) Integer.parseInt(strSubstring2, 16);
                i4++;
            }
        }
        String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public final byte[] write(getDefaultSizeXSAIIZE getdefaultsizexsaiize, final androidx.lifecycle.BlockRunner blockRunner, final String str) {
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7Serializer;
        int i = 2 % 2;
        blockRunner.getClass();
        str.getClass();
        File fileWrite = getdefaultsizexsaiize.write();
        Charset charsetForName = Charset.forName("utf-8");
        charsetForName.getClass();
        String strWrite = r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(fileWrite, charsetForName);
        final int i2 = 1;
        final int i3 = 0;
        String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(blockRunner.IconCompatParcelizer(), '/');
        Object obj = null;
        if (strIconCompatParcelizer.length() <= 0) {
            strIconCompatParcelizer = null;
        }
        if (strIconCompatParcelizer != null) {
            int i4 = MediaSessionCompatQueueItem + 61;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                strWrite = setCarryoverInAppMessage.write(strWrite, strIconCompatParcelizer, str);
                int i5 = 62 / 0;
            } else {
                strWrite = setCarryoverInAppMessage.write(strWrite, strIconCompatParcelizer, str);
            }
        }
        String strIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer(((LinkedHashMap) blockRunner.write()).entrySet(), ",", "{", "}", new accessgetTextCentercp(8, this), 24);
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strWrite, (CharSequence) "data-native-cache-inject=\"1\"", false)) {
            int i6 = MediaBrowserCompatMediaItem + 47;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = getInAppMessageEventMap.read(serializer, strWrite);
            if (getiscurrentlydisplayinginappmessage != null && (ensuresubscribedtoinappmessageeventslambda7Serializer = getiscurrentlydisplayinginappmessage.serializer()) != null) {
                int i7 = ensuresubscribedtoinappmessageeventslambda7Serializer.write;
                strWrite = af$$ExternalSyntheticOutline0.m(strWrite.substring(0, i7), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("<script data-native-cache-inject=\"1\">window.NATIVE_CACHE_LOCALHOST_BASE=\"", str, "/\";window.NATIVE_CACHE_SRI=", strIconCompatParcelizer2, ";</script>"), strWrite.substring(i7));
            }
        }
        String strSerializer = IconCompatParcelizer.serializer(read.serializer(strWrite, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.pushStyle
            private static int IconCompatParcelizer = 1;
            private static int serializer;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj2) {
                int i8 = 2 % 2;
                int i9 = serializer + 39;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = i3;
                String str2 = str;
                androidx.lifecycle.BlockRunner blockRunner2 = blockRunner;
                getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage2 = (getIsCurrentlyDisplayingInAppMessage) obj2;
                if (i11 != 0) {
                    getiscurrentlydisplayinginappmessage2.getClass();
                    return withBulletListo2QH7mI.serializer(getiscurrentlydisplayinginappmessage2.write(), withBulletListo2QH7mI.RemoteActionCompatParcelizer, blockRunner2, str2);
                }
                getiscurrentlydisplayinginappmessage2.getClass();
                String strSerializer2 = withBulletListo2QH7mI.serializer(getiscurrentlydisplayinginappmessage2.write(), withBulletListo2QH7mI.write, blockRunner2, str2);
                int i12 = IconCompatParcelizer + 59;
                serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return strSerializer2;
            }
        }), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: o.pushStyle
            private static int IconCompatParcelizer = 1;
            private static int serializer;

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj2) {
                int i8 = 2 % 2;
                int i9 = serializer + 39;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = i2;
                String str2 = str;
                androidx.lifecycle.BlockRunner blockRunner2 = blockRunner;
                getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage2 = (getIsCurrentlyDisplayingInAppMessage) obj2;
                if (i11 != 0) {
                    getiscurrentlydisplayinginappmessage2.getClass();
                    return withBulletListo2QH7mI.serializer(getiscurrentlydisplayinginappmessage2.write(), withBulletListo2QH7mI.RemoteActionCompatParcelizer, blockRunner2, str2);
                }
                getiscurrentlydisplayinginappmessage2.getClass();
                String strSerializer2 = withBulletListo2QH7mI.serializer(getiscurrentlydisplayinginappmessage2.write(), withBulletListo2QH7mI.write, blockRunner2, str2);
                int i12 = IconCompatParcelizer + 59;
                serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return strSerializer2;
            }
        });
        Charset charsetForName2 = Charset.forName("utf-8");
        charsetForName2.getClass();
        byte[] bytes = strSerializer.getBytes(charsetForName2);
        bytes.getClass();
        return bytes;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    public static String serializer(String str, getInAppMessageEventMap getinappmessageeventmap, androidx.lifecycle.BlockRunner blockRunner, String str2) {
        String str3;
        String str4;
        String string;
        String str5;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "integrity=", false)) {
                return str;
            }
        } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "integrity=", true)) {
            return str;
        }
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = getInAppMessageEventMap.read(getinappmessageeventmap, str);
        if (getiscurrentlydisplayinginappmessage == null || (str3 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage.IconCompatParcelizer()).get(1)) == null) {
            return str;
        }
        if (!(!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, str2, false))) {
            str4 = hideCurrentlyDisplayingInAppMessage.read(hideCurrentlyDisplayingInAppMessage.write(str3, str2), '/');
        } else if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "http", false)) {
            str4 = null;
        } else {
            int i3 = MediaBrowserCompatMediaItem + 111;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0 ? setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "//", false) : setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "//", true)) {
                str4 = null;
            } else if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str3, "data:", false)) {
                str4 = null;
            } else {
                str4 = hideCurrentlyDisplayingInAppMessage.read(str3, '/');
            }
        }
        if (str4 == null) {
            return str;
        }
        getDefaultSizeXSAIIZE getdefaultsizexsaiize = (getDefaultSizeXSAIIZE) ((LinkedHashMap) blockRunner.write()).get(str4);
        if (getdefaultsizexsaiize == null) {
            int i4 = MediaSessionCompatQueueItem + 15;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }
        String strConcat = "sha256-".concat(read(getdefaultsizexsaiize.read()));
        boolean z = setCarryoverInAppMessage.read(str, "/>", false);
        if (z) {
            string = hideCurrentlyDisplayingInAppMessage.read(hideCurrentlyDisplayingInAppMessage.read(2, str)).toString();
        } else {
            string = hideCurrentlyDisplayingInAppMessage.read(1, str);
        }
        if (z) {
            str5 = " />";
        } else {
            str5 = ">";
        }
        String str6 = string + " integrity=\"" + strConcat + "\" crossorigin=\"anonymous\"" + str5;
        int i5 = MediaBrowserCompatMediaItem + 83;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str6;
    }
}
