package o;

import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setDivider implements decryptAndGetPasswordBWLJW6A {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final PreferenceGroupAdapterPreferenceResourceDescriptor write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 73;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        StateFlow stateFlow = this.read;
        int i4 = i2 + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public setDivider(setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        this.write = new PreferenceGroupAdapterPreferenceResourceDescriptor(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.home_dashboard_empty_state_message));
        this.read = StateFlowKt.read(Boolean.TRUE);
    }
}
