package com.mapbox.search;

import android.app.Application;
import android.content.Context;
import android.graphics.Paint;
import android.util.TypedValue;
import androidx.sqlite.SQLite;
import com.huawei.agconnect.config.impl.m;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.logistics.rider.glovo.R;
import com.mapbox.search.base.BaseSearchSdkInitializerImpl;
import com.mapbox.search.base.perf.PerformanceTracker;
import com.mapbox.search.base.result.SearchResultFactory;
import com.mapbox.search.record.DataProviderEngineRegistrationServiceImpl;
import com.mapbox.search.record.HistoryDataProviderImpl;
import com.mapbox.search.utils.file.InternalFileSystem;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Lambda;
import o.a9;
import o.copyColorMatrixgBh15pIdefault;
import o.createFromParcel;
import o.getOrElseNullable;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxSearchSdkInitializerImpl implements copyColorMatrixgBh15pIdefault {

    /* JADX INFO: renamed from: com.mapbox.search.MapboxSearchSdkInitializerImpl$create$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Context context, int i) {
            super(0);
            this.$r8$classId = i;
            this.$context = context;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            Context context = this.$context;
            final int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    return LazyKt__LazyJVMKt.read(context, "image_upload_tracker");
                }
                Paint paint = new Paint();
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.customerChatPrimaryColor, typedValue, true);
                paint.setColor(context.getColor(typedValue.resourceId));
                return paint;
            }
            MapboxSearchSdk mapboxSearchSdk = MapboxSearchSdk.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            Application application = (Application) applicationContext;
            final int i3 = 0;
            p0 p0Var = new p0(0);
            IsFixableByRetry isFixableByRetry = new IsFixableByRetry(10);
            a9 a9Var = new a9(application, false, (byte) 0);
            a9 a9Var2 = new a9(application, false, (byte) 0);
            m mVar = new m(application, 14, new InternalFileSystem());
            MapboxSearchSdk.timeProvider = p0Var;
            MapboxSearchSdk.uuidProvider = isFixableByRetry;
            MapboxSearchSdk.searchRequestContextProvider = new Vw$Vw(a9Var, 16, a9Var2);
            MapboxSearchSdk.indexableDataProvidersRegistry = new H$b(new DataProviderEngineRegistrationServiceImpl());
            MapboxSearchSdk$initialize$1 mapboxSearchSdk$initialize$1 = new MapboxSearchSdk$initialize$1(mVar, p0Var);
            MapboxSearchSdk$initialize$1 mapboxSearchSdk$initialize$2 = new MapboxSearchSdk$initialize$1(mVar);
            final N$b n$b = new N$b();
            n$b.read = mapboxSearchSdk$initialize$1;
            n$b.write = mapboxSearchSdk$initialize$2;
            n$b.IconCompatParcelizer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.ServiceProviderImpl$historyDataProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i4 = i3;
                    N$b n$b2 = n$b;
                    return i4 != 0 ? (getOrElseNullable) ((MapboxSearchSdk$initialize$1) n$b2.write).invoke() : (HistoryDataProviderImpl) ((MapboxSearchSdk$initialize$1) n$b2.read).invoke();
                }
            });
            n$b.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.search.ServiceProviderImpl$historyDataProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i4 = i2;
                    N$b n$b2 = n$b;
                    return i4 != 0 ? (getOrElseNullable) ((MapboxSearchSdk$initialize$1) n$b2.write).invoke() : (HistoryDataProviderImpl) ((MapboxSearchSdk$initialize$1) n$b2.read).invoke();
                }
            });
            ServiceProvider$Companion.INTERNAL_INSTANCE = n$b;
            H$b h$b = MapboxSearchSdk.indexableDataProvidersRegistry;
            if (h$b != null) {
                MapboxSearchSdk.searchResultFactory = new SearchResultFactory(h$b);
                return createFromParcel.INSTANCE;
            }
            removeNodeAtDepth.serializer("indexableDataProvidersRegistry");
            throw null;
        }
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{BaseSearchSdkInitializerImpl.class}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) {
        context.getClass();
        PerformanceTracker.trackPerformanceSync("MapboxSearchSdkInitializerImpl#create", new AnonymousClass1(context, 0));
        return MapboxSearchSdk.INSTANCE;
    }
}
