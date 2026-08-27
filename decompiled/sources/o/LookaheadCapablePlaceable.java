package o;

import android.os.Bundle;
import coil3.Extras$Key;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadCapablePlaceable implements logTree {
    public static volatile LookaheadCapablePlaceable read;
    public final ConcurrentHashMap RemoteActionCompatParcelizer;
    public final Extras$Key serializer;

    @Override // o.logTree
    public final List IconCompatParcelizer(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer).serializer(str, "")) {
            undelegateUnprotectedui undelegateunprotectedui = addRulerReader.RemoteActionCompatParcelizer;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle);
            logTreeprintSubTree logtreeprintsubtree = new logTreeprintSubTree();
            String str2 = (String) accesslayoutjd.read(bundle, "origin", String.class, null);
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str2);
            logtreeprintsubtree.MediaMetadataCompat = str2;
            String str3 = (String) accesslayoutjd.read(bundle, "name", String.class, null);
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
            logtreeprintsubtree.write = str3;
            logtreeprintsubtree.MediaSessionCompatToken = accesslayoutjd.read(bundle, "value", Object.class, null);
            logtreeprintsubtree.MediaBrowserCompatMediaItem = (String) accesslayoutjd.read(bundle, "trigger_event_name", String.class, null);
            logtreeprintsubtree.PlaybackStateCompat = ((Long) accesslayoutjd.read(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            logtreeprintsubtree.MediaDescriptionCompat = (String) accesslayoutjd.read(bundle, "timed_out_event_name", String.class, null);
            logtreeprintsubtree.MediaSessionCompatQueueItem = (Bundle) accesslayoutjd.read(bundle, "timed_out_event_params", Bundle.class, null);
            logtreeprintsubtree.ParcelableVolumeInfo = (String) accesslayoutjd.read(bundle, "triggered_event_name", String.class, null);
            logtreeprintsubtree.MediaSessionCompatResultReceiverWrapper = (Bundle) accesslayoutjd.read(bundle, "triggered_event_params", Bundle.class, null);
            logtreeprintsubtree.RatingCompat = ((Long) accesslayoutjd.read(bundle, "time_to_live", Long.class, 0L)).longValue();
            logtreeprintsubtree.serializer = (String) accesslayoutjd.read(bundle, "expired_event_name", String.class, null);
            logtreeprintsubtree.read = (Bundle) accesslayoutjd.read(bundle, "expired_event_params", Bundle.class, null);
            logtreeprintsubtree.RemoteActionCompatParcelizer = ((Boolean) accesslayoutjd.read(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            logtreeprintsubtree.IconCompatParcelizer = ((Long) accesslayoutjd.read(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            logtreeprintsubtree.PlaybackStateCompatCustomAction = ((Long) accesslayoutjd.read(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(logtreeprintsubtree);
        }
        return arrayList;
    }

    @Override // o.logTree
    public final Map IconCompatParcelizer(boolean z) {
        return ((getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer).write(null, null, z);
    }

    @Override // o.logTree
    public final void IconCompatParcelizer(logTreeprintSubTree logtreeprintsubtree) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        undelegateUnprotectedui undelegateunprotectedui = addRulerReader.RemoteActionCompatParcelizer;
        String str = logtreeprintsubtree.MediaMetadataCompat;
        if (str.isEmpty()) {
            return;
        }
        Object obj = logtreeprintsubtree.MediaSessionCompatToken;
        if (obj != null) {
            Object obj2 = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object object = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            obj2 = object;
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (IOException | ClassNotFoundException unused) {
                }
                if (obj2 == null) {
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
                objectOutputStream = null;
            }
        }
        if (addRulerReader.IconCompatParcelizer(str) && addRulerReader.read(str, logtreeprintsubtree.write)) {
            String str2 = logtreeprintsubtree.serializer;
            if (str2 == null || (addRulerReader.serializer(logtreeprintsubtree.read, str2) && addRulerReader.IconCompatParcelizer(str, logtreeprintsubtree.serializer, logtreeprintsubtree.read))) {
                String str3 = logtreeprintsubtree.ParcelableVolumeInfo;
                if (str3 == null || (addRulerReader.serializer(logtreeprintsubtree.MediaSessionCompatResultReceiverWrapper, str3) && addRulerReader.IconCompatParcelizer(str, logtreeprintsubtree.ParcelableVolumeInfo, logtreeprintsubtree.MediaSessionCompatResultReceiverWrapper))) {
                    String str4 = logtreeprintsubtree.MediaDescriptionCompat;
                    if (str4 == null || (addRulerReader.serializer(logtreeprintsubtree.MediaSessionCompatQueueItem, str4) && addRulerReader.IconCompatParcelizer(str, logtreeprintsubtree.MediaDescriptionCompat, logtreeprintsubtree.MediaSessionCompatQueueItem))) {
                        Bundle bundle = new Bundle();
                        bundle.putString("origin", logtreeprintsubtree.MediaMetadataCompat);
                        String str5 = logtreeprintsubtree.write;
                        if (str5 != null) {
                            bundle.putString("name", str5);
                        }
                        Object obj3 = logtreeprintsubtree.MediaSessionCompatToken;
                        if (obj3 != null) {
                            accesslayoutjd.read(bundle, obj3);
                        }
                        String str6 = logtreeprintsubtree.MediaBrowserCompatMediaItem;
                        if (str6 != null) {
                            bundle.putString("trigger_event_name", str6);
                        }
                        bundle.putLong("trigger_timeout", logtreeprintsubtree.PlaybackStateCompat);
                        String str7 = logtreeprintsubtree.MediaDescriptionCompat;
                        if (str7 != null) {
                            bundle.putString("timed_out_event_name", str7);
                        }
                        Bundle bundle2 = logtreeprintsubtree.MediaSessionCompatQueueItem;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str8 = logtreeprintsubtree.ParcelableVolumeInfo;
                        if (str8 != null) {
                            bundle.putString("triggered_event_name", str8);
                        }
                        Bundle bundle3 = logtreeprintsubtree.MediaSessionCompatResultReceiverWrapper;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", logtreeprintsubtree.RatingCompat);
                        String str9 = logtreeprintsubtree.serializer;
                        if (str9 != null) {
                            bundle.putString("expired_event_name", str9);
                        }
                        Bundle bundle4 = logtreeprintsubtree.read;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", logtreeprintsubtree.IconCompatParcelizer);
                        bundle.putBoolean("active", logtreeprintsubtree.RemoteActionCompatParcelizer);
                        bundle.putLong("triggered_timestamp", logtreeprintsubtree.PlaybackStateCompatCustomAction);
                        getSoftRightEK5gGoQ getsoftrightek5ggoq = (getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer;
                        getsoftrightek5ggoq.write(new zzdi(getsoftrightek5ggoq, bundle));
                    }
                }
            }
        }
    }

    @Override // o.logTree
    public final void RemoteActionCompatParcelizer(String str) {
        getSoftRightEK5gGoQ getsoftrightek5ggoq = (getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer;
        getsoftrightek5ggoq.write(new getRoEK5gGoQ(getsoftrightek5ggoq, str, (String) null, (Bundle) null));
    }

    @Override // o.logTree
    public final int serializer(String str) {
        return ((getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer).read(str);
    }

    public LookaheadCapablePlaceable(Extras$Key extras$Key) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(extras$Key);
        this.serializer = extras$Key;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
    }

    @Override // o.logTree
    public final void serializer(String str, String str2, Bundle bundle) {
        if (addRulerReader.IconCompatParcelizer(str) && addRulerReader.serializer(bundle, str2) && addRulerReader.IconCompatParcelizer(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            getSoftRightEK5gGoQ getsoftrightek5ggoq = (getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer;
            getsoftrightek5ggoq.write(new getSoftLeftEK5gGoQ(getsoftrightek5ggoq, null, str, str2, bundle, true, true));
        }
    }

    @Override // o.logTree
    public final assertConsistent IconCompatParcelizer(String str, nodeToString nodetostring) {
        LookaheadAlignmentLines capturerulersosxe8f4default;
        if (addRulerReader.IconCompatParcelizer(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
            if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
                return null;
            }
            boolean zEquals = "fiam".equals(str);
            Extras$Key extras$Key = this.serializer;
            if (zEquals) {
                capturerulersosxe8f4default = new captureRulersOSxE8f4(extras$Key, nodetostring);
            } else {
                capturerulersosxe8f4default = "clx".equals(str) ? new captureRulersOSxE8f4default(extras$Key, nodetostring) : null;
            }
            if (capturerulersosxe8f4default != null) {
                concurrentHashMap.put(str, capturerulersosxe8f4default);
                return new zzbv(this, str, false, 13);
            }
        }
        return null;
    }

    @Override // o.logTree
    public final void RemoteActionCompatParcelizer(Object obj, String str) {
        if (addRulerReader.IconCompatParcelizer(str) && addRulerReader.read(str, "_ln")) {
            getSoftRightEK5gGoQ getsoftrightek5ggoq = (getSoftRightEK5gGoQ) this.serializer.IconCompatParcelizer;
            getsoftrightek5ggoq.write(new zzdh(getsoftrightek5ggoq, str, "_ln", obj, true));
        }
    }
}
