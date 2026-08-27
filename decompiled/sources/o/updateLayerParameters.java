package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class updateLayerParameters {
    public static String write(setWrappedByui setwrappedbyui) {
        StringBuilder sb = new StringBuilder();
        int size = setwrappedbyui.IconCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append((char) 1);
                sb.append((char) 1);
            }
            String strRemoteActionCompatParcelizer = setwrappedbyui.RemoteActionCompatParcelizer(i);
            int length = strRemoteActionCompatParcelizer.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strRemoteActionCompatParcelizer.charAt(i2);
                if (cCharAt == 0) {
                    sb.append((char) 1);
                    sb.append((char) 16);
                } else if (cCharAt != 1) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) 1);
                    sb.append((char) 17);
                }
            }
        }
        sb.append((char) 1);
        sb.append((char) 1);
        return sb.toString();
    }

    public static shareWithSiblings RemoteActionCompatParcelizer(String str) {
        List list;
        int length = str.length();
        getRectManager.RemoteActionCompatParcelizer(length >= 2, "Invalid path \"%s\"", str);
        if (length == 2) {
            getRectManager.RemoteActionCompatParcelizer(str.charAt(0) == 1 && str.charAt(1) == 1, "Non-empty path \"%s\" had length 2", str);
            list = Collections.EMPTY_LIST;
        } else {
            int length2 = str.length();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < length) {
                int iIndexOf = str.indexOf(1, i);
                if (iIndexOf < 0 || iIndexOf > length2 - 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid encoded resource path: \"", str, "\""));
                    return null;
                }
                int i2 = iIndexOf + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt == 1) {
                    String strSubstring = str.substring(i, iIndexOf);
                    if (sb.length() != 0) {
                        sb.append(strSubstring);
                        strSubstring = sb.toString();
                        sb.setLength(0);
                    }
                    arrayList.add(strSubstring);
                } else if (cCharAt == 16) {
                    sb.append(str.substring(i, iIndexOf));
                    sb.append((char) 0);
                } else {
                    if (cCharAt != 17) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Invalid encoded resource path: \"", str, "\""));
                        return null;
                    }
                    sb.append(str.substring(i, i2));
                }
                i = iIndexOf + 2;
            }
            list = arrayList;
        }
        shareWithSiblings sharewithsiblings = shareWithSiblings.serializer;
        return list.isEmpty() ? shareWithSiblings.serializer : new shareWithSiblings(list);
    }
}
