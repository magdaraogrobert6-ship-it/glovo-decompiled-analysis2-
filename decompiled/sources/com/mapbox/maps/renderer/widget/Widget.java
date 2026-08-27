package com.mapbox.maps.renderer.widget;

import com.mapbox.maps.MapboxExperimental;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
@MapboxExperimental
public abstract class Widget {
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 triggerRepaintAction;

    public abstract WidgetPosition getPosition();

    public abstract WidgetRenderer getRenderer$maps_sdk_release();

    public abstract float getRotation();

    public abstract void setPosition(WidgetPosition widgetPosition);

    public abstract void setRotation(float f);

    public final /* synthetic */ void setTriggerRepaintAction$maps_sdk_release(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.triggerRepaintAction = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final /* synthetic */ void triggerRepaint$maps_sdk_release() {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.triggerRepaintAction;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
    }
}
