package com.mapbox.maps.extension.style.layers.properties;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertyValue {
    public final String propertyName;
    public final Object propertyValue;
    public final Value value;

    public final String toString() {
        return String.format("%s: %s", Arrays.copyOf(new Object[]{this.propertyName, this.propertyValue}, 2));
    }

    public PropertyValue(String str, Object obj) {
        this.propertyName = str;
        this.propertyValue = obj;
        try {
            TypeUtils typeUtils = TypeUtils.INSTANCE;
            obj.getClass();
            this.value = typeUtils.wrapToValue(obj);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Incorrect property value for " + this.propertyName + ": " + e.getMessage(), e.getCause());
        }
    }
}
