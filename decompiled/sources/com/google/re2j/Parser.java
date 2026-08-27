package com.google.re2j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.SystemBarStyle$Companion;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCaptureException;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkManagerImpl;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.gson.JsonElement;
import com.huawei.agconnect.config.impl.m;
import com.huawei.hmf.tasks.a.j;
import com.huawei.location.Vw$Vw;
import com.huawei.location.sdm.Sdm;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.incognia.Callback;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.mapbox.navigation.ui.maps.camera.data.FollowingFrameOptions;
import com.mapbox.navigation.voice.api.MapboxSpeechApi$mainJobController$2;
import com.mapbox.navigator.RefreshRouteCallback;
import com.mapbox.search.common.concurrent.AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.deeplink.DeepLinkActivity;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.data.repository.CrowdSourcingImageRepositoryImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import com.roadrunner.freelancing.data.StopWorkingRepository$stopWorking$1;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.roadrunner.login.presentation.router.RouterActivity;
import com.roadrunner.networking.core.factory.RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import dagger.Lazy;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.completable.CompletableResumeNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.single.SingleResumeNext;
import java.io.File;
import java.lang.reflect.Type;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.EnumColumnAdapter;
import o.InfiniteAnimationPolicy;
import o.InfiniteAnimationPolicyKey;
import o.InputMethodSessioncreateInputConnection11;
import o.InspectableValue;
import o.InspectableValueKt;
import o.PinnableContainer;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.ViewCompatShimsApi29Impl;
import o.WrappedCompositionsetContent1211;
import o.accessgetOnAllConnectionsClosedp;
import o.accessgetValueOverridejd;
import o.asTree;
import o.createLifecycleAwareWindowRecomposer;
import o.decode;
import o.displayInAppMessagelambda1;
import o.enclosingTransactionruntime;
import o.executeAsList;
import o.getActionViewIntentlambda0;
import o.getCieXyz;
import o.getItemCount;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.load;
import o.notifyItemRangeInserted;
import o.onContentCardClicked;
import o.onEndApplyChanges;
import o.onFling;
import o.onItemDismiss;
import o.onMove;
import o.onPointerUp;
import o.onViewAttachedToWindowlambda0;
import o.prune;
import o.publishError;
import o.q3;
import o.q4ExternalSyntheticLambda9;
import o.r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ;
import o.r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.setLastClipui;
import o.setSubtitleTextColor;
import o.setTextCompositionRangepsREZIo;
import o.setTransactionSuccessful;
import o.takeOrElseDxMtmZc;
import o.throwSemanticsGetNotSupported;
import o.toContentCaptureSession;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.useEvaluationsCache;
import o.writeSelffwf_client_release;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class Parser {
    public static final int[][] RemoteActionCompatParcelizer = {new int[]{0, 1114111, 1}};
    public InputMethodSessioncreateInputConnection11 IconCompatParcelizer;
    public final String MediaSessionCompatQueueItem;
    public int read;
    public final accessgetOnAllConnectionsClosedp RatingCompat = new accessgetOnAllConnectionsClosedp();
    public int serializer = 0;
    public final HashMap write = new HashMap();

    public static void RemoteActionCompatParcelizer(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11) {
        if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetValueOverridejd.CHAR_CLASS) {
            int[] iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
            int length = iArr.length;
            if (length >= 4) {
                onFling.serializer(iArr, 0, length - 2);
                int i = 2;
                for (int i2 = 2; i2 < length; i2 += 2) {
                    int i3 = iArr[i2];
                    int i4 = iArr[i2 + 1];
                    int i5 = i - 1;
                    int i6 = iArr[i5];
                    if (i3 > i6 + 1) {
                        iArr[i] = i3;
                        iArr[i + 1] = i4;
                        i += 2;
                    } else if (i4 > i6) {
                        iArr[i5] = i4;
                    }
                }
                length = i;
            }
            if (length != iArr.length) {
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                iArr = iArr2;
            }
            inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = iArr;
            if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
                inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = null;
                inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.ANY_CHAR;
            } else if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
                inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = null;
                inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.ANY_CHAR_NOT_NL;
            }
        }
    }

    public static void RemoteActionCompatParcelizer(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11, InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12) {
        int[] iArr = InfiniteAnimationPolicyKey.write;
        int i = iArr[inputMethodSessioncreateInputConnection11.MediaMetadataCompat.ordinal()];
        int i2 = 0;
        if (i == 1) {
            int i3 = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem[0];
            int i4 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0];
            if (i3 == i4 && inputMethodSessioncreateInputConnection12.RemoteActionCompatParcelizer == inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer) {
                return;
            }
            inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.CHAR_CLASS;
            onFling onfling = new onFling(0);
            if ((inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 1) != 0) {
                onfling.read(i4, i4);
            } else {
                onfling.RemoteActionCompatParcelizer(i4, i4);
            }
            int i5 = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem[0];
            if ((inputMethodSessioncreateInputConnection12.RemoteActionCompatParcelizer & 1) != 0) {
                onfling.read(i5, i5);
            } else {
                onfling.RemoteActionCompatParcelizer(i5, i5);
            }
            inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = onfling.RemoteActionCompatParcelizer();
            return;
        }
        if (i == 2) {
            accessgetValueOverridejd accessgetvalueoverridejd = inputMethodSessioncreateInputConnection12.MediaMetadataCompat;
            accessgetValueOverridejd accessgetvalueoverridejd2 = accessgetValueOverridejd.LITERAL;
            int[] iArr2 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
            if (accessgetvalueoverridejd == accessgetvalueoverridejd2) {
                onFling onfling2 = new onFling(iArr2);
                int i6 = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem[0];
                if ((inputMethodSessioncreateInputConnection12.RemoteActionCompatParcelizer & 1) != 0) {
                    onfling2.read(i6, i6);
                } else {
                    onfling2.RemoteActionCompatParcelizer(i6, i6);
                }
                inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = onfling2.RemoteActionCompatParcelizer();
                return;
            }
            onFling onfling3 = new onFling(iArr2);
            int[] iArr3 = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem;
            while (i2 < iArr3.length) {
                onfling3.RemoteActionCompatParcelizer(iArr3[i2], iArr3[i2 + 1]);
                i2 += 2;
            }
            inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = onfling3.RemoteActionCompatParcelizer();
            return;
        }
        if (i != 3) {
            return;
        }
        int i7 = iArr[inputMethodSessioncreateInputConnection12.MediaMetadataCompat.ordinal()];
        if (i7 == 1) {
            int[] iArr4 = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem;
            if (iArr4.length != 1 || iArr4[0] != 10) {
                return;
            }
        } else if (i7 == 2) {
            while (true) {
                int[] iArr5 = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem;
                if (i2 >= iArr5.length) {
                    return;
                }
                if (iArr5[i2] > 10 || 10 > iArr5[i2 + 1]) {
                    i2 += 2;
                }
            }
        } else if (i7 == 3 || i7 != 4) {
            return;
        }
        inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.ANY_CHAR;
    }

    public static int read(prune pruneVar) {
        int iWrite;
        int i = pruneVar.IconCompatParcelizer;
        while (pruneVar.RemoteActionCompatParcelizer() && (iWrite = pruneVar.write()) >= 48 && iWrite <= 57) {
            pruneVar.write(1);
        }
        String strIconCompatParcelizer = pruneVar.IconCompatParcelizer(i);
        if (strIconCompatParcelizer.isEmpty()) {
            return -1;
        }
        if (strIconCompatParcelizer.length() > 1 && strIconCompatParcelizer.charAt(0) == '0') {
            return -1;
        }
        if (strIconCompatParcelizer.length() > 8) {
            return -2;
        }
        return Integer.valueOf(strIconCompatParcelizer, 10).intValue();
    }

    public static boolean read(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11) {
        accessgetValueOverridejd accessgetvalueoverridejd = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
        return (accessgetvalueoverridejd == accessgetValueOverridejd.LITERAL && inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem.length == 1) || accessgetvalueoverridejd == accessgetValueOverridejd.CHAR_CLASS || accessgetvalueoverridejd == accessgetValueOverridejd.ANY_CHAR_NOT_NL || accessgetvalueoverridejd == accessgetValueOverridejd.ANY_CHAR;
    }

    public static InputMethodSessioncreateInputConnection11[] write(InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr, int i, int i2) {
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr2 = new InputMethodSessioncreateInputConnection11[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            inputMethodSessioncreateInputConnection11Arr2[i3 - i] = inputMethodSessioncreateInputConnection11Arr[i3];
        }
        return inputMethodSessioncreateInputConnection11Arr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean IconCompatParcelizer() {
        accessgetOnAllConnectionsClosedp accessgetonallconnectionsclosedp = this.RatingCompat;
        int size = accessgetonallconnectionsclosedp.size();
        if (size >= 3 && ((InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(size - 2)).MediaMetadataCompat == accessgetValueOverridejd.VERTICAL_BAR) {
            int i = size - 1;
            if (read((InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i))) {
                int i2 = size - 3;
                if (read((InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i2))) {
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i);
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i2);
                    if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat.ordinal() > inputMethodSessioncreateInputConnection12.MediaMetadataCompat.ordinal()) {
                        accessgetonallconnectionsclosedp.set(i2, inputMethodSessioncreateInputConnection11);
                    } else {
                        inputMethodSessioncreateInputConnection12 = inputMethodSessioncreateInputConnection11;
                        inputMethodSessioncreateInputConnection11 = inputMethodSessioncreateInputConnection12;
                    }
                    RemoteActionCompatParcelizer(inputMethodSessioncreateInputConnection11, inputMethodSessioncreateInputConnection12);
                    write(inputMethodSessioncreateInputConnection12);
                    serializer();
                    return true;
                }
            }
        }
        if (size < 2) {
            return false;
        }
        int i3 = size - 1;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection13 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i3);
        int i4 = size - 2;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection14 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i4);
        if (inputMethodSessioncreateInputConnection14.MediaMetadataCompat != accessgetValueOverridejd.VERTICAL_BAR) {
            return false;
        }
        if (size >= 3) {
            RemoteActionCompatParcelizer((InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(size - 3));
        }
        accessgetonallconnectionsclosedp.set(i4, inputMethodSessioncreateInputConnection13);
        accessgetonallconnectionsclosedp.set(i3, inputMethodSessioncreateInputConnection14);
        return true;
    }

    public final boolean IconCompatParcelizer(prune pruneVar, onFling onfling) {
        String strSubstring;
        Pair pair;
        Pair pair2;
        int i = pruneVar.IconCompatParcelizer;
        int i2 = 0;
        if ((this.read & Fields.SpotShadowColor) == 0 || !(pruneVar.write("\\p") || pruneVar.write("\\P"))) {
            return false;
        }
        pruneVar.write(1);
        int i3 = pruneVar.serializer() == 80 ? -1 : 1;
        if (!pruneVar.RemoteActionCompatParcelizer()) {
            pruneVar.IconCompatParcelizer = i;
            throw new PatternSyntaxException("invalid character class range", pruneVar.MediaMetadataCompat());
        }
        int iSerializer = pruneVar.serializer();
        if (iSerializer != 123) {
            char c = (char) iSerializer;
            strSubstring = iSerializer == c ? String.valueOf(c) : new String(Character.toChars(c));
        } else {
            String strMediaMetadataCompat = pruneVar.MediaMetadataCompat();
            int iIndexOf = strMediaMetadataCompat.indexOf(125);
            if (iIndexOf < 0) {
                pruneVar.IconCompatParcelizer = i;
                throw new PatternSyntaxException("invalid character class range", pruneVar.MediaMetadataCompat());
            }
            strSubstring = strMediaMetadataCompat.substring(0, iIndexOf);
            pruneVar.IconCompatParcelizer = strSubstring.length() + pruneVar.IconCompatParcelizer;
            pruneVar.write(1);
        }
        if (!strSubstring.isEmpty() && strSubstring.charAt(0) == '^') {
            i3 = -i3;
            strSubstring = strSubstring.substring(1);
        }
        if (strSubstring.equals("Any")) {
            int[][] iArr = RemoteActionCompatParcelizer;
            pair = new Pair(iArr, i2, iArr);
        } else {
            int[][] iArr2 = (int[][]) InspectableValueKt.PlaybackStateCompatCustomAction.get(strSubstring);
            if (iArr2 != null) {
                pair2 = new Pair(iArr2, i2, InspectableValueKt.accessensureViewModelStore.get(strSubstring));
            } else {
                int[][] iArr3 = (int[][]) InspectableValueKt.getOnBackPressedDispatcherannotations.get(strSubstring);
                if (iArr3 != null) {
                    pair2 = new Pair(iArr3, i2, InspectableValueKt._init_lambda4.get(strSubstring));
                } else {
                    pair = null;
                }
            }
            pair = pair2;
        }
        if (pair == null) {
            throw new PatternSyntaxException("invalid character class range", pruneVar.IconCompatParcelizer(i));
        }
        int[][] iArr4 = (int[][]) pair.RemoteActionCompatParcelizer;
        int[][] iArr5 = (int[][]) pair.write;
        if ((this.read & 1) != 0 && iArr5 != null) {
            onFling onfling2 = new onFling(0);
            onfling2.IconCompatParcelizer(iArr4);
            onfling2.IconCompatParcelizer(iArr5);
            onfling2.write();
            onfling.serializer(onfling2.RemoteActionCompatParcelizer(), i3);
            return true;
        }
        if (i3 >= 0) {
            onfling.IconCompatParcelizer(iArr4);
            return true;
        }
        int i4 = 0;
        for (int[] iArr6 : iArr4) {
            int i5 = iArr6[0];
            int i6 = iArr6[1];
            int i7 = iArr6[2];
            if (i7 == 1) {
                int i8 = i5 - 1;
                if (i4 <= i8) {
                    onfling.RemoteActionCompatParcelizer(i4, i8);
                }
                i4 = i6 + 1;
            } else {
                while (i5 <= i6) {
                    int i9 = i5 - 1;
                    if (i4 <= i9) {
                        onfling.RemoteActionCompatParcelizer(i4, i9);
                    }
                    i4 = i5 + 1;
                    i5 += i7;
                }
            }
        }
        if (i4 <= 1114111) {
            onfling.RemoteActionCompatParcelizer(i4, 1114111);
        }
        return true;
    }

    public final void RemoteActionCompatParcelizer() {
        read(-1, 0);
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = read();
        if (inputMethodSessioncreateInputConnection11Arr.length == 0) {
            serializer(write(accessgetValueOverridejd.EMPTY_MATCH));
        } else {
            serializer(IconCompatParcelizer(inputMethodSessioncreateInputConnection11Arr, accessgetValueOverridejd.CONCAT));
        }
    }

    public final void read(int i) {
        int i2 = this.read;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write = write(accessgetValueOverridejd.LITERAL);
        inputMethodSessioncreateInputConnection11Write.RemoteActionCompatParcelizer = i2;
        if ((i2 & 1) != 0 && i >= 65 && i <= 66639) {
            int i3 = i;
            for (int i4 = InspectableValue.read(i); i4 != i; i4 = InspectableValue.read(i4)) {
                if (i3 > i4) {
                    i3 = i4;
                }
            }
            i = i3;
        }
        inputMethodSessioncreateInputConnection11Write.MediaSessionCompatQueueItem = new int[]{i};
        serializer(inputMethodSessioncreateInputConnection11Write);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean read(int i, int i2) {
        accessgetOnAllConnectionsClosedp accessgetonallconnectionsclosedp = this.RatingCompat;
        int size = accessgetonallconnectionsclosedp.size();
        if (size < 2) {
            return false;
        }
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(size - 1);
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(size - 2);
        accessgetValueOverridejd accessgetvalueoverridejd = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
        accessgetValueOverridejd accessgetvalueoverridejd2 = accessgetValueOverridejd.LITERAL;
        if (accessgetvalueoverridejd == accessgetvalueoverridejd2 && inputMethodSessioncreateInputConnection12.MediaMetadataCompat == accessgetvalueoverridejd2) {
            if ((inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 1) == (inputMethodSessioncreateInputConnection12.RemoteActionCompatParcelizer & 1)) {
                int[] iArr = inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem;
                int[] iArr2 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                int[] iArr3 = new int[iArr.length + iArr2.length];
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                inputMethodSessioncreateInputConnection12.MediaSessionCompatQueueItem = iArr3;
                if (i >= 0) {
                    inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = new int[]{i};
                    inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer = i2;
                    return true;
                }
                serializer();
                write(inputMethodSessioncreateInputConnection11);
            }
        }
        return false;
    }

    public final boolean read(prune pruneVar, onFling onfling) {
        int i = pruneVar.IconCompatParcelizer;
        if ((this.read & 64) != 0 && pruneVar.RemoteActionCompatParcelizer() && pruneVar.serializer() == 92 && pruneVar.RemoteActionCompatParcelizer()) {
            pruneVar.serializer();
            InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) InfiniteAnimationPolicy.RemoteActionCompatParcelizer.get(pruneVar.IconCompatParcelizer(i));
            if (infiniteAnimationPolicy != null) {
                onfling.RemoteActionCompatParcelizer(infiniteAnimationPolicy, (this.read & 1) != 0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputMethodSessioncreateInputConnection11[] read() {
        accessgetOnAllConnectionsClosedp accessgetonallconnectionsclosedp = this.RatingCompat;
        int size = accessgetonallconnectionsclosedp.size();
        int i = size;
        while (i > 0 && !((InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i - 1)).MediaMetadataCompat.isPseudo()) {
            i--;
        }
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = (InputMethodSessioncreateInputConnection11[]) accessgetonallconnectionsclosedp.subList(i, size).toArray(new InputMethodSessioncreateInputConnection11[size - i]);
        accessgetonallconnectionsclosedp.removeRange(i, size);
        return inputMethodSessioncreateInputConnection11Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputMethodSessioncreateInputConnection11 serializer() {
        accessgetOnAllConnectionsClosedp accessgetonallconnectionsclosedp = this.RatingCompat;
        return (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.remove(accessgetonallconnectionsclosedp.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    public final InputMethodSessioncreateInputConnection11 serializer(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        int i5;
        accessgetValueOverridejd accessgetvalueoverridejd = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
        accessgetValueOverridejd accessgetvalueoverridejd2 = accessgetValueOverridejd.CHAR_CLASS;
        if (accessgetvalueoverridejd == accessgetvalueoverridejd2) {
            int[] iArr3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
            if (iArr3.length == 2 && (i5 = iArr3[0]) == iArr3[1]) {
                if (read(i5, this.read & (-2))) {
                    return null;
                }
                inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.LITERAL;
                inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = new int[]{inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0]};
                inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer = this.read & (-2);
            } else if (accessgetvalueoverridejd == accessgetvalueoverridejd2) {
                iArr2 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                if (iArr2.length != 4 && (i4 = iArr2[0]) == iArr2[1] && iArr2[2] == iArr2[3]) {
                    int i6 = InspectableValue.read(i4);
                    int i7 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[2];
                    if (i6 != i7 || InspectableValue.read(i7) != inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0]) {
                        if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd2) {
                            iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                            if (iArr.length == 2) {
                                i = iArr[0];
                                if (i + 1 == iArr[1]) {
                                    i2 = InspectableValue.read(i);
                                    i3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[1];
                                    if (i2 != i3) {
                                    }
                                }
                            }
                        }
                        read(-1, 0);
                    } else {
                        if (read(inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0], this.read | 1)) {
                            return null;
                        }
                        inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.LITERAL;
                        inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = new int[]{inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0]};
                        inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer = this.read | 1;
                    }
                } else {
                    if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd2) {
                        iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                        if (iArr.length == 2) {
                            i = iArr[0];
                            if (i + 1 == iArr[1]) {
                                i2 = InspectableValue.read(i);
                                i3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[1];
                                if (i2 != i3 && InspectableValue.read(i3) == inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0]) {
                                    if (read(inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0], this.read | 1)) {
                                        return null;
                                    }
                                    inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.LITERAL;
                                    inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = new int[]{inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[0]};
                                    inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer = this.read | 1;
                                }
                            }
                        }
                    }
                    read(-1, 0);
                }
            } else {
                if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd2) {
                    iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                    if (iArr.length == 2) {
                        i = iArr[0];
                        if (i + 1 == iArr[1]) {
                            i2 = InspectableValue.read(i);
                            i3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[1];
                            if (i2 != i3) {
                            }
                        }
                    }
                }
                read(-1, 0);
            }
        } else if (accessgetvalueoverridejd == accessgetvalueoverridejd2) {
            iArr2 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
            if (iArr2.length != 4) {
                if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd2) {
                    iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                    if (iArr.length == 2) {
                        i = iArr[0];
                        if (i + 1 == iArr[1]) {
                            i2 = InspectableValue.read(i);
                            i3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[1];
                            if (i2 != i3) {
                            }
                        }
                    }
                }
                read(-1, 0);
            } else {
                if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd2) {
                    iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                    if (iArr.length == 2) {
                        i = iArr[0];
                        if (i + 1 == iArr[1]) {
                            i2 = InspectableValue.read(i);
                            i3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[1];
                            if (i2 != i3) {
                            }
                        }
                    }
                }
                read(-1, 0);
            }
        } else {
            if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd2) {
                iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                if (iArr.length == 2) {
                    i = iArr[0];
                    if (i + 1 == iArr[1]) {
                        i2 = InspectableValue.read(i);
                        i3 = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem[1];
                        if (i2 != i3) {
                        }
                    }
                }
            }
            read(-1, 0);
        }
        this.RatingCompat.add(inputMethodSessioncreateInputConnection11);
        return inputMethodSessioncreateInputConnection11;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[LOOP:0: B:23:0x004a->B:24:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    public final InputMethodSessioncreateInputConnection11 write(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11, int i) {
        int[] iArr;
        int length;
        int i2;
        int[] iArr2;
        int i3;
        accessgetValueOverridejd accessgetvalueoverridejd = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
        if (accessgetvalueoverridejd == accessgetValueOverridejd.CONCAT) {
            InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
            if (inputMethodSessioncreateInputConnection11Arr.length > 0) {
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write = write(inputMethodSessioncreateInputConnection11Arr[0], i);
                inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0] = inputMethodSessioncreateInputConnection11Write;
                accessgetValueOverridejd accessgetvalueoverridejd2 = inputMethodSessioncreateInputConnection11Write.MediaMetadataCompat;
                accessgetValueOverridejd accessgetvalueoverridejd3 = accessgetValueOverridejd.EMPTY_MATCH;
                if (accessgetvalueoverridejd2 == accessgetvalueoverridejd3) {
                    write(inputMethodSessioncreateInputConnection11Write);
                    InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr2 = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                    int length2 = inputMethodSessioncreateInputConnection11Arr2.length;
                    if (length2 == 0 || length2 == 1) {
                        inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetvalueoverridejd3;
                        inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem = null;
                        return inputMethodSessioncreateInputConnection11;
                    }
                    if (length2 != 2) {
                        inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem = write(inputMethodSessioncreateInputConnection11Arr2, 1, inputMethodSessioncreateInputConnection11Arr2.length);
                        return inputMethodSessioncreateInputConnection11;
                    }
                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12 = inputMethodSessioncreateInputConnection11Arr2[1];
                    write(inputMethodSessioncreateInputConnection11);
                    return inputMethodSessioncreateInputConnection12;
                }
            } else if (accessgetvalueoverridejd == accessgetValueOverridejd.LITERAL) {
                iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                length = iArr.length;
                i2 = length - i;
                iArr2 = new int[i2];
                for (i3 = i; i3 < length; i3++) {
                    iArr2[i3 - i] = iArr[i3];
                }
                inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = iArr2;
                if (i2 == 0) {
                    inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.EMPTY_MATCH;
                }
            }
        } else if (accessgetvalueoverridejd == accessgetValueOverridejd.LITERAL) {
            iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
            length = iArr.length;
            i2 = length - i;
            iArr2 = new int[i2];
            while (i3 < length) {
                iArr2[i3 - i] = iArr[i3];
            }
            inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = iArr2;
            if (i2 == 0) {
                inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetValueOverridejd.EMPTY_MATCH;
            }
        }
        return inputMethodSessioncreateInputConnection11;
    }

    public final class Pair implements load, RefreshRouteCallback, QueryRenderedFeaturesCallback, throwSemanticsGetNotSupported, r8lambda8MKYOLZlH_k8e1G4bUHcvyCf8WQ, setSubtitleTextColor, Callback, useEvaluationsCache, PinnableContainer {
        private static int IconCompatParcelizer = 0;
        private static int MediaSessionCompatQueueItem = 1;
        public static int read;
        public Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int serializer;
        public Object write;

        public FollowingFrameOptions getFollowingFrameOptions() {
            FollowingFrameOptions followingFrameOptions;
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem;
            int i3 = i2 + 107;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                followingFrameOptions = (FollowingFrameOptions) this.RemoteActionCompatParcelizer;
                int i4 = 26 / 0;
            } else {
                followingFrameOptions = (FollowingFrameOptions) this.RemoteActionCompatParcelizer;
            }
            int i5 = i2 + 7;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return followingFrameOptions;
            }
            throw null;
        }

        public Pair(int i) {
            this.serializer = i;
            if (i == 4) {
                this.RemoteActionCompatParcelizer = StateFlowKt.read(SimpleItemTouchHelperCallback.serializer);
                this.write = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"energy_consumption_curve", "ev_freeflow_consumption_curve", "ev_initial_charge", "auxiliary_consumption", "ev_pre_conditioning_time", "ev_unconditioned_charging_curve"});
            } else if (i == 10) {
                this.RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());
                this.write = new AndroidMainThreadWorkerImpl$$ExternalSyntheticLambda0(this);
            } else {
                int i2 = 26;
                this.RemoteActionCompatParcelizer = new m(new j(i2));
                this.write = new m(new toContentCaptureSession(i2));
            }
        }

        @Override // o.setSubtitleTextColor
        public void write(ImageCaptureException imageCaptureException) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 97;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((NestFragment.AnonymousClass1) this.RemoteActionCompatParcelizer).invoke(imageCaptureException);
            int i4 = MediaSessionCompatQueueItem + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.setSubtitleTextColor
        public void IconCompatParcelizer(ImageCapture$1 imageCapture$1) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 59;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                imageCapture$1.getClass();
                ((RetryWithDelay$$ExternalSyntheticLambda0) this.write).invoke((Uri) imageCapture$1.MediaSessionCompatQueueItem);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            imageCapture$1.getClass();
            ((RetryWithDelay$$ExternalSyntheticLambda0) this.write).invoke((Uri) imageCapture$1.MediaSessionCompatQueueItem);
            int i3 = IconCompatParcelizer + 71;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }

        @Override // o.useEvaluationsCache
        public Type RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            useEvaluationsCache useevaluationscache = (useEvaluationsCache) this.RemoteActionCompatParcelizer;
            if (useevaluationscache != null) {
                int i2 = IconCompatParcelizer + 57;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Type typeRemoteActionCompatParcelizer = useevaluationscache.RemoteActionCompatParcelizer();
                if (typeRemoteActionCompatParcelizer != null) {
                    int i4 = IconCompatParcelizer + 89;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i5 = 77 / 0;
                    }
                    return typeRemoteActionCompatParcelizer;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported return type");
            return null;
        }

        public getItemCount write(onPointerUp onpointerup) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 61;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String str = onpointerup.source;
            List list = onpointerup.highlights;
            g0 g0Var = (g0) this.RemoteActionCompatParcelizer;
            Float f = onpointerup.weight;
            g0Var.getClass();
            Float fWrite = g0.write(f);
            notifyItemRangeInserted notifyitemrangeinserted = (notifyItemRangeInserted) this.write;
            String str2 = onpointerup.contentScale;
            if (str2 == null) {
                int i4 = MediaSessionCompatQueueItem + 101;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 0;
                }
                str2 = "";
            }
            notifyitemrangeinserted.getClass();
            return new getItemCount(str, list, notifyItemRangeInserted.read(str2), fWrite);
        }

        public Intent read(Context context, String str, Integer num, PushAnalyticsData pushAnalyticsData) {
            int i = 2 % 2;
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) DeepLinkActivity.class);
            intent.setFlags(67108864);
            intent.setData(Uri.parse(str));
            if (num != null) {
                intent.putExtra("notification_id", num.intValue());
            }
            if (pushAnalyticsData != null) {
                int i2 = MediaSessionCompatQueueItem + 105;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                intent.putExtra("analytics_data", pushAnalyticsData);
                int i4 = MediaSessionCompatQueueItem + 71;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            return intent;
        }

        public void IconCompatParcelizer() {
            int i = 2 % 2;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.RemoteActionCompatParcelizer;
            setLastClipui setlastclipui = new setLastClipui(this, 0);
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT target_id, target_proto FROM targets", null);
            int i2 = IconCompatParcelizer + 67;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            while (true) {
                int i3 = i2 % 2;
                try {
                    if (!cursorRawQuery.moveToNext()) {
                        cursorRawQuery.close();
                        return;
                    } else {
                        setlastclipui.IconCompatParcelizer(cursorRawQuery);
                        i2 = MediaSessionCompatQueueItem + 123;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    }
                } catch (Throwable th) {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        public boolean RemoteActionCompatParcelizer(String str) {
            int i = 2 % 2;
            Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) this.RemoteActionCompatParcelizer).rawQueryWithFactory(new takeOrElseDxMtmZc(1, new Object[]{str}), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
            try {
                boolean zMoveToFirst = cursorRawQueryWithFactory.moveToFirst();
                cursorRawQueryWithFactory.close();
                return zMoveToFirst;
            } catch (Throwable th) {
                if (cursorRawQueryWithFactory != null) {
                    try {
                        cursorRawQueryWithFactory.close();
                        int i2 = MediaSessionCompatQueueItem + 121;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // com.incognia.Callback
        public void onCompleted(Object obj) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 121;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String str = (String) obj;
            IncogniaManagerImpl incogniaManagerImpl = (IncogniaManagerImpl) this.RemoteActionCompatParcelizer;
            decode decodeVar = incogniaManagerImpl.write;
            if (str != null) {
                int i4 = MediaSessionCompatQueueItem + 67;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    decodeVar.logEvent("incognia_event_success", null);
                    throw null;
                }
                decodeVar.logEvent("incognia_event_success", null);
            } else {
                decodeVar.logEvent("incognia_event_failure", null);
                EnumColumnAdapter.serializer(incogniaManagerImpl.serializer, "incognia_fetch_token_failed", executeAsList.INFRA, "Something went wrong, token the value is null");
            }
            CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.write;
            if (str == null) {
                str = "";
            }
            cancellableContinuationImpl.resumeWith(str);
        }

        @Override // com.mapbox.navigator.RefreshRouteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
        public void run(Expected expected) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 25;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            expected.getClass();
            if (i4 == 6) {
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.RemoteActionCompatParcelizer).invoke((CancellableContinuationImpl) this.write, expected);
                return;
            }
            List list = (List) expected.getValue();
            if (list == null) {
                list = instance_delegatelambda0.write;
            }
            ((SafeContinuation) this.write).resumeWith(SystemBarStyle$Companion.getIndexOfFirstFeature(list, (List) this.RemoteActionCompatParcelizer));
            int i5 = MediaSessionCompatQueueItem + 53;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void write() {
            HandlerThread handlerThread;
            int i = 2 % 2;
            createLifecycleAwareWindowRecomposer createlifecycleawarewindowrecomposer = (createLifecycleAwareWindowRecomposer) this.RemoteActionCompatParcelizer;
            if (createlifecycleawarewindowrecomposer == null) {
                int i2 = MediaSessionCompatQueueItem + 31;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmWrapper", "no need stop");
                return;
            }
            Sdm sdm = (Sdm) this.write;
            if (sdm == null) {
                int i4 = MediaSessionCompatQueueItem + 71;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                WrappedCompositionsetContent1211.read("SdmWrapper", "no sdm to stop");
                return;
            }
            if (sdm.RemoteActionCompatParcelizer != null && (handlerThread = sdm.MediaSessionCompatResultReceiverWrapper) != null) {
                int i6 = MediaSessionCompatQueueItem + 5;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (handlerThread.isAlive()) {
                    int i8 = IconCompatParcelizer + 113;
                    MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    ViewCompatShimsApi29Impl viewCompatShimsApi29Impl = sdm.RemoteActionCompatParcelizer;
                    int i10 = ViewCompatShimsApi29Impl.IconCompatParcelizer;
                    viewCompatShimsApi29Impl.obtainMessage(2, createlifecycleawarewindowrecomposer).sendToTarget();
                }
            }
            sdm.IconCompatParcelizer.quitSafely();
            sdm.IconCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = null;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmWrapper", "sdm stop success");
            int i11 = IconCompatParcelizer + 119;
            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 28 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0022  */
        /* JADX INFO: renamed from: stopWorking-IoAF18A, reason: not valid java name */
        public Object m4502stopWorkingIoAF18A(ContinuationImpl continuationImpl) {
            StopWorkingRepository$stopWorking$1 stopWorkingRepository$stopWorking$1;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 33;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i2 % 2 == 0) {
                boolean z = continuationImpl instanceof StopWorkingRepository$stopWorking$1;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            if (continuationImpl instanceof StopWorkingRepository$stopWorking$1) {
                stopWorkingRepository$stopWorking$1 = (StopWorkingRepository$stopWorking$1) continuationImpl;
                int i3 = stopWorkingRepository$stopWorking$1.IconCompatParcelizer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    stopWorkingRepository$stopWorking$1.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
                } else {
                    stopWorkingRepository$stopWorking$1 = new StopWorkingRepository$stopWorking$1(this, continuationImpl);
                }
            } else {
                stopWorkingRepository$stopWorking$1 = new StopWorkingRepository$stopWorking$1(this, continuationImpl);
            }
            Object obj = stopWorkingRepository$stopWorking$1.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = stopWorkingRepository$stopWorking$1.IconCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.write;
                MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 11);
                stopWorkingRepository$stopWorking$1.IconCompatParcelizer = 1;
                Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(mapboxNavigation$parsing$2, stopWorkingRepository$stopWorking$1);
                return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
            }
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = IconCompatParcelizer + 5;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i6 = 46 / 0;
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }

        public boolean write(String str, String str2) {
            int i = 2 % 2;
            ArrayList arrayList = new ArrayList();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = ((SQLiteDatabase) this.RemoteActionCompatParcelizer).rawQuery("PRAGMA table_info(" + str + ")", null);
                int columnIndex = cursorRawQuery.getColumnIndex("name");
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(cursorRawQuery.getString(columnIndex));
                }
                cursorRawQuery.close();
                if (arrayList.indexOf(str2) == -1) {
                    return false;
                }
                int i2 = MediaSessionCompatQueueItem + 75;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    int i4 = IconCompatParcelizer + 39;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        
            r7 = r7.getException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        
            if (r7 != null) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            r7 = new com.roadrunner.push.core.data.MessagingServiceException("Unable to fetch the firebase token", null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            r2 = ((o.r8lambdazY6FrfYmpvd_923yIbo0dPcgKo) ((o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU) r6.write).IconCompatParcelizer.write()).IconCompatParcelizer;
            r3 = o.executeAsList.INFRA;
            r4 = r7.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            if (r4 != null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            r4 = com.google.re2j.Parser.Pair.MediaSessionCompatQueueItem + 77;
            com.google.re2j.Parser.Pair.IconCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r4 = r4 % 2;
            r4 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
            o.EnumColumnAdapter.serializer(r2, "push_google_token_provider_failed", r3, r4);
            timber.log.Timber.RemoteActionCompatParcelizer.write(new com.roadrunner.push.core.data.MessagingServiceException("Unable to fetch the gms token", r7));
            r1.resumeWith(new o.isItemDismissable(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        
            if ((!r7.isSuccessful()) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (r7.isSuccessful() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        
            r2 = com.google.re2j.Parser.Pair.MediaSessionCompatQueueItem + 105;
            com.google.re2j.Parser.Pair.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r2 = r2 % 2;
            r1.resumeWith(r7.getResult());
         */
        @Override // o.PinnableContainer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onComplete(com.google.android.gms.tasks.Task r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.google.re2j.Parser.Pair.IconCompatParcelizer
                int r1 = r1 + 121
                int r2 = r1 % 128
                com.google.re2j.Parser.Pair.MediaSessionCompatQueueItem = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L22
                java.lang.Object r1 = r6.RemoteActionCompatParcelizer
                kotlinx.coroutines.CancellableContinuationImpl r1 = (kotlinx.coroutines.CancellableContinuationImpl) r1
                r7.getClass()
                boolean r2 = r7.isSuccessful()
                r3 = 63
                int r3 = r3 / 0
                r2 = r2 ^ 1
                if (r2 == 0) goto L2f
                goto L40
            L22:
                java.lang.Object r1 = r6.RemoteActionCompatParcelizer
                kotlinx.coroutines.CancellableContinuationImpl r1 = (kotlinx.coroutines.CancellableContinuationImpl) r1
                r7.getClass()
                boolean r2 = r7.isSuccessful()
                if (r2 == 0) goto L40
            L2f:
                int r2 = com.google.re2j.Parser.Pair.MediaSessionCompatQueueItem
                int r2 = r2 + 105
                int r3 = r2 % 128
                com.google.re2j.Parser.Pair.IconCompatParcelizer = r3
                int r2 = r2 % r0
                java.lang.Object r7 = r7.getResult()
                r1.resumeWith(r7)
                return
            L40:
                java.lang.Exception r7 = r7.getException()
                if (r7 != 0) goto L4e
                com.roadrunner.push.core.data.MessagingServiceException r7 = new com.roadrunner.push.core.data.MessagingServiceException
                java.lang.String r2 = "Unable to fetch the firebase token"
                r3 = 0
                r7.<init>(r2, r3)
            L4e:
                java.lang.Object r2 = r6.write
                o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU r2 = (o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU) r2
                dagger.Lazy r2 = r2.IconCompatParcelizer
                java.lang.Object r2 = r2.write()
                o.r8lambdazY6FrfYmpvd_923yIbo0dPcgKo r2 = (o.r8lambdazY6FrfYmpvd_923yIbo0dPcgKo) r2
                o.EnumColumnAdapter r2 = r2.IconCompatParcelizer
                o.executeAsList r3 = o.executeAsList.INFRA
                java.lang.String r4 = r7.getMessage()
                if (r4 != 0) goto L6f
                int r4 = com.google.re2j.Parser.Pair.MediaSessionCompatQueueItem
                int r4 = r4 + 77
                int r5 = r4 % 128
                com.google.re2j.Parser.Pair.IconCompatParcelizer = r5
                int r4 = r4 % r0
                java.lang.String r4 = ""
            L6f:
                java.lang.String r0 = "push_google_token_provider_failed"
                o.EnumColumnAdapter.serializer(r2, r0, r3, r4)
                timber.log.Timber$Forest r0 = timber.log.Timber.RemoteActionCompatParcelizer
                com.roadrunner.push.core.data.MessagingServiceException r2 = new com.roadrunner.push.core.data.MessagingServiceException
                java.lang.String r3 = "Unable to fetch the gms token"
                r2.<init>(r3, r7)
                r0.write(r2)
                o.isItemDismissable r0 = new o.isItemDismissable
                r0.<init>(r7)
                r1.resumeWith(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.re2j.Parser.Pair.onComplete(com.google.android.gms.tasks.Task):void");
        }

        public /* synthetic */ Pair(Object obj, int i, Object obj2) {
            this.serializer = i;
            this.RemoteActionCompatParcelizer = obj;
            this.write = obj2;
        }

        public Pair(Vw$Vw vw$Vw) {
            this.serializer = 5;
            this.RemoteActionCompatParcelizer = vw$Vw;
            this.write = new LinkedHashSet();
        }

        public Pair(g0 g0Var, notifyItemRangeInserted notifyitemrangeinserted) {
            this.serializer = 22;
            g0Var.getClass();
            notifyitemrangeinserted.getClass();
            this.RemoteActionCompatParcelizer = g0Var;
            this.write = notifyitemrangeinserted;
        }

        public Pair(SendTestPushUseCase sendTestPushUseCase, EnumColumnAdapter enumColumnAdapter) {
            this.serializer = 18;
            sendTestPushUseCase.getClass();
            enumColumnAdapter.getClass();
            this.RemoteActionCompatParcelizer = sendTestPushUseCase;
            this.write = enumColumnAdapter;
        }

        public Pair(transferSessionPackageI transfersessionpackagei, setTextCompositionRangepsREZIo settextcompositionrangepsrezio) {
            this.serializer = 11;
            transfersessionpackagei.getClass();
            settextcompositionrangepsrezio.getClass();
            this.RemoteActionCompatParcelizer = transfersessionpackagei;
            this.write = settextcompositionrangepsrezio;
        }

        public void serializer(Activity activity, Uri uri, boolean z) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            activity.getClass();
            q3 q3Var = (q3) ((q4ExternalSyntheticLambda9) this.RemoteActionCompatParcelizer);
            q3Var.getClass();
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(MainActivity.class);
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            if (((CourierApplication) applicationContext)._init_lambda4.contains(Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer).getSimpleName())) {
                q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(q3Var, activity, null, uri, 16);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeepLink Main Screen Opened", new Object[0]);
                return;
            }
            ((getActionViewIntentlambda0) ((enclosingTransactionruntime) this.write)).getClass();
            Intent intent = new Intent(activity, (Class<?>) RouterActivity.class);
            if (z) {
                int i4 = MediaSessionCompatQueueItem + 25;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    intent.addFlags(268468224);
                    int i5 = 50 / 0;
                } else {
                    intent.addFlags(268468224);
                }
            }
            if (uri != null) {
                int i6 = MediaSessionCompatQueueItem + 73;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    intent.putExtra("deeplinkUri", uri);
                    throw null;
                }
                intent.putExtra("deeplinkUri", uri);
            }
            activity.startActivityForResult(intent, -1, null);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeepLink Login Screen Opened", new Object[0]);
        }

        public void write(String[] strArr, Runnable runnable) {
            String strM;
            int i = 2 % 2;
            String strM2 = ff$$ExternalSyntheticOutline0.m(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
            int i2 = 0;
            boolean z = false;
            while (i2 < strArr.length) {
                int i3 = MediaSessionCompatQueueItem + 91;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    String str = strArr[i2];
                    boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
                    if (i2 == 0) {
                        z = zRemoteActionCompatParcelizer;
                    } else if (zRemoteActionCompatParcelizer != z) {
                        int i4 = MediaSessionCompatQueueItem + 91;
                        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        String strM3 = ff$$ExternalSyntheticOutline0.m("Expected all of ", strM2, " to either exist or not, but ");
                        if (!(!z)) {
                            strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(strM3), strArr[0], " exists and ", str, " does not");
                        } else {
                            strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(strM3), strArr[0], " does not exist and ", str, " does");
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(strM);
                        return;
                    }
                    i2++;
                    int i6 = MediaSessionCompatQueueItem + 41;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    RemoteActionCompatParcelizer(strArr[i2]);
                    throw null;
                }
            }
            if (!z) {
                runnable.run();
            } else {
                onEndApplyChanges.read("SQLiteSchema", ff$$ExternalSyntheticOutline0.m("Skipping migration because all of ", strM2, " already exist"), new Object[0]);
            }
        }

        public Pair(Lazy lazy, Lazy lazy2) {
            this.serializer = 12;
            lazy.getClass();
            lazy2.getClass();
            this.RemoteActionCompatParcelizer = lazy;
            this.write = lazy2;
        }

        public Pair(CrowdSourcingImageRepositoryImpl crowdSourcingImageRepositoryImpl, g0 g0Var) {
            this.serializer = 15;
            crowdSourcingImageRepositoryImpl.getClass();
            g0Var.getClass();
            this.RemoteActionCompatParcelizer = crowdSourcingImageRepositoryImpl;
            this.write = g0Var;
        }

        public Pair(setTransactionSuccessful settransactionsuccessful, publishError publisherror) {
            this.serializer = 26;
            publisherror.getClass();
            settransactionsuccessful.getClass();
            this.RemoteActionCompatParcelizer = publisherror;
            this.write = settransactionsuccessful;
        }

        public Pair(File file) {
            this.serializer = 9;
            this.RemoteActionCompatParcelizer = file;
            this.write = new isAdapterPositionOnScreen(MapboxSpeechApi$mainJobController$2.INSTANCE$2);
        }

        public Pair(NestComponentRepositoryImpl nestComponentRepositoryImpl, n0 n0Var) {
            this.serializer = 21;
            nestComponentRepositoryImpl.getClass();
            n0Var.getClass();
            this.RemoteActionCompatParcelizer = nestComponentRepositoryImpl;
            this.write = n0Var;
        }

        public HashMap currentData(Map map) {
            String asString;
            int i = 2 % 2;
            HashMap map2 = new HashMap(new HashMap((Map) ((MutableStateFlow) this.RemoteActionCompatParcelizer).read()));
            map2.remove("nav-sdk-ev-efficiency");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((Set) this.write).iterator();
            while (true) {
                asString = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                JsonElement jsonElement = (JsonElement) map.get(str);
                if (jsonElement != null) {
                    int i2 = IconCompatParcelizer + 107;
                    MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        try {
                            int i3 = 40 / 0;
                            asString = jsonElement.getAsString();
                        } catch (Throwable unused) {
                        }
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    if (asString != null) {
                        int i4 = IconCompatParcelizer + 7;
                        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            linkedHashMap.put(str, asString);
                            int i5 = 47 / 0;
                        } else {
                            linkedHashMap.put(str, asString);
                        }
                    }
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!map2.keySet().contains(str2)) {
                    int i6 = IconCompatParcelizer + 33;
                    MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        map2.put(str2, str3);
                        asString.hashCode();
                        throw null;
                    }
                    map2.put(str2, str3);
                }
            }
            int i7 = IconCompatParcelizer + 67;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return map2;
        }

        public Pair(WorkManagerImpl workManagerImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
            this.serializer = 28;
            workManagerImpl.getClass();
            isopeninternalroom_runtime.getClass();
            this.RemoteActionCompatParcelizer = workManagerImpl;
            this.write = isopeninternalroom_runtime;
        }

        public Pair(q4ExternalSyntheticLambda9 q4externalsyntheticlambda9, enclosingTransactionruntime enclosingtransactionruntime) {
            this.serializer = 14;
            q4externalsyntheticlambda9.getClass();
            enclosingtransactionruntime.getClass();
            this.RemoteActionCompatParcelizer = q4externalsyntheticlambda9;
            this.write = enclosingtransactionruntime;
        }

        public /* synthetic */ Pair(int i, boolean z) {
            this.serializer = i;
        }

        @Override // o.useEvaluationsCache
        public Object write(writeSelffwf_client_release writeselffwf_client_release) {
            int i = 2;
            int i2 = 2 % 2;
            useEvaluationsCache useevaluationscache = (useEvaluationsCache) this.RemoteActionCompatParcelizer;
            if (useevaluationscache != null) {
                int i3 = IconCompatParcelizer + 41;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                Object objWrite = useevaluationscache.write(writeselffwf_client_release);
                if (objWrite != null) {
                    int i5 = MediaSessionCompatQueueItem + 11;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    int i7 = 6;
                    if (objWrite instanceof Flowable) {
                        return new FlowableOnErrorNext((Flowable) objWrite, new GetAppStateImpl(i7, new RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0(this, 0)));
                    }
                    if (objWrite instanceof Single) {
                        return new SingleResumeNext((Single) objWrite, new GetAppStateImpl(i7, new RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0(this, 1)));
                    }
                    int i8 = 29;
                    if (!(objWrite instanceof Maybe)) {
                        if (objWrite instanceof Completable) {
                            return new CompletableResumeNext((Completable) objWrite, new RetryWithDelay$$ExternalSyntheticLambda1(i8, new RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0(this, 3)));
                        }
                        return objWrite instanceof Observable ? new ObservableOnErrorNext((Observable) objWrite, new GetAppStateImpl(i7, new RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0(this, 4))) : objWrite;
                    }
                    MaybeOnErrorNext maybeOnErrorNext = new MaybeOnErrorNext((Maybe) objWrite, new GetAppStateImpl(i7, new RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper$$ExternalSyntheticLambda0(this, i)));
                    int i9 = IconCompatParcelizer + 29;
                    MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        return maybeOnErrorNext;
                    }
                    throw null;
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported return type");
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x0052  */
        /* JADX WARN: Code duplicated, block: B:18:0x0074  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:22:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:28:0x00db  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:37:0x006a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x004c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0119 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x0118 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:1: B:26:0x00d4->B:44:?, LOOP_END, SYNTHETIC] */
        public boolean serializer(Map map, List list, asTree astree) {
            List list2;
            ArrayList arrayList;
            Iterator it;
            int i;
            int i2 = 2 % 2;
            int i3 = MediaSessionCompatQueueItem + 81;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            map.getClass();
            list.getClass();
            if (!((FirebaseRemoteConfigImpl) ((r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI) ((SendTestPushUseCase) this.RemoteActionCompatParcelizer).serializer).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                int i5 = IconCompatParcelizer + 51;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 0 / 0;
                    if (astree != null) {
                        list2 = list;
                        arrayList = new ArrayList();
                        for (Object obj : list2) {
                            int i7 = MediaSessionCompatQueueItem + 79;
                            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            if (!map.containsKey((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            ((SentryCriticalIssueLogger) ((EnumColumnAdapter) this.write)).write("customer_unavailable_critical_component_validation_error", executeAsList.PUDO, c8$$ExternalSyntheticOutline0.m("No current Step on UTCC flow for: ", list), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("root_error_class", "ShouldEnableComponentUseCase"), new onViewAttachedToWindowlambda0("required_steps", list.toString()), new onViewAttachedToWindowlambda0("all_current_steps", map.keySet().toString())));
                            return true;
                        }
                        if (list2 instanceof Collection) {
                            int i9 = IconCompatParcelizer + 55;
                            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            if (!list2.isEmpty()) {
                                it = list2.iterator();
                                while (!(!it.hasNext())) {
                                    i = IconCompatParcelizer + 23;
                                    MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                                    if (i % 2 != 0) {
                                        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                                        throw null;
                                    }
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                                        return false;
                                    }
                                }
                            }
                        } else {
                            it = list2.iterator();
                            while (!(!it.hasNext())) {
                                i = IconCompatParcelizer + 23;
                                MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                                    throw null;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                            }
                        }
                    }
                } else if (astree != null) {
                    list2 = list;
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        int i11 = MediaSessionCompatQueueItem + 79;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        if (!map.containsKey((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ((SentryCriticalIssueLogger) ((EnumColumnAdapter) this.write)).write("customer_unavailable_critical_component_validation_error", executeAsList.PUDO, c8$$ExternalSyntheticOutline0.m("No current Step on UTCC flow for: ", list), onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("root_error_class", "ShouldEnableComponentUseCase"), new onViewAttachedToWindowlambda0("required_steps", list.toString()), new onViewAttachedToWindowlambda0("all_current_steps", map.keySet().toString())));
                        return true;
                    }
                    if (list2 instanceof Collection) {
                        int i13 = IconCompatParcelizer + 55;
                        MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        if (!list2.isEmpty()) {
                            it = list2.iterator();
                            while (!(!it.hasNext())) {
                                i = IconCompatParcelizer + 23;
                                MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                                if (i % 2 != 0) {
                                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                                    throw null;
                                }
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                                    return false;
                                }
                            }
                        }
                    } else {
                        it = list2.iterator();
                        while (!(!it.hasNext())) {
                            i = IconCompatParcelizer + 23;
                            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                            if (i % 2 != 0) {
                                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                                throw null;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get((String) it.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }

        @Override // o.throwSemanticsGetNotSupported
        public Cipher read() throws InvalidKeyException {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 31;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object objWrite = ((Lazy) this.RemoteActionCompatParcelizer).write();
            objWrite.getClass();
            Cipher cipher = (Cipher) objWrite;
            cipher.init(1, (Key) ((Lazy) this.write).write());
            int i4 = MediaSessionCompatQueueItem + 37;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return cipher;
        }

        /*  JADX ERROR: Types fix failed
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r13v0 ??, r13v11 ??, r13v13 ??, r13v12 ??, r13v15 ??]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:580)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
            */
        public void serializer(int r26) {
            /*
                Method dump skipped, instruction units count: 1152
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.re2j.Parser.Pair.serializer(int):void");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r6.write() <= 55) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int IconCompatParcelizer(o.prune r6) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.re2j.Parser.IconCompatParcelizer(o.prune):int");
    }

    public final InputMethodSessioncreateInputConnection11 serializer(accessgetValueOverridejd accessgetvalueoverridejd) {
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write = write(accessgetvalueoverridejd);
        inputMethodSessioncreateInputConnection11Write.RemoteActionCompatParcelizer = this.read;
        return serializer(inputMethodSessioncreateInputConnection11Write);
    }

    public final InputMethodSessioncreateInputConnection11 write(accessgetValueOverridejd accessgetvalueoverridejd) {
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 = this.IconCompatParcelizer;
        if (inputMethodSessioncreateInputConnection11 == null || (inputMethodSessioncreateInputConnection11Arr = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem) == null || inputMethodSessioncreateInputConnection11Arr.length <= 0) {
            return new InputMethodSessioncreateInputConnection11(accessgetvalueoverridejd);
        }
        this.IconCompatParcelizer = inputMethodSessioncreateInputConnection11Arr[0];
        inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer = 0;
        inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem = InputMethodSessioncreateInputConnection11.write;
        inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem = null;
        inputMethodSessioncreateInputConnection11.IconCompatParcelizer = 0;
        inputMethodSessioncreateInputConnection11.serializer = 0;
        inputMethodSessioncreateInputConnection11.read = 0;
        inputMethodSessioncreateInputConnection11.RatingCompat = null;
        inputMethodSessioncreateInputConnection11.MediaMetadataCompat = accessgetvalueoverridejd;
        return inputMethodSessioncreateInputConnection11;
    }

    public final void write() {
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = read();
        if (inputMethodSessioncreateInputConnection11Arr.length > 0) {
            RemoteActionCompatParcelizer(inputMethodSessioncreateInputConnection11Arr[inputMethodSessioncreateInputConnection11Arr.length - 1]);
        }
        if (inputMethodSessioncreateInputConnection11Arr.length == 0) {
            serializer(write(accessgetValueOverridejd.NO_MATCH));
        } else {
            serializer(IconCompatParcelizer(inputMethodSessioncreateInputConnection11Arr, accessgetValueOverridejd.ALTERNATE));
        }
    }

    public final void write(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11) {
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
        if (inputMethodSessioncreateInputConnection11Arr != null && inputMethodSessioncreateInputConnection11Arr.length > 0) {
            inputMethodSessioncreateInputConnection11Arr[0] = this.IconCompatParcelizer;
        }
        this.IconCompatParcelizer = inputMethodSessioncreateInputConnection11;
    }

    public Parser(String str, int i) {
        this.MediaSessionCompatQueueItem = str;
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0188  */
    /* JADX WARN: Code duplicated, block: B:157:0x0248  */
    /* JADX WARN: Code duplicated, block: B:74:0x010e  */
    public final InputMethodSessioncreateInputConnection11 IconCompatParcelizer(InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr, accessgetValueOverridejd accessgetvalueoverridejd) {
        char c;
        int i;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11;
        int i2;
        int i3;
        int[] iArr;
        int length;
        int i4;
        int i5 = 0;
        int i6 = 1;
        if (inputMethodSessioncreateInputConnection11Arr.length == 1) {
            return inputMethodSessioncreateInputConnection11Arr[0];
        }
        int length2 = 0;
        for (InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection12 : inputMethodSessioncreateInputConnection11Arr) {
            length2 += inputMethodSessioncreateInputConnection12.MediaMetadataCompat == accessgetvalueoverridejd ? inputMethodSessioncreateInputConnection12.MediaBrowserCompatMediaItem.length : 1;
        }
        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11ArrWrite = new InputMethodSessioncreateInputConnection11[length2];
        int length3 = 0;
        for (InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection13 : inputMethodSessioncreateInputConnection11Arr) {
            if (inputMethodSessioncreateInputConnection13.MediaMetadataCompat == accessgetvalueoverridejd) {
                InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr2 = inputMethodSessioncreateInputConnection13.MediaBrowserCompatMediaItem;
                System.arraycopy(inputMethodSessioncreateInputConnection11Arr2, 0, inputMethodSessioncreateInputConnection11ArrWrite, length3, inputMethodSessioncreateInputConnection11Arr2.length);
                length3 += inputMethodSessioncreateInputConnection13.MediaBrowserCompatMediaItem.length;
                write(inputMethodSessioncreateInputConnection13);
            } else {
                inputMethodSessioncreateInputConnection11ArrWrite[length3] = inputMethodSessioncreateInputConnection13;
                length3++;
            }
        }
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write = write(accessgetvalueoverridejd);
        inputMethodSessioncreateInputConnection11Write.MediaBrowserCompatMediaItem = inputMethodSessioncreateInputConnection11ArrWrite;
        if (accessgetvalueoverridejd == accessgetValueOverridejd.ALTERNATE) {
            if (length2 < 2) {
                c = 0;
            } else {
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int[] iArr2 = null;
                while (i7 <= length2) {
                    if (i7 < length2) {
                        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection14 = inputMethodSessioncreateInputConnection11ArrWrite[i7];
                        if (inputMethodSessioncreateInputConnection14.MediaMetadataCompat == accessgetValueOverridejd.CONCAT) {
                            InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr3 = inputMethodSessioncreateInputConnection14.MediaBrowserCompatMediaItem;
                            if (inputMethodSessioncreateInputConnection11Arr3.length > 0) {
                                inputMethodSessioncreateInputConnection14 = inputMethodSessioncreateInputConnection11Arr3[i5];
                            }
                        }
                        if (inputMethodSessioncreateInputConnection14.MediaMetadataCompat == accessgetValueOverridejd.LITERAL) {
                            iArr = inputMethodSessioncreateInputConnection14.MediaSessionCompatQueueItem;
                            length = iArr.length;
                            i3 = inputMethodSessioncreateInputConnection14.RemoteActionCompatParcelizer & i6;
                        } else {
                            i3 = i5;
                            length = i3;
                            iArr = null;
                        }
                        if (i3 == i8) {
                            int i12 = i5;
                            while (i12 < i11 && i12 < length && iArr2[i12] == iArr[i12]) {
                                i12++;
                            }
                            if (i12 > 0) {
                                i11 = i12;
                            }
                        }
                        i7++;
                        i5 = 0;
                        i6 = 1;
                    } else {
                        i3 = 0;
                        iArr = null;
                        length = 0;
                    }
                    if (i7 != i10) {
                        if (i7 == i10 + 1) {
                            i4 = i9 + 1;
                            inputMethodSessioncreateInputConnection11ArrWrite[i9] = inputMethodSessioncreateInputConnection11ArrWrite[i10];
                        } else {
                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write2 = write(accessgetValueOverridejd.LITERAL);
                            inputMethodSessioncreateInputConnection11Write2.RemoteActionCompatParcelizer = i8;
                            int[] iArr3 = new int[i11];
                            for (int i13 = 0; i13 < i11; i13++) {
                                iArr3[i13] = iArr2[i13];
                            }
                            inputMethodSessioncreateInputConnection11Write2.MediaSessionCompatQueueItem = iArr3;
                            for (int i14 = i10; i14 < i7; i14++) {
                                inputMethodSessioncreateInputConnection11ArrWrite[i14] = write(inputMethodSessioncreateInputConnection11ArrWrite[i14], i11);
                            }
                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11IconCompatParcelizer = IconCompatParcelizer(write(inputMethodSessioncreateInputConnection11ArrWrite, i10, i7), accessgetValueOverridejd.ALTERNATE);
                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write3 = write(accessgetValueOverridejd.CONCAT);
                            inputMethodSessioncreateInputConnection11Write3.MediaBrowserCompatMediaItem = new InputMethodSessioncreateInputConnection11[]{inputMethodSessioncreateInputConnection11Write2, inputMethodSessioncreateInputConnection11IconCompatParcelizer};
                            i4 = i9 + 1;
                            inputMethodSessioncreateInputConnection11ArrWrite[i9] = inputMethodSessioncreateInputConnection11Write3;
                        }
                        i9 = i4;
                    }
                    i10 = i7;
                    i8 = i3;
                    iArr2 = iArr;
                    i11 = length;
                    i7++;
                    i5 = 0;
                    i6 = 1;
                }
                int i15 = 0;
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection15 = null;
                int i16 = 0;
                for (int i17 = 0; i17 <= i9; i17++) {
                    if (i17 < i9) {
                        inputMethodSessioncreateInputConnection11 = inputMethodSessioncreateInputConnection11ArrWrite[i17];
                        accessgetValueOverridejd accessgetvalueoverridejd2 = inputMethodSessioncreateInputConnection11.MediaMetadataCompat;
                        accessgetValueOverridejd accessgetvalueoverridejd3 = accessgetValueOverridejd.EMPTY_MATCH;
                        if (accessgetvalueoverridejd2 == accessgetvalueoverridejd3) {
                            inputMethodSessioncreateInputConnection11 = null;
                        } else if (accessgetvalueoverridejd2 == accessgetValueOverridejd.CONCAT) {
                            InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr4 = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                            if (inputMethodSessioncreateInputConnection11Arr4.length > 0) {
                                inputMethodSessioncreateInputConnection11 = inputMethodSessioncreateInputConnection11Arr4[0];
                                if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat == accessgetvalueoverridejd3) {
                                    inputMethodSessioncreateInputConnection11 = null;
                                }
                            }
                        }
                        if (inputMethodSessioncreateInputConnection15 == null || !inputMethodSessioncreateInputConnection15.equals(inputMethodSessioncreateInputConnection11) || (!read(inputMethodSessioncreateInputConnection15) && (inputMethodSessioncreateInputConnection15.MediaMetadataCompat != accessgetValueOverridejd.REPEAT || inputMethodSessioncreateInputConnection15.serializer != inputMethodSessioncreateInputConnection15.IconCompatParcelizer || !read(inputMethodSessioncreateInputConnection15.MediaBrowserCompatMediaItem[0])))) {
                        }
                    } else {
                        inputMethodSessioncreateInputConnection11 = null;
                    }
                    if (i17 != i16) {
                        if (i17 == i16 + 1) {
                            i2 = i15 + 1;
                            inputMethodSessioncreateInputConnection11ArrWrite[i15] = inputMethodSessioncreateInputConnection11ArrWrite[i16];
                        } else {
                            int i18 = i16;
                            while (i18 < i17) {
                                boolean z = i18 != i16;
                                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write4 = inputMethodSessioncreateInputConnection11ArrWrite[i18];
                                if (inputMethodSessioncreateInputConnection11Write4.MediaMetadataCompat == accessgetValueOverridejd.CONCAT) {
                                    InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr5 = inputMethodSessioncreateInputConnection11Write4.MediaBrowserCompatMediaItem;
                                    if (inputMethodSessioncreateInputConnection11Arr5.length > 0) {
                                        if (z) {
                                            write(inputMethodSessioncreateInputConnection11Arr5[0]);
                                        }
                                        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr6 = inputMethodSessioncreateInputConnection11Write4.MediaBrowserCompatMediaItem;
                                        InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11ArrWrite2 = write(inputMethodSessioncreateInputConnection11Arr6, 1, inputMethodSessioncreateInputConnection11Arr6.length);
                                        inputMethodSessioncreateInputConnection11Write4.MediaBrowserCompatMediaItem = inputMethodSessioncreateInputConnection11ArrWrite2;
                                        int length4 = inputMethodSessioncreateInputConnection11ArrWrite2.length;
                                        if (length4 == 0) {
                                            inputMethodSessioncreateInputConnection11Write4.MediaMetadataCompat = accessgetValueOverridejd.EMPTY_MATCH;
                                            inputMethodSessioncreateInputConnection11Write4.MediaBrowserCompatMediaItem = InputMethodSessioncreateInputConnection11.write;
                                        } else if (length4 == 1) {
                                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection16 = inputMethodSessioncreateInputConnection11ArrWrite2[0];
                                            write(inputMethodSessioncreateInputConnection11Write4);
                                            inputMethodSessioncreateInputConnection11Write4 = inputMethodSessioncreateInputConnection16;
                                        }
                                    } else {
                                        if (z) {
                                            write(inputMethodSessioncreateInputConnection11Write4);
                                        }
                                        inputMethodSessioncreateInputConnection11Write4 = write(accessgetValueOverridejd.EMPTY_MATCH);
                                    }
                                } else {
                                    if (z) {
                                        write(inputMethodSessioncreateInputConnection11Write4);
                                    }
                                    inputMethodSessioncreateInputConnection11Write4 = write(accessgetValueOverridejd.EMPTY_MATCH);
                                }
                                inputMethodSessioncreateInputConnection11ArrWrite[i18] = inputMethodSessioncreateInputConnection11Write4;
                                i18++;
                            }
                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11IconCompatParcelizer2 = IconCompatParcelizer(write(inputMethodSessioncreateInputConnection11ArrWrite, i16, i17), accessgetValueOverridejd.ALTERNATE);
                            InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write5 = write(accessgetValueOverridejd.CONCAT);
                            inputMethodSessioncreateInputConnection11Write5.MediaBrowserCompatMediaItem = new InputMethodSessioncreateInputConnection11[]{inputMethodSessioncreateInputConnection15, inputMethodSessioncreateInputConnection11IconCompatParcelizer2};
                            i2 = i15 + 1;
                            inputMethodSessioncreateInputConnection11ArrWrite[i15] = inputMethodSessioncreateInputConnection11Write5;
                        }
                        i15 = i2;
                    }
                    i16 = i17;
                    inputMethodSessioncreateInputConnection15 = inputMethodSessioncreateInputConnection11;
                }
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 <= i15; i21++) {
                    if (i21 >= i15 || !read(inputMethodSessioncreateInputConnection11ArrWrite[i21])) {
                        if (i21 != i20) {
                            int i22 = i20 + 1;
                            if (i21 == i22) {
                                i = i19 + 1;
                                inputMethodSessioncreateInputConnection11ArrWrite[i19] = inputMethodSessioncreateInputConnection11ArrWrite[i20];
                            } else {
                                int i23 = i20;
                                for (int i24 = i22; i24 < i21; i24++) {
                                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection17 = inputMethodSessioncreateInputConnection11ArrWrite[i23];
                                    InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection18 = inputMethodSessioncreateInputConnection11ArrWrite[i24];
                                    if (inputMethodSessioncreateInputConnection17.MediaMetadataCompat.ordinal() < inputMethodSessioncreateInputConnection18.MediaMetadataCompat.ordinal() || (inputMethodSessioncreateInputConnection17.MediaMetadataCompat == inputMethodSessioncreateInputConnection18.MediaMetadataCompat && inputMethodSessioncreateInputConnection17.MediaSessionCompatQueueItem.length < inputMethodSessioncreateInputConnection18.MediaSessionCompatQueueItem.length)) {
                                        i23 = i24;
                                    }
                                }
                                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection19 = inputMethodSessioncreateInputConnection11ArrWrite[i20];
                                inputMethodSessioncreateInputConnection11ArrWrite[i20] = inputMethodSessioncreateInputConnection11ArrWrite[i23];
                                inputMethodSessioncreateInputConnection11ArrWrite[i23] = inputMethodSessioncreateInputConnection19;
                                while (i22 < i21) {
                                    RemoteActionCompatParcelizer(inputMethodSessioncreateInputConnection11ArrWrite[i20], inputMethodSessioncreateInputConnection11ArrWrite[i22]);
                                    write(inputMethodSessioncreateInputConnection11ArrWrite[i22]);
                                    i22++;
                                }
                                RemoteActionCompatParcelizer(inputMethodSessioncreateInputConnection11ArrWrite[i20]);
                                i = i19 + 1;
                                inputMethodSessioncreateInputConnection11ArrWrite[i19] = inputMethodSessioncreateInputConnection11ArrWrite[i20];
                            }
                            i19 = i;
                        }
                        if (i21 < i15) {
                            inputMethodSessioncreateInputConnection11ArrWrite[i19] = inputMethodSessioncreateInputConnection11ArrWrite[i21];
                            i19++;
                        }
                        i20 = i21 + 1;
                    }
                }
                int i25 = 0;
                int i26 = 0;
                while (i26 < i19) {
                    int i27 = i26 + 1;
                    if (i27 < i19) {
                        accessgetValueOverridejd accessgetvalueoverridejd4 = inputMethodSessioncreateInputConnection11ArrWrite[i26].MediaMetadataCompat;
                        accessgetValueOverridejd accessgetvalueoverridejd5 = accessgetValueOverridejd.EMPTY_MATCH;
                        if (accessgetvalueoverridejd4 != accessgetvalueoverridejd5 || inputMethodSessioncreateInputConnection11ArrWrite[i27].MediaMetadataCompat != accessgetvalueoverridejd5) {
                            inputMethodSessioncreateInputConnection11ArrWrite[i25] = inputMethodSessioncreateInputConnection11ArrWrite[i26];
                            i25++;
                        }
                    } else {
                        inputMethodSessioncreateInputConnection11ArrWrite[i25] = inputMethodSessioncreateInputConnection11ArrWrite[i26];
                        i25++;
                    }
                    i26 = i27;
                }
                c = 0;
                inputMethodSessioncreateInputConnection11ArrWrite = write(inputMethodSessioncreateInputConnection11ArrWrite, 0, i25);
            }
            inputMethodSessioncreateInputConnection11Write.MediaBrowserCompatMediaItem = inputMethodSessioncreateInputConnection11ArrWrite;
            if (inputMethodSessioncreateInputConnection11ArrWrite.length == 1) {
                InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection110 = inputMethodSessioncreateInputConnection11ArrWrite[c];
                write(inputMethodSessioncreateInputConnection11Write);
                return inputMethodSessioncreateInputConnection110;
            }
        }
        return inputMethodSessioncreateInputConnection11Write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RemoteActionCompatParcelizer(accessgetValueOverridejd accessgetvalueoverridejd, int i, int i2, int i3, prune pruneVar, int i4) {
        int i5 = this.read;
        if ((i5 & 64) != 0) {
            if (pruneVar.RemoteActionCompatParcelizer() && pruneVar.write('?')) {
                pruneVar.write(1);
                i5 ^= 32;
            }
            if (i4 != -1) {
                throw new PatternSyntaxException("invalid nested repetition operator", pruneVar.IconCompatParcelizer(i4));
            }
        }
        accessgetOnAllConnectionsClosedp accessgetonallconnectionsclosedp = this.RatingCompat;
        int size = accessgetonallconnectionsclosedp.size();
        if (size == 0) {
            throw new PatternSyntaxException("missing argument to repetition operator", pruneVar.IconCompatParcelizer(i3));
        }
        int i6 = size - 1;
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11 = (InputMethodSessioncreateInputConnection11) accessgetonallconnectionsclosedp.get(i6);
        if (inputMethodSessioncreateInputConnection11.MediaMetadataCompat.isPseudo()) {
            throw new PatternSyntaxException("missing argument to repetition operator", pruneVar.IconCompatParcelizer(i3));
        }
        InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11Write = write(accessgetvalueoverridejd);
        inputMethodSessioncreateInputConnection11Write.serializer = i;
        inputMethodSessioncreateInputConnection11Write.IconCompatParcelizer = i2;
        inputMethodSessioncreateInputConnection11Write.RemoteActionCompatParcelizer = i5;
        inputMethodSessioncreateInputConnection11Write.MediaBrowserCompatMediaItem = new InputMethodSessioncreateInputConnection11[]{inputMethodSessioncreateInputConnection11};
        accessgetonallconnectionsclosedp.set(i6, inputMethodSessioncreateInputConnection11Write);
    }

    public static int serializer(prune pruneVar, int i) {
        if (pruneVar.RemoteActionCompatParcelizer()) {
            return pruneVar.write('\\') ? IconCompatParcelizer(pruneVar) : pruneVar.serializer();
        }
        throw new PatternSyntaxException("missing closing ]", pruneVar.IconCompatParcelizer(i));
    }
}
