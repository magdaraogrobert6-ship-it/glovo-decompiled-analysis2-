package o;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tagmanager.TagManagerService;
import com.google.android.gms.tasks.zzc;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.nlp.scan.FB;
import com.qualtrics.digital.QualtricsSurveyExpression;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class NoWindowInsetsAnimation extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public maxHeight ComponentActivity;
    public zzfa IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public final AtomicReference MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public PriorityQueue MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public maxHeight ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public maxHeight PlaybackStateCompatCustomAction;
    public final CopyOnWriteArraySet RatingCompat;
    public long ResultReceiver;
    public final AtomicLong r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public getMeasuredWidth r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public MeasuringIntrinsicsDefaultIntrinsicMeasurable r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final coil3.memory.MemoryCacheService r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public MultiContentMeasurePolicyImpl r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final coil3.memory.MemoryCacheService read;
    public MeasureScopeMarker serializer;
    public boolean write;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return false;
    }

    public final String ComponentActivity() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        try {
            Object[] objArr = {lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat, lookaheadScopeKtLookaheadScope221.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM};
            return (String) TuplesKt.RemoteActionCompatParcelizer(-1772022421, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 1772022425);
        } catch (IllegalStateException e) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void IconCompatParcelizer(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        serializer();
        getMeasuredWidth getmeasuredwidth = getMeasuredWidth.RemoteActionCompatParcelizer;
        MeasureScope[] measureScopeArrZzb = accessisLookingAheadjd.STORAGE.zzb();
        int length = measureScopeArrZzb.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            String str = measureScopeArrZzb[i2].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.RatingCompat.serializer(obj, "Ignoring invalid consent setting");
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.RatingCompat.RemoteActionCompatParcelizer("Valid consent values are 'granted', 'denied'");
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        boolean zMediaMetadataCompat = lookaheadScopeKtLookaheadScope4.MediaMetadataCompat();
        getMeasuredWidth getmeasuredwidthWrite = getMeasuredWidth.write(i, bundle);
        Iterator it = getmeasuredwidthWrite.serializer.values().iterator();
        while (it.hasNext()) {
            if (((MeasureScopeDefaultImpls) it.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                RemoteActionCompatParcelizer(getmeasuredwidthWrite, zMediaMetadataCompat);
                break;
            }
        }
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(i, bundle);
        Iterator it2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.MediaSessionCompatQueueItem.values().iterator();
        while (it2.hasNext()) {
            if (((MeasureScopeDefaultImpls) it2.next()) != MeasureScopeDefaultImpls.UNINITIALIZED) {
                RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write, zMediaMetadataCompat);
                break;
            }
        }
        Boolean boolRemoteActionCompatParcelizer = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.RemoteActionCompatParcelizer(bundle);
        if (boolRemoteActionCompatParcelizer != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zMediaMetadataCompat) {
                read(j, boolRemoteActionCompatParcelizer.toString(), str2, "allow_personalized_ads");
            } else {
                write(str2, "allow_personalized_ads", boolRemoteActionCompatParcelizer.toString(), false, j);
            }
        }
    }

    public final void MediaSessionCompatQueueItem() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        updateViewport updateviewport;
        updateViewport updateviewport2;
        NoWindowInsetsAnimation noWindowInsetsAnimation;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer;
        getKeyZmokQxo getkeyzmokqxo;
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Handle tcf update.");
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        SharedPreferences sharedPreferencesMediaMetadataCompat = lookaheadScopeKt.MediaMetadataCompat();
        HashMap map = new HashMap();
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.addOnMultiWindowModeChangedListener;
        if (((Boolean) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).booleanValue()) {
            accessgetApproachSetp accessgetapproachsetp = OnGloballyPositionedElement.RemoteActionCompatParcelizer;
            isCtrlPressedZmokQxo isctrlpressedzmokqxo = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            OnFirstVisibleNoderectChanged1 onFirstVisibleNoderectChanged1 = OnFirstVisibleNoderectChanged1.CONSENT;
            Objects.requireNonNull(isctrlpressedzmokqxo);
            Objects.requireNonNull(onFirstVisibleNoderectChanged1);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo, onFirstVisibleNoderectChanged1);
            isCtrlPressedZmokQxo isctrlpressedzmokqxo2 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            OnFirstVisibleNoderectChanged1 onFirstVisibleNoderectChanged2 = OnFirstVisibleNoderectChanged1.FLEXIBLE_LEGITIMATE_INTEREST;
            Objects.requireNonNull(isctrlpressedzmokqxo2);
            Objects.requireNonNull(onFirstVisibleNoderectChanged2);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo2, onFirstVisibleNoderectChanged2);
            isCtrlPressedZmokQxo isctrlpressedzmokqxo3 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            Objects.requireNonNull(isctrlpressedzmokqxo3);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo3, onFirstVisibleNoderectChanged1);
            isCtrlPressedZmokQxo isctrlpressedzmokqxo4 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            Objects.requireNonNull(isctrlpressedzmokqxo4);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo4, onFirstVisibleNoderectChanged1);
            isCtrlPressedZmokQxo isctrlpressedzmokqxo5 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            Objects.requireNonNull(isctrlpressedzmokqxo5);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry5 = new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo5, onFirstVisibleNoderectChanged2);
            isCtrlPressedZmokQxo isctrlpressedzmokqxo6 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS;
            Objects.requireNonNull(isctrlpressedzmokqxo6);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry6 = new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo6, onFirstVisibleNoderectChanged2);
            isCtrlPressedZmokQxo isctrlpressedzmokqxo7 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS;
            Objects.requireNonNull(isctrlpressedzmokqxo7);
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, simpleImmutableEntry5, simpleImmutableEntry6, new AbstractMap.SimpleImmutableEntry(isctrlpressedzmokqxo7, onFirstVisibleNoderectChanged2));
            resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(listAsList instanceof Collection ? listAsList.size() : 4);
            resizegraphicframeifappropriate.read(listAsList);
            accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2 = resizegraphicframeifappropriate.RemoteActionCompatParcelizer();
            int i10 = undelegateUnprotectedui.read;
            DepthSortedSetsForDifferentPassesWhenMappings depthSortedSetsForDifferentPassesWhenMappings = new DepthSortedSetsForDifferentPassesWhenMappings("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesMediaMetadataCompat.contains("IABTCF_TCString");
            try {
                i5 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i5 = -1;
            }
            try {
                i6 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused2) {
                i6 = -1;
            }
            try {
                i7 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused3) {
                i7 = -1;
            }
            try {
                i8 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused4) {
                i8 = -1;
            }
            try {
                i9 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i9 = -1;
            }
            String strWrite = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_PublisherCC");
            resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate2 = new resizeGraphicFrameIfAppropriate(4);
            DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
            if (depthSortedSetsForDifferentPasses == null) {
                depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2, new areItemsTheSame(0, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2.MediaDescriptionCompat, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2.read));
                accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer = depthSortedSetsForDifferentPasses;
            }
            same it = depthSortedSetsForDifferentPasses.iterator();
            while (it.hasNext()) {
                isCtrlPressedZmokQxo isctrlpressedzmokqxo8 = (isCtrlPressedZmokQxo) it.next();
                int iZza = isctrlpressedzmokqxo8.zza();
                same sameVar = it;
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iZza);
                String strWrite2 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, sb.toString());
                if (TextUtils.isEmpty(strWrite2) || strWrite2.length() < 755) {
                    getkeyzmokqxo = getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strWrite2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > getKeyZmokQxo.values().length || iDigit == 0) {
                        getkeyzmokqxo = getKeyZmokQxo.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != 1) {
                        getkeyzmokqxo = iDigit != 2 ? getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED : getKeyZmokQxo.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        getkeyzmokqxo = getKeyZmokQxo.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                resizegraphicframeifappropriate2.read(isctrlpressedzmokqxo8, getkeyzmokqxo);
                it = sameVar;
            }
            accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3 = resizegraphicframeifappropriate2.RemoteActionCompatParcelizer();
            String strWrite3 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_PurposeConsents");
            String strWrite4 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(strWrite4) && strWrite4.length() >= 755 && strWrite4.charAt(754) == '1';
            String strWrite5 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_PurposeLegitimateInterests");
            String strWrite6 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(strWrite6) && strWrite6.length() >= 755 && strWrite6.charAt(754) == '1';
            cArr[0] = '2';
            if (zContains) {
                isCtrlPressedZmokQxo isctrlpressedzmokqxo9 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
                getKeyZmokQxo getkeyzmokqxo2 = (getKeyZmokQxo) accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3.get(isctrlpressedzmokqxo9);
                isCtrlPressedZmokQxo isctrlpressedzmokqxo10 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
                getKeyZmokQxo getkeyzmokqxo3 = (getKeyZmokQxo) accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3.get(isctrlpressedzmokqxo10);
                isCtrlPressedZmokQxo isctrlpressedzmokqxo11 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
                getKeyZmokQxo getkeyzmokqxo4 = (getKeyZmokQxo) accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3.get(isctrlpressedzmokqxo11);
                isCtrlPressedZmokQxo isctrlpressedzmokqxo12 = isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
                getKeyZmokQxo getkeyzmokqxo5 = (getKeyZmokQxo) accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3.get(isctrlpressedzmokqxo12);
                resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate3 = new resizeGraphicFrameIfAppropriate(4);
                resizegraphicframeifappropriate3.read("Version", "2");
                resizegraphicframeifappropriate3.read("VendorConsent", true != z ? "0" : "1");
                resizegraphicframeifappropriate3.read("VendorLegitimateInterest", true != z2 ? "0" : "1");
                resizegraphicframeifappropriate3.read("gdprApplies", i7 != 1 ? "0" : "1");
                resizegraphicframeifappropriate3.read("EnableAdvertiserConsentMode", i9 != 1 ? "0" : "1");
                resizegraphicframeifappropriate3.read("PolicyVersion", String.valueOf(i6));
                resizegraphicframeifappropriate3.read("CmpSdkID", String.valueOf(i5));
                resizegraphicframeifappropriate3.read("PurposeOneTreatment", i8 != 1 ? "0" : "1");
                resizegraphicframeifappropriate3.read("PublisherCC", strWrite);
                resizegraphicframeifappropriate3.read("PublisherRestrictions1", String.valueOf(getkeyzmokqxo2 != null ? getkeyzmokqxo2.zza() : getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED.zza()));
                resizegraphicframeifappropriate3.read("PublisherRestrictions3", String.valueOf(getkeyzmokqxo3 != null ? getkeyzmokqxo3.zza() : getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED.zza()));
                resizegraphicframeifappropriate3.read("PublisherRestrictions4", String.valueOf(getkeyzmokqxo4 != null ? getkeyzmokqxo4.zza() : getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED.zza()));
                resizegraphicframeifappropriate3.read("PublisherRestrictions7", String.valueOf(getkeyzmokqxo5 != null ? getkeyzmokqxo5.zza() : getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED.zza()));
                resizegraphicframeifappropriate3.read(accessgetLookaheadAndAncestorMeasureSetp.RemoteActionCompatParcelizer(4, new Object[]{"Purpose1", OnGloballyPositionedElement.write(isctrlpressedzmokqxo9, strWrite3, strWrite5), "Purpose3", OnGloballyPositionedElement.write(isctrlpressedzmokqxo10, strWrite3, strWrite5), "Purpose4", OnGloballyPositionedElement.write(isctrlpressedzmokqxo11, strWrite3, strWrite5), "Purpose7", OnGloballyPositionedElement.write(isctrlpressedzmokqxo12, strWrite3, strWrite5)}, null).entrySet());
                resizegraphicframeifappropriate3.read(accessgetLookaheadAndAncestorMeasureSetp.RemoteActionCompatParcelizer(5, new Object[]{"AuthorizePurpose1", true != OnGloballyPositionedElement.RemoteActionCompatParcelizer(isctrlpressedzmokqxo9, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3, depthSortedSetsForDifferentPassesWhenMappings, cArr, i9, i7, i8, strWrite, strWrite3, strWrite5, z, z2) ? "0" : "1", "AuthorizePurpose3", true != OnGloballyPositionedElement.RemoteActionCompatParcelizer(isctrlpressedzmokqxo10, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3, depthSortedSetsForDifferentPassesWhenMappings, cArr, i9, i7, i8, strWrite, strWrite3, strWrite5, z, z2) ? "0" : "1", "AuthorizePurpose4", true != OnGloballyPositionedElement.RemoteActionCompatParcelizer(isctrlpressedzmokqxo11, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3, depthSortedSetsForDifferentPassesWhenMappings, cArr, i9, i7, i8, strWrite, strWrite3, strWrite5, z, z2) ? "0" : "1", "AuthorizePurpose7", true != OnGloballyPositionedElement.RemoteActionCompatParcelizer(isctrlpressedzmokqxo12, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer2, accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer3, depthSortedSetsForDifferentPassesWhenMappings, cArr, i9, i7, i8, strWrite, strWrite3, strWrite5, z, z2) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer = resizegraphicframeifappropriate3.RemoteActionCompatParcelizer();
            } else {
                accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer = accessgetLookaheadAndAncestorMeasureSetp.write;
            }
            updateviewport = new updateViewport(accessgetlookaheadandancestormeasuresetpRemoteActionCompatParcelizer);
            str = "";
        } else {
            String strWrite7 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strWrite7) && strWrite7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strWrite7.charAt(754)));
            }
            try {
                i = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i2 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i2 = -1;
            }
            if (i2 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
            }
            try {
                i3 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i3 = -1;
            }
            if (i3 != -1) {
                map.put("PolicyVersion", String.valueOf(i3));
            }
            String strWrite8 = OnGloballyPositionedElement.write(sharedPreferencesMediaMetadataCompat, "IABTCF_PurposeConsents");
            if (!str.equals(strWrite8)) {
                map.put("PurposeConsents", strWrite8);
            }
            try {
                i4 = sharedPreferencesMediaMetadataCompat.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i4 = -1;
            }
            if (i4 != -1) {
                map.put("CmpSdkID", String.valueOf(i4));
            }
            updateviewport = new updateViewport(map);
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
        zzgsVar.serializer(updateviewport, "Tcf preferences read");
        if (!lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1)) {
            if (lookaheadScopeKt.serializer(updateviewport)) {
                Bundle bundleIconCompatParcelizer = updateviewport.IconCompatParcelizer();
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar.serializer(bundleIconCompatParcelizer, "Consent generated from Tcf");
                if (bundleIconCompatParcelizer != Bundle.EMPTY) {
                    accessgettvinputcomposite1cp.getClass();
                    IconCompatParcelizer(bundleIconCompatParcelizer, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", updateviewport.serializer());
                RemoteActionCompatParcelizer("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        lookaheadScopeKt.MediaSessionCompatToken();
        String string = lookaheadScopeKt.serializer().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            updateviewport2 = new updateViewport(map2);
        } else {
            for (String str2 : string.split(";")) {
                String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit.length >= 2 && OnGloballyPositionedElement.RemoteActionCompatParcelizer.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            updateviewport2 = new updateViewport(map2);
        }
        if (lookaheadScopeKt.serializer(updateviewport)) {
            Bundle bundleIconCompatParcelizer2 = updateviewport.IconCompatParcelizer();
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar.serializer(bundleIconCompatParcelizer2, "Consent generated from Tcf");
            if (bundleIconCompatParcelizer2 != Bundle.EMPTY) {
                accessgettvinputcomposite1cp.getClass();
                noWindowInsetsAnimation = this;
                noWindowInsetsAnimation.IconCompatParcelizer(bundleIconCompatParcelizer2, -30, System.currentTimeMillis());
            } else {
                noWindowInsetsAnimation = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = updateviewport2.read;
            String str3 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleIconCompatParcelizer3 = updateviewport.IconCompatParcelizer();
            Bundle bundleIconCompatParcelizer4 = updateviewport2.IconCompatParcelizer();
            bundle2.putString("_tcfm", str3.concat((bundleIconCompatParcelizer3.size() == bundleIconCompatParcelizer4.size() && Objects.equals(bundleIconCompatParcelizer3.getString("ad_storage"), bundleIconCompatParcelizer4.getString("ad_storage")) && Objects.equals(bundleIconCompatParcelizer3.getString("ad_personalization"), bundleIconCompatParcelizer4.getString("ad_personalization")) && Objects.equals(bundleIconCompatParcelizer3.getString("ad_user_data"), bundleIconCompatParcelizer4.getString("ad_user_data"))) ? "0" : "1"));
            String str4 = (String) updateviewport.read.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str4)) {
                str4 = "200000";
            }
            bundle2.putString("_tcfd2", str4);
            bundle2.putString("_tcfd", updateviewport.serializer());
            noWindowInsetsAnimation.RemoteActionCompatParcelizer("auto", "_tcf", bundle2);
        }
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle, long j) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID))) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(HiAnalyticsConstant.BI_KEY_APP_ID);
        accesslayoutjd.read(bundle2, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
        accesslayoutjd.read(bundle2, "origin", String.class, null);
        accesslayoutjd.read(bundle2, "name", String.class, null);
        accesslayoutjd.read(bundle2, "value", Object.class, null);
        accesslayoutjd.read(bundle2, "trigger_event_name", String.class, null);
        accesslayoutjd.read(bundle2, "trigger_timeout", Long.class, 0L);
        accesslayoutjd.read(bundle2, "timed_out_event_name", String.class, null);
        accesslayoutjd.read(bundle2, "timed_out_event_params", Bundle.class, null);
        accesslayoutjd.read(bundle2, "triggered_event_name", String.class, null);
        accesslayoutjd.read(bundle2, "triggered_event_params", Bundle.class, null);
        accesslayoutjd.read(bundle2, "time_to_live", Long.class, 0L);
        accesslayoutjd.read(bundle2, "expired_event_name", String.class, null);
        accesslayoutjd.read(bundle2, "expired_event_params", Bundle.class, null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(bundle2.getString("name"));
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(bundle2.getString("origin"));
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        zzgn zzgnVar = lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        if (onlayoutrectchangeddefault.MediaDescriptionCompat(string) != 0) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(zzgnVar.RemoteActionCompatParcelizer(string), "Invalid conditional user property name");
            return;
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        if (onlayoutrectchangeddefault.IconCompatParcelizer(obj, string) != 0) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Invalid conditional user property value", zzgnVar.RemoteActionCompatParcelizer(string), obj);
            return;
        }
        Object objWrite = onlayoutrectchangeddefault.write(obj, string);
        if (objWrite == null) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Unable to normalize conditional user property value", zzgnVar.RemoteActionCompatParcelizer(string), obj);
            return;
        }
        accesslayoutjd.read(bundle2, objWrite);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > QualtricsSurveyExpression.TIME_BETWEEN_SURVEYS || j2 < 1)) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Invalid conditional user property timeout", zzgnVar.RemoteActionCompatParcelizer(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > QualtricsSurveyExpression.TIME_BETWEEN_SURVEYS || j3 < 1) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Invalid conditional user property time to live", zzgnVar.RemoteActionCompatParcelizer(string), Long.valueOf(j3));
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new getExtra(this, bundle2, 0));
        }
    }

    public final void ResultReceiver() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getApplicationContext() instanceof Application) || this.IconCompatParcelizer == null) {
            return;
        }
        ((Application) lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.IconCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    public final void read(long j, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        boolean zRemoteActionCompatParcelizer;
        Object objValueOf = obj;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        MediaSessionCompatToken();
        serializer();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(java.util.Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                    lookaheadScopeKt.MediaMetadataCompat.IconCompatParcelizer(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                    lookaheadScopeKt2.MediaMetadataCompat.IconCompatParcelizer("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                LookaheadScopeKt lookaheadScopeKt3 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt3);
                lookaheadScopeKt3.MediaMetadataCompat.IconCompatParcelizer("unset");
            } else {
                str4 = str2;
            }
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer("Setting user property(FE)", "non_personalized_ads(_npa)", objValueOf);
            obj2 = objValueOf;
            str3 = str4;
        } else {
            obj2 = objValueOf;
            str3 = str2;
        }
        if (!lookaheadScopeKtLookaheadScope221.write()) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("User property not set since app measurement is disabled");
            return;
        }
        if (lookaheadScopeKtLookaheadScope221.RemoteActionCompatParcelizer()) {
            zzpl zzplVar = new zzpl(j, obj2, str3, str);
            setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            setviewportboundsMediaDescriptionCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            getParentWidth getparentwidth = ((LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).read();
            getparentwidth.getClass();
            Parcel parcelObtain = Parcel.obtain();
            zza.write(zzplVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.write.RemoteActionCompatParcelizer("User property too long for local database. Sending directly to service");
                zRemoteActionCompatParcelizer = false;
            } else {
                zRemoteActionCompatParcelizer = getparentwidth.RemoteActionCompatParcelizer(1, bArrMarshall);
            }
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new cancelTimer(setviewportboundsMediaDescriptionCompat, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(true), zRemoteActionCompatParcelizer, zzplVar, 0));
        }
    }

    public final void read(getMeasuredWidth getmeasuredwidth, long j, boolean z) {
        int i = getmeasuredwidth.read;
        MediaSessionCompatToken();
        serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        getMeasuredWidth getmeasuredwidthMediaSessionCompatResultReceiverWrapper = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper();
        if (j <= this.ResultReceiver && getMeasuredWidth.serializer(getmeasuredwidthMediaSessionCompatResultReceiverWrapper.read, i)) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaMetadataCompat.serializer(getmeasuredwidth, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
        lookaheadScopeKt2.MediaSessionCompatToken();
        if (!getMeasuredWidth.serializer(i, lookaheadScopeKt2.serializer().getInt("consent_source", 100))) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaMetadataCompat.serializer(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = lookaheadScopeKt2.serializer().edit();
        editorEdit.putString("consent_settings", getmeasuredwidth.RemoteActionCompatParcelizer());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer(getmeasuredwidth, "Setting storage consent(FE)");
        this.ResultReceiver = j;
        if (lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
            setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new setJob(setviewportboundsMediaDescriptionCompat, 2));
        } else {
            setViewportBounds setviewportboundsMediaDescriptionCompat2 = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat2.serializer();
            if (setviewportboundsMediaDescriptionCompat2.ResultReceiver()) {
                setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new getLastViewport(setviewportboundsMediaDescriptionCompat2, setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(false)));
            }
        }
        if (z) {
            lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat().RemoteActionCompatParcelizer(new AtomicReference());
        }
    }

    public final void write(String str, String str2, Bundle bundle) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new getExtra(this, bundle2, 1));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public final void write(String str, String str2, Object obj, boolean z, long j) {
        int iMediaDescriptionCompat;
        int length;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (z) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            iMediaDescriptionCompat = onlayoutrectchangeddefault.MediaDescriptionCompat(str2);
        } else {
            onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
            if (!onlayoutrectchangeddefault2.serializer("user property", str2)) {
                iMediaDescriptionCompat = 6;
            } else if (onlayoutrectchangeddefault2.write("user property", MeasureScopelayout1.write, null, str2)) {
                ((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                if (onlayoutrectchangeddefault2.RemoteActionCompatParcelizer(24, "user property", str2)) {
                    iMediaDescriptionCompat = 0;
                } else {
                    iMediaDescriptionCompat = 6;
                }
            } else {
                iMediaDescriptionCompat = 15;
            }
        }
        coil3.memory.MemoryCacheService memoryCacheService = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (iMediaDescriptionCompat != 0) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            String strIconCompatParcelizer = onLayoutRectChangeddefault.IconCompatParcelizer(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, iMediaDescriptionCompat, "_ev", strIconCompatParcelizer, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) new getMinMax(this, str3, str2, null, j));
            return;
        }
        onLayoutRectChangeddefault onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        onLayoutRectChangeddefault onlayoutrectchangeddefault4 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
        int iIconCompatParcelizer = onlayoutrectchangeddefault3.IconCompatParcelizer(obj, str2);
        if (iIconCompatParcelizer != 0) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault4);
            String strIconCompatParcelizer2 = onLayoutRectChangeddefault.IconCompatParcelizer(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault4);
            onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, iIconCompatParcelizer, "_ev", strIconCompatParcelizer2, length);
            return;
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault4);
        Object objWrite = onlayoutrectchangeddefault4.write(obj, str2);
        if (objWrite != null) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.write((Runnable) new getMinMax(this, str3, str2, objWrite, j));
        }
    }

    public final void IconCompatParcelizer(Boolean bool, boolean z) {
        MediaSessionCompatToken();
        serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.serializer(bool, "Setting app measurement enabled (FE)");
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        lookaheadScopeKt.MediaSessionCompatToken();
        SharedPreferences.Editor editorEdit = lookaheadScopeKt.serializer().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            lookaheadScopeKt.MediaSessionCompatToken();
            SharedPreferences.Editor editorEdit2 = lookaheadScopeKt.serializer().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        if (lookaheadScopeKtLookaheadScope221.read || !(bool == null || bool.booleanValue())) {
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        }
    }

    public final void IconCompatParcelizer(minWidth minwidth) {
        serializer();
        if (this.RatingCompat.add(minwidth)) {
            return;
        }
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("OnEventListener already registered");
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        MediaSessionCompatToken();
        serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (lookaheadScopeKtLookaheadScope221.RemoteActionCompatParcelizer()) {
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
            ((LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
            Boolean boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost.RemoteActionCompatParcelizer("google_analytics_deferred_deep_link_enabled");
            int i = 3;
            if (boolRemoteActionCompatParcelizer != null && boolRemoteActionCompatParcelizer.booleanValue()) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Deferred Deep Link feature enabled.");
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                lookaheadScopeKtLookaheadScope4.write((Runnable) new setDebounceMillis(this, i));
            }
            setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            zzr zzrVarRemoteActionCompatParcelizer = setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(true);
            setviewportboundsMediaDescriptionCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            lookaheadScopeKtLookaheadScope222.PlaybackStateCompat.write(null, premeasure0kLqBqw.onPanelClosed);
            lookaheadScopeKtLookaheadScope222.read().RemoteActionCompatParcelizer(3, new byte[0]);
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new zzc(setviewportboundsMediaDescriptionCompat, zzrVarRemoteActionCompatParcelizer, false, 14));
            this.write = false;
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            lookaheadScopeKt.MediaSessionCompatToken();
            String string = lookaheadScopeKt.serializer().getString("previous_os_version", null);
            ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatQueueItem().ComponentActivity();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = lookaheadScopeKt.serializer().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            lookaheadScopeKtLookaheadScope221.MediaSessionCompatQueueItem().ComponentActivity();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            RemoteActionCompatParcelizer("auto", "_ou", bundle);
        }
    }

    public final void RemoteActionCompatParcelizer(String str, String str2, Bundle bundle) {
        MediaSessionCompatToken();
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        write(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void RemoteActionCompatParcelizer(getMeasuredWidth getmeasuredwidth) {
        MediaSessionCompatToken();
        boolean z = (getmeasuredwidth.IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE) && getmeasuredwidth.IconCompatParcelizer(MeasureScope.AD_STORAGE)) || ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat().ResultReceiver();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        if (z != lookaheadScopeKtLookaheadScope221.read) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.MediaSessionCompatToken();
            lookaheadScopeKtLookaheadScope221.read = z;
            LookaheadScopeKt lookaheadScopeKt = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            lookaheadScopeKt.MediaSessionCompatToken();
            Boolean boolValueOf = lookaheadScopeKt.serializer().contains("measurement_enabled_from_api") ? Boolean.valueOf(lookaheadScopeKt.serializer().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                IconCompatParcelizer(Boolean.valueOf(z), false);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(getMeasuredWidth getmeasuredwidth, boolean z) {
        boolean z2;
        getMeasuredWidth getmeasuredwidth2;
        boolean z3;
        boolean z4;
        serializer();
        int i = getmeasuredwidth.read;
        if (i != -10) {
            MeasureScopeDefaultImpls measureScopeDefaultImpls = (MeasureScopeDefaultImpls) getmeasuredwidth.serializer.get(MeasureScope.AD_STORAGE);
            if (measureScopeDefaultImpls == null) {
                measureScopeDefaultImpls = MeasureScopeDefaultImpls.UNINITIALIZED;
            }
            MeasureScopeDefaultImpls measureScopeDefaultImpls2 = MeasureScopeDefaultImpls.UNINITIALIZED;
            if (measureScopeDefaultImpls == measureScopeDefaultImpls2) {
                MeasureScopeDefaultImpls measureScopeDefaultImpls3 = (MeasureScopeDefaultImpls) getmeasuredwidth.serializer.get(MeasureScope.ANALYTICS_STORAGE);
                if (measureScopeDefaultImpls3 == null) {
                    measureScopeDefaultImpls3 = measureScopeDefaultImpls2;
                }
                if (measureScopeDefaultImpls3 == measureScopeDefaultImpls2) {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.RatingCompat.RemoteActionCompatParcelizer("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.MediaDescriptionCompat) {
            z2 = false;
            if (getMeasuredWidth.serializer(i, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read)) {
                getMeasuredWidth getmeasuredwidth3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                EnumMap enumMap = getmeasuredwidth.serializer;
                MeasureScope[] measureScopeArr = (MeasureScope[]) enumMap.keySet().toArray(new MeasureScope[0]);
                int length = measureScopeArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z3 = false;
                        break;
                    }
                    MeasureScope measureScope = measureScopeArr[i2];
                    MeasureScopeDefaultImpls measureScopeDefaultImpls4 = (MeasureScopeDefaultImpls) enumMap.get(measureScope);
                    MeasureScopeDefaultImpls measureScopeDefaultImpls5 = (MeasureScopeDefaultImpls) getmeasuredwidth3.serializer.get(measureScope);
                    MeasureScopeDefaultImpls measureScopeDefaultImpls6 = MeasureScopeDefaultImpls.DENIED;
                    if (measureScopeDefaultImpls4 == measureScopeDefaultImpls6 && measureScopeDefaultImpls5 != measureScopeDefaultImpls6) {
                        z3 = true;
                        break;
                    }
                    i2++;
                }
                MeasureScope measureScope2 = MeasureScope.ANALYTICS_STORAGE;
                if (getmeasuredwidth.IconCompatParcelizer(measureScope2) && !this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(measureScope2)) {
                    z2 = true;
                }
                getMeasuredWidth getmeasuredwidthSerializer = getmeasuredwidth.serializer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getmeasuredwidthSerializer;
                getmeasuredwidth2 = getmeasuredwidthSerializer;
                z4 = z2;
                z2 = true;
            } else {
                getmeasuredwidth2 = getmeasuredwidth;
                z3 = false;
                z4 = false;
            }
        }
        if (!z2) {
            getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.MediaMetadataCompat.serializer(getmeasuredwidth2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getAndIncrement();
        if (z3) {
            this.MediaMetadataCompat.set(null);
            MultiContentMeasurePolicy multiContentMeasurePolicy = new MultiContentMeasurePolicy(this, getmeasuredwidth2, andIncrement, z4, 0);
            if (z) {
                MediaSessionCompatToken();
                multiContentMeasurePolicy.run();
                return;
            } else {
                LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                lookaheadScopeKtLookaheadScope4.RemoteActionCompatParcelizer((Runnable) multiContentMeasurePolicy);
                return;
            }
        }
        MultiContentMeasurePolicy multiContentMeasurePolicy2 = new MultiContentMeasurePolicy(this, getmeasuredwidth2, andIncrement, z4, 1);
        if (z) {
            MediaSessionCompatToken();
            multiContentMeasurePolicy2.run();
        } else if (i == 30 || i == -10) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.RemoteActionCompatParcelizer((Runnable) multiContentMeasurePolicy2);
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
            lookaheadScopeKtLookaheadScope6.write((Runnable) multiContentMeasurePolicy2);
        }
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            if (lookaheadScopeKtLookaheadScope4.MediaMetadataCompat()) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (accessgetWcp.read()) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Cannot get trigger URIs from main thread");
                return;
            }
            serializer();
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write(atomicReference, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, "get trigger URIs", new MeasuringIntrinsicsEmptyPlaceable(this, atomicReference, 6, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaDescriptionCompat.RemoteActionCompatParcelizer("Timed out waiting for get trigger URIs");
            } else {
                LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                lookaheadScopeKtLookaheadScope4.write(new Runnable() { // from class: o.MeasuringIntrinsicsIntrinsicWidthHeight
                    @Override // java.lang.Runnable
                    public final void run() {
                        NoWindowInsetsAnimation noWindowInsetsAnimation = this.serializer;
                        noWindowInsetsAnimation.MediaSessionCompatToken();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        LookaheadScopeKt lookaheadScopeKt = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
                        SparseArray sparseArrayMediaSessionCompatQueueItem = lookaheadScopeKt.MediaSessionCompatQueueItem();
                        for (zzoh zzohVar : list) {
                            int i = zzohVar.RemoteActionCompatParcelizer;
                            if (!sparseArrayMediaSessionCompatQueueItem.contains(i) || ((Long) sparseArrayMediaSessionCompatQueueItem.get(i)).longValue() < zzohVar.write) {
                                noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().add(zzohVar);
                            }
                        }
                        noWindowInsetsAnimation.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    }
                });
            }
        }
    }

    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        String strRatingCompat = lookaheadScopeKt.MediaMetadataCompat.RatingCompat();
        if (strRatingCompat != null) {
            if ("unset".equals(strRatingCompat)) {
                accessgettvinputcomposite1cp.getClass();
                read(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                long j = true != "true".equals(strRatingCompat) ? 0L : 1L;
                accessgettvinputcomposite1cp.getClass();
                read(System.currentTimeMillis(), Long.valueOf(j), "app", "_npa");
            }
        }
        int i = 2;
        if (!lookaheadScopeKtLookaheadScope221.write() || !this.write) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Updating Scion state (FE)");
            setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new getLastViewport(setviewportboundsMediaDescriptionCompat, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(true), i));
            return;
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Recording app launch after enabling measurement for the first time (FE)");
        MediaSessionCompatResultReceiverWrapper();
        triggerCallback triggercallback = lookaheadScopeKtLookaheadScope221.MediaSessionCompatToken;
        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
        triggercallback.serializer.MediaDescriptionCompat();
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.write((Runnable) new setDebounceMillis(this, i));
    }

    public final void write(long j, Bundle bundle, String str, String str2) {
        MediaSessionCompatToken();
        RemoteActionCompatParcelizer(str, str2, j, bundle, true, this.serializer == null || onLayoutRectChangeddefault.RemoteActionCompatParcelizer(str2), true);
    }

    public final void write(MeasureScopeMarker measureScopeMarker) {
        MediaSessionCompatToken();
        serializer();
        MeasureScopeMarker measureScopeMarker2 = this.serializer;
        if (measureScopeMarker != measureScopeMarker2) {
            accessgetSystemNavigationDowncp.serializer("EventInterceptor already set.", measureScopeMarker2 == null);
        }
        this.serializer = measureScopeMarker;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r5 > 500) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r6 > 500) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RemoteActionCompatParcelizer(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NoWindowInsetsAnimation.RemoteActionCompatParcelizer(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        zzoh zzohVar;
        MediaSessionCompatToken();
        this.MediaSessionCompatToken = false;
        if (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().isEmpty() || this.MediaSessionCompatQueueItem || (zzohVar = (zzoh) r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().poll()) == null) {
            return;
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        if (onlayoutrectchangeddefault.MediaDescriptionCompat == null) {
            onlayoutrectchangeddefault.MediaDescriptionCompat = BezierKtWhenMappings.write(((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat);
        }
        BezierKtWhenMappings bezierKtWhenMappings = onlayoutrectchangeddefault.MediaDescriptionCompat;
        if (bezierKtWhenMappings != null) {
            this.MediaSessionCompatQueueItem = true;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
            String str = zzohVar.serializer;
            zzgsVar.serializer(str, "Registering trigger URI");
            DrawModifierNodeKt drawModifierNodeKtSerializer = bezierKtWhenMappings.serializer(Uri.parse(str));
            if (drawModifierNodeKtSerializer != null) {
                GlobalPositionAwareModifierNode.read(drawModifierNodeKtSerializer, new colorResource(this, 27, zzohVar), new minHeight(this));
            } else {
                this.MediaSessionCompatQueueItem = false;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY().add(zzohVar);
            }
        }
    }

    public NoWindowInsetsAnimation(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.RatingCompat = new CopyOnWriteArraySet();
        this.MediaDescriptionCompat = new Object();
        this.MediaSessionCompatQueueItem = false;
        this.PlaybackStateCompat = 1;
        this.write = true;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new coil3.memory.MemoryCacheService(this);
        this.MediaMetadataCompat = new AtomicReference();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getMeasuredWidth.RemoteActionCompatParcelizer;
        this.ResultReceiver = -1L;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AtomicLong(0L);
        this.read = new coil3.memory.MemoryCacheService(lookaheadScopeKtLookaheadScope221);
    }

    public final void RemoteActionCompatParcelizer(LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1, boolean z) {
        com.google.android.gms.net.zza zzaVar = new com.google.android.gms.net.zza(this, layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1, false, 17);
        if (z) {
            MediaSessionCompatToken();
            zzaVar.run();
        } else {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.write((Runnable) zzaVar);
        }
    }

    public final PriorityQueue r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            this.MediaSessionCompatResultReceiverWrapper = new PriorityQueue(Comparator.comparing(new Function() { // from class: o.ModifierInfo
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((zzoh) obj).write);
                }
            }, FB.serializer));
        }
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0281  */
    /* JADX WARN: Code duplicated, block: B:121:0x02db  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:128:0x0308  */
    /* JADX WARN: Code duplicated, block: B:129:0x0313  */
    /* JADX WARN: Code duplicated, block: B:132:0x032f  */
    /* JADX WARN: Code duplicated, block: B:136:0x038e  */
    /* JADX WARN: Code duplicated, block: B:137:0x039c  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x03db  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0405  */
    /* JADX WARN: Code duplicated, block: B:153:0x0409  */
    /* JADX WARN: Code duplicated, block: B:154:0x0418  */
    /* JADX WARN: Code duplicated, block: B:156:0x041c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0429  */
    /* JADX WARN: Code duplicated, block: B:163:0x0431  */
    /* JADX WARN: Code duplicated, block: B:164:0x0434  */
    /* JADX WARN: Code duplicated, block: B:167:0x043d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0483  */
    /* JADX WARN: Code duplicated, block: B:171:0x0497  */
    /* JADX WARN: Code duplicated, block: B:174:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:177:0x04c3 A[LOOP:2: B:175:0x04bd->B:177:0x04c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211  */
    /* JADX WARN: Code duplicated, block: B:96:0x0229  */
    public final void RemoteActionCompatParcelizer(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        onLayoutRectChangeddefault onlayoutrectchangeddefault;
        LookaheadScopeKt lookaheadScopeKt;
        LookaheadScopeKt lookaheadScopeKt2;
        boolean z6;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221;
        int iMediaSessionCompatQueueItem;
        Bundle bundle2;
        onLayoutRectChangeddefault onlayoutrectchangeddefault2;
        String str3;
        onLayoutRectChangeddefault onlayoutrectchangeddefault3;
        String strRatingCompat;
        ArrayList arrayList;
        LookaheadScopeKt lookaheadScopeKt3;
        boolean z7;
        OnFirstVisibleNode onFirstVisibleNode;
        long j2;
        long j3;
        ArrayList arrayList2;
        int size;
        int i;
        int i2;
        Bundle bundleSerializer;
        String str4;
        onLayoutRectChangeddefault onlayoutrectchangeddefault4;
        Bundle bundle3;
        getParentWidth getparentwidth;
        byte[] bArrMarshall;
        boolean zRemoteActionCompatParcelizer;
        boolean z8;
        Iterator it;
        String str5;
        Object obj;
        Bundle[] bundleArr;
        int length;
        int i3;
        Class cls;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle);
        MediaSessionCompatToken();
        serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        boolean zWrite = lookaheadScopeKtLookaheadScope222.write();
        triggerCallback triggercallback = lookaheadScopeKtLookaheadScope222.MediaSessionCompatToken;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope222.PlaybackStateCompat;
        Context context = lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat;
        onLayoutRectChangeddefault onlayoutrectchangeddefault5 = lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
        if (zWrite) {
            List list = lookaheadScopeKtLookaheadScope222.MediaMetadataCompat().MediaBrowserCompatMediaItem;
            if (list != null && !list.contains(str2)) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatToken.serializer("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (this.MediaBrowserCompatMediaItem) {
                z4 = false;
            } else {
                this.MediaBrowserCompatMediaItem = true;
                try {
                    if (!lookaheadScopeKtLookaheadScope222.RatingCompat) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                    } else {
                        cls = TagManagerService.class;
                        int i4 = TagManagerService.RemoteActionCompatParcelizer;
                    }
                    try {
                        Class<?>[] clsArr = new Class[1];
                        z4 = false;
                        try {
                            clsArr[0] = Context.class;
                            cls.getDeclaredMethod("initialize", clsArr).invoke(null, context);
                        } catch (Exception e) {
                            e = e;
                            try {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Failed to invoke Tag Manager's initialize() method");
                            } catch (ClassNotFoundException unused) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                getlookaheaddelegate.MediaMetadataCompat.RemoteActionCompatParcelizer("Tag Manager is not found and thus will not be used");
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z4 = false;
                    }
                } catch (ClassNotFoundException unused2) {
                    z4 = false;
                }
            }
            zzgn zzgnVar = lookaheadScopeKtLookaheadScope222.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            LookaheadScopeKt lookaheadScopeKt4 = lookaheadScopeKtLookaheadScope222.PlaybackStateCompatCustomAction;
            accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope222.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (!setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onPictureInPictureModeChanged) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                accessgettvinputcomposite1cp.getClass();
                z5 = true;
                read(System.currentTimeMillis(), string, "auto", "_lgclid");
            } else {
                z5 = true;
            }
            if (!z || onLayoutRectChangeddefault.IconCompatParcelizer[z4].equals(str2)) {
                onlayoutrectchangeddefault = onlayoutrectchangeddefault5;
                lookaheadScopeKt = lookaheadScopeKt4;
            } else {
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault5);
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt4);
                lookaheadScopeKt = lookaheadScopeKt4;
                onlayoutrectchangeddefault = onlayoutrectchangeddefault5;
                onlayoutrectchangeddefault.RemoteActionCompatParcelizer(bundle, lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
            }
            coil3.memory.MemoryCacheService memoryCacheService = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (!z3 && !"_iap".equals(str2)) {
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                if (!onlayoutrectchangeddefault.serializer("event", str2)) {
                    i3 = 2;
                } else if (onlayoutrectchangeddefault.write("event", Measured.IconCompatParcelizer, Measured.write, str2)) {
                    ((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                    if (onlayoutrectchangeddefault.RemoteActionCompatParcelizer(40, "event", str2)) {
                        i3 = 0;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 13;
                }
                if (i3 != 0) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaDescriptionCompat.serializer(zzgnVar.write(str2), "Invalid public event name. Event will not be logged (FE)");
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, i3, "_ev", onLayoutRectChangeddefault.IconCompatParcelizer(str2, 40, z5), str2 != null ? str2.length() : 0);
                    return;
                }
            }
            OnFirstVisibleNode onFirstVisibleNode2 = lookaheadScopeKtLookaheadScope222.ResultReceiver;
            LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode2);
            getViewportBounds getviewportboundsIconCompatParcelizer = onFirstVisibleNode2.IconCompatParcelizer(false);
            if (getviewportboundsIconCompatParcelizer != null && !bundle.containsKey("_sc")) {
                getviewportboundsIconCompatParcelizer.serializer = z5;
            }
            if (!z || z3) {
                z5 = false;
            }
            onLayoutRectChangeddefault.IconCompatParcelizer(getviewportboundsIconCompatParcelizer, bundle, z5);
            boolean zEquals = "am".equals(str);
            boolean zRemoteActionCompatParcelizer2 = onLayoutRectChangeddefault.RemoteActionCompatParcelizer(str2);
            if (z) {
                lookaheadScopeKt2 = lookaheadScopeKt;
                if (this.serializer != null && !zRemoteActionCompatParcelizer2) {
                    if (!zEquals) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.MediaSessionCompatToken.serializer("Passing event to registered event handler (FE)", zzgnVar.write(str2), zzgnVar.read(bundle));
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(this.serializer);
                        this.serializer.RemoteActionCompatParcelizer(j, bundle, str, str2);
                        return;
                    }
                    z6 = true;
                }
                if (lookaheadScopeKtLookaheadScope222.RemoteActionCompatParcelizer()) {
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    iMediaSessionCompatQueueItem = onlayoutrectchangeddefault.MediaSessionCompatQueueItem(str2);
                    if (iMediaSessionCompatQueueItem != 0) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.MediaDescriptionCompat.serializer(zzgnVar.write(str2), "Invalid event name. Event will not be logged (FE)");
                        String strIconCompatParcelizer = onLayoutRectChangeddefault.IconCompatParcelizer(str2, 40, true);
                        if (str2 != null) {
                            length = str2.length();
                        } else {
                            length = 0;
                        }
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                        onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, iMediaSessionCompatQueueItem, "_ev", strIconCompatParcelizer, length);
                        return;
                    }
                    bundle2 = onlayoutrectchangeddefault.read(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle2);
                    LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode2);
                    onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
                    if (onFirstVisibleNode2.IconCompatParcelizer(false) == null && "_ae".equals(str2)) {
                        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                        toAndroidRect toandroidrect = triggercallback.write;
                        ((LookaheadScopeKtLookaheadScope221) ((triggerCallback) toandroidrect.read).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        str3 = "_o";
                        long j4 = jElapsedRealtime - toandroidrect.write;
                        toandroidrect.write = jElapsedRealtime;
                        onlayoutrectchangeddefault3 = onlayoutrectchangeddefault2;
                        if (j4 > 0) {
                            onlayoutrectchangeddefault3.write(bundle2, j4);
                        }
                    } else {
                        str3 = "_o";
                        onlayoutrectchangeddefault3 = onlayoutrectchangeddefault2;
                    }
                    if ("auto".equals(str) && "_ssr".equals(str2)) {
                        String string2 = bundle2.getString("_ffr");
                        int i5 = accessgetTvInputHdmi3cp.IconCompatParcelizer;
                        if (string2 == null || string2.trim().isEmpty()) {
                            string2 = null;
                        } else if (string2 != null) {
                            string2 = string2.trim();
                        }
                        LookaheadScopeKt lookaheadScopeKt5 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt5);
                        if (!Objects.equals(string2, lookaheadScopeKt5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat())) {
                            LookaheadScopeKt lookaheadScopeKt6 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt6);
                            lookaheadScopeKt6.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(string2);
                        } else {
                            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                            getlookaheaddelegate2.MediaSessionCompatToken.RemoteActionCompatParcelizer("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        LookaheadScopeKt lookaheadScopeKt7 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt7);
                        strRatingCompat = lookaheadScopeKt7.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat();
                        if (!TextUtils.isEmpty(strRatingCompat)) {
                            bundle2.putString("_ffr", strRatingCompat);
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add(bundle2);
                    if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onBackPressedDispatcher_delegatelambda0)) {
                        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                        triggercallback.MediaSessionCompatToken();
                        z7 = triggercallback.RatingCompat;
                        lookaheadScopeKt3 = lookaheadScopeKt2;
                    } else {
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                        lookaheadScopeKt3 = lookaheadScopeKt2;
                        z7 = lookaheadScopeKt3.MediaSessionCompatResultReceiverWrapper.read();
                    }
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt3);
                    if (lookaheadScopeKt3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer() > 0) {
                        onFirstVisibleNode = onFirstVisibleNode2;
                        j2 = 0;
                        j3 = j;
                    } else if (lookaheadScopeKt3.serializer(j) || !z7) {
                        onFirstVisibleNode = onFirstVisibleNode2;
                        j3 = j;
                        j2 = 0;
                    } else {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Current session is expired, remove the session number, ID, and engagement time");
                        accessgettvinputcomposite1cp.getClass();
                        j3 = j;
                        onFirstVisibleNode = onFirstVisibleNode2;
                        read(System.currentTimeMillis(), null, "auto", "_sid");
                        accessgettvinputcomposite1cp.getClass();
                        read(System.currentTimeMillis(), null, "auto", "_sno");
                        accessgettvinputcomposite1cp.getClass();
                        read(System.currentTimeMillis(), null, "auto", "_se");
                        j2 = 0;
                        lookaheadScopeKt3.PlaybackStateCompat.serializer(0L);
                    }
                    if (bundle2.getLong("extend_session", j2) == 1) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                        triggercallback.serializer.IconCompatParcelizer(j3);
                    }
                    arrayList2 = new ArrayList(bundle2.keySet());
                    Collections.sort(arrayList2);
                    size = arrayList2.size();
                    for (i = 0; i < size; i++) {
                        str5 = (String) arrayList2.get(i);
                        if (str5 != null) {
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                            obj = bundle2.get(str5);
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList3 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                            } else {
                                bundleArr = null;
                            }
                            if (bundleArr != null) {
                                bundle2.putParcelableArray(str5, bundleArr);
                            }
                        }
                    }
                    i2 = 0;
                    while (i2 < arrayList.size()) {
                        bundleSerializer = (Bundle) arrayList.get(i2);
                        if (i2 != 0) {
                            str4 = "_ep";
                        } else {
                            str4 = str2;
                        }
                        bundleSerializer.putString(str3, str);
                        onlayoutrectchangeddefault4 = onlayoutrectchangeddefault3;
                        if (z2) {
                            bundleSerializer = onlayoutrectchangeddefault4.serializer(bundleSerializer);
                        }
                        bundle3 = bundleSerializer;
                        ArrayList arrayList4 = arrayList;
                        zzbg zzbgVar = new zzbg(str4, new zzbe(bundle3), str, j);
                        setViewportBounds setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat();
                        setviewportboundsMediaDescriptionCompat.getClass();
                        setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
                        setviewportboundsMediaDescriptionCompat.serializer();
                        setviewportboundsMediaDescriptionCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        getparentwidth = ((LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).read();
                        getparentwidth.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        zza.IconCompatParcelizer(zzbgVar, parcelObtain, 0);
                        bArrMarshall = parcelObtain.marshall();
                        parcelObtain.recycle();
                        if (bArrMarshall.length > 131072) {
                            getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                            getlookaheaddelegate3.write.RemoteActionCompatParcelizer("Event is too long for local database. Sending event directly to service");
                            z8 = true;
                            zRemoteActionCompatParcelizer = false;
                        } else {
                            zRemoteActionCompatParcelizer = getparentwidth.RemoteActionCompatParcelizer(0, bArrMarshall);
                            z8 = true;
                        }
                        setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new cancelTimer(setviewportboundsMediaDescriptionCompat, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(z8), zRemoteActionCompatParcelizer, zzbgVar, 1));
                        if (!z6) {
                            it = this.RatingCompat.iterator();
                            while (it.hasNext()) {
                                ((minWidth) it.next()).write(j, new Bundle(bundle3), str, str2);
                            }
                        }
                        i2++;
                        onlayoutrectchangeddefault3 = onlayoutrectchangeddefault4;
                        arrayList = arrayList4;
                    }
                    LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
                    if (onFirstVisibleNode.IconCompatParcelizer(false) == null && "_ae".equals(str2)) {
                        LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                        accessgettvinputcomposite1cp.getClass();
                        triggercallback.write.RemoteActionCompatParcelizer(SystemClock.elapsedRealtime(), true, true);
                        return;
                    }
                    return;
                }
                return;
            }
            lookaheadScopeKt2 = lookaheadScopeKt;
            z6 = zEquals;
            if (lookaheadScopeKtLookaheadScope222.RemoteActionCompatParcelizer()) {
                return;
            }
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            iMediaSessionCompatQueueItem = onlayoutrectchangeddefault.MediaSessionCompatQueueItem(str2);
            if (iMediaSessionCompatQueueItem != 0) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaDescriptionCompat.serializer(zzgnVar.write(str2), "Invalid event name. Event will not be logged (FE)");
                String strIconCompatParcelizer2 = onLayoutRectChangeddefault.IconCompatParcelizer(str2, 40, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, iMediaSessionCompatQueueItem, "_ev", strIconCompatParcelizer2, length);
                return;
            }
            bundle2 = onlayoutrectchangeddefault.read(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle2);
            LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode2);
            onlayoutrectchangeddefault2 = onlayoutrectchangeddefault;
            if (onFirstVisibleNode2.IconCompatParcelizer(false) == null) {
                str3 = "_o";
                onlayoutrectchangeddefault3 = onlayoutrectchangeddefault2;
            } else {
                str3 = "_o";
                onlayoutrectchangeddefault3 = onlayoutrectchangeddefault2;
            }
            if ("auto".equals(str)) {
                if ("_ae".equals(str2)) {
                    LookaheadScopeKt lookaheadScopeKt8 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt8);
                    strRatingCompat = lookaheadScopeKt8.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat();
                    if (!TextUtils.isEmpty(strRatingCompat)) {
                        bundle2.putString("_ffr", strRatingCompat);
                    }
                }
            } else if ("_ae".equals(str2)) {
                LookaheadScopeKt lookaheadScopeKt9 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt9);
                strRatingCompat = lookaheadScopeKt9.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat();
                if (!TextUtils.isEmpty(strRatingCompat)) {
                    bundle2.putString("_ffr", strRatingCompat);
                }
            }
            arrayList = new ArrayList();
            arrayList.add(bundle2);
            if (setcomposedwithreusablecontenthost.write(null, premeasure0kLqBqw.onBackPressedDispatcher_delegatelambda0)) {
                LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                triggercallback.MediaSessionCompatToken();
                z7 = triggercallback.RatingCompat;
                lookaheadScopeKt3 = lookaheadScopeKt2;
            } else {
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
                lookaheadScopeKt3 = lookaheadScopeKt2;
                z7 = lookaheadScopeKt3.MediaSessionCompatResultReceiverWrapper.read();
            }
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt3);
            if (lookaheadScopeKt3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer() > 0) {
                onFirstVisibleNode = onFirstVisibleNode2;
                j2 = 0;
                j3 = j;
            } else if (lookaheadScopeKt3.serializer(j)) {
                onFirstVisibleNode = onFirstVisibleNode2;
                j3 = j;
                j2 = 0;
            } else {
                onFirstVisibleNode = onFirstVisibleNode2;
                j3 = j;
                j2 = 0;
            }
            if (bundle2.getLong("extend_session", j2) == 1) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                LookaheadScopeKtLookaheadScope221.serializer(triggercallback);
                triggercallback.serializer.IconCompatParcelizer(j3);
            }
            arrayList2 = new ArrayList(bundle2.keySet());
            Collections.sort(arrayList2);
            size = arrayList2.size();
            while (i < size) {
                str5 = (String) arrayList2.get(i);
                if (str5 != null) {
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                    obj = bundle2.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList5 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList5.toArray(new Bundle[arrayList5.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundle2.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            i2 = 0;
            while (i2 < arrayList.size()) {
                bundleSerializer = (Bundle) arrayList.get(i2);
                if (i2 != 0) {
                    str4 = "_ep";
                } else {
                    str4 = str2;
                }
                bundleSerializer.putString(str3, str);
                onlayoutrectchangeddefault4 = onlayoutrectchangeddefault3;
                if (z2) {
                    bundleSerializer = onlayoutrectchangeddefault4.serializer(bundleSerializer);
                }
                bundle3 = bundleSerializer;
                ArrayList arrayList6 = arrayList;
                zzbg zzbgVar2 = new zzbg(str4, new zzbe(bundle3), str, j);
                setViewportBounds setviewportboundsMediaDescriptionCompat2 = lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat();
                setviewportboundsMediaDescriptionCompat2.getClass();
                setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat2.serializer();
                setviewportboundsMediaDescriptionCompat2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                getparentwidth = ((LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).read();
                getparentwidth.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                zza.IconCompatParcelizer(zzbgVar2, parcelObtain2, 0);
                bArrMarshall = parcelObtain2.marshall();
                parcelObtain2.recycle();
                if (bArrMarshall.length > 131072) {
                    getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) getparentwidth.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                    getlookaheaddelegate4.write.RemoteActionCompatParcelizer("Event is too long for local database. Sending event directly to service");
                    z8 = true;
                    zRemoteActionCompatParcelizer = false;
                } else {
                    zRemoteActionCompatParcelizer = getparentwidth.RemoteActionCompatParcelizer(0, bArrMarshall);
                    z8 = true;
                }
                setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new cancelTimer(setviewportboundsMediaDescriptionCompat2, setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(z8), zRemoteActionCompatParcelizer, zzbgVar2, 1));
                if (!z6) {
                    it = this.RatingCompat.iterator();
                    while (it.hasNext()) {
                        ((minWidth) it.next()).write(j, new Bundle(bundle3), str, str2);
                    }
                }
                i2++;
                onlayoutrectchangeddefault3 = onlayoutrectchangeddefault4;
                arrayList = arrayList6;
            }
            LookaheadScopeKtLookaheadScope221.serializer(onFirstVisibleNode);
            if (onFirstVisibleNode.IconCompatParcelizer(false) == null) {
                return;
            } else {
                return;
            }
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Event not sent since app measurement is disabled");
    }
}
