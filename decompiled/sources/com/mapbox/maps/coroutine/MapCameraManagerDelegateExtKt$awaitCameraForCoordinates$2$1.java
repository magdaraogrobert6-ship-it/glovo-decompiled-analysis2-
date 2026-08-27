package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.ranges.RangesKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final void invoke(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        ((ShortNewsContentCardView) this.MediaMetadataCompat).resumeWith(cameraOptions);
    }

    public MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1(Object obj) {
        super(1, 1, RangesKt.class, obj, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CameraOptions) obj);
        return createFromParcel.INSTANCE;
    }
}
