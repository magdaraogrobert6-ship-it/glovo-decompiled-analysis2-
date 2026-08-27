package androidx.work;

import android.content.Context;
import androidx.lifecycle.BlockRunner$cancel$1;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessgetColorFilterjd;
import o.accesssetSpotShadowColor8_81llAjd;
import o.getCieXyz;
import o.onDrawBehind;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends accesssetSpotShadowColor8_81llAjd {
    public final accessgetColorFilterjd serializer;
    public final WorkerParameters write;

    public abstract Object doWork(ShortNewsContentCardView shortNewsContentCardView);

    @Override // o.accesssetSpotShadowColor8_81llAjd
    public final onDrawBehind IconCompatParcelizer() {
        accessgetColorFilterjd accessgetcolorfilterjd = accessgetColorFilterjd.IconCompatParcelizer;
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.serializer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{textAnnouncementContentCardView, accessgetcolorfilterjd}, iWrite3)).booleanValue()) {
            textAnnouncementContentCardView = this.write.MediaDescriptionCompat;
        }
        textAnnouncementContentCardView.getClass();
        Object[] objArr = {textAnnouncementContentCardView.plus(JobKt.RemoteActionCompatParcelizer()), new CoroutineWorker$startWork$1(this, null, 0)};
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (onDrawBehind) BuildersKt.IconCompatParcelizer(775282581, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -775282577, objArr, iRemoteActionCompatParcelizer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.write = workerParameters;
        this.serializer = accessgetColorFilterjd.IconCompatParcelizer;
    }

    @Override // o.accesssetSpotShadowColor8_81llAjd
    public final onDrawBehind write() {
        Object[] objArr = {this.serializer.plus(JobKt.RemoteActionCompatParcelizer()), new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 16)};
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (onDrawBehind) BuildersKt.IconCompatParcelizer(775282581, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -775282577, objArr, iRemoteActionCompatParcelizer);
    }
}
