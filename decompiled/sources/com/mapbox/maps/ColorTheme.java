package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public class ColorTheme {
    private Type type;
    private Object value;

    /* JADX INFO: loaded from: classes5.dex */
    public enum Type {
        IMAGE,
        STYLE_PROPERTY_VALUE
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static ColorTheme valueOf(Image image) {
        return new ColorTheme(image);
    }

    public boolean isImage() {
        return this.type == Type.IMAGE;
    }

    public boolean isStylePropertyValue() {
        return this.type == Type.STYLE_PROPERTY_VALUE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public ColorTheme(Image image) {
        this.type = Type.IMAGE;
        this.value = image;
    }

    public static ColorTheme valueOf(StylePropertyValue stylePropertyValue) {
        return new ColorTheme(stylePropertyValue);
    }

    public Image getImage() {
        if (isImage()) {
            return (Image) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (Image)");
        return null;
    }

    public StylePropertyValue getStylePropertyValue() {
        if (isStylePropertyValue()) {
            return (StylePropertyValue) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (StylePropertyValue)");
        return null;
    }

    public ColorTheme(StylePropertyValue stylePropertyValue) {
        this.type = Type.STYLE_PROPERTY_VALUE;
        this.value = stylePropertyValue;
    }
}
