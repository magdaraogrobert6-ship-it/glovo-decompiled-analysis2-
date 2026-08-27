package com.sentiance.sdk.drivinginsights.api;

import android.content.Context;
import com.sentiance.protobuf.ByteString;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.tile.roaddirection.store.ZippedRoadDirectionTileStore;
import com.sentiance.sdk.util.BoundingBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.DataStoreProvidereExternalSyntheticLambda0;
import o.accessgetInstancedelegatecp;
import o.clearAllData;
import o.createFromParcel;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStackannotations;
import o.onLocationRequestComplete;
import o.r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14;
import o.runlambda0;
import o.setPushUniqueId;
import o.setUpGeofenceslambda0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
public class DrivingInsightsDebug {
    private static DrivingInsightsDebug sInstance;
    private final Context mContext;

    @DontObfuscate
    public static class RoadDirectionDebugApiTile {
        private final int direction360Degrees;
        private final boolean hasCloseByRoadWithOpposingDirection;
        private final double latitude;
        private final double longitude;

        public int getDirection360Degrees() {
            return this.direction360Degrees;
        }

        public double getLatitude() {
            return this.latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public boolean isHasCloseByRoadWithOpposingDirection() {
            return this.hasCloseByRoadWithOpposingDirection;
        }

        public RoadDirectionDebugApiTile(int i, boolean z, double d, double d2) {
            this.direction360Degrees = i;
            this.hasCloseByRoadWithOpposingDirection = z;
            this.latitude = d;
            this.longitude = d2;
        }
    }

    public static DrivingInsightsDebug getInstance(Context context) {
        DrivingInsightsDebug drivingInsightsDebug;
        synchronized (DrivingInsightsDebug.class) {
            if (sInstance == null) {
                sInstance = new DrivingInsightsDebug(context);
            }
            drivingInsightsDebug = sInstance;
        }
        return drivingInsightsDebug;
    }

    public List<HarshDrivingEvent> getHarshDrivingTimeline() {
        return ((onLocationRequestComplete) setPushUniqueId.read(onLocationRequestComplete.class)).IconCompatParcelizer();
    }

    public List<PhoneUsageEvent> getPhoneUsageTimeline() {
        return ((onLocationRequestComplete) setPushUniqueId.read(onLocationRequestComplete.class)).serializer();
    }

    public List<RoadDirectionDebugApiTile> getRoadDirectionTiles(double d, double d2, double d3, double d4) {
        setUpGeofenceslambda0 setupgeofenceslambda0 = (setUpGeofenceslambda0) setPushUniqueId.read(setUpGeofenceslambda0.class);
        BoundingBox boundingBox = new BoundingBox(d, d2, d3, d4);
        setupgeofenceslambda0.getClass();
        ZippedRoadDirectionTileStore zippedRoadDirectionTileStore = (ZippedRoadDirectionTileStore) setPushUniqueId.read(ZippedRoadDirectionTileStore.class);
        List<String> listWrite = boundingBox.write();
        listWrite.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : listWrite) {
            str.getClass();
            r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14 r8lambdag1lfbqyro3zscbzcmaqly52kh14Serializer = zippedRoadDirectionTileStore.serializer(str);
            if (r8lambdag1lfbqyro3zscbzcmaqly52kh14Serializer != null) {
                arrayList.add(r8lambdag1lfbqyro3zscbzcmaqly52kh14Serializer);
            }
        }
        int i = 10;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14 r8lambdag1lfbqyro3zscbzcmaqly52kh14 = (r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14) it.next();
            final String strRemoteActionCompatParcelizer = r8lambdag1lfbqyro3zscbzcmaqly52kh14.RemoteActionCompatParcelizer();
            final ByteString byteStringIconCompatParcelizer = r8lambdag1lfbqyro3zscbzcmaqly52kh14.IconCompatParcelizer();
            final DataStoreProvidereExternalSyntheticLambda0 dataStoreProvidereExternalSyntheticLambda0 = (DataStoreProvidereExternalSyntheticLambda0) setPushUniqueId.read(DataStoreProvidereExternalSyntheticLambda0.class);
            ArrayList arrayList3 = new ArrayList();
            int i2 = 2;
            final int iSerializer = byteStringIconCompatParcelizer.serializer() / 2;
            Semaphore semaphore = new Semaphore(0);
            int iWrite = BackspaceCommand.write();
            int iWrite2 = BackspaceCommand.write();
            int iWrite3 = BackspaceCommand.write();
            ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, iWrite2, BackspaceCommand.write(), new Object[]{0, 2}, iWrite3, -281231677, iWrite);
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, i));
            getInAppMessageStackannotations it2 = ensuresubscribedtoinappmessageeventslambda7.iterator();
            while (it2.RemoteActionCompatParcelizer) {
                final int iRemoteActionCompatParcelizer = it2.RemoteActionCompatParcelizer();
                getInAppMessageStackannotations getinappmessagestackannotations = it2;
                final setUpGeofenceslambda0 setupgeofenceslambda1 = setupgeofenceslambda0;
                setUpGeofenceslambda0 setupgeofenceslambda2 = setupgeofenceslambda0;
                ArrayList arrayList5 = arrayList4;
                final Semaphore semaphore2 = semaphore;
                final BoundingBox boundingBox2 = boundingBox;
                BoundingBox boundingBox3 = boundingBox;
                int i3 = i2;
                final ArrayList arrayList6 = arrayList3;
                ((clearAllData) setPushUniqueId.read(clearAllData.class)).RemoteActionCompatParcelizer(new Runnable() { // from class: o.tearDownGeofenceslambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        setUpGeofenceslambda0.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, iSerializer, byteStringIconCompatParcelizer, dataStoreProvidereExternalSyntheticLambda0, setupgeofenceslambda1, strRemoteActionCompatParcelizer, boundingBox2, arrayList6, semaphore2);
                    }
                });
                arrayList5.add(createFromParcel.INSTANCE);
                it = it;
                semaphore = semaphore2;
                arrayList4 = arrayList5;
                i2 = i3;
                it2 = getinappmessagestackannotations;
                setupgeofenceslambda0 = setupgeofenceslambda2;
                boundingBox = boundingBox3;
                arrayList3 = arrayList3;
            }
            setUpGeofenceslambda0 setupgeofenceslambda3 = setupgeofenceslambda0;
            ArrayList arrayList7 = arrayList3;
            BoundingBox boundingBox4 = boundingBox;
            Iterator it3 = it;
            try {
                semaphore.acquire(i2);
            } catch (InterruptedException unused) {
            }
            arrayList2.add(arrayList7);
            it = it3;
            setupgeofenceslambda0 = setupgeofenceslambda3;
            boundingBox = boundingBox4;
            i = 10;
        }
        return accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList2);
    }

    public void setHarshDrivingEventListener(HarshDrivingEventListener harshDrivingEventListener) {
        DrivingInsightsApi.getInstance(this.mContext).setHarshDrivingEventListener(harshDrivingEventListener);
    }

    public void setPhoneUsageEventListener(PhoneUsageEventListener phoneUsageEventListener) {
        DrivingInsightsApi.getInstance(this.mContext).setPhoneUsageEventListener(phoneUsageEventListener);
    }

    private DrivingInsightsDebug(Context context) {
        this.mContext = context;
    }
}
