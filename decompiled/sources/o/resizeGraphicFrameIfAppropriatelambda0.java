package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.Vw$Vw;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class resizeGraphicFrameIfAppropriatelambda0 implements OnFailureListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public Object serializer;
    public long write;

    public accessgetFunctioncp RemoteActionCompatParcelizer() {
        return new accessgetFunctioncp(this.write, (accessgetHcp) this.serializer);
    }

    public int read(int i) {
        resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) this.serializer;
        if (resizegraphicframeifappropriatelambda0 == null) {
            long j = this.write;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(this.write & ((1 << i) - 1));
        }
        return Long.bitCount(this.write) + resizegraphicframeifappropriatelambda0.read(i - 64);
    }

    public void serializer() {
        this.write = 0L;
        resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) this.serializer;
        if (resizegraphicframeifappropriatelambda0 != null) {
            resizegraphicframeifappropriatelambda0.serializer();
        }
    }

    public void serializer(Runnable runnable) {
        reuseLayer reuselayer = (reuseLayer) this.serializer;
        reuselayer.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        if (reuselayer.IconCompatParcelizer == this.write) {
            runnable.run();
        } else {
            onEndApplyChanges.read(reuselayer.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
        }
    }

    public void write() {
        if (((resizeGraphicFrameIfAppropriatelambda0) this.serializer) == null) {
            this.serializer = new resizeGraphicFrameIfAppropriatelambda0(2);
        }
    }

    public boolean IconCompatParcelizer(int i) {
        if (i < 64) {
            return (this.write & (1 << i)) != 0;
        }
        write();
        return ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).IconCompatParcelizer(i - 64);
    }

    public void RemoteActionCompatParcelizer(int i) {
        if (i >= 64) {
            resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) this.serializer;
            if (resizegraphicframeifappropriatelambda0 != null) {
                resizegraphicframeifappropriatelambda0.RemoteActionCompatParcelizer(i - 64);
                return;
            }
            return;
        }
        this.write &= ~(1 << i);
    }

    public void RemoteActionCompatParcelizer(int i, boolean z) {
        if (i >= 64) {
            write();
            ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).RemoteActionCompatParcelizer(i - 64, z);
            return;
        }
        long j = this.write;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.write = (j & j2) | (((~j2) & j) << 1);
        if (z) {
            serializer(i);
        } else {
            RemoteActionCompatParcelizer(i);
        }
        if (z2 || ((resizeGraphicFrameIfAppropriatelambda0) this.serializer) != null) {
            write();
            ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).RemoteActionCompatParcelizer(0, z2);
        }
    }

    public void serializer(int i) {
        if (i >= 64) {
            write();
            ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).serializer(i - 64);
        } else {
            this.write |= 1 << i;
        }
    }

    public boolean write(int i) {
        if (i >= 64) {
            write();
            return ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).write(i - 64);
        }
        long j = 1 << i;
        long j2 = this.write;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.write = j3;
        long j4 = j - 1;
        this.write = Long.rotateRight((~j4) & j3, 1) | (j4 & j3);
        resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) this.serializer;
        if (resizegraphicframeifappropriatelambda0 != null) {
            if (resizegraphicframeifappropriatelambda0.IconCompatParcelizer(0)) {
                serializer(63);
            }
            ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).write(0);
        }
        return z;
    }

    public resizeGraphicFrameIfAppropriatelambda0(int i) {
        this.IconCompatParcelizer = i;
        if (i == 2) {
            this.write = 0L;
        } else {
            if (i != 3) {
                return;
            }
            this.write = 0L;
            this.serializer = accessgetHcp.REASON_UNKNOWN;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = this.IconCompatParcelizer;
        if (i == 4) {
            Vw$Vw vw$Vw = (Vw$Vw) this.serializer;
            ((AtomicLong) vw$Vw.IconCompatParcelizer).set(this.write);
        } else if (i != 5) {
            accessgetTvTeletextcp accessgettvteletextcp = (accessgetTvTeletextcp) this.serializer;
            ((AtomicLong) accessgettvteletextcp.write).set(this.write);
        } else {
            i$d i_d = (i$d) this.serializer;
            ((AtomicLong) i_d.read).set(this.write);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    public String toString() {
        int i;
        int i2 = this.IconCompatParcelizer;
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                return super.toString();
            }
            if (((resizeGraphicFrameIfAppropriatelambda0) this.serializer) == null) {
                return Long.toBinaryString(this.write);
            }
            return ((resizeGraphicFrameIfAppropriatelambda0) this.serializer).toString() + "xx" + Long.toBinaryString(this.write);
        }
        StringBuilder sb = new StringBuilder("BitVector [");
        int length = ((long[]) this.serializer).length;
        for (int i3 = 0; i3 < (length + 2) * 64; i3++) {
            if (i3 < 64) {
                if ((this.write & (1 << i3)) != 0) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(i3);
                    z = false;
                }
            } else if (i3 >= 128) {
                long[] jArr = (long[]) this.serializer;
                int length2 = jArr.length;
                if (length2 != 0 && (i = (i3 / 64) - 2) < length2 && (jArr[i] & (1 << (i3 % 64))) != 0) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(i3);
                    z = false;
                }
            } else if (0 != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i3);
                z = false;
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public resizeGraphicFrameIfAppropriatelambda0(RegistryNoSourceEncoderAvailableException registryNoSourceEncoderAvailableException) {
        this.IconCompatParcelizer = 0;
        registryNoSourceEncoderAvailableException.getClass();
        this.serializer = registryNoSourceEncoderAvailableException;
        this.write = 262144L;
    }

    public /* synthetic */ resizeGraphicFrameIfAppropriatelambda0(long j, int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.write = j;
    }
}
