package o;

import android.util.Base64;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.huawei.hms.framework.common.ContainerUtils;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getDirectionUpEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final /* synthetic */ int read;

    public /* synthetic */ getDirectionUpEK5gGoQ(int i) {
        this.read = i;
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) throws UnsupportedEncodingException {
        Charset charsetForName = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '%') {
                sb.append(cCharAt);
                i++;
            } else {
                byte bSerializer = serializer(i, str);
                int i2 = i + 3;
                if ((bSerializer & 128) != 0) {
                    int i3 = 0;
                    while (((bSerializer << i3) & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = bSerializer;
                    for (int i4 = 1; i4 < i3; i4++) {
                        byte bSerializer2 = serializer(i2, str);
                        i2 += 3;
                        if ((bSerializer2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i4] = bSerializer2;
                    }
                    CharBuffer charBufferDecode = charsetForName.decode(ByteBuffer.wrap(bArr));
                    if (charBufferDecode.length() != 1 || str2.indexOf(charBufferDecode.charAt(0)) == -1) {
                        sb.append((CharSequence) charBufferDecode);
                    } else {
                        sb.append(str.substring(i, i2));
                    }
                } else if (str2.indexOf(bSerializer) == -1) {
                    sb.append((char) bSerializer);
                } else {
                    sb.append(str.substring(i, i2));
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    public static byte serializer(int i, String str) throws UnsupportedEncodingException {
        int i2 = i + 3;
        if (i2 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String strSubstring = str.substring(i + 1, i2);
        if (strSubstring.charAt(0) == '+' || strSubstring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(strSubstring, 16);
        } catch (NumberFormatException unused) {
            throw new UnsupportedEncodingException();
        }
    }

    public static String serializer(String str, String str2) throws UnsupportedEncodingException {
        int i;
        StringBuilder sb = new StringBuilder();
        Charset charsetForName = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (str2.indexOf(cCharAt) != -1) {
                sb.append(cCharAt);
                i2++;
            } else {
                if (Character.isHighSurrogate(cCharAt)) {
                    int i3 = i2 + 1;
                    if (i3 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    }
                    if (!Character.isLowSurrogate(str.charAt(i3))) {
                        throw new UnsupportedEncodingException();
                    }
                    i = 2;
                } else {
                    i = 1;
                }
                int i4 = i + i2;
                byte[] bytes = str.substring(i2, i4).getBytes(charsetForName);
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    sb.append("%");
                    sb.append(Character.toUpperCase(Character.forDigit((bytes[i5] >> 4) & 15, 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i5] & 15, 16)));
                }
                i2 = i4;
            }
        }
        return sb.toString().replaceAll(" ", "%20");
    }

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getFunctionEK5gGoQ getfunctionek5ggoq;
        getFunctionEK5gGoQ getfunctionek5ggoq2;
        getFunctionEK5gGoQ getfunctionek5ggoq3;
        getFunctionEK5gGoQ getfunctionek5ggoq4;
        byte[] bArrDecode;
        String strEncodeToString;
        byte[] bArrWrite;
        getFunctionEK5gGoQ getfunctionek5ggoq5;
        getFunctionEK5gGoQ getfunctionek5ggoq6;
        getFunctionEK5gGoQ getfunctionek5ggoq7;
        getFunctionEK5gGoQ getfunctionek5ggoq8;
        getFunctionEK5gGoQ getfunctionek5ggoq9;
        getFunctionEK5gGoQ getfunctionek5ggoq10;
        boolean z;
        int i = this.read;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        int i2 = 64;
        HashSet hashSet = null;
        strGroup = null;
        String strGroup = null;
        hashSet = null;
        int i3 = 2;
        i = 1;
        int i4 = 1;
        char c = 1;
        char c2 = 1;
        switch (i) {
            case 0:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                return new getInfoEK5gGoQ(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]));
            case 1:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
                return new getInfoEK5gGoQ(((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer.toUpperCase(java.util.Locale.ENGLISH));
            case 2:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
                return new getInfoEK5gGoQ(((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer.trim());
            case 3:
                if (getfunctionek5ggoqArr.length > 0) {
                    getfunctionek5ggoq = getfunctionek5ggoqArr[0];
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq);
                } else {
                    getfunctionek5ggoq = gethelpek5ggoq;
                }
                try {
                    return new getInfoEK5gGoQ(RemoteActionCompatParcelizer(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq), "#;/?:@&=+$,"));
                } catch (UnsupportedEncodingException unused) {
                    return gethelpek5ggoq;
                }
            case 4:
                if (getfunctionek5ggoqArr.length > 0) {
                    getfunctionek5ggoq2 = getfunctionek5ggoqArr[0];
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq2);
                } else {
                    getfunctionek5ggoq2 = gethelpek5ggoq;
                }
                try {
                    return new getInfoEK5gGoQ(RemoteActionCompatParcelizer(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq2), ""));
                } catch (UnsupportedEncodingException unused2) {
                    return gethelpek5ggoq;
                }
            case 5:
                if (getfunctionek5ggoqArr.length > 0) {
                    getfunctionek5ggoq3 = getfunctionek5ggoqArr[0];
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq3);
                } else {
                    getfunctionek5ggoq3 = gethelpek5ggoq;
                }
                try {
                    return new getInfoEK5gGoQ(serializer(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq3), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
                } catch (UnsupportedEncodingException unused3) {
                    return gethelpek5ggoq;
                }
            case 6:
                if (getfunctionek5ggoqArr.length > 0) {
                    getfunctionek5ggoq4 = getfunctionek5ggoqArr[0];
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq4);
                } else {
                    getfunctionek5ggoq4 = gethelpek5ggoq;
                }
                try {
                    return new getInfoEK5gGoQ(serializer(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq4), "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_.!~*'()"));
                } catch (UnsupportedEncodingException unused4) {
                    return gethelpek5ggoq;
                }
            case 7:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                return new getGuideEK5gGoQ(Boolean.valueOf(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ));
            case 8:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
                String strIconCompatParcelizer = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]);
                String str = ((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer;
                int iHashCode = str.hashCode();
                if (iHashCode != 101) {
                    if (iHashCode != 105) {
                        if (iHashCode != 118) {
                            if (iHashCode == 119 && str.equals("w")) {
                                getButtonThumbLeftEK5gGoQ.serializer(strIconCompatParcelizer);
                                return gethelpek5ggoq;
                            }
                        } else if (str.equals("v")) {
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            return gethelpek5ggoq;
                        }
                    } else if (str.equals("i")) {
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        return gethelpek5ggoq;
                    }
                } else if (str.equals("e")) {
                    getButtonThumbLeftEK5gGoQ.write(strIconCompatParcelizer);
                    return gethelpek5ggoq;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid logging level: ".concat(String.valueOf(((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer)));
                return null;
            case 9:
                int length = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length > 0);
                String strIconCompatParcelizer2 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]);
                String strIconCompatParcelizer3 = length > 1 ? LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]) : "text";
                String strIconCompatParcelizer4 = length > 2 ? LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[2]) : "base16";
                int i5 = (length <= 3 || !LoadBalancer$Helper.serializer(getfunctionek5ggoqArr[3])) ? 2 : 3;
                try {
                    if ("text".equals(strIconCompatParcelizer3)) {
                        bArrDecode = strIconCompatParcelizer2.getBytes();
                    } else if ("base16".equals(strIconCompatParcelizer3)) {
                        bArrDecode = getButton13EK5gGoQ.write(strIconCompatParcelizer2);
                    } else if ("base64".equals(strIconCompatParcelizer3)) {
                        bArrDecode = Base64.decode(strIconCompatParcelizer2, i5);
                    } else {
                        if (!"base64url".equals(strIconCompatParcelizer3)) {
                            throw new UnsupportedOperationException("Encode: unknown input format: " + strIconCompatParcelizer3);
                        }
                        bArrDecode = Base64.decode(strIconCompatParcelizer2, i5 | 8);
                    }
                    if ("base16".equals(strIconCompatParcelizer4)) {
                        strEncodeToString = getButton13EK5gGoQ.read(bArrDecode);
                    } else if ("base64".equals(strIconCompatParcelizer4)) {
                        strEncodeToString = Base64.encodeToString(bArrDecode, i5);
                    } else {
                        if (!"base64url".equals(strIconCompatParcelizer4)) {
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Encode: unknown output format: ".concat(String.valueOf(strIconCompatParcelizer4)));
                            return null;
                        }
                        strEncodeToString = Base64.encodeToString(bArrDecode, i5 | 8);
                    }
                    return new getInfoEK5gGoQ(strEncodeToString);
                } catch (IllegalArgumentException unused5) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Encode: invalid input:".concat(String.valueOf(strIconCompatParcelizer3)));
                    return null;
                }
            case 10:
                int length2 = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length2 > 0);
                getFunctionEK5gGoQ getfunctionek5ggoq11 = getfunctionek5ggoqArr[0];
                if (getfunctionek5ggoq11 == gethelpek5ggoq) {
                    return gethelpek5ggoq;
                }
                String strIconCompatParcelizer5 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq11);
                String strIconCompatParcelizer6 = (length2 <= 1 || (getfunctionek5ggoq6 = getfunctionek5ggoqArr[1]) == gethelpek5ggoq) ? "MD5" : LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq6);
                String strIconCompatParcelizer7 = (length2 <= 2 || (getfunctionek5ggoq5 = getfunctionek5ggoqArr[2]) == gethelpek5ggoq) ? "text" : LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq5);
                if (!"text".equals(strIconCompatParcelizer7)) {
                    if ("base16".equals(strIconCompatParcelizer7)) {
                        bArrWrite = getButton13EK5gGoQ.write(strIconCompatParcelizer5);
                    } else {
                        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Hash: Unknown input format: ".concat(String.valueOf(strIconCompatParcelizer7)));
                    }
                    return null;
                }
                bArrWrite = strIconCompatParcelizer5.getBytes();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(strIconCompatParcelizer6);
                    messageDigest.update(bArrWrite);
                    return new getInfoEK5gGoQ(getButton13EK5gGoQ.read(messageDigest.digest()));
                } catch (NoSuchAlgorithmException e) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Hash: Unknown algorithm: ".concat(String.valueOf(strIconCompatParcelizer6)), e);
                }
                break;
            case 11:
                int length3 = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length3 > 0);
                getFunctionEK5gGoQ getfunctionek5ggoq12 = getfunctionek5ggoqArr[0];
                getFunctionEK5gGoQ getfunctionek5ggoq13 = length3 > 1 ? getfunctionek5ggoqArr[1] : gethelpek5ggoq;
                String strIconCompatParcelizer8 = (length3 <= 2 || (getfunctionek5ggoq8 = getfunctionek5ggoqArr[2]) == gethelpek5ggoq) ? "" : LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq8);
                String strIconCompatParcelizer9 = (length3 <= 3 || (getfunctionek5ggoq7 = getfunctionek5ggoqArr[3]) == gethelpek5ggoq) ? ContainerUtils.KEY_VALUE_DELIMITER : LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq7);
                if (getfunctionek5ggoq13 != gethelpek5ggoq) {
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq13 instanceof getInfoEK5gGoQ);
                    if ("url".equals(getfunctionek5ggoq13.read())) {
                        i3 = 1;
                    } else {
                        if (!"backslash".equals(getfunctionek5ggoq13.read())) {
                            return new getInfoEK5gGoQ("");
                        }
                        hashSet = new HashSet();
                        for (int i6 = 0; i6 < strIconCompatParcelizer8.length(); i6++) {
                            hashSet.add(Character.valueOf(strIconCompatParcelizer8.charAt(i6)));
                        }
                        for (int i7 = 0; i7 < strIconCompatParcelizer9.length(); i7++) {
                            hashSet.add(Character.valueOf(strIconCompatParcelizer9.charAt(i7)));
                        }
                        hashSet.remove('\\');
                    }
                } else {
                    i3 = 0;
                }
                StringBuilder sb = new StringBuilder();
                if (getfunctionek5ggoq12 instanceof getHenkanEK5gGoQ) {
                    for (getFunctionEK5gGoQ getfunctionek5ggoq14 : ((getHenkanEK5gGoQ) getfunctionek5ggoq12).serializer) {
                        if (c == 0) {
                            sb.append(strIconCompatParcelizer8);
                        }
                        sb.append(read(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq14), i3, hashSet));
                        c = 0;
                    }
                } else if (getfunctionek5ggoq12 instanceof getHomeEK5gGoQ) {
                    HashMap map = ((getHomeEK5gGoQ) getfunctionek5ggoq12).write;
                    for (String str2 : map.keySet()) {
                        if (c2 == 0) {
                            sb.append(strIconCompatParcelizer8);
                        }
                        String strIconCompatParcelizer10 = LoadBalancer$Helper.IconCompatParcelizer((getFunctionEK5gGoQ) map.get(str2));
                        sb.append(read(str2, i3, hashSet));
                        sb.append(strIconCompatParcelizer9);
                        sb.append(read(strIconCompatParcelizer10, i3, hashSet));
                        c2 = 0;
                    }
                } else {
                    sb.append(read(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq12), i3, hashSet));
                }
                return new getInfoEK5gGoQ(sb.toString());
            case 12:
                int length4 = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length4 >= 2);
                getFunctionEK5gGoQ getfunctionek5ggoq15 = getfunctionek5ggoqArr[0];
                if (getfunctionek5ggoq15 == gethelpek5ggoq || getfunctionek5ggoqArr[1] == gethelpek5ggoq) {
                    return gethelpek5ggoq;
                }
                String strIconCompatParcelizer11 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq15);
                String strIconCompatParcelizer12 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]);
                if (length4 > 2 && (getfunctionek5ggoq10 = getfunctionek5ggoqArr[2]) != gethelpek5ggoq && LoadBalancer$Helper.serializer(getfunctionek5ggoq10)) {
                    i2 = 66;
                }
                if (length4 > 3 && (getfunctionek5ggoq9 = getfunctionek5ggoqArr[3]) != gethelpek5ggoq) {
                    if (!(getfunctionek5ggoq9 instanceof getGEK5gGoQ)) {
                        return gethelpek5ggoq;
                    }
                    double d = LoadBalancer$Helper.read(getfunctionek5ggoq9);
                    if (Double.isInfinite(d) || d < 0.0d) {
                        return gethelpek5ggoq;
                    }
                    i4 = (int) d;
                }
                try {
                    Matcher matcher = Pattern.compile(strIconCompatParcelizer12, i2).matcher(strIconCompatParcelizer11);
                    if (matcher.find() && matcher.groupCount() >= i4) {
                        strGroup = matcher.group(i4);
                    }
                    return strGroup == null ? gethelpek5ggoq : new getInfoEK5gGoQ(strGroup);
                } catch (PatternSyntaxException unused6) {
                    return gethelpek5ggoq;
                }
            case 13:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]).contains(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]))));
            case 14:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]).endsWith(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]))));
            case 15:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]).equals(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]))));
            case 16:
                int length5 = getfunctionek5ggoqArr.length;
                if (length5 == 2) {
                    z = true;
                } else if (length5 == 3) {
                    length5 = 3;
                    z = true;
                } else {
                    z = false;
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z);
                String strIconCompatParcelizer13 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]);
                String strIconCompatParcelizer14 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]);
                if (length5 >= 3 && "true".equalsIgnoreCase(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[2]))) {
                    i2 = 66;
                }
                try {
                    return new getGuideEK5gGoQ(Boolean.valueOf(Pattern.compile(strIconCompatParcelizer14, i2).matcher(strIconCompatParcelizer13).find()));
                } catch (PatternSyntaxException unused7) {
                    return new getGuideEK5gGoQ(Boolean.FALSE);
                }
            default:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]).startsWith(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]))));
        }
    }

    public static final String read(String str, int i, HashSet hashSet) {
        if (i == 1) {
            try {
                return URLEncoder.encode(str, com.adjust.sdk.Constants.ENCODING).replaceAll("\\+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }
        if (i != 2) {
            return str;
        }
        String strReplace = str.replace("\\", "\\\\");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String string = ((Character) it.next()).toString();
            strReplace = strReplace.replace(string, "\\".concat(String.valueOf(string)));
        }
        return strReplace;
    }
}
