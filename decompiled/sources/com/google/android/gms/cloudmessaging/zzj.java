package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.cardview.widget.CardView$1;
import com.google.android.gms.tasks.zzc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.accessgetNinecp;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzj implements Runnable {
    public final /* synthetic */ zzp RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ zzj(zzp zzpVar, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.write != 0) {
            zzp zzpVar = this.RemoteActionCompatParcelizer;
            synchronized (zzpVar) {
                if (zzpVar.serializer == 1) {
                    zzpVar.write("Timed out while binding");
                }
            }
            return;
        }
        while (true) {
            zzp zzpVar2 = this.RemoteActionCompatParcelizer;
            synchronized (zzpVar2) {
                if (zzpVar2.serializer != 2) {
                    return;
                }
                if (zzpVar2.IconCompatParcelizer.isEmpty()) {
                    zzpVar2.read();
                    return;
                }
                accessgetNinecp accessgetninecp = (accessgetNinecp) zzpVar2.IconCompatParcelizer.poll();
                zzpVar2.write.put(accessgetninecp.RemoteActionCompatParcelizer, accessgetninecp);
                ((ScheduledExecutorService) zzpVar2.MediaMetadataCompat.read).schedule(new zzc(zzpVar2, 5, accessgetninecp), 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    "Sending ".concat(String.valueOf(accessgetninecp));
                }
                r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = zzpVar2.MediaMetadataCompat;
                Messenger messenger = zzpVar2.RemoteActionCompatParcelizer;
                int i = accessgetninecp.serializer;
                Context context = (Context) r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat;
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.arg1 = accessgetninecp.RemoteActionCompatParcelizer;
                messageObtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", accessgetninecp.write());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle(RemoteMessageConst.DATA, accessgetninecp.read);
                messageObtain.setData(bundle);
                try {
                    CardView$1 cardView$1 = zzpVar2.read;
                    Messenger messenger2 = (Messenger) cardView$1.RemoteActionCompatParcelizer;
                    if (messenger2 != null) {
                        messenger2.send(messageObtain);
                    } else {
                        zzd zzdVar = (zzd) cardView$1.IconCompatParcelizer;
                        if (zzdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        Messenger messenger3 = zzdVar.read;
                        messenger3.getClass();
                        messenger3.send(messageObtain);
                    }
                } catch (RemoteException e) {
                    zzpVar2.write(e.getMessage());
                }
            }
        }
    }
}
