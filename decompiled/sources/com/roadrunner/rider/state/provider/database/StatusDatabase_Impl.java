package com.roadrunner.rider.state.provider.database;

import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import com.roadrunner.rider.state.provider.database.StatusDatabase_Impl;
import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.Logger;
import o.displayInAppMessagelambda1;
import o.getAndroidCanvasannotations;
import o.getAndroidLogLevel;
import o.getBlack0d7_KjUannotations;
import o.getF16_sVssgQ;
import o.getSignedData;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.resolveClass;
import o.rotateRad;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes3.dex */
public final class StatusDatabase_Impl extends StatusDatabase {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    private final onViewDetachedFromWindowlambda1 RatingCompat;
    private final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 read;

    public static final /* synthetic */ void IconCompatParcelizer(StatusDatabase_Impl statusDatabase_Impl, tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        statusDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
        int i4 = MediaMetadataCompat + 63;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ resolveClass RemoteActionCompatParcelizer(StatusDatabase_Impl statusDatabase_Impl) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            MediaDescriptionCompat(statusDatabase_Impl);
            throw null;
        }
        resolveClass resolveclassMediaDescriptionCompat = MediaDescriptionCompat(statusDatabase_Impl);
        int i3 = MediaMetadataCompat + 33;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return resolveclassMediaDescriptionCompat;
        }
        throw null;
    }

    public static /* synthetic */ getSignedData read(StatusDatabase_Impl statusDatabase_Impl) {
        getSignedData getsigneddataWrite;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getsigneddataWrite = write(statusDatabase_Impl);
            int i3 = 48 / 0;
        } else {
            getsigneddataWrite = write(statusDatabase_Impl);
        }
        int i4 = MediaBrowserCompatMediaItem + 121;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getsigneddataWrite;
    }

    public static /* synthetic */ getAndroidLogLevel serializer(StatusDatabase_Impl statusDatabase_Impl) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAndroidLogLevel getandroidloglevelIconCompatParcelizer = IconCompatParcelizer(statusDatabase_Impl);
        int i4 = MediaBrowserCompatMediaItem + 45;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getandroidloglevelIconCompatParcelizer;
        }
        throw null;
    }

    private static final getAndroidLogLevel IconCompatParcelizer(StatusDatabase_Impl statusDatabase_Impl) {
        int i = 2 % 2;
        getAndroidLogLevel getandroidloglevel = new getAndroidLogLevel(statusDatabase_Impl);
        int i2 = MediaMetadataCompat + 125;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getandroidloglevel;
        }
        throw null;
    }

    private static final resolveClass MediaDescriptionCompat(StatusDatabase_Impl statusDatabase_Impl) {
        int i = 2 % 2;
        resolveClass resolveclass = new resolveClass(statusDatabase_Impl);
        int i2 = MediaMetadataCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return resolveclass;
    }

    private static final getSignedData write(StatusDatabase_Impl statusDatabase_Impl) {
        int i = 2 % 2;
        getSignedData getsigneddata = new getSignedData(statusDatabase_Impl);
        int i2 = MediaBrowserCompatMediaItem + 3;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getsigneddata;
    }

    public getAndroidCanvasannotations IconCompatParcelizer() {
        int i = 2 % 2;
        getF16_sVssgQ getf16_svssgq = new getF16_sVssgQ(this);
        int i2 = MediaMetadataCompat + 61;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getf16_svssgq;
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = MediaBrowserCompatMediaItem + 85;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return linkedHashSet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public StatusDatabase_Impl() {
        final int i = 0;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.LogLevel
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ StatusDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = serializer + 27;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                StatusDatabase_Impl statusDatabase_Impl = this.read;
                if (i5 == 0) {
                    return StatusDatabase_Impl.read(statusDatabase_Impl);
                }
                if (i5 != 1) {
                    return StatusDatabase_Impl.serializer(statusDatabase_Impl);
                }
                resolveClass resolveclassRemoteActionCompatParcelizer = StatusDatabase_Impl.RemoteActionCompatParcelizer(statusDatabase_Impl);
                int i6 = IconCompatParcelizer + 51;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 54 / 0;
                }
                return resolveclassRemoteActionCompatParcelizer;
            }
        });
        final int i2 = 1;
        this.RatingCompat = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.LogLevel
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ StatusDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = serializer + 27;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                StatusDatabase_Impl statusDatabase_Impl = this.read;
                if (i6 == 0) {
                    return StatusDatabase_Impl.read(statusDatabase_Impl);
                }
                if (i6 != 1) {
                    return StatusDatabase_Impl.serializer(statusDatabase_Impl);
                }
                resolveClass resolveclassRemoteActionCompatParcelizer = StatusDatabase_Impl.RemoteActionCompatParcelizer(statusDatabase_Impl);
                int i7 = IconCompatParcelizer + 51;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 54 / 0;
                }
                return resolveclassRemoteActionCompatParcelizer;
            }
        });
        final int i3 = 2;
        this.read = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.LogLevel
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;
            public final /* synthetic */ StatusDatabase_Impl read;

            {
                this.read = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i4 = 2 % 2;
                int i5 = serializer + 27;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i3;
                StatusDatabase_Impl statusDatabase_Impl = this.read;
                if (i7 == 0) {
                    return StatusDatabase_Impl.read(statusDatabase_Impl);
                }
                if (i7 != 1) {
                    return StatusDatabase_Impl.serializer(statusDatabase_Impl);
                }
                resolveClass resolveclassRemoteActionCompatParcelizer = StatusDatabase_Impl.RemoteActionCompatParcelizer(statusDatabase_Impl);
                int i8 = IconCompatParcelizer + 51;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 54 / 0;
                }
                return resolveclassRemoteActionCompatParcelizer;
            }
        });
    }

    @Override // androidx.room.RoomDatabase
    public /* synthetic */ rotateRad createOpenDelegate() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAndroidCanvasannotations getandroidcanvasannotationsIconCompatParcelizer = IconCompatParcelizer();
        int i4 = MediaBrowserCompatMediaItem + 107;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getandroidcanvasannotationsIconCompatParcelizer;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        int i = 2 % 2;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = MediaMetadataCompat + 43;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // com.roadrunner.rider.state.provider.database.StatusDatabase
    public WorkOpportunityDao read() {
        WorkOpportunityDao workOpportunityDao;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            workOpportunityDao = (WorkOpportunityDao) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
            int i3 = 86 / 0;
        } else {
            workOpportunityDao = (WorkOpportunityDao) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = MediaMetadataCompat + 55;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return workOpportunityDao;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.roadrunner.rider.state.provider.database.StatusDatabase
    public Logger serializer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 65;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Logger logger = (Logger) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        int i4 = MediaMetadataCompat + 71;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return logger;
    }

    @Override // com.roadrunner.rider.state.provider.database.StatusDatabase
    public ShiftInfoDao write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ShiftInfoDao shiftInfoDao = (ShiftInfoDao) this.read.MediaSessionCompatResultReceiverWrapper();
        int i4 = MediaMetadataCompat + 117;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return shiftInfoDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        performClear(false, "status", "work_opportunity", "shift_info");
        int i4 = MediaBrowserCompatMediaItem + 51;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        int i = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "status", "work_opportunity", "shift_info");
        int i2 = MediaMetadataCompat + 95;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return invalidationTracker;
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Logger.class);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        linkedHashMap.put(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(WorkOpportunityDao.class), instance_delegatelambda0Var);
        linkedHashMap.put(displayInAppMessagelambda1.serializer(ShiftInfoDao.class), instance_delegatelambda0Var);
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return linkedHashMap;
        }
        throw null;
    }
}
