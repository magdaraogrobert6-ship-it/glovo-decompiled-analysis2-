package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class getUseEvaluationsCachefwf_client_release implements connectorKeyYBCOT_4, accessgetUcp {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int write;

    public getUseEvaluationsCachefwf_client_release(int i, int i2) {
        this.RemoteActionCompatParcelizer = 4;
        getRectManager.RemoteActionCompatParcelizer((i & 1) == i, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i), 1);
        getRectManager.RemoteActionCompatParcelizer((i2 & 1) == i, "Cannot supply target ID from different generator ID", new Object[0]);
        this.write = i2;
    }

    @Override // o.accessgetUcp
    public int IconCompatParcelizer(Context context, String str) {
        return this.write;
    }

    @Override // o.accessgetUcp
    public int RemoteActionCompatParcelizer(Context context, String str, boolean z) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // o.connectorKeyYBCOT_4
    public Object serializer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, float f) {
        int i;
        int i2;
        float f2;
        int iArgb;
        int iArgb2;
        float f3;
        float fSerializer;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        boolean z = jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_ARRAY;
        if (z) {
            jsonReader.read();
        }
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            arrayList.add(Float.valueOf((float) jsonReader.MediaMetadataCompat()));
        }
        int i4 = 4;
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.write = 2;
        }
        if (z) {
            jsonReader.IconCompatParcelizer();
        }
        if (this.write == -1) {
            this.write = arrayList.size() / 4;
        }
        int i6 = this.write;
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.write * i4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double dFloatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i7 % 4;
            if (i11 != 0) {
                if (i11 == i3) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i9 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i10] = android.graphics.Color.argb(255, i8, i9, (int) (dFloatValue * 255.0d));
                }
            } else if (i10 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i10 - 1] >= f4) {
                    fArr[i10] = f4 + 0.01f;
                } else {
                    fArr[i10] = (float) dFloatValue;
                }
            } else {
                fArr[i10] = (float) dFloatValue;
            }
            i7++;
            i3 = 1;
            i4 = 4;
        }
        absResponse absresponse = new absResponse(fArr, iArr);
        if (arrayList.size() <= i) {
            return absresponse;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i12 = 0;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i12] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i12] = ((Float) arrayList.get(i)).floatValue();
                i12++;
            }
            i++;
        }
        float[] fArrCopyOf = absresponse.RemoteActionCompatParcelizer;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                float f5 = i14 < fArrCopyOf.length ? fArrCopyOf[i14] : Float.NaN;
                float f6 = i15 < size ? fArr2[i15] : Float.NaN;
                if (!Float.isNaN(f6) && f5 >= f6) {
                    if (!Float.isNaN(f5) && f6 >= f5) {
                        fArr4[i16] = f5;
                        i14++;
                        i15++;
                        i13++;
                    } else {
                        fArr4[i16] = f6;
                        i15++;
                    }
                } else {
                    fArr4[i16] = f5;
                    i14++;
                }
            }
            fArrCopyOf = i13 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i13);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = 0;
        while (i17 < length2) {
            float f7 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                int i18 = iArr[iBinarySearch];
                if (size >= i5 && f7 > fArr2[0]) {
                    int i19 = 1;
                    while (true) {
                        if (i19 < size) {
                            f3 = fArr2[i19];
                            if (f3 >= f7 || i19 == size - 1) {
                                break;
                            }
                            i19++;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unreachable code.");
                            return null;
                        }
                    }
                    if (f3 <= f7) {
                        fSerializer = fArr3[i19];
                    } else {
                        int i20 = i19 - 1;
                        float f8 = fArr2[i20];
                        fSerializer = getD50.serializer(fArr3[i20], fArr3[i19], (f7 - f8) / (f3 - f8));
                    }
                    iArgb2 = android.graphics.Color.argb((int) (fSerializer * 255.0f), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18));
                } else {
                    iArgb2 = android.graphics.Color.argb((int) (fArr3[0] * 255.0f), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18));
                }
                iArr2[i17] = iArgb2;
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr3[iBinarySearch2];
                if (i6 < 2 || f7 == fArr[0]) {
                    i2 = iArr[0];
                } else {
                    int i21 = 1;
                    while (true) {
                        if (i21 < i6) {
                            f2 = fArr[i21];
                            if (f2 >= f7 || i21 == i6 - 1) {
                                break;
                            }
                            i21++;
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unreachable code.");
                            return null;
                        }
                    }
                    if (i21 == i6 - 1 && f7 >= f2) {
                        iArgb = android.graphics.Color.argb((int) (f9 * 255.0f), android.graphics.Color.red(iArr[i21]), android.graphics.Color.green(iArr[i21]), android.graphics.Color.blue(iArr[i21]));
                    } else {
                        int i22 = i21 - 1;
                        float f10 = fArr[i22];
                        int iSerializer = Illuminant.serializer((f7 - f10) / (f2 - f10), iArr[i22], iArr[i21]);
                        iArgb = android.graphics.Color.argb((int) (f9 * 255.0f), android.graphics.Color.red(iSerializer), android.graphics.Color.green(iSerializer), android.graphics.Color.blue(iSerializer));
                    }
                    i2 = iArgb;
                }
                iArr2[i17] = i2;
            }
            i17++;
            i5 = 2;
        }
        return new absResponse(fArrCopyOf, iArr2);
    }

    public int write() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 7) {
            return i != 8 ? this.write : this.write;
        }
        return this.write;
    }

    public /* synthetic */ getUseEvaluationsCachefwf_client_release(byte b, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = i;
    }
}
