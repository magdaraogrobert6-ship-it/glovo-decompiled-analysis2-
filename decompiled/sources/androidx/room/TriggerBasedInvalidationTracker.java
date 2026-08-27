package androidx.room;

import androidx.datastore.core.SimpleActor$offer$2;
import bo.app.b8$$ExternalSyntheticLambda4;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter$launchJob$1;
import coil3.memory.MemoryCacheService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.CaptionedImageContentCardView;
import o.Color;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.accessdrawOvaljd;
import o.accessgetDarkGraycp;
import o.accessgetGraycp;
import o.accessgetIntersectcp;
import o.accessgetMagentacp;
import o.clipRectN_I0legdefault;
import o.createFromParcel;
import o.getInAppMessageViewLifecycleListener;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker {
    public static final String[] serializer = {"INSERT", "UPDATE", "DELETE"};
    public final HomeFragment.AnonymousClass1 MediaBrowserCompatMediaItem;
    public final String[] MediaSessionCompatQueueItem;
    public final HashMap ParcelableVolumeInfo;
    public final boolean PlaybackStateCompat;
    public final HashMap RatingCompat;
    public final MemoryCacheService RemoteActionCompatParcelizer;
    public final RoomDatabase read;
    public final accessdrawOvaljd write;
    public final AtomicBoolean MediaMetadataCompat = new AtomicBoolean(false);
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer = new b8$$ExternalSyntheticLambda4(23);
    public final LinkedHashMap MediaDescriptionCompat = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object access$notifyInvalidation(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) throws Throwable {
        accessgetDarkGraycp accessgetdarkgraycp;
        accessgetMagentacp closeBarrier$room_runtime;
        accessgetMagentacp accessgetmagentacp;
        Object obj;
        int[] iArr;
        RoomDatabase roomDatabase = triggerBasedInvalidationTracker.read;
        if (continuationImpl instanceof accessgetDarkGraycp) {
            accessgetdarkgraycp = (accessgetDarkGraycp) continuationImpl;
            int i = accessgetdarkgraycp.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetdarkgraycp.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                accessgetdarkgraycp = new accessgetDarkGraycp(triggerBasedInvalidationTracker, continuationImpl);
            }
        } else {
            accessgetdarkgraycp = new accessgetDarkGraycp(triggerBasedInvalidationTracker, continuationImpl);
        }
        Object obj2 = accessgetdarkgraycp.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetdarkgraycp.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 0;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            closeBarrier$room_runtime = roomDatabase.getCloseBarrier$room_runtime();
            boolean zWrite = closeBarrier$room_runtime.write();
            ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
            if (!zWrite) {
                return itemTouchHelperAdapter;
            }
            try {
                if (!triggerBasedInvalidationTracker.MediaMetadataCompat.compareAndSet(true, false)) {
                    closeBarrier$room_runtime.read();
                    return itemTouchHelperAdapter;
                }
                if (!((Boolean) triggerBasedInvalidationTracker.IconCompatParcelizer.invoke()).booleanValue()) {
                    closeBarrier$room_runtime.read();
                    return itemTouchHelperAdapter;
                }
                TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(triggerBasedInvalidationTracker, shortNewsContentCardView, i3);
                accessgetdarkgraycp.IconCompatParcelizer = closeBarrier$room_runtime;
                accessgetdarkgraycp.RemoteActionCompatParcelizer = 1;
                Object objUseConnection = roomDatabase.useConnection(false, triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1, accessgetdarkgraycp);
                if (objUseConnection == coroutineSingletons) {
                    return coroutineSingletons;
                }
                accessgetmagentacp = closeBarrier$room_runtime;
                obj2 = objUseConnection;
            } catch (Throwable th) {
                th = th;
                closeBarrier$room_runtime.read();
                throw th;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            accessgetmagentacp = accessgetdarkgraycp.IconCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } catch (Throwable th2) {
                th = th2;
                closeBarrier$room_runtime = accessgetmagentacp;
                closeBarrier$room_runtime.read();
                throw th;
            }
        }
        Set set = (Set) obj2;
        if (!set.isEmpty()) {
            MemoryCacheService memoryCacheService = triggerBasedInvalidationTracker.RemoteActionCompatParcelizer;
            memoryCacheService.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                MutableStateFlow mutableStateFlow = (MutableStateFlow) memoryCacheService.RemoteActionCompatParcelizer;
                do {
                    obj = mutableStateFlow.read();
                    int[] iArr2 = (int[]) obj;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, iArr));
            }
            triggerBasedInvalidationTracker.MediaBrowserCompatMediaItem.invoke(set);
        }
        accessgetmagentacp.read();
        return set;
    }

    public TriggerBasedInvalidationTracker(RoomDatabase roomDatabase, HashMap map, HashMap map2, String[] strArr, boolean z, HomeFragment.AnonymousClass1 anonymousClass1) {
        String lowerCase;
        this.read = roomDatabase;
        this.RatingCompat = map;
        this.ParcelableVolumeInfo = map2;
        this.PlaybackStateCompat = z;
        this.MediaBrowserCompatMediaItem = anonymousClass1;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.MediaDescriptionCompat.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.RatingCompat.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.MediaSessionCompatQueueItem = strArr2;
        for (Map.Entry entry : this.RatingCompat.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.MediaDescriptionCompat.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.MediaDescriptionCompat;
                linkedHashMap.put(lowerCase4, onMove.read(linkedHashMap, lowerCase3));
            }
        }
        this.write = new accessdrawOvaljd(this.MediaSessionCompatQueueItem.length);
        int length2 = this.MediaSessionCompatQueueItem.length;
        MemoryCacheService memoryCacheService = new MemoryCacheService();
        memoryCacheService.RemoteActionCompatParcelizer = StateFlowKt.read(new int[length2]);
        this.RemoteActionCompatParcelizer = memoryCacheService;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$stopTrackingTable(androidx.room.TriggerBasedInvalidationTracker r8, o.ClipOpCompanion r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof o.accessgetBluecp
            if (r0 == 0) goto L16
            r0 = r11
            o.accessgetBluecp r0 = (o.accessgetBluecp) r0
            int r1 = r0.MediaMetadataCompat
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 + r2
            r0.MediaMetadataCompat = r1
            goto L1b
        L16:
            o.accessgetBluecp r0 = new o.accessgetBluecp
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.MediaDescriptionCompat
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.MediaMetadataCompat
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.RemoteActionCompatParcelizer
            int r9 = r0.write
            java.lang.String[] r10 = r0.IconCompatParcelizer
            java.lang.String r2 = r0.serializer
            o.clipRectN_I0legdefault r4 = r0.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            r11 = r10
            r10 = r4
            goto L83
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            r8 = 0
            return r8
        L3d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            java.lang.String[] r8 = r8.MediaSessionCompatQueueItem
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.TriggerBasedInvalidationTracker.serializer
            r11 = 3
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4e:
            if (r9 >= r8) goto L85
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 96
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            java.lang.String r4 = bo.app.m1$$ExternalSyntheticOutline0.m(r5, r6, r4)
            r0.read = r10
            r0.serializer = r2
            r0.IconCompatParcelizer = r11
            r0.write = r9
            r0.RemoteActionCompatParcelizer = r8
            r0.MediaMetadataCompat = r3
            java.lang.Object r4 = kotlin.ranges.RangesKt.execSQL(r10, r4, r0)
            if (r4 != r1) goto L83
            return r1
        L83:
            int r9 = r9 + r3
            goto L4e
        L85:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.access$stopTrackingTable(androidx.room.TriggerBasedInvalidationTracker, o.ClipOpCompanion, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void read(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        if (this.MediaMetadataCompat.compareAndSet(false, true)) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            BuildersKt.RemoteActionCompatParcelizer(this.read.getCoroutineScope(), new getInAppMessageViewLifecycleListener("Room Invalidation Tracker Refresh"), null, new SimpleActor$offer$2(this, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (ShortNewsContentCardView) null, 6), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$checkInvalidatedTables(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, clipRectN_I0legdefault cliprectn_i0legdefault, ContinuationImpl continuationImpl) {
        Color color;
        if (continuationImpl instanceof Color) {
            color = (Color) continuationImpl;
            int i = color.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                color.read = i - Integer.MIN_VALUE;
            } else {
                color = new Color(triggerBasedInvalidationTracker, continuationImpl);
            }
        } else {
            color = new Color(triggerBasedInvalidationTracker, continuationImpl);
        }
        Object objUsePrepared = color.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = color.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objUsePrepared);
            accessgetIntersectcp accessgetintersectcp = new accessgetIntersectcp(6);
            color.RemoteActionCompatParcelizer = cliprectn_i0legdefault;
            color.read = 1;
            objUsePrepared = cliprectn_i0legdefault.usePrepared("SELECT * FROM room_table_modification_log WHERE invalidated = 1", accessgetintersectcp, color);
            if (objUsePrepared != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) color.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objUsePrepared);
            return set;
        }
        cliprectn_i0legdefault = (clipRectN_I0legdefault) color.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objUsePrepared);
        Set set2 = (Set) objUsePrepared;
        if (!set2.isEmpty()) {
            color.RemoteActionCompatParcelizer = set2;
            color.read = 2;
            if (RangesKt.execSQL(cliprectn_i0legdefault, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", color) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return set2;
    }

    public final onViewAttachedToWindowlambda0 serializer(String[] strArr) {
        strArr.getClass();
        CaptionedImageContentCardView captionedImageContentCardView = new CaptionedImageContentCardView();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.ParcelableVolumeInfo.get(lowerCase);
            if (set != null) {
                captionedImageContentCardView.addAll(set);
            } else {
                captionedImageContentCardView.add(str);
            }
        }
        String[] strArr2 = (String[]) RangesKt.IconCompatParcelizer(captionedImageContentCardView).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.MediaDescriptionCompat.get(lowerCase2);
            if (num == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new onViewAttachedToWindowlambda0(strArr2, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncTriggers$room_runtime(ContinuationImpl continuationImpl) throws Throwable {
        accessgetGraycp accessgetgraycp;
        accessgetMagentacp accessgetmagentacp;
        if (continuationImpl instanceof accessgetGraycp) {
            accessgetgraycp = (accessgetGraycp) continuationImpl;
            int i = accessgetgraycp.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetgraycp.write = i - Integer.MIN_VALUE;
            } else {
                accessgetgraycp = new accessgetGraycp(this, continuationImpl);
            }
        } else {
            accessgetgraycp = new accessgetGraycp(this, continuationImpl);
        }
        Object obj = accessgetgraycp.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetgraycp.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            RoomDatabase roomDatabase = this.read;
            accessgetMagentacp closeBarrier$room_runtime = roomDatabase.getCloseBarrier$room_runtime();
            if (closeBarrier$room_runtime.write()) {
                try {
                    AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(this, shortNewsContentCardView, 5);
                    accessgetgraycp.RemoteActionCompatParcelizer = closeBarrier$room_runtime;
                    accessgetgraycp.write = 1;
                    if (roomDatabase.useConnection(false, asyncImagePainter$launchJob$1, accessgetgraycp) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    accessgetmagentacp = closeBarrier$room_runtime;
                    accessgetmagentacp.read();
                } catch (Throwable th) {
                    th = th;
                    accessgetmagentacp = closeBarrier$room_runtime;
                    accessgetmagentacp.read();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            accessgetmagentacp = accessgetgraycp.RemoteActionCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                accessgetmagentacp.read();
            } catch (Throwable th2) {
                th = th2;
                accessgetmagentacp.read();
                throw th;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:29:0x00db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$startTrackingTable(androidx.room.TriggerBasedInvalidationTracker r17, o.ClipOpCompanion r18, int r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(androidx.room.TriggerBasedInvalidationTracker, o.ClipOpCompanion, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
