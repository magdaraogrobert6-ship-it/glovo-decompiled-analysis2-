package com.roadrunner.web.bridge;

import android.webkit.JavascriptInterface;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.web.presentation.WebViewFragment;
import com.roadrunner.web.presentation.WebViewViewModel;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.asComposePaint;
import o.inCompatibilityMode;
import o.prepareForActivityTransitionCarryover;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class AqsWebInterface {
    private static int read = 1;
    private static int write;
    public final WebViewFragment serializer;

    public AqsWebInterface(WebViewFragment webViewFragment) {
        this.serializer = webViewFragment;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        int i = 2 % 2;
        str.getClass();
        WebViewViewModel webViewViewModelRatingCompat = this.serializer.RatingCompat();
        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webViewViewModelRatingCompat);
        ((inCompatibilityMode) webViewViewModelRatingCompat.write).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new PhotoIdUiModelImpl$1$1(webViewViewModelRatingCompat, str, null, 28), 2);
        int i2 = read + 67;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }
}
