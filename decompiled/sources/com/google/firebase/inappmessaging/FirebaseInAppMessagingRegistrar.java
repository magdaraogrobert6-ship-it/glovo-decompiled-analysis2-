package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.android.gms.dynamite.zzj;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o.FlingCancellationException;
import o.LayoutTreeConsistencyChecker;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.OwnerSnapshotObserveronCommitAffectingSemantics1;
import o.UiApplier;
import o.ViewAdapter;
import o.accessgetButton15cp;
import o.accessgetRulerScope;
import o.accessgetVcp;
import o.accesssetInstancecp;
import o.addView;
import o.captureRulersIfNeeded;
import o.captureRulersIfNeededui;
import o.disposeComposition;
import o.findAncestorRulerDefiner;
import o.findNearestAncestor;
import o.getComposeViewContextuiannotations;
import o.getHasMeasureResult;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getMeasureResultui;
import o.getTextInputServiceannotations;
import o.hasui;
import o.isAlive;
import o.logTree;
import o.measureAndLayoutForTest;
import o.midPointq5eDKzI;
import o.onAttachedToWindowlambda0;
import o.packui;
import o.provideRelativeRulerValue;
import o.resolveComposeViewContext;
import o.resolveParentCompositionContext;
import o.setPreviousAttachedWindowToken;
import o.setRoundRectOutlineTNW_H78default;
import o.speculativeHit;
import o.subscribeToBannersErrorslambda0;
import o.tagKey;
import o.updateAutoCreatedComposeViewContext;
import o.updatePlacedUnderMotionFrameOfReference;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 backgroundExecutor = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, Executor.class);
    private LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 blockingExecutor = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, Executor.class);
    private LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lightWeightExecutor = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, Executor.class);
    private LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 legacyTransportFactory = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(midPointq5eDKzI.class, accessgetButton15cp.class);

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(FirebaseInAppMessaging.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(accesssetInstancecp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(LayoutTreeConsistencyChecker.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.write(logTree.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.serializer(this.legacyTransportFactory));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(hasui.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.serializer(this.backgroundExecutor));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.serializer(this.blockingExecutor));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.serializer(this.lightWeightExecutor));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(26, this);
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer(2);
        return Arrays.asList(capturerulersifneededuiWrite.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "22.0.2"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseInAppMessaging providesFirebaseInAppMessaging(getMeasureResultui getmeasureresultui) {
        FirebaseApp firebaseApp = (FirebaseApp) getmeasureresultui.read(FirebaseApp.class);
        accesssetInstancecp accesssetinstancecp = (accesssetInstancecp) getmeasureresultui.read(accesssetInstancecp.class);
        updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreferenceSerializer = getmeasureresultui.serializer(logTree.class);
        hasui hasuiVar = (hasui) getmeasureresultui.read(hasui.class);
        firebaseApp.IconCompatParcelizer();
        subscribeToBannersErrorslambda0 subscribetobannerserrorslambda0 = new subscribeToBannersErrorslambda0((Application) firebaseApp.read);
        zzbv zzbvVar = new zzbv(updateplacedundermotionframeofreferenceSerializer, hasuiVar);
        int i = 28;
        getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = new getIntentArrayWithConfiguredBackStacklambda4(i);
        tagKey tagkey = new tagKey();
        zzz zzzVar = new zzz();
        zzzVar.serializer = tagkey;
        Executor executor = (Executor) getmeasureresultui.write(this.lightWeightExecutor);
        Executor executor2 = (Executor) getmeasureresultui.write(this.backgroundExecutor);
        Executor executor3 = (Executor) getmeasureresultui.write(this.blockingExecutor);
        ProtobufEncoder protobufEncoder = new ProtobufEncoder();
        protobufEncoder.RemoteActionCompatParcelizer = executor;
        protobufEncoder.write = executor2;
        protobufEncoder.serializer = executor3;
        int i2 = 29;
        onAttachedToWindowlambda0 onattachedtowindowlambda0 = new onAttachedToWindowlambda0(new FlingCancellationException(i2), new speculativeHit(i2), subscribetobannerserrorslambda0, new PlaybackStateCompatCustomAction(i), zzzVar, getintentarraywithconfiguredbackstacklambda4, new setRoundRectOutlineTNW_H78default(i2), new zzj(i2), new accessgetVcp(i2), zzbvVar, protobufEncoder);
        packui packuiVar = new packui(((LayoutTreeConsistencyChecker) getmeasureresultui.read(LayoutTreeConsistencyChecker.class)).write("fiam"), (Executor) getmeasureresultui.write(this.blockingExecutor));
        ProtobufEncoder protobufEncoder2 = new ProtobufEncoder(firebaseApp, accesssetinstancecp, new disposeComposition());
        SharedPreferencesUtils sharedPreferencesUtils = new SharedPreferencesUtils(firebaseApp);
        accessgetButton15cp accessgetbutton15cp = (accessgetButton15cp) getmeasureresultui.write(this.legacyTransportFactory);
        accessgetbutton15cp.getClass();
        int i3 = 3;
        resolveComposeViewContext resolvecomposeviewcontext = new resolveComposeViewContext(onattachedtowindowlambda0, i3);
        resolveComposeViewContext resolvecomposeviewcontext2 = new resolveComposeViewContext(onattachedtowindowlambda0, 12);
        resolveComposeViewContext resolvecomposeviewcontext3 = new resolveComposeViewContext(onattachedtowindowlambda0, 6);
        int i4 = 0;
        resolveParentCompositionContext resolveparentcompositioncontext = new resolveParentCompositionContext(onattachedtowindowlambda0, i4);
        getTextInputServiceannotations gettextinputserviceannotations = measureAndLayoutForTest.read(new addView(protobufEncoder2, measureAndLayoutForTest.read(new UiApplier(measureAndLayoutForTest.read(new getComposeViewContextuiannotations(sharedPreferencesUtils, new resolveComposeViewContext(onattachedtowindowlambda0, 9), new InstanceFactory(i3, sharedPreferencesUtils))), i4)), new resolveComposeViewContext(onattachedtowindowlambda0, 4), new resolveComposeViewContext(onattachedtowindowlambda0, 14)));
        resolveComposeViewContext resolvecomposeviewcontext4 = new resolveComposeViewContext(onattachedtowindowlambda0, 2);
        resolveComposeViewContext resolvecomposeviewcontext5 = new resolveComposeViewContext(onattachedtowindowlambda0, i4);
        resolveComposeViewContext resolvecomposeviewcontext6 = new resolveComposeViewContext(onattachedtowindowlambda0, 10);
        resolveComposeViewContext resolvecomposeviewcontext7 = new resolveComposeViewContext(onattachedtowindowlambda0, 15);
        resolveParentCompositionContext resolveparentcompositioncontext2 = new resolveParentCompositionContext(onattachedtowindowlambda0, 1);
        updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext = new updateAutoCreatedComposeViewContext(protobufEncoder2, 2);
        InstanceFactory instanceFactory = new InstanceFactory(protobufEncoder2, updateautocreatedcomposeviewcontext);
        updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext2 = new updateAutoCreatedComposeViewContext(protobufEncoder2, 1);
        isAlive isalive = new isAlive(protobufEncoder2, updateautocreatedcomposeviewcontext, new resolveComposeViewContext(onattachedtowindowlambda0, 8), 2);
        int i5 = 0;
        InstanceFactory instanceFactory2 = new InstanceFactory(i5, packuiVar);
        resolveComposeViewContext resolvecomposeviewcontext8 = new resolveComposeViewContext(onattachedtowindowlambda0, 5);
        getTextInputServiceannotations gettextinputserviceannotations2 = measureAndLayoutForTest.read(new ViewAdapter(resolvecomposeviewcontext, resolvecomposeviewcontext2, resolvecomposeviewcontext3, resolveparentcompositioncontext, gettextinputserviceannotations, resolvecomposeviewcontext4, resolvecomposeviewcontext5, resolvecomposeviewcontext6, resolvecomposeviewcontext7, resolveparentcompositioncontext2, instanceFactory, updateautocreatedcomposeviewcontext2, isalive, instanceFactory2, resolvecomposeviewcontext8));
        resolveComposeViewContext resolvecomposeviewcontext9 = new resolveComposeViewContext(onattachedtowindowlambda0, 13);
        updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext3 = new updateAutoCreatedComposeViewContext(protobufEncoder2, i5);
        InstanceFactory instanceFactory3 = new InstanceFactory(i5, accessgetbutton15cp);
        resolveComposeViewContext resolvecomposeviewcontext10 = new resolveComposeViewContext(onattachedtowindowlambda0, 1);
        resolveComposeViewContext resolvecomposeviewcontext11 = new resolveComposeViewContext(onattachedtowindowlambda0, 7);
        return (FirebaseInAppMessaging) measureAndLayoutForTest.read(new OwnerSnapshotObserveronCommitAffectingSemantics1(gettextinputserviceannotations2, resolvecomposeviewcontext9, isalive, updateautocreatedcomposeviewcontext2, new findNearestAncestor(resolvecomposeviewcontext6, resolveparentcompositioncontext, resolvecomposeviewcontext5, resolvecomposeviewcontext7, resolvecomposeviewcontext3, resolveparentcompositioncontext2, measureAndLayoutForTest.read(new setPreviousAttachedWindowToken(updateautocreatedcomposeviewcontext3, instanceFactory3, resolvecomposeviewcontext10, updateautocreatedcomposeviewcontext2, resolveparentcompositioncontext, resolvecomposeviewcontext11, resolvecomposeviewcontext8)), isalive), resolvecomposeviewcontext11, new resolveComposeViewContext(onattachedtowindowlambda0, 11))).write();
    }
}
