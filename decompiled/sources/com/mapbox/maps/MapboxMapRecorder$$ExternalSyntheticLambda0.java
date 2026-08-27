package com.mapbox.maps;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.sdk.DetectionStatus;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.SdkStatusUpdateListener;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxMapRecorder$$ExternalSyntheticLambda0 implements PlaybackFinished, SdkStatusUpdateListener {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 f$0;

    public /* synthetic */ MapboxMapRecorder$$ExternalSyntheticLambda0(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.f$0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // com.mapbox.maps.PlaybackFinished
    public void run() {
        int i = 2 % 2;
        int i2 = read + 5;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MapboxMapRecorder.replay$lambda$4(this.f$0);
        int i4 = write + 51;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    @Override // com.sentiance.sdk.SdkStatusUpdateListener
    public void onSdkStatusUpdate(SdkStatus sdkStatus) {
        int i = 2 % 2;
        int i2 = write + 75;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            sdkStatus.getClass();
            DetectionStatus detectionStatus = sdkStatus.detectionStatus;
            DetectionStatus detectionStatus2 = DetectionStatus.EXPIRED;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        sdkStatus.getClass();
        if (sdkStatus.detectionStatus == DetectionStatus.EXPIRED) {
            this.f$0.invoke();
        }
        int i3 = read + 75;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
