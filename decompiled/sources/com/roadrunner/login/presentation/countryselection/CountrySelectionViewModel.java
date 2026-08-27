package com.roadrunner.login.presentation.countryselection;

import androidx.compose.animation.core.VectorizedFloatDecaySpec;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.roadrunner.country.config.implementation.domain.FetchCountryConfigListImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RectManager;
import o.ShortNewsContentCardView;
import o.a3;
import o.a5;
import o.a5ExternalSyntheticLambda0;
import o.ah;
import o.getAfterVersion;
import o.getAllSemanticsNodesToMap;
import o.getQueryContext;
import o.instance_delegatelambda0;
import o.metaMarkUpdatedAndHasCallbacks;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.toBitmapConfig1JJdX4A;
import o.unpackX;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CountrySelectionViewModel extends ViewModel {
    private static int ComponentActivity = 1;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public List IconCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaBrowserCompatMediaItem;
    public final a5 MediaDescriptionCompat;
    public final IncogniaManagerImpl MediaMetadataCompat;
    public final unpackX MediaSessionCompatQueueItem;
    public final getQueryContext MediaSessionCompatResultReceiverWrapper;
    public final getAllSemanticsNodesToMap MediaSessionCompatToken;
    public final MutableStateFlow ParcelableVolumeInfo;
    public final metaMarkUpdatedAndHasCallbacks PlaybackStateCompat;
    public final DropShadowEffect PlaybackStateCompatCustomAction;
    public final a3 RatingCompat;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final FetchCountryConfigListImpl read;
    public final MutableStateFlow serializer;
    public final getAfterVersion write;

    public CountrySelectionViewModel(getQueryContext getquerycontext, RectManager rectManager, a5 a5Var, getAfterVersion getafterversion, a3 a3Var, FetchCountryConfigListImpl fetchCountryConfigListImpl, unpackX unpackx, DropShadowEffect dropShadowEffect, getAllSemanticsNodesToMap getallsemanticsnodestomap, IncogniaManagerImpl incogniaManagerImpl) {
        boolean z;
        Object obj;
        ShortNewsContentCardView shortNewsContentCardView;
        getquerycontext.getClass();
        rectManager.getClass();
        a5Var.getClass();
        getafterversion.getClass();
        a3Var.getClass();
        fetchCountryConfigListImpl.getClass();
        unpackx.getClass();
        dropShadowEffect.getClass();
        getallsemanticsnodestomap.getClass();
        incogniaManagerImpl.getClass();
        this.MediaSessionCompatResultReceiverWrapper = getquerycontext;
        this.MediaDescriptionCompat = a5Var;
        this.write = getafterversion;
        this.RatingCompat = a3Var;
        this.read = fetchCountryConfigListImpl;
        this.MediaSessionCompatQueueItem = unpackx;
        this.PlaybackStateCompatCustomAction = dropShadowEffect;
        this.MediaSessionCompatToken = getallsemanticsnodestomap;
        this.MediaMetadataCompat = incogniaManagerImpl;
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = rectManager.serializer();
        this.PlaybackStateCompat = metamarkupdatedandhascallbacksSerializer;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.IconCompatParcelizer = instance_delegatelambda0Var;
        this.RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer("");
        int i = 1;
        int i2 = 0;
        if (metamarkupdatedandhascallbacksSerializer != null) {
            z = true;
        } else {
            int i3 = ComponentActivity + 117;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z = false;
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new a5ExternalSyntheticLambda0(new VectorizedFloatDecaySpec(), new ah(instance_delegatelambda0Var), false, z));
        this.serializer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 63;
        ComponentActivity = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 2 % 2;
        }
        do {
            obj = mutableStateFlow.read();
            shortNewsContentCardView = null;
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, a5ExternalSyntheticLambda0.write((a5ExternalSyntheticLambda0) obj, null, true, 47)));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CountrySelectionViewModel$fetchCountryList$1(this, shortNewsContentCardView, i2), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new CountrySelectionViewModel$fetchCountryList$1(this, shortNewsContentCardView, i), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.MediaBrowserCompatMediaItem;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i2 = ComponentActivity + 31;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = ComponentActivity + 75;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void IconCompatParcelizer(metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks) {
        int i = 2 % 2;
        metamarkupdatedandhascallbacks.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Selected country is changed", new Object[0]);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new PushEventPublisherImpl$emit$1(this, metamarkupdatedandhascallbacks, null, 13), 3);
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 119;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
