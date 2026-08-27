package bo.app;

import com.braze.events.IEventSubscriber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2$$ExternalSyntheticLambda8 implements IEventSubscriber {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ b2$$ExternalSyntheticLambda8(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        if (i == 0) {
            b2.a((b2) obj2, (gf) obj);
            return;
        }
        if (i == 1) {
            vg.a((vg) obj2, (mg) obj);
        } else if (i != 2) {
            zc.a((zc) obj2, (ad) obj);
        } else {
            w5.a((w5) obj2, (u5) obj);
        }
    }
}
