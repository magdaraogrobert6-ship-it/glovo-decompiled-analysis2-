package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.ByteString;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM implements Iterator {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final int serializer;
    public final /* synthetic */ int read = 0;
    public int IconCompatParcelizer = 0;

    public r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(onPreviewKeyEvent onpreviewkeyevent) {
        this.RemoteActionCompatParcelizer = onpreviewkeyevent;
        this.serializer = onpreviewkeyevent.RemoteActionCompatParcelizer();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        if (i == 0) {
            int i3 = this.IconCompatParcelizer;
            if (i3 < i2) {
                this.IconCompatParcelizer = i3 + 1;
                return Byte.valueOf(((ByteString) obj).IconCompatParcelizer(i3));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (i == 1) {
            return Byte.valueOf(RemoteActionCompatParcelizer());
        }
        if (i != 2) {
            return Byte.valueOf(RemoteActionCompatParcelizer());
        }
        int i4 = this.IconCompatParcelizer;
        if (i4 < i2) {
            this.IconCompatParcelizer = i4 + 1;
            return Byte.valueOf(((onPreviewKeyEvent) obj).write(i4));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    public byte RemoteActionCompatParcelizer() {
        if (this.read != 1) {
            int i = this.IconCompatParcelizer;
            if (i < this.serializer) {
                this.IconCompatParcelizer = i + 1;
                return ((setOnAttachui) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return (byte) 0;
        }
        int i2 = this.IconCompatParcelizer;
        if (i2 < this.serializer) {
            this.IconCompatParcelizer = i2 + 1;
            return ((moveFocusInChildren3ESFkO8) this.RemoteActionCompatParcelizer).serializer[i2];
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.read;
        if (i == 0) {
            return this.IconCompatParcelizer < this.serializer;
        }
        if (i == 1) {
            return this.IconCompatParcelizer < this.serializer;
        }
        if (i != 2) {
            return this.IconCompatParcelizer < this.serializer;
        }
        return this.IconCompatParcelizer < this.serializer;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        if (i == 2) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(ByteString byteString) {
        this.RemoteActionCompatParcelizer = byteString;
        this.serializer = byteString.serializer();
    }

    public r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(moveFocusInChildren3ESFkO8 movefocusinchildren3esfko8) {
        this.RemoteActionCompatParcelizer = movefocusinchildren3esfko8;
        this.serializer = movefocusinchildren3esfko8.write();
    }

    public r8lambdaIZz_yhFbmsc9dFp_Le0QsEa0ZM(setOnAttachui setonattachui) {
        this.RemoteActionCompatParcelizer = setonattachui;
        this.serializer = setonattachui.IconCompatParcelizer();
    }
}
