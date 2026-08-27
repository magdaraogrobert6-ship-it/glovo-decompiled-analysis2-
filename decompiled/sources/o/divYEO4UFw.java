package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$OverlayInstruction$Config$Trim;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Instruction$Config$Trim;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class divYEO4UFw {
    private static int read = 0;
    private static int write = 1;
    public final getCenterozmzZPIannotations IconCompatParcelizer;
    public final AndroidUiFrameClock serializer;

    public divYEO4UFw(getCenterozmzZPIannotations getcenterozmzzpiannotations, AndroidUiFrameClock androidUiFrameClock) {
        getcenterozmzzpiannotations.getClass();
        androidUiFrameClock.getClass();
        this.IconCompatParcelizer = getcenterozmzzpiannotations;
        this.serializer = androidUiFrameClock;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3 A[PHI: r8
  0x00a3: PHI (r8v8 java.lang.Integer) = (r8v7 java.lang.Integer), (r8v10 java.lang.Integer) binds: [B:22:0x00a1, B:19:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    public final accessgetLOREM_IPSUM_SOURCEp serializer(matchFontRetOiIg matchfontretoiig) {
        ArrayList arrayList;
        int iIntValue;
        List listSerializer;
        ArrayList arrayList2;
        backgroundColor getwear_os_small_roundannotations;
        int iIntValue2;
        OverlayItems$Instruction$Config$Trim overlayItems$Instruction$Config$Trim;
        Integer numIconCompatParcelizer;
        int i = 2 % 2;
        filterByClosestWeightui_text filterbyclosestweightui_text = (filterByClosestWeightui_text) matchFontRetOiIg.read(df.IconCompatParcelizer(), new Object[]{matchfontretoiig}, df.IconCompatParcelizer(), df.IconCompatParcelizer(), df.IconCompatParcelizer(), 1123064907, -1123064907);
        getItalic_LCdwA getitalic_lcdwaMediaDescriptionCompat = matchfontretoiig.MediaDescriptionCompat();
        if (getitalic_lcdwaMediaDescriptionCompat != null) {
            if (((FirebaseRemoteConfigImpl) this.IconCompatParcelizer.IconCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.TAKE_PICTURE_TASK_NEW_CAMERA_OVERLAY_KILL_SWITCH_ENABLED.getFirebaseFlagName())) {
                Timber.RemoteActionCompatParcelizer.read(new IllegalStateException("TakePictureTask: isCameraOverlayEnabled Feature flag is disabled."));
                arrayList2 = null;
            } else {
                List list = getitalic_lcdwaMediaDescriptionCompat.read();
                arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (!(!it.hasNext())) {
                    FontFamilyResolverKt fontFamilyResolverKt = (FontFamilyResolverKt) it.next();
                    if (fontFamilyResolverKt instanceof resolveAsTypefaceWqqsr6A) {
                        resolveAsTypefaceWqqsr6A resolveastypefacewqqsr6a = (resolveAsTypefaceWqqsr6A) fontFamilyResolverKt;
                        getwear_os_small_roundannotations = new C0158device(resolveastypefacewqqsr6a.RemoteActionCompatParcelizer(), resolveastypefacewqqsr6a.IconCompatParcelizer());
                    } else if (fontFamilyResolverKt instanceof getGlobalTypefaceRequestCache) {
                        getGlobalTypefaceRequestCache getglobaltypefacerequestcache = (getGlobalTypefaceRequestCache) fontFamilyResolverKt;
                        TagIconTokenV1 tagIconTokenV1Write = getglobaltypefacerequestcache.write();
                        if (tagIconTokenV1Write != null) {
                            int i2 = write + 123;
                            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                this.serializer.getClass();
                                numIconCompatParcelizer = AndroidUiFrameClock.IconCompatParcelizer(tagIconTokenV1Write);
                                int i3 = 5 / 0;
                                if (numIconCompatParcelizer != null) {
                                    iIntValue2 = numIconCompatParcelizer.intValue();
                                } else {
                                    iIntValue2 = com.logistics.rider.glovo.R.drawable.ic_bold_large_file_note;
                                }
                            } else {
                                this.serializer.getClass();
                                numIconCompatParcelizer = AndroidUiFrameClock.IconCompatParcelizer(tagIconTokenV1Write);
                                if (numIconCompatParcelizer != null) {
                                    iIntValue2 = numIconCompatParcelizer.intValue();
                                } else {
                                    iIntValue2 = com.logistics.rider.glovo.R.drawable.ic_bold_large_file_note;
                                }
                            }
                        } else {
                            iIntValue2 = com.logistics.rider.glovo.R.drawable.ic_bold_large_file_note;
                        }
                        String strIconCompatParcelizer = getglobaltypefacerequestcache.IconCompatParcelizer();
                        emptyCacheFontFamilyResolver emptycachefontfamilyresolverRemoteActionCompatParcelizer = getglobaltypefacerequestcache.RemoteActionCompatParcelizer();
                        OverlayComponent$OverlayInstruction$Config$Trim overlayComponent$OverlayInstruction$Config$TrimWrite = emptycachefontfamilyresolverRemoteActionCompatParcelizer != null ? emptycachefontfamilyresolverRemoteActionCompatParcelizer.write() : null;
                        int i4 = overlayComponent$OverlayInstruction$Config$TrimWrite == null ? -1 : IntSizeKt.serializer[overlayComponent$OverlayInstruction$Config$TrimWrite.ordinal()];
                        if (i4 == -1) {
                            overlayItems$Instruction$Config$Trim = OverlayItems$Instruction$Config$Trim.END;
                        } else if (i4 != 1) {
                            int i5 = write + 27;
                            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            read = i6;
                            if (i5 % 2 == 0 ? i4 == 2 : i4 == 5) {
                                overlayItems$Instruction$Config$Trim = OverlayItems$Instruction$Config$Trim.CENTER;
                            } else {
                                if (i4 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                int i7 = i6 + 85;
                                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i7 % 2 == 0) {
                                    int i8 = 5 / 5;
                                }
                                overlayItems$Instruction$Config$Trim = OverlayItems$Instruction$Config$Trim.END;
                            }
                        } else {
                            overlayItems$Instruction$Config$Trim = OverlayItems$Instruction$Config$Trim.START;
                        }
                        getwear_os_small_roundannotations = new getWEAR_OS_SMALL_ROUNDannotations(iIntValue2, strIconCompatParcelizer, new C0183locale(overlayItems$Instruction$Config$Trim));
                    } else {
                        if (!(fontFamilyResolverKt instanceof resolveAsTypefaceWqqsr6Adefault)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        getwear_os_small_roundannotations = null;
                    }
                    if (getwear_os_small_roundannotations != null) {
                        arrayList2.add(getwear_os_small_roundannotations);
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String strRemoteActionCompatParcelizer = matchfontretoiig.RemoteActionCompatParcelizer();
        String str = (String) matchFontRetOiIg.read(df.IconCompatParcelizer(), new Object[]{matchfontretoiig}, df.IconCompatParcelizer(), df.IconCompatParcelizer(), df.IconCompatParcelizer(), 974856113, -974856112);
        String strIconCompatParcelizer2 = matchfontretoiig.IconCompatParcelizer();
        String strWrite = matchfontretoiig.write();
        Integer numRatingCompat = matchfontretoiig.RatingCompat();
        if (numRatingCompat != null) {
            iIntValue = numRatingCompat.intValue();
        } else {
            int i9 = read + 27;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iIntValue = 1;
        }
        List<loadCached> list2 = matchfontretoiig.read();
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (loadCached loadcached : list2) {
            arrayList3.add(new copyZbe2FdA(loadcached.write(), loadcached.serializer()));
        }
        accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = new accessgetLOREM_IPSUM_SOURCEp(strRemoteActionCompatParcelizer, str, strIconCompatParcelizer2, arrayList3, strWrite, matchfontretoiig.MediaBrowserCompatMediaItem(), iIntValue, (filterbyclosestweightui_text == null || (listSerializer = filterbyclosestweightui_text.serializer()) == null) ? null : new Constraints(filterbyclosestweightui_text.IconCompatParcelizer(), filterbyclosestweightui_text.RemoteActionCompatParcelizer(), listSerializer), arrayList, !matchfontretoiig.MediaMetadataCompat());
        int i11 = read + 51;
        write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return accessgetlorem_ipsum_sourcep;
    }
}
