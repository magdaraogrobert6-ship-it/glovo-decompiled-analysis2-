package androidx.compose.ui.text.intl;

import androidx.sqlite.SQLite;
import java.util.List;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        Object[] objArr = {new Locale(java.util.Locale.getDefault())};
        int iSerializer = getQueryParameterslambda2.serializer();
        return new LocaleList((List<Locale>) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
