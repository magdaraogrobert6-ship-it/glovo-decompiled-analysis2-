package o;

import android.view.Window;
import com.huawei.hms.location.ActivityIdentificationData;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ implements getDrawerToggleDelegate {
    public final /* synthetic */ startActivityForResult IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ(startActivityForResult startactivityforresult, int i) {
        this.read = i;
        this.IconCompatParcelizer = startactivityforresult;
    }

    @Override // o.getDrawerToggleDelegate
    public final void read(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        ComponentDialog componentDialog;
        int i = this.read;
        startActivityForResult startactivityforresult = this.IconCompatParcelizer;
        if (i != 0) {
            startactivityforresult.IconCompatParcelizer(alertControllerButtonHandler);
            return;
        }
        AlertControllerButtonHandler alertControllerButtonHandlerIconCompatParcelizer = alertControllerButtonHandler.IconCompatParcelizer();
        int i2 = 0;
        boolean z2 = alertControllerButtonHandlerIconCompatParcelizer != alertControllerButtonHandler;
        if (z2) {
            alertControllerButtonHandler = alertControllerButtonHandlerIconCompatParcelizer;
        }
        ComponentDialog[] componentDialogArr = startactivityforresult.addContentView;
        int length = componentDialogArr != null ? componentDialogArr.length : 0;
        while (true) {
            if (i2 < length) {
                componentDialog = componentDialogArr[i2];
                if (componentDialog != null && componentDialog.ParcelableVolumeInfo == alertControllerButtonHandler) {
                    break;
                } else {
                    i2++;
                }
            } else {
                componentDialog = null;
                break;
            }
        }
        if (componentDialog != null) {
            if (!z2) {
                startactivityforresult.IconCompatParcelizer(componentDialog, z);
            } else {
                startactivityforresult.write(componentDialog.serializer, componentDialog, alertControllerButtonHandlerIconCompatParcelizer);
                startactivityforresult.IconCompatParcelizer(componentDialog, true);
            }
        }
    }

    @Override // o.getDrawerToggleDelegate
    public final boolean read(AlertControllerButtonHandler alertControllerButtonHandler) {
        Window.Callback callback;
        int i = this.read;
        startActivityForResult startactivityforresult = this.IconCompatParcelizer;
        if (i != 0) {
            Window.Callback callback2 = startactivityforresult.getLastCustomNonConfigurationInstance.getCallback();
            if (callback2 != null) {
                callback2.onMenuOpened(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
            }
            return true;
        }
        if (alertControllerButtonHandler == alertControllerButtonHandler.IconCompatParcelizer() && startactivityforresult.createFullyDrawnExecutor && (callback = startactivityforresult.getLastCustomNonConfigurationInstance.getCallback()) != null && !startactivityforresult.accessensureViewModelStore) {
            callback.onMenuOpened(ActivityIdentificationData.RUNNING, alertControllerButtonHandler);
        }
        return true;
    }
}
