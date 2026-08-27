package app.cash.sqldelight.driver.android;

import java.io.IOException;
import o.luminance8_81llA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class AndroidPreparedStatement implements AndroidStatement {
    private final luminance8_81llA statement;

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public void close() throws IOException {
        this.statement.close();
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public long execute() {
        return this.statement.RemoteActionCompatParcelizer();
    }

    public AndroidPreparedStatement(luminance8_81llA luminance8_81lla) {
        luminance8_81lla.getClass();
        this.statement = luminance8_81lla;
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public <R> R executeQuery(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindBoolean(int i, Boolean bool) {
        luminance8_81llA luminance8_81lla = this.statement;
        if (bool == null) {
            luminance8_81lla.serializer(i + 1);
        } else {
            luminance8_81lla.IconCompatParcelizer(i + 1, bool.booleanValue() ? 1L : 0L);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindBytes(int i, byte[] bArr) {
        luminance8_81llA luminance8_81lla = this.statement;
        int i2 = i + 1;
        if (bArr == null) {
            luminance8_81lla.serializer(i2);
        } else {
            luminance8_81lla.IconCompatParcelizer(i2, bArr);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindDouble(int i, Double d) {
        luminance8_81llA luminance8_81lla = this.statement;
        int i2 = i + 1;
        if (d == null) {
            luminance8_81lla.serializer(i2);
        } else {
            luminance8_81lla.write(d.doubleValue(), i2);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindLong(int i, Long l) {
        luminance8_81llA luminance8_81lla = this.statement;
        int i2 = i + 1;
        if (l == null) {
            luminance8_81lla.serializer(i2);
        } else {
            luminance8_81lla.IconCompatParcelizer(i2, l.longValue());
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindString(int i, String str) {
        luminance8_81llA luminance8_81lla = this.statement;
        int i2 = i + 1;
        if (str == null) {
            luminance8_81lla.serializer(i2);
        } else {
            luminance8_81lla.serializer(i2, str);
        }
    }
}
