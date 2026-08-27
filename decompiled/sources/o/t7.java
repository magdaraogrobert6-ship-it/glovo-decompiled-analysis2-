package o;

import com.roadrunner.opportunities.calendar.info.CalendarInformationFragment;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.fragment.app.FragmentActivity read;

    public /* synthetic */ t7(Object obj, androidx.fragment.app.FragmentActivity fragmentActivity, int i) {
        this.IconCompatParcelizer = i;
        this.read = fragmentActivity;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.read;
        if (i3 == 0) {
            new CalendarInformationFragment().RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.opportunities.calendar.info.CalendarInformationFragment");
            return createfromparcel2;
        }
        if (i3 == 1) {
            div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            new RequestBreakFragment().RemoteActionCompatParcelizer(supportFragmentManager, "com.roadrunner.rider.state.breakrequest.RequestBreakFragment");
            return createfromparcel2;
        }
        fragmentActivity.getSupportFragmentManager().write("break-request-dialog-request-key");
        int i4 = RemoteActionCompatParcelizer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcel2;
        }
        obj.hashCode();
        throw null;
    }
}
