package o;

import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class drawColor extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ LasagnaDeclineComposeBottomSheet serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ drawColor(LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet, int i) {
        super(0);
        this.read = i;
        this.serializer = lasagnaDeclineComposeBottomSheet;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 45;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        LasagnaDeclineComposeBottomSheet lasagnaDeclineComposeBottomSheet = this.serializer;
        int i5 = i2 + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return lasagnaDeclineComposeBottomSheet;
    }
}
