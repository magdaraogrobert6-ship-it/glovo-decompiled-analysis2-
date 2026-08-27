package androidx.work.impl;

import androidx.room.InvalidationTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.IntervalTreeiterator1;
import o.LinearGradient;
import o.OutlineGeneric;
import o.OutlineRectangle;
import o.displayInAppMessagelambda1;
import o.getAndroidCanvasannotations;
import o.getArgb8888_sVssgQ;
import o.getBlack0d7_KjUannotations;
import o.getColorsui_graphics;
import o.getEndF1C5BW0ui_graphics;
import o.getF16_sVssgQ;
import o.getStartF1C5BW0ui_graphics;
import o.getStopsui_graphics;
import o.getTileMode3opZhB0ui_graphics;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.invertimpl;
import o.isAdapterPositionOnScreen;
import o.mapimpl;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.readPixelsdefault;
import o.resetToPivotedTransformimpl;
import o.resetToPivotedTransformimpldefault;
import o.rotateXimpl;
import o.scaleimpl;
import o.translateimpldefault;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final onViewDetachedFromWindowlambda1 MediaBrowserCompatMediaItem;
    private final onViewDetachedFromWindowlambda1 MediaDescriptionCompat;
    private final onViewDetachedFromWindowlambda1 MediaMetadataCompat;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatQueueItem;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatToken;
    private final onViewDetachedFromWindowlambda1 PlaybackStateCompatCustomAction;
    private final onViewDetachedFromWindowlambda1 RatingCompat;
    private final onViewDetachedFromWindowlambda1 read;

    /* JADX INFO: Access modifiers changed from: private */
    public static final getStartF1C5BW0ui_graphics MediaDescriptionCompat(WorkDatabase_Impl workDatabase_Impl) {
        return new getStartF1C5BW0ui_graphics(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getColorsui_graphics MediaSessionCompatQueueItem(WorkDatabase_Impl workDatabase_Impl) {
        return new getColorsui_graphics(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rotateXimpl MediaSessionCompatResultReceiverWrapper(WorkDatabase_Impl workDatabase_Impl) {
        return new rotateXimpl(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final translateimpldefault MediaSessionCompatToken(WorkDatabase_Impl workDatabase_Impl) {
        return new translateimpldefault(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getTileMode3opZhB0ui_graphics ParcelableVolumeInfo(WorkDatabase_Impl workDatabase_Impl) {
        return new getTileMode3opZhB0ui_graphics(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getStopsui_graphics PlaybackStateCompat(WorkDatabase_Impl workDatabase_Impl) {
        workDatabase_Impl.getClass();
        return new getStopsui_graphics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final resetToPivotedTransformimpldefault PlaybackStateCompatCustomAction(WorkDatabase_Impl workDatabase_Impl) {
        return new resetToPivotedTransformimpldefault(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OutlineRectangle ResultReceiver(WorkDatabase_Impl workDatabase_Impl) {
        return new OutlineRectangle(workDatabase_Impl);
    }

    @Override // androidx.work.impl.WorkDatabase
    public IntervalTreeiterator1 IconCompatParcelizer() {
        return (IntervalTreeiterator1) this.read.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.work.impl.WorkDatabase
    public scaleimpl MediaMetadataCompat() {
        return (scaleimpl) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: merged with bridge method [inline-methods] */
    public getAndroidCanvasannotations createOpenDelegate() {
        return new getF16_sVssgQ(this);
    }

    @Override // androidx.work.impl.WorkDatabase
    public OutlineGeneric RatingCompat() {
        return (OutlineGeneric) this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.work.impl.WorkDatabase
    public resetToPivotedTransformimpl RemoteActionCompatParcelizer() {
        return (resetToPivotedTransformimpl) this.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(scaleimpl.class);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        linkedHashMap.put(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(IntervalTreeiterator1.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(OutlineGeneric.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(invertimpl.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(mapimpl.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(resetToPivotedTransformimpl.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(LinearGradient.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(getEndF1C5BW0ui_graphics.class), instance_delegatelambda0Var);
        return linkedHashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public mapimpl read() {
        return (mapimpl) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.work.impl.WorkDatabase
    public LinearGradient serializer() {
        return (LinearGradient) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.work.impl.WorkDatabase
    public invertimpl write() {
        return (invertimpl) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new readPixelsdefault(13, 14, 10));
        arrayList.add(new getArgb8888_sVssgQ(0));
        arrayList.add(new readPixelsdefault(16, 17, 11));
        arrayList.add(new readPixelsdefault(17, 18, 12));
        arrayList.add(new readPixelsdefault(18, 19, 13));
        arrayList.add(new getArgb8888_sVssgQ(1));
        arrayList.add(new readPixelsdefault(20, 21, 14));
        arrayList.add(new readPixelsdefault(22, 23, 15));
        arrayList.add(new readPixelsdefault(23, 24, 16));
        return arrayList;
    }

    public WorkDatabase_Impl() {
        final int i = 0;
        this.MediaSessionCompatToken = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i2) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i3) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.PlaybackStateCompatCustomAction = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = i3;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i4) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i5 = i4;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i5) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i5 = 4;
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i6 = i5;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i6) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i6 = 5;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i7 = i6;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i7) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i7 = 6;
        this.RatingCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i8 = i7;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i8) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
        final int i8 = 7;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.getGpu_sVssgQ
            public final /* synthetic */ androidx.work.impl.WorkDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i9 = i8;
                androidx.work.impl.WorkDatabase_Impl workDatabase_Impl = this.read;
                switch (i9) {
                    case 0:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatToken(workDatabase_Impl);
                    case 1:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatQueueItem(workDatabase_Impl);
                    case 2:
                        return androidx.work.impl.WorkDatabase_Impl.ResultReceiver(workDatabase_Impl);
                    case 3:
                        return androidx.work.impl.WorkDatabase_Impl.ParcelableVolumeInfo(workDatabase_Impl);
                    case 4:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompatCustomAction(workDatabase_Impl);
                    case 5:
                        return androidx.work.impl.WorkDatabase_Impl.MediaSessionCompatResultReceiverWrapper(workDatabase_Impl);
                    case 6:
                        return androidx.work.impl.WorkDatabase_Impl.MediaDescriptionCompat(workDatabase_Impl);
                    default:
                        return androidx.work.impl.WorkDatabase_Impl.PlaybackStateCompat(workDatabase_Impl);
                }
            }
        });
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        performClear(true, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }
}
