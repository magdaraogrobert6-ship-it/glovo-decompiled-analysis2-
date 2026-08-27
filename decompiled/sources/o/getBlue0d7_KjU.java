package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ranges.RangesKt;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBlue0d7_KjU {
    public static CustomerChatModule write(getContact getcontact) throws IOException {
        if (getcontact instanceof CommonDomain) {
            CommonDomain commonDomain = (CommonDomain) getcontact;
            return new CustomerChatModule(getEvaluationsfwf_client_release.RemoteActionCompatParcelizer(commonDomain.serializer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(commonDomain.RemoteActionCompatParcelizer));
        }
        if (getcontact instanceof setInitialDataFeatures) {
            setInitialDataFeatures setinitialdatafeatures = (setInitialDataFeatures) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion(User.RatingCompat, new CryptoManagerImpl(getEvaluationsfwf_client_release.IconCompatParcelizer((String) setinitialdatafeatures.RemoteActionCompatParcelizer))), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(setinitialdatafeatures.IconCompatParcelizer));
        }
        if (getcontact instanceof accessgetFeaturesWithLock) {
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion(User.serializer), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(((accessgetFeaturesWithLock) getcontact).serializer));
        }
        int i = 1;
        if (getcontact instanceof FwFDataQueriesselectItem2) {
            FwFDataQueriesselectItem2 fwFDataQueriesselectItem2 = (FwFDataQueriesselectItem2) getcontact;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(fwFDataQueriesselectItem2.MediaMetadataCompat());
                return new CustomerChatModule(new WebViewPreloadingTypeCompanion(PhoneCallTypeNormal.RemoteActionCompatParcelizer), new UrlBuilderKt(byteArrayOutputStream.toByteArray(), 0));
            } catch (Exception e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), e);
                return null;
            }
        }
        if (getcontact instanceof FwFDataQueriesdeleteItem2) {
            FwFDataQueriesdeleteItem2 fwFDataQueriesdeleteItem2 = (FwFDataQueriesdeleteItem2) getcontact;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i2 = fwFDataQueriesdeleteItem2.serializer;
            byteArrayOutputStream2.write((byte) (i2 >>> 24));
            byteArrayOutputStream2.write((byte) (i2 >>> 16));
            byteArrayOutputStream2.write((byte) (i2 >>> 8));
            byteArrayOutputStream2.write((byte) i2);
            try {
                byteArrayOutputStream2.write(fwFDataQueriesdeleteItem2.RemoteActionCompatParcelizer.MediaMetadataCompat());
                return new CustomerChatModule(new WebViewPreloadingTypeCompanion(PhoneCallTypeNormal.RemoteActionCompatParcelizer), new UrlBuilderKt(byteArrayOutputStream2.toByteArray(), 0));
            } catch (Exception e2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e2.getMessage(), e2);
                return null;
            }
        }
        if (getcontact instanceof setRuntimeFeatureKeys) {
            setRuntimeFeatureKeys setruntimefeaturekeys = (setRuntimeFeatureKeys) getcontact;
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = setruntimefeaturekeys.RemoteActionCompatParcelizer;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.ensureViewModelStore.get((bootstrapInitialDatafwf_client_release) setruntimefeaturekeys.serializer)), accessbootstrapIfNeeded.read((byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.write, (byte[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer));
        }
        if (getcontact instanceof accessfetchUserFeatureFlags) {
            accessfetchUserFeatureFlags accessfetchuserfeatureflags = (accessfetchUserFeatureFlags) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get((getUserFeatureFlags) accessfetchuserfeatureflags.RemoteActionCompatParcelizer)), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessfetchuserfeatureflags.serializer));
        }
        if (getcontact instanceof MemoryCachedecodeHoldouts11) {
            MemoryCachedecodeHoldouts11 memoryCachedecodeHoldouts11 = (MemoryCachedecodeHoldouts11) getcontact;
            byte[] bArrWrite = hsvJlNiLsgdefault.write(memoryCachedecodeHoldouts11.RemoteActionCompatParcelizer);
            byte[] bArrWrite2 = hsvJlNiLsgdefault.write(memoryCachedecodeHoldouts11.IconCompatParcelizer);
            byte[] bArrMediaMetadataCompat = memoryCachedecodeHoldouts11.MediaMetadataCompat();
            return bArrMediaMetadataCompat.length > bArrWrite.length + bArrWrite2.length ? new CustomerChatModule(new WebViewPreloadingTypeCompanion(getRefundValue.write), new UrlBuilderKt(bArrMediaMetadataCompat, 0)) : new CustomerChatModule(new WebViewPreloadingTypeCompanion(User.MediaDescriptionCompat, new UserChangedDuringChatOpenException(memoryCachedecodeHoldouts11.serializer.RemoteActionCompatParcelizer, getEvaluationsfwf_client_release.read((String) memoryCachedecodeHoldouts11.ResultReceiver))), new UserPropertiesDataStoreHelperImpl(bArrWrite, bArrWrite2));
        }
        if (getcontact instanceof setProfileAttributesfwf_client_release) {
            setProfileAttributesfwf_client_release setprofileattributesfwf_client_release = (setProfileAttributesfwf_client_release) getcontact;
            byte[] bArr = setprofileattributesfwf_client_release.write;
            byte[] bArr2 = setprofileattributesfwf_client_release.RemoteActionCompatParcelizer;
            byte[] bArrWrite3 = hsvJlNiLsgdefault.write(bArr2);
            byte[] bArrWrite4 = hsvJlNiLsgdefault.write(bArr);
            byte[] bArrRemoteActionCompatParcelizer = setprofileattributesfwf_client_release.RemoteActionCompatParcelizer();
            if (bArrRemoteActionCompatParcelizer.length > bArrWrite3.length + bArrWrite4.length) {
                return new CustomerChatModule(new WebViewPreloadingTypeCompanion(getRefundValue.serializer), new UrlBuilderKt(bArrRemoteActionCompatParcelizer, 0));
            }
            getNetworkModule getnetworkmodule = User.MediaMetadataCompat;
            setHoldoutKeysfwf_client_release setholdoutkeysfwf_client_release = setprofileattributesfwf_client_release.IconCompatParcelizer;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion(getnetworkmodule, new CustomerChatNotInitializedException(setholdoutkeysfwf_client_release.read, setholdoutkeysfwf_client_release.RemoteActionCompatParcelizer, getEvaluationsfwf_client_release.read((String) setprofileattributesfwf_client_release.MediaBrowserCompatMediaItem))), new UserPropertiesSerializer(hsvJlNiLsgdefault.write(bArr2), hsvJlNiLsgdefault.write(bArr)));
        }
        if (getcontact instanceof FwFCacheDriverFactoryKt) {
            FwFCacheDriverFactoryKt fwFCacheDriverFactoryKt = (FwFCacheDriverFactoryKt) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion(User.IconCompatParcelizer), new ScreenJsonAdapter(fwFCacheDriverFactoryKt.RemoteActionCompatParcelizer, fwFCacheDriverFactoryKt.IconCompatParcelizer, fwFCacheDriverFactoryKt.write, getEvaluationsfwf_client_release.write((String) fwFCacheDriverFactoryKt.serializer)));
        }
        if (getcontact instanceof FwFDataQueriesSelectItemsQueryexecute1) {
            FwFDataQueriesSelectItemsQueryexecute1 fwFDataQueriesSelectItemsQueryexecute1 = (FwFDataQueriesSelectItemsQueryexecute1) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.ComponentActivity.get((deleteItem) fwFDataQueriesSelectItemsQueryexecute1.RemoteActionCompatParcelizer)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fwFDataQueriesSelectItemsQueryexecute1.IconCompatParcelizer), 0));
        }
        if (getcontact instanceof setInitialDataProfileAttributes) {
            setInitialDataProfileAttributes setinitialdataprofileattributes = (setInitialDataProfileAttributes) getcontact;
            byte[] bArrRemoteActionCompatParcelizer2 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(setinitialdataprofileattributes.RemoteActionCompatParcelizer);
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.accessensureViewModelStore.get((getHoldoutsWithLock) setinitialdataprofileattributes.serializer));
            DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(new UrlBuilderKt(bArrRemoteActionCompatParcelizer2, 0), i);
            deliveryInfoCompanion.serializer = -1;
            return new CustomerChatModule(webViewPreloadingTypeCompanion, deliveryInfoCompanion);
        }
        if (getcontact instanceof getFeaturesdefault) {
            getFeaturesdefault getfeaturesdefault = (getFeaturesdefault) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.get((decodeFeatures) getfeaturesdefault.serializer)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(getfeaturesdefault.IconCompatParcelizer), 0));
        }
        if (getcontact instanceof accessgetHoldoutsWithLock) {
            accessgetHoldoutsWithLock accessgetholdoutswithlock = (accessgetHoldoutsWithLock) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.get((accessgetMetricProviderp) accessgetholdoutswithlock.MediaBrowserCompatMediaItem)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accessgetholdoutswithlock.serializer), 0));
        }
        if (getcontact instanceof accesscreateArguments) {
            accesscreateArguments accesscreatearguments = (accesscreateArguments) getcontact;
            selectItem selectitem = (selectItem) accesscreatearguments.serializer;
            byte[] bArrRemoteActionCompatParcelizer3 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accesscreatearguments.IconCompatParcelizer);
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion2 = new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.PlaybackStateCompat.get(selectitem));
            byte[] bArr3 = new byte[bArrRemoteActionCompatParcelizer3.length + 1];
            bArr3[0] = (byte) selectitem.RemoteActionCompatParcelizer;
            System.arraycopy(bArrRemoteActionCompatParcelizer3, 0, bArr3, 1, bArrRemoteActionCompatParcelizer3.length);
            return new CustomerChatModule(webViewPreloadingTypeCompanion2, bArr3);
        }
        if (getcontact instanceof accessgetDriver) {
            accessgetDriver accessgetdriver = (accessgetDriver) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get((accessgetHelpcenterRegionConfig) accessgetdriver.MediaBrowserCompatMediaItem)), accessbootstrapIfNeeded.read(accessgetdriver.write, accessgetdriver.RemoteActionCompatParcelizer));
        }
        if (getcontact instanceof accesssetInitialDataFeatures) {
            accesssetInitialDataFeatures accesssetinitialdatafeatures = (accesssetInitialDataFeatures) getcontact;
            accessgetStoragep accessgetstoragep = (accessgetStoragep) accesssetinitialdatafeatures.serializer;
            byte[] bArr4 = new byte[accessgetstoragep.MediaSessionCompatQueueItem];
            byte[] bArr5 = accesssetinitialdatafeatures.RemoteActionCompatParcelizer;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            byte[] bArr6 = accesssetinitialdatafeatures.write;
            System.arraycopy(bArr6, 0, bArr4, bArr5.length, bArr6.length);
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.get(accessgetstoragep)), new UrlBuilderKt(bArr4, 0));
        }
        if (getcontact instanceof accesssetInitialDataProfileAttributes) {
            accesssetInitialDataProfileAttributes accesssetinitialdataprofileattributes = (accesssetInitialDataProfileAttributes) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release._init_lambda1.get((accesssetInitialDataHoldouts) accesssetinitialdataprofileattributes.RemoteActionCompatParcelizer)), new UrlBuilderKt(accessbootstrapIfNeeded.RemoteActionCompatParcelizer(accesssetinitialdataprofileattributes.serializer), 0));
        }
        if (getcontact instanceof ChatService) {
            ChatService chatService = (ChatService) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.MediaSessionCompatToken.get((getStructure) chatService.ResultReceiver)), accessbootstrapIfNeeded.read(chatService.RemoteActionCompatParcelizer, chatService.write));
        }
        if (getcontact instanceof UserPropertiesCompanion) {
            UserPropertiesCompanion userPropertiesCompanion = (UserPropertiesCompanion) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.MediaSessionCompatQueueItem.get((Custom) userPropertiesCompanion.serializer)), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(userPropertiesCompanion.write));
        }
        if (getcontact instanceof FwFDataQueriesselectItem1) {
            FwFDataQueriesselectItem1 fwFDataQueriesselectItem1 = (FwFDataQueriesselectItem1) getcontact;
            return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.get((selectItems) fwFDataQueriesselectItem1.serializer)), accessbootstrapIfNeeded.RemoteActionCompatParcelizer(fwFDataQueriesselectItem1.IconCompatParcelizer));
        }
        if (!(getcontact instanceof getFeaturesWithLock)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("key parameters not recognized");
            return null;
        }
        getFeaturesWithLock getfeatureswithlock = (getFeaturesWithLock) getcontact;
        getRuntimeFeatureKeys getruntimefeaturekeys = (getRuntimeFeatureKeys) getfeatureswithlock.ResultReceiver;
        return new CustomerChatModule(new WebViewPreloadingTypeCompanion((getNetworkModule) getEvaluationsfwf_client_release.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.get(getruntimefeaturekeys)), new UrlBuilderKt(getruntimefeaturekeys.MediaSessionCompatToken != getFeaturesUpdateTime.CLASSIC ? accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(getfeatureswithlock.MediaBrowserCompatMediaItem, r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(getfeatureswithlock.IconCompatParcelizer, false)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(getfeatureswithlock.write, true)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(getfeatureswithlock.serializer, false)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(getfeatureswithlock.RemoteActionCompatParcelizer, true)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(getfeatureswithlock.RatingCompat, true)) : r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(getfeatureswithlock.MediaMetadataCompat, true), 0));
    }

    public static getUnspecified0d7_KjUannotations write(tintxETnrds tintxetnrds, String str) {
        Map mapIconCompatParcelizer;
        CaptionedImageContentCardView captionedImageContentCardView;
        tintxetnrds.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (!uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                mapIconCompatParcelizer = SimpleItemTouchHelperCallback.serializer;
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            } else {
                int i = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "name");
                int i2 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "type");
                int i3 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "notnull");
                int i4 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "pk");
                int i5 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer, "dflt_value");
                safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
                while (true) {
                    String str2 = uncheckedColordefaultRemoteActionCompatParcelizer.read(i);
                    safesetcliptooutline.put(str2, new getBlack0d7_KjU(str2, uncheckedColordefaultRemoteActionCompatParcelizer.read(i2), uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i3) != j, (int) uncheckedColordefaultRemoteActionCompatParcelizer.serializer(i4), uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(i5) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(i5), 2));
                    if (!uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        break;
                    }
                    j = 0;
                }
                mapIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            }
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds.RemoteActionCompatParcelizer("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int i6 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer2, "id");
                int i7 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer2, "seq");
                int i8 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer2, "table");
                int i9 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer2, "on_delete");
                int i10 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer2, "on_update");
                List listSerializer = hslJlNiLsgdefault.serializer(uncheckedColordefaultRemoteActionCompatParcelizer2);
                uncheckedColordefaultRemoteActionCompatParcelizer2.write();
                CaptionedImageContentCardView captionedImageContentCardView2 = new CaptionedImageContentCardView();
                while (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                    if (uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i7) == 0) {
                        int iSerializer = (int) uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(i6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = i6;
                        ArrayList<getYellow0d7_KjUannotations> arrayList3 = new ArrayList();
                        for (Object obj : listSerializer) {
                            int i12 = i7;
                            List list = listSerializer;
                            if (((getYellow0d7_KjUannotations) obj).RemoteActionCompatParcelizer == iSerializer) {
                                arrayList3.add(obj);
                            }
                            i7 = i12;
                            listSerializer = list;
                        }
                        int i13 = i7;
                        List list2 = listSerializer;
                        for (getYellow0d7_KjUannotations getyellow0d7_kjuannotations : arrayList3) {
                            arrayList.add(getyellow0d7_kjuannotations.serializer);
                            arrayList2.add(getyellow0d7_kjuannotations.write);
                        }
                        captionedImageContentCardView2.add(new hsvToRgbComponent(uncheckedColordefaultRemoteActionCompatParcelizer2.read(i8), uncheckedColordefaultRemoteActionCompatParcelizer2.read(i9), arrayList, uncheckedColordefaultRemoteActionCompatParcelizer2.read(i10), arrayList2));
                        i6 = i11;
                        i7 = i13;
                        listSerializer = list2;
                    }
                }
                CaptionedImageContentCardView captionedImageContentCardViewIconCompatParcelizer = RangesKt.IconCompatParcelizer(captionedImageContentCardView2);
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2, null);
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer3 = tintxetnrds.RemoteActionCompatParcelizer("PRAGMA index_list(`" + str + "`)");
                try {
                    int i14 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer3, "name");
                    int i15 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer3, "origin");
                    int i16 = coil3.util.UtilsKt.read(uncheckedColordefaultRemoteActionCompatParcelizer3, "unique");
                    if (i14 != -1 && i15 != -1 && i16 != -1) {
                        CaptionedImageContentCardView captionedImageContentCardView3 = new CaptionedImageContentCardView();
                        while (uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer()) {
                            if ("c".equals(uncheckedColordefaultRemoteActionCompatParcelizer3.read(i15))) {
                                hslToRgbComponent hsltorgbcomponent = hslJlNiLsgdefault.read(tintxetnrds, uncheckedColordefaultRemoteActionCompatParcelizer3.read(i14), uncheckedColordefaultRemoteActionCompatParcelizer3.serializer(i16) == 1);
                                if (hsltorgbcomponent == null) {
                                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer3, null);
                                    captionedImageContentCardView = null;
                                } else {
                                    captionedImageContentCardView3.add(hsltorgbcomponent);
                                }
                            }
                        }
                        CaptionedImageContentCardView captionedImageContentCardViewIconCompatParcelizer2 = RangesKt.IconCompatParcelizer(captionedImageContentCardView3);
                        Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer3, null);
                        captionedImageContentCardView = captionedImageContentCardViewIconCompatParcelizer2;
                    } else {
                        Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer3, null);
                        captionedImageContentCardView = null;
                    }
                    return new getUnspecified0d7_KjUannotations(str, mapIconCompatParcelizer, captionedImageContentCardViewIconCompatParcelizer, captionedImageContentCardView);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th5);
                throw th6;
            }
        }
    }
}
