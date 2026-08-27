package o;

import com.sentiance.protobuf.ByteString;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class accessisOfflinep {
    public static final getNotificationPayload write = new getNotificationPayload(1);
    public final Object RemoteActionCompatParcelizer;

    public void RemoteActionCompatParcelizer(int i, int i2) {
        ((setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i, i2);
    }

    public void RemoteActionCompatParcelizer(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer;
        if (z) {
            setruntimeappconfigurationprovider.write(i, (ByteString) obj);
        } else {
            setruntimeappconfigurationprovider.IconCompatParcelizer(i, (accessgetDiskCacheLockp) obj);
        }
    }

    public void read(int i, Object obj, fromStringlambda1 fromstringlambda1) {
        setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider = (setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer;
        setruntimeappconfigurationprovider.write(i, 3);
        fromstringlambda1.read((accessgetDiskCacheLockp) obj, setruntimeappconfigurationprovider.IconCompatParcelizer);
        setruntimeappconfigurationprovider.write(i, 4);
    }

    public void write(int i, int i2) {
        ((setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer).read(i, i2);
    }

    public accessisOfflinep() {
        r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE r8lambdahi3gyneb8jrz6jncrc55arfuqke;
        try {
            r8lambdahi3gyneb8jrz6jncrc55arfuqke = (r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE) Class.forName("com.sentiance.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r8lambdahi3gyneb8jrz6jncrc55arfuqke = write;
        }
        r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE[] r8lambdahi3gyneb8jrz6jncrc55arfuqkeArr = {getNotificationPayload.write, r8lambdahi3gyneb8jrz6jncrc55arfuqke};
        r8lambdaIcNz1bHvg4Utyu5TBPbPtI15cq4 r8lambdaicnz1bhvg4utyu5tbpbpti15cq4 = new r8lambdaIcNz1bHvg4Utyu5TBPbPtI15cq4();
        r8lambdaicnz1bhvg4utyu5tbpbpti15cq4.write = r8lambdahi3gyneb8jrz6jncrc55arfuqkeArr;
        Charset charset = isFromOfflineStorage.read;
        this.RemoteActionCompatParcelizer = r8lambdaicnz1bhvg4utyu5tbpbpti15cq4;
    }

    public void RemoteActionCompatParcelizer(int i, ByteString byteString) {
        ((setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer).serializer(i, byteString);
    }

    public void serializer(int i, Object obj, fromStringlambda1 fromstringlambda1) {
        ((setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i, (accessgetDiskCacheLockp) obj, fromstringlambda1);
    }

    public void RemoteActionCompatParcelizer(int i, long j) {
        ((setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(i, j);
    }

    public void serializer(int i, long j) {
        ((setRuntimeAppConfigurationProvider) this.RemoteActionCompatParcelizer).write(i, j);
    }

    public accessisOfflinep(setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider) {
        isFromOfflineStorage.read(setruntimeappconfigurationprovider, "output");
        this.RemoteActionCompatParcelizer = setruntimeappconfigurationprovider;
        setruntimeappconfigurationprovider.IconCompatParcelizer = this;
    }
}
