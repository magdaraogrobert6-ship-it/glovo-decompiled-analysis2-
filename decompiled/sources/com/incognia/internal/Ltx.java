package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class Ltx extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ createBrazeUserChangeEventSubscriberlambda01 BGx;
    public final /* synthetic */ hb HQ;
    public final /* synthetic */ ArrayList N;
    public final /* synthetic */ FunctionReferenceImpl hIl;
    public final /* synthetic */ UsU mbG;
    public final /* synthetic */ createInAppMessageEventSubscriber x;

    public static final void BGx(hb hbVar, Object obj, List list, createInAppMessageEventSubscriber createinappmessageeventsubscriber, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws JSONException {
        Boolean bool;
        boolean zBooleanValue = false;
        hbVar.N = false;
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj2 == null) {
                af$$ExternalSyntheticOutline0.m(new isItemDismissable(thSerializer), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            } else {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(obj2));
                return;
            }
        }
        ETe eTe = (ETe) obj;
        if (!hbVar.HQ.BGx(list) && createinappmessageeventsubscriber.IconCompatParcelizer == null) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new ib(hbVar.BGx.mbG())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        S3c s3c = hbVar.HQ;
        boolean zBGx = s3c.BGx();
        d9 d9VarBGx = s3c.mbG.BGx(s3c.BGx);
        if (d9VarBGx != null && (bool = d9VarBGx.mbG) != null) {
            zBooleanValue = bool.booleanValue();
        }
        ar arVar = new ar(eTe, new iO(zBGx, zBooleanValue, s3c.mbG(list)), new h3(s3c));
        createinappmessageeventsubscriber.IconCompatParcelizer = arVar;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(arVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ltx(createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, UsU usU, hb hbVar, ArrayList arrayList, createInAppMessageEventSubscriber createinappmessageeventsubscriber, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.BGx = createbrazeuserchangeeventsubscriberlambda01;
        this.mbG = usU;
        this.HQ = hbVar;
        this.N = arrayList;
        this.x = createinappmessageeventsubscriber;
        this.hIl = (FunctionReferenceImpl) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public final void BGx(final Object obj) {
        UsU usU = E79.BGx;
        E79.HQ(this.BGx.read);
        UsU usU2 = this.mbG;
        final hb hbVar = this.HQ;
        final ArrayList arrayList = this.N;
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.x;
        final ?? r6 = this.hIl;
        usU2.BGx(new y9X() { // from class: com.incognia.internal.Ltx$$ExternalSyntheticLambda0
            @Override // com.incognia.internal.y9X
            public final void run() throws JSONException {
                Ltx.BGx(hbVar, obj, arrayList, createinappmessageeventsubscriber, r6);
            }
        });
    }
}
