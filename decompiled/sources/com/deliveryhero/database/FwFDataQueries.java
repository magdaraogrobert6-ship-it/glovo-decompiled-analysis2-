package com.deliveryhero.database;

import androidx.sqlite.SQLite;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import java.util.Collection;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFDataQueries extends TransacterImpl {

    public final class SelectItemQuery<T> extends Query<T> {
        private final String key;
        final /* synthetic */ FwFDataQueries this$0;

        public final String getKey() {
            return this.key;
        }

        public String toString() {
            return "FwFData.sq:selectItem";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectItemQuery(FwFDataQueries fwFDataQueries, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            str.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            this.this$0 = fwFDataQueries;
            this.key = str;
        }

        @Override // app.cash.sqldelight.Query
        public void addListener(Query.Listener listener) {
            listener.getClass();
            this.this$0.getDriver().addListener(new String[]{"FwFCacheItem"}, listener);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public <R> QueryResult<R> execute(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            return this.this$0.getDriver().executeQuery(416547376, "SELECT * FROM FwFCacheItem WHERE key = ? LIMIT 1", r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.deliveryhero.database.FwFDataQueries$SelectItemQuery$execute$1
                final /* synthetic */ FwFDataQueries.SelectItemQuery<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public final void invoke(SqlPreparedStatement sqlPreparedStatement) {
                    sqlPreparedStatement.getClass();
                    sqlPreparedStatement.bindString(0, this.this$0.getKey());
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SqlPreparedStatement) obj);
                    return createFromParcel.INSTANCE;
                }
            });
        }

        @Override // app.cash.sqldelight.Query
        public void removeListener(Query.Listener listener) {
            listener.getClass();
            this.this$0.getDriver().removeListener(new String[]{"FwFCacheItem"}, listener);
        }
    }

    public final class SelectItemsQuery<T> extends Query<T> {
        private final Collection<String> key;
        final /* synthetic */ FwFDataQueries this$0;

        public final Collection<String> getKey() {
            return this.key;
        }

        public String toString() {
            return "FwFData.sq:selectItems";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectItemsQuery(FwFDataQueries fwFDataQueries, Collection<String> collection, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            collection.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            this.this$0 = fwFDataQueries;
            this.key = collection;
        }

        @Override // app.cash.sqldelight.Query
        public void addListener(Query.Listener listener) {
            listener.getClass();
            this.this$0.getDriver().addListener(new String[]{"FwFCacheItem"}, listener);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public <R> QueryResult<R> execute(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            return this.this$0.getDriver().executeQuery(null, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SELECT * FROM FwFCacheItem WHERE key IN ", this.this$0.createArguments(this.key.size())), r8lambdaunavo3sxub_pc9xroryotnrlvsm, this.key.size(), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: com.deliveryhero.database.FwFDataQueries$SelectItemsQuery$execute$1
                final /* synthetic */ FwFDataQueries.SelectItemsQuery<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public final void invoke(SqlPreparedStatement sqlPreparedStatement) {
                    sqlPreparedStatement.getClass();
                    int i = 0;
                    for (Object obj : this.this$0.getKey()) {
                        if (i < 0) {
                            SQLite.serializer();
                            throw null;
                        }
                        sqlPreparedStatement.bindString(i, (String) obj);
                        i++;
                    }
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SqlPreparedStatement) obj);
                    return createFromParcel.INSTANCE;
                }
            });
        }

        @Override // app.cash.sqldelight.Query
        public void removeListener(Query.Listener listener) {
            listener.getClass();
            this.this$0.getDriver().removeListener(new String[]{"FwFCacheItem"}, listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFDataQueries(SqlDriver sqlDriver) {
        super(sqlDriver);
        sqlDriver.getClass();
    }

    public final void deleteItem(final String str) {
        str.getClass();
        getDriver().execute(-457874593, "DELETE FROM FwFCacheItem WHERE key = ?", 1, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.database.FwFDataQueries.deleteItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(SqlPreparedStatement sqlPreparedStatement) {
                sqlPreparedStatement.getClass();
                sqlPreparedStatement.bindString(0, str);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SqlPreparedStatement) obj);
                return createFromParcel.INSTANCE;
            }
        });
        notifyQueries(-457874593, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.database.FwFDataQueries.deleteItem.2
            public final void invoke(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke("FwFCacheItem");
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final void insertItem(final String str, final byte[] bArr) {
        str.getClass();
        getDriver().execute(-1256298131, "INSERT OR REPLACE INTO FwFCacheItem (key, structure) VALUES (?, ?)", 2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.database.FwFDataQueries.insertItem.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(SqlPreparedStatement sqlPreparedStatement) {
                sqlPreparedStatement.getClass();
                sqlPreparedStatement.bindString(0, str);
                sqlPreparedStatement.bindBytes(1, bArr);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SqlPreparedStatement) obj);
                return createFromParcel.INSTANCE;
            }
        });
        notifyQueries(-1256298131, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.database.FwFDataQueries.insertItem.2
            public final void invoke(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke("FwFCacheItem");
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final <T> Query<T> selectItem(String str, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        str.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new SelectItemQuery(this, str, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.database.FwFDataQueries.selectItem.1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final T invoke(SqlCursor sqlCursor) {
                sqlCursor.getClass();
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                String string = sqlCursor.getString(0);
                string.getClass();
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(string, sqlCursor.getBytes(1));
            }
        });
    }

    public final <T> Query<T> selectItems(Collection<String> collection, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        collection.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return new SelectItemsQuery(this, collection, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.database.FwFDataQueries.selectItems.1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final T invoke(SqlCursor sqlCursor) {
                sqlCursor.getClass();
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                String string = sqlCursor.getString(0);
                string.getClass();
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(string, sqlCursor.getBytes(1));
            }
        });
    }

    public final Query<FwFCacheItem> selectItem(String str) {
        str.getClass();
        return selectItem(str, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.deliveryhero.database.FwFDataQueries.selectItem.2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final FwFCacheItem invoke(String str2, byte[] bArr) {
                str2.getClass();
                return new FwFCacheItem(str2, bArr);
            }
        });
    }

    public final Query<FwFCacheItem> selectItems(Collection<String> collection) {
        collection.getClass();
        return selectItems(collection, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.deliveryhero.database.FwFDataQueries.selectItems.2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final FwFCacheItem invoke(String str, byte[] bArr) {
                str.getClass();
                return new FwFCacheItem(str, bArr);
            }
        });
    }
}
