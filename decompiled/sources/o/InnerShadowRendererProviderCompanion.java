package o;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerShadowRendererProviderCompanion implements copyWithoutOffsetui_graphics {
    public final CoroutineDispatcher read;
    public final Context write;

    public InnerShadowRendererProviderCompanion(Application application) {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
        application.getClass();
        defaultIoScheduler.getClass();
        this.write = application;
        this.read = defaultIoScheduler;
    }

    public final String IconCompatParcelizer() {
        if (Build.VERSION.SDK_INT < 31) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        String str = Build.SOC_MODEL;
        str.getClass();
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        if (Build.VERSION.SDK_INT < 31) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        String str = Build.SOC_MANUFACTURER;
        str.getClass();
        return str;
    }
}
