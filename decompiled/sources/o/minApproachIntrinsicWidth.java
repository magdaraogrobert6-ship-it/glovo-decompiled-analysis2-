package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class minApproachIntrinsicWidth {
    public static String IconCompatParcelizer(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strWrite;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strWrite = "null";
            } else {
                try {
                    strWrite = obj.toString();
                } catch (Exception e) {
                    String strM = af$$ExternalSyntheticOutline0.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e);
                    strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("<", strM, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strWrite;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
