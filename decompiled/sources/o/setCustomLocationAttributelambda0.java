package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class setCustomLocationAttributelambda0 {
    public int IconCompatParcelizer;
    public int read;
    public final RegistryMissingComponentException serializer;
    public incrementCustomUserAttributelambda1[] write = new incrementCustomUserAttributelambda1[8];
    public int RemoteActionCompatParcelizer = 7;

    public setCustomLocationAttributelambda0(RegistryMissingComponentException registryMissingComponentException) {
        this.serializer = registryMissingComponentException;
    }

    public final void read(int i, int i2, int i3) {
        RegistryMissingComponentException registryMissingComponentException = this.serializer;
        if (i < i2) {
            registryMissingComponentException.read(i | i3);
            return;
        }
        registryMissingComponentException.read(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            registryMissingComponentException.read(128 | (i4 & 127));
            i4 >>>= 7;
        }
        registryMissingComponentException.read(i4);
    }

    public final void read(incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1) {
        int i;
        int i2 = incrementcustomuserattributelambda1.MediaDescriptionCompat;
        if (i2 > 4096) {
            Arrays.fill(this.write, (Object) null);
            this.RemoteActionCompatParcelizer = this.write.length - 1;
            this.IconCompatParcelizer = 0;
            this.read = 0;
            return;
        }
        int i3 = (this.read + i2) - androidx.compose.ui.graphics.Fields.TransformOrigin;
        if (i3 > 0) {
            int length = this.write.length - 1;
            int i4 = 0;
            while (true) {
                i = this.RemoteActionCompatParcelizer;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.write[length].MediaDescriptionCompat;
                i3 -= i5;
                this.read -= i5;
                this.IconCompatParcelizer--;
                i4++;
                length--;
            }
            incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = this.write;
            int i6 = i + 1;
            System.arraycopy(incrementcustomuserattributelambda1Arr, i6, incrementcustomuserattributelambda1Arr, i6 + i4, this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer += i4;
        }
        int i7 = this.IconCompatParcelizer;
        incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr2 = this.write;
        if (i7 + 1 > incrementcustomuserattributelambda1Arr2.length) {
            incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr3 = new incrementCustomUserAttributelambda1[incrementcustomuserattributelambda1Arr2.length * 2];
            System.arraycopy(incrementcustomuserattributelambda1Arr2, 0, incrementcustomuserattributelambda1Arr3, incrementcustomuserattributelambda1Arr2.length, incrementcustomuserattributelambda1Arr2.length);
            this.RemoteActionCompatParcelizer = this.write.length - 1;
            this.write = incrementcustomuserattributelambda1Arr3;
        }
        int i8 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i8 - 1;
        this.write[i8] = incrementcustomuserattributelambda1;
        this.IconCompatParcelizer++;
        this.read += i2;
    }

    public final void serializer(RequestBuilder requestBuilder) {
        read(requestBuilder.serializer(), 127, 0);
        this.serializer.serializer(requestBuilder);
    }
}
