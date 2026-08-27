package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.content.Context;
import androidx.camera.video.Recorder$3;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall$Builder;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.internal.base.zas;
import com.google.android.gms.tasks.zzw;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Arrays;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetNumLockcp;
import o.accessgetNumPad2cp;
import o.accessgetNumPad7cp;
import o.accessgetNumPad8cp;
import o.accessgetNumPad9cp;
import o.accessgetNumPadPageUpcp;
import o.accessgetSystemNavigationDowncp;
import o.onSizeChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class zay extends accessgetNumPad7cp {
    public static final accessgetNumLockcp IconCompatParcelizer = new accessgetNumLockcp("ModuleInstall.API", new onSizeChanged(6), new PlaybackStateCompatCustomAction(8));

    public final zzw read(accessgetNumPad9cp... accessgetnumpad9cpArr) {
        boolean z = false;
        accessgetSystemNavigationDowncp.write("Please provide at least one OptionalModuleApi.", accessgetnumpad9cpArr.length > 0);
        for (accessgetNumPad9cp accessgetnumpad9cp : accessgetnumpad9cpArr) {
            accessgetSystemNavigationDowncp.serializer(accessgetnumpad9cp, "Requested API must not be null.");
        }
        ApiFeatureRequest apiFeatureRequestSerializer = ApiFeatureRequest.serializer(Arrays.asList(accessgetnumpad9cpArr), false);
        if (apiFeatureRequestSerializer.read.isEmpty()) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(new ModuleAvailabilityResponse(true, 0));
        }
        TaskApiCall$Builder taskApiCall$BuilderIconCompatParcelizer = accessgetNumPadPageUpcp.IconCompatParcelizer();
        taskApiCall$BuilderIconCompatParcelizer.read = new Feature[]{zas.write};
        taskApiCall$BuilderIconCompatParcelizer.write = 27301;
        taskApiCall$BuilderIconCompatParcelizer.IconCompatParcelizer = true;
        taskApiCall$BuilderIconCompatParcelizer.serializer = false;
        taskApiCall$BuilderIconCompatParcelizer.RemoteActionCompatParcelizer = new Recorder$3(this, apiFeatureRequestSerializer, z, 26);
        return read(0, taskApiCall$BuilderIconCompatParcelizer.read());
    }

    public zay(Context context, Activity activity, accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, accessgetNumPad8cp accessgetnumpad8cp) {
        super(context, activity, accessgetnumlockcp, accessgetnumpad2cp, accessgetnumpad8cp);
    }
}
