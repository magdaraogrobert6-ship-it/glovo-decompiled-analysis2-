package o;

import android.content.Context;
import android.os.Build;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetColorcp {
    public static UserInfoCompanion RemoteActionCompatParcelizer(getContact getcontact, provideMoshi providemoshi) throws IOException {
        int i;
        updateUserPropertiesToDataStore updateuserpropertiestodatastore;
        AnalyticsImpl analyticsImpl;
        int i2;
        CustomJsonAdapter customJsonAdapter;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        long jIconCompatParcelizer;
        int i8;
        short sSerializer;
        FwFDataQueriesselectItem2 fwFDataQueriesselectItem2;
        if (getcontact instanceof CacheDriverFactory) {
            CacheDriverFactory cacheDriverFactory = (CacheDriverFactory) getcontact;
            return new UserInfoCompanion(getEvaluationsfwf_client_release.RemoteActionCompatParcelizer(cacheDriverFactory.write), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(cacheDriverFactory.serializer), 0), providemoshi, null);
        }
        if (getcontact instanceof migrateHoldoutKeys) {
            migrateHoldoutKeys migrateholdoutkeys = (migrateHoldoutKeys) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion(User.RatingCompat, new CryptoManagerImpl(getEvaluationsfwf_client_release.IconCompatParcelizer((String) migrateholdoutkeys.RemoteActionCompatParcelizer))), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(migrateholdoutkeys.IconCompatParcelizer), 0), null, null);
        }
        if (getcontact instanceof accessgetFeatureWithLock) {
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion = new WebViewPreloadingTypeCompanion(User.serializer);
            short[] sArrIconCompatParcelizer = accessbootstrapIfNeeded.IconCompatParcelizer(((accessgetFeatureWithLock) getcontact).write);
            byte[] bArr2 = new byte[sArrIconCompatParcelizer.length * 2];
            for (int i9 = 0; i9 != sArrIconCompatParcelizer.length; i9++) {
                short s = sArrIconCompatParcelizer[i9];
                int i10 = i9 * 2;
                bArr2[i10] = (byte) s;
                bArr2[i10 + 1] = (byte) (s >>> 8);
            }
            return new UserInfoCompanion(webViewPreloadingTypeCompanion, new UrlBuilderKt(bArr2, 0), null, null);
        }
        if (getcontact instanceof FwFDataQueriesselectItems2) {
            FwFDataQueriesselectItems2 fwFDataQueriesselectItems2 = (FwFDataQueriesselectItems2) getcontact;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(fwFDataQueriesselectItems2.MediaMetadataCompat());
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(1);
                try {
                    byteArrayOutputStream2.write(fwFDataQueriesselectItems2.read().MediaMetadataCompat());
                    return new UserInfoCompanion(new WebViewPreloadingTypeCompanion(PhoneCallTypeNormal.RemoteActionCompatParcelizer), new UrlBuilderKt(byteArray, 0), providemoshi, byteArrayOutputStream2.toByteArray());
                } catch (Exception e) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
                    return null;
                }
            } catch (Exception e2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e2.getMessage(), e2);
                return null;
            }
        }
        if (getcontact instanceof FwFDataQueriesinsertItem1) {
            FwFDataQueriesinsertItem1 fwFDataQueriesinsertItem1 = (FwFDataQueriesinsertItem1) getcontact;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = fwFDataQueriesinsertItem1.MediaBrowserCompatMediaItem;
            byteArrayOutputStream3.write((byte) (i11 >>> 24));
            byteArrayOutputStream3.write((byte) (i11 >>> 16));
            byteArrayOutputStream3.write((byte) (i11 >>> 8));
            byteArrayOutputStream3.write((byte) i11);
            try {
                byteArrayOutputStream3.write(fwFDataQueriesinsertItem1.MediaMetadataCompat());
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i12 = fwFDataQueriesinsertItem1.MediaBrowserCompatMediaItem;
                byteArrayOutputStream4.write((byte) (i12 >>> 24));
                byteArrayOutputStream4.write((byte) (i12 >>> 16));
                byteArrayOutputStream4.write((byte) (i12 >>> 8));
                byteArrayOutputStream4.write((byte) i12);
                synchronized (fwFDataQueriesinsertItem1) {
                    fwFDataQueriesselectItem2 = ((FwFDataQueriesselectItems2) fwFDataQueriesinsertItem1.write.get(0)).read();
                    if (fwFDataQueriesselectItem2 == null) {
                        throw new NullPointerException("lmsPublicKey");
                    }
                }
                try {
                    byteArrayOutputStream4.write(fwFDataQueriesselectItem2.MediaMetadataCompat());
                    return new UserInfoCompanion(new WebViewPreloadingTypeCompanion(PhoneCallTypeNormal.RemoteActionCompatParcelizer), new UrlBuilderKt(byteArray2, 0), providemoshi, byteArrayOutputStream4.toByteArray());
                } catch (Exception e3) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e3.getMessage(), e3);
                    return null;
                }
            } catch (Exception e4) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e4.getMessage(), e4);
                return null;
            }
        }
        if (getcontact instanceof deleteFeature) {
            deleteFeature deletefeature = (deleteFeature) getcontact;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion2 = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.ensureViewModelStore.get((bootstrapInitialDatafwf_client_release) deletefeature.serializer));
            UrlBuilderKt urlBuilderKt = new UrlBuilderKt(deletefeature.serializer(), 0);
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = deletefeature.IconCompatParcelizer;
            return new UserInfoCompanion(webViewPreloadingTypeCompanion2, urlBuilderKt, providemoshi, accessbootstrapIfNeeded.read((byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.write, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer));
        }
        if (getcontact instanceof getAllFromStorage) {
            getAllFromStorage getallfromstorage = (getAllFromStorage) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.get((decodeFeatures) getallfromstorage.serializer)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(getallfromstorage.RemoteActionCompatParcelizer), 0), providemoshi, null);
        }
        if (getcontact instanceof FeatureInfo) {
            FeatureInfo featureInfo = (FeatureInfo) getcontact;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion3 = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get((getUserFeatureFlags) featureInfo.RemoteActionCompatParcelizer));
            CustomJsonAdapter customJsonAdapter2 = ((getUserFeatureFlags) featureInfo.RemoteActionCompatParcelizer).MediaSessionCompatToken;
            byte[] bArr3 = new byte[customJsonAdapter2.RemoteActionCompatParcelizer()];
            byte[] bArr4 = featureInfo.IconCompatParcelizer;
            byte[] bArr5 = new byte[customJsonAdapter2.RemoteActionCompatParcelizer()];
            int i13 = customJsonAdapter2.write;
            int i14 = 1 << i13;
            short[] sArr = new short[i14];
            int[] iArr = new int[i14];
            int i15 = customJsonAdapter2.MediaSessionCompatQueueItem;
            int i16 = i15 / 8;
            int i17 = i14 * 4;
            int i18 = i17 + i16;
            byte[] bArr6 = new byte[i18];
            int i19 = customJsonAdapter2.IconCompatParcelizer;
            getFinancial getfinancial = new getFinancial(androidx.compose.ui.graphics.Fields.RotationX);
            getfinancial.RemoteActionCompatParcelizer((byte) 64);
            getfinancial.IconCompatParcelizer(bArr4, 0, 32);
            getfinancial.serializer(bArr6, 0, i18);
            for (int i20 = 0; i20 < i14; i20++) {
                iArr[i20] = createCache.read((i20 * 4) + (((i18 - 32) - i19) - i17), bArr6);
            }
            boolean z = customJsonAdapter2.MediaDescriptionCompat;
            int i21 = customJsonAdapter2.RemoteActionCompatParcelizer;
            FeatureInfoJsonAdapter featureInfoJsonAdapter = customJsonAdapter2.MediaBrowserCompatMediaItem;
            int i22 = customJsonAdapter2.read;
            int i23 = customJsonAdapter2.RatingCompat;
            short[] sArr2 = new short[i23 + 1];
            sArr2[i23] = 1;
            int i24 = 0;
            while (i24 < i23) {
                int i25 = i24 * 2;
                sArr2[i24] = (short) (((short) (((bArr4[i25 + 41] & 255) << 8) | (bArr4[i25 + 40] & 255))) & i21);
                i24++;
                z = z;
                bArr5 = bArr5;
            }
            boolean z2 = z;
            byte[] bArr7 = bArr5;
            long[] jArr = new long[i14];
            int i26 = 0;
            while (i26 < i14) {
                int i27 = i16;
                long j = iArr[i26];
                jArr[i26] = j;
                long j2 = j << 31;
                jArr[i26] = j2;
                long j3 = j2 | ((long) i26);
                jArr[i26] = j3;
                jArr[i26] = j3 & Long.MAX_VALUE;
                i26++;
                i16 = i27;
                i22 = i22;
            }
            int i28 = i16;
            int i29 = i22;
            char c = '?';
            if (i14 >= 2) {
                int i30 = 1;
                while (i30 < i14 - i30) {
                    i30 += i30;
                }
                int i31 = i30;
                while (i31 > 0) {
                    for (int i32 = 0; i32 < i14 - i31; i32++) {
                        if ((i32 & i31) == 0) {
                            int i33 = i32 + i31;
                            long j4 = jArr[i33];
                            long j5 = jArr[i32];
                            long j6 = (-((j4 - j5) >>> c)) & (j5 ^ j4);
                            jArr[i32] = j5 ^ j6;
                            jArr[i33] = jArr[i33] ^ j6;
                        }
                    }
                    int i34 = 0;
                    for (int i35 = i30; i35 > i31; i35 >>>= 1) {
                        while (i34 < i14 - i35) {
                            if ((i34 & i31) == 0) {
                                int i36 = i34 + i31;
                                long j7 = jArr[i36];
                                int i37 = i35;
                                while (i37 > i31) {
                                    int i38 = i34 + i37;
                                    long j8 = jArr[i38];
                                    int i39 = i23;
                                    long j9 = (-((j8 - j7) >>> 63)) & (j7 ^ j8);
                                    j7 ^= j9;
                                    jArr[i38] = j8 ^ j9;
                                    i37 >>>= 1;
                                    customJsonAdapter2 = customJsonAdapter2;
                                    i23 = i39;
                                }
                                i2 = i23;
                                customJsonAdapter = customJsonAdapter2;
                                jArr[i36] = j7;
                            } else {
                                i2 = i23;
                                customJsonAdapter = customJsonAdapter2;
                            }
                            i34++;
                            customJsonAdapter2 = customJsonAdapter;
                            i23 = i2;
                        }
                    }
                    i31 >>>= 1;
                    c = '?';
                }
            }
            int i40 = i23;
            CustomJsonAdapter customJsonAdapter3 = customJsonAdapter2;
            int i41 = 1;
            while (true) {
                if (i41 >= i14) {
                    short[] sArr3 = new short[i15];
                    for (int i42 = 0; i42 < i14; i42++) {
                        sArr[i42] = (short) (jArr[i42] & ((long) i21));
                    }
                    for (int i43 = 0; i43 < i15; i43++) {
                        short s2 = sArr[i43];
                        short s3 = (short) (((s2 & 255) << 8) | ((65280 & s2) >> 8));
                        short s4 = (short) (((s3 & 3855) << 4) | ((61680 & s3) >> 4));
                        short s5 = (short) (((s4 & 13107) << 2) | ((52428 & s4) >> 2));
                        short s6 = (short) (((s5 & 21845) << 1) | ((43690 & s5) >> 1));
                        sArr3[i43] = (short) (i13 == 12 ? s6 >> 4 : s6 >> 3);
                    }
                    short[] sArr4 = new short[i15];
                    for (int i44 = 0; i44 < i15; i44++) {
                        short s7 = sArr3[i44];
                        short s8 = sArr2[i40];
                        for (int i45 = i40 - 1; i45 >= 0; i45--) {
                            s8 = (short) (featureInfoJsonAdapter.read(s8, s7) ^ sArr2[i45]);
                        }
                        sArr4[i44] = s8;
                    }
                    for (int i46 = 0; i46 < i15; i46++) {
                        short s9 = sArr4[i46];
                        if (featureInfoJsonAdapter.IconCompatParcelizer != 0) {
                            short sWrite = featureInfoJsonAdapter.write(s9, s9);
                            short sSerializer2 = featureInfoJsonAdapter.serializer(sWrite, sWrite);
                            sSerializer = featureInfoJsonAdapter.write(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.IconCompatParcelizer(accessgetDifferencecp.read(featureInfoJsonAdapter.IconCompatParcelizer(accessgetDifferencecp.read(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.IconCompatParcelizer(accessgetDifferencecp.read(featureInfoJsonAdapter.IconCompatParcelizer(accessgetDifferencecp.read(sSerializer2)))), sSerializer2))))), sSerializer2), (short) 1);
                        } else {
                            short s10 = featureInfoJsonAdapter.read(featureInfoJsonAdapter.serializer(s9), s9);
                            short s11 = featureInfoJsonAdapter.read(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.serializer(s10)), s10);
                            sSerializer = featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.read(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.read(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.read(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.serializer(featureInfoJsonAdapter.serializer(s11)))), s11))), s10)), s9));
                        }
                        sArr4[i46] = sSerializer;
                    }
                    int i47 = i28;
                    byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i29, i47);
                    for (int i48 = 0; i48 < i29; i48++) {
                        for (int i49 = 0; i49 < i47; i49++) {
                            bArr8[i48][i49] = 0;
                        }
                    }
                    int i50 = 0;
                    while (i50 < i40) {
                        for (int i51 = 0; i51 < i15; i51 += 8) {
                            for (int i52 = 0; i52 < i13; i52++) {
                                bArr8[(i50 * i13) + i52][i51 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr4[i51 + 7] >>> i52) & 1)) << 1)) | ((sArr4[i51 + 6] >>> i52) & 1))) << 1)) | ((sArr4[i51 + 5] >>> i52) & 1))) << 1)) | ((sArr4[i51 + 4] >>> i52) & 1))) << 1)) | ((sArr4[i51 + 3] >>> i52) & 1))) << 1)) | ((sArr4[i51 + 2] >>> i52) & 1))) << 1)) | ((sArr4[i51 + 1] >>> i52) & 1))) << 1)) | ((sArr4[i51] >>> i52) & 1));
                            }
                        }
                        for (int i53 = 0; i53 < i15; i53++) {
                            sArr4[i53] = featureInfoJsonAdapter.read(sArr4[i53], sArr3[i53]);
                        }
                        i50++;
                    }
                    int i54 = 0;
                    loop16: while (true) {
                        if (i54 >= i29) {
                            int i55 = i15;
                            int i56 = i47;
                            if (z2) {
                                int i57 = i29 % 8;
                                if (i57 != 0) {
                                    int i58 = 8;
                                    int i59 = 0;
                                    int i60 = 0;
                                    while (i59 < i29) {
                                        int i61 = (i29 - 1) / i58;
                                        while (i61 < i56 - 1) {
                                            byte[] bArr9 = bArr8[i59];
                                            byte b = bArr9[i61];
                                            i61++;
                                            bArr7[i60] = (byte) ((bArr9[i61] << (8 - i57)) | ((b & 255) >>> i57));
                                            i60++;
                                        }
                                        bArr7[i60] = (byte) ((bArr8[i59][i61] & 255) >>> i57);
                                        i59++;
                                        i60++;
                                        i58 = 8;
                                    }
                                    break;
                                }
                                System.arraycopy(bArr8[i50], (i29 - 1) / 8, bArr7, 0, i56);
                                break;
                            }
                            int i62 = ((i55 - i29) + 7) / 8;
                            for (int i63 = 0; i63 < i29; i63++) {
                                System.arraycopy(bArr8[i63], i29 / 8, bArr7, i62 * i63, i62);
                            }
                            break;
                        }
                        i50 = i54 >>> 3;
                        int i64 = i54 & 7;
                        CustomJsonAdapter customJsonAdapter4 = customJsonAdapter3;
                        if (customJsonAdapter4.MediaMetadataCompat && i54 == (i7 = i29 - 32)) {
                            long[] jArr2 = new long[64];
                            int i65 = 32;
                            long[] jArr3 = new long[32];
                            byte[] bArr10 = new byte[9];
                            int i66 = i7 / 8;
                            int i67 = i7 % 8;
                            if (z2) {
                                int i68 = 0;
                                while (true) {
                                    customJsonAdapter3 = customJsonAdapter4;
                                    if (i68 >= i65) {
                                        break;
                                    }
                                    int i69 = 0;
                                    for (int i70 = 9; i69 < i70; i70 = 9) {
                                        bArr10[i69] = bArr8[i7 + i68][i66 + i69];
                                        i69++;
                                    }
                                    int i71 = 0;
                                    while (i71 < 8) {
                                        int i72 = i71 + 1;
                                        bArr10[i71] = (byte) (((bArr10[i71] & 255) >> i67) | (bArr10[i72] << (8 - i67)));
                                        i71 = i72;
                                    }
                                    jArr2[i68] = createCache.IconCompatParcelizer(0, bArr10);
                                    i68++;
                                    customJsonAdapter4 = customJsonAdapter3;
                                    i65 = 32;
                                }
                            } else {
                                customJsonAdapter3 = customJsonAdapter4;
                                for (int i73 = 0; i73 < 32; i73++) {
                                    jArr2[i73] = createCache.IconCompatParcelizer(i66, bArr8[i7 + i73]);
                                }
                            }
                            int i74 = 0;
                            while (true) {
                                if (i74 < i65) {
                                    int i75 = i74 + 1;
                                    int i76 = i64;
                                    int i77 = i15;
                                    long j10 = jArr2[i74];
                                    while (i75 < i65) {
                                        j10 |= jArr2[i75];
                                        i75++;
                                        i65 = 32;
                                    }
                                    long j11 = 0;
                                    if (j10 == 0) {
                                        break;
                                    }
                                    long j12 = 72340172838076673L;
                                    int i78 = 0;
                                    while (i78 < 8) {
                                        j12 &= (~j10) >>> i78;
                                        j11 += j12;
                                        i78++;
                                        i47 = i47;
                                        i54 = i54;
                                    }
                                    int i79 = i47;
                                    int i80 = i54;
                                    long j13 = j11 & 578721382704613384L;
                                    long j14 = j13 | (j13 >>> 1);
                                    long j15 = j14 | (j14 >>> 2);
                                    long j16 = j11 >>> 8;
                                    byte[] bArr11 = bArr10;
                                    int i81 = 2;
                                    long j17 = j11 + (j16 & j15);
                                    for (int i82 = 8; i81 < i82; i82 = 8) {
                                        j15 &= j15 >>> i82;
                                        j16 >>>= i82;
                                        j17 += j16 & j15;
                                        i81++;
                                    }
                                    int i83 = ((int) j17) & 255;
                                    jArr3[i74] = i83;
                                    int i84 = i75;
                                    while (true) {
                                        i8 = 32;
                                        if (i84 >= 32) {
                                            break;
                                        }
                                        long j18 = jArr2[i74];
                                        jArr2[i74] = j18 ^ (jArr2[i84] & (((j18 >> i83) & 1) - 1));
                                        i84++;
                                    }
                                    long j19 = 1;
                                    int i85 = i75;
                                    while (i85 < i8) {
                                        long j20 = jArr2[i85];
                                        jArr2[i85] = j20 ^ (jArr2[i74] & (-((j20 >> i83) & j19)));
                                        i85++;
                                        i8 = 32;
                                        j19 = 1;
                                    }
                                    bArr10 = bArr11;
                                    i74 = i75;
                                    i54 = i80;
                                    i15 = i77;
                                    i47 = i79;
                                    i65 = i8;
                                    i64 = i76;
                                } else {
                                    i3 = i47;
                                    i4 = i54;
                                    i5 = i64;
                                    i6 = i15;
                                    byte[] bArr12 = bArr10;
                                    int i86 = 0;
                                    while (i86 < 32) {
                                        int i87 = i86 + 1;
                                        int i88 = i87;
                                        while (i88 < 64) {
                                            int i89 = i7 + i86;
                                            short s12 = sArr[i89];
                                            int i90 = i7 + i88;
                                            long j21 = ((long) (sArr[i90] ^ s12)) & (-((((long) (((short) jArr3[i86]) ^ ((short) i88))) - 1) >>> 63));
                                            sArr[i89] = (short) (((long) s12) ^ j21);
                                            sArr[i90] = (short) (j21 ^ ((long) sArr[i90]));
                                            i88++;
                                            i7 = i7;
                                            bArr12 = bArr12;
                                        }
                                        i86 = i87;
                                    }
                                    byte[] bArr13 = bArr12;
                                    int i91 = 0;
                                    while (i91 < i29) {
                                        if (z2) {
                                            for (int i92 = 0; i92 < 9; i92++) {
                                                bArr13[i92] = bArr8[i91][i66 + i92];
                                            }
                                            int i93 = 0;
                                            while (i93 < 8) {
                                                int i94 = i93 + 1;
                                                bArr13[i93] = (byte) (((bArr13[i93] & 255) >> i67) | (bArr13[i94] << (8 - i67)));
                                                i93 = i94;
                                            }
                                            bArr = bArr13;
                                            jIconCompatParcelizer = createCache.IconCompatParcelizer(0, bArr);
                                        } else {
                                            bArr = bArr13;
                                            jIconCompatParcelizer = createCache.IconCompatParcelizer(i66, bArr8[i91]);
                                        }
                                        int i95 = 0;
                                        for (int i96 = 32; i95 < i96; i96 = 32) {
                                            int i97 = (int) jArr3[i95];
                                            long j22 = ((jIconCompatParcelizer >> i95) ^ (jIconCompatParcelizer >> i97)) & 1;
                                            jIconCompatParcelizer = (j22 << i95) ^ (jIconCompatParcelizer ^ (j22 << i97));
                                            i95++;
                                        }
                                        if (z2) {
                                            FeatureFlagProvider.RemoteActionCompatParcelizer(0, jIconCompatParcelizer, bArr);
                                            byte[] bArr14 = bArr8[i91];
                                            int i98 = i66 + 8;
                                            int i99 = 8 - i67;
                                            bArr14[i98] = (byte) ((((bArr14[i98] & 255) >>> i67) << i67) | ((bArr[7] & 255) >>> i99));
                                            bArr14[i66] = (byte) ((((bArr14[i66] & 255) << i99) >>> i99) | ((bArr[0] & 255) << i67));
                                            for (int i100 = 7; i100 >= 1; i100--) {
                                                bArr8[i91][i66 + i100] = (byte) (((bArr[i100] & 255) << i67) | ((bArr[i100 - 1] & 255) >>> i99));
                                            }
                                        } else {
                                            FeatureFlagProvider.RemoteActionCompatParcelizer(i66, jIconCompatParcelizer, bArr8[i91]);
                                        }
                                        i91++;
                                        bArr13 = bArr;
                                    }
                                }
                            }
                        } else {
                            i3 = i47;
                            i4 = i54;
                            i5 = i64;
                            i6 = i15;
                            customJsonAdapter3 = customJsonAdapter4;
                        }
                        int i101 = i4 + 1;
                        int i102 = i101;
                        while (i102 < i29) {
                            byte b2 = (byte) (-((byte) (((byte) (((byte) (bArr8[i4][i50] ^ bArr8[i102][i50])) >> i5)) & 1)));
                            int i103 = i3;
                            for (int i104 = 0; i104 < i103; i104++) {
                                byte[] bArr15 = bArr8[i4];
                                bArr15[i104] = (byte) (bArr15[i104] ^ (bArr8[i102][i104] & b2));
                            }
                            i102++;
                            i3 = i103;
                        }
                        int i105 = i3;
                        byte b3 = 1;
                        if (((bArr8[i4][i50] >> i5) & 1) == 0) {
                            break;
                        }
                        int i106 = 0;
                        while (i106 < i29) {
                            int i107 = i4;
                            if (i106 != i107) {
                                byte b4 = (byte) (-((byte) (((byte) (bArr8[i106][i50] >> i5)) & b3)));
                                for (int i108 = 0; i108 < i105; i108++) {
                                    byte[] bArr16 = bArr8[i106];
                                    bArr16[i108] = (byte) (bArr16[i108] ^ (bArr8[i107][i108] & b4));
                                }
                            }
                            i106++;
                            i4 = i107;
                            b3 = 1;
                        }
                        i54 = i101;
                        i47 = i105;
                        i15 = i6;
                    }
                } else {
                    if ((jArr[i41 - 1] >> 31) == (jArr[i41] >> 31)) {
                        break;
                    }
                    i41++;
                }
            }
            OrderJsonAdapter orderJsonAdapter = new OrderJsonAdapter(bArr3);
            byte[] bArrSerializer = accessbootstrapIfNeeded.serializer(featureInfo.IconCompatParcelizer, 0, 32);
            byte[] bArrSerializer2 = accessbootstrapIfNeeded.serializer(featureInfo.IconCompatParcelizer, 32, 40);
            byte[] bArrSerializer3 = accessbootstrapIfNeeded.serializer(featureInfo.IconCompatParcelizer, 40, (((getUserFeatureFlags) featureInfo.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper * 2) + 40);
            byte[] bArr17 = featureInfo.IconCompatParcelizer;
            byte[] bArrSerializer4 = accessbootstrapIfNeeded.serializer(bArr17, (((getUserFeatureFlags) featureInfo.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper * 2) + 40, bArr17.length - 32);
            byte[] bArr18 = featureInfo.IconCompatParcelizer;
            byte[] bArrSerializer5 = accessbootstrapIfNeeded.serializer(bArr18, bArr18.length - 32, bArr18.length);
            FinancialJsonAdapter financialJsonAdapter = new FinancialJsonAdapter();
            financialJsonAdapter.MediaSessionCompatQueueItem = 0;
            financialJsonAdapter.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer);
            financialJsonAdapter.RemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer2);
            financialJsonAdapter.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer3);
            financialJsonAdapter.serializer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer4);
            financialJsonAdapter.MediaMetadataCompat = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer5);
            financialJsonAdapter.read = orderJsonAdapter;
            return new UserInfoCompanion(webViewPreloadingTypeCompanion3, financialJsonAdapter, providemoshi, null);
        }
        if (getcontact instanceof MemoryCachebootstrapInitialData1) {
            MemoryCachebootstrapInitialData1 memoryCachebootstrapInitialData1 = (MemoryCachebootstrapInitialData1) getcontact;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion4 = new WebViewPreloadingTypeCompanion(User.MediaDescriptionCompat, new UserChangedDuringChatOpenException(memoryCachebootstrapInitialData1.serializer.RemoteActionCompatParcelizer, getEvaluationsfwf_client_release.read((String) memoryCachebootstrapInitialData1.ResultReceiver)));
            byte[] bArrMediaMetadataCompat = memoryCachebootstrapInitialData1.MediaMetadataCompat();
            MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = memoryCachebootstrapInitialData1.serializer;
            int i109 = memoryCacheclearEvaluations1.MediaDescriptionCompat;
            int i110 = memoryCacheclearEvaluations1.RemoteActionCompatParcelizer;
            int iWrite = (int) hsvJlNiLsgdefault.write(4, bArrMediaMetadataCompat);
            if (hsvJlNiLsgdefault.RemoteActionCompatParcelizer(i110, iWrite)) {
                byte[] bArrRemoteActionCompatParcelizer = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat, 4, i109);
                int i111 = i109 + 4;
                byte[] bArrRemoteActionCompatParcelizer2 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat, i111, i109);
                int i112 = i111 + i109;
                byte[] bArrRemoteActionCompatParcelizer3 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat, i112, i109);
                int i113 = i112 + i109;
                byte[] bArrRemoteActionCompatParcelizer4 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat, i113, i109);
                int i114 = i113 + i109;
                byte[] bArrRemoteActionCompatParcelizer5 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat, i114, bArrMediaMetadataCompat.length - i114);
                try {
                    int i115 = ((getAccountConfigfwf_client_release) hsvJlNiLsgdefault.serializer(bArrRemoteActionCompatParcelizer5, getAccountConfigfwf_client_release.class)).write;
                    if (i115 != (1 << i110) - 1) {
                        analyticsImpl = new AnalyticsImpl(iWrite, bArrRemoteActionCompatParcelizer, bArrRemoteActionCompatParcelizer2, bArrRemoteActionCompatParcelizer3, bArrRemoteActionCompatParcelizer4, bArrRemoteActionCompatParcelizer5, i115);
                    } else {
                        analyticsImpl = new AnalyticsImpl(iWrite, bArrRemoteActionCompatParcelizer, bArrRemoteActionCompatParcelizer2, bArrRemoteActionCompatParcelizer3, bArrRemoteActionCompatParcelizer4, bArrRemoteActionCompatParcelizer5);
                    }
                    return new UserInfoCompanion(webViewPreloadingTypeCompanion4, analyticsImpl, providemoshi, null);
                } catch (ClassNotFoundException e5) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(e5.getMessage(), "cannot parse BDS: ");
                    return null;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("index out of bounds");
            return null;
        }
        if (getcontact instanceof setFeatures) {
            setFeatures setfeatures = (setFeatures) getcontact;
            getNetworkModule getnetworkmodule = User.MediaMetadataCompat;
            setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release = setfeatures.serializer;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion5 = new WebViewPreloadingTypeCompanion(getnetworkmodule, new CustomerChatNotInitializedException(setholdoutkeysfwf_client_release.read, setholdoutkeysfwf_client_release.RemoteActionCompatParcelizer, getEvaluationsfwf_client_release.read((String) setfeatures.MediaBrowserCompatMediaItem)));
            byte[] bArrMediaMetadataCompat2 = setfeatures.MediaMetadataCompat();
            setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release2 = setfeatures.serializer;
            int i116 = setholdoutkeysfwf_client_release2.IconCompatParcelizer.MediaDescriptionCompat;
            int i117 = setholdoutkeysfwf_client_release2.read;
            int i118 = (i117 + 7) / 8;
            long jWrite = (int) hsvJlNiLsgdefault.write(i118, bArrMediaMetadataCompat2);
            if (hsvJlNiLsgdefault.RemoteActionCompatParcelizer(i117, jWrite)) {
                byte[] bArrRemoteActionCompatParcelizer6 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat2, i118, i116);
                int i119 = i118 + i116;
                byte[] bArrRemoteActionCompatParcelizer7 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat2, i119, i116);
                int i120 = i119 + i116;
                byte[] bArrRemoteActionCompatParcelizer8 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat2, i120, i116);
                int i121 = i120 + i116;
                byte[] bArrRemoteActionCompatParcelizer9 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat2, i121, i116);
                int i122 = i121 + i116;
                byte[] bArrRemoteActionCompatParcelizer10 = hsvJlNiLsgdefault.RemoteActionCompatParcelizer(bArrMediaMetadataCompat2, i122, bArrMediaMetadataCompat2.length - i122);
                try {
                    long j23 = ((getCustomerProfilefwf_client_release) hsvJlNiLsgdefault.serializer(bArrRemoteActionCompatParcelizer10, getCustomerProfilefwf_client_release.class)).read;
                    if (j23 != (1 << i117) - 1) {
                        updateuserpropertiestodatastore = new updateUserPropertiesToDataStore(jWrite, bArrRemoteActionCompatParcelizer6, bArrRemoteActionCompatParcelizer7, bArrRemoteActionCompatParcelizer8, bArrRemoteActionCompatParcelizer9, bArrRemoteActionCompatParcelizer10, j23);
                    } else {
                        updateuserpropertiestodatastore = new updateUserPropertiesToDataStore(jWrite, bArrRemoteActionCompatParcelizer6, bArrRemoteActionCompatParcelizer7, bArrRemoteActionCompatParcelizer8, bArrRemoteActionCompatParcelizer9, bArrRemoteActionCompatParcelizer10);
                    }
                    return new UserInfoCompanion(webViewPreloadingTypeCompanion5, updateuserpropertiestodatastore, providemoshi, null);
                } catch (ClassNotFoundException e6) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(e6.getMessage(), "cannot parse BDSStateMap: ");
                    return null;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("index out of bounds");
            return null;
        }
        int i123 = 8;
        if (getcontact instanceof createDriverfwf_client_release) {
            createDriverfwf_client_release createdriverfwf_client_release = (createDriverfwf_client_release) getcontact;
            int i124 = createdriverfwf_client_release.MediaSessionCompatQueueItem;
            int i125 = createdriverfwf_client_release.write;
            C0184logger c0184logger = createdriverfwf_client_release.RemoteActionCompatParcelizer;
            accesscreateCache accesscreatecache = createdriverfwf_client_release.IconCompatParcelizer;
            httpClient httpclient = createdriverfwf_client_release.MediaDescriptionCompat;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanionWrite = getEvaluationsfwf_client_release.write((String) createdriverfwf_client_release.serializer);
            BlankChannelIDException blankChannelIDException = new BlankChannelIDException();
            blankChannelIDException.MediaDescriptionCompat = i124;
            blankChannelIDException.serializer = i125;
            int i126 = c0184logger.write;
            blankChannelIDException.write = new byte[]{(byte) i126, (byte) (i126 >>> 8), (byte) (i126 >>> 16), (byte) (i126 >>> 24)};
            int i127 = 1;
            while (accesscreatecache.read.IconCompatParcelizer > i123) {
                i127++;
                i123 += 8;
            }
            byte[] bArr19 = new byte[accesscreatecache.IconCompatParcelizer.length * i127];
            int i128 = 0;
            for (int i129 = 0; i129 < accesscreatecache.IconCompatParcelizer.length; i129++) {
                int i130 = 0;
                while (i130 < i123) {
                    bArr19[i128] = (byte) (accesscreatecache.IconCompatParcelizer[i129] >>> i130);
                    i130 += 8;
                    i128++;
                }
            }
            blankChannelIDException.IconCompatParcelizer = bArr19;
            int[] iArr2 = httpclient.serializer;
            int length = iArr2.length;
            int i131 = length - 1;
            int i132 = FwFCacheSQLsetAll11.RemoteActionCompatParcelizer;
            if (i131 == 0) {
                i = 1;
            } else {
                if (i131 < 0) {
                    i131 = -i131;
                }
                i = 0;
                while (i131 > 0) {
                    i++;
                    i131 >>>= 8;
                }
            }
            byte[] bArr20 = new byte[(length * i) + 4];
            composeColorSpace.serializer(bArr20, length, 0);
            for (int i133 = 0; i133 < length; i133++) {
                int i134 = iArr2[i133];
                for (int i135 = i - 1; i135 >= 0; i135--) {
                    bArr20[(i133 * i) + 4 + i135] = (byte) (i134 >>> (i135 * 8));
                }
            }
            blankChannelIDException.read = bArr20;
            blankChannelIDException.RemoteActionCompatParcelizer = webViewPreloadingTypeCompanionWrite;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion(User.IconCompatParcelizer), blankChannelIDException, null, null);
        }
        if (getcontact instanceof FwFDataQueriesSelectItemQuery) {
            FwFDataQueriesSelectItemQuery fwFDataQueriesSelectItemQuery = (FwFDataQueriesSelectItemQuery) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.ComponentActivity.get((deleteItem) fwFDataQueriesSelectItemQuery.RemoteActionCompatParcelizer)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fwFDataQueriesSelectItemQuery.serializer), 0), providemoshi, null);
        }
        if (getcontact instanceof setFeatureWithLock) {
            setFeatureWithLock setfeaturewithlock = (setFeatureWithLock) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.accessensureViewModelStore.get((getHoldoutsWithLock) setfeaturewithlock.serializer)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(setfeaturewithlock.write), 0), providemoshi, null);
        }
        if (getcontact instanceof accessmigrateHoldoutKeys) {
            accessmigrateHoldoutKeys accessmigrateholdoutkeys = (accessmigrateHoldoutKeys) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.get((accessgetMetricProviderp) accessmigrateholdoutkeys.MediaBrowserCompatMediaItem)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessmigrateholdoutkeys.serializer), 0), providemoshi, null);
        }
        if (getcontact instanceof insertItem) {
            insertItem insertitem = (insertItem) getcontact;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion6 = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.PlaybackStateCompat.get((selectItem) insertitem.serializer));
            Screen screen = new Screen(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(insertitem.MediaMetadataCompat));
            byte[] bArrRemoteActionCompatParcelizer11 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(insertitem.write);
            byte[] bArrRemoteActionCompatParcelizer12 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(insertitem.RemoteActionCompatParcelizer);
            byte[] bArrRemoteActionCompatParcelizer13 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(insertitem.IconCompatParcelizer);
            Product product = new Product();
            product.RemoteActionCompatParcelizer = 0;
            product.write = bArrRemoteActionCompatParcelizer11;
            product.serializer = bArrRemoteActionCompatParcelizer12;
            product.IconCompatParcelizer = bArrRemoteActionCompatParcelizer13;
            product.read = screen;
            return new UserInfoCompanion(webViewPreloadingTypeCompanion6, product, providemoshi, null);
        }
        if (getcontact instanceof FwFCacheItem) {
            FwFCacheItem fwFCacheItem = (FwFCacheItem) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get((accessgetHelpcenterRegionConfig) fwFCacheItem.MediaBrowserCompatMediaItem)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(new byte[][]{fwFCacheItem.IconCompatParcelizer, fwFCacheItem.MediaMetadataCompat, fwFCacheItem.serializer, fwFCacheItem.write, fwFCacheItem.RemoteActionCompatParcelizer}), 0), providemoshi, null);
        }
        if (getcontact instanceof accessgetSerializerp) {
            accessgetSerializerp accessgetserializerp = (accessgetSerializerp) getcontact;
            extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
            extracttokenfromheader.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessgetserializerp.write), 0));
            extracttokenfromheader.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessgetserializerp.RemoteActionCompatParcelizer), 0));
            extracttokenfromheader.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessgetserializerp.MediaMetadataCompat), 0));
            extracttokenfromheader.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessgetserializerp.IconCompatParcelizer), 0));
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion7 = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.get((accessgetStoragep) accessgetserializerp.serializer));
            DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
            deliveryInfoCompanion.serializer = -1;
            return new UserInfoCompanion(webViewPreloadingTypeCompanion7, deliveryInfoCompanion, providemoshi, null);
        }
        if (getcontact instanceof accesssetFeatureWithLock) {
            accesssetFeatureWithLock accesssetfeaturewithlock = (accesssetFeatureWithLock) getcontact;
            extractTokenFromHeader extracttokenfromheader2 = new extractTokenFromHeader();
            extracttokenfromheader2.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accesssetfeaturewithlock.serializer), 0));
            extracttokenfromheader2.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accesssetfeaturewithlock.IconCompatParcelizer), 0));
            extracttokenfromheader2.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accesssetfeaturewithlock.MediaMetadataCompat), 0));
            extracttokenfromheader2.write(new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accesssetfeaturewithlock.RatingCompat), 0));
            extracttokenfromheader2.write(new UrlBuilderKt(accesssetfeaturewithlock.IconCompatParcelizer(), 0));
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release._init_lambda1.get(accesssetfeaturewithlock.write())), new DeliveryInfoCompanion(extracttokenfromheader2, 1), providemoshi);
        }
        if (getcontact instanceof FwFDataQueries) {
            FwFDataQueries fwFDataQueries = (FwFDataQueries) getcontact;
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion8 = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.MediaSessionCompatToken.get(fwFDataQueries.serializer()));
            ChatService chatServiceWrite = fwFDataQueries.write();
            return new UserInfoCompanion(webViewPreloadingTypeCompanion8, new UrlBuilderKt(fwFDataQueries.IconCompatParcelizer()), providemoshi, accessbootstrapIfNeeded.read(chatServiceWrite.RemoteActionCompatParcelizer, chatServiceWrite.write));
        }
        if (getcontact instanceof FWFRequestJsonAdapter) {
            FWFRequestJsonAdapter fWFRequestJsonAdapter = (FWFRequestJsonAdapter) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.MediaSessionCompatQueueItem.get(fWFRequestJsonAdapter.read())), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fWFRequestJsonAdapter.RemoteActionCompatParcelizer, fWFRequestJsonAdapter.write, fWFRequestJsonAdapter.IconCompatParcelizer)), providemoshi);
        }
        if (getcontact instanceof FwFDataQueriesSelectItemQueryexecute1) {
            FwFDataQueriesSelectItemQueryexecute1 fwFDataQueriesSelectItemQueryexecute1 = (FwFDataQueriesSelectItemQueryexecute1) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.get(fwFDataQueriesSelectItemQueryexecute1.write())), new UrlBuilderKt(fwFDataQueriesSelectItemQueryexecute1.serializer()), providemoshi);
        }
        if (getcontact instanceof getFromStorage) {
            getFromStorage getfromstorage = (getFromStorage) getcontact;
            return new UserInfoCompanion(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.get(getfromstorage.RemoteActionCompatParcelizer())), new UrlBuilderKt(getfromstorage.read()), providemoshi);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("key parameters not recognized");
        return null;
    }

    public static void write(Context context, Extras$Key extras$Key) {
        if (read(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            extras$Key.IconCompatParcelizer(14, (Object) null);
        } else {
            extras$Key.IconCompatParcelizer(15, (Object) null);
        }
    }

    public static boolean read(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = read(file2) && z;
        }
        return z;
    }
}
