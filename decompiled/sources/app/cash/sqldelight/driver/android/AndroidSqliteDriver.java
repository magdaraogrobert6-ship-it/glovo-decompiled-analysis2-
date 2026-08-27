package app.cash.sqldelight.driver.android;

import android.content.Context;
import android.util.LruCache;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.db.SupportSQLiteOpenHelper$Callback;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.UncheckedColor;
import o.accessgetWcp;
import o.compositeComponent;
import o.createFromParcel;
import o.getUnspecifiedColorannotations;
import o.isAdapterPositionOnScreen;
import o.isSpecified8_81llA;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidSqliteDriver implements SqlDriver {
    private final int cacheSize;
    private final onViewDetachedFromWindowlambda1 database$delegate;
    private final LinkedHashMap<String, Set<Query.Listener>> listeners;
    private final compositeComponent openHelper;
    private final AndroidSqliteDriver$statements$1 statements;
    private final ThreadLocal<Transacter.Transaction> transactions;
    private final Long windowSizeBytes;

    public final class Transaction extends Transacter.Transaction {
        private final Transacter.Transaction enclosingTransaction;

        @Override // app.cash.sqldelight.Transacter.Transaction
        public Transacter.Transaction getEnclosingTransaction() {
            return this.enclosingTransaction;
        }

        public Transaction(Transacter.Transaction transaction) {
            this.enclosingTransaction = transaction;
        }

        @Override // app.cash.sqldelight.Transacter.Transaction
        public QueryResult<createFromParcel> endTransaction(boolean z) {
            if (getEnclosingTransaction() == null) {
                AndroidSqliteDriver androidSqliteDriver = AndroidSqliteDriver.this;
                if (z) {
                    androidSqliteDriver.getDatabase().MediaSessionCompatResultReceiverWrapper();
                    AndroidSqliteDriver.this.getDatabase().MediaMetadataCompat();
                } else {
                    androidSqliteDriver.getDatabase().MediaMetadataCompat();
                }
            }
            AndroidSqliteDriver.this.transactions.set(getEnclosingTransaction());
            return QueryResult.Value.m3965boximpl(QueryResult.Companion.m3963getUnitmlRZEE());
        }
    }

    public static class Callback extends SupportSQLiteOpenHelper$Callback {
        private final AfterVersion[] callbacks;
        private final SqlSchema<QueryResult.Value<createFromParcel>> schema;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Callback(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, AfterVersion... afterVersionArr) {
            super((int) sqlSchema.getVersion());
            sqlSchema.getClass();
            afterVersionArr.getClass();
            if (sqlSchema.getVersion() <= 2147483647L) {
                this.schema = sqlSchema;
                this.callbacks = afterVersionArr;
            } else {
                throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + sqlSchema.getVersion() + '.').toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
        public void onCreate(UncheckedColor uncheckedColor) {
            uncheckedColor.getClass();
            this.schema.create(new AndroidSqliteDriver((compositeComponent) null, uncheckedColor, 1, (Long) null, 8, (DefaultConstructorMarker) null));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
        public void onUpgrade(UncheckedColor uncheckedColor, int i, int i2) {
            uncheckedColor.getClass();
            AfterVersion[] afterVersionArr = this.callbacks;
            this.schema.migrate(new AndroidSqliteDriver((compositeComponent) null, uncheckedColor, 1, (Long) null, 8, (DefaultConstructorMarker) null), i, i2, (AfterVersion[]) Arrays.copyOf(afterVersionArr, afterVersionArr.length));
        }
    }

    /* JADX INFO: renamed from: execute-zeHU3Mk, reason: not valid java name */
    private final <T> Object m3974executezeHU3Mk(Integer num, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        AndroidStatement androidStatementRemove = num != null ? remove(num) : null;
        if (androidStatementRemove == null) {
            androidStatementRemove = (AndroidStatement) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            try {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(androidStatementRemove);
            } catch (Throwable th) {
                if (num != null) {
                    AndroidStatement androidStatementPut = put(num, androidStatementRemove);
                    if (androidStatementPut != null) {
                        androidStatementPut.close();
                    }
                } else {
                    androidStatementRemove.close();
                }
                throw th;
            }
        }
        Object objM3966constructorimpl = QueryResult.Value.m3966constructorimpl(r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(androidStatementRemove));
        if (num == null) {
            androidStatementRemove.close();
            return objM3966constructorimpl;
        }
        AndroidStatement androidStatementPut2 = put(num, androidStatementRemove);
        if (androidStatementPut2 != null) {
            androidStatementPut2.close();
        }
        return objM3966constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UncheckedColor getDatabase() {
        return (UncheckedColor) this.database$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        createFromParcel createfromparcel;
        evictAll();
        compositeComponent compositecomponent = this.openHelper;
        if (compositecomponent != null) {
            compositecomponent.close();
            createfromparcel = createFromParcel.INSTANCE;
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            getDatabase().close();
        }
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public Transacter.Transaction currentTransaction() {
        return this.transactions.get();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public QueryResult<Transacter.Transaction> newTransaction() {
        Transacter.Transaction transaction = this.transactions.get();
        Transaction transaction2 = new Transaction(transaction);
        this.transactions.set(transaction2);
        if (transaction == null) {
            getDatabase().RemoteActionCompatParcelizer();
        }
        return QueryResult.Value.m3965boximpl(QueryResult.Value.m3966constructorimpl(transaction2));
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [app.cash.sqldelight.driver.android.AndroidSqliteDriver$statements$1] */
    private AndroidSqliteDriver(compositeComponent compositecomponent, final UncheckedColor uncheckedColor, final int i, Long l) {
        this.openHelper = compositecomponent;
        this.cacheSize = i;
        this.windowSizeBytes = l;
        if (!((compositecomponent != null) ^ (uncheckedColor != null))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            throw null;
        }
        this.transactions = new ThreadLocal<>();
        this.database$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$database$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final UncheckedColor invoke() {
                UncheckedColor uncheckedColorIconCompatParcelizer;
                compositeComponent compositecomponent2 = this.this$0.openHelper;
                if (compositecomponent2 != null && (uncheckedColorIconCompatParcelizer = compositecomponent2.IconCompatParcelizer()) != null) {
                    return uncheckedColorIconCompatParcelizer;
                }
                UncheckedColor uncheckedColor2 = uncheckedColor;
                uncheckedColor2.getClass();
                return uncheckedColor2;
            }
        });
        this.statements = new LruCache<Integer, AndroidStatement>(i) { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$statements$1
            @Override // android.util.LruCache
            public /* synthetic */ void entryRemoved(boolean z, Integer num, AndroidStatement androidStatement, AndroidStatement androidStatement2) {
                entryRemoved(z, num.intValue(), androidStatement, androidStatement2);
            }

            public void entryRemoved(boolean z, int i2, AndroidStatement androidStatement, AndroidStatement androidStatement2) {
                androidStatement.getClass();
                if (z) {
                    androidStatement.close();
                }
            }
        };
        this.listeners = new LinkedHashMap<>();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public void addListener(String[] strArr, Query.Listener listener) {
        strArr.getClass();
        listener.getClass();
        synchronized (this.listeners) {
            for (String str : strArr) {
                LinkedHashMap<String, Set<Query.Listener>> linkedHashMap = this.listeners;
                Set<Query.Listener> linkedHashSet = linkedHashMap.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    linkedHashMap.put(str, linkedHashSet);
                }
                linkedHashSet.add(listener);
            }
        }
    }

    /* JADX INFO: renamed from: executeQuery-0yMERmw, reason: not valid java name */
    public <R> Object m3975executeQuery0yMERmw(Integer num, final String str, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        return m3974executezeHU3Mk(num, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver.executeQuery.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final AndroidStatement invoke() {
                return new AndroidQuery(str, this.getDatabase(), i, this.windowSizeBytes);
            }
        }, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver.executeQuery.2
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final R invoke(AndroidStatement androidStatement) {
                androidStatement.getClass();
                return androidStatement.executeQuery(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        });
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public void removeListener(String[] strArr, Query.Listener listener) {
        strArr.getClass();
        listener.getClass();
        synchronized (this.listeners) {
            for (String str : strArr) {
                Set<Query.Listener> set = this.listeners.get(str);
                if (set != null) {
                    set.remove(listener);
                }
            }
        }
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public /* synthetic */ QueryResult executeQuery(Integer num, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        return QueryResult.Value.m3965boximpl(m3975executeQuery0yMERmw(num, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm2));
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public QueryResult<Long> execute(Integer num, final String str, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        return QueryResult.Value.m3965boximpl(m3974executezeHU3Mk(num, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver.execute.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final AndroidStatement invoke() {
                return new AndroidPreparedStatement(AndroidSqliteDriver.this.getDatabase().write(str));
            }
        }, r8lambdaunavo3sxub_pc9xroryotnrlvsm, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver.execute.2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Long invoke(AndroidStatement androidStatement) {
                androidStatement.getClass();
                return Long.valueOf(androidStatement.execute());
            }
        }));
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public void notifyListeners(String... strArr) {
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.listeners) {
            for (String str : strArr) {
                Set<Query.Listener> set = this.listeners.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Query.Listener) it.next()).queryResultsChanged();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(UncheckedColor uncheckedColor, int i) {
        this(uncheckedColor, i, (Long) null, 4, (DefaultConstructorMarker) null);
        uncheckedColor.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context) {
        this(sqlSchema, context, null, null, null, 0, false, null, 252, null);
        sqlSchema.getClass();
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context, String str) {
        this(sqlSchema, context, str, null, null, 0, false, null, 248, null);
        sqlSchema.getClass();
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context, String str, isSpecified8_81llA isspecified8_81lla) {
        this(sqlSchema, context, str, isspecified8_81lla, null, 0, false, null, 240, null);
        sqlSchema.getClass();
        context.getClass();
        isspecified8_81lla.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context, String str, isSpecified8_81llA isspecified8_81lla, SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback) {
        this(sqlSchema, context, str, isspecified8_81lla, supportSQLiteOpenHelper$Callback, 0, false, null, Constant.ERROR_WSS_INVALID, null);
        sqlSchema.getClass();
        context.getClass();
        isspecified8_81lla.getClass();
        supportSQLiteOpenHelper$Callback.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context, String str, isSpecified8_81llA isspecified8_81lla, SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback, int i) {
        this(sqlSchema, context, str, isspecified8_81lla, supportSQLiteOpenHelper$Callback, i, false, null, 192, null);
        sqlSchema.getClass();
        context.getClass();
        isspecified8_81lla.getClass();
        supportSQLiteOpenHelper$Callback.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context, String str, isSpecified8_81llA isspecified8_81lla, SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback, int i, boolean z) {
        this(sqlSchema, context, str, isspecified8_81lla, supportSQLiteOpenHelper$Callback, i, z, null, Fields.SpotShadowColor, null);
        sqlSchema.getClass();
        context.getClass();
        isspecified8_81lla.getClass();
        supportSQLiteOpenHelper$Callback.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(UncheckedColor uncheckedColor) {
        this(uncheckedColor, 0, (Long) null, 6, (DefaultConstructorMarker) null);
        uncheckedColor.getClass();
    }

    public /* synthetic */ AndroidSqliteDriver(compositeComponent compositecomponent, UncheckedColor uncheckedColor, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : compositecomponent, (i2 & 2) != 0 ? null : uncheckedColor, i, (i2 & 8) != 0 ? null : l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(compositeComponent compositecomponent) {
        this(compositecomponent, (UncheckedColor) null, 20, (Long) null);
        compositecomponent.getClass();
    }

    public AndroidSqliteDriver(SqlSchema sqlSchema, Context context, String str, isSpecified8_81llA isspecified8_81lla, SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback, int i, boolean z, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sqlSchema, context, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? new accessgetWcp(5) : isspecified8_81lla, (i2 & 16) != 0 ? new Callback(sqlSchema, new AfterVersion[0]) : supportSQLiteOpenHelper$Callback, (i2 & 32) != 0 ? 20 : i, (i2 & 64) != 0 ? false : z, (i2 & Fields.SpotShadowColor) != 0 ? null : l);
    }

    public /* synthetic */ AndroidSqliteDriver(UncheckedColor uncheckedColor, int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncheckedColor, (i2 & 2) != 0 ? 20 : i, (i2 & 4) != 0 ? null : l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(UncheckedColor uncheckedColor, int i, Long l) {
        this((compositeComponent) null, uncheckedColor, i, l);
        uncheckedColor.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver(SqlSchema<QueryResult.Value<createFromParcel>> sqlSchema, Context context, String str, isSpecified8_81llA isspecified8_81lla, SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback, int i, boolean z, Long l) {
        this(isspecified8_81lla.read(new getUnspecifiedColorannotations(context, str, supportSQLiteOpenHelper$Callback, z, false)), (UncheckedColor) null, i, l);
        sqlSchema.getClass();
        context.getClass();
        isspecified8_81lla.getClass();
        supportSQLiteOpenHelper$Callback.getClass();
        if (z && (str == null || str.length() == 0)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must set a non-null database name to a configuration that uses the no backup directory.");
            throw null;
        }
    }
}
