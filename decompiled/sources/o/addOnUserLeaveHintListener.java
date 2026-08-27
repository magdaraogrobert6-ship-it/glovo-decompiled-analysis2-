package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class addOnUserLeaveHintListener {
    public static final getPhoneNumber serializer = new getPhoneNumber(new RemoteActionCompatParcelizer(4));

    public static fullyDrawnReporter_delegatelambda0 read(getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0 = (fullyDrawnReporter_delegatelambda0) getpostalcode.write((getNewPassword) serializer);
        Object obj = null;
        if (fullydrawnreporter_delegatelambda0 == null) {
            getpostalcode.serializer(1208426157);
            View view = (View) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            view.getClass();
            while (true) {
                if (view == null) {
                    fullydrawnreporter_delegatelambda0 = null;
                    break;
                }
                Object tag = view.getTag(com.logistics.rider.glovo.R.id.view_tree_on_back_pressed_dispatcher_owner);
                fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda1 = tag instanceof fullyDrawnReporter_delegatelambda0 ? (fullyDrawnReporter_delegatelambda0) tag : null;
                if (fullydrawnreporter_delegatelambda1 != null) {
                    fullydrawnreporter_delegatelambda0 = fullydrawnreporter_delegatelambda1;
                    break;
                }
                Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
                view = objRemoteActionCompatParcelizer instanceof View ? (View) objRemoteActionCompatParcelizer : null;
            }
        } else {
            getpostalcode.serializer(1208423708);
        }
        getpostalcode.IconCompatParcelizer(false);
        if (fullydrawnreporter_delegatelambda0 != null) {
            getpostalcode.serializer(1208423789);
            getpostalcode.IconCompatParcelizer(false);
            return fullydrawnreporter_delegatelambda0;
        }
        getpostalcode.serializer(1208428160);
        for (Context baseContext = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof fullyDrawnReporter_delegatelambda0) {
                obj = baseContext;
                break;
            }
        }
        fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda2 = (fullyDrawnReporter_delegatelambda0) obj;
        getpostalcode.IconCompatParcelizer(false);
        return fullydrawnreporter_delegatelambda2;
    }
}
