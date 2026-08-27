package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class animatedContentSearchlambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ CashPaymentTaskUiItem serializer;

    public /* synthetic */ animatedContentSearchlambda0(CashPaymentTaskUiItem cashPaymentTaskUiItem, int i) {
        this.read = i;
        this.serializer = cashPaymentTaskUiItem;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CashPaymentTaskUiItem cashPaymentTaskUiItem = this.serializer;
        androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
        if (i2 == 0) {
            semanticsPropertyReceiver.getClass();
            if (!cashPaymentTaskUiItem.MediaSessionCompatToken()) {
                int i3 = IconCompatParcelizer + 85;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
            }
            return createfromparcel;
        }
        semanticsPropertyReceiver.getClass();
        if (!cashPaymentTaskUiItem.MediaSessionCompatToken()) {
            int i5 = write + 45;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        return createfromparcel;
    }
}
