package com.roadrunner.settings.subscreens.navigation;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessgetOldDependencyp;
import o.accessgetStrictcp;
import o.applySpanStyle;
import o.createFromParcel;
import o.getCieXyz;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.instance_delegatelambda0;
import o.performViewCreated;
import o.r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U;
import o.r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c;
import o.r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI;
import o.r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o;
import o.r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.removeNodeAtDepth;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationSettingsViewModel$2$1 extends SuspendLambda implements r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 MediaDescriptionCompat;
    public /* synthetic */ Boolean RemoteActionCompatParcelizer;
    public /* synthetic */ Boolean read;
    public /* synthetic */ Boolean serializer;
    public /* synthetic */ Boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSettingsViewModel$2$1(r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94, ShortNewsContentCardView shortNewsContentCardView) {
        super(6, shortNewsContentCardView);
        this.MediaDescriptionCompat = r8lambdawf0f8_ok6qhelc2navzsyrule94;
    }

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = 2 % 2;
        NavigationSettingsViewModel$2$1 navigationSettingsViewModel$2$1 = new NavigationSettingsViewModel$2$1(this.MediaDescriptionCompat, (ShortNewsContentCardView) obj6);
        navigationSettingsViewModel$2$1.write = (Boolean) obj;
        navigationSettingsViewModel$2$1.IconCompatParcelizer = (String) obj2;
        navigationSettingsViewModel$2$1.serializer = (Boolean) obj3;
        navigationSettingsViewModel$2$1.RemoteActionCompatParcelizer = (Boolean) obj4;
        navigationSettingsViewModel$2$1.read = (Boolean) obj5;
        Object objInvokeSuspend = navigationSettingsViewModel$2$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = RatingCompat + 1;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        List list;
        boolean z;
        r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri;
        int i = 2 % 2;
        Boolean bool = this.write;
        String str = this.IconCompatParcelizer;
        Boolean bool2 = this.serializer;
        Boolean bool3 = this.RemoteActionCompatParcelizer;
        Boolean bool4 = this.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = this.MediaDescriptionCompat;
        O$b o$b = r8lambdawf0f8_ok6qhelc2navzsyrule94.serializer;
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri2 = ((r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) r8lambdawf0f8_ok6qhelc2navzsyrule94.MediaSessionCompatResultReceiverWrapper.read()).write;
        if (r8lambdav9hvubmv32qeolrxalsjens1hri2 != null) {
            int i2 = MediaBrowserCompatMediaItem + 63;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            boolValueOf = Boolean.valueOf(r8lambdav9hvubmv32qeolrxalsjens1hri2.write);
        } else {
            boolValueOf = null;
        }
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) o$b.read;
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) o$b.write;
        accessgetStrictcp accessgetstrictcp = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, settransactionsuccessful.IconCompatParcelizer(R.string.preference_turn_by_turn_external_app)}, getCieXyz.write())).booleanValue() ? accessgetStrictcp.EXTERNAL : accessgetStrictcp.IN_APP;
        boolean zBooleanValue3 = bool2 != null ? bool2.booleanValue() : ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.IconCompatParcelizer("turn_by_turn_avoidance_settings_default_value");
        boolean zBooleanValue4 = bool3 != null ? bool3.booleanValue() : ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.IconCompatParcelizer("turn_by_turn_avoidance_settings_default_value");
        accessgetOldDependencyp accessgetolddependencyp = (accessgetOldDependencyp) o$b.RemoteActionCompatParcelizer;
        if (((performViewCreated) o$b.serializer).serializer()) {
            getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getstyleable_vector_drawable_path_trim_path_offset = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) accessgetolddependencyp;
            String str2 = settransactionsuccessful.read(R.string.settings_brand_navigation, getstyleable_vector_drawable_path_trim_path_offset.IconCompatParcelizer);
            String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.settings_powered_by_mapbox);
            accessgetStrictcp accessgetstrictcp2 = accessgetStrictcp.IN_APP;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            firebaseRemoteConfigImpl.getClass();
            boolean zBooleanValue5 = ((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{firebaseRemoteConfigImpl, updateAdidI.IS_TURN_BY_TURN_SETTINGS_M1_ENABLED})).booleanValue();
            List list2 = instance_delegatelambda0.write;
            if (zBooleanValue5) {
                String str3 = settransactionsuccessful.read(R.string.turn_by_turn_settings_requires_brand_navigation, getstyleable_vector_drawable_path_trim_path_offset.IconCompatParcelizer);
                list2 = SQLite.read(new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_HIGHWAYS, null, settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_avoid_highways), str3, zBooleanValue3), new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVIGATION_AVOID_TOLLS, null, settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_avoid_tolls), str3, zBooleanValue4));
            }
            list = SQLite.read(new r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ(str2, strIconCompatParcelizer, accessgetstrictcp2, list2), new r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ(settransactionsuccessful.IconCompatParcelizer(R.string.settings_external_navigation), settransactionsuccessful.IconCompatParcelizer(R.string.settings_external_navigation_description), accessgetStrictcp.EXTERNAL, list2));
        } else {
            accessgetstrictcp = accessgetstrictcp;
            boolValueOf = boolValueOf;
            list = null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
        firebaseRemoteConfigImpl2.getClass();
        if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_NAVER_MAPS_ENABLED)) {
            r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = null;
        } else {
            r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u = r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.MAP_METRICS;
            String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.settings_mapbox_metrics_title);
            String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.settings_mapbox_metrics_description);
            if (bool != null) {
                int i4 = RatingCompat + 103;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    zBooleanValue = bool.booleanValue();
                    int i5 = 41 / 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                z = zBooleanValue;
            } else {
                z = false;
            }
            r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14uieahlprgfczvsqchol6u, Integer.valueOf(R.drawable.ic_bold_large_map_person), strIconCompatParcelizer2, strIconCompatParcelizer3, z);
        }
        if (((applySpanStyle) o$b.IconCompatParcelizer).serializer()) {
            r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U r8lambda7pyt14uieahlprgfczvsqchol6u2 = r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.NAVER_ROUTE_PREVIEW;
            String strIconCompatParcelizer4 = settransactionsuccessful.IconCompatParcelizer(R.string.show_delivery_routes);
            if (bool4 != null) {
                int i6 = MediaBrowserCompatMediaItem + 113;
                RatingCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                zBooleanValue2 = bool4.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2 = new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14uieahlprgfczvsqchol6u2, null, strIconCompatParcelizer4, null, zBooleanValue2);
            String strIconCompatParcelizer5 = settransactionsuccessful.IconCompatParcelizer(R.string.naver_route_preview_delivery_route_guide);
            String strIconCompatParcelizer6 = settransactionsuccessful.IconCompatParcelizer(R.string.naver_route_preview_description_heading);
            List list3 = SQLite.read(Integer.valueOf(R.string.naver_route_preview_description_first), Integer.valueOf(R.string.naver_route_preview_description_second), Integer.valueOf(R.string.naver_route_preview_description_third), Integer.valueOf(R.string.naver_route_preview_description_fourth));
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
            Iterator it = list3.iterator();
            int i8 = MediaBrowserCompatMediaItem + 73;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            while (it.hasNext()) {
                int i10 = MediaBrowserCompatMediaItem + 45;
                RatingCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    arrayList.add(settransactionsuccessful.IconCompatParcelizer(((Number) it.next()).intValue()));
                    throw null;
                }
                arrayList.add(settransactionsuccessful.IconCompatParcelizer(((Number) it.next()).intValue()));
            }
            r8lambdav9hvubmv32qeolrxalsjens1hri = new r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c2, strIconCompatParcelizer5, strIconCompatParcelizer6, removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList), settransactionsuccessful.IconCompatParcelizer(R.string.naver_route_preview_got_it), boolValueOf != null ? boolValueOf.booleanValue() : false);
        } else {
            r8lambdav9hvubmv32qeolrxalsjens1hri = null;
        }
        return new r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o(accessgetstrictcp, list, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdav9hvubmv32qeolrxalsjens1hri);
    }
}
