package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKtLocalConfiguration1 implements Externalizable {
    public boolean IconCompatParcelizer;
    public boolean serializer;
    public String MediaSessionCompatQueueItem = "";
    public String write = "";
    public final ArrayList read = new ArrayList();
    public String MediaDescriptionCompat = "";
    public boolean MediaMetadataCompat = false;
    public String RemoteActionCompatParcelizer = "";

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.MediaSessionCompatQueueItem);
        objectOutput.writeUTF(this.write);
        ArrayList arrayList = this.read;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) arrayList.get(i));
        }
        objectOutput.writeBoolean(this.serializer);
        if (this.serializer) {
            objectOutput.writeUTF(this.MediaDescriptionCompat);
        }
        objectOutput.writeBoolean(this.IconCompatParcelizer);
        if (this.IconCompatParcelizer) {
            objectOutput.writeUTF(this.RemoteActionCompatParcelizer);
        }
        objectOutput.writeBoolean(this.MediaMetadataCompat);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.MediaSessionCompatQueueItem = objectInput.readUTF();
        this.write = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.read.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.serializer = true;
            this.MediaDescriptionCompat = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.IconCompatParcelizer = true;
            this.RemoteActionCompatParcelizer = utf2;
        }
        this.MediaMetadataCompat = objectInput.readBoolean();
    }
}
