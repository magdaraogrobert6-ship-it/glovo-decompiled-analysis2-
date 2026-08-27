package com.roadrunner.web.presentation;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import o.BrazeExternalSyntheticLambda36;
import o.createFromParcel;
import o.r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890;
import o.r8lambdaPcDeAPpEIcsTrfyD7jxcoufDzA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class WebViewFragment$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ WebViewFragment read;

    public /* synthetic */ WebViewFragment$$ExternalSyntheticLambda1(WebViewFragment webViewFragment, int i) {
        this.IconCompatParcelizer = i;
        this.read = webViewFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebViewFragment webViewFragment = this.read;
        Object obj = null;
        if (i2 == 0) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = webViewFragment.removeOnContextAvailableListener;
            if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                removeNodeAtDepth.serializer("viewModelProviderFactory");
                throw null;
            }
            int i3 = RemoteActionCompatParcelizer + 65;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return r8lambdaudhhxliolpu0hpccqh6voskpny;
        }
        if (i2 == 1) {
            Bundle arguments = webViewFragment.getArguments();
            if (arguments == null) {
                return null;
            }
            int i5 = write + 27;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                arguments.getString("analytics_name");
                throw null;
            }
            String string = arguments.getString("analytics_name");
            if (string == null) {
                return null;
            }
            r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890.Companion.getClass();
            return r8lambdaPcDeAPpEIcsTrfyD7jxcoufDzA.read(string);
        }
        if (i2 != 2) {
            if (i2 != 3) {
                webViewFragment.onCreatePanelMenu = false;
                webViewFragment.getSavedStateRegistry.handleOnBackPressed();
                return createfromparcel;
            }
            webViewFragment.onCreatePanelMenu = true;
            webViewFragment.getSavedStateRegistry.handleOnBackPressed();
            return createfromparcel;
        }
        r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890 r8lambdafzt8gcpxuxf8hqeg_gdezcl890 = (r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890) webViewFragment.onRetainNonConfigurationInstance.MediaSessionCompatResultReceiverWrapper();
        if (r8lambdafzt8gcpxuxf8hqeg_gdezcl890 == null) {
            return null;
        }
        BrazeExternalSyntheticLambda36 brazeExternalSyntheticLambda36 = webViewFragment.removeOnTrimMemoryListener;
        if (brazeExternalSyntheticLambda36 == null) {
            removeNodeAtDepth.serializer("webviewLoadingTimeTrackerFactory");
            throw null;
        }
        int i6 = RemoteActionCompatParcelizer + 3;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return brazeExternalSyntheticLambda36.RemoteActionCompatParcelizer(r8lambdafzt8gcpxuxf8hqeg_gdezcl890.getKey());
        }
        brazeExternalSyntheticLambda36.RemoteActionCompatParcelizer(r8lambdafzt8gcpxuxf8hqeg_gdezcl890.getKey());
        obj.hashCode();
        throw null;
    }
}
