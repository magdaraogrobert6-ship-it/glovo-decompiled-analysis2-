package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class readAnimationScale extends BroadcastReceiver {
    public volatile toAutofillIdCompat IconCompatParcelizer;
    public volatile Looper serializer;

    public abstract void IconCompatParcelizer(Intent intent);

    public int RemoteActionCompatParcelizer() {
        return 0;
    }

    public String write() {
        return "Loc-Safe-Receiver";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.serializer == null || this.IconCompatParcelizer == null) {
            HandlerThread handlerThread = new HandlerThread(!TextUtils.isEmpty(write()) ? write() : "Loc-Safe-Receiver");
            handlerThread.start();
            this.serializer = handlerThread.getLooper();
            this.IconCompatParcelizer = new toAutofillIdCompat(this, this.serializer, 3);
        }
        Message messageObtainMessage = this.IconCompatParcelizer.obtainMessage();
        messageObtainMessage.what = 102;
        messageObtainMessage.obj = intent;
        this.IconCompatParcelizer.sendMessage(messageObtainMessage);
    }
}
