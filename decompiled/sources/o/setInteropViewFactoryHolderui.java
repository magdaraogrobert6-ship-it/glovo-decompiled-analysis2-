package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setInteropViewFactoryHolderui implements accessnextDrawNode {
    public int serializer;

    public final byte[] ParcelableVolumeInfo() {
        try {
            int iWrite = ((GeneratedMessageLite) this).write(null);
            byte[] bArr = new byte[iWrite];
            setSemanticsInvalidatedui setsemanticsinvalidatedui = new setSemanticsInvalidatedui(bArr, iWrite);
            serializer(setsemanticsinvalidatedui);
            if (iWrite - setsemanticsinvalidatedui.RemoteActionCompatParcelizer == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(RemoteActionCompatParcelizer("byte array"), e);
            return null;
        }
    }

    public abstract getDummyViewConfigurationui PlaybackStateCompat();

    public abstract void serializer(setSemanticsInvalidatedui setsemanticsinvalidatedui);

    public abstract int write(getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement);

    public final String RemoteActionCompatParcelizer(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }
}
