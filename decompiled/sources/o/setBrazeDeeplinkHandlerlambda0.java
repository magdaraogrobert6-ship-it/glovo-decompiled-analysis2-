package o;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class setBrazeDeeplinkHandlerlambda0 extends OutputStream {
    public final /* synthetic */ BrazeDeeplinkHandlerWhenMappings IconCompatParcelizer;
    public r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs RemoteActionCompatParcelizer;
    public final ArrayList serializer = new ArrayList();

    public setBrazeDeeplinkHandlerlambda0(BrazeDeeplinkHandlerWhenMappings brazeDeeplinkHandlerWhenMappings) {
        this.IconCompatParcelizer = brazeDeeplinkHandlerWhenMappings;
    }

    public static int IconCompatParcelizer(setBrazeDeeplinkHandlerlambda0 setbrazedeeplinkhandlerlambda0) {
        Iterator it = setbrazedeeplinkhandlerlambda0.serializer.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs) it.next()).write;
        }
        return i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        AndroidUiFrameClock androidUiFrameClock = this.IconCompatParcelizer.IconCompatParcelizer;
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = this.serializer;
        if (r8lambdaoaqvy__5d9hmn5g6gasyvakdzs == null) {
            androidUiFrameClock.getClass();
            r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer = AndroidUiFrameClock.RemoteActionCompatParcelizer(i2);
            this.RemoteActionCompatParcelizer = r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer;
            arrayList.add(r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.RemoteActionCompatParcelizer.read);
            r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs2 = this.RemoteActionCompatParcelizer;
            if (iMin == 0) {
                int iMax = Math.max(i2, r8lambdaoaqvy__5d9hmn5g6gasyvakdzs2.write * 2);
                androidUiFrameClock.getClass();
                r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer2 = AndroidUiFrameClock.RemoteActionCompatParcelizer(iMax);
                this.RemoteActionCompatParcelizer = r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer2;
                arrayList.add(r8lambdaoaqvy__5d9hmn5g6gasyvakdzsRemoteActionCompatParcelizer2);
            } else {
                r8lambdaoaqvy__5d9hmn5g6gasyvakdzs2.write(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs = this.RemoteActionCompatParcelizer;
        if (r8lambdaoaqvy__5d9hmn5g6gasyvakdzs != null && r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.read > 0) {
            r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.RemoteActionCompatParcelizer.read((int) ((byte) i));
            r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.read--;
            r8lambdaoaqvy__5d9hmn5g6gasyvakdzs.write++;
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }
}
