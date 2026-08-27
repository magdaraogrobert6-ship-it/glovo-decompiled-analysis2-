package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.io.File;
import java.net.ProtocolException;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class getLowestValueslo4al4 {
    /* JADX WARN: Code duplicated, block: B:245:0x0332  */
    public static String IconCompatParcelizer(String str) {
        String strGuessContentTypeFromName;
        if (str != null) {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                byte b = 46;
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            b = !lowerCase.equals("gz") ? (byte) -1 : (byte) 0;
                            break;
                        case 3401:
                            b = !lowerCase.equals("js") ? (byte) -1 : (byte) 1;
                            break;
                        case 97669:
                            b = !lowerCase.equals("bmp") ? (byte) -1 : (byte) 2;
                            break;
                        case 98819:
                            b = !lowerCase.equals("css") ? (byte) -1 : (byte) 3;
                            break;
                        case 102340:
                            b = !lowerCase.equals("gif") ? (byte) -1 : (byte) 4;
                            break;
                        case 103649:
                            b = !lowerCase.equals("htm") ? (byte) -1 : (byte) 5;
                            break;
                        case 104085:
                            b = !lowerCase.equals("ico") ? (byte) -1 : (byte) 6;
                            break;
                        case 105441:
                            b = !lowerCase.equals("jpg") ? (byte) -1 : (byte) 7;
                            break;
                        case 106458:
                            b = !lowerCase.equals("m4a") ? (byte) -1 : (byte) 8;
                            break;
                        case 106479:
                            b = !lowerCase.equals("m4v") ? (byte) -1 : (byte) 9;
                            break;
                        case 108089:
                            b = !lowerCase.equals("mht") ? (byte) -1 : (byte) 10;
                            break;
                        case 108150:
                            b = !lowerCase.equals("mjs") ? (byte) -1 : (byte) 11;
                            break;
                        case 108272:
                            b = !lowerCase.equals("mp3") ? (byte) -1 : (byte) 12;
                            break;
                        case 108273:
                            b = !lowerCase.equals("mp4") ? (byte) -1 : (byte) 13;
                            break;
                        case 108324:
                            b = !lowerCase.equals("mpg") ? (byte) -1 : (byte) 14;
                            break;
                        case 109961:
                            b = !lowerCase.equals("oga") ? (byte) -1 : (byte) 15;
                            break;
                        case 109967:
                            b = !lowerCase.equals("ogg") ? (byte) -1 : (byte) 16;
                            break;
                        case 109973:
                            b = !lowerCase.equals("ogm") ? (byte) -1 : (byte) 17;
                            break;
                        case 109982:
                            b = !lowerCase.equals("ogv") ? (byte) -1 : (byte) 18;
                            break;
                        case 110834:
                            b = !lowerCase.equals("pdf") ? (byte) -1 : (byte) 19;
                            break;
                        case 111030:
                            b = !lowerCase.equals("pjp") ? (byte) -1 : (byte) 20;
                            break;
                        case 111145:
                            b = !lowerCase.equals("png") ? (byte) -1 : (byte) 21;
                            break;
                        case 114276:
                            b = !lowerCase.equals("svg") ? (byte) -1 : (byte) 22;
                            break;
                        case 114791:
                            b = !lowerCase.equals("tgz") ? (byte) -1 : (byte) 23;
                            break;
                        case 114833:
                            b = !lowerCase.equals("tif") ? (byte) -1 : (byte) 24;
                            break;
                        case 117484:
                            b = !lowerCase.equals("wav") ? (byte) -1 : (byte) 25;
                            break;
                        case 118660:
                            b = !lowerCase.equals("xht") ? (byte) -1 : (byte) 26;
                            break;
                        case 118807:
                            b = !lowerCase.equals("xml") ? (byte) -1 : (byte) 27;
                            break;
                        case 120609:
                            b = !lowerCase.equals("zip") ? (byte) -1 : (byte) 28;
                            break;
                        case 3000872:
                            b = !lowerCase.equals("apng") ? (byte) -1 : (byte) 29;
                            break;
                        case 3145576:
                            b = !lowerCase.equals("flac") ? (byte) -1 : (byte) 30;
                            break;
                        case 3213227:
                            b = !lowerCase.equals(com.braze.models.Banner.HTML) ? (byte) -1 : (byte) 31;
                            break;
                        case 3259225:
                            b = !lowerCase.equals("jfif") ? (byte) -1 : (byte) 32;
                            break;
                        case 3268712:
                            b = !lowerCase.equals("jpeg") ? (byte) -1 : (byte) 33;
                            break;
                        case 3271912:
                            b = !lowerCase.equals("json") ? (byte) -1 : (byte) 34;
                            break;
                        case 3358085:
                            b = !lowerCase.equals("mpeg") ? (byte) -1 : (byte) 35;
                            break;
                        case 3418175:
                            b = !lowerCase.equals("opus") ? (byte) -1 : (byte) 36;
                            break;
                        case 3529614:
                            b = !lowerCase.equals("shtm") ? (byte) -1 : (byte) 37;
                            break;
                        case 3542678:
                            b = !lowerCase.equals("svgz") ? (byte) -1 : (byte) 38;
                            break;
                        case 3559925:
                            b = !lowerCase.equals("tiff") ? (byte) -1 : (byte) 39;
                            break;
                        case 3642020:
                            b = !lowerCase.equals("wasm") ? (byte) -1 : (byte) 40;
                            break;
                        case 3645337:
                            b = !lowerCase.equals("webm") ? (byte) -1 : (byte) 41;
                            break;
                        case 3645340:
                            b = !lowerCase.equals("webp") ? (byte) -1 : (byte) 42;
                            break;
                        case 3655064:
                            b = !lowerCase.equals("woff") ? (byte) -1 : (byte) 43;
                            break;
                        case 3678569:
                            b = !lowerCase.equals("xhtm") ? (byte) -1 : (byte) 44;
                            break;
                        case 96488848:
                            b = !lowerCase.equals("ehtml") ? (byte) -1 : (byte) 45;
                            break;
                        case 103877016:
                            if (!lowerCase.equals("mhtml")) {
                                b = -1;
                            }
                            break;
                        case 106703064:
                            b = !lowerCase.equals("pjpeg") ? (byte) -1 : (byte) 47;
                            break;
                        case 109418142:
                            b = !lowerCase.equals("shtml") ? (byte) -1 : (byte) 48;
                            break;
                        case 114035747:
                            b = !lowerCase.equals("xhtml") ? (byte) -1 : (byte) 49;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                        case 23:
                            strGuessContentTypeFromName = "application/gzip";
                            break;
                        case 1:
                        case 11:
                            strGuessContentTypeFromName = "text/javascript";
                            break;
                        case 2:
                            strGuessContentTypeFromName = "image/bmp";
                            break;
                        case 3:
                            strGuessContentTypeFromName = "text/css";
                            break;
                        case 4:
                            strGuessContentTypeFromName = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case 37:
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            strGuessContentTypeFromName = "text/html";
                            break;
                        case 6:
                            strGuessContentTypeFromName = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case 32:
                        case 33:
                        case 47:
                            strGuessContentTypeFromName = "image/jpeg";
                            break;
                        case 8:
                            strGuessContentTypeFromName = "audio/x-m4a";
                            break;
                        case 9:
                        case 13:
                            strGuessContentTypeFromName = "video/mp4";
                            break;
                        case 10:
                        case 46:
                            strGuessContentTypeFromName = "multipart/related";
                            break;
                        case 12:
                            strGuessContentTypeFromName = "audio/mpeg";
                            break;
                        case 14:
                        case 35:
                            strGuessContentTypeFromName = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            strGuessContentTypeFromName = "audio/ogg";
                            break;
                        case 17:
                        case 18:
                            strGuessContentTypeFromName = "video/ogg";
                            break;
                        case 19:
                            strGuessContentTypeFromName = "application/pdf";
                            break;
                        case 21:
                            strGuessContentTypeFromName = "image/png";
                            break;
                        case 22:
                        case 38:
                            strGuessContentTypeFromName = "image/svg+xml";
                            break;
                        case 24:
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            strGuessContentTypeFromName = "image/tiff";
                            break;
                        case 25:
                            strGuessContentTypeFromName = "audio/wav";
                            break;
                        case 26:
                        case 44:
                        case 49:
                            strGuessContentTypeFromName = "application/xhtml+xml";
                            break;
                        case 27:
                            strGuessContentTypeFromName = "text/xml";
                            break;
                        case 28:
                            strGuessContentTypeFromName = "application/zip";
                            break;
                        case 29:
                            strGuessContentTypeFromName = "image/apng";
                            break;
                        case 30:
                            strGuessContentTypeFromName = "audio/flac";
                            break;
                        case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            strGuessContentTypeFromName = ConstantKt.CONTENT_TYPE_JSON;
                            break;
                        case 40:
                            strGuessContentTypeFromName = "application/wasm";
                            break;
                        case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            strGuessContentTypeFromName = "video/webm";
                            break;
                        case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            strGuessContentTypeFromName = "image/webp";
                            break;
                        case 43:
                            strGuessContentTypeFromName = "application/font-woff";
                            break;
                        default:
                            strGuessContentTypeFromName = null;
                            break;
                    }
                } else {
                    strGuessContentTypeFromName = null;
                }
            }
        } else {
            strGuessContentTypeFromName = null;
        }
        return strGuessContentTypeFromName == null ? "text/plain" : strGuessContentTypeFromName;
    }

    public static String IconCompatParcelizer(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public static void serializer(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, byte b) {
        int i = 0;
        switch (b) {
            case 2:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RatingCompat();
                return;
            case 3:
                r8lambdat7xjd1d4humw0psb7whucfgonss.MediaMetadataCompat();
                return;
            case 4:
                r8lambdat7xjd1d4humw0psb7whucfgonss.MediaDescriptionCompat();
                return;
            case 5:
            case 7:
            case 9:
            default:
                throw new ProtocolException(c8$$ExternalSyntheticOutline0.m(b, "Unrecognized TType value: "));
            case 6:
                r8lambdat7xjd1d4humw0psb7whucfgonss.PlaybackStateCompatCustomAction();
                return;
            case 8:
                r8lambdat7xjd1d4humw0psb7whucfgonss.MediaSessionCompatToken();
                return;
            case 10:
                r8lambdat7xjd1d4humw0psb7whucfgonss.IconCompatParcelizer();
                return;
            case 11:
                r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer();
                return;
            case 12:
                r8lambdat7xjd1d4humw0psb7whucfgonss.getClass();
                while (true) {
                    byte b2 = r8lambdat7xjd1d4humw0psb7whucfgonss.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer;
                    if (b2 == 0) {
                        return;
                    } else {
                        serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, b2);
                    }
                }
                break;
            case 13:
                r8lambdaRyq9c2fWEfs8F701EGgjnBMwcCU r8lambdaryq9c2fwefs8f701eggjnbmwccuWrite = r8lambdat7xjd1d4humw0psb7whucfgonss.write();
                while (i < r8lambdaryq9c2fwefs8f701eggjnbmwccuWrite.RemoteActionCompatParcelizer) {
                    serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaryq9c2fwefs8f701eggjnbmwccuWrite.IconCompatParcelizer);
                    serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdaryq9c2fwefs8f701eggjnbmwccuWrite.write);
                    i++;
                }
                return;
            case 14:
                r8lambdaSaVhNzq8s6PrBUxqZ34fD7SKtgs r8lambdasavhnzq8s6prbuxqz34fd7sktgsSerializer = r8lambdat7xjd1d4humw0psb7whucfgonss.serializer();
                while (i < r8lambdasavhnzq8s6prbuxqz34fd7sktgsSerializer.read) {
                    serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdasavhnzq8s6prbuxqz34fd7sktgsSerializer.serializer);
                    i++;
                }
                return;
            case 15:
                r8lambdaSaVhNzq8s6PrBUxqZ34fD7SKtgs r8lambdasavhnzq8s6prbuxqz34fd7sktgs = r8lambdat7xjd1d4humw0psb7whucfgonss.read();
                while (i < r8lambdasavhnzq8s6prbuxqz34fd7sktgs.read) {
                    serializer(r8lambdat7xjd1d4humw0psb7whucfgonss, r8lambdasavhnzq8s6prbuxqz34fd7sktgs.serializer);
                    i++;
                }
                return;
        }
    }
}
