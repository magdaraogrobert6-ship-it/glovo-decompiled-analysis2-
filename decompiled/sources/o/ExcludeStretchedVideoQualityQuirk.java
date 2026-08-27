package o;

import android.util.Pair;
import bo.app.af$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class ExcludeStretchedVideoQualityQuirk {
    public static final ArrayList RemoteActionCompatParcelizer;
    public final ByteOrder RatingCompat;
    public final ArrayList serializer;
    public static final Pattern IconCompatParcelizer = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern read = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern write = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    public static Pair IconCompatParcelizer(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairIconCompatParcelizer = IconCompatParcelizer(strArrSplit[0]);
            if (((Integer) pairIconCompatParcelizer.first).intValue() == 2) {
                return pairIconCompatParcelizer;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairIconCompatParcelizer2 = IconCompatParcelizer(strArrSplit[i]);
                int iIntValue = (((Integer) pairIconCompatParcelizer2.first).equals(pairIconCompatParcelizer.first) || ((Integer) pairIconCompatParcelizer2.second).equals(pairIconCompatParcelizer.first)) ? ((Integer) pairIconCompatParcelizer.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairIconCompatParcelizer.second).intValue() == -1 || !(((Integer) pairIconCompatParcelizer2.first).equals(pairIconCompatParcelizer.second) || ((Integer) pairIconCompatParcelizer2.second).equals(pairIconCompatParcelizer.second))) ? -1 : ((Integer) pairIconCompatParcelizer.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairIconCompatParcelizer = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairIconCompatParcelizer = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairIconCompatParcelizer;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    static {
        ExtraSupportedQualityQuirk extraSupportedQualityQuirk = new ExtraSupportedQualityQuirk(0);
        extraSupportedQualityQuirk.IconCompatParcelizer = 0;
        RemoteActionCompatParcelizer = Collections.list(extraSupportedQualityQuirk);
    }

    public ExcludeStretchedVideoQualityQuirk() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ExtraSupportedQualityQuirk extraSupportedQualityQuirk = new ExtraSupportedQualityQuirk(1);
        extraSupportedQualityQuirk.IconCompatParcelizer = 0;
        this.serializer = Collections.list(extraSupportedQualityQuirk);
        this.RatingCompat = byteOrder;
    }

    public final void write(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        RemoteActionCompatParcelizer(str, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    public final void RemoteActionCompatParcelizer(String str, String str2, List list) {
        char c;
        int i;
        EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk;
        String str3 = str;
        String strReplaceAll = str2;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = read.matcher(strReplaceAll).find();
            boolean zFind2 = write.matcher(strReplaceAll).find();
            if (str2.length() != 19 || (!zFind && !zFind2)) {
                setInflatedId.read("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        String str4 = str3;
        char c2 = 3;
        int i2 = 2;
        int i3 = 1;
        if (strReplaceAll != null && CodecStuckOnFlushQuirk.RemoteActionCompatParcelizer.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = IconCompatParcelizer.matcher(strReplaceAll);
                if (!matcher.find()) {
                    setInflatedId.read("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb.append(Integer.parseInt(strGroup));
                sb.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb.append(Integer.parseInt(strGroup2));
                sb.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb.append(Integer.parseInt(strGroup3));
                sb.append("/1");
                strReplaceAll = sb.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException e) {
                    setInflatedId.RemoteActionCompatParcelizer("ExifData", af$$ExternalSyntheticOutline0.m("Invalid value for ", str4, " : ", strReplaceAll), e);
                    return;
                }
            }
        }
        int i4 = 0;
        while (true) {
            ExtraSupportedResolutionQuirk[] extraSupportedResolutionQuirkArr = CodecStuckOnFlushQuirk.read;
            if (i4 >= 4) {
                return;
            }
            ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk = (ExtraSupportedResolutionQuirk) ((HashMap) RemoteActionCompatParcelizer.get(i4)).get(str4);
            if (extraSupportedResolutionQuirk != null) {
                int i5 = extraSupportedResolutionQuirk.serializer;
                int i6 = extraSupportedResolutionQuirk.read;
                if (strReplaceAll == null) {
                    ((Map) list.get(i4)).remove(str4);
                } else {
                    Pair pairIconCompatParcelizer = IconCompatParcelizer(strReplaceAll);
                    int i7 = -1;
                    if (i6 == ((Integer) pairIconCompatParcelizer.first).intValue() || i6 == ((Integer) pairIconCompatParcelizer.second).intValue()) {
                        i5 = i6;
                    } else if (i5 == -1 || (i5 != ((Integer) pairIconCompatParcelizer.first).intValue() && i5 != ((Integer) pairIconCompatParcelizer.second).intValue())) {
                        if (i6 == i3 || i6 == 7 || i6 == i2) {
                            i5 = i6;
                        }
                        c = c2;
                        i = i2;
                    }
                    ByteOrder byteOrder = this.RatingCompat;
                    switch (i5) {
                        case 1:
                            c = c2;
                            i = i2;
                            Map map = (Map) list.get(i4);
                            Charset charset = EncoderNotUsePersistentInputSurfaceQuirk.read;
                            i3 = 1;
                            if (strReplaceAll.length() == 1 && strReplaceAll.charAt(0) >= '0' && strReplaceAll.charAt(0) <= '1') {
                                encoderNotUsePersistentInputSurfaceQuirk = new EncoderNotUsePersistentInputSurfaceQuirk(new byte[]{(byte) (strReplaceAll.charAt(0) - '0')}, 1, 1);
                            } else {
                                byte[] bytes = strReplaceAll.getBytes(EncoderNotUsePersistentInputSurfaceQuirk.read);
                                encoderNotUsePersistentInputSurfaceQuirk = new EncoderNotUsePersistentInputSurfaceQuirk(bytes, 1, bytes.length);
                            }
                            map.put(str4, encoderNotUsePersistentInputSurfaceQuirk);
                            break;
                        case 2:
                        case 7:
                            c = c2;
                            Map map2 = (Map) list.get(i4);
                            Charset charset2 = EncoderNotUsePersistentInputSurfaceQuirk.read;
                            byte[] bytes2 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(EncoderNotUsePersistentInputSurfaceQuirk.read);
                            i = 2;
                            map2.put(str4, new EncoderNotUsePersistentInputSurfaceQuirk(bytes2, 2, bytes2.length));
                            i3 = 1;
                            break;
                        case 3:
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int length = strArrSplit.length;
                            int[] iArr = new int[length];
                            for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                                iArr[i8] = Integer.parseInt(strArrSplit[i8]);
                            }
                            Map map3 = (Map) list.get(i4);
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[EncoderNotUsePersistentInputSurfaceQuirk.write[3] * length]);
                            byteBufferWrap.order(byteOrder);
                            for (int i9 = 0; i9 < length; i9++) {
                                byteBufferWrap.putShort((short) iArr[i9]);
                            }
                            c = 3;
                            map3.put(str4, new EncoderNotUsePersistentInputSurfaceQuirk(byteBufferWrap.array(), 3, length));
                            i3 = 1;
                            i = 2;
                            break;
                        case 4:
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                                jArr[i10] = Long.parseLong(strArrSplit2[i10]);
                            }
                            ((Map) list.get(i4)).put(str4, EncoderNotUsePersistentInputSurfaceQuirk.serializer(jArr, byteOrder));
                            c = 3;
                            i3 = 1;
                            i = 2;
                            break;
                        case 5:
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            int length2 = strArrSplit3.length;
                            ApiExceptionSessionExpiredForbidden[] apiExceptionSessionExpiredForbiddenArr = new ApiExceptionSessionExpiredForbidden[length2];
                            int i11 = 0;
                            while (i11 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i11].split("/", i7);
                                apiExceptionSessionExpiredForbiddenArr[i11] = new ApiExceptionSessionExpiredForbidden((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]), 1, (byte) 0);
                                i11++;
                                i7 = -1;
                            }
                            Map map4 = (Map) list.get(i4);
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[EncoderNotUsePersistentInputSurfaceQuirk.write[5] * length2]);
                            byteBufferWrap2.order(byteOrder);
                            for (int i12 = 0; i12 < length2; i12++) {
                                ApiExceptionSessionExpiredForbidden apiExceptionSessionExpiredForbidden = apiExceptionSessionExpiredForbiddenArr[i12];
                                byteBufferWrap2.putInt((int) apiExceptionSessionExpiredForbidden.read);
                                byteBufferWrap2.putInt((int) apiExceptionSessionExpiredForbidden.write);
                            }
                            map4.put(str4, new EncoderNotUsePersistentInputSurfaceQuirk(byteBufferWrap2.array(), 5, length2));
                            c = 3;
                            i3 = 1;
                            i = 2;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            c = c2;
                            i = i2;
                            break;
                        case 9:
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int length3 = strArrSplit5.length;
                            int[] iArr2 = new int[length3];
                            for (int i13 = 0; i13 < strArrSplit5.length; i13++) {
                                iArr2[i13] = Integer.parseInt(strArrSplit5[i13]);
                            }
                            Map map5 = (Map) list.get(i4);
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[EncoderNotUsePersistentInputSurfaceQuirk.write[9] * length3]);
                            byteBufferWrap3.order(byteOrder);
                            for (int i14 = 0; i14 < length3; i14++) {
                                byteBufferWrap3.putInt(iArr2[i14]);
                            }
                            map5.put(str4, new EncoderNotUsePersistentInputSurfaceQuirk(byteBufferWrap3.array(), 9, length3));
                            i3 = 1;
                            c = 3;
                            i = 2;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            int length4 = strArrSplit6.length;
                            ApiExceptionSessionExpiredForbidden[] apiExceptionSessionExpiredForbiddenArr2 = new ApiExceptionSessionExpiredForbidden[length4];
                            int i15 = 0;
                            while (i15 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i15].split("/", -1);
                                apiExceptionSessionExpiredForbiddenArr2[i15] = new ApiExceptionSessionExpiredForbidden((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[1]), 1, (byte) 0);
                                i15++;
                                strReplaceAll = strReplaceAll;
                            }
                            String str5 = strReplaceAll;
                            Map map6 = (Map) list.get(i4);
                            ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(new byte[EncoderNotUsePersistentInputSurfaceQuirk.write[10] * length4]);
                            byteBufferWrap4.order(byteOrder);
                            for (int i16 = 0; i16 < length4; i16++) {
                                ApiExceptionSessionExpiredForbidden apiExceptionSessionExpiredForbidden2 = apiExceptionSessionExpiredForbiddenArr2[i16];
                                byteBufferWrap4.putInt((int) apiExceptionSessionExpiredForbidden2.read);
                                byteBufferWrap4.putInt((int) apiExceptionSessionExpiredForbidden2.write);
                            }
                            map6.put(str4, new EncoderNotUsePersistentInputSurfaceQuirk(byteBufferWrap4.array(), 10, length4));
                            strReplaceAll = str5;
                            i3 = 1;
                            c = 3;
                            i = 2;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            int length5 = strArrSplit8.length;
                            double[] dArr = new double[length5];
                            for (int i17 = 0; i17 < strArrSplit8.length; i17++) {
                                dArr[i17] = Double.parseDouble(strArrSplit8[i17]);
                            }
                            Map map7 = (Map) list.get(i4);
                            ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(new byte[EncoderNotUsePersistentInputSurfaceQuirk.write[12] * length5]);
                            byteBufferWrap5.order(byteOrder);
                            for (int i18 = 0; i18 < length5; i18++) {
                                byteBufferWrap5.putDouble(dArr[i18]);
                            }
                            map7.put(str4, new EncoderNotUsePersistentInputSurfaceQuirk(byteBufferWrap5.array(), 12, length5));
                            c = c2;
                            i3 = 1;
                            i = 2;
                            break;
                    }
                }
                c = c2;
                i = i2;
            } else {
                c = c2;
                i = i2;
            }
            i4++;
            c2 = c;
            i2 = i;
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            setInflatedId.read("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
            i2 = 0;
        } else {
            i2 = 8;
        }
        RemoteActionCompatParcelizer("Orientation", String.valueOf(i2), this.serializer);
    }
}
