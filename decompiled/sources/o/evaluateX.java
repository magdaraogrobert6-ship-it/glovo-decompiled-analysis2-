package o;

import android.view.View;
import bo.app.b8$$ExternalSyntheticLambda4;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class evaluateX {
    public static final getPhoneNumber read = new getPhoneNumber(new b8$$ExternalSyntheticLambda4(20));

    public static accesswriteValidRootInUnitRange RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        accesswriteValidRootInUnitRange accesswritevalidrootinunitrange;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        accesswriteValidRootInUnitRange accesswritevalidrootinunitrange2 = (accesswriteValidRootInUnitRange) getpostalcode.write((getNewPassword) read);
        if (accesswritevalidrootinunitrange2 != null) {
            getpostalcode.serializer(950834231);
            getpostalcode.IconCompatParcelizer(false);
            return accesswritevalidrootinunitrange2;
        }
        getpostalcode.serializer(950836184);
        View view = (View) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        view.getClass();
        while (true) {
            accesswritevalidrootinunitrange = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(com.logistics.rider.glovo.R.id.view_tree_navigation_event_dispatcher_owner);
            accesswriteValidRootInUnitRange accesswritevalidrootinunitrange3 = tag instanceof accesswriteValidRootInUnitRange ? (accesswriteValidRootInUnitRange) tag : null;
            if (accesswritevalidrootinunitrange3 != null) {
                accesswritevalidrootinunitrange = accesswritevalidrootinunitrange3;
                break;
            }
            Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
            view = objRemoteActionCompatParcelizer instanceof View ? (View) objRemoteActionCompatParcelizer : null;
        }
        getpostalcode.IconCompatParcelizer(false);
        return accesswritevalidrootinunitrange;
    }
}
