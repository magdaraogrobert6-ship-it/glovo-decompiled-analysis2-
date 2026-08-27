package com.roadrunner.opportunities.map;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.rider.state.ondemand.presentation.GetOnDemandUiState;
import io.grpc.internal.CallTracer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidIdUtil;
import o.AttributionHandler;
import o.ShortNewsContentCardView;
import o.access102;
import o.accessgetInstancedelegatecp;
import o.checkEventToken;
import o.checkRevenue;
import o.createFromParcel;
import o.f8;
import o.f9;
import o.fa;
import o.ff;
import o.g0ExternalSyntheticLambda1;
import o.g5;
import o.gExternalSyntheticLambda1;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.isTrackingEnabled;
import o.o7ExternalSyntheticLambda3;
import o.onContentCardDismissed;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.s6;
import o.se;
import o.setLastHorizontalStyle;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCityBoundariesMapLayer$invoke$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ boolean serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetCityBoundariesMapLayer$invoke$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(3, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 27;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj5 = this.IconCompatParcelizer;
        if (i3 != 0) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            GetCityBoundariesMapLayer$invoke$1 getCityBoundariesMapLayer$invoke$1 = new GetCityBoundariesMapLayer$invoke$1((GetOnDemandUiState) obj5, (ShortNewsContentCardView) obj3, 1);
            getCityBoundariesMapLayer$invoke$1.write = (checkRevenue) obj;
            getCityBoundariesMapLayer$invoke$1.serializer = zBooleanValue;
            return getCityBoundariesMapLayer$invoke$1.invokeSuspend(createfromparcel2);
        }
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        GetCityBoundariesMapLayer$invoke$1 getCityBoundariesMapLayer$invoke$2 = new GetCityBoundariesMapLayer$invoke$1((CallTracer) obj5, (ShortNewsContentCardView) obj3, 0);
        getCityBoundariesMapLayer$invoke$2.write = (se) obj;
        getCityBoundariesMapLayer$invoke$2.serializer = zBooleanValue2;
        Object objInvokeSuspend = getCityBoundariesMapLayer$invoke$2.invokeSuspend(createfromparcel2);
        int i4 = RemoteActionCompatParcelizer + 5;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g5 g5Var;
        Object attributionHandler;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        Object obj3 = this.IconCompatParcelizer;
        if (i3 != 0) {
            checkRevenue checkrevenue = (checkRevenue) this.write;
            boolean z = this.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (z) {
                GetOnDemandUiState getOnDemandUiState = (GetOnDemandUiState) obj3;
                setTransactionSuccessful settransactionsuccessful = getOnDemandUiState.write;
                isTrackingEnabled istrackingenabled = checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
                checkEventToken checkeventtoken = checkrevenue.write;
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getOnDemandUiState.serializer.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue();
                if (getOnDemandUiState.read.serializer() || !zBooleanValue || istrackingenabled == isTrackingEnabled.SUSPENDED) {
                    attributionHandler = access102.read;
                } else if (istrackingenabled == isTrackingEnabled.NOT_WORKING) {
                    attributionHandler = new AndroidIdUtil(settransactionsuccessful.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful.IconCompatParcelizer(R.string.status_on_demand_working_description));
                } else if (checkeventtoken != null) {
                    attributionHandler = new AttributionHandler(settransactionsuccessful.IconCompatParcelizer(R.string.status_instant_working), settransactionsuccessful.IconCompatParcelizer(R.string.status_on_demand_working_description), checkeventtoken.RemoteActionCompatParcelizer);
                } else {
                    attributionHandler = access102.read;
                }
            } else {
                attributionHandler = access102.read;
            }
            int i4 = MediaBrowserCompatMediaItem + 9;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return attributionHandler;
            }
            obj2.hashCode();
            throw null;
        }
        se seVar = (se) this.write;
        boolean z2 = this.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        s6 s6Var = seVar.read;
        setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) ((CallTracer) obj3).serializer;
        if (s6Var == null) {
            return new f9(instance_delegatelambda0.write);
        }
        ArrayList<List> arrayList = s6Var.serializer;
        ArrayList<List> arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (List<o7ExternalSyntheticLambda3> list : arrayList) {
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 : list) {
                arrayList3.add(new f8(o7externalsyntheticlambda3.read, o7externalsyntheticlambda3.write));
            }
            arrayList2.add(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        for (List list2 : arrayList2) {
            int i5 = MediaBrowserCompatMediaItem + 55;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int iM776toArgb8_81llA = ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().setOnMenuItemClickListener());
            if (!(!z2)) {
                int i7 = RemoteActionCompatParcelizer + 35;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                g5Var = g5.NEVER;
            } else {
                g5Var = g5.ALWAYS;
            }
            arrayList4.add(new gExternalSyntheticLambda1(list2, 2.0d, iM776toArgb8_81llA, 0, g5Var, fa.serializer, 16));
            int i9 = MediaBrowserCompatMediaItem + 109;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 5 % 2;
            }
        }
        ff ffVar = new ff(ColorKt.m776toArgb8_81llA(setlasthorizontalstyle.IconCompatParcelizer().onLayout()), arrayList2);
        g0ExternalSyntheticLambda1 g0externalsyntheticlambda1 = new g0ExternalSyntheticLambda1(g5.ALWAYS);
        int iSerializer = getQueryParameterslambda2.serializer();
        f9 f9Var = new f9(onContentCardDismissed.RemoteActionCompatParcelizer((Collection) onContentCardDismissed.IconCompatParcelizer(arrayList4, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{ffVar}, getQueryParameterslambda2.serializer(), -516583649, iSerializer)), (Object) g0externalsyntheticlambda1));
        int i11 = RemoteActionCompatParcelizer + 81;
        MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return f9Var;
    }
}
