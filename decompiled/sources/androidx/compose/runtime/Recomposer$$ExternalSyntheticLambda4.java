package androidx.compose.runtime;

import android.view.View;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition$animateTo$1$1$1;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.unit.IntOffset;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.foodora.courier.legacy.ui.main.MainPresenter;
import com.foodora.courier.push.tokenregistery.data.GMSPushTokenProvider;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.rider.state.offertowork.api.presentation.OfferToWorkUiModel;
import com.roadrunner.rider.state.offertowork.presentation.OfferToWorkUiModelImpl;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import io.reactivex.SingleEmitter;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.ExecuteDelayed;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.LightingColorFilter;
import o.Matrix;
import o.OffsetEffect;
import o.OnEventTrackingSucceededListener;
import o.OnIsEnabledListener;
import o.OutlineRectangle;
import o.PaddingValuesModifier;
import o.Surfaceo_FOJdg;
import o.TooltipKt;
import o.UncheckedColordefault;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessisRenderNodeCompatiblecp;
import o.addMenuProvider;
import o.addOnConfigurationChangedListener;
import o.createFromParcel;
import o.ddefault;
import o.forEachui_graphicsdefault;
import o.getAndroidLogLevel;
import o.getColorsui_graphics;
import o.getContentViewGroupParentLayout;
import o.getCreditCardSecurityCode;
import o.getLifecycle;
import o.getMultiply0d7_KjU;
import o.getPersonNamePrefix;
import o.getPurchaseTime;
import o.getSignature;
import o.getSignedData;
import o.getStartF1C5BW0ui_graphics;
import o.getTileMode3opZhB0ui_graphics;
import o.insertAndReturnIdsList;
import o.lineToRelative;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.relocationOffsetfbGrOKE;
import o.requiredSizeVpY3zN4;
import o.resetToPivotedTransformimpldefault;
import o.resolvedLinkCallback;
import o.rotateYimpl;
import o.setFlags;
import o.setFrom58bKbWc;
import o.setTranslationX;
import o.setVerboseLoggingEnabled;
import o.supportsColorMatrixQuery;
import o.tintxETnrds;
import o.translateimpldefault;
import okio.Okio;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Recomposer$$ExternalSyntheticLambda4 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ Recomposer$$ExternalSyntheticLambda4(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
        this.read = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a6 A[PHI: r8 r9
  0x02a6: PHI (r8v15 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x02a6: PHI (r9v16 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02b6 A[PHI: r7 r8 r9
  0x02b6: PHI (r7v4 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x02b6: PHI (r8v14 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x02b6: PHI (r9v14 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02df  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fa A[PHI: r7 r8 r9
  0x02fa: PHI (r7v3 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x02fa: PHI (r8v13 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x02fa: PHI (r9v13 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r7 r8 r9
  0x002f: PHI (r7v19 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r8v58 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r9v60 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0313 A[PHI: r8 r9
  0x0313: PHI (r8v11 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0313: PHI (r9v11 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x031f A[PHI: r8 r9
  0x031f: PHI (r8v9 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x031f: PHI (r9v9 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0330 A[PHI: r8 r9
  0x0330: PHI (r8v7 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0330: PHI (r9v7 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0346 A[PHI: r8 r9
  0x0346: PHI (r8v5 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0346: PHI (r9v5 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x0355 A[PHI: r7 r8 r9
  0x0355: PHI (r7v2 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0355: PHI (r8v3 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0355: PHI (r9v3 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x035e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0362 A[PHI: r7 r8 r9
  0x0362: PHI (r7v1 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0362: PHI (r8v1 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0362: PHI (r9v1 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003e A[PHI: r7 r8 r9
  0x003e: PHI (r7v18 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r8v56 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r9v57 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[PHI: r7 r8 r9
  0x0078: PHI (r7v17 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r8v54 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r9v55 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x009a A[PHI: r8 r9
  0x009a: PHI (r8v52 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r9v53 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1 A[PHI: r7 r8 r9
  0x00b1: PHI (r7v16 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r8v50 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r9v51 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb A[PHI: r7 r8 r9
  0x00cb: PHI (r7v15 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r8v48 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r9v49 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00de A[PHI: r8 r9
  0x00de: PHI (r8v46 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00de: PHI (r9v47 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6 A[PHI: r8 r9
  0x00f6: PHI (r8v44 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x00f6: PHI (r9v45 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x010a A[PHI: r7 r8 r9
  0x010a: PHI (r7v14 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r8v42 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r9v43 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119 A[PHI: r8 r9
  0x0119: PHI (r8v40 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r9v40 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0167 A[PHI: r7 r8 r9
  0x0167: PHI (r7v13 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0167: PHI (r8v38 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0167: PHI (r9v38 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x018e A[PHI: r7 r8 r9
  0x018e: PHI (r7v12 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x018e: PHI (r8v36 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x018e: PHI (r9v36 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x019d A[PHI: r7 r8 r9
  0x019d: PHI (r7v11 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r8v34 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r9v34 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ac A[PHI: r7 r8 r9
  0x01ac: PHI (r7v10 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r8v32 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r9v32 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb A[PHI: r7 r8 r9
  0x01bb: PHI (r7v9 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r8v30 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01bb: PHI (r9v30 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca A[PHI: r7 r8 r9
  0x01ca: PHI (r7v8 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r8v28 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01ca: PHI (r9v28 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9 A[PHI: r7 r8 r9
  0x01d9: PHI (r7v7 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01d9: PHI (r8v25 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01d9: PHI (r9v26 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8 A[PHI: r8 r9
  0x01e8: PHI (r8v23 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x01e8: PHI (r9v24 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202 A[PHI: r8 r9
  0x0202: PHI (r8v21 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0202: PHI (r9v22 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0216  */
    /* JADX WARN: Code duplicated, block: B:80:0x021f A[LOOP:0: B:79:0x021d->B:80:0x021f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x023f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0251  */
    /* JADX WARN: Code duplicated, block: B:86:0x0262  */
    /* JADX WARN: Code duplicated, block: B:88:0x026e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0281 A[PHI: r7 r8 r9
  0x0281: PHI (r7v5 o.createFromParcel) = (r7v0 o.createFromParcel), (r7v20 o.createFromParcel) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r8v17 java.lang.Object) = (r8v0 java.lang.Object), (r8v60 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0281: PHI (r9v18 java.lang.Object) = (r9v0 java.lang.Object), (r9v62 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0289  */
    /* JADX WARN: Code duplicated, block: B:95:0x0292  */
    /* JADX WARN: Code duplicated, block: B:97:0x029d  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a1  */
    /* JADX WARN: Switch 'out' block B:76:0x020e for B:8:0x002a already processed. Defaulting to fallback option. */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        createFromParcel createfromparcel;
        Object obj2;
        Object obj3;
        relocationOffsetfbGrOKE relocationoffsetfbgroke;
        Surfaceo_FOJdg surfaceo_FOJdg;
        Placeable placeable;
        Placeable.PlacementScope placementScope;
        boolean z;
        float f;
        TextLinkScope textLinkScope;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        TextLayoutResult textLayoutResult;
        int i;
        List list;
        List list2;
        Placeable.PlacementScope placementScope2;
        int size;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        long jM3812getZeronOccac;
        int size2;
        createFromParcel createfromparcelRunCached$lambda$1;
        int i2;
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer;
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2;
        MainPresenter mainPresenter;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        Throwable th;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        FragmentActivity fragmentActivity;
        ExecuteDelayed executeDelayed;
        OfferToWorkUiModel offerToWorkUiModel;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        resolvedLinkCallback resolvedlinkcallback;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = write + 27;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = 0;
        int i7 = 1;
        Object obj4 = null;
        if (i5 % 2 == 0) {
            int i8 = this.RemoteActionCompatParcelizer;
            createfromparcel = createFromParcel.INSTANCE;
            obj2 = this.read;
            obj3 = this.serializer;
            switch (i8) {
                case 0:
                    relocationoffsetfbgroke = (relocationOffsetfbGrOKE) obj2;
                    ((getCreditCardSecurityCode) obj3).IconCompatParcelizer(obj);
                    if (relocationoffsetfbgroke != null) {
                        relocationoffsetfbgroke.serializer(obj);
                    }
                    return createfromparcel;
                case 1:
                    getLifecycle getlifecycle = (getLifecycle) obj3;
                    addOnConfigurationChangedListener addonconfigurationchangedlistener = (addOnConfigurationChangedListener) obj2;
                    getlifecycle.read(addonconfigurationchangedlistener);
                    return new addMenuProvider(getlifecycle, i6, addonconfigurationchangedlistener);
                case 2:
                    BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) obj3, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1((Transition) obj2, null), 1);
                    return new requiredSizeVpY3zN4(0);
                case 3:
                    Transition transition = (Transition) obj3;
                    Transition transition2 = (Transition) obj2;
                    transition.read.add(transition2);
                    return new addMenuProvider(transition, i7, transition2);
                case 4:
                    return new addMenuProvider((Transition) obj3, i3, (PaddingValuesModifier) obj2);
                case 5:
                    ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                    contentDrawScope.drawContent();
                    DrawScope.m1293drawPathGBMwjPU$default(contentDrawScope, (Path) obj3, (Brush) obj2, 0.0f, null, null, 0, 60, null);
                    return createfromparcel;
                case 6:
                    surfaceo_FOJdg = (Surfaceo_FOJdg) obj3;
                    placeable = (Placeable) obj2;
                    placementScope = (Placeable.PlacementScope) obj;
                    z = surfaceo_FOJdg.RemoteActionCompatParcelizer;
                    f = surfaceo_FOJdg.IconCompatParcelizer;
                    if (z) {
                        int i9 = write + 37;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo42roundToPx0680j_4(f), placementScope.mo42roundToPx0680j_4(surfaceo_FOJdg.write), 0.0f, 4, null);
                    } else {
                        Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo42roundToPx0680j_4(f), placementScope.mo42roundToPx0680j_4(surfaceo_FOJdg.write), 0.0f, 4, null);
                    }
                    int i11 = write + 69;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return createfromparcel;
                case 7:
                    TooltipKt tooltipKt = (TooltipKt) obj3;
                    View view = (View) obj2;
                    tooltipKt.RemoteActionCompatParcelizer(view);
                    return new addMenuProvider(tooltipKt, 3, view);
                case 8:
                    textLinkScope = (TextLinkScope) obj3;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                    textLayoutResult = (TextLayoutResult) obj;
                    if (textLinkScope != null) {
                        ((onShowTranslationui) textLinkScope.RemoteActionCompatParcelizer).setValue(textLayoutResult);
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                        i = IconCompatParcelizer + 67;
                        write = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(textLayoutResult);
                        } else {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(textLayoutResult);
                            throw null;
                        }
                    }
                    return createfromparcel;
                case 9:
                    list = (List) obj3;
                    list2 = (List) obj2;
                    placementScope2 = (Placeable.PlacementScope) obj;
                    if (list != null) {
                        size2 = list.size();
                        while (i6 < size2) {
                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) list.get(i6);
                            Placeable.PlacementScope.m2280place70tqf50$default(placementScope2, (Placeable) onviewattachedtowindowlambda0.serializer, ((IntOffset) onviewattachedtowindowlambda0.write).m3810unboximpl(), 0.0f, 2, null);
                            i6++;
                        }
                    }
                    if (list2 != null) {
                        int i13 = write + 53;
                        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        size = list2.size();
                        while (i7 < size) {
                            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) list2.get(i7);
                            Placeable placeable2 = (Placeable) onviewattachedtowindowlambda1.serializer;
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) onviewattachedtowindowlambda1.write;
                            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                                jM3812getZeronOccac = ((IntOffset) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3810unboximpl();
                            } else {
                                jM3812getZeronOccac = IntOffset.Companion.m3812getZeronOccac();
                            }
                            Placeable.PlacementScope.m2280place70tqf50$default(placementScope2, placeable2, jM3812getZeronOccac, 0.0f, 2, null);
                            i7++;
                        }
                    }
                    return createfromparcel;
                case 10:
                    return FontFamilyResolverImpl.resolve$lambda$0((FontFamilyResolverImpl) obj3, (TypefaceRequest) obj2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
                case 11:
                    createfromparcelRunCached$lambda$1 = TypefaceRequestCache.runCached$lambda$1((TypefaceRequestCache) obj3, (TypefaceRequest) obj2, (TypefaceResult) obj);
                    i2 = write + 23;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return createfromparcelRunCached$lambda$1;
                    }
                    obj4.hashCode();
                    throw null;
                case 12:
                    ((r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) obj3).write((CancellationException) null);
                    ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj2)).b_((forEachui_graphicsdefault) obj);
                    return createfromparcel;
                case 13:
                    tintxETnrds tintxetnrds = (tintxETnrds) obj;
                    tintxetnrds.getClass();
                    ((getColorsui_graphics) obj3).read.IconCompatParcelizer(tintxetnrds, (LightingColorFilter) obj2);
                    return createfromparcel;
                case 14:
                    tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                    tintxetnrds2.getClass();
                    ((getStartF1C5BW0ui_graphics) obj3).write.IconCompatParcelizer(tintxetnrds2, (getMultiply0d7_KjU) obj2);
                    return createfromparcel;
                case 15:
                    tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                    tintxetnrds3.getClass();
                    ((getTileMode3opZhB0ui_graphics) obj3).IconCompatParcelizer.IconCompatParcelizer(tintxetnrds3, (Matrix) obj2);
                    return createfromparcel;
                case 16:
                    tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                    tintxetnrds4.getClass();
                    ((resetToPivotedTransformimpldefault) obj3).read.IconCompatParcelizer(tintxetnrds4, (rotateYimpl) obj2);
                    return createfromparcel;
                case 17:
                    tintxETnrds tintxetnrds5 = (tintxETnrds) obj;
                    tintxetnrds5.getClass();
                    ((translateimpldefault) obj3).write.IconCompatParcelizer(tintxetnrds5, (setFrom58bKbWc) obj2);
                    return createfromparcel;
                case 18:
                    accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = (accessgetAmbientShadowColor0d7_KjUjd) obj3;
                    String str = (String) obj2;
                    tintxETnrds tintxetnrds6 = (tintxETnrds) obj;
                    tintxetnrds6.getClass();
                    uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds6.RemoteActionCompatParcelizer("UPDATE workspec SET output=? WHERE id=?");
                    try {
                        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = accessgetAmbientShadowColor0d7_KjUjd.write;
                        uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, Okio.serializer(accessgetambientshadowcolor0d7_kjujd));
                        uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(2, str);
                        uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                        return createfromparcel;
                    } finally {
                        uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    }
                case 19:
                    setTranslationX settranslationx = (setTranslationX) obj3;
                    String str2 = (String) obj2;
                    tintxETnrds tintxetnrds7 = (tintxETnrds) obj;
                    tintxetnrds7.getClass();
                    uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds7.RemoteActionCompatParcelizer("UPDATE workspec SET state=? WHERE id=?");
                    try {
                        uncheckedColordefaultRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(1, Options.Companion.read(settranslationx));
                        uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer(2, str2);
                        uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                        return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds7})).intValue());
                    } finally {
                        uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                    }
                case 20:
                    tintxETnrds tintxetnrds8 = (tintxETnrds) obj;
                    tintxetnrds8.getClass();
                    ((OutlineRectangle) obj3).read.IconCompatParcelizer(tintxetnrds8, (OffsetEffect) obj2);
                    return createfromparcel;
                case 21:
                    tintxETnrds tintxetnrds9 = (tintxETnrds) obj;
                    tintxetnrds9.getClass();
                    return Long.valueOf(((lineToRelative) obj3).serializer.write(tintxetnrds9, obj2));
                case 22:
                    mainPresenter = (MainPresenter) obj3;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                    th = (Throwable) obj;
                    mainPresenter.MediaDescriptionCompat = false;
                    if (!(th instanceof setVerboseLoggingEnabled)) {
                        mainPresenter.ParcelableVolumeInfo.serializer(th);
                    }
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(th);
                    }
                    return null;
                case 23:
                    ((GMSPushTokenProvider) obj3).IconCompatParcelizer.IconCompatParcelizer.logEvent("push_google_token_provider_success", null);
                    ((SingleEmitter) obj2).IconCompatParcelizer((String) obj);
                    return createfromparcel;
                case 24:
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                    fragmentActivity = (FragmentActivity) obj2;
                    executeDelayed = (ExecuteDelayed) obj;
                    executeDelayed.getClass();
                    if (executeDelayed.equals(ExecuteDelayed.IconCompatParcelizer)) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(fragmentActivity);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                case 25:
                    DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl = (DeliveryAutoAcceptMessageUiModelImpl) obj2;
                    ((getPersonNamePrefix) obj).getClass();
                    supportsColorMatrixQuery lifecycle = ((accessisRenderNodeCompatiblecp) obj3).getLifecycle();
                    lifecycle.IconCompatParcelizer(deliveryAutoAcceptMessageUiModelImpl);
                    return new addMenuProvider(lifecycle, 4, deliveryAutoAcceptMessageUiModelImpl);
                case 26:
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                    FragmentActivity fragmentActivity2 = (FragmentActivity) obj;
                    fragmentActivity2.getClass();
                    insertAndReturnIdsList insertandreturnidslist = ((setFlags) obj3).write;
                    insertandreturnidslist.getClass();
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
                    fragmentActivity2.getSupportFragmentManager().read("book_shift_confirmation_flow_request_key", fragmentActivity2, new JankStatsFrameTracker$$ExternalSyntheticLambda3(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, 17, insertandreturnidslist));
                    return createfromparcel;
                case 27:
                    offerToWorkUiModel = (OfferToWorkUiModel) obj3;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                    resolvedlinkcallback = (resolvedLinkCallback) obj;
                    resolvedlinkcallback.getClass();
                    if (resolvedlinkcallback.equals(getPurchaseTime.RemoteActionCompatParcelizer)) {
                        ((StartWorkingNavigationUiModelImpl) ((OfferToWorkUiModelImpl) offerToWorkUiModel).MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer(StartWorkingNavAction.BecomeAvailable.read);
                    } else if (resolvedlinkcallback instanceof getSignature) {
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((getSignature) resolvedlinkcallback).write(), ddefault.IconCompatParcelizer, 0);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    return createfromparcel;
                case 28:
                    tintxETnrds tintxetnrds10 = (tintxETnrds) obj;
                    tintxetnrds10.getClass();
                    ((getAndroidLogLevel) obj3).IconCompatParcelizer.IconCompatParcelizer(tintxetnrds10, (OnEventTrackingSucceededListener) obj2);
                    return createfromparcel;
                default:
                    tintxETnrds tintxetnrds11 = (tintxETnrds) obj;
                    tintxetnrds11.getClass();
                    ((getSignedData) obj3).RemoteActionCompatParcelizer.IconCompatParcelizer(tintxetnrds11, (OnIsEnabledListener) obj2);
                    return createfromparcel;
            }
        }
        int i15 = this.RemoteActionCompatParcelizer;
        createfromparcel = createFromParcel.INSTANCE;
        obj2 = this.read;
        obj3 = this.serializer;
        switch (i15) {
            case 0:
                relocationoffsetfbgroke = (relocationOffsetfbGrOKE) obj2;
                ((getCreditCardSecurityCode) obj3).IconCompatParcelizer(obj);
                if (relocationoffsetfbgroke != null) {
                    relocationoffsetfbgroke.serializer(obj);
                }
                return createfromparcel;
            case 1:
                getLifecycle getlifecycle2 = (getLifecycle) obj3;
                addOnConfigurationChangedListener addonconfigurationchangedlistener2 = (addOnConfigurationChangedListener) obj2;
                getlifecycle2.read(addonconfigurationchangedlistener2);
                return new addMenuProvider(getlifecycle2, i6, addonconfigurationchangedlistener2);
            case 2:
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) obj3, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1((Transition) obj2, null), 1);
                return new requiredSizeVpY3zN4(0);
            case 3:
                Transition transition3 = (Transition) obj3;
                Transition transition4 = (Transition) obj2;
                transition3.read.add(transition4);
                return new addMenuProvider(transition3, i7, transition4);
            case 4:
                return new addMenuProvider((Transition) obj3, i3, (PaddingValuesModifier) obj2);
            case 5:
                ContentDrawScope contentDrawScope2 = (ContentDrawScope) obj;
                contentDrawScope2.drawContent();
                DrawScope.m1293drawPathGBMwjPU$default(contentDrawScope2, (Path) obj3, (Brush) obj2, 0.0f, null, null, 0, 60, null);
                return createfromparcel;
            case 6:
                surfaceo_FOJdg = (Surfaceo_FOJdg) obj3;
                placeable = (Placeable) obj2;
                placementScope = (Placeable.PlacementScope) obj;
                z = surfaceo_FOJdg.RemoteActionCompatParcelizer;
                f = surfaceo_FOJdg.IconCompatParcelizer;
                if (z) {
                    int i16 = write + 37;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placementScope.mo42roundToPx0680j_4(f), placementScope.mo42roundToPx0680j_4(surfaceo_FOJdg.write), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeable, placementScope.mo42roundToPx0680j_4(f), placementScope.mo42roundToPx0680j_4(surfaceo_FOJdg.write), 0.0f, 4, null);
                }
                int i18 = write + 69;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return createfromparcel;
            case 7:
                TooltipKt tooltipKt2 = (TooltipKt) obj3;
                View view2 = (View) obj2;
                tooltipKt2.RemoteActionCompatParcelizer(view2);
                return new addMenuProvider(tooltipKt2, 3, view2);
            case 8:
                textLinkScope = (TextLinkScope) obj3;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                textLayoutResult = (TextLayoutResult) obj;
                if (textLinkScope != null) {
                    ((onShowTranslationui) textLinkScope.RemoteActionCompatParcelizer).setValue(textLayoutResult);
                }
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                    i = IconCompatParcelizer + 67;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(textLayoutResult);
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(textLayoutResult);
                        throw null;
                    }
                }
                return createfromparcel;
            case 9:
                i7 = 0;
                list = (List) obj3;
                list2 = (List) obj2;
                placementScope2 = (Placeable.PlacementScope) obj;
                if (list != null) {
                    size2 = list.size();
                    while (i6 < size2) {
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = (onViewAttachedToWindowlambda0) list.get(i6);
                        Placeable.PlacementScope.m2280place70tqf50$default(placementScope2, (Placeable) onviewattachedtowindowlambda2.serializer, ((IntOffset) onviewattachedtowindowlambda2.write).m3810unboximpl(), 0.0f, 2, null);
                        i6++;
                    }
                }
                if (list2 != null) {
                    int i110 = write + 53;
                    IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    size = list2.size();
                    while (i7 < size) {
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = (onViewAttachedToWindowlambda0) list2.get(i7);
                        Placeable placeable3 = (Placeable) onviewattachedtowindowlambda3.serializer;
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) onviewattachedtowindowlambda3.write;
                        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                            jM3812getZeronOccac = ((IntOffset) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3810unboximpl();
                        } else {
                            jM3812getZeronOccac = IntOffset.Companion.m3812getZeronOccac();
                        }
                        Placeable.PlacementScope.m2280place70tqf50$default(placementScope2, placeable3, jM3812getZeronOccac, 0.0f, 2, null);
                        i7++;
                    }
                }
                return createfromparcel;
            case 10:
                return FontFamilyResolverImpl.resolve$lambda$0((FontFamilyResolverImpl) obj3, (TypefaceRequest) obj2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
            case 11:
                createfromparcelRunCached$lambda$1 = TypefaceRequestCache.runCached$lambda$1((TypefaceRequestCache) obj3, (TypefaceRequest) obj2, (TypefaceResult) obj);
                i2 = write + 23;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return createfromparcelRunCached$lambda$1;
                }
                obj4.hashCode();
                throw null;
            case 12:
                ((r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) obj3).write((CancellationException) null);
                ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj2)).b_((forEachui_graphicsdefault) obj);
                return createfromparcel;
            case 13:
                tintxETnrds tintxetnrds12 = (tintxETnrds) obj;
                tintxetnrds12.getClass();
                ((getColorsui_graphics) obj3).read.IconCompatParcelizer(tintxetnrds12, (LightingColorFilter) obj2);
                return createfromparcel;
            case 14:
                tintxETnrds tintxetnrds13 = (tintxETnrds) obj;
                tintxetnrds13.getClass();
                ((getStartF1C5BW0ui_graphics) obj3).write.IconCompatParcelizer(tintxetnrds13, (getMultiply0d7_KjU) obj2);
                return createfromparcel;
            case 15:
                tintxETnrds tintxetnrds14 = (tintxETnrds) obj;
                tintxetnrds14.getClass();
                ((getTileMode3opZhB0ui_graphics) obj3).IconCompatParcelizer.IconCompatParcelizer(tintxetnrds14, (Matrix) obj2);
                return createfromparcel;
            case 16:
                tintxETnrds tintxetnrds15 = (tintxETnrds) obj;
                tintxetnrds15.getClass();
                ((resetToPivotedTransformimpldefault) obj3).read.IconCompatParcelizer(tintxetnrds15, (rotateYimpl) obj2);
                return createfromparcel;
            case 17:
                tintxETnrds tintxetnrds16 = (tintxETnrds) obj;
                tintxetnrds16.getClass();
                ((translateimpldefault) obj3).write.IconCompatParcelizer(tintxetnrds16, (setFrom58bKbWc) obj2);
                return createfromparcel;
            case 18:
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd3 = (accessgetAmbientShadowColor0d7_KjUjd) obj3;
                String str3 = (String) obj2;
                tintxETnrds tintxetnrds17 = (tintxETnrds) obj;
                tintxetnrds17.getClass();
                uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds17.RemoteActionCompatParcelizer("UPDATE workspec SET output=? WHERE id=?");
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd4 = accessgetAmbientShadowColor0d7_KjUjd.write;
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(1, Okio.serializer(accessgetambientshadowcolor0d7_kjujd3));
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer(2, str3);
                uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                return createfromparcel;
            case 19:
                setTranslationX settranslationx2 = (setTranslationX) obj3;
                String str4 = (String) obj2;
                tintxETnrds tintxetnrds18 = (tintxETnrds) obj;
                tintxetnrds18.getClass();
                uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds18.RemoteActionCompatParcelizer("UPDATE workspec SET state=? WHERE id=?");
                uncheckedColordefaultRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(1, Options.Companion.read(settranslationx2));
                uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer(2, str4);
                uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                return Integer.valueOf(((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds18})).intValue());
            case 20:
                tintxETnrds tintxetnrds19 = (tintxETnrds) obj;
                tintxetnrds19.getClass();
                ((OutlineRectangle) obj3).read.IconCompatParcelizer(tintxetnrds19, (OffsetEffect) obj2);
                return createfromparcel;
            case 21:
                tintxETnrds tintxetnrds20 = (tintxETnrds) obj;
                tintxetnrds20.getClass();
                return Long.valueOf(((lineToRelative) obj3).serializer.write(tintxetnrds20, obj2));
            case 22:
                mainPresenter = (MainPresenter) obj3;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
                th = (Throwable) obj;
                mainPresenter.MediaDescriptionCompat = false;
                if (!(th instanceof setVerboseLoggingEnabled)) {
                    mainPresenter.ParcelableVolumeInfo.serializer(th);
                }
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(th);
                }
                return null;
            case 23:
                ((GMSPushTokenProvider) obj3).IconCompatParcelizer.IconCompatParcelizer.logEvent("push_google_token_provider_success", null);
                ((SingleEmitter) obj2).IconCompatParcelizer((String) obj);
                return createfromparcel;
            case 24:
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                fragmentActivity = (FragmentActivity) obj2;
                executeDelayed = (ExecuteDelayed) obj;
                executeDelayed.getClass();
                if (executeDelayed.equals(ExecuteDelayed.IconCompatParcelizer)) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(fragmentActivity);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 25:
                DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl2 = (DeliveryAutoAcceptMessageUiModelImpl) obj2;
                ((getPersonNamePrefix) obj).getClass();
                supportsColorMatrixQuery lifecycle2 = ((accessisRenderNodeCompatiblecp) obj3).getLifecycle();
                lifecycle2.IconCompatParcelizer(deliveryAutoAcceptMessageUiModelImpl2);
                return new addMenuProvider(lifecycle2, 4, deliveryAutoAcceptMessageUiModelImpl2);
            case 26:
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                FragmentActivity fragmentActivity3 = (FragmentActivity) obj;
                fragmentActivity3.getClass();
                insertAndReturnIdsList insertandreturnidslist2 = ((setFlags) obj3).write;
                insertandreturnidslist2.getClass();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.getClass();
                fragmentActivity3.getSupportFragmentManager().read("book_shift_confirmation_flow_request_key", fragmentActivity3, new JankStatsFrameTracker$$ExternalSyntheticLambda3(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3, 17, insertandreturnidslist2));
                return createfromparcel;
            case 27:
                offerToWorkUiModel = (OfferToWorkUiModel) obj3;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2;
                resolvedlinkcallback = (resolvedLinkCallback) obj;
                resolvedlinkcallback.getClass();
                if (resolvedlinkcallback.equals(getPurchaseTime.RemoteActionCompatParcelizer)) {
                    ((StartWorkingNavigationUiModelImpl) ((OfferToWorkUiModelImpl) offerToWorkUiModel).MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper()).serializer(StartWorkingNavAction.BecomeAvailable.read);
                } else if (resolvedlinkcallback instanceof getSignature) {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(((getSignature) resolvedlinkcallback).write(), ddefault.IconCompatParcelizer, 0);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                return createfromparcel;
            case 28:
                tintxETnrds tintxetnrds110 = (tintxETnrds) obj;
                tintxetnrds110.getClass();
                ((getAndroidLogLevel) obj3).IconCompatParcelizer.IconCompatParcelizer(tintxetnrds110, (OnEventTrackingSucceededListener) obj2);
                return createfromparcel;
            default:
                tintxETnrds tintxetnrds111 = (tintxETnrds) obj;
                tintxetnrds111.getClass();
                ((getSignedData) obj3).RemoteActionCompatParcelizer.IconCompatParcelizer(tintxetnrds111, (OnIsEnabledListener) obj2);
                return createfromparcel;
        }
    }
}
