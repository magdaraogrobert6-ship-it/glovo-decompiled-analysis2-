package o;

import com.foodora.courier.main.presentation.MainActivity;
import io.grpc.CallOptions$Builder;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetYcp extends androidx.activity.OnBackPressedCallback {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ MainActivity IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetYcp(MainActivity mainActivity) {
        super(true);
        this.IconCompatParcelizer = mainActivity;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((CallOptions$Builder) this.IconCompatParcelizer.fullyDrawnReporter_delegatelambda0).serializer();
            obj.hashCode();
            throw null;
        }
        ((CallOptions$Builder) this.IconCompatParcelizer.fullyDrawnReporter_delegatelambda0).serializer();
        int i3 = write + 23;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
