package com.mapbox.maps.dsl;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraOptionsKtxKt {
    public static final CameraOptions cameraOptions(CameraState cameraState, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        cameraState.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        CameraOptions.Builder builderPitch = new CameraOptions.Builder().padding(cameraState.getPadding()).center(cameraState.getCenter()).bearing(Double.valueOf(cameraState.getBearing())).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch()));
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builderPitch);
        CameraOptions cameraOptionsBuild = builderPitch.build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    public static final CameraOptions cameraOptions(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }
}
