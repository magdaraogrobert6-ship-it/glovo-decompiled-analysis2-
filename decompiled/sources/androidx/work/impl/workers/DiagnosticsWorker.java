package androidx.work.impl.workers;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import bo.app.k7$$ExternalSyntheticLambda2;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.util.List;
import kotlin.TuplesKt;
import o.OutlineGeneric;
import o.accessgetFillcp;
import o.accessgetIntersectcp;
import o.invertimpl;
import o.mapimpl;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.scaleimpl;
import o.setClip;
import o.setRotationX;
import o.translateimpldefault;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticsWorker extends Worker {
    @Override // androidx.work.Worker
    public final setClip RemoteActionCompatParcelizer() {
        WorkManagerImpl workManagerImplRemoteActionCompatParcelizer = WorkManagerImpl.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        WorkDatabase workDatabase = workManagerImplRemoteActionCompatParcelizer.PlaybackStateCompat;
        workDatabase.getClass();
        scaleimpl scaleimplVarMediaMetadataCompat = workDatabase.MediaMetadataCompat();
        mapimpl mapimplVar = workDatabase.read();
        OutlineGeneric outlineGenericRatingCompat = workDatabase.RatingCompat();
        invertimpl invertimplVarWrite = workDatabase.write();
        workManagerImplRemoteActionCompatParcelizer.write.IconCompatParcelizer.getClass();
        translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVarMediaMetadataCompat;
        List list = (List) TuplesKt.write(translateimpldefaultVar.IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new k7$$ExternalSyntheticLambda2(System.currentTimeMillis() - CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL, 3));
        RoomDatabase roomDatabase = translateimpldefaultVar.IconCompatParcelizer;
        List list2 = (List) TuplesKt.write(roomDatabase, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(13));
        List list3 = (List) TuplesKt.write(roomDatabase, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetIntersectcp(12));
        if (!list.isEmpty()) {
            setRotationX setrotationx = setRotationX.read();
            int i = accessgetFillcp.RemoteActionCompatParcelizer;
            setrotationx.getClass();
            setRotationX setrotationx2 = setRotationX.read();
            accessgetFillcp.write(mapimplVar, outlineGenericRatingCompat, invertimplVarWrite, list);
            setrotationx2.getClass();
        }
        if (!list2.isEmpty()) {
            setRotationX setrotationx3 = setRotationX.read();
            int i2 = accessgetFillcp.RemoteActionCompatParcelizer;
            setrotationx3.getClass();
            setRotationX setrotationx4 = setRotationX.read();
            accessgetFillcp.write(mapimplVar, outlineGenericRatingCompat, invertimplVarWrite, list2);
            setrotationx4.getClass();
        }
        if (!list3.isEmpty()) {
            setRotationX setrotationx5 = setRotationX.read();
            int i3 = accessgetFillcp.RemoteActionCompatParcelizer;
            setrotationx5.getClass();
            setRotationX setrotationx6 = setRotationX.read();
            accessgetFillcp.write(mapimplVar, outlineGenericRatingCompat, invertimplVarWrite, list3);
            setrotationx6.getClass();
        }
        return new setClip();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }
}
