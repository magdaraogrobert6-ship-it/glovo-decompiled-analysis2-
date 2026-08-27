package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidContentCaptureManagerTranslateStatus implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    public /* synthetic */ AndroidContentCaptureManagerTranslateStatus(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.serializer = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        switch (i2) {
            case 0:
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
                return createfromparcel;
            case 1:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((String) obj).getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(bool);
                return createfromparcel;
            case 2:
                CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType = (CardCashPaymentTaskUiItem$PaymentType) obj2;
                ((String) obj).getClass();
                cardCashPaymentTaskUiItem$PaymentType.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(cardCashPaymentTaskUiItem$PaymentType);
                int i3 = IconCompatParcelizer + 63;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            case 3:
                getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj2;
                ((String) obj).getClass();
                getenterjxw82lu.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getenterjxw82lu);
                return createfromparcel;
            case 4:
                String str = (String) obj2;
                ((String) obj).getClass();
                str.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
                return createfromparcel;
            case 5:
                CashPaymentTaskUiItem.Reasons reasons = (CashPaymentTaskUiItem.Reasons) obj2;
                ((String) obj).getClass();
                reasons.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(reasons);
                int i5 = read + 5;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return createfromparcel;
            case 6:
                CashPaymentTaskUiItem.Reasons reasons2 = (CashPaymentTaskUiItem.Reasons) obj2;
                ((String) obj).getClass();
                reasons2.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(reasons2);
                return createfromparcel;
            case 7:
                String str2 = (String) obj2;
                ((String) obj).getClass();
                str2.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str2);
                return createfromparcel;
            case 8:
                String str3 = (String) obj2;
                ((String) obj).getClass();
                str3.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str3);
                return createfromparcel;
            default:
                CashPaymentTaskUiItem.Reasons reasons3 = (CashPaymentTaskUiItem.Reasons) obj2;
                ((String) obj).getClass();
                reasons3.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(reasons3);
                return createfromparcel;
        }
    }
}
