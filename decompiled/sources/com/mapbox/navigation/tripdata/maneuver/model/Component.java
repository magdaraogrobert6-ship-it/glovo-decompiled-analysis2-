package com.mapbox.navigation.tripdata.maneuver.model;

/* JADX INFO: loaded from: classes2.dex */
public final class Component {
    public final ComponentNode node;
    public final String type;

    public final int hashCode() {
        return this.node.hashCode() + (this.type.hashCode() * 31);
    }

    public Component(String str, ComponentNode componentNode) {
        this.type = str;
        this.node = componentNode;
    }

    public final String toString() {
        return "Component(type='" + this.type + "', node=" + this.node + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Component.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Component component = (Component) obj;
        if (this.type.equals(component.type)) {
            return this.node.equals(component.node);
        }
        return false;
    }
}
