package bo.app;

import com.braze.events.IEventSubscriber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w7$$ExternalSyntheticLambda0 implements IEventSubscriber {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ w7 f$0;

    public /* synthetic */ w7$$ExternalSyntheticLambda0(w7 w7Var, int i) {
        this.$r8$classId = i;
        this.f$0 = w7Var;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.$r8$classId;
        w7 w7Var = this.f$0;
        switch (i) {
            case 0:
                w7.a(w7Var, (jf) obj);
                break;
            case 1:
                w7.a(w7Var, (kf) obj);
                break;
            case 2:
                w7.a(w7Var, null, (Throwable) obj);
                break;
            case 3:
                w7.a(w7Var, (e) obj);
                break;
            case 4:
                w7.a(w7Var, (u3) obj);
                break;
            case 5:
                w7.a(w7Var, (x5) obj);
                break;
            case 6:
                w7.a(w7Var, (p8) obj);
                break;
            case 7:
                w7.a(w7Var, (h0) obj);
                break;
            case 8:
                w7.a(w7Var, (y5) obj);
                break;
            case 9:
                w7.a(w7Var, (dh) obj);
                break;
            case 10:
                w7.a(w7Var, (v3) obj);
                break;
            case 11:
                w7.a(w7Var, (ta) obj);
                break;
            case 12:
                w7.a(w7Var, (c9) obj);
                break;
            case 13:
                w7.a(w7Var, (sf) obj);
                break;
            case 14:
                w7.a(w7Var, (bh) obj);
                break;
            case 15:
                w7.a(w7Var, (i8) obj);
                break;
            case 16:
                w7.a(w7Var, (gb) obj);
                break;
            case 17:
                w7.a(w7Var, (gf) obj);
                break;
            case 18:
                w7.a(w7Var, (cf) obj);
                break;
            case 19:
                w7.a(w7Var, (qg) obj);
                break;
            default:
                w7.a(w7Var, (og) obj);
                break;
        }
    }
}
