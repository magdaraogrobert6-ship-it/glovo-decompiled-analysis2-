package o;

import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.ui.maps.util.LimitedQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hideCurrentlyDisplayingInAppMessage extends setCarryoverInAppMessage {
    public static createBrazeUserChangeEventSubscriberandroid_sdk_ui_release serializer(String str, char[] cArr) {
        read(0);
        return new createBrazeUserChangeEventSubscriberandroid_sdk_ui_release(str, 0, new Updater$$ExternalSyntheticLambda1(16, cArr));
    }

    public static List RemoteActionCompatParcelizer(String str) {
        displayInAppMessage displayinappmessage = new displayInAppMessage(str);
        if (!displayinappmessage.hasNext()) {
            return instance_delegatelambda0.write;
        }
        Object next = displayinappmessage.next();
        if (!displayinappmessage.hasNext()) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{next}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (displayinappmessage.hasNext()) {
            arrayList.add(displayinappmessage.next());
        }
        return arrayList;
    }

    public static String read(int i, String str) {
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return write(length, str);
    }

    public static String IconCompatParcelizer(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iSerializer = serializer(c, 0, 6, str);
        if (iSerializer == -1) {
            return str2;
        }
        return str.substring(iSerializer + 1, str.length());
    }

    public static String IconCompatParcelizer(String str, char c) {
        str.getClass();
        str.getClass();
        int iWrite = write((CharSequence) str, c, 0, false, 6);
        return iWrite == -1 ? str : str.substring(0, iWrite);
    }

    public static String IconCompatParcelizer(String str, String str2) {
        str.getClass();
        str.getClass();
        int iWrite = write(6, str, str2);
        if (iWrite == -1) {
            return str;
        }
        return str.substring(str2.length() + iWrite, str.length());
    }

    public static String IconCompatParcelizer(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (!onContentCardClicked.RemoteActionCompatParcelizer(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static StringBuilder IconCompatParcelizer(String str, int i, int i2, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        if (i2 < i) {
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, i);
        sb.append(charSequence);
        sb.append((CharSequence) str, i2, str.length());
        return sb;
    }

    public static boolean IconCompatParcelizer(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return setCarryoverInAppMessage.read((String) charSequence, (String) charSequence2, false);
        }
        return serializer(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static boolean IconCompatParcelizer(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (write(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (write(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static final int RemoteActionCompatParcelizer(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? write(charSequence, (CharSequence) str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static String RemoteActionCompatParcelizer(String str, char c) {
        str.getClass();
        str.getClass();
        int iSerializer = serializer(c, 0, 6, str);
        return iSerializer == -1 ? str : str.substring(0, iSerializer);
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        str.getClass();
        str2.getClass();
        return IconCompatParcelizer((CharSequence) str, (CharSequence) str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static final String read(CharSequence charSequence, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) {
        charSequence.getClass();
        ensuresubscribedtoinappmessageeventslambda7.getClass();
        return charSequence.subSequence(ensuresubscribedtoinappmessageeventslambda7.write, ensuresubscribedtoinappmessageeventslambda7.read + 1).toString();
    }

    public static String read(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!onContentCardClicked.RemoteActionCompatParcelizer(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static final boolean serializer(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!TuplesKt.IconCompatParcelizer(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static boolean serializer(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? setCarryoverInAppMessage.RemoteActionCompatParcelizer((String) charSequence, (String) charSequence2, false) : serializer(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static char write(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        DrawableTransformation.write("Char sequence is empty.");
        return (char) 0;
    }

    public static String write(String str, String str2) {
        str.getClass();
        str2.getClass();
        return serializer((CharSequence) str, (CharSequence) str2) ? str.substring(str2.length()) : str;
    }

    public static String RemoteActionCompatParcelizer(String str, String str2, String str3) {
        return (str.length() >= str3.length() + str2.length() && serializer((CharSequence) str, (CharSequence) str2) && IconCompatParcelizer((CharSequence) str, (CharSequence) str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    public static final List read(CharSequence charSequence, int i, String str) {
        read(i);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(charSequence, str, 0, false);
        if (iRemoteActionCompatParcelizer == -1 || i == 1) {
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{charSequence.toString()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iRemoteActionCompatParcelizer).toString());
            length = str.length() + iRemoteActionCompatParcelizer;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(charSequence, str, length, false);
        } while (iRemoteActionCompatParcelizer != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static int write(int i, String str, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static String IconCompatParcelizer(int i, String str) {
        str.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static String IconCompatParcelizer(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        int iWrite = write((CharSequence) str, str2, 0, false, 6);
        if (iWrite == -1) {
            return str3;
        }
        return str.substring(str2.length() + iWrite, str.length());
    }

    public static final void read(int i) {
        if (i >= 0) {
            return;
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Limit must be non-negative, but was "));
    }

    public static boolean read(CharSequence charSequence, char c) {
        charSequence.getClass();
        return write(charSequence, c, 0, false, 2) >= 0;
    }

    public static String serializer(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean serializer(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Character.valueOf(charSequence.charAt(i))}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static String write(int i, String str) {
        str.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static Boolean write(String str) {
        str.getClass();
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int IconCompatParcelizer(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        char c = 0;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                DrawableTransformation.write("Array is empty.");
            } else if (length == 1) {
                c = cArr[0];
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(c, i);
        }
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length() - 1;
        if (i > length2) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (TuplesKt.IconCompatParcelizer(c2, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length2) {
                return -1;
            }
            i++;
        }
    }

    public static List serializer(CharSequence charSequence, String[] strArr, int i) {
        int i2 = 0;
        int i3 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        int i4 = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return read(charSequence, i3, str);
            }
        }
        read(i3);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        LimitedQueue limitedQueue = new LimitedQueue(i4, new createBrazeUserChangeEventSubscriberandroid_sdk_ui_release(charSequence, i3, new StringsKt__StringsKt$$ExternalSyntheticLambda1(i2, listAsList)));
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(limitedQueue, 10));
        Iterator it = limitedQueue.iterator();
        while (true) {
            getCarryoverInAppMessage getcarryoverinappmessage = (getCarryoverInAppMessage) it;
            if (!getcarryoverinappmessage.hasNext()) {
                return arrayList;
            }
            arrayList.add(read(charSequence, (ensureSubscribedToInAppMessageEventslambda7) getcarryoverinappmessage.next()));
        }
    }

    public static final int write(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations = new ensureSubscribedToInAppMessageEventslambda7(i, i2, 1);
        } else {
            charSequence.getClass();
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i = length2;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations = new getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.serializer;
        int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.read;
        int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.write;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(0, i5, str.length(), str, (String) charSequence, z)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!serializer(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int write(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        charSequence.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return IconCompatParcelizer(charSequence, new char[]{c}, i, z);
    }

    public static String write(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zRemoteActionCompatParcelizer) {
                    break;
                }
                length--;
            } else if (zRemoteActionCompatParcelizer) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static int serializer(char c, int i, int i2, String str) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }

    public static String RemoteActionCompatParcelizer(char c, String str, String str2) {
        str.getClass();
        int iWrite = write((CharSequence) str, c, 0, false, 6);
        return iWrite == -1 ? str2 : str.substring(iWrite + 1, str.length());
    }

    public static /* synthetic */ int write(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return RemoteActionCompatParcelizer(charSequence, str, i, z);
    }

    public static CharSequence IconCompatParcelizer(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            Object[] objArr = {Character.valueOf(str.charAt(i))};
            if (!((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue()) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static CharSequence read(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Character.valueOf(str.charAt(length))}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue()) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static boolean write(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && TuplesKt.IconCompatParcelizer(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static CharSequence read(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = ((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{Character.valueOf(charSequence.charAt(!z ? i : length))}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static List RemoteActionCompatParcelizer(String str, char[] cArr) {
        int i = 1;
        if (cArr.length == 1) {
            return read(str, 0, String.valueOf(cArr[0]));
        }
        LimitedQueue limitedQueue = new LimitedQueue(i, serializer(str, cArr));
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(limitedQueue, 10));
        Iterator it = limitedQueue.iterator();
        while (true) {
            getCarryoverInAppMessage getcarryoverinappmessage = (getCarryoverInAppMessage) it;
            if (!getcarryoverinappmessage.hasNext()) {
                return arrayList;
            }
            arrayList.add(read(str, (ensureSubscribedToInAppMessageEventslambda7) getcarryoverinappmessage.next()));
        }
    }
}
