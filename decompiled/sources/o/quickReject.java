package o;

import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class quickReject extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int read;
    public final /* synthetic */ LasagnaDeclineWithAcceptanceRateBottomSheet write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ quickReject(LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet, int i) {
        super(0);
        this.read = i;
        this.write = lasagnaDeclineWithAcceptanceRateBottomSheet;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        LasagnaDeclineWithAcceptanceRateBottomSheet lasagnaDeclineWithAcceptanceRateBottomSheet = this.write;
        int i5 = i3 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return lasagnaDeclineWithAcceptanceRateBottomSheet;
    }
}
