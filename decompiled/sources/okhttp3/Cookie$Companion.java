package okhttp3;

import androidx.lifecycle.ViewModel;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.dynamite.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AndroidColorFilter_androidKt;
import o.InAppMessageHtmlBaseViewCompanion;
import o.asFrameworkPaint;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getFilterQualityfv9h1I;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetMessageMarginslambda00;
import o.setCarryoverInAppMessage;
import o.setInAppMessageImageViewAttributes;
import o.setPathEffect;
import o.setStrokeCapBeK7IIE;
import o.setStrokeJoinWw9F2mQ;
import o.setWebViewContent;
import o.setupDirectionalNavigationlambda0;
import o.toRegionOp7u2Bmg;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Cookie$Companion {
    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long write(int i, String str) {
        int iIconCompatParcelizer = IconCompatParcelizer(str, false, 0, i);
        Matcher matcher = r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo.serializer.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iWrite = -1;
        int i5 = -1;
        int i6 = -1;
        while (iIconCompatParcelizer < i) {
            int iIconCompatParcelizer2 = IconCompatParcelizer(str, true, iIconCompatParcelizer + 1, i);
            matcher.region(iIconCompatParcelizer, iIconCompatParcelizer2);
            if (i3 == -1 && matcher.usePattern(r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo.serializer).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo.write).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iWrite == -1) {
                Pattern pattern = r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo.RemoteActionCompatParcelizer;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo.IconCompatParcelizer).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iIconCompatParcelizer = IconCompatParcelizer(str, false, iIconCompatParcelizer2 + 1, i);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0L;
        }
        if (iWrite == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(setWebViewContent.RemoteActionCompatParcelizer);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iWrite - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static int IconCompatParcelizer(String str, boolean z, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final ViewModel IconCompatParcelizer(asFrameworkPaint asframeworkpaint, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, createImageBitmap createimagebitmap, setStrokeCapBeK7IIE setstrokecapbek7iie) {
        toRegionOp7u2Bmg toregionop7u2bmgSerializer;
        if (createimagebitmap != null) {
            getFilterQualityfv9h1I viewModelStore = asframeworkpaint.getViewModelStore();
            viewModelStore.getClass();
            setstrokecapbek7iie.getClass();
            toregionop7u2bmgSerializer = new toRegionOp7u2Bmg(viewModelStore, createimagebitmap, setstrokecapbek7iie);
        } else if (asframeworkpaint instanceof AndroidColorFilter_androidKt) {
            getFilterQualityfv9h1I viewModelStore2 = asframeworkpaint.getViewModelStore();
            createImageBitmap defaultViewModelProviderFactory = ((AndroidColorFilter_androidKt) asframeworkpaint).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            setstrokecapbek7iie.getClass();
            toregionop7u2bmgSerializer = new toRegionOp7u2Bmg(viewModelStore2, defaultViewModelProviderFactory, setstrokecapbek7iie);
        } else {
            toregionop7u2bmgSerializer = zzj.serializer(asframeworkpaint, null, 6);
        }
        return toregionop7u2bmgSerializer.write(r8lambdaucgighn8fiyv_vccodeafjfpedk);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0221 A[EDGE_INSN: B:110:0x0221->B:111:0x0222 BREAK  A[LOOP:1: B:17:0x008a->B:65:0x015a]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    public static List IconCompatParcelizer(setInAppMessageImageViewAttributes setinappmessageimageviewattributes, resetMessageMarginslambda00 resetmessagemarginslambda00) {
        List listUnmodifiableList;
        r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo r8lambdabqh0w01c16kbfgwvmhuboeiyobo;
        String strSubstring;
        String strSubstring2;
        setinappmessageimageviewattributes.getClass();
        resetmessagemarginslambda00.getClass();
        List listSerializer = resetmessagemarginslambda00.serializer("Set-Cookie");
        int size = listSerializer.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) listSerializer.get(i);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int i2 = InAppMessageHtmlBaseViewCompanion.read(str, ';', 0, 0, 6);
            char c2 = '=';
            int i3 = InAppMessageHtmlBaseViewCompanion.read(str, '=', 0, i2, 2);
            if (i3 == i2) {
                r8lambdabqh0w01c16kbfgwvmhuboeiyobo = null;
            } else {
                int iSerializer = InAppMessageHtmlBaseViewCompanion.serializer(0, i3, str);
                String strSubstring3 = str.substring(iSerializer, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer, i3, str));
                if (strSubstring3.length() != 0 && InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(strSubstring3) == -1) {
                    int iSerializer2 = InAppMessageHtmlBaseViewCompanion.serializer(i3 + 1, i2, str);
                    String strSubstring4 = str.substring(iSerializer2, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer2, i2, str));
                    if (InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(strSubstring4) == -1) {
                        int i4 = i2 + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long j2 = -1;
                        long jWrite = 253402300799999L;
                        String str2 = null;
                        boolean z4 = true;
                        String str3 = null;
                        String str4 = null;
                        while (true) {
                            long j3 = Long.MIN_VALUE;
                            if (i4 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j4 >= jCurrentTimeMillis && j4 <= 253402300799999L) {
                                        j = j4;
                                    }
                                } else {
                                    j = jWrite;
                                }
                                String str5 = setinappmessageimageviewattributes.host;
                                if (str2 == null) {
                                    str2 = str5;
                                } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str5, str2}, getCieXyz.write())).booleanValue() && (!setCarryoverInAppMessage.read(str5, str2, false) || str5.charAt((str5.length() - str2.length()) - 1) != '.' || setupDirectionalNavigationlambda0.serializer.read(str5))) {
                                    r8lambdabqh0w01c16kbfgwvmhuboeiyobo = null;
                                    break;
                                }
                                if (str5.length() != str2.length() && PublicSuffixDatabase.IconCompatParcelizer.IconCompatParcelizer(str2) == null) {
                                    r8lambdabqh0w01c16kbfgwvmhuboeiyobo = null;
                                    break;
                                }
                                String str6 = str4;
                                if (str6 == null || !setCarryoverInAppMessage.RemoteActionCompatParcelizer(str6, "/", false)) {
                                    String str7 = setinappmessageimageviewattributes.read();
                                    int iSerializer3 = hideCurrentlyDisplayingInAppMessage.serializer('/', 0, 6, str7);
                                    strSubstring = iSerializer3 != 0 ? str7.substring(0, iSerializer3) : "/";
                                } else {
                                    strSubstring = str6;
                                }
                                r8lambdabqh0w01c16kbfgwvmhuboeiyobo = new r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo(strSubstring3, strSubstring4, j, str2, strSubstring, z, z2, z3, z4, str3);
                                break;
                            }
                            int iRemoteActionCompatParcelizer = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(c, i4, length, str);
                            int iRemoteActionCompatParcelizer2 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(c2, i4, iRemoteActionCompatParcelizer, str);
                            int iSerializer4 = InAppMessageHtmlBaseViewCompanion.serializer(i4, iRemoteActionCompatParcelizer2, str);
                            String strSubstring5 = str.substring(iSerializer4, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer4, iRemoteActionCompatParcelizer2, str));
                            if (iRemoteActionCompatParcelizer2 < iRemoteActionCompatParcelizer) {
                                int iSerializer5 = InAppMessageHtmlBaseViewCompanion.serializer(iRemoteActionCompatParcelizer2 + 1, iRemoteActionCompatParcelizer, str);
                                strSubstring2 = str.substring(iSerializer5, InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(iSerializer5, iRemoteActionCompatParcelizer, str));
                            } else {
                                strSubstring2 = "";
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jWrite = write(strSubstring2.length(), strSubstring2);
                                    z3 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strSubstring2);
                                    if (j2 <= 0) {
                                        j2 = j3;
                                    }
                                } catch (NumberFormatException e) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    patternCompile.getClass();
                                    if (!patternCompile.matcher(strSubstring2).matches()) {
                                        throw e;
                                    }
                                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(strSubstring2, "-", false)) {
                                        j3 = Long.MAX_VALUE;
                                    }
                                }
                                z3 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (setCarryoverInAppMessage.read(strSubstring2, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strWrite = setupDirectionalNavigationlambda0.write(hideCurrentlyDisplayingInAppMessage.write(strSubstring2, "."));
                                if (strWrite == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strWrite;
                                z4 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                str4 = strSubstring2;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z2 = true;
                            } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                str3 = strSubstring2;
                            }
                            i4 = iRemoteActionCompatParcelizer + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        r8lambdabqh0w01c16kbfgwvmhuboeiyobo = null;
                    }
                } else {
                    r8lambdabqh0w01c16kbfgwvmhuboeiyobo = null;
                }
            }
            if (r8lambdabqh0w01c16kbfgwvmhuboeiyobo != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r8lambdabqh0w01c16kbfgwvmhuboeiyobo);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        return listUnmodifiableList == null ? instance_delegatelambda0.write : listUnmodifiableList;
    }

    public static final ViewModel IconCompatParcelizer(Class cls, createImageBitmap createimagebitmap, getBirthDateFull getbirthdatefull) {
        asFrameworkPaint asframeworkpaintIconCompatParcelizer = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull);
        if (asframeworkpaintIconCompatParcelizer != null) {
            return IconCompatParcelizer(asframeworkpaintIconCompatParcelizer, displayInAppMessagelambda1.serializer(cls), createimagebitmap, asframeworkpaintIconCompatParcelizer instanceof AndroidColorFilter_androidKt ? ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        return null;
    }
}
