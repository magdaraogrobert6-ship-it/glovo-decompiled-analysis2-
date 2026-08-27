package app.cash.sqldelight.driver.android;

import android.database.Cursor;
import app.cash.sqldelight.db.QueryResult;
import java.util.ArrayList;
import java.util.List;
import o.UncheckedColor;
import o.compositeOverOWjLjI;
import o.createFromParcel;
import o.getComponents8_81llA;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
final class AndroidQuery implements compositeOverOWjLjI, AndroidStatement {
    private final int argCount;
    private final List<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM> binds;
    private final UncheckedColor database;
    private final String sql;
    private final Long windowSizeBytes;

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public void close() {
    }

    public int getArgCount() {
        return this.argCount;
    }

    @Override // o.compositeOverOWjLjI
    public String getSql() {
        return this.sql;
    }

    public String toString() {
        return getSql();
    }

    public AndroidQuery(String str, UncheckedColor uncheckedColor, int i, Long l) {
        str.getClass();
        uncheckedColor.getClass();
        this.sql = str;
        this.database = uncheckedColor;
        this.argCount = i;
        this.windowSizeBytes = l;
        int argCount = getArgCount();
        ArrayList arrayList = new ArrayList(argCount);
        for (int i2 = 0; i2 < argCount; i2++) {
            arrayList.add(null);
        }
        this.binds = arrayList;
    }

    @Override // o.compositeOverOWjLjI
    public void bindTo(getComponents8_81llA getcomponents8_81lla) {
        getcomponents8_81lla.getClass();
        for (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm : this.binds) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getcomponents8_81lla);
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public <R> R executeQuery(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        Cursor cursorSerializer = this.database.serializer(this);
        try {
            R r = (R) ((QueryResult) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new AndroidCursor(cursorSerializer, this.windowSizeBytes))).getValue();
            int i = sourceInformationContextOfdefault.read();
            int i2 = sourceInformationContextOfdefault.read();
            int i3 = sourceInformationContextOfdefault.read();
            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorSerializer, null}, i3);
            return r;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i4 = sourceInformationContextOfdefault.read();
                int i5 = sourceInformationContextOfdefault.read();
                int i6 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i4, i5, -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorSerializer, th}, i6);
                throw th2;
            }
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindBoolean(final int i, final Boolean bool) {
        this.binds.set(i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidQuery.bindBoolean.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(getComponents8_81llA getcomponents8_81lla) {
                getcomponents8_81lla.getClass();
                Boolean bool2 = bool;
                int i2 = i;
                if (bool2 == null) {
                    getcomponents8_81lla.serializer(i2 + 1);
                } else {
                    getcomponents8_81lla.IconCompatParcelizer(i2 + 1, bool2.booleanValue() ? 1L : 0L);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getComponents8_81llA) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindBytes(final int i, final byte[] bArr) {
        this.binds.set(i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidQuery.bindBytes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(getComponents8_81llA getcomponents8_81lla) {
                getcomponents8_81lla.getClass();
                byte[] bArr2 = bArr;
                int i2 = i + 1;
                if (bArr2 == null) {
                    getcomponents8_81lla.serializer(i2);
                } else {
                    getcomponents8_81lla.IconCompatParcelizer(i2, bArr2);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getComponents8_81llA) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindDouble(final int i, final Double d) {
        this.binds.set(i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidQuery.bindDouble.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(getComponents8_81llA getcomponents8_81lla) {
                getcomponents8_81lla.getClass();
                Double d2 = d;
                int i2 = i + 1;
                if (d2 == null) {
                    getcomponents8_81lla.serializer(i2);
                } else {
                    getcomponents8_81lla.write(d2.doubleValue(), i2);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getComponents8_81llA) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindLong(final int i, final Long l) {
        this.binds.set(i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidQuery.bindLong.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(getComponents8_81llA getcomponents8_81lla) {
                getcomponents8_81lla.getClass();
                Long l2 = l;
                int i2 = i + 1;
                if (l2 == null) {
                    getcomponents8_81lla.serializer(i2);
                } else {
                    getcomponents8_81lla.IconCompatParcelizer(i2, l2.longValue());
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getComponents8_81llA) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public void bindString(final int i, final String str) {
        this.binds.set(i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidQuery.bindString.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(getComponents8_81llA getcomponents8_81lla) {
                getcomponents8_81lla.getClass();
                String str2 = str;
                int i2 = i + 1;
                if (str2 == null) {
                    getcomponents8_81lla.serializer(i2);
                } else {
                    getcomponents8_81lla.serializer(i2, str2);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getComponents8_81llA) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public /* synthetic */ long execute() {
        return ((Number) m3973execute()).longValue();
    }

    /* JADX INFO: renamed from: execute, reason: collision with other method in class */
    public Void m3973execute() {
        throw new UnsupportedOperationException();
    }
}
