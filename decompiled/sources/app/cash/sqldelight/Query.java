package app.cash.sqldelight;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class Query<RowType> extends ExecutableQuery<RowType> {

    public interface Listener {
        void queryResultsChanged();
    }

    public abstract void addListener(Listener listener);

    public abstract void removeListener(Listener listener);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Query(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
    }
}
