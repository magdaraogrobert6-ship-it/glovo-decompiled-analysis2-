package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNavigateNextcp;
import o.accessgetNumPad1cp;
import o.accessgetTvTeletextcp;
import o.getBrightnessDownEK5gGoQ;
import o.getLocalPinnableContainer;
import o.processDragGesture;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes2.dex */
public final class Rpc {
    public static int RemoteActionCompatParcelizer;
    public static final Pattern serializer = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static PendingIntent write;
    public final Context IconCompatParcelizer;
    public final ScheduledThreadPoolExecutor MediaBrowserCompatMediaItem;
    public Messenger MediaDescriptionCompat;
    public final Huffman$Node MediaMetadataCompat;
    public final Messenger MediaSessionCompatQueueItem;
    public zzd RatingCompat;
    public final processDragGesture read = new processDragGesture(0);

    public final void IconCompatParcelizer(Bundle bundle, String str) {
        synchronized (this.read) {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.read.remove(str);
            if (parentDataModifierDefaultImpls != null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(bundle);
                return;
            }
            SentryLogcatAdapter.IconCompatParcelizer("Rpc", "Missing callback for " + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    public final zzw RemoteActionCompatParcelizer(Bundle bundle) {
        String string;
        int iWrite;
        Context context;
        synchronized (Rpc.class) {
            int i = RemoteActionCompatParcelizer;
            RemoteActionCompatParcelizer = i + 1;
            string = Integer.toString(i);
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        synchronized (this.read) {
            this.read.put(string, parentDataModifierDefaultImpls);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.MediaMetadataCompat.write() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.IconCompatParcelizer;
        synchronized (Rpc.class) {
            if (write == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                write = PendingIntent.getBroadcast(context2, 0, intent2, getBrightnessDownEK5gGoQ.RemoteActionCompatParcelizer);
            }
            intent.putExtra("app", write);
        }
        intent.putExtra("kid", "|ID|" + string + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.MediaSessionCompatQueueItem);
        if (this.MediaDescriptionCompat == null && this.RatingCompat == null) {
            iWrite = this.MediaMetadataCompat.write();
            context = this.IconCompatParcelizer;
            if (iWrite == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.MediaDescriptionCompat;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.RatingCompat.read;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                iWrite = this.MediaMetadataCompat.write();
                context = this.IconCompatParcelizer;
                if (iWrite == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.addOnCompleteListener(accessgetNumPad1cp.read, new accessgetTvTeletextcp((Object) this, string, (Comparable) this.MediaBrowserCompatMediaItem.schedule(new getLocalPinnableContainer(1, parentDataModifierDefaultImpls), 30L, TimeUnit.SECONDS), 9));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public Rpc(Context context) {
        this.IconCompatParcelizer = context;
        Huffman$Node huffman$Node = new Huffman$Node();
        huffman$Node.read = 0;
        huffman$Node.write = context;
        this.MediaMetadataCompat = huffman$Node;
        this.MediaSessionCompatQueueItem = new Messenger(new accessgetNavigateNextcp(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.MediaBrowserCompatMediaItem = scheduledThreadPoolExecutor;
    }
}
