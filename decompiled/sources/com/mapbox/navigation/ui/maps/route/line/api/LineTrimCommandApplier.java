package com.mapbox.navigation.ui.maps.route.line.api;

import com.google.android.gms.internal.mlkit_vision_face.zznh;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;

/* JADX INFO: loaded from: classes2.dex */
public final class LineTrimCommandApplier extends zznh {
    @Override // com.google.android.gms.internal.mlkit_vision_face.zznh
    public final void applyCommand(Style style, String str, Object obj) {
        StylePropertyValue stylePropertyValue = (StylePropertyValue) obj;
        style.getClass();
        str.getClass();
        stylePropertyValue.getClass();
        Value value = stylePropertyValue.getValue();
        value.getClass();
        style.setStyleLayerProperty(str, "line-trim-start", value);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznh
    public final String getProperty() {
        return "line-trim-start";
    }
}
