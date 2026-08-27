package o;

import kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes.dex */
public final class setCacheParamsui extends ObservableProperty {
    public final String IconCompatParcelizer;
    public final /* synthetic */ setDrawResultui serializer;

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        float fFloatValue = ((Number) obj2).floatValue();
        if (Float.isNaN(fFloatValue)) {
            return;
        }
        accesstoPxR2X_6ojd accesstopxr2x_6ojd = this.serializer.read;
        String name = this.IconCompatParcelizer;
        if (name == null) {
            name = registerinappmessagemanagerlambda2.getName();
        }
        accesstopxr2x_6ojd.IconCompatParcelizer(fFloatValue, name);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCacheParamsui(setDrawResultui setdrawresultui, float f, String str) {
        super(Float.valueOf(f));
        this.serializer = setdrawresultui;
        this.IconCompatParcelizer = str;
    }
}
