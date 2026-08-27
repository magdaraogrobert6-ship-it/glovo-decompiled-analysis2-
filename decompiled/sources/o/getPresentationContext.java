package o;

import android.app.Activity;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;

/* JADX INFO: loaded from: classes3.dex */
public interface getPresentationContext {
    Object RemoteActionCompatParcelizer(DividerUiModelImpl$1 dividerUiModelImpl$1);

    void RemoteActionCompatParcelizer(Activity activity, long j, endRearDisplaySession endreardisplaysession, FrameworkServiceWorkerClient frameworkServiceWorkerClient);

    void serializer(FrameworkServiceWorkerClient frameworkServiceWorkerClient);

    void write(RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1);
}
