package com.google.i18n.phonenumbers;

import androidx.transition.TransitionValuesMaps;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Parser;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AndroidCompositionLocals_androidKtLocalConfiguration1;
import o.AndroidCompositionLocals_androidKtLocalImageVectorCache1;
import o.AndroidCompositionLocals_androidKtLocalResourceIdCache1;
import o.AndroidCompositionLocals_androidKtLocalResources1;
import o.AndroidCompositionLocals_androidKtLocalView1;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.accessgetCoroutineScopep;
import o.getLocalLifecycleOwnerannotations;
import o.getLocalSavedStateRegistryOwner;
import o.getLocalSavedStateRegistryOwnerannotations;
import o.getLocalView;
import o.noLocalProvidedFor;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k;

/* JADX INFO: loaded from: classes2.dex */
public final class PhoneNumberUtil {
    public static final Logger ComponentActivity = Logger.getLogger(PhoneNumberUtil.class.getName());
    public static final Map IconCompatParcelizer;
    public static final Pattern MediaBrowserCompatMediaItem;
    public static final Pattern MediaDescriptionCompat;
    public static final Pattern MediaMetadataCompat;
    public static final Pattern MediaSessionCompatQueueItem;
    public static final Pattern MediaSessionCompatResultReceiverWrapper;
    public static final Pattern MediaSessionCompatToken;
    public static final Pattern ParcelableVolumeInfo;
    public static PhoneNumberUtil PlaybackStateCompat;
    public static final Pattern PlaybackStateCompatCustomAction;
    public static final Pattern RatingCompat;
    public static final Pattern RemoteActionCompatParcelizer;
    public static final Pattern read;
    public static final Pattern serializer;
    public static final Map write;
    public final HashMap ResultReceiver;
    public final i$d r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final PinnableContainerKtLocalPinnableContainer1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new PinnableContainerKtLocalPinnableContainer1(29);
    public final HashSet r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new HashSet(35);
    public final i$d.a r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new i$d.a(2);
    public final HashSet r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new HashSet(320);
    public final HashSet r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        write = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        IconCompatParcelizer = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = write;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        MediaBrowserCompatMediaItem = Pattern.compile("[+＋]+");
        MediaDescriptionCompat = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        serializer = Pattern.compile("(\\p{Nd})");
        PlaybackStateCompatCustomAction = Pattern.compile("[+＋\\p{Nd}]");
        MediaMetadataCompat = Pattern.compile("[\\\\/] *x");
        ParcelableVolumeInfo = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        MediaSessionCompatResultReceiverWrapper = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strM = ff$$ExternalSyntheticOutline0.m("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strSerializer = serializer(true);
        serializer(false);
        MediaSessionCompatQueueItem = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat = string.concat("\\p{Nd}");
        RatingCompat = Pattern.compile("^(" + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("[", strConcat, "]+((\\-)*[", strConcat, "])*") + "\\.)*" + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("[", string, "]+((\\-)*[", strConcat, "])*") + "\\.?$");
        StringBuilder sb2 = new StringBuilder("(?:");
        sb2.append(strSerializer);
        sb2.append(")$");
        RemoteActionCompatParcelizer = Pattern.compile(sb2.toString(), 66);
        MediaSessionCompatToken = Pattern.compile(strM + "(?:" + strSerializer + ")?", 66);
        Pattern.compile("(\\D+)");
        read = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        PlaybackStateCompat = null;
    }

    public static void IconCompatParcelizer(StringBuilder sb) {
        if (!MediaSessionCompatResultReceiverWrapper.matcher(sb).matches()) {
            sb.replace(0, sb.length(), read(sb));
            return;
        }
        int length = sb.length();
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int i = 0; i < sb.length(); i++) {
            Character ch = (Character) IconCompatParcelizer.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        sb.replace(0, length, sb2.toString());
    }

    public static PhoneNumberUtil read() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (PlaybackStateCompat == null) {
                AndroidCompositionLocals_androidKtLocalResourceIdCache1 androidCompositionLocals_androidKtLocalResourceIdCache1 = AndroidCompositionLocals_androidKtLocalResourceIdCache1.write;
                accessgetCoroutineScopep accessgetcoroutinescopep = androidCompositionLocals_androidKtLocalResourceIdCache1.IconCompatParcelizer;
                if (accessgetcoroutinescopep == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                PhoneNumberUtil phoneNumberUtil2 = new PhoneNumberUtil(new i$d(androidCompositionLocals_androidKtLocalResourceIdCache1.RemoteActionCompatParcelizer, accessgetcoroutinescopep, androidCompositionLocals_androidKtLocalResourceIdCache1.serializer), getLocalLifecycleOwnerannotations.write());
                synchronized (PhoneNumberUtil.class) {
                    PlaybackStateCompat = phoneNumberUtil2;
                }
            }
            phoneNumberUtil = PlaybackStateCompat;
        }
        return phoneNumberUtil;
    }

    public static String read(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int iDigit = Character.digit(charSequence.charAt(i), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static String serializer(boolean z) {
        String strConcat = ";ext=".concat(IconCompatParcelizer(20));
        String str = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + IconCompatParcelizer(20) + "#?";
        String str2 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + IconCompatParcelizer(9) + "#?";
        String str3 = "[- ]+" + IconCompatParcelizer(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(str);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(str2);
        String strM = ff$$ExternalSyntheticOutline0.m(sb, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str3);
        if (!z) {
            return strM;
        }
        return strM + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + IconCompatParcelizer(15) + "#?") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + IconCompatParcelizer(9) + "#?");
    }

    public final int IconCompatParcelizer(String str) {
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.contains(str)) {
            getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations = read(str);
            if (getlocalsavedstateregistryownerannotations != null) {
                return getlocalsavedstateregistryownerannotations.RemoteActionCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid region code: ".concat(str));
            return 0;
        }
        ComponentActivity.log(Level.WARNING, "Invalid or missing region code (" + str + ") provided.");
        return 0;
    }

    public final getLocalSavedStateRegistryOwnerannotations RemoteActionCompatParcelizer(int i, String str) {
        if (!"001".equals(str)) {
            return read(str);
        }
        if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.contains(Integer.valueOf(i))) {
            return null;
        }
        i$d i_d = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        i_d.getClass();
        List list = (List) getLocalLifecycleOwnerannotations.write().get(Integer.valueOf(i));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(i + " calling code belongs to a geo entity");
        }
        getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations = (getLocalSavedStateRegistryOwnerannotations) ((ConcurrentHashMap) ((m) ((Parser.Pair) ((TransitionValuesMaps) i_d.read).read(((r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k) i_d.serializer).RemoteActionCompatParcelizer(Integer.valueOf(i)))).RemoteActionCompatParcelizer).RemoteActionCompatParcelizer).get(Integer.valueOf(i));
        String strM = c8$$ExternalSyntheticOutline0.m(i, "Missing metadata for country code ");
        if (getlocalsavedstateregistryownerannotations != null) {
            return getlocalsavedstateregistryownerannotations;
        }
        throw new MissingMetadataException(strM);
    }

    public final AndroidCompositionLocals_androidKtLocalImageVectorCache1 write(String str, String str2) throws NumberParseException {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iRemoteActionCompatParcelizer;
        AndroidCompositionLocals_androidKtLocalImageVectorCache1 androidCompositionLocals_androidKtLocalImageVectorCache1 = new AndroidCompositionLocals_androidKtLocalImageVectorCache1();
        androidCompositionLocals_androidKtLocalImageVectorCache1.read = 0;
        androidCompositionLocals_androidKtLocalImageVectorCache1.MediaDescriptionCompat = 0L;
        String strGroup = "";
        androidCompositionLocals_androidKtLocalImageVectorCache1.write = "";
        androidCompositionLocals_androidKtLocalImageVectorCache1.MediaBrowserCompatMediaItem = false;
        androidCompositionLocals_androidKtLocalImageVectorCache1.RatingCompat = 1;
        androidCompositionLocals_androidKtLocalImageVectorCache1.MediaSessionCompatToken = "";
        androidCompositionLocals_androidKtLocalImageVectorCache1.PlaybackStateCompatCustomAction = "";
        androidCompositionLocals_androidKtLocalImageVectorCache1.IconCompatParcelizer = AndroidCompositionLocals_androidKtLocalResources1.UNSPECIFIED;
        if (str == null) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i = iIndexOf + 15;
            if (i >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i);
                strSubstring = iIndexOf2 != -1 ? string.substring(i, iIndexOf2) : string.substring(i);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(MediaSessionCompatQueueItem.matcher(strSubstring).matches() || RatingCompat.matcher(strSubstring).matches()))) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = PlaybackStateCompatCustomAction.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = ParcelableVolumeInfo.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = MediaMetadataCompat.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = MediaSessionCompatToken;
        if (length < 2 || !pattern.matcher(sb).matches()) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        boolean zContains = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.contains(str2);
        Pattern pattern2 = MediaBrowserCompatMediaItem;
        if (!zContains && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        Matcher matcher4 = RemoteActionCompatParcelizer.matcher(sb);
        if (matcher4.find()) {
            String strSubstring2 = sb.substring(0, matcher4.start());
            if (strSubstring2.length() >= 2 && pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                for (int i2 = 1; i2 <= iGroupCount; i2++) {
                    if (matcher4.group(i2) != null) {
                        strGroup = matcher4.group(i2);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                }
            }
        }
        if (strGroup.length() > 0) {
            androidCompositionLocals_androidKtLocalImageVectorCache1.RemoteActionCompatParcelizer = true;
            androidCompositionLocals_androidKtLocalImageVectorCache1.write = strGroup;
        }
        getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer = read(str2);
        StringBuilder sb2 = new StringBuilder();
        try {
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb, getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer, sb2, androidCompositionLocals_androidKtLocalImageVectorCache1);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            NumberParseException.RemoteActionCompatParcelizer remoteActionCompatParcelizer = NumberParseException.RemoteActionCompatParcelizer.INVALID_COUNTRY_CODE;
            NumberParseException.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = e.IconCompatParcelizer;
            if (remoteActionCompatParcelizer2 != remoteActionCompatParcelizer || !matcher5.lookingAt()) {
                throw new NumberParseException(remoteActionCompatParcelizer2, e.getMessage());
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.substring(matcher5.end()), getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer, sb2, androidCompositionLocals_androidKtLocalImageVectorCache1);
            if (iRemoteActionCompatParcelizer == 0) {
                throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iRemoteActionCompatParcelizer != 0) {
            List list = (List) this.ResultReceiver.get(Integer.valueOf(iRemoteActionCompatParcelizer));
            String str3 = list == null ? "ZZ" : (String) list.get(0);
            if (!str3.equals(str2)) {
                getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, str3);
            }
        } else {
            IconCompatParcelizer(sb);
            sb2.append((CharSequence) sb);
            int i3 = getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            androidCompositionLocals_androidKtLocalImageVectorCache1.serializer = true;
            androidCompositionLocals_androidKtLocalImageVectorCache1.read = i3;
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            IconCompatParcelizer(sb4, getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer, sb3);
            noLocalProvidedFor nolocalprovidedforRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb4, getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer, getLocalView.UNKNOWN);
            if (nolocalprovidedforRemoteActionCompatParcelizer != noLocalProvidedFor.TOO_SHORT && nolocalprovidedforRemoteActionCompatParcelizer != noLocalProvidedFor.IS_POSSIBLE_LOCAL_ONLY && nolocalprovidedforRemoteActionCompatParcelizer != noLocalProvidedFor.INVALID_LENGTH) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            androidCompositionLocals_androidKtLocalImageVectorCache1.MediaSessionCompatQueueItem = true;
            androidCompositionLocals_androidKtLocalImageVectorCache1.MediaBrowserCompatMediaItem = true;
            int i4 = 1;
            while (i4 < sb2.length() - 1 && sb2.charAt(i4) == '0') {
                i4++;
            }
            if (i4 != 1) {
                androidCompositionLocals_androidKtLocalImageVectorCache1.MediaMetadataCompat = true;
                androidCompositionLocals_androidKtLocalImageVectorCache1.RatingCompat = i4;
            }
        }
        androidCompositionLocals_androidKtLocalImageVectorCache1.MediaDescriptionCompat = Long.parseLong(sb2.toString());
        return androidCompositionLocals_androidKtLocalImageVectorCache1;
    }

    public final getLocalSavedStateRegistryOwnerannotations read(String str) {
        if (str == null || !this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.contains(str)) {
            return null;
        }
        i$d i_d = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        i_d.getClass();
        if (!str.equals("001")) {
            getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations = (getLocalSavedStateRegistryOwnerannotations) ((ConcurrentHashMap) ((m) ((Parser.Pair) ((TransitionValuesMaps) i_d.read).read(((r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k) i_d.serializer).RemoteActionCompatParcelizer(str))).write).RemoteActionCompatParcelizer).get(str);
            String strConcat = "Missing metadata for region code ".concat(str);
            if (getlocalsavedstateregistryownerannotations != null) {
                return getlocalsavedstateregistryownerannotations;
            }
            throw new MissingMetadataException(strConcat);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(" region code is a non-geo entity"));
        return null;
    }

    public static String IconCompatParcelizer(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "(\\p{Nd}{1,", "})");
    }

    public static noLocalProvidedFor RemoteActionCompatParcelizer(StringBuilder sb, getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations, getLocalView getlocalview) {
        AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1Serializer = serializer(getlocalsavedstateregistryownerannotations, getlocalview);
        ArrayList arrayList = androidCompositionLocals_androidKtLocalView1Serializer.MediaSessionCompatQueueItem.isEmpty() ? getlocalsavedstateregistryownerannotations.serializer.MediaSessionCompatQueueItem : androidCompositionLocals_androidKtLocalView1Serializer.MediaSessionCompatQueueItem;
        ArrayList arrayList2 = androidCompositionLocals_androidKtLocalView1Serializer.RemoteActionCompatParcelizer;
        if (getlocalview == getLocalView.FIXED_LINE_OR_MOBILE) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1Serializer2 = serializer(getlocalsavedstateregistryownerannotations, getLocalView.FIXED_LINE);
            if (androidCompositionLocals_androidKtLocalView1Serializer2.MediaSessionCompatQueueItem.size() == 1 && ((Integer) androidCompositionLocals_androidKtLocalView1Serializer2.MediaSessionCompatQueueItem.get(0)).intValue() == -1) {
                return RemoteActionCompatParcelizer(sb, getlocalsavedstateregistryownerannotations, getLocalView.MOBILE);
            }
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1Serializer3 = serializer(getlocalsavedstateregistryownerannotations, getLocalView.MOBILE);
            ArrayList arrayList3 = androidCompositionLocals_androidKtLocalView1Serializer3.MediaSessionCompatQueueItem;
            ArrayList arrayList4 = androidCompositionLocals_androidKtLocalView1Serializer3.MediaSessionCompatQueueItem;
            boolean z = (arrayList3.size() == 1 && ((Integer) arrayList4.get(0)).intValue() == -1) ? false : true;
            ArrayList arrayList5 = androidCompositionLocals_androidKtLocalView1Serializer3.RemoteActionCompatParcelizer;
            if (z) {
                ArrayList arrayList6 = new ArrayList(arrayList);
                if (arrayList4.size() == 0) {
                    arrayList4 = getlocalsavedstateregistryownerannotations.serializer.MediaSessionCompatQueueItem;
                }
                arrayList6.addAll(arrayList4);
                Collections.sort(arrayList6);
                if (arrayList2.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    arrayList7.addAll(arrayList5);
                    Collections.sort(arrayList7);
                    arrayList2 = arrayList7;
                }
                arrayList = arrayList6;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return noLocalProvidedFor.INVALID_LENGTH;
        }
        int length = sb.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return noLocalProvidedFor.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if (iIntValue == length) {
            return noLocalProvidedFor.IS_POSSIBLE;
        }
        if (iIntValue > length) {
            return noLocalProvidedFor.TOO_SHORT;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return noLocalProvidedFor.TOO_LONG;
        }
        return arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? noLocalProvidedFor.IS_POSSIBLE : noLocalProvidedFor.INVALID_LENGTH;
    }

    public final void IconCompatParcelizer(StringBuilder sb, getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations, StringBuilder sb2) {
        int length = sb.length();
        String str = getlocalsavedstateregistryownerannotations.addObserverForBackInvoker;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer(str).matcher(sb);
        if (matcher.lookingAt()) {
            AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1 = getlocalsavedstateregistryownerannotations.serializer;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            boolean z = pinnableContainerKtLocalPinnableContainer1.read(sb, androidCompositionLocals_androidKtLocalView1);
            int iGroupCount = matcher.groupCount();
            String str2 = getlocalsavedstateregistryownerannotations.ensureViewModelStore;
            if (str2 == null || str2.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!z || pinnableContainerKtLocalPinnableContainer1.read(sb.substring(matcher.end()), androidCompositionLocals_androidKtLocalView1)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!z || pinnableContainerKtLocalPinnableContainer1.read(sb3.toString(), androidCompositionLocals_androidKtLocalView1)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public PhoneNumberUtil(i$d i_d, HashMap map) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i_d;
        this.ResultReceiver = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add((Integer) entry.getKey());
            } else {
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.addAll(list);
            }
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.remove("001")) {
            ComponentActivity.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.addAll((Collection) map.get(1));
    }

    public static AndroidCompositionLocals_androidKtLocalView1 serializer(getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations, getLocalView getlocalview) {
        switch (getlocalview) {
            case FIXED_LINE:
            case FIXED_LINE_OR_MOBILE:
                return getlocalsavedstateregistryownerannotations.read;
            case MOBILE:
                return getlocalsavedstateregistryownerannotations._init_lambda2;
            case TOLL_FREE:
                return getlocalsavedstateregistryownerannotations.addMenuProvider;
            case PREMIUM_RATE:
                return getlocalsavedstateregistryownerannotations.getSavedStateRegistryControllerannotations;
            case SHARED_COST:
                return getlocalsavedstateregistryownerannotations.onBackPressedDispatcher_delegatelambda010;
            case VOIP:
                return getlocalsavedstateregistryownerannotations.addOnNewIntentListener;
            case PERSONAL_NUMBER:
                return getlocalsavedstateregistryownerannotations.fullyDrawnReporter_delegatelambda0;
            case PAGER:
                return getlocalsavedstateregistryownerannotations.getOnBackPressedInput;
            case UAN:
                return getlocalsavedstateregistryownerannotations.addOnConfigurationChangedListener;
            case VOICEMAIL:
                return getlocalsavedstateregistryownerannotations.addOnMultiWindowModeChangedListener;
            default:
                return getlocalsavedstateregistryownerannotations.serializer;
        }
    }

    public final String read(AndroidCompositionLocals_androidKtLocalImageVectorCache1 androidCompositionLocals_androidKtLocalImageVectorCache1, getLocalSavedStateRegistryOwner getlocalsavedstateregistryowner) {
        i$d.a aVar;
        AndroidCompositionLocals_androidKtLocalConfiguration1 androidCompositionLocals_androidKtLocalConfiguration1;
        int i;
        if (androidCompositionLocals_androidKtLocalImageVectorCache1.MediaDescriptionCompat == 0) {
            String str = androidCompositionLocals_androidKtLocalImageVectorCache1.MediaSessionCompatToken;
            if (str.length() > 0 || !androidCompositionLocals_androidKtLocalImageVectorCache1.serializer) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i2 = androidCompositionLocals_androidKtLocalImageVectorCache1.read;
        StringBuilder sb2 = new StringBuilder();
        if (androidCompositionLocals_androidKtLocalImageVectorCache1.MediaBrowserCompatMediaItem && (i = androidCompositionLocals_androidKtLocalImageVectorCache1.RatingCompat) > 0) {
            char[] cArr = new char[i];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(androidCompositionLocals_androidKtLocalImageVectorCache1.MediaDescriptionCompat);
        String string = sb2.toString();
        getLocalSavedStateRegistryOwner getlocalsavedstateregistryowner2 = getLocalSavedStateRegistryOwner.E164;
        if (getlocalsavedstateregistryowner == getlocalsavedstateregistryowner2) {
            sb.append(string);
            serializer(i2, getlocalsavedstateregistryowner2, sb);
        } else {
            HashMap map = this.ResultReceiver;
            if (map.containsKey(Integer.valueOf(i2))) {
                List list = (List) map.get(Integer.valueOf(i2));
                getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2, list == null ? "ZZ" : (String) list.get(0));
                Iterator it = ((getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer.accessensureViewModelStore.size() == 0 || getlocalsavedstateregistryowner == getLocalSavedStateRegistryOwner.NATIONAL) ? getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer.defaultViewModelProviderFactory_delegatelambda0 : getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer.accessensureViewModelStore).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (!zHasNext) {
                        androidCompositionLocals_androidKtLocalConfiguration1 = null;
                        break;
                    }
                    androidCompositionLocals_androidKtLocalConfiguration1 = (AndroidCompositionLocals_androidKtLocalConfiguration1) it.next();
                    int size = androidCompositionLocals_androidKtLocalConfiguration1.read.size();
                    if (size == 0 || aVar.RemoteActionCompatParcelizer((String) androidCompositionLocals_androidKtLocalConfiguration1.read.get(size - 1)).matcher(string).lookingAt()) {
                        if (aVar.RemoteActionCompatParcelizer(androidCompositionLocals_androidKtLocalConfiguration1.MediaSessionCompatQueueItem).matcher(string).matches()) {
                            break;
                        }
                    }
                }
                if (androidCompositionLocals_androidKtLocalConfiguration1 != null) {
                    String str2 = androidCompositionLocals_androidKtLocalConfiguration1.write;
                    Matcher matcher = aVar.RemoteActionCompatParcelizer(androidCompositionLocals_androidKtLocalConfiguration1.MediaSessionCompatQueueItem).matcher(string);
                    getLocalSavedStateRegistryOwner getlocalsavedstateregistryowner3 = getLocalSavedStateRegistryOwner.NATIONAL;
                    String str3 = androidCompositionLocals_androidKtLocalConfiguration1.MediaDescriptionCompat;
                    string = (getlocalsavedstateregistryowner != getlocalsavedstateregistryowner3 || str3 == null || str3.length() <= 0) ? matcher.replaceAll(str2) : matcher.replaceAll(read.matcher(str2).replaceFirst(str3));
                    if (getlocalsavedstateregistryowner == getLocalSavedStateRegistryOwner.RFC3966) {
                        Matcher matcher2 = MediaDescriptionCompat.matcher(string);
                        if (matcher2.lookingAt()) {
                            string = matcher2.replaceFirst("");
                        }
                        string = matcher2.reset(string).replaceAll("-");
                    }
                }
                sb.append(string);
                if (androidCompositionLocals_androidKtLocalImageVectorCache1.RemoteActionCompatParcelizer && androidCompositionLocals_androidKtLocalImageVectorCache1.write.length() > 0) {
                    if (getlocalsavedstateregistryowner == getLocalSavedStateRegistryOwner.RFC3966) {
                        sb.append(";ext=");
                        sb.append(androidCompositionLocals_androidKtLocalImageVectorCache1.write);
                    } else if (getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                        sb.append(getlocalsavedstateregistryownerannotationsRemoteActionCompatParcelizer.menuHostHelperlambda0);
                        sb.append(androidCompositionLocals_androidKtLocalImageVectorCache1.write);
                    } else {
                        sb.append(" ext. ");
                        sb.append(androidCompositionLocals_androidKtLocalImageVectorCache1.write);
                    }
                }
                serializer(i2, getlocalsavedstateregistryowner, sb);
            } else {
                sb.append(string);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    public final int RemoteActionCompatParcelizer(CharSequence charSequence, getLocalSavedStateRegistryOwnerannotations getlocalsavedstateregistryownerannotations, StringBuilder sb, AndroidCompositionLocals_androidKtLocalImageVectorCache1 androidCompositionLocals_androidKtLocalImageVectorCache1) throws NumberParseException {
        AndroidCompositionLocals_androidKtLocalResources1 androidCompositionLocals_androidKtLocalResources1;
        int i = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = getlocalsavedstateregistryownerannotations != null ? getlocalsavedstateregistryownerannotations.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs : "NonMatch";
        if (sb2.length() == 0) {
            androidCompositionLocals_androidKtLocalResources1 = AndroidCompositionLocals_androidKtLocalResources1.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = MediaBrowserCompatMediaItem.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                IconCompatParcelizer(sb2);
                androidCompositionLocals_androidKtLocalResources1 = AndroidCompositionLocals_androidKtLocalResources1.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern patternRemoteActionCompatParcelizer = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RemoteActionCompatParcelizer(str);
                IconCompatParcelizer(sb2);
                Matcher matcher2 = patternRemoteActionCompatParcelizer.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = serializer.matcher(sb2.substring(iEnd));
                    if (matcher3.find() && read((CharSequence) matcher3.group(1)).equals("0")) {
                        androidCompositionLocals_androidKtLocalResources1 = AndroidCompositionLocals_androidKtLocalResources1.FROM_DEFAULT_COUNTRY;
                    } else {
                        sb2.delete(0, iEnd);
                        androidCompositionLocals_androidKtLocalResources1 = AndroidCompositionLocals_androidKtLocalResources1.FROM_NUMBER_WITH_IDD;
                    }
                } else {
                    androidCompositionLocals_androidKtLocalResources1 = AndroidCompositionLocals_androidKtLocalResources1.FROM_DEFAULT_COUNTRY;
                }
            }
        }
        if (androidCompositionLocals_androidKtLocalResources1 != AndroidCompositionLocals_androidKtLocalResources1.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                int length = sb2.length();
                for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                    int i3 = Integer.parseInt(sb2.substring(0, i2));
                    if (this.ResultReceiver.containsKey(Integer.valueOf(i3))) {
                        sb.append(sb2.substring(i2));
                        i = i3;
                        break;
                    }
                }
            }
            if (i == 0) {
                throw new NumberParseException(NumberParseException.RemoteActionCompatParcelizer.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            androidCompositionLocals_androidKtLocalImageVectorCache1.serializer = true;
            androidCompositionLocals_androidKtLocalImageVectorCache1.read = i;
            return i;
        }
        if (getlocalsavedstateregistryownerannotations != null) {
            int i4 = getlocalsavedstateregistryownerannotations.RemoteActionCompatParcelizer;
            String strValueOf = String.valueOf(i4);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1 = getlocalsavedstateregistryownerannotations.serializer;
                IconCompatParcelizer(sb3, getlocalsavedstateregistryownerannotations, null);
                PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if ((!pinnableContainerKtLocalPinnableContainer1.read(sb2, androidCompositionLocals_androidKtLocalView1) && pinnableContainerKtLocalPinnableContainer1.read(sb3, androidCompositionLocals_androidKtLocalView1)) || RemoteActionCompatParcelizer(sb2, getlocalsavedstateregistryownerannotations, getLocalView.UNKNOWN) == noLocalProvidedFor.TOO_LONG) {
                    sb.append((CharSequence) sb3);
                    androidCompositionLocals_androidKtLocalImageVectorCache1.serializer = true;
                    androidCompositionLocals_androidKtLocalImageVectorCache1.read = i4;
                    return i4;
                }
            }
        }
        androidCompositionLocals_androidKtLocalImageVectorCache1.serializer = true;
        androidCompositionLocals_androidKtLocalImageVectorCache1.read = 0;
        return 0;
    }

    public static void serializer(int i, getLocalSavedStateRegistryOwner getlocalsavedstateregistryowner, StringBuilder sb) {
        int iOrdinal = getlocalsavedstateregistryowner.ordinal();
        if (iOrdinal == 0) {
            sb.insert(0, i).insert(0, '+');
        } else if (iOrdinal == 1) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        } else {
            if (iOrdinal != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }
}
