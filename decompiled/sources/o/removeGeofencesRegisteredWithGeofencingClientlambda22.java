package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import android.os.Looper;
import android.os.SystemClock;
import com.sentiance.sdk.Sentiance;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class removeGeofencesRegisteredWithGeofencingClientlambda22 extends BroadcastReceiver {
    public static final /* synthetic */ int serializer = 0;
    private parseLonglambda0 RatingCompat;
    private BroadcastReceiver.PendingResult write;
    private static final ArrayList read = new ArrayList();
    private static final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    private static final containsandroid_sdk_base_release IconCompatParcelizer = new containsandroid_sdk_base_release("BaseBroadcastReceiver", readInt.write().write("Receiver").getLooper());

    public abstract String read();

    public clearandroid_sdk_base_release serializer() {
        return null;
    }

    public abstract void write(Context context, Intent intent);

    public static int IconCompatParcelizer() {
        int size;
        ArrayList arrayList = RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            size = arrayList.size();
        }
        return size;
    }

    public static void RemoteActionCompatParcelizer() {
        ArrayList arrayList = read;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BroadcastReceiver.PendingResult) it.next()).finish();
            }
            read.clear();
        }
        IconCompatParcelizer.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean read(BroadcastReceiver.PendingResult pendingResult) {
        ArrayList arrayList = read;
        synchronized (arrayList) {
            if (!arrayList.remove(pendingResult)) {
                return false;
            }
            pendingResult.finish();
            return true;
        }
    }

    public static void serializer(long j, Context context, removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22) {
        new configureFromServerConfiglambda1(context);
        if (!Debug.isDebuggerConnected()) {
            long time = new Date().getTime();
            String str = removegeofencesregisteredwithgeofencingclientlambda22.read();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            context.getClass();
            File file = new File(context.getNoBackupFilesDir(), "sentiance/receiver-timeout");
            file.mkdirs();
            try {
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.serializer(new File(file, UUID.randomUUID().toString())));
                try {
                    readresourcevaluelambda2.serializer(new handleAdmRegistrationIntentlambda0(time, str, jElapsedRealtime - j).write());
                    readresourcevaluelambda2.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        int i = sourceInformationContextOfdefault.read();
                        int i2 = sourceInformationContextOfdefault.read();
                        int i3 = sourceInformationContextOfdefault.read();
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{readresourcevaluelambda2, th}, i3);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        BroadcastReceiver.PendingResult pendingResult = removegeofencesregisteredwithgeofencingclientlambda22.write;
        if (pendingResult != null) {
            read(pendingResult);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList = RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                arrayList.add(this);
            }
        }
        if (!Sentiance.getInstance(context).userExists() || setNotificationBadgeNumber.read().MediaSessionCompatQueueItem()) {
            synchronized (arrayList) {
                arrayList.remove(this);
            }
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(intent);
        this.write = goAsync();
        ArrayList arrayList2 = read;
        synchronized (arrayList2) {
            arrayList2.add(this.write);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        requestSingleLocationUpdateFromGooglePlay requestsinglelocationupdatefromgoogleplay = new requestSingleLocationUpdateFromGooglePlay(this, context, jElapsedRealtime, 0);
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = IconCompatParcelizer;
        containsandroid_sdk_base_releaseVar.IconCompatParcelizer(requestsinglelocationupdatefromgoogleplay, jRemoteActionCompatParcelizer - (jElapsedRealtime2 - jElapsedRealtime));
        containsandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new requestSingleLocationUpdateFromGooglePlaylambda1(this, requestsinglelocationupdatefromgoogleplay, context, jElapsedRealtime + 30000, jElapsedRealtime, new removeGeofencesRegisteredWithGeofencingClientlambda24(this, context, jElapsedRealtime, intent, 0)));
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }

    public final parseLonglambda0 RemoteActionCompatParcelizer(Context context) {
        if (this.RatingCompat == null) {
            this.RatingCompat = new parseLonglambda0(context, read(), (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class), (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0) setPushUniqueId.read(r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.class));
        }
        return this.RatingCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long RemoteActionCompatParcelizer(Intent intent) {
        return (intent == null || (intent.getFlags() & 268435456) != 0) ? 6000L : 25000L;
    }

    public static void write(removeGeofencesRegisteredWithGeofencingClientlambda22 removegeofencesregisteredwithgeofencingclientlambda22, requestSingleLocationUpdateFromGooglePlay requestsinglelocationupdatefromgoogleplay) {
        IconCompatParcelizer.serializer(requestsinglelocationupdatefromgoogleplay);
    }

    public static void read(Context context, Intent intent, String str) {
        ((migrateSealedSessionsMapToJsonlambda20) setPushUniqueId.read(migrateSealedSessionsMapToJsonlambda20.class)).read(RemoteActionCompatParcelizer(intent), str);
        intent.putExtra("acquired-wakelock-tag", str);
        context.sendBroadcast(intent);
    }

    public boolean read(Intent intent) {
        return this instanceof getBitmapFromDiskCachelambda01;
    }
}
