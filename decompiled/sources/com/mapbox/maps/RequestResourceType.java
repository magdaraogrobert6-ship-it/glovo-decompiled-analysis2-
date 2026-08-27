package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
public enum RequestResourceType {
    UNKNOWN("Unknown"),
    STYLE("Style"),
    SOURCE("Source"),
    TILE("Tile"),
    GLYPHS("Glyphs"),
    SPRITE_IMAGE("SpriteImage"),
    SPRITE_JSON("SpriteJSON"),
    IMAGE("Image"),
    MODEL("Model");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RequestResourceType(String str) {
        this.str = str;
    }
}
