package com.roadrunner.login.domain.auth;

import androidx.compose.ui.graphics.Fields;
import bo.app.hg$$ExternalSyntheticLambda5;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.grpc.internal.SharedResourcePool;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SemanticsProperties_androidKt;
import o.TransacterImpl;
import o.TransactionWithReturn;
import o.accessgetTextCentercp;
import o.createFromParcel;
import o.getTextSelectionRange;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.setEditable;
import o.setShowingTextSubstitution;
import o.setTextSelectionRangeFDrldGo;
import o.setTextSubstitution;
import o.setTraversalIndex;
import o.showTextSubstitutiondefault;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class DoPostLoginOperations {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final SharedResourcePool IconCompatParcelizer;
    public final SemanticsProperties_androidKt read;
    public final RouterLogger serializer;
    public final AuthStateMachine write;

    public DoPostLoginOperations(SemanticsProperties_androidKt semanticsProperties_androidKt, RouterLogger routerLogger, AuthStateMachine authStateMachine, SharedResourcePool sharedResourcePool) {
        semanticsProperties_androidKt.getClass();
        routerLogger.getClass();
        authStateMachine.getClass();
        sharedResourcePool.getClass();
        this.read = semanticsProperties_androidKt;
        this.serializer = routerLogger;
        this.write = authStateMachine;
        this.IconCompatParcelizer = sharedResourcePool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object saveData(getTextSelectionRange gettextselectionrange, String str, ContinuationImpl continuationImpl) {
        TransactionWithReturn transactionWithReturn;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof TransactionWithReturn) {
            transactionWithReturn = (TransactionWithReturn) continuationImpl;
            int i4 = transactionWithReturn.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = RemoteActionCompatParcelizer + 31;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                transactionWithReturn.serializer = i4 - Integer.MIN_VALUE;
            } else {
                transactionWithReturn = new TransactionWithReturn(this, continuationImpl);
            }
        } else {
            transactionWithReturn = new TransactionWithReturn(this, continuationImpl);
        }
        Object obj = transactionWithReturn.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = transactionWithReturn.serializer;
        if (i7 != 0) {
            int i8 = MediaMetadataCompat + 87;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = transactionWithReturn.RemoteActionCompatParcelizer;
            gettextselectionrange = transactionWithReturn.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            transactionWithReturn.write = gettextselectionrange;
            transactionWithReturn.RemoteActionCompatParcelizer = str;
            transactionWithReturn.serializer = 1;
            if (this.serializer.execute(gettextselectionrange, transactionWithReturn) == coroutineSingletons) {
                int i9 = MediaMetadataCompat + 17;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        }
        this.write.write(new setEditable(gettextselectionrange, str));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final Object invoke(getTextSelectionRange gettextselectionrange, String str, ContinuationImpl continuationImpl) {
        TransacterImpl transacterImpl;
        showTextSubstitutiondefault showtextsubstitutiondefault;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof TransacterImpl) {
            transacterImpl = (TransacterImpl) continuationImpl;
            int i3 = transacterImpl.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = RemoteActionCompatParcelizer + 95;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                transacterImpl.read = i3 - Integer.MIN_VALUE;
            } else {
                transacterImpl = new TransacterImpl(this, continuationImpl);
            }
        } else {
            transacterImpl = new TransacterImpl(this, continuationImpl);
        }
        Object obj = transacterImpl.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = transacterImpl.read;
        int i7 = 1;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SemanticsProperties_androidKt semanticsProperties_androidKt = this.read;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) semanticsProperties_androidKt.write;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_BIOMETRIC_BASELINE_TRACKING_ENABLED)) {
                setTextSubstitution settextsubstitutionWrite = semanticsProperties_androidKt.RemoteActionCompatParcelizer.write();
                setTraversalIndex settraversalindex = settextsubstitutionWrite.serializer;
                setTextSelectionRangeFDrldGo settextselectionrangefdrldgo = settraversalindex.IconCompatParcelizer;
                List list = settraversalindex.read;
                setTextSelectionRangeFDrldGo settextselectionrangefdrldgo2 = setTextSelectionRangeFDrldGo.AVAILABLE;
                if (settextselectionrangefdrldgo == settextselectionrangefdrldgo2) {
                    showtextsubstitutiondefault = new showTextSubstitutiondefault(settextselectionrangefdrldgo2, onContentCardDismissed.IconCompatParcelizer(list, ",", null, null, new hg$$ExternalSyntheticLambda5(26), 30));
                    i = RemoteActionCompatParcelizer + 17;
                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                } else {
                    setTraversalIndex settraversalindex2 = settextsubstitutionWrite.RemoteActionCompatParcelizer;
                    setTextSelectionRangeFDrldGo settextselectionrangefdrldgo3 = settraversalindex2.IconCompatParcelizer;
                    List list2 = settraversalindex2.read;
                    if (settextselectionrangefdrldgo3 == settextselectionrangefdrldgo2) {
                        showtextsubstitutiondefault = new showTextSubstitutiondefault(settextselectionrangefdrldgo2, onContentCardDismissed.IconCompatParcelizer(list2, ",", null, null, new hg$$ExternalSyntheticLambda5(27), 30));
                        i = MediaMetadataCompat + 85;
                        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                    } else {
                        setTextSelectionRangeFDrldGo settextselectionrangefdrldgo4 = setTextSelectionRangeFDrldGo.NOT_ENROLLED;
                        if (settextselectionrangefdrldgo == settextselectionrangefdrldgo4) {
                            showtextsubstitutiondefault = new showTextSubstitutiondefault(settextselectionrangefdrldgo4, onContentCardDismissed.IconCompatParcelizer(list, ",", null, null, new hg$$ExternalSyntheticLambda5(28), 30));
                        } else {
                            showtextsubstitutiondefault = settextselectionrangefdrldgo3 == settextselectionrangefdrldgo4 ? new showTextSubstitutiondefault(settextselectionrangefdrldgo4, onContentCardDismissed.IconCompatParcelizer(list2, ",", null, null, new hg$$ExternalSyntheticLambda5(29), 30)) : new showTextSubstitutiondefault(setTextSelectionRangeFDrldGo.NOT_SUPPORTED, onContentCardDismissed.IconCompatParcelizer(settextsubstitutionWrite.read.read, ",", null, null, new accessgetTextCentercp(i7), 30));
                        }
                    }
                    setShowingTextSubstitution setshowingtextsubstitution = semanticsProperties_androidKt.IconCompatParcelizer;
                    boolean zSerializer = semanticsProperties_androidKt.serializer.serializer();
                    setshowingtextsubstitution.getClass();
                    setshowingtextsubstitution.write.logEvent("rider_biometric_status", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("status", showtextsubstitutiondefault.read.getStatus()), new onViewAttachedToWindowlambda0("biometrics_types", showtextsubstitutiondefault.write), new onViewAttachedToWindowlambda0("should_launch", String.valueOf(zSerializer))));
                    int i8 = MediaMetadataCompat + 75;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
                int i10 = i % 2;
                setShowingTextSubstitution setshowingtextsubstitution2 = semanticsProperties_androidKt.IconCompatParcelizer;
                boolean zSerializer2 = semanticsProperties_androidKt.serializer.serializer();
                setshowingtextsubstitution2.getClass();
                setshowingtextsubstitution2.write.logEvent("rider_biometric_status", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("status", showtextsubstitutiondefault.read.getStatus()), new onViewAttachedToWindowlambda0("biometrics_types", showtextsubstitutiondefault.write), new onViewAttachedToWindowlambda0("should_launch", String.valueOf(zSerializer2))));
                int i11 = MediaMetadataCompat + 75;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
            transacterImpl.read = 1;
            if (saveData(gettextselectionrange, str, transacterImpl) == obj2) {
                return obj2;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        SharedResourcePool sharedResourcePool = this.IconCompatParcelizer;
        sharedResourcePool.IconCompatParcelizer();
        ((IncogniaManagerImpl) sharedResourcePool.IconCompatParcelizer).RemoteActionCompatParcelizer("login", null);
        return createFromParcel.INSTANCE;
    }
}
