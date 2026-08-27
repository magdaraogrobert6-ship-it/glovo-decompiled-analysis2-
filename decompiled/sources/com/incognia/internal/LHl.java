package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class LHl implements PG {
    public static final String hIl = (String) W4i.lx.MediaSessionCompatResultReceiverWrapper();
    public static final long hs = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    public final NvL BGx;
    public final UsU HQ;
    public final onViewDetachedFromWindowlambda1 N;
    public final YZr mbG;
    public B74 x;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public LHl(NvL nvL, YZr yZr, UsU usU) {
        this.BGx = nvL;
        this.mbG = yZr;
        this.HQ = usU;
        Object[] objArr = {Dw5.BGx};
        this.N = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public static final void mbG(LHl lHl, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str) {
        B74 b74 = lHl.x;
        if (b74 == null || !b74.mbG.compareAndSet(0, 3)) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new JWV((String) lHl.N.MediaSessionCompatResultReceiverWrapper(), str, new bMs(new z1(str)))));
    }

    public static final void BGx(LHl lHl, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        lHl.mbG.BGx(new ArrivalProgressObserver$$ExternalSyntheticLambda0(lHl, 5, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        lHl.x = lHl.BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        NvL nvL = lHl.BGx;
        lHl.HQ.BGx(((JSONObject) nvL.BGx.get()).optLong(hIl, hs), lHl.x);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.HQ.BGx(new N6$$ExternalSyntheticLambda0(this, ltx, 6));
    }

    public static final void BGx(LHl lHl, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str) {
        lHl.HQ.BGx(new Rq$$ExternalSyntheticLambda0((Object) lHl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) str, 2));
    }

    public final B74 BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new B74(new ZM$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, 2));
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.N.MediaSessionCompatResultReceiverWrapper();
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, LHl lHl) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new jO((String) lHl.N.MediaSessionCompatResultReceiverWrapper())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
