package o;

import android.content.Context;
import android.widget.Toast;
import com.sentiance.sdk.OnInitCallback;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.detectionupdates.UserActivity;
import com.sentiance.sdk.detectionupdates.UserActivityListener;
import com.sentiance.sdk.events.EventUploadResult;
import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBitmapFromDiskCachelambda00 implements Runnable {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getBitmapFromDiskCachelambda00(Object obj, int i, Object obj2) {
        this.write = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        if (i == 0) {
            Toast.makeText((Context) obj, "Upload ".concat(((EventUploadResult) obj2).write() ? " succeeded" : " failed"), 1).show();
            return;
        }
        if (i == 1) {
            Toast.makeText((Context) obj, "Upload ".concat(((LogUploadResult) obj2).serializer() ? " succeeded" : " failed"), 1).show();
            return;
        }
        if (i == 2) {
            ((Sentiance) obj2).lambda$setUserActivityListener$44((UserActivityListener) obj);
        } else if (i != 3) {
            ((UserActivityListener) obj2).onUserActivityChange((UserActivity) obj);
        } else {
            ((Sentiance) obj2).lambda$failInitWithOSNotSupportedReason$6((OnInitCallback) obj);
        }
    }
}
