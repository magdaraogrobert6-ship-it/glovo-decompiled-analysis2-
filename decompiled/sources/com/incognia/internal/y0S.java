package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class y0S extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ UsU BGx;
    public final /* synthetic */ ArrayList HQ;
    public final /* synthetic */ createInAppMessageEventSubscriber N;
    public final /* synthetic */ hb mbG;
    public final /* synthetic */ FunctionReferenceImpl x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0S(UsU usU, hb hbVar, ArrayList arrayList, createInAppMessageEventSubscriber createinappmessageeventsubscriber, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.BGx = usU;
        this.mbG = hbVar;
        this.HQ = arrayList;
        this.N = createinappmessageeventsubscriber;
        this.x = (FunctionReferenceImpl) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public static final void BGx(hb hbVar, List list, createInAppMessageEventSubscriber createinappmessageeventsubscriber, ETe eTe, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws JSONException {
        Boolean bool;
        if (hbVar.HQ.BGx(list)) {
            S3c s3c = hbVar.HQ;
            boolean zBGx = s3c.BGx();
            d9 d9VarBGx = s3c.mbG.BGx(s3c.BGx);
            ar arVar = new ar(eTe, new iO(zBGx, (d9VarBGx == null || (bool = d9VarBGx.mbG) == null) ? false : bool.booleanValue(), s3c.mbG(list)), new h3(s3c));
            createinappmessageeventsubscriber.IconCompatParcelizer = arVar;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(arVar);
        }
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((ETe) obj);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public final void BGx(final ETe eTe) {
        UsU usU = this.BGx;
        final hb hbVar = this.mbG;
        final ArrayList arrayList = this.HQ;
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.N;
        final ?? r6 = this.x;
        usU.BGx(new y9X() { // from class: com.incognia.internal.y0S$$ExternalSyntheticLambda0
            @Override // com.incognia.internal.y9X
            public final void run() throws JSONException {
                y0S.BGx(hbVar, arrayList, createinappmessageeventsubscriber, eTe, r6);
            }
        });
    }
}
