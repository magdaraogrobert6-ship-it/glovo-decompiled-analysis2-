package o;

/* JADX INFO: loaded from: classes2.dex */
public final class onFling {
    public int read;
    public final /* synthetic */ int serializer;
    public int[] write;

    public static void serializer(int[] iArr, int i, int i2) {
        int i3 = ((i + i2) / 2) & (-2);
        int i4 = iArr[i3];
        int i5 = iArr[i3 + 1];
        int i6 = i;
        int i7 = i2;
        while (i6 <= i7) {
            while (i6 < i2) {
                int i8 = iArr[i6] - i4;
                if (i8 == 0) {
                    i8 = i5 - iArr[i6 + 1];
                }
                if (i8 >= 0) {
                    break;
                } else {
                    i6 += 2;
                }
            }
            while (i7 > i) {
                int i9 = iArr[i7] - i4;
                if (i9 == 0) {
                    i9 = i5 - iArr[i7 + 1];
                }
                if (i9 <= 0) {
                    break;
                } else {
                    i7 -= 2;
                }
            }
            if (i6 <= i7) {
                if (i6 != i7) {
                    int i10 = iArr[i6];
                    iArr[i6] = iArr[i7];
                    iArr[i7] = i10;
                    int i11 = i6 + 1;
                    int i12 = iArr[i11];
                    int i13 = i7 + 1;
                    iArr[i11] = iArr[i13];
                    iArr[i13] = i12;
                }
                i6 += 2;
                i7 -= 2;
            }
        }
        if (i < i7) {
            serializer(iArr, i, i7);
        }
        if (i6 < i2) {
            serializer(iArr, i6, i2);
        }
    }

    public void IconCompatParcelizer(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.write;
            if (i >= iArr.length) {
                return;
            }
            this.read |= 1 << i;
            iArr[i] = i2;
        }
    }

    public int[] RemoteActionCompatParcelizer() {
        int i = this.read;
        int[] iArr = this.write;
        if (i == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public void serializer(int[] iArr, int i) {
        int i2 = 0;
        if (i < 0) {
            int i3 = 0;
            while (i2 < iArr.length) {
                int i4 = iArr[i2];
                int i5 = iArr[i2 + 1];
                int i6 = i4 - 1;
                if (i3 <= i6) {
                    RemoteActionCompatParcelizer(i3, i6);
                }
                i3 = i5 + 1;
                i2 += 2;
            }
            if (i3 <= 1114111) {
                RemoteActionCompatParcelizer(i3, 1114111);
                return;
            }
            return;
        }
        while (i2 < iArr.length) {
            RemoteActionCompatParcelizer(iArr[i2], iArr[i2 + 1]);
            i2 += 2;
        }
    }

    public onFling(int i) {
        this.serializer = i;
        if (i == 1) {
            this.write = new int[10];
        } else {
            this.write = debugInspectorInfo.write;
            this.read = 0;
        }
    }

    public void IconCompatParcelizer(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            int i = iArr2[0];
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            if (i3 == 1) {
                RemoteActionCompatParcelizer(i, i2);
            } else {
                while (i <= i2) {
                    RemoteActionCompatParcelizer(i, i);
                    i += i3;
                }
            }
        }
    }

    public String toString() {
        if (this.serializer != 0) {
            return super.toString();
        }
        int[] iArr = this.write;
        int i = this.read;
        StringBuilder sb = new StringBuilder("[");
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (i2 > 0) {
                sb.append(' ');
            }
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 == i4) {
                sb.append("0x");
                sb.append(Integer.toHexString(i3));
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(i3));
                sb.append("-0x");
                sb.append(Integer.toHexString(i4));
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public int IconCompatParcelizer() {
        if ((this.read & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            return this.write[7];
        }
        return 65535;
    }

    public void write() {
        int i = this.read;
        if (i < 4) {
            return;
        }
        serializer(this.write, 0, i - 2);
        int i2 = 2;
        for (int i3 = 2; i3 < this.read; i3 += 2) {
            int[] iArr = this.write;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            int i6 = i2 - 1;
            int i7 = iArr[i6];
            if (i4 > i7 + 1) {
                iArr[i2] = i4;
                iArr[i2 + 1] = i5;
                i2 += 2;
            } else if (i5 > i7) {
                iArr[i6] = i5;
            }
        }
        this.read = i2;
    }

    public void RemoteActionCompatParcelizer(InfiniteAnimationPolicy infiniteAnimationPolicy, boolean z) {
        int[] iArrRemoteActionCompatParcelizer = infiniteAnimationPolicy.serializer;
        if (z) {
            onFling onfling = new onFling(0);
            for (int i = 0; i < iArrRemoteActionCompatParcelizer.length; i += 2) {
                onfling.read(iArrRemoteActionCompatParcelizer[i], iArrRemoteActionCompatParcelizer[i + 1]);
            }
            onfling.write();
            iArrRemoteActionCompatParcelizer = onfling.RemoteActionCompatParcelizer();
        }
        serializer(iArrRemoteActionCompatParcelizer, infiniteAnimationPolicy.write);
    }

    public void RemoteActionCompatParcelizer(int i, int i2) {
        if (this.read > 0) {
            for (int i3 = 2; i3 <= 4; i3 += 2) {
                int i4 = this.read;
                if (i4 >= i3) {
                    int[] iArr = this.write;
                    int i5 = i4 - i3;
                    int i6 = iArr[i5];
                    int i7 = i5 + 1;
                    int i8 = iArr[i7];
                    if (i <= i8 + 1 && i6 <= i2 + 1) {
                        if (i < i6) {
                            iArr[i5] = i;
                        }
                        if (i2 > i8) {
                            iArr[i7] = i2;
                            return;
                        }
                        return;
                    }
                }
            }
        }
        int i9 = this.read;
        int i10 = i9 + 2;
        int[] iArr2 = this.write;
        if (iArr2.length < i10) {
            int i11 = i9 * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            int[] iArr3 = new int[i10];
            System.arraycopy(iArr2, 0, iArr3, 0, i9);
            this.write = iArr3;
        }
        int[] iArr4 = this.write;
        int i12 = this.read;
        iArr4[i12] = i;
        this.read = i12 + 2;
        iArr4[i12 + 1] = i2;
    }

    public void read(int i, int i2) {
        if (i <= 65 && i2 >= 66639) {
            RemoteActionCompatParcelizer(i, i2);
            return;
        }
        if (i2 < 65 || i > 66639) {
            RemoteActionCompatParcelizer(i, i2);
            return;
        }
        if (i < 65) {
            RemoteActionCompatParcelizer(i, 64);
            i = 65;
        }
        if (i2 > 66639) {
            RemoteActionCompatParcelizer(66640, i2);
            i2 = 66639;
        }
        while (i <= i2) {
            RemoteActionCompatParcelizer(i, i);
            for (int i3 = InspectableValue.read(i); i3 != i; i3 = InspectableValue.read(i3)) {
                RemoteActionCompatParcelizer(i3, i3);
            }
            i++;
        }
    }

    public onFling(int[] iArr) {
        this.serializer = 0;
        this.write = iArr;
        this.read = iArr.length;
    }
}
