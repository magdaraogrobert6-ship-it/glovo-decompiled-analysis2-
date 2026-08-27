package o;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKtLocalView1 implements Externalizable {
    public boolean IconCompatParcelizer;
    public boolean write;
    public String serializer = "";
    public final ArrayList MediaSessionCompatQueueItem = new ArrayList();
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public String read = "";

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.write);
        if (this.write) {
            objectOutput.writeUTF(this.serializer);
        }
        ArrayList arrayList = this.MediaSessionCompatQueueItem;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) arrayList.get(i)).intValue());
        }
        ArrayList arrayList2 = this.RemoteActionCompatParcelizer;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.IconCompatParcelizer);
        if (this.IconCompatParcelizer) {
            objectOutput.writeUTF(this.read);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.write = true;
            this.serializer = utf;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.MediaSessionCompatQueueItem.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.RemoteActionCompatParcelizer.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.IconCompatParcelizer = true;
            this.read = utf2;
        }
    }
}
