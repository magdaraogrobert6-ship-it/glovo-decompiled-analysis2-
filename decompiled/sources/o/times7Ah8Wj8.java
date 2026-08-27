package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.ImageCapture$1;
import com.roadrunner.domain.util.RetryWithDelay;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class times7Ah8Wj8 extends onNewIntent {
    public final /* synthetic */ int write;

    public /* synthetic */ times7Ah8Wj8(int i) {
        this.write = i;
    }

    @Override // o.onNewIntent
    public ImageCapture$1 IconCompatParcelizer(Context context, Object obj) {
        if (this.write != 1) {
            return super.IconCompatParcelizer(context, obj);
        }
        String[] strArr = (String[]) obj;
        strArr.getClass();
        int i = 2;
        if (strArr.length == 0) {
            return new ImageCapture$1(i, SimpleItemTouchHelperCallback.serializer);
        }
        for (String str : strArr) {
            if (FocusListener.write(context, str) != 0) {
                return null;
            }
        }
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(strArr.length);
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new ImageCapture$1(i, linkedHashMap);
    }

    @Override // o.onNewIntent
    public final Intent RemoteActionCompatParcelizer(Context context, Object obj) {
        Bundle bundleExtra;
        int i = this.write;
        if (i != 0) {
            if (i != 1) {
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            }
            String[] strArr = (String[]) obj;
            strArr.getClass();
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            intentPutExtra.getClass();
            return intentPutExtra;
        }
        androidx.activity.result.IntentSenderRequest intentSenderRequestWrite = (androidx.activity.result.IntentSenderRequest) obj;
        Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intentIconCompatParcelizer = intentSenderRequestWrite.IconCompatParcelizer();
        if (intentIconCompatParcelizer != null && (bundleExtra = intentIconCompatParcelizer.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intentIconCompatParcelizer.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intentIconCompatParcelizer.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                RetryWithDelay retryWithDelay = new RetryWithDelay(intentSenderRequestWrite.read());
                retryWithDelay.serializer(null);
                retryWithDelay.serializer(intentSenderRequestWrite.write(), intentSenderRequestWrite.RemoteActionCompatParcelizer());
                intentSenderRequestWrite = retryWithDelay.write();
            }
        }
        intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequestWrite);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            intent2.toString();
        }
        return intent2;
    }

    @Override // o.onNewIntent
    public final Object serializer(int i, Intent intent) {
        int i2 = this.write;
        if (i2 == 0) {
            return new androidx.activity.result.ActivityResult(i, intent);
        }
        if (i2 != 1) {
            return new androidx.activity.result.ActivityResult(i, intent);
        }
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                return onMove.serializer(onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) onContentCardClicked.RemoteActionCompatParcelizer((Object[]) stringArrayExtra), (Iterable) arrayList));
            }
        }
        return SimpleItemTouchHelperCallback.serializer;
    }
}
