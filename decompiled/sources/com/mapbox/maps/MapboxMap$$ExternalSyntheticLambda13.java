package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda13 implements Expected.Transformer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ CameraOptions f$1;
    public final /* synthetic */ EdgeInsets f$2;
    public final /* synthetic */ Double f$3;
    public final /* synthetic */ ScreenCoordinate f$4;
    public final /* synthetic */ MapboxMap f$5;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda13(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$1 = cameraOptions;
        this.f$2 = edgeInsets;
        this.f$3 = d;
        this.f$4 = screenCoordinate;
        this.f$5 = mapboxMap;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public final Object invoke(Object obj) {
        if (this.$r8$classId != 0) {
            return MapboxMap.AnonymousClass3.invoke$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (String) obj);
        }
        return MapboxMap.cameraForCoordinates$lambda$17(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (String) obj);
    }
}
