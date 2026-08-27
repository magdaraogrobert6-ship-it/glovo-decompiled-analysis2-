package com.mapbox.navigation.ui.maps.route.line.api;

import com.google.android.gms.internal.mlkit_vision_face.zznh;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;

/* JADX INFO: loaded from: classes2.dex */
public final class LineGradientCommandApplier extends zznh {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LineGradientCommandApplier(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznh
    public final void applyCommand(Style style, String str, Object obj) {
        if (this.$r8$classId != 0) {
            style.getClass();
            str.getClass();
            ((StylePropertyValue) obj).getClass();
            return;
        }
        StylePropertyValue stylePropertyValue = (StylePropertyValue) obj;
        style.getClass();
        str.getClass();
        stylePropertyValue.getClass();
        Value value = stylePropertyValue.getValue();
        value.getClass();
        style.setStyleLayerProperty(str, "line-gradient", value);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznh
    public final String getProperty() {
        return this.$r8$classId != 0 ? "" : "line-gradient";
    }
}
