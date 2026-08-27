package com.foodora.courier.freshchat;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.fromColorLong;
import o.getGestureEnd5zf0vsI;
import o.getNeedsDensityui_text;
import o.inCompatibilityMode;
import o.prepareForActivityTransitionCarryover;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes2.dex */
public final class DispatcherChatOrderLogger implements DefaultLifecycleObserver {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final CompositeDisposable read;
    public final getGestureEnd5zf0vsI serializer;
    public final getNeedsDensityui_text write;

    public DispatcherChatOrderLogger(getGestureEnd5zf0vsI getgestureend5zf0vsi, PlaybackStateCompatCustomAction playbackStateCompatCustomAction, getNeedsDensityui_text getneedsdensityui_text, inCompatibilityMode incompatibilitymode) {
        getneedsdensityui_text.getClass();
        this.serializer = getgestureend5zf0vsi;
        this.write = getneedsdensityui_text;
        this.read = new CompositeDisposable();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            accessisrendernodecompatiblecp.getClass();
            this.read.read();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        accessisrendernodecompatiblecp.getClass();
        this.read.read();
        int i3 = RemoteActionCompatParcelizer + 111;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        fromColorLong fromcolorlong = toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle());
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(fromcolorlong, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new SimpleActor$offer$2(accessisrendernodecompatiblecp, this, (ShortNewsContentCardView) null, 16), 2);
        int i2 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
    }
}
