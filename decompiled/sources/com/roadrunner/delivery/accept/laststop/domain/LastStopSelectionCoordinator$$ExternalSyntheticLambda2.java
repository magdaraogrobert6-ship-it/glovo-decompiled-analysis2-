package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import kotlinx.coroutines.CompletableDeferredImpl;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LastStopSelectionCoordinator$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ CompletableDeferredImpl IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ LastStopSelectionCoordinator$$ExternalSyntheticLambda2(CompletableDeferredImpl completableDeferredImpl, int i) {
        this.read = i;
        this.IconCompatParcelizer = completableDeferredImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CompletableDeferredImpl completableDeferredImpl = this.IconCompatParcelizer;
        if (i2 != 0) {
            Throwable th = (Throwable) obj;
            th.getClass();
            completableDeferredImpl.IconCompatParcelizer((Throwable) new LastStopSelectionCoordinator.LastStopGeocodingErrorException("Error reverse geocoding because of failed request", th));
            int i3 = write + 71;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        }
        String str = (String) obj;
        if (str != null) {
            int i4 = RemoteActionCompatParcelizer + 3;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            completableDeferredImpl.MediaSessionCompatQueueItem(str);
        } else {
            completableDeferredImpl.IconCompatParcelizer((Throwable) new LastStopSelectionCoordinator.LastStopGeocodingErrorException("Error reverse geocoding because of missing address", null));
        }
        return createfromparcel;
    }
}
