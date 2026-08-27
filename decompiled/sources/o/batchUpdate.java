package o;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class batchUpdate implements Comparator<readIntlambda0> {
    @Override // java.util.Comparator
    public final int compare(readIntlambda0 readintlambda0, readIntlambda0 readintlambda1) {
        return Long.compare(readintlambda0.read, readintlambda1.read);
    }
}
