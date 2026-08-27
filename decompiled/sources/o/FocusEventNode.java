package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class FocusEventNode implements Handler.Callback, ServiceConnection {
    public final Handler IconCompatParcelizer;
    public final Context write;
    public final HashMap serializer = new HashMap();
    public Set RemoteActionCompatParcelizer = new HashSet();

    public final void IconCompatParcelizer(calculateFocusRectRelativeTo calculatefocusrectrelativeto) {
        ComponentName componentName = calculatefocusrectrelativeto.IconCompatParcelizer;
        ArrayDeque arrayDeque = calculatefocusrectrelativeto.read;
        Handler handler = this.IconCompatParcelizer;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = calculatefocusrectrelativeto.serializer;
        int i2 = i + 1;
        calculatefocusrectrelativeto.serializer = i2;
        if (i2 <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
            return;
        }
        SentryLogcatAdapter.IconCompatParcelizer("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + calculatefocusrectrelativeto.serializer + " retries");
        arrayDeque.clear();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[LOOP:0: B:20:0x0058->B:26:0x006a, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: RemoteException -> 0x0075, DeadObjectException -> 0x0088, TryCatch #2 {DeadObjectException -> 0x0088, RemoteException -> 0x0075, blocks: (B:23:0x0061, B:25:0x0067, B:26:0x006a), top: B:39:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[EDGE_INSN: B:41:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:20:0x0058->B:26:0x006a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final void read(calculateFocusRectRelativeTo calculatefocusrectrelativeto) {
        toAndroidFocusDirection3ESFkO8 toandroidfocusdirection3esfko8;
        ArrayDeque arrayDeque = calculatefocusrectrelativeto.read;
        ComponentName componentName = calculatefocusrectrelativeto.IconCompatParcelizer;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (!calculatefocusrectrelativeto.write) {
            Intent component = new Intent(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
            Context context = this.write;
            boolean zBindService = context.bindService(component, this, 33);
            calculatefocusrectrelativeto.write = zBindService;
            if (zBindService) {
                calculatefocusrectrelativeto.serializer = 0;
            } else {
                SentryLogcatAdapter.IconCompatParcelizer("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            if (calculatefocusrectrelativeto.write) {
                if (calculatefocusrectrelativeto.RemoteActionCompatParcelizer != null) {
                    while (true) {
                        toandroidfocusdirection3esfko8 = (toAndroidFocusDirection3ESFkO8) arrayDeque.peek();
                        if (toandroidfocusdirection3esfko8 == null) {
                            break;
                            break;
                        }
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            toandroidfocusdirection3esfko8.toString();
                        }
                        ((FocusInteropUtils_androidKt) toandroidfocusdirection3esfko8).serializer(calculatefocusrectrelativeto.RemoteActionCompatParcelizer);
                        arrayDeque.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                    IconCompatParcelizer(calculatefocusrectrelativeto);
                    return;
                }
            }
        } else if (calculatefocusrectrelativeto.RemoteActionCompatParcelizer != null) {
            while (true) {
                toandroidfocusdirection3esfko8 = (toAndroidFocusDirection3ESFkO8) arrayDeque.peek();
                if (toandroidfocusdirection3esfko8 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        toandroidfocusdirection3esfko8.toString();
                    }
                    ((FocusInteropUtils_androidKt) toandroidfocusdirection3esfko8).serializer(calculatefocusrectrelativeto.RemoteActionCompatParcelizer);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException e) {
                    SentryLogcatAdapter.write("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                IconCompatParcelizer(calculatefocusrectrelativeto);
                return;
            }
            return;
        }
        IconCompatParcelizer(calculatefocusrectrelativeto);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Context context = this.write;
        HashMap map = this.serializer;
        PlaybackStateCompat playbackStateCompat = null;
        if (i == 0) {
            toAndroidFocusDirection3ESFkO8 toandroidfocusdirection3esfko8 = (toAndroidFocusDirection3ESFkO8) message.obj;
            Set<String> enabledListenerPackages = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(context);
            if (!enabledListenerPackages.equals(this.RemoteActionCompatParcelizer)) {
                this.RemoteActionCompatParcelizer = enabledListenerPackages;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            SentryLogcatAdapter.IconCompatParcelizer("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        map.put(componentName2, new calculateFocusRectRelativeTo(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        calculateFocusRectRelativeTo calculatefocusrectrelativeto = (calculateFocusRectRelativeTo) entry.getValue();
                        if (calculatefocusrectrelativeto.write) {
                            context.unbindService(this);
                            calculatefocusrectrelativeto.write = false;
                        }
                        calculatefocusrectrelativeto.RemoteActionCompatParcelizer = null;
                        it.remove();
                    }
                }
            }
            for (calculateFocusRectRelativeTo calculatefocusrectrelativeto2 : map.values()) {
                calculatefocusrectrelativeto2.read.add(toandroidfocusdirection3esfko8);
                read(calculatefocusrectrelativeto2);
            }
        } else if (i == 1) {
            FocusEventModifierNodeKtWhenMappings focusEventModifierNodeKtWhenMappings = (FocusEventModifierNodeKtWhenMappings) message.obj;
            ComponentName componentName3 = focusEventModifierNodeKtWhenMappings.write;
            IBinder iBinder = focusEventModifierNodeKtWhenMappings.serializer;
            calculateFocusRectRelativeTo calculatefocusrectrelativeto3 = (calculateFocusRectRelativeTo) map.get(componentName3);
            if (calculatefocusrectrelativeto3 != null) {
                int i2 = MediaSessionCompatResultReceiverWrapper.read;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PlaybackStateCompat.RemoteActionCompatParcelizer);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof PlaybackStateCompat)) {
                        ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                        parcelableVolumeInfo.write = iBinder;
                        playbackStateCompat = parcelableVolumeInfo;
                    } else {
                        playbackStateCompat = (PlaybackStateCompat) iInterfaceQueryLocalInterface;
                    }
                }
                calculatefocusrectrelativeto3.RemoteActionCompatParcelizer = playbackStateCompat;
                calculatefocusrectrelativeto3.serializer = 0;
                read(calculatefocusrectrelativeto3);
                return true;
            }
        } else if (i == 2) {
            calculateFocusRectRelativeTo calculatefocusrectrelativeto4 = (calculateFocusRectRelativeTo) map.get((ComponentName) message.obj);
            if (calculatefocusrectrelativeto4 != null) {
                if (calculatefocusrectrelativeto4.write) {
                    context.unbindService(this);
                    calculatefocusrectrelativeto4.write = false;
                }
                calculatefocusrectrelativeto4.RemoteActionCompatParcelizer = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            calculateFocusRectRelativeTo calculatefocusrectrelativeto5 = (calculateFocusRectRelativeTo) map.get((ComponentName) message.obj);
            if (calculatefocusrectrelativeto5 != null) {
                read(calculatefocusrectrelativeto5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.IconCompatParcelizer.obtainMessage(1, new FocusEventModifierNodeKtWhenMappings(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.IconCompatParcelizer.obtainMessage(2, componentName).sendToTarget();
    }

    public final void write(toAndroidFocusDirection3ESFkO8 toandroidfocusdirection3esfko8) {
        this.IconCompatParcelizer.obtainMessage(0, toandroidfocusdirection3esfko8).sendToTarget();
    }

    public FocusEventNode(Context context) {
        this.write = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.IconCompatParcelizer = new Handler(handlerThread.getLooper(), this);
    }
}
