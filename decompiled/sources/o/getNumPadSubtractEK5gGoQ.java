package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import com.mapbox.common.MapboxServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadSubtractEK5gGoQ implements Iterable, getNumPadMoveHomeEK5gGoQ {
    public final String write;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return new getNumPadSubtractEK5gGoQ(this.write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        return Boolean.valueOf(!this.write.isEmpty());
    }

    public final String toString() {
        String str = this.write;
        return d$$ExternalSyntheticOutline0.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        String str = this.write;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new getNumberEK5gGoQ(this, 1);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return new getNumberEK5gGoQ(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getNumPadSubtractEK5gGoQ) {
            return this.write.equals(((getNumPadSubtractEK5gGoQ) obj).write);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ea A[PHI: r4
  0x02ea: PHI (r4v9 boolean) = (r4v18 boolean), (r4v19 boolean), (r4v22 boolean) binds: [B:101:0x02d6, B:102:0x02d8, B:104:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f4 A[LOOP:0: B:109:0x02f2->B:110:0x02f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0307  */
    /* JADX WARN: Code duplicated, block: B:115:0x0311  */
    /* JADX WARN: Code duplicated, block: B:117:0x031a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0331  */
    /* JADX WARN: Code duplicated, block: B:121:0x033d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0348  */
    /* JADX WARN: Code duplicated, block: B:125:0x0358  */
    /* JADX WARN: Code duplicated, block: B:126:0x036f  */
    /* JADX WARN: Code duplicated, block: B:129:0x037e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0389  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:141:0x03db  */
    /* JADX WARN: Code duplicated, block: B:143:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:147:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:149:0x040b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0413  */
    /* JADX WARN: Code duplicated, block: B:153:0x0422  */
    /* JADX WARN: Code duplicated, block: B:155:0x042c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0438  */
    /* JADX WARN: Code duplicated, block: B:161:0x0451  */
    /* JADX WARN: Code duplicated, block: B:162:0x0454  */
    /* JADX WARN: Code duplicated, block: B:165:0x0471  */
    /* JADX WARN: Code duplicated, block: B:166:0x0474  */
    /* JADX WARN: Code duplicated, block: B:169:0x0488  */
    /* JADX WARN: Code duplicated, block: B:171:0x0490  */
    /* JADX WARN: Code duplicated, block: B:173:0x049d  */
    /* JADX WARN: Code duplicated, block: B:175:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:180:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:182:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:184:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:186:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:188:0x0507  */
    /* JADX WARN: Code duplicated, block: B:190:0x0511  */
    /* JADX WARN: Code duplicated, block: B:192:0x0517  */
    /* JADX WARN: Code duplicated, block: B:195:0x0522 A[LOOP:1: B:193:0x051c->B:195:0x0522, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0545  */
    /* JADX WARN: Code duplicated, block: B:201:0x0551  */
    /* JADX WARN: Code duplicated, block: B:203:0x055b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0590  */
    /* JADX WARN: Code duplicated, block: B:214:0x059a  */
    /* JADX WARN: Code duplicated, block: B:216:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:218:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:222:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:224:0x05e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:225:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:234:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x021c  */
    /* JADX WARN: Code duplicated, block: B:83:0x024a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0254  */
    /* JADX WARN: Code duplicated, block: B:87:0x025d  */
    /* JADX WARN: Code duplicated, block: B:89:0x026c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x027c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0295  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        String str2;
        String str3;
        int iHashCode;
        String str4;
        String strIconCompatParcelizer;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite;
        boolean zEquals;
        getNumPadEnterEK5gGoQ getnumpadenterek5ggoq;
        int i;
        int iSerializer;
        StringBuilder sb;
        int i2;
        Matcher matcher;
        double dDoubleValue;
        double dSerializer;
        String strIconCompatParcelizer2;
        Matcher matcher2;
        double dDoubleValue2;
        double dSerializer2;
        double dMin;
        double length;
        double dSerializer3;
        double dMin2;
        ArrayList arrayList2;
        String strIconCompatParcelizer3;
        long jWrite;
        String[] strArrSplit;
        int length2;
        boolean z;
        int i3;
        int i4;
        boolean zIsEmpty;
        int iSerializer2;
        int length3;
        boolean zIsEmpty2;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer;
        String str5;
        int iIndexOf;
        androidx.transition.TransitionValuesMaps transitionValuesMaps2;
        double dDoubleValue3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !MapboxServices.SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(" is not a String function"));
                    return null;
                }
            }
            iHashCode = str.hashCode();
            str4 = this.write;
            z = false;
            z = false;
            strIconCompatParcelizer = "undefined";
            switch (iHashCode) {
                case -1789698943:
                    if (str.equals("hasOwnProperty")) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 1, "hasOwnProperty");
                        getnumpadmovehomeek5ggoqWrite = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                        zEquals = "length".equals(getnumpadmovehomeek5ggoqWrite.IconCompatParcelizer());
                        getnumpadenterek5ggoq = getNumPadMoveHomeEK5gGoQ.PlaybackStateCompatCustomAction;
                        if (zEquals) {
                            return getnumpadenterek5ggoq;
                        }
                        double dDoubleValue4 = getnumpadmovehomeek5ggoqWrite.write().doubleValue();
                        return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i = (int) dDoubleValue4) < 0 || i >= str4.length()) ? getNumPadMoveHomeEK5gGoQ.MediaSessionCompatToken : getnumpadenterek5ggoq;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -1776922004:
                    if (str.equals("toString")) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toString");
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -1464939364:
                    if (str.equals("toLocaleLowerCase")) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toLocaleLowerCase");
                        return new getNumPadSubtractEK5gGoQ(str4.toLowerCase());
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -1361633751:
                    if (str.equals("charAt")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(1, "charAt", arrayList);
                        iSerializer = arrayList.isEmpty() ? 0 : (int) getTvInputComposite2EK5gGoQ.serializer(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).write().doubleValue());
                        if (iSerializer < 0 && iSerializer < str4.length()) {
                            return new getNumPadSubtractEK5gGoQ(String.valueOf(str4.charAt(iSerializer)));
                        }
                        return getNumPadMoveHomeEK5gGoQ.PlaybackStateCompat;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        if (!arrayList.isEmpty()) {
                            sb = new StringBuilder(str4);
                            for (i2 = 0; i2 < arrayList.size(); i2++) {
                                sb.append(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i2)).IconCompatParcelizer());
                            }
                            return new getNumPadSubtractEK5gGoQ(sb.toString());
                        }
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toLowerCase");
                        return new getNumPadSubtractEK5gGoQ(str4.toLowerCase(java.util.Locale.ENGLISH));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -906336856:
                    if (str.equals(MapboxServices.SEARCH)) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(1, MapboxServices.SEARCH, arrayList);
                        if (!arrayList.isEmpty()) {
                            strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        }
                        matcher = Pattern.compile(strIconCompatParcelizer).matcher(str4);
                        if (matcher.find()) {
                            return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(matcher.start()));
                        }
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(-1.0d));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -726908483:
                    if (str.equals(str2)) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, str2);
                        return new getNumPadSubtractEK5gGoQ(str4.toUpperCase());
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "lastIndexOf", arrayList);
                        if (arrayList.size() > 0) {
                            strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        }
                        String str6 = strIconCompatParcelizer;
                        if (arrayList.size() < 2) {
                            dDoubleValue = Double.NaN;
                        } else {
                            dDoubleValue = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue();
                        }
                        if (Double.isNaN(dDoubleValue)) {
                            dSerializer = Double.POSITIVE_INFINITY;
                        } else {
                            dSerializer = getTvInputComposite2EK5gGoQ.serializer(dDoubleValue);
                        }
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(str4.lastIndexOf(str6, (int) dSerializer)));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toUpperCase");
                        return new getNumPadSubtractEK5gGoQ(str4.toUpperCase(java.util.Locale.ENGLISH));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 3568674:
                    if (str.equals(str3)) {
                        getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toUpperCase");
                        return new getNumPadSubtractEK5gGoQ(str4.trim());
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 103668165:
                    if (str.equals("match")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(1, "match", arrayList);
                        if (arrayList.size() <= 0) {
                            strIconCompatParcelizer2 = "";
                        } else {
                            strIconCompatParcelizer2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        }
                        matcher2 = Pattern.compile(strIconCompatParcelizer2).matcher(str4);
                        if (matcher2.find()) {
                            return new getNumPadDirectionUpEK5gGoQ(Arrays.asList(new getNumPadSubtractEK5gGoQ(matcher2.group())));
                        }
                        return getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "slice", arrayList);
                        if (arrayList.isEmpty()) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).write().doubleValue();
                        }
                        dSerializer2 = getTvInputComposite2EK5gGoQ.serializer(dDoubleValue2);
                        if (dSerializer2 < 0.0d) {
                            dMin = Math.max(((double) str4.length()) + dSerializer2, 0.0d);
                        } else {
                            dMin = Math.min(dSerializer2, str4.length());
                        }
                        if (arrayList.size() > 1) {
                            length = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue();
                        } else {
                            length = str4.length();
                        }
                        dSerializer3 = getTvInputComposite2EK5gGoQ.serializer(length);
                        if (dSerializer3 < 0.0d) {
                            dMin2 = Math.max(((double) str4.length()) + dSerializer3, 0.0d);
                        } else {
                            dMin2 = Math.min(dSerializer3, str4.length());
                        }
                        int i5 = (int) dMin;
                        return new getNumPadSubtractEK5gGoQ(str4.substring(i5, Math.max(0, ((int) dMin2) - i5) + i5));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 109648666:
                    if (str.equals("split")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "split", arrayList);
                        if (str4.length() == 0) {
                            return new getNumPadDirectionUpEK5gGoQ(Arrays.asList(this));
                        }
                        arrayList2 = new ArrayList();
                        if (arrayList.isEmpty()) {
                            arrayList2.add(this);
                        } else {
                            strIconCompatParcelizer3 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                            if (arrayList.size() > 1) {
                                jWrite = ((long) getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())) & 4294967295L;
                            } else {
                                jWrite = 2147483647L;
                            }
                            if (jWrite == 0) {
                                return new getNumPadDirectionUpEK5gGoQ();
                            }
                            strArrSplit = str4.split(Pattern.quote(strIconCompatParcelizer3), ((int) jWrite) + 1);
                            length2 = strArrSplit.length;
                            if (strIconCompatParcelizer3.isEmpty() || length2 <= 0) {
                                i4 = zIsEmpty;
                                z = zIsEmpty;
                                i3 = length2;
                                i4 = z;
                            } else {
                                zIsEmpty = strArrSplit[0].isEmpty();
                                i3 = length2 - 1;
                                if (!strArrSplit[i3].isEmpty()) {
                                    i4 = zIsEmpty;
                                    z = zIsEmpty;
                                    i3 = length2;
                                    i4 = z;
                                }
                            }
                            i4 = zIsEmpty;
                            z = zIsEmpty;
                            if (length2 > jWrite) {
                                i3--;
                            }
                            while (i4 < i3) {
                                arrayList2.add(new getNumPadSubtractEK5gGoQ(strArrSplit[i4]));
                                i4++;
                            }
                        }
                        return new getNumPadDirectionUpEK5gGoQ(arrayList2);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 530542161:
                    if (str.equals("substring")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "substring", arrayList);
                        if (arrayList.isEmpty()) {
                            iSerializer2 = 0;
                        } else {
                            iSerializer2 = (int) getTvInputComposite2EK5gGoQ.serializer(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).write().doubleValue());
                        }
                        if (arrayList.size() > 1) {
                            length3 = (int) getTvInputComposite2EK5gGoQ.serializer(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue());
                        } else {
                            length3 = str4.length();
                        }
                        int iMin = Math.min(Math.max(iSerializer2, 0), str4.length());
                        int iMin2 = Math.min(Math.max(length3, 0), str4.length());
                        return new getNumPadSubtractEK5gGoQ(str4.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 1094496948:
                    if (str.equals("replace")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "replace", arrayList);
                        zIsEmpty2 = arrayList.isEmpty();
                        getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                        if (!zIsEmpty2) {
                            strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                            if (arrayList.size() > 1) {
                                getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                            }
                        }
                        str5 = strIconCompatParcelizer;
                        iIndexOf = str4.indexOf(str5);
                        if (iIndexOf >= 0) {
                            if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer instanceof getNumPadInsertEK5gGoQ) {
                                getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = ((getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer).RemoteActionCompatParcelizer(transitionValuesMaps, Arrays.asList(new getNumPadSubtractEK5gGoQ(str5), new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(iIndexOf)), this));
                            }
                            String strSubstring = str4.substring(0, iIndexOf);
                            String strIconCompatParcelizer4 = getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer();
                            String strSubstring2 = str4.substring(str5.length() + iIndexOf);
                            return new getNumPadSubtractEK5gGoQ(d$$ExternalSyntheticOutline0.m(new StringBuilder(strSubstring.length() + String.valueOf(strIconCompatParcelizer4).length() + strSubstring2.length()), strSubstring, strIconCompatParcelizer4, strSubstring2));
                        }
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "indexOf", arrayList);
                        if (arrayList.size() <= 0) {
                            transitionValuesMaps2 = transitionValuesMaps;
                        } else {
                            transitionValuesMaps2 = transitionValuesMaps;
                            strIconCompatParcelizer = ((zzz) transitionValuesMaps2.MediaDescriptionCompat).write(transitionValuesMaps2, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        }
                        String str7 = strIconCompatParcelizer;
                        if (arrayList.size() < 2) {
                            dDoubleValue3 = 0.0d;
                        } else {
                            dDoubleValue3 = ((zzz) transitionValuesMaps2.MediaDescriptionCompat).write(transitionValuesMaps2, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue();
                        }
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(str4.indexOf(str7, (int) getTvInputComposite2EK5gGoQ.serializer(dDoubleValue3))));
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                    return null;
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        iHashCode = str.hashCode();
        str4 = this.write;
        z = false;
        z = false;
        strIconCompatParcelizer = "undefined";
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 1, "hasOwnProperty");
                    getnumpadmovehomeek5ggoqWrite = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                    zEquals = "length".equals(getnumpadmovehomeek5ggoqWrite.IconCompatParcelizer());
                    getnumpadenterek5ggoq = getNumPadMoveHomeEK5gGoQ.PlaybackStateCompatCustomAction;
                    if (zEquals) {
                        return getnumpadenterek5ggoq;
                    }
                    double dDoubleValue5 = getnumpadmovehomeek5ggoqWrite.write().doubleValue();
                    if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                    }
                    break;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toString");
                    return this;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toLocaleLowerCase");
                    return new getNumPadSubtractEK5gGoQ(str4.toLowerCase());
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(1, "charAt", arrayList);
                    if (arrayList.isEmpty()) {
                    }
                    if (iSerializer < 0) {
                        break;
                    }
                    return getNumPadMoveHomeEK5gGoQ.PlaybackStateCompat;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        sb = new StringBuilder(str4);
                        while (i2 < arrayList.size()) {
                            sb.append(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(i2)).IconCompatParcelizer());
                        }
                        return new getNumPadSubtractEK5gGoQ(sb.toString());
                    }
                    return this;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toLowerCase");
                    return new getNumPadSubtractEK5gGoQ(str4.toLowerCase(java.util.Locale.ENGLISH));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -906336856:
                if (str.equals(MapboxServices.SEARCH)) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(1, MapboxServices.SEARCH, arrayList);
                    if (!arrayList.isEmpty()) {
                        strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                    }
                    matcher = Pattern.compile(strIconCompatParcelizer).matcher(str4);
                    if (matcher.find()) {
                        return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(matcher.start()));
                    }
                    return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(-1.0d));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -726908483:
                if (str.equals(str2)) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, str2);
                    return new getNumPadSubtractEK5gGoQ(str4.toUpperCase());
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                    }
                    String str8 = strIconCompatParcelizer;
                    if (arrayList.size() < 2) {
                        dDoubleValue = Double.NaN;
                    } else {
                        dDoubleValue = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue)) {
                        dSerializer = Double.POSITIVE_INFINITY;
                    } else {
                        dSerializer = getTvInputComposite2EK5gGoQ.serializer(dDoubleValue);
                    }
                    return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(str4.lastIndexOf(str8, (int) dSerializer)));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toUpperCase");
                    return new getNumPadSubtractEK5gGoQ(str4.toUpperCase(java.util.Locale.ENGLISH));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "toUpperCase");
                    return new getNumPadSubtractEK5gGoQ(str4.trim());
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(1, "match", arrayList);
                    if (arrayList.size() <= 0) {
                        strIconCompatParcelizer2 = "";
                    } else {
                        strIconCompatParcelizer2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                    }
                    matcher2 = Pattern.compile(strIconCompatParcelizer2).matcher(str4);
                    if (matcher2.find()) {
                        return new getNumPadDirectionUpEK5gGoQ(Arrays.asList(new getNumPadSubtractEK5gGoQ(matcher2.group())));
                    }
                    return getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "slice", arrayList);
                    if (arrayList.isEmpty()) {
                        dDoubleValue2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).write().doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    dSerializer2 = getTvInputComposite2EK5gGoQ.serializer(dDoubleValue2);
                    if (dSerializer2 < 0.0d) {
                        dMin = Math.max(((double) str4.length()) + dSerializer2, 0.0d);
                    } else {
                        dMin = Math.min(dSerializer2, str4.length());
                    }
                    if (arrayList.size() > 1) {
                        length = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue();
                    } else {
                        length = str4.length();
                    }
                    dSerializer3 = getTvInputComposite2EK5gGoQ.serializer(length);
                    if (dSerializer3 < 0.0d) {
                        dMin2 = Math.max(((double) str4.length()) + dSerializer3, 0.0d);
                    } else {
                        dMin2 = Math.min(dSerializer3, str4.length());
                    }
                    int i6 = (int) dMin;
                    return new getNumPadSubtractEK5gGoQ(str4.substring(i6, Math.max(0, ((int) dMin2) - i6) + i6));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "split", arrayList);
                    if (str4.length() == 0) {
                        return new getNumPadDirectionUpEK5gGoQ(Arrays.asList(this));
                    }
                    arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        strIconCompatParcelizer3 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        if (arrayList.size() > 1) {
                            jWrite = ((long) getTvInputComposite2EK5gGoQ.write(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue())) & 4294967295L;
                        } else {
                            jWrite = 2147483647L;
                        }
                        if (jWrite == 0) {
                            return new getNumPadDirectionUpEK5gGoQ();
                        }
                        strArrSplit = str4.split(Pattern.quote(strIconCompatParcelizer3), ((int) jWrite) + 1);
                        length2 = strArrSplit.length;
                        if (strIconCompatParcelizer3.isEmpty()) {
                            i4 = zIsEmpty;
                            z = zIsEmpty;
                            i3 = length2;
                            i4 = z;
                        } else {
                            i4 = zIsEmpty;
                            z = zIsEmpty;
                            i3 = length2;
                            i4 = z;
                        }
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        if (length2 > jWrite) {
                            i3--;
                        }
                        while (i4 < i3) {
                            arrayList2.add(new getNumPadSubtractEK5gGoQ(strArrSplit[i4]));
                            i4++;
                        }
                    }
                    return new getNumPadDirectionUpEK5gGoQ(arrayList2);
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "substring", arrayList);
                    if (arrayList.isEmpty()) {
                        iSerializer2 = (int) getTvInputComposite2EK5gGoQ.serializer(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).write().doubleValue());
                    } else {
                        iSerializer2 = 0;
                    }
                    if (arrayList.size() > 1) {
                        length3 = (int) getTvInputComposite2EK5gGoQ.serializer(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue());
                    } else {
                        length3 = str4.length();
                    }
                    int iMin3 = Math.min(Math.max(iSerializer2, 0), str4.length());
                    int iMin4 = Math.min(Math.max(length3, 0), str4.length());
                    return new getNumPadSubtractEK5gGoQ(str4.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "replace", arrayList);
                    zIsEmpty2 = arrayList.isEmpty();
                    getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
                    if (!zIsEmpty2) {
                        strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                        if (arrayList.size() > 1) {
                            getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                        }
                    }
                    str5 = strIconCompatParcelizer;
                    iIndexOf = str4.indexOf(str5);
                    if (iIndexOf >= 0) {
                        if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer instanceof getNumPadInsertEK5gGoQ) {
                            getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = ((getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer).RemoteActionCompatParcelizer(transitionValuesMaps, Arrays.asList(new getNumPadSubtractEK5gGoQ(str5), new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring3 = str4.substring(0, iIndexOf);
                        String strIconCompatParcelizer5 = getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer();
                        String strSubstring4 = str4.substring(str5.length() + iIndexOf);
                        return new getNumPadSubtractEK5gGoQ(d$$ExternalSyntheticOutline0.m(new StringBuilder(strSubstring3.length() + String.valueOf(strIconCompatParcelizer5).length() + strSubstring4.length()), strSubstring3, strIconCompatParcelizer5, strSubstring4));
                    }
                    return this;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        transitionValuesMaps2 = transitionValuesMaps;
                    } else {
                        transitionValuesMaps2 = transitionValuesMaps;
                        strIconCompatParcelizer = ((zzz) transitionValuesMaps2.MediaDescriptionCompat).write(transitionValuesMaps2, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                    }
                    String str9 = strIconCompatParcelizer;
                    if (arrayList.size() < 2) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = ((zzz) transitionValuesMaps2.MediaDescriptionCompat).write(transitionValuesMaps2, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1)).write().doubleValue();
                    }
                    return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(str4.indexOf(str9, (int) getTvInputComposite2EK5gGoQ.serializer(dDoubleValue3))));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Command not supported");
                return null;
        }
    }

    public getNumPadSubtractEK5gGoQ(String str) {
        if (str != null) {
            this.write = str;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("StringValue cannot be null.");
            throw null;
        }
    }
}
