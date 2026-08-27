package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.core.ImageCapture$1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 extends androidx.activity.result.ActivityResultRegistry {
    public final /* synthetic */ androidx.activity.ComponentActivity RemoteActionCompatParcelizer;

    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(androidx.activity.ComponentActivity componentActivity) {
        this.RemoteActionCompatParcelizer = componentActivity;
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public final void onLaunch(int i, onNewIntent onnewintent, Object obj, FocusDirection focusDirection) {
        Bundle bundle;
        androidx.activity.ComponentActivity componentActivity = this.RemoteActionCompatParcelizer;
        ImageCapture$1 imageCapture$1IconCompatParcelizer = onnewintent.IconCompatParcelizer(componentActivity, obj);
        if (imageCapture$1IconCompatParcelizer != null) {
            new Handler(Looper.getMainLooper()).post(new renderUrlIntoViewlambda1(i, 1, this, imageCapture$1IconCompatParcelizer));
            return;
        }
        Intent intentRemoteActionCompatParcelizer = onnewintent.RemoteActionCompatParcelizer(componentActivity, obj);
        if (intentRemoteActionCompatParcelizer.getExtras() != null) {
            Bundle extras = intentRemoteActionCompatParcelizer.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentRemoteActionCompatParcelizer.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (intentRemoteActionCompatParcelizer.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentRemoteActionCompatParcelizer.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentRemoteActionCompatParcelizer.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentRemoteActionCompatParcelizer.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentRemoteActionCompatParcelizer.getAction())) {
                componentActivity.startActivityForResult(intentRemoteActionCompatParcelizer, i, bundle);
                return;
            }
            androidx.activity.result.IntentSenderRequest intentSenderRequest = (androidx.activity.result.IntentSenderRequest) intentRemoteActionCompatParcelizer.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                intentSenderRequest.getClass();
                componentActivity.startIntentSenderForResult(intentSenderRequest.read(), i, intentSenderRequest.IconCompatParcelizer(), intentSenderRequest.RemoteActionCompatParcelizer(), intentSenderRequest.write(), 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new renderUrlIntoViewlambda1(i, 2, this, e));
                return;
            }
        }
        String[] stringArrayExtra = intentRemoteActionCompatParcelizer.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
            if (TextUtils.isEmpty(stringArrayExtra[i2])) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr[i3] = stringArrayExtra[i4];
                    i3++;
                }
            }
        }
        if (componentActivity instanceof androidx.fragment.app.FragmentActivity) {
            ((androidx.fragment.app.FragmentActivity) componentActivity).validateRequestPermissionsRequestCode(i);
        }
        componentActivity.requestPermissions(stringArrayExtra, i);
    }
}
