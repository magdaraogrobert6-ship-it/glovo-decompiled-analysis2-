package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageEventMap implements Serializable {
    public final Pattern nativePattern;

    public final String toString() {
        String string = this.nativePattern.toString();
        string.getClass();
        return string;
    }

    public getInAppMessageEventMap(String str, registerInAppMessageManager registerinappmessagemanager) {
        str.getClass();
        registerinappmessagemanager.getClass();
        int value = registerinappmessagemanager.getValue();
        Pattern patternCompile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        patternCompile.getClass();
        this.nativePattern = patternCompile;
    }

    public static getIsCurrentlyDisplayingInAppMessage read(getInAppMessageEventMap getinappmessageeventmap, String str) {
        getinappmessageeventmap.getClass();
        str.getClass();
        Matcher matcher = getinappmessageeventmap.nativePattern.matcher(str);
        matcher.getClass();
        return RegexKt.write(matcher, 0, str);
    }

    public static resetAfterInAppMessageCloselambda1 write(getInAppMessageEventMap getinappmessageeventmap, String str) {
        getinappmessageeventmap.getClass();
        str.getClass();
        int i = 0;
        if (str.length() >= 0) {
            return new resetAfterInAppMessageCloselambda1(getUnregisteredInAppMessage.read, new getPendingWebViewPauseRunnableandroid_sdk_ui_release(getinappmessageeventmap, i, str));
        }
        DrawableTransformation.RemoteActionCompatParcelizer(str.length(), ff$$ExternalSyntheticOutline0.m(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    public final getIsCurrentlyDisplayingInAppMessage IconCompatParcelizer(String str) {
        str.getClass();
        Matcher matcher = this.nativePattern.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new getIsCurrentlyDisplayingInAppMessage(matcher, str);
        }
        return null;
    }

    public final boolean read(CharSequence charSequence) {
        charSequence.getClass();
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String serializer(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        Matcher matcher = this.nativePattern.matcher(str);
        matcher.getClass();
        int i = 0;
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageWrite = RegexKt.write(matcher, 0, str);
        if (getiscurrentlydisplayinginappmessageWrite == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, getiscurrentlydisplayinginappmessageWrite.serializer().write);
            sb.append((CharSequence) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getiscurrentlydisplayinginappmessageWrite));
            i = getiscurrentlydisplayinginappmessageWrite.serializer().read + 1;
            getiscurrentlydisplayinginappmessageWrite = getiscurrentlydisplayinginappmessageWrite.RemoteActionCompatParcelizer();
            if (i >= length) {
                break;
            }
        } while (getiscurrentlydisplayinginappmessageWrite != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final List write(int i, CharSequence charSequence) {
        charSequence.getClass();
        hideCurrentlyDisplayingInAppMessage.read(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            Object[] objArr = {charSequence.toString()};
            int iSerializer = getQueryParameterslambda2.serializer();
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final getIsCurrentlyDisplayingInAppMessage write(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.nativePattern.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new getIsCurrentlyDisplayingInAppMessage(matcherRegion, str);
        }
        return null;
    }

    public final boolean write(CharSequence charSequence) {
        charSequence.getClass();
        return this.nativePattern.matcher(charSequence).find();
    }

    public getInAppMessageEventMap(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.nativePattern = patternCompile;
    }

    public final String RemoteActionCompatParcelizer(String str, String str2) {
        str.getClass();
        String strReplaceAll = this.nativePattern.matcher(str).replaceAll(str2);
        strReplaceAll.getClass();
        return strReplaceAll;
    }
}
