package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class createAppropriateViews {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public final /* synthetic */ int serializer;
    public Object write;

    public createAppropriateViews() {
        this.serializer = 0;
        this.MediaBrowserCompatMediaItem = "";
        this.write = "";
        this.MediaDescriptionCompat = -1;
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        this.RemoteActionCompatParcelizer = (ArrayList) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{""}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
    }

    public static ArrayList IconCompatParcelizer(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '&', i, false, 4);
            if (iWrite == -1) {
                iWrite = str.length();
            }
            int iWrite2 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '=', i, false, 4);
            if (iWrite2 == -1 || iWrite2 > iWrite) {
                arrayList.add(str.substring(i, iWrite));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iWrite2));
                arrayList.add(str.substring(iWrite2 + 1, iWrite));
            }
            i = iWrite + 1;
        }
        return arrayList;
    }

    public void write(String str, String str2) {
        str.getClass();
        if (((ArrayList) this.read) == null) {
            this.read = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.read;
        arrayList.getClass();
        arrayList.add(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList2 = (ArrayList) this.read;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str2, 0, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }

    public setInAppMessageImageViewAttributes RemoteActionCompatParcelizer() {
        ArrayList arrayList;
        String str = this.MediaMetadataCompat;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("scheme == null");
            return null;
        }
        String strSerializer = setHeightOnViewLayoutParams.serializer((String) this.MediaBrowserCompatMediaItem, 0, 0, 7);
        String strSerializer2 = setHeightOnViewLayoutParams.serializer((String) this.write, 0, 0, 7);
        String str2 = (String) this.RatingCompat;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("host == null");
            return null;
        }
        int i = read();
        ArrayList arrayList2 = (ArrayList) this.RemoteActionCompatParcelizer;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(setHeightOnViewLayoutParams.serializer((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.read;
        if (arrayList4 != null) {
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? setHeightOnViewLayoutParams.serializer(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.IconCompatParcelizer;
        return new setInAppMessageImageViewAttributes(str, strSerializer, strSerializer2, str2, i, arrayList3, arrayList, str4 != null ? setHeightOnViewLayoutParams.serializer(str4, 0, 0, 7) : null, toString());
    }

    public void RemoteActionCompatParcelizer(String str) {
        str.getClass();
        String strWrite = setupDirectionalNavigationlambda0.write(setHeightOnViewLayoutParams.serializer(str, 0, 0, 7));
        if (strWrite != null) {
            this.RatingCompat = strWrite;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unexpected host: ".concat(str));
        }
    }

    public void read(String str) {
        str.getClass();
        if (str.equalsIgnoreCase("http")) {
            this.MediaMetadataCompat = "http";
        } else if (str.equalsIgnoreCase(com.adjust.sdk.Constants.SCHEME)) {
            this.MediaMetadataCompat = com.adjust.sdk.Constants.SCHEME;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    public String toString() {
        if (this.serializer != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        String str = this.MediaMetadataCompat;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (((String) this.MediaBrowserCompatMediaItem).length() > 0 || ((String) this.write).length() > 0) {
            sb.append((String) this.MediaBrowserCompatMediaItem);
            if (((String) this.write).length() > 0) {
                sb.append(':');
                sb.append((String) this.write);
            }
            sb.append('@');
        }
        String str2 = (String) this.RatingCompat;
        if (str2 != null) {
            if (hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2, ':')) {
                sb.append('[');
                sb.append((String) this.RatingCompat);
                sb.append(']');
            } else {
                sb.append((String) this.RatingCompat);
            }
        }
        int i = -1;
        if (this.MediaDescriptionCompat != -1 || this.MediaMetadataCompat != null) {
            int i2 = read();
            String str3 = this.MediaMetadataCompat;
            if (str3 == null) {
                sb.append(':');
                sb.append(i2);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals(com.adjust.sdk.Constants.SCHEME)) {
                    i = 443;
                }
                if (i2 != i) {
                    sb.append(':');
                    sb.append(i2);
                }
            }
        }
        ArrayList arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((String) arrayList.get(i3));
        }
        if (((ArrayList) this.read) != null) {
            sb.append('?');
            ArrayList arrayList2 = (ArrayList) this.read;
            arrayList2.getClass();
            getLongEdge.RemoteActionCompatParcelizer(arrayList2, sb);
        }
        if (((String) this.IconCompatParcelizer) != null) {
            sb.append('#');
            sb.append((String) this.IconCompatParcelizer);
        }
        return sb.toString();
    }

    public int read() {
        int i = this.MediaDescriptionCompat;
        if (i != -1) {
            return i;
        }
        String str = this.MediaMetadataCompat;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(com.adjust.sdk.Constants.SCHEME) ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01db  */
    /* JADX WARN: Code duplicated, block: B:106:0x01df  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:123:0x0211  */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:131:0x023a  */
    /* JADX WARN: Code duplicated, block: B:132:0x023d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0243  */
    /* JADX WARN: Code duplicated, block: B:135:0x0246  */
    /* JADX WARN: Code duplicated, block: B:139:0x024f  */
    /* JADX WARN: Code duplicated, block: B:192:0x033f  */
    /* JADX WARN: Code duplicated, block: B:232:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x01f0 A[EDGE_INSN: B:233:0x01f0->B:114:0x01f0 BREAK  A[LOOP:4: B:101:0x01d1->B:112:0x01ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x01ed A[EDGE_INSN: B:235:0x01ed->B:112:0x01ed BREAK  A[LOOP:5: B:108:0x01e2->B:237:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    public void read(setInAppMessageImageViewAttributes setinappmessageimageviewattributes, String str) {
        int i;
        int i2;
        int iWrite;
        byte bCharAt;
        int i3;
        int i4;
        String str2;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        ArrayList arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
        str.getClass();
        byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
        int iSerializer = InAppMessageHtmlBaseViewCompanion.serializer(0, str.length(), str);
        int iRemoteActionCompatParcelizer = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer, str.length(), str);
        byte b = -1;
        if (iRemoteActionCompatParcelizer - iSerializer < 2) {
            i = -1;
            break;
        }
        char cCharAt3 = str.charAt(iSerializer);
        char c = 'a';
        if ((removeNodeAtDepth.serializer(cCharAt3, 97) < 0 || removeNodeAtDepth.serializer(cCharAt3, 122) > 0) && (removeNodeAtDepth.serializer(cCharAt3, 65) < 0 || removeNodeAtDepth.serializer(cCharAt3, 90) > 0)) {
            i = -1;
            break;
        }
        i = iSerializer + 1;
        while (true) {
            if (i < iRemoteActionCompatParcelizer) {
                char cCharAt4 = str.charAt(i);
                if ((c > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                    if (cCharAt4 != ':') {
                        break;
                    } else {
                        break;
                    }
                } else {
                    i++;
                    c = 'a';
                }
            }
            i = -1;
            break;
        }
        if (i != -1) {
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(iSerializer, str, "https:", true)) {
                this.MediaMetadataCompat = com.adjust.sdk.Constants.SCHEME;
                iSerializer += 6;
            } else if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(iSerializer, str, "http:", true)) {
                this.MediaMetadataCompat = "http";
                iSerializer += 5;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
            }
        } else if (setinappmessageimageviewattributes != null) {
            this.MediaMetadataCompat = setinappmessageimageviewattributes.scheme;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? hideCurrentlyDisplayingInAppMessage.write(6, str).concat("...") : str));
            return;
        }
        int i8 = 0;
        for (int i9 = iSerializer; i9 < iRemoteActionCompatParcelizer && ((cCharAt2 = str.charAt(i9)) == '/' || cCharAt2 == '\\'); i9++) {
            i8++;
        }
        byte b2 = 35;
        if (i8 >= 2 || setinappmessageimageviewattributes == null) {
            i2 = iSerializer + i8;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iWrite = InAppMessageHtmlBaseViewCompanion.write(i2, str, iRemoteActionCompatParcelizer, "@/\\?#");
                if (iWrite != iRemoteActionCompatParcelizer) {
                    bCharAt = str.charAt(iWrite);
                } else {
                    bCharAt = b;
                }
                if (bCharAt != b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (!z) {
                        int iRemoteActionCompatParcelizer2 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(':', i2, iWrite, str);
                        String strRemoteActionCompatParcelizer = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, i2, iRemoteActionCompatParcelizer2, 112, " \"':;<=>@[]^`{}|/\\?#");
                        if (z2) {
                            strRemoteActionCompatParcelizer = d$$ExternalSyntheticOutline0.m(new StringBuilder(), (String) this.MediaBrowserCompatMediaItem, "%40", strRemoteActionCompatParcelizer);
                        }
                        this.MediaBrowserCompatMediaItem = strRemoteActionCompatParcelizer;
                        if (iRemoteActionCompatParcelizer2 != iWrite) {
                            this.write = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, iRemoteActionCompatParcelizer2 + 1, iWrite, 112, " \"':;<=>@[]^`{}|/\\?#");
                            z = true;
                        }
                        z2 = true;
                    } else {
                        this.write = ((String) this.write) + "%40" + setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, i2, iWrite, 112, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i2 = iWrite + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            i3 = i2;
            while (true) {
                if (i3 >= iWrite) {
                    i3 = iWrite;
                    break;
                }
                cCharAt = str.charAt(i3);
                if (cCharAt != ':') {
                    break;
                }
                if (cCharAt != '[') {
                    i7 = 1;
                    do {
                        i3++;
                        if (i3 < iWrite) {
                            break;
                        }
                    } while (str.charAt(i3) != ']');
                } else {
                    i7 = 1;
                }
                i3 += i7;
            }
            i4 = i3 + 1;
            if (i4 < iWrite) {
                this.RatingCompat = setupDirectionalNavigationlambda0.write(setHeightOnViewLayoutParams.serializer(str, i2, i3, 4));
                try {
                    i6 = Integer.parseInt(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, i4, iWrite, 120, ""));
                    if (1 <= i6 || i6 >= 65536) {
                        i6 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.MediaDescriptionCompat = i6;
                if (i6 == -1) {
                    DrawableTransformation.serializer(34, "Invalid URL port: \"", str.substring(i4, iWrite));
                    return;
                }
            } else {
                this.RatingCompat = setupDirectionalNavigationlambda0.write(setHeightOnViewLayoutParams.serializer(str, i2, i3, 4));
                str2 = this.MediaMetadataCompat;
                str2.getClass();
                if (str2.equals("http")) {
                    i5 = 80;
                } else if (str2.equals(com.adjust.sdk.Constants.SCHEME)) {
                    i5 = 443;
                } else {
                    i5 = -1;
                }
                this.MediaDescriptionCompat = i5;
            }
            if (((String) this.RatingCompat) != null) {
                DrawableTransformation.serializer(34, "Invalid URL host: \"", str.substring(i2, i3));
                return;
            }
            iSerializer = iWrite;
        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setinappmessageimageviewattributes.scheme, this.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            this.MediaBrowserCompatMediaItem = setinappmessageimageviewattributes.write();
            this.write = setinappmessageimageviewattributes.serializer();
            this.RatingCompat = setinappmessageimageviewattributes.host;
            this.MediaDescriptionCompat = setinappmessageimageviewattributes.port;
            arrayList.clear();
            arrayList.addAll(setinappmessageimageviewattributes.IconCompatParcelizer());
            if (iSerializer == iRemoteActionCompatParcelizer || str.charAt(iSerializer) == '#') {
                String strRemoteActionCompatParcelizer2 = setinappmessageimageviewattributes.RemoteActionCompatParcelizer();
                this.read = strRemoteActionCompatParcelizer2 != null ? IconCompatParcelizer(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer2, 0, 0, 83, " \"'<>#")) : null;
            }
        } else {
            i2 = iSerializer + i8;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                iWrite = InAppMessageHtmlBaseViewCompanion.write(i2, str, iRemoteActionCompatParcelizer, "@/\\?#");
                if (iWrite != iRemoteActionCompatParcelizer) {
                    bCharAt = str.charAt(iWrite);
                } else {
                    bCharAt = b;
                }
                if (bCharAt != b) {
                    break;
                } else {
                    break;
                }
            }
            i3 = i2;
            while (true) {
                if (i3 >= iWrite) {
                    i3 = iWrite;
                    break;
                }
                cCharAt = str.charAt(i3);
                if (cCharAt != ':') {
                    break;
                    break;
                }
                if (cCharAt != '[') {
                    i7 = 1;
                    do {
                        i3++;
                        if (i3 < iWrite) {
                            break;
                            break;
                        }
                    } while (str.charAt(i3) != ']');
                } else {
                    i7 = 1;
                }
                i3 += i7;
            }
            i4 = i3 + 1;
            if (i4 < iWrite) {
                this.RatingCompat = setupDirectionalNavigationlambda0.write(setHeightOnViewLayoutParams.serializer(str, i2, i3, 4));
                i6 = Integer.parseInt(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, i4, iWrite, 120, ""));
                if (1 <= i6) {
                    i6 = -1;
                } else {
                    i6 = -1;
                }
                this.MediaDescriptionCompat = i6;
                if (i6 == -1) {
                    DrawableTransformation.serializer(34, "Invalid URL port: \"", str.substring(i4, iWrite));
                    return;
                }
            } else {
                this.RatingCompat = setupDirectionalNavigationlambda0.write(setHeightOnViewLayoutParams.serializer(str, i2, i3, 4));
                str2 = this.MediaMetadataCompat;
                str2.getClass();
                if (str2.equals("http")) {
                    i5 = 80;
                } else if (str2.equals(com.adjust.sdk.Constants.SCHEME)) {
                    i5 = 443;
                } else {
                    i5 = -1;
                }
                this.MediaDescriptionCompat = i5;
            }
            if (((String) this.RatingCompat) != null) {
                DrawableTransformation.serializer(34, "Invalid URL host: \"", str.substring(i2, i3));
                return;
            }
            iSerializer = iWrite;
        }
        int iWrite2 = InAppMessageHtmlBaseViewCompanion.write(iSerializer, str, iRemoteActionCompatParcelizer, "?#");
        if (iSerializer != iWrite2) {
            char cCharAt5 = str.charAt(iSerializer);
            if (cCharAt5 != '/' && cCharAt5 != '\\') {
                arrayList.set(arrayList.size() - 1, "");
            } else {
                arrayList.clear();
                arrayList.add("");
                iSerializer++;
            }
            while (iSerializer < iWrite2) {
                int iWrite3 = InAppMessageHtmlBaseViewCompanion.write(iSerializer, str, iWrite2, "/\\");
                boolean z5 = iWrite3 < iWrite2;
                String strRemoteActionCompatParcelizer3 = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, iSerializer, iWrite3, 112, " \"<>^`{}|/\\?#");
                if (!strRemoteActionCompatParcelizer3.equals(".") && !strRemoteActionCompatParcelizer3.equalsIgnoreCase("%2e")) {
                    if (!strRemoteActionCompatParcelizer3.equals("..") && !strRemoteActionCompatParcelizer3.equalsIgnoreCase("%2e.") && !strRemoteActionCompatParcelizer3.equalsIgnoreCase(".%2e") && !strRemoteActionCompatParcelizer3.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) af$$ExternalSyntheticOutline0.m(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strRemoteActionCompatParcelizer3);
                        } else {
                            arrayList.add(strRemoteActionCompatParcelizer3);
                        }
                        if (z5) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() == 0 && !arrayList.isEmpty()) {
                        arrayList.set(arrayList.size() - 1, "");
                    } else {
                        arrayList.add("");
                    }
                }
                iSerializer = z5 ? iWrite3 + 1 : iWrite3;
            }
        }
        if (iWrite2 < iRemoteActionCompatParcelizer && str.charAt(iWrite2) == '?') {
            int iRemoteActionCompatParcelizer3 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer('#', iWrite2, iRemoteActionCompatParcelizer, str);
            this.read = IconCompatParcelizer(setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, iWrite2 + 1, iRemoteActionCompatParcelizer3, 80, " \"'<>#"));
            iWrite2 = iRemoteActionCompatParcelizer3;
        }
        if (iWrite2 >= iRemoteActionCompatParcelizer || str.charAt(iWrite2) != '#') {
            return;
        }
        this.IconCompatParcelizer = setHeightOnViewLayoutParams.RemoteActionCompatParcelizer(str, iWrite2 + 1, iRemoteActionCompatParcelizer, 48, "");
    }

    public createAppropriateViews(InAppMessageHtmlFullView inAppMessageHtmlFullView) {
        this.serializer = 1;
        inAppMessageHtmlFullView.getClass();
        this.MediaBrowserCompatMediaItem = inAppMessageHtmlFullView;
        this.RemoteActionCompatParcelizer = r8lambdap40JoIut3W_3aOBWn5qVBQGamU.REFUSE_INCOMING_STREAMS;
        this.read = InAppMessageWebView.INSTANCE;
    }
}
