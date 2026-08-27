package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.cardview.widget.CardView$1;
import com.google.android.gms.stats.zza;
import com.google.android.gms.tasks.zzc;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.accessgetNinecp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvAudioDescriptionMixingVolumeUpcp;
import o.getBackEK5gGoQ;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements ServiceConnection {
    public final ArrayDeque IconCompatParcelizer;
    public final /* synthetic */ r8lambdaU31FnmCtqQics3i75Jr9dkZcEk MediaMetadataCompat;
    public final Messenger RemoteActionCompatParcelizer;
    public CardView$1 read;
    public int serializer = 0;
    public final SparseArray write;

    public final void read() {
        synchronized (this) {
            if (this.serializer == 2 && this.IconCompatParcelizer.isEmpty() && this.write.size() == 0) {
                Log.isLoggable("MessengerIpcClient", 2);
                this.serializer = 3;
                accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().IconCompatParcelizer((Context) this.MediaMetadataCompat.MediaMetadataCompat, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean serializer(accessgetNinecp accessgetninecp) {
        synchronized (this) {
            int i = this.serializer;
            Object[] objArr = 0;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    this.IconCompatParcelizer.add(accessgetninecp);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                this.IconCompatParcelizer.add(accessgetninecp);
                ((ScheduledExecutorService) this.MediaMetadataCompat.read).execute(new zzj(this, objArr == true ? 1 : 0));
                return true;
            }
            this.IconCompatParcelizer.add(accessgetninecp);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(this.serializer == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.serializer = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().read((Context) this.MediaMetadataCompat.MediaMetadataCompat, intent, this, 1)) {
                    ((ScheduledExecutorService) this.MediaMetadataCompat.read).schedule(new zzj(this, i2), 30L, TimeUnit.SECONDS);
                } else {
                    write("Unable to bind to service");
                }
            } catch (SecurityException e) {
                RemoteActionCompatParcelizer("Unable to bind to service", e);
            }
            return true;
        }
    }

    public final void write(String str) {
        synchronized (this) {
            RemoteActionCompatParcelizer(str, null);
        }
    }

    public zzp(r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek) {
        this.MediaMetadataCompat = r8lambdau31fnmctqqics3i75jr9dkzcek;
        getBackEK5gGoQ getbackek5ggoq = new getBackEK5gGoQ(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                zzp zzpVar = this.read;
                synchronized (zzpVar) {
                    accessgetNinecp accessgetninecp = (accessgetNinecp) zzpVar.write.get(i);
                    if (accessgetninecp == null) {
                        SentryLogcatAdapter.IconCompatParcelizer("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    zzpVar.write.remove(i);
                    zzpVar.read();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        accessgetninecp.serializer(new zzt("Not supported by GmsCore", null));
                        return true;
                    }
                    if (accessgetninecp.IconCompatParcelizer != 0) {
                        Bundle bundle = data.getBundle(RemoteMessageConst.DATA);
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            accessgetninecp.toString();
                            String.valueOf(bundle);
                        }
                        accessgetninecp.write.IconCompatParcelizer(bundle);
                        return true;
                    }
                    if (data.getBoolean("ack", false)) {
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            accessgetninecp.toString();
                        }
                        accessgetninecp.write.IconCompatParcelizer((Object) null);
                        return true;
                    }
                    accessgetninecp.serializer(new zzt("Invalid response to one way request", null));
                    return true;
                }
            }
        });
        Looper.getMainLooper();
        this.RemoteActionCompatParcelizer = new Messenger(getbackek5ggoq);
        this.IconCompatParcelizer = new ArrayDeque();
        this.write = new SparseArray();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.MediaMetadataCompat.read).execute(new zzc(this, 4, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.MediaMetadataCompat.read).execute(new zza(11, this));
    }

    public final void RemoteActionCompatParcelizer(String str, SecurityException securityException) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.serializer;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.serializer = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.serializer = 4;
            accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().IconCompatParcelizer((Context) this.MediaMetadataCompat.MediaMetadataCompat, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((accessgetNinecp) it.next()).serializer(zztVar);
            }
            this.IconCompatParcelizer.clear();
            int i2 = 0;
            while (true) {
                int size = this.write.size();
                SparseArray sparseArray = this.write;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((accessgetNinecp) sparseArray.valueAt(i2)).serializer(zztVar);
                    i2++;
                }
            }
        }
    }
}
