package o;

import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d0$$ExternalSyntheticLambda4;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isCurrentlyDisplayingInAppMessage extends DelayKt {
    public static String MediaDescriptionCompat(String str) {
        String str2;
        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            List listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str);
            int length = str.length();
            listRemoteActionCompatParcelizer.size();
            BrazeInAppMessageManagerExternalSyntheticLambda45 brazeInAppMessageManagerExternalSyntheticLambda45 = new BrazeInAppMessageManagerExternalSyntheticLambda45(25);
            int size = listRemoteActionCompatParcelizer.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : listRemoteActionCompatParcelizer) {
                if (i >= 0) {
                    String str3 = (String) obj;
                    if ((i == 0 || i == size - 1) && hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                        str3 = null;
                    } else {
                        int length2 = str3.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                i2 = -1;
                                break;
                            }
                            if (!((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Character.valueOf(str3.charAt(i2))}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue()) {
                                break;
                            }
                            i2++;
                        }
                        String strSubstring = (i2 != -1 && setCarryoverInAppMessage.RemoteActionCompatParcelizer(i2, str3, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, false)) ? str3.substring(1 + i2) : null;
                        if (strSubstring != null && (str2 = (String) brazeInAppMessageManagerExternalSyntheticLambda45.invoke(strSubstring)) != null) {
                            str3 = str2;
                        }
                    }
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                    i++;
                } else {
                    androidx.sqlite.SQLite.serializer();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            onContentCardDismissed.IconCompatParcelizer(arrayList, sb, (Navigator$$ExternalSyntheticLambda1) null, 124);
            return sb.toString();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("marginPrefix must be non-blank string.");
        return null;
    }

    public static String serializer(String str) {
        return resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(new verifyOrientationStatuslambda3(new verifyOrientationStatuslambda2(3, str), new d0$$ExternalSyntheticLambda4("    ", 22)), "\n");
    }

    public static String MediaSessionCompatQueueItem(String str) {
        int length;
        List listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str);
        List list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Character.valueOf(str2.charAt(length))}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue()) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) onContentCardDismissed.RatingCompat((Iterable) arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listRemoteActionCompatParcelizer.size();
        BrazeInAppMessageManagerExternalSyntheticLambda45 brazeInAppMessageManagerExternalSyntheticLambda45 = new BrazeInAppMessageManagerExternalSyntheticLambda45(25);
        int size = listRemoteActionCompatParcelizer.size();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            String str3 = null;
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                onContentCardDismissed.IconCompatParcelizer(arrayList3, sb, (Navigator$$ExternalSyntheticLambda1) null, 124);
                return sb.toString();
            }
            Object next = it2.next();
            if (length < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            String str4 = (String) next;
            if ((length != 0 && length != size - 1) || !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4)) {
                str4.getClass();
                if (iIntValue < 0) {
                    DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str4.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                str3 = (String) brazeInAppMessageManagerExternalSyntheticLambda45.invoke(str4.substring(length4));
                if (str3 == null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length++;
        }
    }
}
