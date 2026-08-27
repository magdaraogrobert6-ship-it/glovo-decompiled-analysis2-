package com.mapbox.common.module.provider;

import com.mapbox.annotation.module.MapboxModuleType;
import java.util.Arrays;
import java.util.Locale;
import o.isCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxInvalidModuleException extends RuntimeException {
    private final MapboxModuleType type;

    private final MapboxModuleType component1() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public static /* synthetic */ MapboxInvalidModuleException copy$default(MapboxInvalidModuleException mapboxInvalidModuleException, MapboxModuleType mapboxModuleType, int i, Object obj) {
        if ((i & 1) != 0) {
            mapboxModuleType = mapboxInvalidModuleException.type;
        }
        return mapboxInvalidModuleException.copy(mapboxModuleType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MapboxInvalidModuleException) && this.type == ((MapboxInvalidModuleException) obj).type;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MapboxInvalidModuleException(type=" + this.type + ')';
    }

    public final MapboxInvalidModuleException copy(MapboxModuleType mapboxModuleType) {
        mapboxModuleType.getClass();
        return new MapboxInvalidModuleException(mapboxModuleType);
    }

    public MapboxInvalidModuleException(MapboxModuleType mapboxModuleType) {
        mapboxModuleType.getClass();
        StringBuilder sb = new StringBuilder("\n    ");
        sb.append(mapboxModuleType.name());
        sb.append(" has been excluded from build but a correct alternative was not provided.\n    Make sure that:\n    - Your custom module implements ");
        sb.append(mapboxModuleType.getInterfacePackage());
        sb.append('.');
        sb.append(mapboxModuleType.getInterfaceClassName());
        sb.append(".\n    - Your custom module class is annotated with @MapboxModule(MapboxModuleType.");
        sb.append(mapboxModuleType.name());
        sb.append(").\n    - You've provided a `ModuleProvider` instance to ");
        sb.append(String.format("Mapbox_%sModuleConfiguration", Arrays.copyOf(new Object[]{mapboxModuleType.getSimplifiedName()}, 1)));
        sb.append("#set");
        Locale locale = Locale.getDefault();
        locale.getClass();
        String string = "moduleProvider";
        char cCharAt = "moduleProvider".charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            StringBuilder sb2 = new StringBuilder();
            char titleCase = Character.toTitleCase(cCharAt);
            if (titleCase != Character.toUpperCase(cCharAt)) {
                sb2.append(titleCase);
            } else {
                String upperCase = "m".toUpperCase(locale);
                upperCase.getClass();
                sb2.append(upperCase);
            }
            sb2.append("oduleProvider");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(" before initializing the library,\n      unless `enableConfiguration` flag is set to false and your implementation has a public, non-arg constructor or is a Kotlin object.\n  ");
        super(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sb.toString()));
        this.type = mapboxModuleType;
    }
}
