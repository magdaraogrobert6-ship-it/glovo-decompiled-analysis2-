package o;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final class IntervalTreeKt implements findFirstOverlap, rememberGraphicsLayer {
    public static final String write = setRotationX.IconCompatParcelizer("SystemFgDispatcher");
    public getAdd0d7_KjU IconCompatParcelizer;
    public final androidx.work.impl.WorkManagerImpl MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat = new Object();
    public final accessgetStrokecp MediaMetadataCompat;
    public final HashMap MediaSessionCompatQueueItem;
    public final HashMap RatingCompat;
    public mapMKHz9U RemoteActionCompatParcelizer;
    public final LinkedHashMap read;
    public final r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8 serializer;

    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer = null;
        synchronized (this.MediaDescriptionCompat) {
            Iterator it = this.RatingCompat.values().iterator();
            while (it.hasNext()) {
                ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) it.next()).write(null);
            }
        }
        getDefaultShadowColor getdefaultshadowcolor = this.MediaBrowserCompatMediaItem.MediaMetadataCompat;
        synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
            getdefaultshadowcolor.MediaDescriptionCompat.remove(this);
        }
    }

    @Override // o.rememberGraphicsLayer
    public final void write(mapMKHz9U mapmkhz9u, boolean z) {
        Map.Entry entry;
        synchronized (this.MediaDescriptionCompat) {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = ((setFrom58bKbWc) this.MediaSessionCompatQueueItem.remove(mapmkhz9u)) != null ? (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.RatingCompat.remove(mapmkhz9u) : null;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            }
        }
        accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd = (accesssetBlendModes9anfk8jd) this.read.remove(mapmkhz9u);
        if (mapmkhz9u.equals(this.RemoteActionCompatParcelizer)) {
            if (this.read.size() > 0) {
                Iterator it = this.read.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.RemoteActionCompatParcelizer = (mapMKHz9U) entry.getKey();
                if (this.IconCompatParcelizer != null) {
                    accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd2 = (accesssetBlendModes9anfk8jd) entry.getValue();
                    getAdd0d7_KjU getadd0d7_kju = this.IconCompatParcelizer;
                    int i = accesssetblendmodes9anfk8jd2.IconCompatParcelizer;
                    int i2 = accesssetblendmodes9anfk8jd2.write;
                    Notification notification = accesssetblendmodes9anfk8jd2.serializer;
                    getadd0d7_kju.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        hasFocusableContent.IconCompatParcelizer(getadd0d7_kju, i, notification, i2);
                    } else if (i3 >= 29) {
                        accessgetRightcp.write(getadd0d7_kju, i, notification, i2);
                    } else {
                        getadd0d7_kju.startForeground(i, notification);
                    }
                    this.IconCompatParcelizer.write.cancel(accesssetblendmodes9anfk8jd2.IconCompatParcelizer);
                }
            } else {
                this.RemoteActionCompatParcelizer = null;
            }
        }
        getAdd0d7_KjU getadd0d7_kju2 = this.IconCompatParcelizer;
        if (accesssetblendmodes9anfk8jd == null || getadd0d7_kju2 == null) {
            return;
        }
        setRotationX setrotationx = setRotationX.read();
        mapmkhz9u.toString();
        setrotationx.getClass();
        getadd0d7_kju2.write.cancel(accesssetblendmodes9anfk8jd.IconCompatParcelizer);
    }

    public static Intent IconCompatParcelizer(Context context, mapMKHz9U mapmkhz9u, accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd) {
        Intent intent = new Intent(context, (Class<?>) getAdd0d7_KjU.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mapmkhz9u.RemoteActionCompatParcelizer);
        intent.putExtra("KEY_GENERATION", mapmkhz9u.serializer);
        intent.putExtra("KEY_NOTIFICATION_ID", accesssetblendmodes9anfk8jd.IconCompatParcelizer);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", accesssetblendmodes9anfk8jd.write);
        intent.putExtra("KEY_NOTIFICATION", accesssetblendmodes9anfk8jd.serializer);
        return intent;
    }

    public static Intent serializer(Context context) {
        Intent intent = new Intent(context, (Class<?>) getAdd0d7_KjU.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        setRotationX.read().getClass();
        for (Map.Entry entry : this.read.entrySet()) {
            if (((accesssetBlendModes9anfk8jd) entry.getValue()).write == i2) {
                mapMKHz9U mapmkhz9u = (mapMKHz9U) entry.getKey();
                androidx.work.impl.WorkManagerImpl workManagerImpl = this.MediaBrowserCompatMediaItem;
                accessgetStrokecp accessgetstrokecp = workManagerImpl.MediaSessionCompatToken;
                drawOutlinewDX37Wwdefault drawoutlinewdx37wwdefault = new drawOutlinewDX37Wwdefault(workManagerImpl.MediaMetadataCompat, new accessgetRgb565cp(mapmkhz9u), true, -128);
                accessgetstrokecp.getClass();
                accessgetstrokecp.RemoteActionCompatParcelizer.execute(drawoutlinewdx37wwdefault);
            }
        }
        getAdd0d7_KjU getadd0d7_kju = this.IconCompatParcelizer;
        if (getadd0d7_kju != null) {
            getadd0d7_kju.serializer = true;
            setRotationX.read().getClass();
            getadd0d7_kju.stopForeground(true);
            getadd0d7_kju.stopSelf(i);
        }
    }

    @Override // o.findFirstOverlap
    public final void serializer(setFrom58bKbWc setfrom58bkbwc, forEachui_graphicsdefault foreachui_graphicsdefault) {
        if (foreachui_graphicsdefault instanceof rebalance) {
            setRotationX.read().getClass();
            int iWrite = MaybeObserveOn.write();
            int iWrite2 = MaybeObserveOn.write();
            int iWrite3 = MaybeObserveOn.write();
            mapMKHz9U mapmkhz9u = (mapMKHz9U) ModuleDSLKt.serializer(MaybeObserveOn.write(), -1836924254, iWrite2, 1836924255, iWrite, new Object[]{setfrom58bkbwc}, iWrite3);
            int i = ((rebalance) foreachui_graphicsdefault).RemoteActionCompatParcelizer;
            androidx.work.impl.WorkManagerImpl workManagerImpl = this.MediaBrowserCompatMediaItem;
            accessgetStrokecp accessgetstrokecp = workManagerImpl.MediaSessionCompatToken;
            drawOutlinewDX37Wwdefault drawoutlinewdx37wwdefault = new drawOutlinewDX37Wwdefault(workManagerImpl.MediaMetadataCompat, new accessgetRgb565cp(mapmkhz9u), true, i);
            accessgetstrokecp.getClass();
            accessgetstrokecp.RemoteActionCompatParcelizer.execute(drawoutlinewdx37wwdefault);
        }
    }

    public IntervalTreeKt(Context context) {
        androidx.work.impl.WorkManagerImpl workManagerImplRemoteActionCompatParcelizer = androidx.work.impl.WorkManagerImpl.RemoteActionCompatParcelizer(context);
        this.MediaBrowserCompatMediaItem = workManagerImplRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = workManagerImplRemoteActionCompatParcelizer.MediaSessionCompatToken;
        this.RemoteActionCompatParcelizer = null;
        this.read = new LinkedHashMap();
        this.RatingCompat = new HashMap();
        this.MediaSessionCompatQueueItem = new HashMap();
        this.serializer = new r8lambdaE2BXePptxpG5qJ9wRzYqgCf9S8(workManagerImplRemoteActionCompatParcelizer.ParcelableVolumeInfo);
        workManagerImplRemoteActionCompatParcelizer.MediaMetadataCompat.RemoteActionCompatParcelizer(this);
    }

    public final void write(Intent intent) {
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        mapMKHz9U mapmkhz9u = new mapMKHz9U(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        setRotationX.read().getClass();
        if (notification == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Notification passed in the intent was null.");
            return;
        }
        accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd = new accesssetBlendModes9anfk8jd(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.read;
        linkedHashMap.put(mapmkhz9u, accesssetblendmodes9anfk8jd);
        accesssetBlendModes9anfk8jd accesssetblendmodes9anfk8jd2 = (accesssetBlendModes9anfk8jd) linkedHashMap.get(this.RemoteActionCompatParcelizer);
        if (accesssetblendmodes9anfk8jd2 == null) {
            this.RemoteActionCompatParcelizer = mapmkhz9u;
        } else {
            this.IconCompatParcelizer.write.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((accesssetBlendModes9anfk8jd) ((Map.Entry) it.next()).getValue()).write;
                }
                accesssetblendmodes9anfk8jd = new accesssetBlendModes9anfk8jd(accesssetblendmodes9anfk8jd2.IconCompatParcelizer, accesssetblendmodes9anfk8jd2.serializer, i);
            } else {
                accesssetblendmodes9anfk8jd = accesssetblendmodes9anfk8jd2;
            }
        }
        getAdd0d7_KjU getadd0d7_kju = this.IconCompatParcelizer;
        int i2 = accesssetblendmodes9anfk8jd.IconCompatParcelizer;
        int i3 = accesssetblendmodes9anfk8jd.write;
        Notification notification2 = accesssetblendmodes9anfk8jd.serializer;
        getadd0d7_kju.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            hasFocusableContent.IconCompatParcelizer(getadd0d7_kju, i2, notification2, i3);
        } else if (i4 >= 29) {
            accessgetRightcp.write(getadd0d7_kju, i2, notification2, i3);
        } else {
            getadd0d7_kju.startForeground(i2, notification2);
        }
    }
}
