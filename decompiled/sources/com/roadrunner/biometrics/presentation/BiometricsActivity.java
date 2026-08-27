package com.roadrunner.biometrics.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.network.NetworkFetcher;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation;
import com.ui.common.base.BaseInjectionActivity;
import java.io.Serializable;
import o.AndroidContentCaptureManager;
import o.DragAndDropTargetModifierNode;
import o.ExecuteDelayUsingPostAndRemove;
import o.SemanticsSortKt;
import o.SemanticsSortKtUnmergedConfigComparator12;
import o.SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1;
import o.SemanticsSortKtsortByGeometryGroupings1;
import o.SemanticsSortKtspecialinlinedthenBy1;
import o.SemanticsSortKtspecialinlinedthenBy2;
import o.TopBottomBoundsComparator;
import o.createFromParcel;
import o.createImageBitmap;
import o.displayInAppMessagelambda1;
import o.ff;
import o.geometryDepthFirstSearch;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getQueryParameterslambda2;
import o.onViewDetachedFromWindowlambda1;
import o.placedEntryRowOverlaps;
import o.r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.sortByGeometryGroupings;
import o.sortByGeometryGroupingsdefault;
import o.sortByGeometryGroupingslambda1;
import o.subtreeSortedByGeometryGrouping;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes3.dex */
public final class BiometricsActivity extends BaseInjectionActivity {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompatCustomAction = 1;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public SemanticsSortKtspecialinlinedthenBy1 MediaBrowserCompatMediaItem;
    private SemanticsSortKtsortByGeometryGroupings1 MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY MediaSessionCompatQueueItem;
    private final onViewDetachedFromWindowlambda1 RatingCompat;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~(i7 | i2);
        int i9 = ~i2;
        int i10 = ~(i9 | i3);
        int i11 = ~((~i) | i2);
        int i12 = i10 | i11;
        int i13 = i11 | (~(i7 | i9));
        int i14 = i2 + i3 + i5 + ((-1232316077) * i4) + ((-263306238) * i6);
        int i15 = i14 * i14;
        int i16 = (((-69115011) * i2) - 1785593856) + (933837065 * i3) + (763021048 * i8) + (1765973124 * i12) + ((-1765973124) * i13) + (1696858112 * i5) + (1319895040 * i4) + (1514668032 * i6) + (1334968320 * i15);
        int i17 = ((i2 * (-2046307327)) - 1888090795) + (i3 * (-2046308995)) + (i8 * 1112) + (i12 * (-556)) + (i13 * 556) + (i5 * (-2046307883)) + (i4 * 1526207759) + (i6 * (-1095616598)) + (i15 * 1719271424);
        int i18 = i16 + (i17 * i17 * 2111700992);
        if (i18 != 1) {
            return i18 != 2 ? IconCompatParcelizer(objArr) : read(objArr);
        }
        return serializer(objArr);
    }

    public static final /* synthetic */ void write(BiometricsActivity biometricsActivity, sortByGeometryGroupingsdefault sortbygeometrygroupingsdefault) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 41;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        biometricsActivity.IconCompatParcelizer(sortbygeometrygroupingsdefault);
        int i4 = ParcelableVolumeInfo + 107;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(BiometricsActivity biometricsActivity, SemanticsSortKt semanticsSortKt, getBirthDateFull getbirthdatefull, int i) {
        createFromParcel createfromparcel;
        int i2 = 2 % 2;
        int i3 = ParcelableVolumeInfo + 85;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            createfromparcel = (createFromParcel) read(ff.IconCompatParcelizer(), 2041808490, -2041808490, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), new Object[]{biometricsActivity, semanticsSortKt, getbirthdatefull, Integer.valueOf(i)});
            int i4 = 89 / 0;
        } else {
            createfromparcel = (createFromParcel) read(ff.IconCompatParcelizer(), 2041808490, -2041808490, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), new Object[]{biometricsActivity, semanticsSortKt, getbirthdatefull, Integer.valueOf(i)});
        }
        int i5 = PlaybackStateCompatCustomAction + 95;
        ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    public static /* synthetic */ createImageBitmap IconCompatParcelizer(BiometricsActivity biometricsActivity) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 15;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return write(biometricsActivity);
        }
        int i3 = 19 / 0;
        return write(biometricsActivity);
    }

    public static final /* synthetic */ SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 RemoteActionCompatParcelizer(BiometricsActivity biometricsActivity) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 63;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return biometricsActivity.MediaSessionCompatQueueItem();
        }
        int i3 = 92 / 0;
        return biometricsActivity.MediaSessionCompatQueueItem();
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(BiometricsActivity biometricsActivity, sortByGeometryGroupingslambda1 sortbygeometrygroupingslambda1) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 25;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            IconCompatParcelizer(biometricsActivity, sortbygeometrygroupingslambda1);
            throw null;
        }
        createFromParcel createfromparcelIconCompatParcelizer = IconCompatParcelizer(biometricsActivity, sortbygeometrygroupingslambda1);
        int i3 = PlaybackStateCompatCustomAction + 63;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return createfromparcelIconCompatParcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        BiometricsActivity biometricsActivity = (BiometricsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 97;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return serializer(biometricsActivity);
        }
        serializer(biometricsActivity);
        throw null;
    }

    private static final createImageBitmap write(BiometricsActivity biometricsActivity) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 125;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return biometricsActivity.write();
        }
        int i3 = 52 / 0;
        return biometricsActivity.write();
    }

    public BiometricsActivity() {
        int i = 0;
        this.RatingCompat = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1.class), new SemanticsSortKtspecialinlinedthenBy2(this, i), new subtreeSortedByGeometryGrouping(this, i), new SemanticsSortKtspecialinlinedthenBy2(this, 1));
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 43;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setResult(-1);
            finish();
        } else {
            setResult(-1);
            finish();
            throw null;
        }
    }

    private final void serializer() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 55;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        setResult(i2 % 2 == 0 ? 1 : 0);
        finish();
    }

    private final SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 47;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 = (SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1) this.RatingCompat.MediaSessionCompatResultReceiverWrapper();
        int i4 = ParcelableVolumeInfo + 123;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SemanticsSortKtspecialinlinedthenBy1 read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 43;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SemanticsSortKtspecialinlinedthenBy1 semanticsSortKtspecialinlinedthenBy1 = this.MediaBrowserCompatMediaItem;
        if (semanticsSortKtspecialinlinedthenBy1 == null) {
            removeNodeAtDepth.serializer("biometricsLifecycleFactory");
            throw null;
        }
        int i4 = i2 + 117;
        ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsSortKtspecialinlinedthenBy1;
    }

    private static final createFromParcel serializer(BiometricsActivity biometricsActivity) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 113;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            biometricsActivity.MediaSessionCompatQueueItem().IconCompatParcelizer();
            biometricsActivity.serializer();
            return createFromParcel.INSTANCE;
        }
        biometricsActivity.MediaSessionCompatQueueItem().IconCompatParcelizer();
        biometricsActivity.serializer();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }

    public final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY write() {
        int i = 2 % 2;
        r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.MediaSessionCompatQueueItem;
        if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
            removeNodeAtDepth.serializer("viewModelFactory");
            throw null;
        }
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 49;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdaudhhxliolpu0hpccqh6voskpny;
    }

    private final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("biometrics_result_password_key", str);
        setResult(-1, intent);
        finish();
        int i2 = PlaybackStateCompatCustomAction + 29;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final SemanticsSortKt RatingCompat() {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 55;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            getIntent().getExtras();
            obj.hashCode();
            throw null;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            SemanticsSortKt semanticsSortKt = (SemanticsSortKt) ((Serializable) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 839340738, new Object[]{extras, "biometrics_mode_key", SemanticsSortKt.class}, getQueryParameterslambda2.serializer(), -839340732, iSerializer));
            if (semanticsSortKt != null) {
                return semanticsSortKt;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Launch mode should be either encryption or decryption");
        int i3 = PlaybackStateCompatCustomAction + 109;
        ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return null;
    }

    private final void IconCompatParcelizer(sortByGeometryGroupingsdefault sortbygeometrygroupingsdefault) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo;
        int i3 = i2 + 7;
        PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (sortbygeometrygroupingsdefault instanceof geometryDepthFirstSearch) {
            int i5 = i2 + 45;
            PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            RemoteActionCompatParcelizer();
            int i7 = PlaybackStateCompatCustomAction + 125;
            ParcelableVolumeInfo = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return;
        }
        if (sortbygeometrygroupingsdefault instanceof sortByGeometryGroupings) {
            RemoteActionCompatParcelizer(((sortByGeometryGroupings) sortbygeometrygroupingsdefault).write());
        } else if (!(sortbygeometrygroupingsdefault instanceof placedEntryRowOverlaps)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        } else {
            serializer();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[DONT_INVERT, PHI: r5
  0x002d: PHI (r5v3 int) = (r5v2 int), (r5v12 int) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    private static final createFromParcel IconCompatParcelizer(BiometricsActivity biometricsActivity, sortByGeometryGroupingslambda1 sortbygeometrygroupingslambda1) {
        int i;
        SemanticsSortKtsortByGeometryGroupings1 semanticsSortKtsortByGeometryGroupings1;
        SemanticsSortKtsortByGeometryGroupings1 semanticsSortKtsortByGeometryGroupings2;
        int i2;
        int i3 = 2 % 2;
        int i4 = ParcelableVolumeInfo + 95;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 == 0) {
            sortbygeometrygroupingslambda1.getClass();
            i = SemanticsSortKtUnmergedConfigComparator12.RemoteActionCompatParcelizer[sortbygeometrygroupingslambda1.ordinal()];
            if (i == 0) {
                semanticsSortKtsortByGeometryGroupings2 = biometricsActivity.MediaDescriptionCompat;
                if (semanticsSortKtsortByGeometryGroupings2 != null) {
                    removeNodeAtDepth.serializer("biometricsLifecycleObserver");
                    throw null;
                }
                i2 = ParcelableVolumeInfo + 49;
                PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    semanticsSortKtsortByGeometryGroupings2.serializer();
                    obj.hashCode();
                    throw null;
                }
                semanticsSortKtsortByGeometryGroupings2.serializer();
            } else {
                if (i == 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                semanticsSortKtsortByGeometryGroupings1 = biometricsActivity.MediaDescriptionCompat;
                if (semanticsSortKtsortByGeometryGroupings1 != null) {
                    removeNodeAtDepth.serializer("biometricsLifecycleObserver");
                    throw null;
                }
                int i5 = ParcelableVolumeInfo + 71;
                PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                semanticsSortKtsortByGeometryGroupings1.IconCompatParcelizer();
                int i7 = ParcelableVolumeInfo + 83;
                PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            sortbygeometrygroupingslambda1.getClass();
            i = SemanticsSortKtUnmergedConfigComparator12.RemoteActionCompatParcelizer[sortbygeometrygroupingslambda1.ordinal()];
            if (i == 1) {
                semanticsSortKtsortByGeometryGroupings2 = biometricsActivity.MediaDescriptionCompat;
                if (semanticsSortKtsortByGeometryGroupings2 != null) {
                    removeNodeAtDepth.serializer("biometricsLifecycleObserver");
                    throw null;
                }
                i2 = ParcelableVolumeInfo + 49;
                PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    semanticsSortKtsortByGeometryGroupings2.serializer();
                    obj.hashCode();
                    throw null;
                }
                semanticsSortKtsortByGeometryGroupings2.serializer();
            } else {
                if (i == 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                semanticsSortKtsortByGeometryGroupings1 = biometricsActivity.MediaDescriptionCompat;
                if (semanticsSortKtsortByGeometryGroupings1 != null) {
                    removeNodeAtDepth.serializer("biometricsLifecycleObserver");
                    throw null;
                }
                int i9 = ParcelableVolumeInfo + 71;
                PlaybackStateCompatCustomAction = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                semanticsSortKtsortByGeometryGroupings1.IconCompatParcelizer();
                int i11 = ParcelableVolumeInfo + 83;
                PlaybackStateCompatCustomAction = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        }
        return createFromParcel.INSTANCE;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        String string;
        BiometricsActivity biometricsActivity = (BiometricsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 7;
        ParcelableVolumeInfo = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Bundle extras = biometricsActivity.getIntent().getExtras();
        if (extras != null) {
            string = extras.getString("biometrics_password_key");
        } else {
            int i4 = ParcelableVolumeInfo + 19;
            PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            string = null;
        }
        biometricsActivity.MediaDescriptionCompat = ((TopBottomBoundsComparator) biometricsActivity.read()).serializer(biometricsActivity, string, new NetworkFetcher.AnonymousClass2(biometricsActivity));
        supportsColorMatrixQuery lifecycle = biometricsActivity.getLifecycle();
        SemanticsSortKtsortByGeometryGroupings1 semanticsSortKtsortByGeometryGroupings1 = biometricsActivity.MediaDescriptionCompat;
        if (semanticsSortKtsortByGeometryGroupings1 == null) {
            removeNodeAtDepth.serializer("biometricsLifecycleObserver");
            throw null;
        }
        int i6 = ParcelableVolumeInfo + 13;
        PlaybackStateCompatCustomAction = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        lifecycle.IconCompatParcelizer(semanticsSortKtsortByGeometryGroupings1);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c A[PHI: r11
  0x008c: PHI (r11v5 o.SemanticsSortKt) = (r11v1 o.SemanticsSortKt), (r11v6 o.SemanticsSortKt) binds: [B:8:0x006a, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x006c A[PHI: r1 r11
  0x006c: PHI (r1v6 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x006a, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r11v2 o.SemanticsSortKt) = (r11v1 o.SemanticsSortKt), (r11v6 o.SemanticsSortKt) binds: [B:8:0x006a, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        SemanticsSortKt semanticsSortKtRatingCompat;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = ParcelableVolumeInfo + 47;
        PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            super.onCreate(bundle);
            int iSerializer = r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4.serializer();
            int iIconCompatParcelizer = ff.IconCompatParcelizer();
            read(iSerializer, -24032120, 24032121, ff.IconCompatParcelizer(), iIconCompatParcelizer, ff.IconCompatParcelizer(), new Object[]{this});
            semanticsSortKtRatingCompat = RatingCompat();
            i = SemanticsSortKtUnmergedConfigComparator12.read[semanticsSortKtRatingCompat.ordinal()];
            if (i != 1) {
                i2 = PlaybackStateCompatCustomAction + 43;
                int i6 = i2 % Fields.SpotShadowColor;
                ParcelableVolumeInfo = i6;
                if (i2 % 2 != 0 ? i != 2 : i != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                int i7 = i6 + 49;
                PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = R.style.Theme_RoadRunner_Transparent;
            } else {
                i3 = R.style.Theme_RoadRunner;
            }
        } else {
            super.onCreate(bundle);
            int iSerializer2 = r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4.serializer();
            int iIconCompatParcelizer2 = ff.IconCompatParcelizer();
            read(iSerializer2, -24032120, 24032121, ff.IconCompatParcelizer(), iIconCompatParcelizer2, ff.IconCompatParcelizer(), new Object[]{this});
            semanticsSortKtRatingCompat = RatingCompat();
            i = SemanticsSortKtUnmergedConfigComparator12.read[semanticsSortKtRatingCompat.ordinal()];
            if (i != 1) {
                i2 = PlaybackStateCompatCustomAction + 43;
                int i9 = i2 % Fields.SpotShadowColor;
                ParcelableVolumeInfo = i9;
                if (i2 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
            }
            i3 = R.style.Theme_RoadRunner;
        }
        setTheme(i3);
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(this, 12, semanticsSortKtRatingCompat), true, -1034721503));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        boolean z;
        BiometricsActivity biometricsActivity = (BiometricsActivity) objArr[0];
        int i = 1;
        SemanticsSortKt semanticsSortKt = (SemanticsSortKt) objArr[1];
        getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i3 = ParcelableVolumeInfo + 1;
            PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        boolean zWrite = getpostalcode.write(iIntValue & 1, z);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (zWrite) {
            r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg r8lambdag2lta7vzpqrir3ldpv_t1nztszg = (r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg) ExtrasKt.write(biometricsActivity.MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(), getpostalcode, 0).getValue();
            getQueryContext getquerycontext = biometricsActivity.MediaSessionCompatQueueItem().read();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(biometricsActivity);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!zIconCompatParcelizer) {
                int i5 = ParcelableVolumeInfo + 33;
                PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new f2$$ExternalSyntheticLambda4(27, biometricsActivity);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new f2$$ExternalSyntheticLambda4(27, biometricsActivity);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            if (semanticsSortKt == SemanticsSortKt.ENCRYPTION) {
                int i7 = ParcelableVolumeInfo + 57;
                PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getpostalcode.serializer(-407404972);
                Modifier modifierThen = Modifier.Companion.then(SizeKt.read);
                SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1MediaSessionCompatQueueItem = biometricsActivity.MediaSessionCompatQueueItem();
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1MediaSessionCompatQueueItem);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer2)) {
                    objComponentActivity2 = new MapboxNavigation.AnonymousClass15(semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1MediaSessionCompatQueueItem);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    int i9 = PlaybackStateCompatCustomAction + 77;
                    ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        int i10 = 27 / 0;
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new MapboxNavigation.AnonymousClass15(semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1MediaSessionCompatQueueItem);
                            getpostalcode.write(objComponentActivity2);
                        }
                    } else if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new MapboxNavigation.AnonymousClass15(semanticsSortKtgeometryDepthFirstSearchisTraversalGroup1MediaSessionCompatQueueItem);
                        getpostalcode.write(objComponentActivity2);
                    }
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(biometricsActivity);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new subtreeSortedByGeometryGrouping(biometricsActivity, i);
                    getpostalcode.write(objComponentActivity3);
                    int i11 = ParcelableVolumeInfo + 29;
                    PlaybackStateCompatCustomAction = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                }
                ExecuteDelayUsingPostAndRemove.IconCompatParcelizer(r8lambdag2lta7vzpqrir3ldpv_t1nztszg, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, modifierThen, getpostalcode, 3072);
                getpostalcode.IconCompatParcelizer(false);
                return createfromparcel;
            }
            getpostalcode.serializer(-407029996);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(biometricsActivity);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (!(!zIconCompatParcelizer4) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DiskLruCache$launchCleanup$1(biometricsActivity, null, 15);
                getpostalcode.write(objComponentActivity4);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
            getpostalcode.IconCompatParcelizer(false);
            return createfromparcel;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return createfromparcel;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private static final createFromParcel RemoteActionCompatParcelizer(BiometricsActivity biometricsActivity, SemanticsSortKt semanticsSortKt, getBirthDateFull getbirthdatefull, int i) {
        Object[] objArr = {biometricsActivity, semanticsSortKt, getbirthdatefull, Integer.valueOf(i)};
        return (createFromParcel) read(ff.IconCompatParcelizer(), 2041808490, -2041808490, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), objArr);
    }

    private final void MediaMetadataCompat() {
        int iSerializer = r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4.serializer();
        int iIconCompatParcelizer = ff.IconCompatParcelizer();
        read(iSerializer, -24032120, 24032121, ff.IconCompatParcelizer(), iIconCompatParcelizer, ff.IconCompatParcelizer(), new Object[]{this});
    }

    public static /* synthetic */ createFromParcel read(BiometricsActivity biometricsActivity) {
        int iIconCompatParcelizer = ff.IconCompatParcelizer();
        int iIconCompatParcelizer2 = ff.IconCompatParcelizer();
        return (createFromParcel) read(iIconCompatParcelizer, 1147637191, -1147637189, ff.IconCompatParcelizer(), iIconCompatParcelizer2, ff.IconCompatParcelizer(), new Object[]{biometricsActivity});
    }
}
