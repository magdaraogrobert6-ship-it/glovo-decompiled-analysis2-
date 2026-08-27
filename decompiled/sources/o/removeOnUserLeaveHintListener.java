package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.stats.zza;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class removeOnUserLeaveHintListener extends checkForSystemLogLevelPropertylambda0 {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ removeOnUserLeaveHintListener(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // o.checkForSystemLogLevelPropertylambda0, o.getCancel
    public void RemoteActionCompatParcelizer() {
        int i = this.write;
        Object obj = this.read;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((startActivityForResult) ((zza) obj).write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(0);
            return;
        }
        startActivityForResult startactivityforresult = (startActivityForResult) obj;
        startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(0);
        if (startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getParent() instanceof View) {
            View view = (View) startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getParent();
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.requestApplyInsets();
        }
    }

    @Override // o.getCancel
    public final void serializer() {
        int i = this.write;
        Object obj = this.read;
        if (i == 0) {
            startActivityForResult startactivityforresult = (startActivityForResult) obj;
            startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(1.0f);
            startactivityforresult._init_lambda2.IconCompatParcelizer((getCancel) null);
            startactivityforresult._init_lambda2 = null;
            return;
        }
        if (i == 1) {
            startActivityForResult startactivityforresult2 = (startActivityForResult) ((zza) obj).write;
            startactivityforresult2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setAlpha(1.0f);
            startactivityforresult2._init_lambda2.IconCompatParcelizer((getCancel) null);
            startactivityforresult2._init_lambda2 = null;
            return;
        }
        startActivityForResult startactivityforresult3 = (startActivityForResult) ((accessgetGreencp) obj).write;
        startactivityforresult3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setVisibility(8);
        PopupWindow popupWindow = startactivityforresult3.ResultReceiver;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (startactivityforresult3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getParent() instanceof View) {
            View view = (View) startactivityforresult3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getParent();
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.requestApplyInsets();
        }
        startactivityforresult3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read();
        startactivityforresult3._init_lambda2.IconCompatParcelizer((getCancel) null);
        startactivityforresult3._init_lambda2 = null;
        ViewGroup viewGroup = startactivityforresult3.addMenuProvider;
        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
        viewGroup.requestApplyInsets();
    }
}
