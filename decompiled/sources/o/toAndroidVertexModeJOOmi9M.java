package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.biometrics.presentation.BiometricsActivity;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.login.presentation.navigation.LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1;
import com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class toAndroidVertexModeJOOmi9M implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ toAndroidVertexModeJOOmi9M(androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic, createInAppMessageEventSubscriber createinappmessageeventsubscriber, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, cancelPendingWebViewPause cancelpendingwebviewpause) {
        this.write = 2;
        this.RemoteActionCompatParcelizer = mouseWheelScrollingLogic;
        this.read = createinappmessageeventsubscriber;
        this.serializer = cancelpendingwebviewpauselambda0;
        this.MediaSessionCompatQueueItem = scrollingLogic;
        this.IconCompatParcelizer = cancelpendingwebviewpause;
    }

    public /* synthetic */ toAndroidVertexModeJOOmi9M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
        this.serializer = obj4;
        this.MediaSessionCompatQueueItem = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0310  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List listSubList;
        androidx.compose.ui.geometry.Rect rect;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.MediaSessionCompatQueueItem;
        Object obj3 = this.serializer;
        Object obj4 = this.read;
        Object obj5 = this.RemoteActionCompatParcelizer;
        Object obj6 = this.IconCompatParcelizer;
        int i4 = 0;
        int i5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj5;
                createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = (createBrazeUserChangeEventSubscriberlambda01) obj4;
                toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = (toAndroidTileMode0vamqd0) obj3;
                Bundle bundle = (Bundle) obj2;
                cubicTo cubicto = (cubicTo) obj;
                cubicto.getClass();
                ((cancelPendingWebViewPause) obj6).IconCompatParcelizer = true;
                int iIndexOf = arrayList.indexOf(cubicto);
                if (iIndexOf != -1) {
                    int i6 = iIndexOf + 1;
                    listSubList = arrayList.subList(createbrazeuserchangeeventsubscriberlambda01.read, i6);
                    createbrazeuserchangeeventsubscriberlambda01.read = i6;
                } else {
                    listSubList = instance_delegatelambda0.write;
                }
                toandroidtilemode0vamqd0.read(cubicto.IconCompatParcelizer, bundle, cubicto, listSubList);
                return createfromparcel;
            case 1:
                onBackPressedDispatcher_delegatelambda0 onbackpresseddispatcher_delegatelambda0 = (onBackPressedDispatcher_delegatelambda0) obj6;
                onbackpresseddispatcher_delegatelambda0.IconCompatParcelizer = ((androidx.activity.result.ActivityResultRegistry) obj5).register((String) obj4, (onNewIntent) obj3, new onBackPressedDispatcher_delegatelambda00((PopulateViewStructure_androidKtpopulate7) obj2));
                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(1, onbackpresseddispatcher_delegatelambda0);
            case 2:
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic) obj5;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) obj4;
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = (cancelPendingWebViewPauselambda0) obj3;
                androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = (androidx.compose.foundation.gestures.ScrollingLogic) obj2;
                cancelPendingWebViewPause cancelpendingwebviewpause = (cancelPendingWebViewPause) obj6;
                float fFloatValue = ((Float) obj).floatValue();
                createHandleImage createhandleimage = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.read(mouseWheelScrollingLogic.read);
                if (createhandleimage != null) {
                    TextFieldSizeElement textFieldSizeElement = mouseWheelScrollingLogic.MediaDescriptionCompat;
                    long j = createhandleimage.IconCompatParcelizer;
                    long j2 = createhandleimage.serializer;
                    textFieldSizeElement.read.addDataPoint(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    textFieldSizeElement.IconCompatParcelizer.addDataPoint(j, Float.intBitsToFloat((int) (4294967295L & j2)));
                    createHandleImage createhandleimageRemoteActionCompatParcelizer = ((createHandleImage) createinappmessageeventsubscriber.IconCompatParcelizer).RemoteActionCompatParcelizer(createhandleimage);
                    createinappmessageeventsubscriber.IconCompatParcelizer = createhandleimageRemoteActionCompatParcelizer;
                    float fM60toSingleAxisDeltaFromAnglek4lQ0M = scrollingLogic.m60toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.write(createhandleimageRemoteActionCompatParcelizer.serializer));
                    cancelpendingwebviewpauselambda0.write = fM60toSingleAxisDeltaFromAnglek4lQ0M;
                    cancelpendingwebviewpause.IconCompatParcelizer = !androidx.compose.foundation.gestures.MouseWheelScrollingLogicKt.write(fM60toSingleAxisDeltaFromAnglek4lQ0M - fFloatValue);
                }
                return Boolean.valueOf(createhandleimage != null);
            case 3:
                androidx.compose.ui.text.input.OffsetMapping offsetMapping = (androidx.compose.ui.text.input.OffsetMapping) obj5;
                androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) obj4;
                androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = (androidx.compose.foundation.text.LegacyTextFieldState) obj3;
                androidx.compose.ui.graphics.SolidColor solidColor = (androidx.compose.ui.graphics.SolidColor) obj2;
                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj;
                contentDrawScope.drawContent();
                float fSerializer = ((getContentCaptureSessionui) ((getTraverseKey) obj6).write).serializer();
                if (fSerializer != 0.0f) {
                    int iOriginalToTransformed = offsetMapping.originalToTransformed(androidx.compose.ui.text.TextRange.m3076getStartimpl(textFieldValue.m3330getSelectiond9O1mEE()));
                    androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxySerializer = legacyTextFieldState.serializer();
                    if (textLayoutResultProxySerializer != null) {
                        int i7 = MediaDescriptionCompat + 61;
                        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            rect = textLayoutResultProxySerializer.RemoteActionCompatParcelizer.getCursorRect(iOriginalToTransformed);
                            int i8 = 22 / 0;
                            if (rect == null) {
                                rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        } else {
                            rect = textLayoutResultProxySerializer.RemoteActionCompatParcelizer.getCursorRect(iOriginalToTransformed);
                            if (rect == null) {
                                rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        }
                    } else {
                        rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float fFloor = (float) Math.floor(contentDrawScope.mo48toPx0680j_4(androidx.compose.foundation.text.TextFieldCursor_androidKt.write));
                    if (fFloor < 1.0f) {
                        int i9 = MediaDescriptionCompat + 117;
                        MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float left = rect.getLeft() + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32)) - f;
                    if (left > fIntBitsToFloat) {
                        left = fIntBitsToFloat;
                    }
                    if (left >= f) {
                        f = left;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    androidx.compose.ui.graphics.drawscope.DrawScope.m1289drawLine1RTmtNc$default(contentDrawScope, solidColor, androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(rect.getTop())) & 4294967295L)), androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(rect.getBottom())) & 4294967295L)), fFloor, 0, null, fSerializer, null, 0, 432, null);
                }
                return createfromparcel;
            case 4:
                getKey2 getkey2 = (getKey2) obj;
                KeepScreenOnNode keepScreenOnNode = ((getNormalNSsRyOo) obj5).serializer;
                getkey2.RatingCompat = (androidx.compose.ui.text.input.TextFieldValue) obj6;
                getkey2.read = (androidx.compose.ui.text.input.ImeOptions) obj4;
                getkey2.MediaDescriptionCompat = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                getkey2.MediaMetadataCompat = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                getkey2.MediaSessionCompatQueueItem = keepScreenOnNode != null ? ((setFrameRate) keepScreenOnNode).read : null;
                if (keepScreenOnNode != null) {
                    int i11 = MediaDescriptionCompat + 17;
                    MediaBrowserCompatMediaItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    textFieldSelectionManager = ((setFrameRate) keepScreenOnNode).IconCompatParcelizer;
                } else {
                    int i13 = MediaDescriptionCompat + 37;
                    MediaBrowserCompatMediaItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    textFieldSelectionManager = null;
                }
                getkey2.MediaSessionCompatToken = textFieldSelectionManager;
                getkey2.PlaybackStateCompat = keepScreenOnNode != null ? (androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf((setFrameRate) keepScreenOnNode, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()) : null;
                return createfromparcel;
            case 5:
                com.huawei.agconnect.config.impl.m mVar = (com.huawei.agconnect.config.impl.m) obj6;
                Context context = (Context) obj5;
                addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener = (addOnPictureInPictureUiStateChangedListener) obj4;
                addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistener2 = (addOnPictureInPictureUiStateChangedListener) obj3;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2;
                SemanticsRegion semanticsRegion = (SemanticsRegion) obj;
                semanticsRegion.getClass();
                if (semanticsRegion.equals(SemanticsPropertyReceiver.serializer)) {
                    Object obj7 = mVar.RemoteActionCompatParcelizer;
                    context.getClass();
                    addonpictureinpictureuistatechangedlistener.getClass();
                    Intent intent = new Intent(context, (Class<?>) BiometricsActivity.class);
                    intent.putExtra("biometrics_mode_key", SemanticsSortKt.DECRYPTION);
                    addonpictureinpictureuistatechangedlistener.write(intent);
                    return createfromparcel;
                }
                if (!(semanticsRegion instanceof SemanticsPropertyKey1)) {
                    if (semanticsRegion.equals(SemanticsRegion_androidKt.write)) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                Object obj8 = mVar.read;
                String str = ((SemanticsPropertyKey1) semanticsRegion).write;
                context.getClass();
                addonpictureinpictureuistatechangedlistener2.getClass();
                Intent intent2 = new Intent(context, (Class<?>) BiometricsActivity.class);
                intent2.putExtra("biometrics_password_key", str);
                intent2.putExtra("biometrics_mode_key", SemanticsSortKt.ENCRYPTION);
                addonpictureinpictureuistatechangedlistener2.write(intent2);
                return createfromparcel;
            case 6:
                onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) obj5;
                AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2 = (AnchoredDraggableKtrestartable2) obj;
                anchoredDraggableKtrestartable2.getClass();
                anchoredDraggableKtrestartable2.serializer(((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) onviewattachedtowindow.getValue()).size(), null, DraggableAnchorsElement.write, new DragAndDropTargetModifierNode(new LogSqliteDrivernewTransaction2((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj3, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2, onviewattachedtowindow, 1), true, 304745754));
                ((onHideTranslationui) ((getPlatformAndroidManager) obj6)).serializer(((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) onviewattachedtowindow.getValue()).size());
                return createfromparcel;
            case 7:
                UtilNetworking1 utilNetworking1 = (UtilNetworking1) obj5;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4;
                getMaxHeightimpl getmaxheightimpl = (getMaxHeightimpl) obj3;
                UtilNetworking1 utilNetworking2 = (UtilNetworking1) obj2;
                UtilNetworking1 utilNetworking3 = (UtilNetworking1) obj;
                utilNetworking3.getClass();
                Iterator it = ((List) obj6).iterator();
                while (!(!it.hasNext())) {
                    UtilNetworking1 utilNetworking4 = (UtilNetworking1) it.next();
                    ((onShowTranslationui) utilNetworking4.read).setValue(Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{utilNetworking4, utilNetworking3}, getCieXyz.write())).booleanValue()));
                }
                if (utilNetworking3.equals(utilNetworking1)) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getmaxheightimpl.taskId, TapToPayTaskUiItem$PaymentType.CASH);
                } else if (utilNetworking3.equals(utilNetworking2)) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getmaxheightimpl.taskId, TapToPayTaskUiItem$PaymentType.CARD);
                }
                return createfromparcel;
            case 8:
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj6;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                if (d0Var instanceof d3) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SignInScreenKt$SignInScreen$1$1$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, d0Var, objArr4 == true ? 1 : 0, i4), 3);
                    return createfromparcel;
                }
                if (d0Var.equals(cg.write)) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, objArr3 == true ? 1 : 0, 6), 3);
                    return createfromparcel;
                }
                if (d0Var instanceof d0ExternalSyntheticLambda4) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SignInScreenKt$SignInScreen$1$1$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, d0Var, objArr2 == true ? 1 : 0, i5), 3);
                    return createfromparcel;
                }
                if (d0Var instanceof d4) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SignInScreenKt$SignInScreen$1$1$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, d0Var, objArr == true ? 1 : 0, i), 3);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 9:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) obj4;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj3;
                androidx.compose.material3.SnackbarHostState snackbarHostState = (androidx.compose.material3.SnackbarHostState) obj2;
                t5 t5Var = (t5) obj;
                t5Var.getClass();
                if (t5Var instanceof t9) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke();
                    return createfromparcel;
                }
                if (t5Var instanceof t8) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke();
                    return createfromparcel;
                }
                if (t5Var instanceof tb) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ReconnectScheduler$schedule$1(populateViewStructure_androidKtpopulate7, t5Var, snackbarHostState, null, 23), 3);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 10:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                removeGlobalPartnerParametersI removeglobalpartnerparametersi = (removeGlobalPartnerParametersI) obj;
                removeglobalpartnerparametersi.getClass();
                if (removeglobalpartnerparametersi instanceof sendPreinstallReferrer) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
                    return createfromparcel;
                }
                if (!(!(removeglobalpartnerparametersi instanceof sendLicenseVerificationData))) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(((sendLicenseVerificationData) removeglobalpartnerparametersi).write);
                    return createfromparcel;
                }
                if (removeglobalpartnerparametersi instanceof sendReftagReferrer) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm5.invoke(((sendReftagReferrer) removeglobalpartnerparametersi).write);
                    return createfromparcel;
                }
                if (removeglobalpartnerparametersi instanceof sendInstallReferrer) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke();
                    return createfromparcel;
                }
                if (removeglobalpartnerparametersi instanceof setCoppaComplianceInDelay) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm6.invoke(removeglobalpartnerparametersi);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 11:
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                setWebView setwebview = (setWebView) obj;
                setwebview.getClass();
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) obj6, null, null, new LoginNavigationKt$LoginNavigationHost$showSnackbar$1$1$1((PopulateViewStructure_androidKtpopulate7) obj3, setwebview, (androidx.compose.material3.SnackbarHostState) obj2, (ShortNewsContentCardView) null, 2), 3);
                if (!((relativeMoveTo) obj5).write()) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k6.invoke();
                }
                return createfromparcel;
            default:
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj6;
                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) obj5;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4;
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k r8lambdaltz1unitaeov9grvwdnwxxsy0k = (r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k) obj;
                r8lambdaltz1unitaeov9grvwdnwxxsy0k.getClass();
                if (r8lambdaltz1unitaeov9grvwdnwxxsy0k instanceof r8lambdal_FwgRU_WvotLRXDsO9ikjmB4o) {
                    int i15 = MediaBrowserCompatMediaItem + 65;
                    MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(r8lambdaltz1unitaeov9grvwdnwxxsy0k, fragmentActivity);
                        return createfromparcel;
                    }
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(r8lambdaltz1unitaeov9grvwdnwxxsy0k, fragmentActivity);
                    int i16 = 71 / 0;
                    return createfromparcel;
                }
                if (r8lambdaltz1unitaeov9grvwdnwxxsy0k instanceof r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(r8lambdaltz1unitaeov9grvwdnwxxsy0k, fragmentActivity);
                    return createfromparcel;
                }
                if (r8lambdaltz1unitaeov9grvwdnwxxsy0k instanceof r8lambdam8zKDGVczFsFTURUOoSF_afmF0) {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde3.invoke(r8lambdaltz1unitaeov9grvwdnwxxsy0k, fragmentActivity);
                    return createfromparcel;
                }
                if (!r8lambdaltz1unitaeov9grvwdnwxxsy0k.equals(r8lambdamj111UIc_32qqPiOezWWbC51j0U.IconCompatParcelizer)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i17 = MediaDescriptionCompat + 15;
                MediaBrowserCompatMediaItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(fragmentActivity);
                    return createfromparcel;
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm7.invoke(fragmentActivity);
                throw null;
        }
    }
}
