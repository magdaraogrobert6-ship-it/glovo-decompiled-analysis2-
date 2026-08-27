package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class getMonthlambda10 extends NotificationSubscriptionTypeCompanion {
    public final /* synthetic */ GenderCompanion read;

    @Override // o.NotificationSubscriptionTypeCompanion, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Month(this.read);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMonthlambda10(GenderCompanion genderCompanion) {
        super(genderCompanion, 0);
        this.read = genderCompanion;
    }
}
