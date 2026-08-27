package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FwFDataQueriesSelectItemsQuery extends getContact {
    public final Object serializer;

    public FwFDataQueriesSelectItemsQuery(selectItems selectitems) {
        super(true);
        this.serializer = selectitems;
    }

    public selectItems write() {
        return (selectItems) this.serializer;
    }

    public /* synthetic */ FwFDataQueriesSelectItemsQuery(Object obj, boolean z) {
        super(z);
        this.serializer = obj;
    }
}
