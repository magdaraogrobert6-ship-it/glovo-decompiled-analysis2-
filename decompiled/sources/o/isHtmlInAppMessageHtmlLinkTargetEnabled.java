package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class isHtmlInAppMessageHtmlLinkTargetEnabled {
    public static final Pattern IconCompatParcelizer = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String read;
    public final String write;

    public final String toString() {
        return this.write;
    }

    public static isHtmlInAppMessageHtmlLinkTargetEnabled IconCompatParcelizer(String str) {
        Matcher matcher = IconCompatParcelizer.matcher(str);
        if (!matcher.lookingAt()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m('\"', "No subtype found for: \"", str));
            return null;
        }
        String strGroup = matcher.group(1);
        java.util.Locale locale = java.util.Locale.US;
        strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = RemoteActionCompatParcelizer.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 1, strGroup3);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \""), str, '\"'));
                    return null;
                }
                str2 = strGroup3;
            }
        }
        return new isHtmlInAppMessageHtmlLinkTargetEnabled(str, str2);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public isHtmlInAppMessageHtmlLinkTargetEnabled(String str, String str2) {
        this.write = str;
        this.read = str2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof isHtmlInAppMessageHtmlLinkTargetEnabled) && ((isHtmlInAppMessageHtmlLinkTargetEnabled) obj).write.equals(this.write);
    }
}
