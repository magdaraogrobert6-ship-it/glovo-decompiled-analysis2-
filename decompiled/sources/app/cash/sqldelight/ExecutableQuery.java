package app.cash.sqldelight;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExecutableQuery<RowType> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mapper;

    public abstract <R> QueryResult<R> execute(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getMapper() {
        return this.mapper;
    }

    public final List<RowType> executeAsList() {
        return (List) execute(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: app.cash.sqldelight.ExecutableQuery.executeAsList.1
            final /* synthetic */ ExecutableQuery<RowType> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final QueryResult<List<RowType>> invoke(SqlCursor sqlCursor) {
                sqlCursor.getClass();
                ArrayList arrayList = new ArrayList();
                while (sqlCursor.next().getValue().booleanValue()) {
                    arrayList.add(this.this$0.getMapper().invoke(sqlCursor));
                }
                return QueryResult.Value.m3965boximpl(QueryResult.Value.m3966constructorimpl(arrayList));
            }
        }).getValue();
    }

    public final RowType executeAsOneOrNull() {
        return (RowType) execute(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(this) { // from class: app.cash.sqldelight.ExecutableQuery.executeAsOneOrNull.1
            final /* synthetic */ ExecutableQuery<RowType> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final QueryResult<RowType> invoke(SqlCursor sqlCursor) {
                sqlCursor.getClass();
                if (!sqlCursor.next().getValue().booleanValue()) {
                    return QueryResult.Value.m3965boximpl(QueryResult.Value.m3966constructorimpl(null));
                }
                Object objInvoke = this.this$0.getMapper().invoke(sqlCursor);
                boolean zBooleanValue = sqlCursor.next().getValue().booleanValue();
                ExecutableQuery<RowType> executableQuery = this.this$0;
                if (!zBooleanValue) {
                    return QueryResult.Value.m3965boximpl(QueryResult.Value.m3966constructorimpl(objInvoke));
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(executableQuery, "ResultSet returned more than 1 row for ");
                return null;
            }
        }).getValue();
    }

    public ExecutableQuery(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.mapper = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final RowType executeAsOne() {
        RowType rowtypeExecuteAsOneOrNull = executeAsOneOrNull();
        if (rowtypeExecuteAsOneOrNull != null) {
            return rowtypeExecuteAsOneOrNull;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }
}
