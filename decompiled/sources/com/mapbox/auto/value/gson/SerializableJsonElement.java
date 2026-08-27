package com.mapbox.auto.value.gson;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializableJsonElement implements Serializable {
    public JsonElement element;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.element.toString());
    }

    public final int hashCode() {
        return Objects.hash(this.element);
    }

    public SerializableJsonElement(JsonElement jsonElement) {
        this.element = jsonElement;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.element = (JsonElement) new GsonBuilder().create().fromJson(objectInputStream.readUTF(), JsonElement.class);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SerializableJsonElement.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.element, ((SerializableJsonElement) obj).element);
    }
}
