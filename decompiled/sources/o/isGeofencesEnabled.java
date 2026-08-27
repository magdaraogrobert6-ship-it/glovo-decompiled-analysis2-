package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class isGeofencesEnabled {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public ArrayList MediaDescriptionCompat;
    public final ArrayList MediaMetadataCompat;
    public String read;
    public String write = "";
    public String serializer = "";
    public int RemoteActionCompatParcelizer = -1;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.IconCompatParcelizer;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.write.isEmpty() || !this.serializer.isEmpty()) {
            sb.append(this.write);
            if (!this.serializer.isEmpty()) {
                sb.append(':');
                sb.append(this.serializer);
            }
            sb.append('@');
        }
        String str2 = this.read;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.read);
                sb.append(']');
            } else {
                sb.append(this.read);
            }
        }
        int iWrite = this.RemoteActionCompatParcelizer;
        if (iWrite != -1 || this.IconCompatParcelizer != null) {
            if (iWrite == -1) {
                iWrite = isHtmlInAppMessageApplyWindowInsetsEnabled.write(this.IconCompatParcelizer);
            }
            String str3 = this.IconCompatParcelizer;
            if (str3 == null || iWrite != isHtmlInAppMessageApplyWindowInsetsEnabled.write(str3)) {
                sb.append(':');
                sb.append(iWrite);
            }
        }
        ArrayList arrayList = this.MediaMetadataCompat;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.MediaDescriptionCompat != null) {
            sb.append('?');
            ArrayList arrayList2 = this.MediaDescriptionCompat;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2 += 2) {
                String str4 = (String) arrayList2.get(i2);
                String str5 = (String) arrayList2.get(i2 + 1);
                if (i2 > 0) {
                    sb.append('&');
                }
                sb.append(str4);
                if (str5 != null) {
                    sb.append('=');
                    sb.append(str5);
                }
            }
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            sb.append('#');
            sb.append(this.MediaBrowserCompatMediaItem);
        }
        return sb.toString();
    }

    public isGeofencesEnabled() {
        ArrayList arrayList = new ArrayList();
        this.MediaMetadataCompat = arrayList;
        arrayList.add("");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void write(isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled, String str) {
        int i;
        char c;
        char c2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        char c3;
        ArrayList arrayList2;
        char cCharAt;
        boolean z = false;
        int iRemoteActionCompatParcelizer = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(0, str.length(), str);
        int iSerializer = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(iRemoteActionCompatParcelizer, str.length(), str);
        if (iSerializer - iRemoteActionCompatParcelizer >= 2) {
            char cCharAt2 = str.charAt(iRemoteActionCompatParcelizer);
            char c4 = 'Z';
            if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z')) {
                int i7 = iRemoteActionCompatParcelizer;
                while (true) {
                    i7++;
                    if (i7 < iSerializer) {
                        char cCharAt3 = str.charAt(i7);
                        if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= c4) || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            c4 = 'Z';
                        } else if (cCharAt3 == ':') {
                            i = i7;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        if (i != -1) {
            int i8 = i;
            if (str.regionMatches(true, iRemoteActionCompatParcelizer, "https:", 0, 6)) {
                this.IconCompatParcelizer = com.adjust.sdk.Constants.SCHEME;
                iRemoteActionCompatParcelizer += 6;
            } else if (str.regionMatches(true, iRemoteActionCompatParcelizer, "http:", 0, 5)) {
                this.IconCompatParcelizer = "http";
                iRemoteActionCompatParcelizer += 5;
            } else {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Expected URL scheme 'http' or 'https' but was '", str.substring(0, i8), "'");
                return;
            }
        } else if (ishtmlinappmessageapplywindowinsetsenabled != null) {
            this.IconCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled.serializer;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expected URL scheme 'http' or 'https' but no colon was found");
            return;
        }
        int i9 = iRemoteActionCompatParcelizer;
        int i10 = 0;
        while (true) {
            c = '/';
            c2 = '\\';
            if (i9 >= iSerializer || !((cCharAt = str.charAt(i9)) == '\\' || cCharAt == '/')) {
                break;
            }
            i10++;
            i9++;
        }
        ArrayList arrayList3 = this.MediaMetadataCompat;
        char c5 = '?';
        char c6 = '#';
        if (i10 < 2 && ishtmlinappmessageapplywindowinsetsenabled != null && ishtmlinappmessageapplywindowinsetsenabled.serializer.equals(this.IconCompatParcelizer)) {
            this.write = ishtmlinappmessageapplywindowinsetsenabled.read();
            this.serializer = ishtmlinappmessageapplywindowinsetsenabled.serializer();
            this.read = ishtmlinappmessageapplywindowinsetsenabled.write;
            this.RemoteActionCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat;
            arrayList3.clear();
            arrayList3.addAll(ishtmlinappmessageapplywindowinsetsenabled.RemoteActionCompatParcelizer());
            if (iRemoteActionCompatParcelizer == iSerializer || str.charAt(iRemoteActionCompatParcelizer) == '#') {
                String strWrite = ishtmlinappmessageapplywindowinsetsenabled.write();
                this.MediaDescriptionCompat = strWrite != null ? isHtmlInAppMessageApplyWindowInsetsEnabled.serializer(isHtmlInAppMessageApplyWindowInsetsEnabled.write(strWrite, 0, strWrite.length(), " \"'<>#", true, false, true, true)) : null;
            }
            arrayList = arrayList3;
        } else {
            int i11 = iRemoteActionCompatParcelizer + i10;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                i2 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(i11, str, iSerializer, "@/\\?#");
                byte bCharAt = i2 != iSerializer ? str.charAt(i2) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c6 || bCharAt == c || bCharAt == c2 || bCharAt == c5) {
                    break;
                }
                if (bCharAt == 64) {
                    if (!z2) {
                        int i12 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(':', i11, i2, str);
                        i6 = i2;
                        String strWrite2 = isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i11, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z3) {
                            strWrite2 = d$$ExternalSyntheticOutline0.m(new StringBuilder(), this.write, "%40", strWrite2);
                        }
                        this.write = strWrite2;
                        if (i12 != i6) {
                            this.serializer = isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i12 + 1, i6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z2 = true;
                        }
                        z3 = true;
                    } else {
                        i6 = i2;
                        this.serializer += "%40" + isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i11, i6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    }
                    i11 = i6 + 1;
                    arrayList3 = arrayList3;
                    c6 = '#';
                    c5 = '?';
                    c2 = '\\';
                    c = '/';
                }
            }
            arrayList = arrayList3;
            int i13 = i11;
            while (true) {
                if (i13 < i2) {
                    char cCharAt4 = str.charAt(i13);
                    if (cCharAt4 == ':') {
                        i3 = i13;
                        break;
                    }
                    if (cCharAt4 == '[') {
                        i5 = 1;
                        do {
                            i13++;
                            if (i13 >= i2) {
                                break;
                            }
                        } while (str.charAt(i13) != ']');
                    } else {
                        i5 = 1;
                    }
                    i13 += i5;
                } else {
                    i3 = i2;
                    break;
                }
            }
            int i14 = i3 + 1;
            if (i14 < i2) {
                this.read = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(isHtmlInAppMessageApplyWindowInsetsEnabled.read(str, false, i11, i3));
                try {
                    i4 = Integer.parseInt(isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i14, i2, "", false, false, false, true));
                    if (i4 <= 0 || i4 > 65535) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.RemoteActionCompatParcelizer = i4;
                if (i4 == -1) {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i14, i2) + '\"');
                }
                z = false;
            } else {
                this.read = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(isHtmlInAppMessageApplyWindowInsetsEnabled.read(str, false, i11, i3));
                this.RemoteActionCompatParcelizer = isHtmlInAppMessageApplyWindowInsetsEnabled.write(this.IconCompatParcelizer);
            }
            if (this.read == null) {
                throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i11, i3) + '\"');
            }
            iRemoteActionCompatParcelizer = i2;
        }
        int i15 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(iRemoteActionCompatParcelizer, str, iSerializer, "?#");
        if (iRemoteActionCompatParcelizer != i15) {
            char cCharAt5 = str.charAt(iRemoteActionCompatParcelizer);
            if (cCharAt5 != '/' && cCharAt5 != '\\') {
                arrayList2 = arrayList;
                arrayList2.set(arrayList.size() - 1, "");
            } else {
                arrayList2 = arrayList;
                arrayList2.clear();
                arrayList2.add("");
                iRemoteActionCompatParcelizer++;
            }
            int i16 = iRemoteActionCompatParcelizer;
            while (i16 < i15) {
                int i17 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(i16, str, i15, "/\\");
                boolean z4 = i17 < i15 ? true : z;
                String strWrite3 = isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i16, i17, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!strWrite3.equals(".") && !strWrite3.equalsIgnoreCase("%2e")) {
                    if (!strWrite3.equals("..") && !strWrite3.equalsIgnoreCase("%2e.") && !strWrite3.equalsIgnoreCase(".%2e") && !strWrite3.equalsIgnoreCase("%2e%2e")) {
                        if (((String) af$$ExternalSyntheticOutline0.m(1, arrayList2)).isEmpty()) {
                            arrayList2.set(arrayList2.size() - 1, strWrite3);
                        } else {
                            arrayList2.add(strWrite3);
                        }
                        if (z4) {
                            arrayList2.add("");
                        }
                    } else if (((String) arrayList2.remove(arrayList2.size() - 1)).isEmpty() && !arrayList2.isEmpty()) {
                        arrayList2.set(arrayList2.size() - 1, "");
                    } else {
                        arrayList2.add("");
                    }
                }
                if (z4) {
                    i17++;
                }
                i16 = i17;
            }
        }
        if (i15 >= iSerializer || str.charAt(i15) != '?') {
            c3 = '#';
        } else {
            c3 = '#';
            int i18 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read('#', i15, iSerializer, str);
            this.MediaDescriptionCompat = isHtmlInAppMessageApplyWindowInsetsEnabled.serializer(isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i15 + 1, i18, " \"'<>#", true, false, true, true));
            i15 = i18;
        }
        if (i15 >= iSerializer || str.charAt(i15) != c3) {
            return;
        }
        this.MediaBrowserCompatMediaItem = isHtmlInAppMessageApplyWindowInsetsEnabled.write(str, i15 + 1, iSerializer, "", true, false, false, false);
    }

    public final isHtmlInAppMessageApplyWindowInsetsEnabled read() {
        if (this.IconCompatParcelizer != null) {
            if (this.read != null) {
                return new isHtmlInAppMessageApplyWindowInsetsEnabled(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("host == null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("scheme == null");
        return null;
    }
}
