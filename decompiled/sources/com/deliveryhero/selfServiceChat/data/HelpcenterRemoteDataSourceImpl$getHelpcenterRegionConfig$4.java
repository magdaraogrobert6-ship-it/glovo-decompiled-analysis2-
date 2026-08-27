package com.deliveryhero.selfServiceChat.data;

import coil3.ExtrasKt;
import com.deliveryhero.chatsdk.util.UrlBuilder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse;
import com.deliveryhero.selfServiceChat.domain.exceptions.EndpointException;
import com.deliveryhero.selfServiceChat.domain.exceptions.InvalidGlobalEntityIDException;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.PathNodeCurveTo;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda1;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDefaultFillType;
import o.getHoldoutVariationName;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.rebuildOutline;
import o.setSpotShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpcenterRemoteDataSourceImpl$getHelpcenterRegionConfig$4 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ rebuildOutline IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ setSpotShadowColor serializer;
    public final /* synthetic */ HelpcenterRemoteDataSourceImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpcenterRemoteDataSourceImpl$getHelpcenterRegionConfig$4(rebuildOutline rebuildoutline, HelpcenterRemoteDataSourceImpl helpcenterRemoteDataSourceImpl, setSpotShadowColor setspotshadowcolor, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = rebuildoutline;
        this.write = helpcenterRemoteDataSourceImpl;
        this.serializer = setspotshadowcolor;
        this.read = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new HelpcenterRemoteDataSourceImpl$getHelpcenterRegionConfig$4(this.IconCompatParcelizer, this.write, this.serializer, this.read, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((HelpcenterRemoteDataSourceImpl$getHelpcenterRegionConfig$4) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InvalidGlobalEntityIDException, EndpointException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str = UrlBuilder.INSTANCE.buildHelpCenterRegionServiceUrl(this.IconCompatParcelizer) + "/service/v1/global-entity-configs/all.json";
            PathNodeCurveTo pathNodeCurveTo = this.write.MediaDescriptionCompat;
            this.RemoteActionCompatParcelizer = 1;
            obj = pathNodeCurveTo.write(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        getHoldoutVariationName getholdoutvariationname = (getHoldoutVariationName) obj;
        Object obj3 = getholdoutvariationname.body;
        if (!getholdoutvariationname.rawResponse.isSuccessful) {
            obj3 = null;
        }
        HelpcenterEntityConfigEndpointResponse helpcenterEntityConfigEndpointResponse = (HelpcenterEntityConfigEndpointResponse) obj3;
        if (helpcenterEntityConfigEndpointResponse == null) {
            _get_messageWebView_lambda1 _get_messagewebview_lambda1 = getholdoutvariationname.rawResponse;
            int i2 = _get_messagewebview_lambda1.code;
            String str2 = _get_messagewebview_lambda1.message;
            str2.getClass();
            throw new EndpointException("Region config", i2, str2);
        }
        List list = helpcenterEntityConfigEndpointResponse.globalEntityConfigs;
        if (BuildersKt.RemoteActionCompatParcelizer(this.serializer)) {
            ((getDefaultFillType) this.write.write).IconCompatParcelizer = list;
        }
        String str3 = this.read;
        for (Object obj4 : list) {
            if (((HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj4).serializer.equals(str3)) {
                obj2 = obj4;
                break;
            }
        }
        HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig globalEntityConfig = (HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) obj2;
        if (globalEntityConfig != null) {
            return globalEntityConfig;
        }
        throw InvalidGlobalEntityIDException.read;
    }
}
