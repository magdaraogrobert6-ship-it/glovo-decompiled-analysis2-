package o;

import androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1;
import coil3.Extras$Key;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getFontScale implements Iterable, displayInAppMessagelambda121 {
    public static final getFontScale IconCompatParcelizer = new getFontScale(0, 0, 0, null);
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long[] serializer;
    public final long write;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    public getFontScale(long j, long j2, long j3, long[] jArr) {
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        this.read = j3;
        this.serializer = jArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new verifyOrientationStatuslambda2(2, new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    public final getFontScale RemoteActionCompatParcelizer(long j) {
        long j2;
        long j3;
        long[] jArr;
        long j4 = this.read;
        long j5 = j - j4;
        int i = removeNodeAtDepth.read(j5, 0L);
        long j6 = this.write;
        if (i < 0 || removeNodeAtDepth.read(j5, 64L) >= 0) {
            int i2 = removeNodeAtDepth.read(j5, 64L);
            long j7 = this.RemoteActionCompatParcelizer;
            if (i2 < 0 || removeNodeAtDepth.read(j5, 128L) >= 0) {
                int i3 = removeNodeAtDepth.read(j5, 128L);
                long[] jArr2 = this.serializer;
                if (i3 >= 0) {
                    if (!serializer(j)) {
                        long j8 = ((j + 1) / 64) * 64;
                        long j9 = 0;
                        if (removeNodeAtDepth.read(j8, 0L) < 0) {
                            j8 = 9223372036854775680L;
                        }
                        long[] jArr3 = null;
                        long j10 = j7;
                        Extras$Key extras$Key = null;
                        while (true) {
                            if (removeNodeAtDepth.read(j4, j8) >= 0) {
                                j2 = j4;
                                j3 = j6;
                                break;
                            }
                            if (j6 != j9) {
                                if (extras$Key == null) {
                                    extras$Key = new Extras$Key(jArr2);
                                }
                                int i4 = 0;
                                while (i4 < 64) {
                                    if ((j6 & (1 << i4)) != j9) {
                                        ((AnchoredDraggableNode) extras$Key.IconCompatParcelizer).RemoteActionCompatParcelizer(((long) i4) + j4);
                                    }
                                    i4++;
                                    j9 = 0;
                                }
                            }
                            if (j10 == j9) {
                                j3 = j9;
                                j2 = j8;
                                break;
                            }
                            j4 += 64;
                            j6 = j10;
                            j10 = j9;
                        }
                        if (extras$Key == null) {
                            jArr = jArr2;
                        } else {
                            AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) extras$Key.IconCompatParcelizer;
                            int i5 = anchoredDraggableNode.RemoteActionCompatParcelizer;
                            if (i5 != 0) {
                                long[] jArr4 = new long[i5];
                                long[] jArr5 = anchoredDraggableNode.serializer;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    jArr4[i6] = jArr5[i6];
                                }
                                jArr3 = jArr4;
                            }
                            if (jArr3 == null) {
                                jArr = jArr2;
                            } else {
                                jArr = jArr3;
                            }
                        }
                        return new getFontScale(j10, j3, j2, jArr).RemoteActionCompatParcelizer(j);
                    }
                } else {
                    if (jArr2 == null) {
                        return new getFontScale(this.RemoteActionCompatParcelizer, this.write, this.read, new long[]{j});
                    }
                    int iSerializer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer(jArr2, j);
                    if (iSerializer < 0) {
                        int i7 = -(iSerializer + 1);
                        int length = jArr2.length;
                        long[] jArr6 = new long[length + 1];
                        onContentCardClicked.IconCompatParcelizer(jArr2, jArr6, 0, 0, i7);
                        onContentCardClicked.IconCompatParcelizer(jArr2, jArr6, i7 + 1, i7, length);
                        jArr6[i7] = j;
                        return new getFontScale(this.RemoteActionCompatParcelizer, this.write, this.read, jArr6);
                    }
                }
            } else {
                long j11 = 1 << (((int) j5) - 64);
                if ((j7 & j11) == 0) {
                    return new getFontScale(j7 | j11, this.write, this.read, this.serializer);
                }
            }
        } else {
            long j12 = 1 << ((int) j5);
            if ((j6 & j12) == 0) {
                return new getFontScale(this.RemoteActionCompatParcelizer, j6 | j12, this.read, this.serializer);
            }
        }
        return this;
    }

    public final getFontScale read(getFontScale getfontscale) {
        getFontScale getfontscale2;
        long[] jArr;
        getFontScale getfontscale3 = IconCompatParcelizer;
        if (getfontscale == getfontscale3) {
            return this;
        }
        if (this == getfontscale3) {
            return getfontscale3;
        }
        long j = getfontscale.read;
        long[] jArr2 = getfontscale.serializer;
        long j2 = getfontscale.write;
        long j3 = getfontscale.RemoteActionCompatParcelizer;
        long j4 = this.read;
        if (j == j4 && jArr2 == (jArr = this.serializer)) {
            return new getFontScale(this.RemoteActionCompatParcelizer & (~j3), this.write & (~j2), j4, jArr);
        }
        if (jArr2 != null) {
            getfontscale2 = this;
            for (long j5 : jArr2) {
                getfontscale2 = getfontscale2.read(j5);
            }
        } else {
            getfontscale2 = this;
        }
        long j6 = 1;
        if (j2 != 0) {
            int i = 0;
            while (i < 64) {
                if (((j6 << i) & j2) != 0) {
                    getfontscale2 = getfontscale2.read(((long) i) + j);
                }
                i++;
                j6 = 1;
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    getfontscale2 = getfontscale2.read(((long) i2) + j + 64);
                }
            }
        }
        return getfontscale2;
    }

    public final getFontScale serializer(getFontScale getfontscale) {
        getFontScale getfontscaleRemoteActionCompatParcelizer;
        long[] jArr;
        getFontScale getfontscaleRemoteActionCompatParcelizer2 = getfontscale;
        getFontScale getfontscale2 = IconCompatParcelizer;
        if (getfontscaleRemoteActionCompatParcelizer2 == getfontscale2) {
            return this;
        }
        if (this == getfontscale2) {
            return getfontscaleRemoteActionCompatParcelizer2;
        }
        long j = getfontscaleRemoteActionCompatParcelizer2.read;
        long[] jArr2 = getfontscaleRemoteActionCompatParcelizer2.serializer;
        long j2 = getfontscaleRemoteActionCompatParcelizer2.write;
        long j3 = getfontscaleRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
        long j4 = this.read;
        long j5 = this.write;
        long j6 = this.RemoteActionCompatParcelizer;
        if (j == j4 && jArr2 == (jArr = this.serializer)) {
            return new getFontScale(j6 | j3, j5 | j2, j4, jArr);
        }
        long[] jArr3 = this.serializer;
        int i = 0;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j7 : jArr3) {
                    getfontscaleRemoteActionCompatParcelizer2 = getfontscaleRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(j7);
                }
            }
            long j8 = this.read;
            if (j5 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j5) != 0) {
                        getfontscaleRemoteActionCompatParcelizer2 = getfontscaleRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(((long) i2) + j8);
                    }
                }
            }
            if (j6 != 0) {
                while (i < 64) {
                    if (((1 << i) & j6) != 0) {
                        getfontscaleRemoteActionCompatParcelizer2 = getfontscaleRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(((long) i) + j8 + 64);
                    }
                    i++;
                }
            }
            return getfontscaleRemoteActionCompatParcelizer2;
        }
        if (jArr2 != null) {
            getfontscaleRemoteActionCompatParcelizer = this;
            for (long j9 : jArr2) {
                getfontscaleRemoteActionCompatParcelizer = getfontscaleRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(j9);
            }
        } else {
            getfontscaleRemoteActionCompatParcelizer = this;
        }
        if (j2 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j2) != 0) {
                    getfontscaleRemoteActionCompatParcelizer = getfontscaleRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((long) i3) + j);
                }
            }
        }
        if (j3 != 0) {
            while (i < 64) {
                if (((1 << i) & j3) != 0) {
                    getfontscaleRemoteActionCompatParcelizer = getfontscaleRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((long) i) + j + 64);
                }
                i++;
            }
        }
        return getfontscaleRemoteActionCompatParcelizer;
    }

    public final getFontScale read(long j) {
        long[] jArr;
        int iSerializer;
        long[] jArr2;
        long j2 = j - this.read;
        if (removeNodeAtDepth.read(j2, 0L) >= 0 && removeNodeAtDepth.read(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.write;
            if ((j4 & j3) != 0) {
                return new getFontScale(this.RemoteActionCompatParcelizer, j4 & (~j3), this.read, this.serializer);
            }
        } else if (removeNodeAtDepth.read(j2, 64L) >= 0 && removeNodeAtDepth.read(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.RemoteActionCompatParcelizer;
            if ((j6 & j5) != 0) {
                return new getFontScale(j6 & (~j5), this.write, this.read, this.serializer);
            }
        } else if (removeNodeAtDepth.read(j2, 0L) < 0 && (jArr = this.serializer) != null && (iSerializer = DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iSerializer > 0) {
                    onContentCardClicked.IconCompatParcelizer(jArr, jArr3, 0, 0, iSerializer);
                }
                if (iSerializer < i) {
                    onContentCardClicked.IconCompatParcelizer(jArr, jArr3, iSerializer, iSerializer + 1, length);
                }
                jArr2 = jArr3;
            }
            return new getFontScale(this.RemoteActionCompatParcelizer, this.write, this.read, jArr2);
        }
        return this;
    }

    public final boolean serializer(long j) {
        long[] jArr;
        long j2 = j - this.read;
        if (removeNodeAtDepth.read(j2, 0L) >= 0 && removeNodeAtDepth.read(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.write) != 0;
        }
        if (removeNodeAtDepth.read(j2, 64L) < 0 || removeNodeAtDepth.read(j2, 128L) >= 0) {
            return removeNodeAtDepth.read(j2, 0L) <= 0 && (jArr = this.serializer) != null && DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.RemoteActionCompatParcelizer) != 0;
    }
}
