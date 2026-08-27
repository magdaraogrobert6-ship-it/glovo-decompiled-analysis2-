package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdavXWQ89TxHQ24MnxQcigE5jRzS1E extends NotificationSubscriptionTypeCompanion {
    public final /* synthetic */ performSave write;

    @Override // o.NotificationSubscriptionTypeCompanion, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Month(this.write);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdavXWQ89TxHQ24MnxQcigE5jRzS1E(performSave performsave) {
        super(performsave, 3);
        this.write = performsave;
    }
}
