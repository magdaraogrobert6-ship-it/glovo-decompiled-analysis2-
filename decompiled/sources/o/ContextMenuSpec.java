package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuSpec implements Cloneable {
    public /* synthetic */ long[] IconCompatParcelizer;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public /* synthetic */ int read;
    public /* synthetic */ Object[] serializer;

    public final void IconCompatParcelizer(long j) {
        int iRemoteActionCompatParcelizer = DragGestureNodestartListeningForEvents1.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, j);
        if (iRemoteActionCompatParcelizer >= 0) {
            Object[] objArr = this.serializer;
            Object obj = objArr[iRemoteActionCompatParcelizer];
            Object obj2 = ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer;
            if (obj != obj2) {
                objArr[iRemoteActionCompatParcelizer] = obj2;
                this.RemoteActionCompatParcelizer = true;
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.read;
        Object[] objArr = this.serializer;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.read = 0;
        this.RemoteActionCompatParcelizer = false;
    }

    public final void read(long j, Object obj) {
        int iRemoteActionCompatParcelizer = DragGestureNodestartListeningForEvents1.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, j);
        if (iRemoteActionCompatParcelizer >= 0) {
            this.serializer[iRemoteActionCompatParcelizer] = obj;
            return;
        }
        int i = ~iRemoteActionCompatParcelizer;
        int i2 = this.read;
        Object obj2 = ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer;
        if (i < i2) {
            Object[] objArr = this.serializer;
            if (objArr[i] == obj2) {
                this.IconCompatParcelizer[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.RemoteActionCompatParcelizer) {
            long[] jArr = this.IconCompatParcelizer;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.serializer;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.RemoteActionCompatParcelizer = false;
                this.read = i3;
                i = ~DragGestureNodestartListeningForEvents1.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i3, j);
            }
        }
        int i5 = this.read;
        if (i5 >= this.IconCompatParcelizer.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i9);
            this.serializer = Arrays.copyOf(this.serializer, i9);
        }
        int i10 = this.read;
        if (i10 - i != 0) {
            long[] jArr2 = this.IconCompatParcelizer;
            int i11 = i + 1;
            onContentCardClicked.IconCompatParcelizer(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.serializer;
            onContentCardClicked.write(i11, i, this.read, objArr3, objArr3);
        }
        this.IconCompatParcelizer[i] = j;
        this.serializer[i] = obj;
        this.read++;
    }

    public final Object write(long j) {
        Object obj;
        int iRemoteActionCompatParcelizer = DragGestureNodestartListeningForEvents1.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, j);
        if (iRemoteActionCompatParcelizer < 0 || (obj = this.serializer[iRemoteActionCompatParcelizer]) == ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer) {
            return null;
        }
        return obj;
    }

    public final long IconCompatParcelizer(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.read)) {
            if (this.RemoteActionCompatParcelizer) {
                long[] jArr = this.IconCompatParcelizer;
                Object[] objArr = this.serializer;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.RemoteActionCompatParcelizer = false;
                this.read = i3;
            }
            return this.IconCompatParcelizer[i];
        }
        ForEachGestureKt.IconCompatParcelizer("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final Object write(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.read)) {
            if (this.RemoteActionCompatParcelizer) {
                long[] jArr = this.IconCompatParcelizer;
                Object[] objArr = this.serializer;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.RemoteActionCompatParcelizer = false;
                this.read = i3;
            }
            return this.serializer[i];
        }
        ForEachGestureKt.IconCompatParcelizer("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public final int IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            int i = this.read;
            long[] jArr = this.IconCompatParcelizer;
            Object[] objArr = this.serializer;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.RemoteActionCompatParcelizer = false;
            this.read = i2;
        }
        return this.read;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        ContextMenuSpec contextMenuSpec = (ContextMenuSpec) objClone;
        contextMenuSpec.IconCompatParcelizer = (long[]) this.IconCompatParcelizer.clone();
        contextMenuSpec.serializer = (Object[]) this.serializer.clone();
        return contextMenuSpec;
    }

    public final int read(long j) {
        if (this.RemoteActionCompatParcelizer) {
            int i = this.read;
            long[] jArr = this.IconCompatParcelizer;
            Object[] objArr = this.serializer;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.RemoteActionCompatParcelizer = false;
            this.read = i2;
        }
        return DragGestureNodestartListeningForEvents1.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, j);
    }

    public ContextMenuSpec(int i) {
        if (i == 0) {
            this.IconCompatParcelizer = DragGestureNodestartListeningForEvents1.write;
            this.serializer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.IconCompatParcelizer = new long[i5];
        this.serializer = new Object[i5];
    }

    public final String toString() {
        if (IconCompatParcelizer() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.read * 28);
        sb.append('{');
        int i = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(IconCompatParcelizer(i2));
            sb.append('=');
            Object objWrite = write(i2);
            if (objWrite != sb) {
                sb.append(objWrite);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ ContextMenuSpec(Object obj) {
        this(10);
    }
}
