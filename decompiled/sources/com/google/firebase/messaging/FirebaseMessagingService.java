package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.sqlite.SQLite;
import androidx.transition.TransitionValuesMaps;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.wisesecurity.ucs_credential.x;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.accessgetNinecp;
import o.accessgetTvInputHdmi1cp;
import o.getClipEntry;
import o.getQueryParameterslambda2;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    private static final Queue<String> RemoteActionCompatParcelizer = new ArrayDeque(10);
    private Rpc read;

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(Rpc rpc) {
        this.read = rpc;
    }

    public static void resetForTesting() {
        RemoteActionCompatParcelizer.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) TransitionValuesMaps.read().RatingCompat).poll();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) throws IOException {
        String stringExtra;
        byte b;
        Bundle extras;
        getClipEntry getclipentry;
        ExecutorService executorServiceNewSingleThreadExecutor;
        String stringExtra2;
        String stringExtra3;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                onNewToken(intent.getStringExtra("token"));
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra4 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra4)) {
            stringExtra = intent.getStringExtra(RemoteMessageConst.MSGTYPE);
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            switch (stringExtra) {
                case "deleted_messages":
                    b = 0;
                    break;
                case "gcm":
                    b = 1;
                    break;
                case "send_error":
                    b = 2;
                    break;
                case "send_event":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                onDeletedMessages();
            } else if (b != 1) {
                int iSerializer = getQueryParameterslambda2.serializer();
                SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 1745115302, new Object[]{intent}, getQueryParameterslambda2.serializer(), -1745115298, iSerializer);
                extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (getClipEntry.read(extras)) {
                    getclipentry = new getClipEntry(extras, 0);
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new accessgetTvInputHdmi1cp("Firebase-Messaging-Network-Io"));
                    try {
                        if (new x(this, getclipentry, executorServiceNewSingleThreadExecutor).read()) {
                            executorServiceNewSingleThreadExecutor.shutdown();
                        } else {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            if (SQLite.serializer(intent)) {
                                SQLite.IconCompatParcelizer(intent.getExtras(), "_nf");
                            }
                            onMessageReceived(new RemoteMessage(extras));
                        }
                    } catch (Throwable th) {
                        executorServiceNewSingleThreadExecutor.shutdown();
                        throw th;
                    }
                } else {
                    onMessageReceived(new RemoteMessage(extras));
                }
            } else if (b != 2) {
                stringExtra2 = intent.getStringExtra("google.message_id");
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra(PushNotificationParserObj.MESSAGE_ID_KEY);
                }
                stringExtra3 = intent.getStringExtra(FWFConstants.EXPLANATION_TYPE_ERROR);
                SendException sendException = new SendException(stringExtra3);
                if (stringExtra3 != null) {
                    stringExtra3.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra2, sendException);
            } else if (b != 3) {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
            } else {
                onMessageSent(intent.getStringExtra("google.message_id"));
            }
        } else {
            Queue<String> queue = RemoteActionCompatParcelizer;
            if (queue.contains(stringExtra4)) {
                Log.isLoggable("FirebaseMessaging", 3);
            } else {
                if (queue.size() >= 10) {
                    queue.remove();
                }
                queue.add(stringExtra4);
                stringExtra = intent.getStringExtra(RemoteMessageConst.MSGTYPE);
                if (stringExtra == null) {
                    stringExtra = "gcm";
                }
                switch (stringExtra) {
                    case -2062414158:
                        if (stringExtra.equals("deleted_messages")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case 102161:
                        if (stringExtra.equals("gcm")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case 814694033:
                        if (stringExtra.equals("send_error")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case 814800675:
                        if (stringExtra.equals("send_event")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    onDeletedMessages();
                } else if (b != 1) {
                    int iSerializer2 = getQueryParameterslambda2.serializer();
                    SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 1745115302, new Object[]{intent}, getQueryParameterslambda2.serializer(), -1745115298, iSerializer2);
                    extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (getClipEntry.read(extras)) {
                        getclipentry = new getClipEntry(extras, 0);
                        executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new accessgetTvInputHdmi1cp("Firebase-Messaging-Network-Io"));
                        if (new x(this, getclipentry, executorServiceNewSingleThreadExecutor).read()) {
                            executorServiceNewSingleThreadExecutor.shutdown();
                        } else {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            if (SQLite.serializer(intent)) {
                                SQLite.IconCompatParcelizer(intent.getExtras(), "_nf");
                            }
                            onMessageReceived(new RemoteMessage(extras));
                        }
                    } else {
                        onMessageReceived(new RemoteMessage(extras));
                    }
                } else if (b != 2) {
                    stringExtra2 = intent.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent.getStringExtra(PushNotificationParserObj.MESSAGE_ID_KEY);
                    }
                    stringExtra3 = intent.getStringExtra(FWFConstants.EXPLANATION_TYPE_ERROR);
                    SendException sendException2 = new SendException(stringExtra3);
                    if (stringExtra3 != null) {
                        stringExtra3.toLowerCase(Locale.US).getClass();
                    }
                    onSendError(stringExtra2, sendException2);
                } else if (b != 3) {
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                } else {
                    onMessageSent(intent.getStringExtra("google.message_id"));
                }
            }
        }
        if (this.read == null) {
            this.read = new Rpc(getApplicationContext());
        }
        Rpc rpc = this.read;
        CloudMessage cloudMessage = new CloudMessage(intent);
        if (rpc.MediaMetadataCompat.read() < 233700000) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.RemoteActionCompatParcelizer());
        Integer numSerializer = cloudMessage.serializer();
        if (numSerializer != null) {
            bundle.putInt("google.product_id", numSerializer.intValue());
        }
        r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcekWrite = r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.write(rpc.IconCompatParcelizer);
        synchronized (r8lambdau31fnmctqqics3i75jr9dkzcekWrite) {
            i = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem;
            r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem = i + 1;
        }
        r8lambdau31fnmctqqics3i75jr9dkzcekWrite.RemoteActionCompatParcelizer(new accessgetNinecp(i, 3, bundle, 0));
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
