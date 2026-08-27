package o;

import android.view.View;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.nlp.scan.FB;
import com.huawei.riemann.common.api.location.CityTileCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageResources_androidKt implements androidx.compose.ui.text.input.OffsetMapping, getAddressCountry, FocusPropertiesImpl, CityTileCallback {
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;

    public int serializer() {
        return this.serializer;
    }

    public int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer() {
        return (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read;
    }

    @Override // o.getAddressCountry
    public void IconCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj) {
        ((getAddressCountry) this.read).IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj);
    }

    public boolean MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer < ((List) this.read).size();
    }

    @Override // o.getAddressCountry
    public void clear() {
        getCreditCardExpirationDay.read("Clear is not valid on OffsetApplier");
    }

    @Override // o.getAddressCountry
    public Object getCurrent() {
        return ((getAddressCountry) this.read).getCurrent();
    }

    @Override // o.getAddressCountry
    public void insertBottomUp(int i, Object obj) {
        ((getAddressCountry) this.read).insertBottomUp(i + (this.serializer == 0 ? this.RemoteActionCompatParcelizer : 0), obj);
    }

    @Override // o.getAddressCountry
    public void insertTopDown(int i, Object obj) {
        ((getAddressCountry) this.read).insertTopDown(i + (this.serializer == 0 ? this.RemoteActionCompatParcelizer : 0), obj);
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        View view2 = (View) this.read;
        int i = focusRequesterModifierKt.IconCompatParcelizer.getInsets(519).write;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.serializer + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return focusRequesterModifierKt;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        int iOriginalToTransformed = ((androidx.compose.ui.text.input.OffsetMapping) this.read).originalToTransformed(i);
        if (i >= 0 && i <= this.RemoteActionCompatParcelizer) {
            BiasAlignment.serializer(iOriginalToTransformed, this.serializer, i);
        }
        return iOriginalToTransformed;
    }

    public boolean read(SocketAddress socketAddress) {
        for (int i = 0; i < ((List) this.read).size(); i++) {
            int iIndexOf = ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) ((List) this.read).get(i)).read.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.RemoteActionCompatParcelizer = i;
                this.serializer = iIndexOf;
                return true;
            }
        }
        return false;
    }

    @Override // o.getAddressCountry
    public void remove(int i, int i2) {
        ((getAddressCountry) this.read).remove(i + (this.serializer == 0 ? this.RemoteActionCompatParcelizer : 0), i2);
    }

    @Override // o.getAddressCountry
    public void reuse() {
        ((getAddressCountry) this.read).reuse();
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        int iTransformedToOriginal = ((androidx.compose.ui.text.input.OffsetMapping) this.read).transformedToOriginal(i);
        if (i >= 0 && i <= this.serializer) {
            BiasAlignment.RemoteActionCompatParcelizer(iTransformedToOriginal, this.RemoteActionCompatParcelizer, i);
        }
        return iTransformedToOriginal;
    }

    public void write(int i, int i2, int i3) {
        ((byte[][]) this.read)[i2][i] = (byte) i3;
    }

    @Override // o.getAddressCountry
    public void down(Object obj) {
        this.serializer++;
        ((getAddressCountry) this.read).down(obj);
    }

    @Override // com.huawei.riemann.common.api.location.CityTileCallback
    public byte[] get(long j) {
        String strM;
        String str;
        String str2;
        byte[] bArr;
        ColorResources_androidKt colorResources_androidKt;
        double[] dArr;
        if (((ColorResources_androidKt) this.read) == null) {
            this.read = new ColorResources_androidKt(this.RemoteActionCompatParcelizer, this.serializer);
        }
        ColorResources_androidKt colorResources_androidKt2 = (ColorResources_androidKt) this.read;
        colorResources_androidKt2.getClass();
        String str3 = ColorResources_androidKt.write;
        WrappedCompositionsetContent1211.read();
        if (colorResources_androidKt2.IconCompatParcelizer == null) {
            colorResources_androidKt2.IconCompatParcelizer = new getTheme(colorResources_androidKt2.read, colorResources_androidKt2.RemoteActionCompatParcelizer);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileCacheManager", "Get files from the TileCache");
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = new File(str3).listFiles();
        if (fileArrListFiles == null) {
            strM = null;
        } else {
            strM = null;
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    break;
                }
                String name = file.getName();
                if (name.equals(String.valueOf(j))) {
                    strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(str3), File.separator, name);
                } else if (jCurrentTimeMillis - file.lastModified() > 2592000000L && !file.delete()) {
                    WrappedCompositionsetContent1211.read();
                }
            }
        }
        if (strM == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileCacheManager", "Get files from the StoreCache");
            prune pruneVarIconCompatParcelizer = colorResources_androidKt2.IconCompatParcelizer.IconCompatParcelizer(String.valueOf(j));
            int i = pruneVarIconCompatParcelizer.IconCompatParcelizer;
            if (i == 2) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileCacheManager", "tile downloading.");
                return null;
            }
            if (i == 3) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileCacheManager", "tile not exists.");
                return new byte[0];
            }
            String str4 = pruneVarIconCompatParcelizer.RemoteActionCompatParcelizer;
            File[] fileArrListFiles2 = new File(str3).listFiles();
            if (fileArrListFiles2 != null && fileArrListFiles2.length >= 4) {
                Arrays.sort(fileArrListFiles2, new FB(17));
                for (int i2 = 0; i2 < fileArrListFiles2.length; i2++) {
                    if (i2 >= 3 && !fileArrListFiles2[i2].delete()) {
                        WrappedCompositionsetContent1211.read();
                    }
                }
            }
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str3);
            sbM.append(File.separator);
            String string = sbM.toString();
            if (!integerResource.write(str4, string, String.valueOf(j))) {
                WrappedCompositionsetContent1211.read("TileCacheManager", "Failed to unzip the file.");
            }
            strM = string + j;
        }
        colorResources_androidKt2.IconCompatParcelizer.getClass();
        double d = getTheme.read;
        double d2 = getTheme.IconCompatParcelizer;
        if (d == 0.0d || d2 == 0.0d) {
            str = "TileCacheManager";
            str2 = strM;
            WrappedCompositionsetContent1211.read();
        } else if (j != ResourceIdCache.write(d2, d)) {
            WrappedCompositionsetContent1211.read();
            str = "TileCacheManager";
            str2 = strM;
        } else {
            long j2 = j << 5;
            double[] dArr2 = {-90.0d, 90.0d};
            double[] dArr3 = {-180.0d, 180.0d};
            int i3 = 1;
            int i4 = (((int) (j2 >>> 59)) * 2) + 1;
            boolean z = true;
            int i5 = 0;
            while (true) {
                if (i3 >= 13) {
                    colorResources_androidKt = colorResources_androidKt2;
                    break;
                }
                colorResources_androidKt = colorResources_androidKt2;
                int i6 = (int) (j2 >>> 59);
                long j3 = j2 << 5;
                boolean z2 = z;
                for (int i7 = 0; i7 < 5; i7++) {
                    int i8 = StringResources_androidKt.RemoteActionCompatParcelizer[i7];
                    if (z2) {
                        if ((i8 & i6) != 0) {
                            dArr3[0] = (dArr3[0] + dArr3[1]) / 2.0d;
                        } else {
                            dArr3[1] = (dArr3[0] + dArr3[1]) / 2.0d;
                        }
                    } else if ((i8 & i6) != 0) {
                        dArr2[0] = (dArr2[0] + dArr2[1]) / 2.0d;
                    } else {
                        dArr2[1] = (dArr2[0] + dArr2[1]) / 2.0d;
                    }
                    z2 = !z2;
                    i5++;
                    if (i5 >= i4) {
                        break;
                    }
                }
                if (i5 >= i4) {
                    break;
                }
                i3++;
                colorResources_androidKt2 = colorResources_androidKt;
                z = z2;
                j2 = j3;
            }
            double d3 = (dArr2[0] + dArr2[1]) / 2.0d;
            double d4 = (dArr3[0] + dArr3[1]) / 2.0d;
            double radians = Math.toRadians(d3);
            double radians2 = Math.toRadians(d);
            double radians3 = Math.toRadians(d2 - d4);
            double dSin = Math.sin(radians3);
            String str5 = "TileCacheManager";
            double degrees = (Math.toDegrees(Math.atan2(Math.cos(radians2) * dSin, (Math.sin(radians2) * Math.cos(radians)) - (Math.cos(radians3) * (Math.cos(radians2) * Math.sin(radians))))) + 360.0d) % 360.0d;
            if (degrees < 0.0d || degrees > 360.0d) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileIdPrediction", "illegal degree, return null");
                dArr = new double[0];
            } else if (0.0d <= degrees && degrees < 90.0d) {
                dArr = new double[]{0.0d, 45.0d, 90.0d};
            } else if (90.0d <= degrees && degrees < 180.0d) {
                dArr = new double[]{90.0d, 135.0d, 180.0d};
            } else if (180.0d <= degrees && degrees < 270.0d) {
                dArr = new double[]{180.0d, 225.0d, 270.0d};
            } else {
                dArr = new double[]{270.0d, 315.0d, 360.0d};
            }
            int length = dArr.length;
            booleanResource[] booleanresourceArr = new booleanResource[length];
            int i9 = 0;
            while (i9 < dArr.length) {
                double radians4 = Math.toRadians(dArr[i9]);
                double dSin2 = Math.sin(radians4);
                double dCos = Math.cos(radians4);
                double dTan = Math.tan(Math.toRadians(d3)) * 0.996647189336d;
                double dSqrt = 1.0d / Math.sqrt((dTan * dTan) + 1.0d);
                double d5 = dTan * dSqrt;
                double dAtan2 = Math.atan2(dTan, dCos);
                double d6 = dSqrt * dSin2;
                double d7 = d6 * d6;
                double d8 = 1.0d - d7;
                double d9 = (2.723316066819453E11d * d8) / 4.0408299984087055E13d;
                double d10 = (((((74.0d - (47.0d * d9)) * d9) - 128.0d) * d9) + 256.0d) * (d9 / 1024.0d);
                double d11 = 500.0d / ((((((((320.0d - (175.0d * d9)) * d9) - 768.0d) * d9) + 4096.0d) * (d9 / 16384.0d)) + 1.0d) * 6356752.3142d);
                double d12 = 6.283185307179586d;
                double dSin3 = 0.0d;
                double dCos2 = 0.0d;
                double dCos3 = 0.0d;
                double d13 = d11;
                while (Math.abs(d13 - d12) > 1.0E-12d) {
                    dCos3 = Math.cos((dAtan2 * 2.0d) + d13);
                    dSin3 = Math.sin(d13);
                    dCos2 = Math.cos(d13);
                    d12 = d13;
                    d13 = ((((((((dCos3 * 2.0d) * dCos3) - 1.0d) * dCos2) - ((((dCos3 * 4.0d) * dCos3) - 3.0d) * ((((4.0d * dSin3) * dSin3) - 3.0d) * ((d10 / 6.0d) * dCos3)))) * (d10 / 4.0d)) + dCos3) * d10 * dSin3) + d11;
                }
                double d14 = d5 * dSin3;
                double d15 = dSqrt * dCos2;
                double d16 = d14 - (d15 * dCos);
                double dSqrt2 = Math.sqrt((d16 * d16) + d7);
                double d17 = d3;
                double dAtan3 = Math.atan2((dSqrt * dSin3 * dCos) + (d5 * dCos2), dSqrt2 * 0.996647189336d);
                double dAtan4 = Math.atan2(dSin3 * dSin2, d15 - (dCos * d14));
                double d18 = (((4.0d - (3.0d * d8)) * 0.003352810664d) + 4.0d) * d8 * 2.095506665E-4d;
                booleanresourceArr[i9] = new booleanResource(Math.toDegrees(dAtan3), Math.toDegrees(dAtan4 - ((((((((dCos3 * 2.0d) * dCos3) - 1.0d) * (dCos2 * d18)) + dCos3) * (dSin3 * d18)) + d13) * (((1.0d - d18) * 0.003352810664d) * d6))) + d4);
                i9++;
                strM = strM;
                str5 = str5;
                d3 = d17;
            }
            str = str5;
            str2 = strM;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                booleanResource booleanresource = booleanresourceArr[i10];
                lArr[i10] = Long.valueOf(ResourceIdCache.write(booleanresource.read, booleanresource.serializer));
            }
            getTheme gettheme = colorResources_androidKt.IconCompatParcelizer;
            gettheme.getClass();
            if (length <= 0) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "tileIdList is empty");
            } else {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("TileStoreManager", "start preDownload Tile Zip File");
                for (int i11 = 0; i11 < length; i11++) {
                    gettheme.IconCompatParcelizer(String.valueOf(lArr[i11].longValue()));
                }
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str2));
            try {
                bArr = new byte[fileInputStream.available()];
                if (fileInputStream.read(bArr) == 0) {
                    bArr = new byte[0];
                }
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("FileUtils", "getByteFrom IOException");
            bArr = new byte[0];
        }
        WindowInfoImplCompanion.serializer(bArr.length, str, new StringBuilder("get tile byte length is: "));
        return bArr;
    }

    @Override // o.getAddressCountry
    public void move(int i, int i2, int i3) {
        int i4 = this.serializer == 0 ? this.RemoteActionCompatParcelizer : 0;
        ((getAddressCountry) this.read).move(i + i4, i2 + i4, i3);
    }

    public ImageResources_androidKt(int i, int i2, int i3) {
        this.IconCompatParcelizer = i3;
        if (i3 != 7) {
            this.read = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
            this.RemoteActionCompatParcelizer = i;
            this.serializer = i2;
        } else {
            this.read = null;
            this.RemoteActionCompatParcelizer = i;
            int i4 = i2 & 7;
            this.serializer = i4 == 0 ? 8 : i4;
        }
    }

    public String toString() {
        if (this.IconCompatParcelizer != 6) {
            return super.toString();
        }
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = ((byte[][]) this.read)[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public SocketAddress read() {
        if (MediaMetadataCompat()) {
            return (SocketAddress) ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) ((List) this.read).get(this.RemoteActionCompatParcelizer)).read.get(this.serializer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Index is past the end of the address group list");
        return null;
    }

    @Override // o.getAddressCountry
    public void up() {
        if (this.serializer <= 0) {
            getCreditCardExpirationDay.read("OffsetApplier up called with no corresponding down");
        }
        this.serializer--;
        ((getAddressCountry) this.read).up();
    }

    public boolean RemoteActionCompatParcelizer() {
        if (MediaMetadataCompat()) {
            r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE r8lambda_glyxfcg6xju1wmp26w6t1itdue = (r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) ((List) this.read).get(this.RemoteActionCompatParcelizer);
            int i = this.serializer + 1;
            this.serializer = i;
            if (i >= r8lambda_glyxfcg6xju1wmp26w6t1itdue.read.size()) {
                int i2 = this.RemoteActionCompatParcelizer + 1;
                this.RemoteActionCompatParcelizer = i2;
                this.serializer = 0;
                if (i2 < ((List) this.read).size()) {
                }
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ ImageResources_androidKt(int i, int i2, int i3, Object obj) {
        this.IconCompatParcelizer = i3;
        this.read = obj;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }

    public ImageResources_androidKt() {
        this.IconCompatParcelizer = 7;
        this.read = new ImageResources_androidKt[androidx.compose.ui.graphics.Fields.RotationX];
        this.RemoteActionCompatParcelizer = 0;
        this.serializer = 0;
    }

    public /* synthetic */ ImageResources_androidKt(int i) {
        this.IconCompatParcelizer = i;
    }

    public ImageResources_androidKt(getAddressCountry getaddresscountry, int i) {
        this.IconCompatParcelizer = 3;
        this.read = getaddresscountry;
        this.RemoteActionCompatParcelizer = i;
    }

    public ImageResources_androidKt(int i, int i2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = 1;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public ImageResources_androidKt(int i, int i2, View view) {
        this.IconCompatParcelizer = 5;
        this.RemoteActionCompatParcelizer = i;
        this.read = view;
        this.serializer = i2;
    }

    public byte IconCompatParcelizer(int i, int i2) {
        return ((byte[][]) this.read)[i2][i];
    }
}
