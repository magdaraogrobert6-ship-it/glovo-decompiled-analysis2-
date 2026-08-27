package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.sentiance.sdk.crashdetection.api.CrashDetectionApi;
import com.sentiance.sdk.crashdetection.api.VehicleCrashEvent;
import com.sentiance.sdk.crashdetection.api.VehicleCrashListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class toGeofence extends getLatitudeannotations<r8lambdaE7oIx09KQauliA8paOfGanE2_e8> {
    final /* synthetic */ CrashDetectionApi write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toGeofence(CrashDetectionApi crashDetectionApi) {
        super(crashDetectionApi.getParallelExecutor(), "CrashDetectionApi");
        this.write = crashDetectionApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.sentiance.sdk.crashdetection.api.VehicleCrashEvent$write] */
    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaE7oIx09KQauliA8paOfGanE2_e8> getlongitudeannotations) {
        ?? arrayList;
        r8lambdaE7oIx09KQauliA8paOfGanE2_e8 r8lambdae7oix09kqaulia8paofgane2_e8 = getlongitudeannotations.read();
        long jWrite = getlongitudeannotations.write();
        CrashDetectionApi crashDetectionApi = this.write;
        VehicleCrashListener vehicleCrashListener = crashDetectionApi.mCrashListener;
        crashDetectionApi.log("Sending crash event to the enclosing app", new Object[0]);
        if (vehicleCrashListener != null) {
            ?? writeVar = new VehicleCrashEvent.write(jWrite);
            getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdae7oix09kqaulia8paofgane2_e8.read;
            if (brazeCompanionExternalSyntheticLambda4 != null) {
                getverticalaccuracy.getClass();
                writeVar.read(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4));
            }
            Short sh = r8lambdae7oix09kqaulia8paofgane2_e8.MediaSessionCompatResultReceiverWrapper;
            if (sh != null) {
                writeVar.IconCompatParcelizer((float) (((double) (sh.shortValue() / 100.0f)) * 9.800000190734863d));
            } else {
                Short sh2 = r8lambdae7oix09kqaulia8paofgane2_e8.serializer;
                if (sh2 != null) {
                    writeVar.IconCompatParcelizer(sh2.shortValue() / 100.0f);
                }
            }
            Short sh3 = r8lambdae7oix09kqaulia8paofgane2_e8.MediaBrowserCompatMediaItem;
            if (sh3 != null) {
                writeVar.serializer(sh3.shortValue() / 100.0f);
            }
            Short sh4 = r8lambdae7oix09kqaulia8paofgane2_e8.RatingCompat;
            if (sh4 != null) {
                writeVar.write(sh4.shortValue() / 100.0f);
            }
            Short sh5 = r8lambdae7oix09kqaulia8paofgane2_e8.RemoteActionCompatParcelizer;
            if (sh5 != null) {
                writeVar.write(sh5.shortValue());
            }
            writeVar.write(crashDetectionApi.getCrashSeverity(r8lambdae7oix09kqaulia8paofgane2_e8));
            List list = r8lambdae7oix09kqaulia8paofgane2_e8.MediaSessionCompatQueueItem;
            getverticalaccuracy.getClass();
            if (list == null) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(getVerticalAccuracy.write((BrazeCompanionExternalSyntheticLambda4) it.next()));
                }
            }
            writeVar.serializer(arrayList);
            Byte b = r8lambdae7oix09kqaulia8paofgane2_e8.MediaMetadataCompat;
            if (b != null) {
                writeVar.IconCompatParcelizer(crashDetectionApi.convertToPublicType(b));
            }
            readBoolean.serializer(new ZM$$ExternalSyntheticLambda0(vehicleCrashListener, 26, new VehicleCrashEvent(writeVar)));
        }
    }
}
