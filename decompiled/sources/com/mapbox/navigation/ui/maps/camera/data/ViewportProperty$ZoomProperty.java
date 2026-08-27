package com.mapbox.navigation.ui.maps.camera.data;

import org.bouncycastle.asn1.ASN1UniversalType;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewportProperty$ZoomProperty extends ASN1UniversalType {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewportProperty$ZoomProperty(double d, int i) {
        super(4, Double.valueOf(d));
        if (i != 4) {
        } else {
            super(4, Double.valueOf(d));
        }
    }

    public ViewportProperty$ZoomProperty() {
        super(4, Double.valueOf(0.0d));
    }

    public ViewportProperty$ZoomProperty(int i, Object obj) {
        super(i, obj);
    }
}
