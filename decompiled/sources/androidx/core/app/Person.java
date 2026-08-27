package androidx.core.app;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Person {
    public boolean IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public boolean RemoteActionCompatParcelizer;
    public IconCompat read;
    public String serializer;
    public CharSequence write;

    public static Person IconCompatParcelizer(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatIconCompatParcelizer = bundle2 != null ? IconCompat.IconCompatParcelizer(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        Person person = new Person();
        person.write = charSequence;
        person.read = iconCompatIconCompatParcelizer;
        person.MediaDescriptionCompat = string;
        person.serializer = string2;
        person.RemoteActionCompatParcelizer = z;
        person.IconCompatParcelizer = z2;
        return person;
    }

    public final android.app.Person read() {
        android.app.Person.Builder name = new android.app.Person.Builder().setName(this.write);
        IconCompat iconCompat = this.read;
        return name.setIcon(iconCompat != null ? iconCompat.read(null) : null).setUri(this.MediaDescriptionCompat).setKey(this.serializer).setBot(this.RemoteActionCompatParcelizer).setImportant(this.IconCompatParcelizer).build();
    }

    public static Person write(android.app.Person person) {
        CharSequence name = person.getName();
        IconCompat iconCompatRemoteActionCompatParcelizer = person.getIcon() != null ? IconCompat.RemoteActionCompatParcelizer(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        Person person2 = new Person();
        person2.write = name;
        person2.read = iconCompatRemoteActionCompatParcelizer;
        person2.MediaDescriptionCompat = uri;
        person2.serializer = key;
        person2.RemoteActionCompatParcelizer = zIsBot;
        person2.IconCompatParcelizer = zIsImportant;
        return person2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.serializer;
        String str2 = person.serializer;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(this.write), Objects.toString(person.write)) && Objects.equals(this.MediaDescriptionCompat, person.MediaDescriptionCompat)) {
                if (Boolean.valueOf(this.RemoteActionCompatParcelizer).equals(Boolean.valueOf(person.RemoteActionCompatParcelizer))) {
                    if (Boolean.valueOf(this.IconCompatParcelizer).equals(Boolean.valueOf(person.IconCompatParcelizer))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.serializer;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.write, this.MediaDescriptionCompat, Boolean.valueOf(this.RemoteActionCompatParcelizer), Boolean.valueOf(this.IconCompatParcelizer));
    }
}
