package com.incognia.internal;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStackannotations;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x33 {
    public static String BGx(String str, String[][] strArr) {
        CharSequence charSequenceSubSequence;
        int i = 0;
        String[] strArr2 = strArr[0];
        strArr2.getClass();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = new ensureSubscribedToInAppMessageEventslambda7(0, strArr2.length - 1, 1);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it.RemoteActionCompatParcelizer) {
                break;
            }
            int iRemoteActionCompatParcelizer = it.RemoteActionCompatParcelizer();
            if (strArr.length != 0) {
                numValueOf = Integer.valueOf(strArr[0][iRemoteActionCompatParcelizer].length());
                getInAppMessageStackannotations it2 = new ensureSubscribedToInAppMessageEventslambda7(1, strArr.length - 1, 1).iterator();
                while (it2.RemoteActionCompatParcelizer) {
                    Integer numValueOf2 = Integer.valueOf(strArr[it2.RemoteActionCompatParcelizer()][iRemoteActionCompatParcelizer].length());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            }
            arrayList.add(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
        }
        Iterator it3 = arrayList.iterator();
        int iIntValue = 0;
        while (it3.hasNext()) {
            iIntValue += ((Number) it3.next()).intValue();
        }
        int length = (strArr[0].length * 2) + 2 + iIntValue;
        String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(length, "═");
        StringBuilder sb = new StringBuilder(" \n");
        sb.append(String.format("╔%s╗\n", Arrays.copyOf(new Object[]{strRemoteActionCompatParcelizer}, 1)));
        sb.append("║ ");
        int length2 = (length - 2) - str.length();
        int i2 = length2 / 2;
        sb.append(setCarryoverInAppMessage.RemoteActionCompatParcelizer(i2, " ") + str + setCarryoverInAppMessage.RemoteActionCompatParcelizer(length2 - i2, " "));
        sb.append(" ║\n");
        sb.append(String.format("╠%s╣\n", Arrays.copyOf(new Object[]{strRemoteActionCompatParcelizer}, 1)));
        int length3 = strArr.length;
        int i3 = 0;
        while (i3 < length3) {
            sb.append("║ ");
            int length4 = strArr[i3].length;
            int i4 = i;
            while (i4 < length4) {
                String str2 = strArr[i3][i4];
                int iIntValue2 = ((Number) arrayList.get(i4)).intValue();
                str2.getClass();
                if (iIntValue2 >= 0) {
                    if (iIntValue2 <= str2.length()) {
                        charSequenceSubSequence = str2.subSequence(i, str2.length());
                    } else {
                        StringBuilder sb2 = new StringBuilder(iIntValue2);
                        sb2.append((CharSequence) str2);
                        int length5 = iIntValue2 - str2.length();
                        if (1 <= length5) {
                            int i5 = 1;
                            while (true) {
                                sb2.append(' ');
                                if (i5 == length5) {
                                    break;
                                }
                                i5++;
                            }
                        }
                        charSequenceSubSequence = sb2;
                    }
                    sb.append(charSequenceSubSequence.toString());
                    sb.append(" ║ ");
                    i4++;
                    i = 0;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(iIntValue2, "Desired length ", " is less than zero."));
                    return null;
                }
            }
            sb.delete(sb.length() - 3, sb.length());
            sb.append(" ║\n");
            i3++;
            i = 0;
        }
        sb.append(String.format("╚%s╝\n", Arrays.copyOf(new Object[]{strRemoteActionCompatParcelizer}, 1)));
        return sb.toString();
    }
}
