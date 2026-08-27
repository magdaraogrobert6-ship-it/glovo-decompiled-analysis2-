package com.mapbox.maps;

import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda22 implements Style.OnStyleLoaded {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda22(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            MapboxMap._init_$lambda$3((MapboxMap) obj, style);
        } else if (i == 1) {
            MapController._init_$lambda$2$lambda$1((MapController) obj, style);
        } else {
            style.getClass();
            ((GesturesPluginImpl.AnonymousClass1) obj).invoke(style);
        }
    }
}
