package com.roadrunner.rider.state.searchshifts.presentation;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.searchshifts.api.presentation.SearchShiftsWithBonusUiModel;
import com.roadrunner.rider.state.searchshifts.presentation.SearchShiftsWithBonusKt;
import com.roadrunner.settings.SettingsFragment;
import o.AndroidContentCaptureManager;
import o.accessisMainThread;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPayloadFromSystemPropertyReflection;
import o.getPayloadsFromContentProviderIntentAction;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.getQueryContext;
import o.hasAllLocationsBeenRead;
import o.onHideTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.readContentProviderIntentAction;
import o.registerInAppMessageManagerlambda0;
import o.xb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchShiftsWithBonusKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:80:0x0122  */
    public static final void SearchShiftsWithBonus(final SearchShiftsWithBonusUiModel searchShiftsWithBonusUiModel, final xb xbVar, final accessisMainThread accessismainthread, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        boolean z2;
        boolean z3;
        Modifier.Companion companion;
        boolean z4;
        int i3;
        int i4;
        int i5 = 2 % 2;
        searchShiftsWithBonusUiModel.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1462899598);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode.read(searchShiftsWithBonusUiModel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.read(searchShiftsWithBonusUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(xbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(accessismainthread) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i7 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            int i9 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i11 = IconCompatParcelizer + 119;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        int i13 = i2 | 805306368;
        if ((306783379 & i13) != 306783378) {
            int i14 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i13 & 1, z)) {
            Modifier.Companion companion2 = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.read(0);
                getpostalcode.write(objComponentActivity);
            }
            final getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity;
            SearchShiftsWithBonusUiModelImpl searchShiftsWithBonusUiModelImpl = (SearchShiftsWithBonusUiModelImpl) searchShiftsWithBonusUiModel;
            getQueryContext getquerycontext = searchShiftsWithBonusUiModelImpl.write;
            boolean z5 = (i13 & 7168) == 2048;
            if ((458752 & i13) == 131072) {
                int i15 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = (57344 & i13) == 16384;
            if ((29360128 & i13) == 8388608) {
                int i17 = RemoteActionCompatParcelizer + 15;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = (234881024 & i13) == 67108864;
            boolean z8 = (3670016 & i13) == 1048576;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z5 | z2 | z6 | z3 | z7 | z8) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.PurchaseVerificationHandler3
                    private static int MediaDescriptionCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        int i19;
                        int i20 = 2 % 2;
                        PackageHandler7 packageHandler7 = (PackageHandler7) obj2;
                        packageHandler7.getClass();
                        if (packageHandler7 instanceof getPayloadFromSystemPropertyFilePathReflection) {
                            int i21 = MediaDescriptionCompat + 115;
                            MediaSessionCompatQueueItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                        } else {
                            if (!(!(packageHandler7 instanceof getPayloadFromContentProviderDefault))) {
                                getPayloadFromContentProviderDefault getpayloadfromcontentproviderdefault = (getPayloadFromContentProviderDefault) packageHandler7;
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(getpayloadfromcontentproviderdefault.write()), getpayloadfromcontentproviderdefault.IconCompatParcelizer());
                                i19 = MediaSessionCompatQueueItem + 73;
                                MediaDescriptionCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            } else if (packageHandler7 instanceof getPayloadsFromContentProviderNoPermission) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((getPayloadsFromContentProviderNoPermission) packageHandler7).RemoteActionCompatParcelizer());
                                i19 = MediaDescriptionCompat + 9;
                                MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            } else if (packageHandler7 instanceof getPayloadFromSystemPropertyFilePath) {
                                int i23 = MediaDescriptionCompat + 99;
                                MediaSessionCompatQueueItem = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(((getPayloadFromSystemPropertyFilePath) packageHandler7).IconCompatParcelizer());
                            } else {
                                if (!(packageHandler7 instanceof getPayloadFromFileSystem)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    int i25 = MediaDescriptionCompat + 43;
                                    MediaSessionCompatQueueItem = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i26 = i25 % 2;
                                    return null;
                                }
                                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                                getPayloadFromFileSystem getpayloadfromfilesystem = (getPayloadFromFileSystem) packageHandler7;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(getpayloadfromfilesystem.serializer(), getpayloadfromfilesystem.write(), 0);
                                onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
                                onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
                            }
                            int i27 = i19 % 2;
                        }
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            getPayloadFromSystemPropertyReflection getpayloadfromsystempropertyreflection = (getPayloadFromSystemPropertyReflection) ExtrasKt.write(searchShiftsWithBonusUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode, 0).getValue();
            if (getpayloadfromsystempropertyreflection instanceof getPayloadsFromContentProviderIntentAction) {
                getpostalcode.serializer(1392250892);
                getPayloadsFromContentProviderIntentAction getpayloadsfromcontentproviderintentaction = (getPayloadsFromContentProviderIntentAction) getpayloadfromsystempropertyreflection;
                boolean z9 = (i13 & 14) == 4;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z9 || objComponentActivity3 == androidContentCaptureManager) {
                    RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, searchShiftsWithBonusUiModel, SearchShiftsWithBonusUiModel.class, "onSearchShiftsClicked", "onSearchShiftsClicked()V", 0, 17);
                    getpostalcode.write(roomDatabase$closeBarrier$1);
                    objComponentActivity3 = roomDatabase$closeBarrier$1;
                }
                companion = companion2;
                SearchShiftsNoZoneSelectedKt.SearchShiftsNoZoneSelected(getpayloadsfromcontentproviderintentaction, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), companion, getpostalcode, (i13 >> 21) & 896);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                companion = companion2;
                if (getpayloadfromsystempropertyreflection instanceof readContentProviderIntentAction) {
                    getpostalcode.serializer(1392256722);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (!(getpayloadfromsystempropertyreflection instanceof hasAllLocationsBeenRead)) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1392248159, false);
                    }
                    getpostalcode.serializer(210331149);
                    hasAllLocationsBeenRead hasalllocationsbeenread = (hasAllLocationsBeenRead) getpayloadfromsystempropertyreflection;
                    int i19 = i13 & 14;
                    if (i19 == 4) {
                        int i20 = IconCompatParcelizer + 107;
                        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (!(!z4) || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new SettingsFragment.AnonymousClass1(searchShiftsWithBonusUiModel);
                        getpostalcode.write(objComponentActivity4);
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity4;
                    boolean z10 = i19 == 4;
                    Object objComponentActivity5 = getpostalcode.ComponentActivity();
                    if (z10 || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new RoomDatabase$createConnectionManager$2(searchShiftsWithBonusUiModel, 27);
                        getpostalcode.write(objComponentActivity5);
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity5;
                    boolean z11 = i19 == 4;
                    Object objComponentActivity6 = getpostalcode.ComponentActivity();
                    if (z11 || objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new RoomDatabase$createConnectionManager$2(searchShiftsWithBonusUiModel, 28);
                        getpostalcode.write(objComponentActivity6);
                    }
                    SearchShiftsSelectedZoneKt.SearchShiftsSelectedZone(hasalllocationsbeenread, xbVar, accessismainthread, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) registerinappmessagemanagerlambda1, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda0, null, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity6), ((onHideTranslationui) getplatformandroidmanager).serializer(), getpostalcode, i13 & 1008);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.PurchaseVerificationHandler2
                private static int MediaSessionCompatToken = 1;
                private static int ParcelableVolumeInfo;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i22 = 2 % 2;
                    int i23 = ParcelableVolumeInfo + 45;
                    MediaSessionCompatToken = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    SearchShiftsWithBonusKt.SearchShiftsWithBonus(searchShiftsWithBonusUiModel, xbVar, accessismainthread, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i25 = MediaSessionCompatToken + 87;
                    ParcelableVolumeInfo = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    return createfromparcel;
                }
            };
        }
        int i22 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
    }
}
