package app.cash.sqldelight.logs;

import app.cash.sqldelight.db.SqlPreparedStatement;
import java.util.ArrayList;
import java.util.List;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes4.dex */
public final class StatementParameterInterceptor implements SqlPreparedStatement {
    private final List<Object> values = new ArrayList();

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindBoolean(int i, Boolean bool) {
        this.values.add(bool);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindBytes(int i, byte[] bArr) {
        this.values.add(bArr);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindDouble(int i, Double d) {
        this.values.add(d);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindLong(int i, Long l) {
        this.values.add(l);
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindString(int i, String str) {
        this.values.add(str);
    }

    public final List<Object> getAndClearParameters() {
        List<Object> listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(this.values);
        this.values.clear();
        return listPlaybackStateCompat;
    }
}
