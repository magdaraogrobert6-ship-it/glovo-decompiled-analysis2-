package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RenderedQueryGeometry {
    private Type type;
    private Object value;

    public enum Type {
        SCREEN_BOX,
        SCREEN_COORDINATE,
        LIST
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static RenderedQueryGeometry valueOf(ScreenBox screenBox) {
        return new RenderedQueryGeometry(screenBox);
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isScreenBox() {
        return this.type == Type.SCREEN_BOX;
    }

    public boolean isScreenCoordinate() {
        return this.type == Type.SCREEN_COORDINATE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public RenderedQueryGeometry(ScreenBox screenBox) {
        this.type = Type.SCREEN_BOX;
        this.value = screenBox;
    }

    public static RenderedQueryGeometry valueOf(ScreenCoordinate screenCoordinate) {
        return new RenderedQueryGeometry(screenCoordinate);
    }

    public List<ScreenCoordinate> getList() {
        if (isList()) {
            return (List) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (List<ScreenCoordinate>)");
        return null;
    }

    public ScreenBox getScreenBox() {
        if (isScreenBox()) {
            return (ScreenBox) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (ScreenBox)");
        return null;
    }

    public ScreenCoordinate getScreenCoordinate() {
        if (isScreenCoordinate()) {
            return (ScreenCoordinate) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (ScreenCoordinate)");
        return null;
    }

    public static RenderedQueryGeometry valueOf(List<ScreenCoordinate> list) {
        return new RenderedQueryGeometry(list);
    }

    public RenderedQueryGeometry(ScreenCoordinate screenCoordinate) {
        this.type = Type.SCREEN_COORDINATE;
        this.value = screenCoordinate;
    }

    public RenderedQueryGeometry(List<ScreenCoordinate> list) {
        this.type = Type.LIST;
        this.value = list;
    }
}
