package o;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class getTabContainer {
    public static android.os.LocaleList IconCompatParcelizer(String str) {
        return android.os.LocaleList.forLanguageTags(str);
    }

    public static void RemoteActionCompatParcelizer(TextView textView, android.os.LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
