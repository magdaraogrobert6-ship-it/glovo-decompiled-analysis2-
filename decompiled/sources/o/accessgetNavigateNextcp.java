package o;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzd;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNavigateNextcp extends getBackEK5gGoQ {
    public final /* synthetic */ Rpc read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetNavigateNextcp(Rpc rpc, Looper looper) {
        super(looper);
        this.read = rpc;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Rpc rpc = this.read;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new accessgetNavigatePreviouscp());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        rpc.RatingCompat = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.MediaDescriptionCompat = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Rpc.serializer.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        rpc.IconCompatParcelizer(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra(FWFConstants.EXPLANATION_TYPE_ERROR);
                if (stringExtra2 == null) {
                    SentryLogcatAdapter.IconCompatParcelizer("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                    synchronized (rpc.read) {
                        int i = 0;
                        while (true) {
                            processDragGesture processdraggesture = rpc.read;
                            if (i < processdraggesture.MediaMetadataCompat) {
                                rpc.IconCompatParcelizer(intent2.getExtras(), (String) processdraggesture.IconCompatParcelizer(i));
                                i++;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    SentryLogcatAdapter.IconCompatParcelizer("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                rpc.IconCompatParcelizer(intent2.putExtra(FWFConstants.EXPLANATION_TYPE_ERROR, strSubstring).getExtras(), str);
                return;
            }
        }
        SentryLogcatAdapter.IconCompatParcelizer("Rpc", "Dropping invalid message");
    }
}
