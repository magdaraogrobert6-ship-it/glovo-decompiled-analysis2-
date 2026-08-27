package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsStateScopelayout1 extends Measurable {
    public String RemoteActionCompatParcelizer;
    public long read;

    public final String MediaSessionCompatQueueItem() {
        ComponentActivity();
        return this.RemoteActionCompatParcelizer;
    }

    public final long serializer() {
        ComponentActivity();
        return this.read;
    }

    @Override // o.Measurable
    public final boolean read() {
        Calendar calendar = Calendar.getInstance();
        this.read = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        java.util.Locale locale = java.util.Locale.getDefault();
        String language = locale.getLanguage();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.RemoteActionCompatParcelizer = d$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public LayoutNodeSubcompositionsStateScopelayout1(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
    }
}
