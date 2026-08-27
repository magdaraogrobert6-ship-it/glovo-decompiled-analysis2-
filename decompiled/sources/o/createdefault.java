package o;

import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class createdefault extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ LasagnaDeclineBottomSheet read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ createdefault(LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet, int i) {
        super(0);
        this.serializer = i;
        this.read = lasagnaDeclineBottomSheet;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        LasagnaDeclineBottomSheet lasagnaDeclineBottomSheet = this.read;
        int i5 = i3 + 101;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return lasagnaDeclineBottomSheet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
