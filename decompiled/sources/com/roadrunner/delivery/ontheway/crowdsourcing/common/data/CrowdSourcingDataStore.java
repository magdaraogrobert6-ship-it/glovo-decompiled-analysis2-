package com.roadrunner.delivery.ontheway.crowdsourcing.common.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.LocalAuthDataSource;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.accessgetAsciicp;
import o.accessgetEmailcp;
import o.accessgetNumberPasswordcp;
import o.accessgetPasswordcp;
import o.accessgetPhonecp;
import o.accessgetTextcp;
import o.accessgetUricp;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getAsciiPjHm6EEannotations;
import o.getDecimalPjHm6EEannotations;
import o.getNoActiveChildannotations;
import o.getNumberPjHm6EEannotations;
import o.isRoot;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CrowdSourcingDataStore {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final performCustomExitMxy_nc0 serializer;
    public final isRoot MediaMetadataCompat = new isRoot("PREF_KEY_CROWDSOURCING_TERMS_ACCEPTED");
    public final isRoot write = new isRoot("pref_key_crowdsourcing_add_photos_tooltip_shown_count");
    public final isRoot read = new isRoot("pref_key_crowdsourcing_existing_photos_tooltip_shown_count");
    public final isRoot RemoteActionCompatParcelizer = new isRoot("pref_key_crowdsourcing_add_photos_tooltip_shown_last_address");
    public final isRoot IconCompatParcelizer = new isRoot("pref_key_crowdsourcing_has_photos_tooltip_shown_last_address");

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore$setAddPhotosTooltipShownCount$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RatingCompat = 1;
        private static int write;
        public final /* synthetic */ int IconCompatParcelizer;
        public /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ CrowdSourcingDataStore serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(CrowdSourcingDataStore crowdSourcingDataStore, int i, ShortNewsContentCardView shortNewsContentCardView, int i2) {
            super(2, shortNewsContentCardView);
            this.read = i2;
            this.serializer = crowdSourcingDataStore;
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = RatingCompat + 115;
            write = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = this.read;
            int i4 = this.IconCompatParcelizer;
            CrowdSourcingDataStore crowdSourcingDataStore = this.serializer;
            if (i3 != 0) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(crowdSourcingDataStore, i4, shortNewsContentCardView, 1);
                anonymousClass2.RemoteActionCompatParcelizer = obj;
                return anonymousClass2;
            }
            AnonymousClass2 anonymousClass3 = new AnonymousClass2(crowdSourcingDataStore, i4, shortNewsContentCardView, 0);
            anonymousClass3.RemoteActionCompatParcelizer = obj;
            int i5 = RatingCompat + 83;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return anonymousClass3;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i2 != 0) {
                ((AnonymousClass2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = RatingCompat + 87;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            }
            ((AnonymousClass2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = write + 101;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 30 / 0;
            }
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = this.IconCompatParcelizer;
            CrowdSourcingDataStore crowdSourcingDataStore = this.serializer;
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
            if (i2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write(crowdSourcingDataStore.read, new Integer(i3));
                int i4 = RatingCompat + 67;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.write(crowdSourcingDataStore.write, new Integer(i3));
            int i6 = RatingCompat + 113;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return createfromparcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.crowdsourcing.common.data.CrowdSourcingDataStore$setAddPhotosTooltipShownLastAddress$2, reason: invalid class name and case insensitive filesystem */
    public final class C01482 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaSessionCompatQueueItem = 1;
        private static int serializer;
        public final /* synthetic */ int IconCompatParcelizer;
        public /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ CrowdSourcingDataStore read;
        public final /* synthetic */ String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C01482(CrowdSourcingDataStore crowdSourcingDataStore, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.read = crowdSourcingDataStore;
            this.write = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 15;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            String str = this.write;
            CrowdSourcingDataStore crowdSourcingDataStore = this.read;
            if (i4 != 0) {
                C01482 c01482 = new C01482(crowdSourcingDataStore, str, shortNewsContentCardView, 1);
                c01482.RemoteActionCompatParcelizer = obj;
                return c01482;
            }
            C01482 c01483 = new C01482(crowdSourcingDataStore, str, shortNewsContentCardView, 0);
            c01483.RemoteActionCompatParcelizer = obj;
            int i5 = MediaSessionCompatQueueItem + 37;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
            }
            return c01483;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 81;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 == 0) {
                ((C01482) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((C01482) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = serializer + 55;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 37 / 0;
            }
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = serializer + 89;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            String str = this.write;
            CrowdSourcingDataStore crowdSourcingDataStore = this.read;
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardfocussearch.write(crowdSourcingDataStore.IconCompatParcelizer, str);
                return createfromparcel2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            backwardfocussearch.write(crowdSourcingDataStore.RemoteActionCompatParcelizer, str);
            int i4 = serializer + 41;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
    }

    public CrowdSourcingDataStore(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        this.serializer = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object getAddPhotosTooltipShownLastAddress(ContinuationImpl continuationImpl) {
        accessgetAsciicp accessgetasciicp;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 105;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof accessgetAsciicp;
            throw null;
        }
        if (continuationImpl instanceof accessgetAsciicp) {
            accessgetasciicp = (accessgetAsciicp) continuationImpl;
            int i3 = accessgetasciicp.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                accessgetasciicp.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                accessgetasciicp = new accessgetAsciicp(this, continuationImpl);
                int i4 = MediaDescriptionCompat + 103;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            accessgetasciicp = new accessgetAsciicp(this, continuationImpl);
            int i6 = MediaDescriptionCompat + 103;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Object objFirstOrNull = accessgetasciicp.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = accessgetasciicp.IconCompatParcelizer;
        if (i8 != 0) {
            int i9 = MediaDescriptionCompat + 9;
            int i10 = i9 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i10;
            int i11 = i9 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = i10 + 53;
            MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = this.serializer.serializer();
            accessgetasciicp.IconCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessgetasciicp);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations != null) {
            return (String) getnoactivechildannotations.serializer(this.RemoteActionCompatParcelizer);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object getHasPhotosTooltipShownLastAddress(ContinuationImpl continuationImpl) {
        accessgetPhonecp accessgetphonecp;
        int i = 2 % 2;
        if (continuationImpl instanceof accessgetPhonecp) {
            accessgetphonecp = (accessgetPhonecp) continuationImpl;
            int i2 = accessgetphonecp.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accessgetphonecp.serializer = i2 - Integer.MIN_VALUE;
            } else {
                accessgetphonecp = new accessgetPhonecp(this, continuationImpl);
            }
        } else {
            accessgetphonecp = new accessgetPhonecp(this, continuationImpl);
        }
        Object objFirstOrNull = accessgetphonecp.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = accessgetphonecp.serializer;
        Object obj = null;
        if (i3 != 0) {
            int i4 = MediaBrowserCompatMediaItem + 109;
            int i5 = i4 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i5;
            if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = i5 + 15;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = this.serializer.serializer();
            accessgetphonecp.serializer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessgetphonecp);
            if (objFirstOrNull == coroutineSingletons) {
                int i8 = MediaBrowserCompatMediaItem + 71;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons;
                }
                obj.hashCode();
                throw null;
            }
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations == null) {
            return null;
        }
        int i9 = MediaBrowserCompatMediaItem + 113;
        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return (String) getnoactivechildannotations.serializer(this.IconCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    public final Object setExistingPhotosTooltipShownCount(int i, ContinuationImpl continuationImpl) {
        getNumberPjHm6EEannotations getnumberpjhm6eeannotations;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem;
        int i4 = i3 + 19;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = 1;
        if (!(continuationImpl instanceof getNumberPjHm6EEannotations)) {
            getnumberpjhm6eeannotations = new getNumberPjHm6EEannotations(this, continuationImpl);
        } else {
            int i7 = i3 + 39;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            getnumberpjhm6eeannotations = (getNumberPjHm6EEannotations) continuationImpl;
            int i9 = getnumberpjhm6eeannotations.IconCompatParcelizer;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                int i10 = MediaDescriptionCompat + 41;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getnumberpjhm6eeannotations.IconCompatParcelizer = i9 - Integer.MIN_VALUE;
            } else {
                getnumberpjhm6eeannotations = new getNumberPjHm6EEannotations(this, continuationImpl);
            }
        }
        Object obj = getnumberpjhm6eeannotations.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = getnumberpjhm6eeannotations.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i12 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.serializer;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, i, shortNewsContentCardView, i6);
                getnumberpjhm6eeannotations.IconCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, anonymousClass2, getnumberpjhm6eeannotations) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed saving the number of existing photos tooltip shown.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object setHasPhotosTooltipShownLastAddress(String str, ContinuationImpl continuationImpl) {
        getAsciiPjHm6EEannotations getasciipjhm6eeannotations;
        int i = 2 % 2;
        if (continuationImpl instanceof getAsciiPjHm6EEannotations) {
            getasciipjhm6eeannotations = (getAsciiPjHm6EEannotations) continuationImpl;
            int i2 = getasciipjhm6eeannotations.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaBrowserCompatMediaItem + 87;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getasciipjhm6eeannotations.read = i2 - Integer.MIN_VALUE;
            } else {
                getasciipjhm6eeannotations = new getAsciiPjHm6EEannotations(this, continuationImpl);
            }
        } else {
            getasciipjhm6eeannotations = new getAsciiPjHm6EEannotations(this, continuationImpl);
        }
        Object obj = getasciipjhm6eeannotations.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getasciipjhm6eeannotations.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i6 = 1;
        try {
            if (i5 != 0) {
                int i7 = MediaBrowserCompatMediaItem + 63;
                int i8 = i7 % Fields.SpotShadowColor;
                MediaDescriptionCompat = i8;
                int i9 = i7 % 2;
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = i8 + 19;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i11 = 68 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.serializer;
                C01482 c01482 = new C01482(this, str, shortNewsContentCardView, i6);
                getasciipjhm6eeannotations.read = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, c01482, getasciipjhm6eeannotations) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed saving has photos tooltip last shown address.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    public final Object setAddPhotosTooltipShownCount(int i, ContinuationImpl continuationImpl) {
        accessgetTextcp accessgettextcp;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 81;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i4;
        int i5 = i3 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof accessgetTextcp) {
            int i6 = i4 + 39;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = ((accessgetTextcp) continuationImpl).RemoteActionCompatParcelizer;
                throw null;
            }
            accessgettextcp = (accessgetTextcp) continuationImpl;
            int i8 = accessgettextcp.RemoteActionCompatParcelizer;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                accessgettextcp.RemoteActionCompatParcelizer = i8 - Integer.MIN_VALUE;
                int i9 = MediaDescriptionCompat + 45;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 4 / 4;
                }
            } else {
                accessgettextcp = new accessgetTextcp(this, continuationImpl);
            }
        } else {
            accessgettextcp = new accessgetTextcp(this, continuationImpl);
        }
        Object obj = accessgettextcp.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = accessgettextcp.RemoteActionCompatParcelizer;
        int i12 = 0;
        try {
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.serializer;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, i, shortNewsContentCardView, i12);
                accessgettextcp.RemoteActionCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, anonymousClass2, accessgettextcp) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i13 = MediaDescriptionCompat + 121;
                MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed saving the number of add photos tooltip shown.", new Object[0]);
            int i14 = MediaBrowserCompatMediaItem + 111;
            MediaDescriptionCompat = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public final Object setAddPhotosTooltipShownLastAddress(String str, ContinuationImpl continuationImpl) {
        accessgetUricp accessgeturicp;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 97;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof accessgetUricp) {
            int i5 = i2 + 121;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            accessgeturicp = (accessgetUricp) continuationImpl;
            int i7 = accessgeturicp.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = MediaBrowserCompatMediaItem + 93;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                accessgeturicp.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                accessgeturicp = new accessgetUricp(this, continuationImpl);
            }
        } else {
            accessgeturicp = new accessgetUricp(this, continuationImpl);
        }
        Object obj = accessgeturicp.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = accessgeturicp.RemoteActionCompatParcelizer;
        int i11 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.serializer;
                C01482 c01482 = new C01482(this, str, shortNewsContentCardView, i11);
                accessgeturicp.RemoteActionCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, c01482, accessgeturicp) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed saving add photos tooltip last shown address.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    public final Object setTermsOfUseAccepted(ContinuationImpl continuationImpl) {
        getDecimalPjHm6EEannotations getdecimalpjhm6eeannotations;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 73;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof getDecimalPjHm6EEannotations) {
            getdecimalpjhm6eeannotations = (getDecimalPjHm6EEannotations) continuationImpl;
            int i4 = getdecimalpjhm6eeannotations.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = MediaBrowserCompatMediaItem + 35;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    getdecimalpjhm6eeannotations.IconCompatParcelizer = i4 << Integer.MIN_VALUE;
                } else {
                    getdecimalpjhm6eeannotations.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
                }
            } else {
                getdecimalpjhm6eeannotations = new getDecimalPjHm6EEannotations(this, continuationImpl);
            }
        } else {
            getdecimalpjhm6eeannotations = new getDecimalPjHm6EEannotations(this, continuationImpl);
        }
        Object obj = getdecimalpjhm6eeannotations.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getdecimalpjhm6eeannotations.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.serializer;
                LocalAuthDataSource.AnonymousClass2 anonymousClass2 = new LocalAuthDataSource.AnonymousClass2(this, shortNewsContentCardView, 23);
                getdecimalpjhm6eeannotations.IconCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, anonymousClass2, getdecimalpjhm6eeannotations) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed saving Crowdsourcing terms acceptance", new Object[0]);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i7 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object getTermsOfUseAccepted(ContinuationImpl continuationImpl) {
        accessgetPasswordcp accessgetpasswordcp;
        int i = 2 % 2;
        if (continuationImpl instanceof accessgetPasswordcp) {
            accessgetpasswordcp = (accessgetPasswordcp) continuationImpl;
            int i2 = accessgetpasswordcp.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accessgetpasswordcp.read = i2 - Integer.MIN_VALUE;
            } else {
                accessgetpasswordcp = new accessgetPasswordcp(this, continuationImpl);
            }
        } else {
            accessgetpasswordcp = new accessgetPasswordcp(this, continuationImpl);
        }
        Object objFirstOrNull = accessgetpasswordcp.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = accessgetpasswordcp.read;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = this.serializer.serializer();
            accessgetpasswordcp.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessgetpasswordcp);
            if (objFirstOrNull == coroutineSingletons) {
                int i4 = MediaDescriptionCompat + 113;
                int i5 = i4 % Fields.SpotShadowColor;
                MediaBrowserCompatMediaItem = i5;
                if (i4 % 2 == 0) {
                    int i6 = 3 / 0;
                }
                int i7 = i5 + 89;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations != null) {
            int i9 = MediaDescriptionCompat + 101;
            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                throw null;
            }
            Boolean bool = (Boolean) getnoactivechildannotations.serializer(this.MediaMetadataCompat);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object getAddPhotosTooltipShownCount(ContinuationImpl continuationImpl) {
        accessgetEmailcp accessgetemailcp;
        int iIntValue;
        int i = 2 % 2;
        if (continuationImpl instanceof accessgetEmailcp) {
            accessgetemailcp = (accessgetEmailcp) continuationImpl;
            int i2 = accessgetemailcp.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accessgetemailcp.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                accessgetemailcp = new accessgetEmailcp(this, continuationImpl);
            }
        } else {
            accessgetemailcp = new accessgetEmailcp(this, continuationImpl);
        }
        Object objFirstOrNull = accessgetemailcp.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = accessgetemailcp.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            Object obj = null;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = MediaBrowserCompatMediaItem + 35;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = MediaBrowserCompatMediaItem + 101;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                obj.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = this.serializer.serializer();
            accessgetemailcp.RemoteActionCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessgetemailcp);
            if (objFirstOrNull == coroutineSingletons) {
                int i7 = MediaBrowserCompatMediaItem + 79;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations != null) {
            int i9 = MediaDescriptionCompat + 93;
            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Integer num = (Integer) getnoactivechildannotations.serializer(this.write);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        return new Integer(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object getExistingPhotosTooltipShownCount(ContinuationImpl continuationImpl) {
        accessgetNumberPasswordcp accessgetnumberpasswordcp;
        int iIntValue;
        Integer num;
        int i = 2 % 2;
        if (continuationImpl instanceof accessgetNumberPasswordcp) {
            int i2 = MediaDescriptionCompat + 65;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetnumberpasswordcp = (accessgetNumberPasswordcp) continuationImpl;
            int i4 = accessgetnumberpasswordcp.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                accessgetnumberpasswordcp.serializer = i4 - Integer.MIN_VALUE;
            } else {
                accessgetnumberpasswordcp = new accessgetNumberPasswordcp(this, continuationImpl);
            }
        } else {
            accessgetnumberpasswordcp = new accessgetNumberPasswordcp(this, continuationImpl);
        }
        Object objFirstOrNull = accessgetnumberpasswordcp.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = accessgetnumberpasswordcp.serializer;
        Object obj = null;
        if (i5 != 0) {
            int i6 = MediaBrowserCompatMediaItem + 91;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = this.serializer.serializer();
            accessgetnumberpasswordcp.serializer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, accessgetnumberpasswordcp);
            if (objFirstOrNull == coroutineSingletons) {
                int i8 = MediaBrowserCompatMediaItem + 121;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations == null || (num = (Integer) getnoactivechildannotations.serializer(this.read)) == null) {
            iIntValue = 0;
        } else {
            int i9 = MediaBrowserCompatMediaItem + 87;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                num.intValue();
                obj.hashCode();
                throw null;
            }
            iIntValue = num.intValue();
        }
        return new Integer(iIntValue);
    }
}
