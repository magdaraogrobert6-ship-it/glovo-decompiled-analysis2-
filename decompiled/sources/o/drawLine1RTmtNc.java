package o;

import io.sentry.util.UrlUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class drawLine1RTmtNc {
    public final getPrimaries IconCompatParcelizer;
    public final eotfFunclambda0 RemoteActionCompatParcelizer;
    public final List write;

    public drawLine1RTmtNc(eotfFunclambda0 eotffunclambda0, getPrimaries getprimaries) {
        List list = Collections.EMPTY_LIST;
        UrlUtils.serializer(eotffunclambda0, "Argument must not be null");
        this.RemoteActionCompatParcelizer = eotffunclambda0;
        UrlUtils.serializer(list, "Argument must not be null");
        this.write = list;
        UrlUtils.serializer(getprimaries, "Argument must not be null");
        this.IconCompatParcelizer = getprimaries;
    }
}
