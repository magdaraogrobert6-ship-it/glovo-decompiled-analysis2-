package okio;

import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextStyle;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.grpc.LoadBalancer$Helper;
import io.grpc.internal.DelayedClientCall$2;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import kotlin.TuplesKt;
import kotlin.collections.AbstractList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.SerializationException;
import o.AndroidContentCaptureManagerCompanion;
import o.BrazeContentCardsManagerCompanion;
import o.CanvasKt;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DrawableTransformation;
import o.FocusTargetNodeFocusTargetElement;
import o.GraphicsLayerScope;
import o.OutlineRounded;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o.ShortNewsContentCardView;
import o.UiMediaScopeKeyboardKindCompanion;
import o.accessgetRenderEffectjd;
import o.createInAppMessageViewlambda1;
import o.displayInAppMessagelambda1;
import o.drawOutlinehn5TExg;
import o.f6;
import o.getBeyondBoundsLayoutParent;
import o.getBirthDateFull;
import o.getCacheImplementationfwf_client_release;
import o.getClosingAnimation;
import o.getConfigfwf_client_release;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumber;
import o.getPostalCode;
import o.getRoundRectPathui_graphics;
import o.getUnregisteredInAppMessageannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.hideTranslatedText;
import o.onCloseActionlambda0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaY3Sk3_bCKw7cHfi7g4HzfmtF88Q;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.resetMessageMarginslambda00;
import o.restoreFocusedChild;
import o.setCompositingStrategyaDBOjCE;
import o.setGraphicModalMaxWidthDp;
import o.setRotationZ;
import o.setTranslationX;
import o.sourceInformationContextOfdefault;
import o.withSave;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class Options extends AbstractList implements RandomAccess {
    public final int[] RemoteActionCompatParcelizer;
    public final RequestBuilder[] read;

    public abstract class Companion implements DefaultInAppMessageModalViewFactoryCompanion, createInAppMessageViewlambda1 {
        public static getCacheImplementationfwf_client_release ParcelableVolumeInfo = null;
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public static /* synthetic */ Object read(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i;
            int i9 = ~(i7 | i8);
            int i10 = ~((~i2) | i6);
            int i11 = i9 | i10 | (~(i6 | i));
            int i12 = (~(i | i2)) | (~(i7 | i2));
            int i13 = i8 | i10;
            int i14 = i2 + i6 + i3 + (793188503 * i5) + (2090109681 * i4);
            int i15 = i14 * i14;
            int i16 = (837707615 * i2) + 1286602752 + ((-1676358574) * i6) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i3) + (1186463744 * i5) + (1166540800 * i4) + ((-1956446208) * i15);
            int i17 = ((i2 * 1389925299) - 652765764) + (i6 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i3 * 1389926445) + (i5 * (-1551828341)) + (i4 * (-2047638435)) + (i15 * 1214709760);
            int i18 = i16 + (i17 * i17 * 445972480);
            if (i18 == 1) {
                return read(objArr);
            }
            if (i18 == 2) {
                return IconCompatParcelizer(objArr);
            }
            if (i18 != 3) {
                return i18 != 4 ? write(objArr) : RemoteActionCompatParcelizer(objArr);
            }
            return serializer(objArr);
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public abstract short ComponentActivity();

        public abstract f6 L_();

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public abstract int MediaSessionCompatToken();

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public abstract byte PlaybackStateCompatCustomAction();

        public abstract boolean RemoteActionCompatParcelizer();

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
            int i = 2 % 2;
            int i2 = serializer + 79;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 55;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return z;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public abstract long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 79;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                int i3 = 1 / 0;
            } else {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            }
            return this;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 119;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            int i4 = RemoteActionCompatParcelizer + 13;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 97;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                obj.hashCode();
                throw null;
            }
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            int i3 = RemoteActionCompatParcelizer + 7;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public boolean MediaDescriptionCompat() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 69;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                throw null;
            }
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            int i3 = 26 / 0;
            throw null;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public char MediaSessionCompatResultReceiverWrapper() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 27;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            throw null;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public double ParcelableVolumeInfo() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 43;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                throw null;
            }
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            int i3 = 30 / 0;
            throw null;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public float PlaybackStateCompat() {
            int i = 2 % 2;
            int i2 = serializer + 23;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            throw null;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public String ResultReceiver() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 113;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            throw null;
        }

        public static final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk read(Class cls) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 35;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            cls.getClass();
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(cls);
            int i4 = serializer + 61;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer;
            }
            throw null;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                throw null;
            }
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            int i3 = 70 / 0;
            throw null;
        }

        @Override // o.createInAppMessageViewlambda1
        public int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 27;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            int iMediaSessionCompatToken = MediaSessionCompatToken();
            int i5 = RemoteActionCompatParcelizer + 1;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
            return iMediaSessionCompatToken;
        }

        @Override // o.createInAppMessageViewlambda1
        public String MediaMetadataCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 93;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                ResultReceiver();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            String strResultReceiver = ResultReceiver();
            int i4 = RemoteActionCompatParcelizer + 79;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return strResultReceiver;
        }

        @Override // o.createInAppMessageViewlambda1
        public double RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 51;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            double dParcelableVolumeInfo = ParcelableVolumeInfo();
            int i5 = serializer + 69;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return dParcelableVolumeInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.createInAppMessageViewlambda1
        public float read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 53;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                PlaybackStateCompat();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            float fPlaybackStateCompat = PlaybackStateCompat();
            int i4 = serializer + 113;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fPlaybackStateCompat;
        }

        @Override // o.createInAppMessageViewlambda1
        public short read(onCloseActionlambda0 oncloseactionlambda0, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 113;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            oncloseactionlambda0.getClass();
            short sComponentActivity = ComponentActivity();
            int i5 = serializer + 65;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return sComponentActivity;
        }

        @Override // o.createInAppMessageViewlambda1
        public char serializer(onCloseActionlambda0 oncloseactionlambda0, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 9;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            oncloseactionlambda0.getClass();
            char cMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
            int i5 = serializer + 105;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return cMediaSessionCompatResultReceiverWrapper;
        }

        @Override // o.createInAppMessageViewlambda1
        public long serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 119;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            long jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            int i5 = serializer + 123;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return jR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }

        @Override // o.createInAppMessageViewlambda1
        public byte write(onCloseActionlambda0 oncloseactionlambda0, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 7;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            oncloseactionlambda0.getClass();
            byte bPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
            int i5 = serializer + 39;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return bPlaybackStateCompatCustomAction;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.DefaultInAppMessageModalViewFactoryCompanion
        public Object write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 69;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                setgraphicmodalmaxwidthdp.getClass();
                return setgraphicmodalmaxwidthdp.deserialize(this);
            }
            setgraphicmodalmaxwidthdp.getClass();
            setgraphicmodalmaxwidthdp.deserialize(this);
            throw null;
        }

        @Override // o.createInAppMessageViewlambda1
        public boolean write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 51;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
                MediaDescriptionCompat();
                throw null;
            }
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            boolean zMediaDescriptionCompat = MediaDescriptionCompat();
            int i4 = RemoteActionCompatParcelizer + 117;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return zMediaDescriptionCompat;
        }

        public static String RemoteActionCompatParcelizer(String str, String str2) {
            int i = 2 % 2;
            int i2 = serializer + 47;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                String strM = af$$ExternalSyntheticOutline0.m("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
                int i3 = RemoteActionCompatParcelizer + 45;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return strM;
                }
                obj.hashCode();
                throw null;
            }
            af$$ExternalSyntheticOutline0.m("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
            throw null;
        }

        public Object IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 79;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            setgraphicmodalmaxwidthdp.getClass();
            Object objWrite = write(setgraphicmodalmaxwidthdp);
            int i5 = serializer + 55;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objWrite;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 73;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!(!Log.isLoggable("GoogleTagManager", iIntValue))) {
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 45;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return false;
        }

        public static boolean RemoteActionCompatParcelizer(char c) {
            int i = 2 % 2;
            if (c >= 'a') {
                int i2 = RemoteActionCompatParcelizer + 65;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    if (c <= 'G') {
                        return true;
                    }
                } else if (c <= 'z') {
                    return true;
                }
            }
            int i3 = RemoteActionCompatParcelizer + 47;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }

        @Override // o.createInAppMessageViewlambda1
        public DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 103;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            oncloseactionlambda0.getClass();
            DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(oncloseactionlambda0.RemoteActionCompatParcelizer(i));
            int i5 = serializer + 117;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return defaultInAppMessageModalViewFactoryCompanionRemoteActionCompatParcelizer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final Class read(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 97;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                getunregisteredinappmessageannotations.getClass();
                ((r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY) getunregisteredinappmessageannotations).read().getClass();
                throw null;
            }
            getunregisteredinappmessageannotations.getClass();
            Class cls = ((r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY) getunregisteredinappmessageannotations).read();
            cls.getClass();
            return cls;
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            Object objIconCompatParcelizer = objArr[0];
            int i = 2 % 2;
            int i2 = serializer + 113;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                boolean z = objIconCompatParcelizer instanceof getClosingAnimation;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (objIconCompatParcelizer instanceof getClosingAnimation) {
                objIconCompatParcelizer = ExtrasKt.IconCompatParcelizer(((getClosingAnimation) objIconCompatParcelizer).IconCompatParcelizer);
                int i3 = RemoteActionCompatParcelizer + 49;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 3;
                }
            }
            return objIconCompatParcelizer;
        }

        private static /* synthetic */ Object serializer(Object[] objArr) {
            int i = 2 % 2;
            int i2 = serializer + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getCacheImplementationfwf_client_release getcacheimplementationfwf_client_release = ParcelableVolumeInfo;
            if (getcacheimplementationfwf_client_release != null) {
                return getcacheimplementationfwf_client_release.read;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Koin is not initialized. Make sure to initialize first with a call to `init(application)`");
            int i4 = RemoteActionCompatParcelizer + 69;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return null;
        }

        public static final FocusTargetNodeFocusTargetElement write(View view) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 77;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                FocusTargetNodeFocusTargetElement focusTargetNodeFocusTargetElement = (FocusTargetNodeFocusTargetElement) view.getTag(R.id.pooling_container_listener_holder_tag);
                if (focusTargetNodeFocusTargetElement != null) {
                    return focusTargetNodeFocusTargetElement;
                }
                FocusTargetNodeFocusTargetElement focusTargetNodeFocusTargetElement2 = new FocusTargetNodeFocusTargetElement();
                view.setTag(R.id.pooling_container_listener_holder_tag, focusTargetNodeFocusTargetElement2);
                int i3 = serializer + 63;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return focusTargetNodeFocusTargetElement2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            Class cls = (Class) objArr[0];
            InvocationHandler invocationHandler = (InvocationHandler) objArr[1];
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 61;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (invocationHandler == null) {
                return null;
            }
            Object objCast = cls.cast(Proxy.newProxyInstance(Companion.class.getClassLoader(), new Class[]{cls}, invocationHandler));
            int i3 = serializer + 115;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objCast;
        }

        public static final GraphicsLayerScope IconCompatParcelizer(int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 61;
            int i4 = i3 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (i == 0) {
                return GraphicsLayerScope.EXPONENTIAL;
            }
            int i5 = i4 + 123;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to BackoffPolicy"));
                return null;
            }
            int i7 = i4 + 75;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            GraphicsLayerScope graphicsLayerScope = GraphicsLayerScope.LINEAR;
            int i9 = serializer + 55;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return graphicsLayerScope;
        }

        public static final setRotationZ serializer(int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer;
            int i4 = i3 + 97;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i == 0) {
                return setRotationZ.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            }
            int i6 = i3 + 5;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i == 1) {
                return setRotationZ.DROP_WORK_REQUEST;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to OutOfQuotaPolicy"));
            return null;
        }

        public static final int read(setTranslationX settranslationx) {
            int i = 2 % 2;
            settranslationx.getClass();
            switch (getRoundRectPathui_graphics.IconCompatParcelizer[settranslationx.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    int i2 = RemoteActionCompatParcelizer + 113;
                    serializer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return 4;
                case 6:
                    int i4 = serializer + 93;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return 5;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return 0;
            }
        }

        @Override // o.createInAppMessageViewlambda1
        public Object serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
            int i2 = 2 % 2;
            int i3 = serializer + 91;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            setgraphicmodalmaxwidthdp.getClass();
            if (!setgraphicmodalmaxwidthdp.getDescriptor().MediaBrowserCompatMediaItem()) {
                int i5 = serializer + 13;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    throw null;
                }
                if (!r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                    int i6 = RemoteActionCompatParcelizer + 51;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return null;
                }
            }
            return write(setgraphicmodalmaxwidthdp);
        }

        public void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
            int i = 2 % 2;
            throw new SerializationException(displayInAppMessagelambda1.serializer(getClass()) + " can't retrieve untyped values");
        }

        public static boolean canSkip(Object obj, Object obj2, Object[] objArr) {
            int i = 2 % 2;
            int i2 = serializer + 13;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            obj.getClass();
            obj2.getClass();
            objArr.getClass();
            if (obj.equals(obj2)) {
                int length = objArr.length;
                int i4 = 0;
                while (i4 < length) {
                    if (obj2.equals(objArr[i4])) {
                        i4++;
                        int i5 = RemoteActionCompatParcelizer + 23;
                        serializer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    }
                }
                return true;
            }
            return false;
        }

        public static final Object RemoteActionCompatParcelizer(RoomDatabase roomDatabase, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            int i = 2 % 2;
            if (roomDatabase.inCompatibilityMode()) {
                int i2 = serializer + 105;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    roomDatabase.isOpenInternal$room_runtime();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) {
                    return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(shortNewsContentCardView);
                }
            }
            if (shortNewsContentCardView.getContext().get(CanvasKt.serializer) != null) {
                return withTransactionContext(roomDatabase, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
            int i3 = RemoteActionCompatParcelizer + 113;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(shortNewsContentCardView);
        }

        public static String RemoteActionCompatParcelizer(String str) {
            int i = 2 % 2;
            int i2 = serializer + 103;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int length = str.length();
            int i4 = RemoteActionCompatParcelizer + 85;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 5 % 3;
            }
            int i6 = 0;
            while (i6 < length) {
                if (RemoteActionCompatParcelizer(str.charAt(i6))) {
                    char[] charArray = str.toCharArray();
                    while (i6 < length) {
                        int i7 = RemoteActionCompatParcelizer + 81;
                        serializer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            RemoteActionCompatParcelizer(charArray[i6]);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        char c = charArray[i6];
                        if (RemoteActionCompatParcelizer(c)) {
                            charArray[i6] = (char) (c ^ ' ');
                            int i8 = RemoteActionCompatParcelizer + 59;
                            serializer = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        }
                        i6++;
                    }
                    return String.valueOf(charArray);
                }
                i6++;
            }
            return str;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r3
  0x002f: PHI (r3v4 char) = (r3v3 char), (r3v11 char) binds: [B:10:0x002d, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:15:0x0042  */
        /* JADX WARN: Code duplicated, block: B:25:0x0033 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:28:0x005e A[SYNTHETIC] */
        public static String read(String str) {
            char cCharAt;
            char[] charArray;
            char c;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 79;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int length = str.length();
            int i4 = 0;
            while (i4 < length) {
                int i5 = RemoteActionCompatParcelizer + 103;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    cCharAt = str.charAt(i4);
                    if (cCharAt < '-') {
                        continue;
                    } else if (cCharAt <= 'Z') {
                        int i6 = serializer + 81;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        charArray = str.toCharArray();
                        while (i4 < length) {
                            c = charArray[i4];
                            if (c < 'A' && c <= 'Z') {
                                int i8 = RemoteActionCompatParcelizer + 33;
                                serializer = i8 % Fields.SpotShadowColor;
                                int i9 = i8 % 2;
                                charArray[i4] = (char) (c ^ ' ');
                            }
                            i4++;
                        }
                        return String.valueOf(charArray);
                    }
                } else {
                    cCharAt = str.charAt(i4);
                    if (cCharAt < 'A') {
                        continue;
                    } else if (cCharAt <= 'Z') {
                        int i10 = serializer + 81;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        charArray = str.toCharArray();
                        while (i4 < length) {
                            c = charArray[i4];
                            if (c < 'A') {
                            }
                            i4++;
                        }
                        return String.valueOf(charArray);
                    }
                }
                i4++;
            }
            return str;
        }

        public static final setTranslationX write(int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 27;
            int i4 = i3 % Fields.SpotShadowColor;
            serializer = i4;
            int i5 = i3 % 2;
            if (i == 0) {
                return setTranslationX.ENQUEUED;
            }
            if (i == 1) {
                return setTranslationX.RUNNING;
            }
            int i6 = i4 + 111;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i == 2 : i == 3) {
                return setTranslationX.SUCCEEDED;
            }
            if (i == 3) {
                return setTranslationX.FAILED;
            }
            Object obj = null;
            if (i == 4) {
                setTranslationX settranslationx = setTranslationX.BLOCKED;
                int i7 = serializer + 71;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return settranslationx;
                }
                obj.hashCode();
                throw null;
            }
            if (i == 5) {
                int i8 = i4 + 83;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return setTranslationX.CANCELLED;
                }
                setTranslationX settranslationx2 = setTranslationX.CANCELLED;
                throw null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to State"));
            return null;
        }

        public static ConcurrentHashMap RemoteActionCompatParcelizer(Map map) {
            int i = 2 % 2;
            if (map == null) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            int i2 = serializer + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    int i4 = RemoteActionCompatParcelizer + 103;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        if (entry.getValue() != null) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else {
                        int i5 = 54 / 0;
                        if (entry.getValue() != null) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
            int i6 = RemoteActionCompatParcelizer + 23;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return concurrentHashMap;
        }

        public static final setCompositingStrategyaDBOjCE RemoteActionCompatParcelizer(int i) {
            int i2 = 2 % 2;
            if (i == 0) {
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
                int i3 = RemoteActionCompatParcelizer + 83;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return setcompositingstrategyadbojce;
            }
            int i5 = RemoteActionCompatParcelizer + 103;
            int i6 = i5 % Fields.SpotShadowColor;
            serializer = i6;
            int i7 = i5 % 2;
            if (i == 1) {
                return setCompositingStrategyaDBOjCE.CONNECTED;
            }
            int i8 = i6 + 55;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i == 2) {
                return setCompositingStrategyaDBOjCE.UNMETERED;
            }
            if (i == 3) {
                return setCompositingStrategyaDBOjCE.NOT_ROAMING;
            }
            if (i != 4) {
                if (Build.VERSION.SDK_INT >= 30) {
                    int i10 = RemoteActionCompatParcelizer;
                    int i11 = i10 + 51;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (i == 5) {
                        int i13 = i10 + 79;
                        serializer = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        return setCompositingStrategyaDBOjCE.TEMPORARILY_UNMETERED;
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to NetworkType"));
                return null;
            }
            return setCompositingStrategyaDBOjCE.METERED;
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            View view = (View) objArr[0];
            int i = 2 % 2;
            view.getClass();
            Iterator it = restoreFocusedChild.RemoteActionCompatParcelizer(view).iterator();
            while (true) {
                SequenceBuilderIterator sequenceBuilderIterator = (SequenceBuilderIterator) it;
                if (!sequenceBuilderIterator.hasNext()) {
                    break;
                }
                ArrayList arrayList = write((View) sequenceBuilderIterator.next()).read;
                for (int iWrite = SQLite.write((List) arrayList); -1 < iWrite; iWrite--) {
                    int i2 = serializer + 85;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    ((ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0) ((getBeyondBoundsLayoutParent) arrayList.get(iWrite))).f$0.disposeComposition();
                }
            }
            int i4 = RemoteActionCompatParcelizer + 51;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }

        public static final Object withTransactionContext(RoomDatabase roomDatabase, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            int i = 2 % 2;
            RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, (ShortNewsContentCardView) null);
            withSave withsave = (withSave) shortNewsContentCardView.getContext().get(withSave.write);
            CoroutineDispatcher coroutineDispatcher = withsave != null ? withsave.IconCompatParcelizer : null;
            if (coroutineDispatcher == null) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
                cancellableContinuationImpl.read();
                try {
                    roomDatabase.getTransactionExecutor().execute(new DelayedClientCall$2(cancellableContinuationImpl, roomDatabase, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1));
                    int i2 = serializer + 117;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i3 = 5 / 4;
                    }
                } catch (RejectedExecutionException e) {
                    cancellableContinuationImpl.serializer((Throwable) new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
                }
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return result;
            }
            int i4 = serializer + 81;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return BuildersKt.withContext(coroutineDispatcher, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, shortNewsContentCardView);
        }

        public static final LinkedHashSet IconCompatParcelizer(byte[] bArr) throws IOException {
            int i = 2 % 2;
            bArr.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (bArr.length == 0) {
                return linkedHashSet;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i2 = objectInputStream.readInt();
                        int i3 = 0;
                        while (i3 < i2) {
                            Uri uri = Uri.parse(objectInputStream.readUTF());
                            boolean z = objectInputStream.readBoolean();
                            uri.getClass();
                            linkedHashSet.add(new accessgetRenderEffectjd(z, uri));
                            i3++;
                            int i4 = serializer + 43;
                            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                            int i5 = i4 % 2;
                        }
                        objectInputStream.close();
                        byteArrayInputStream.close();
                        int i6 = RemoteActionCompatParcelizer + 1;
                        serializer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            return linkedHashSet;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            int i7 = sourceInformationContextOfdefault.read();
                            int i8 = sourceInformationContextOfdefault.read();
                            int i9 = sourceInformationContextOfdefault.read();
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i7, i8, -871780639, sourceInformationContextOfdefault.read(), new Object[]{objectInputStream, th}, i9);
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    int i10 = sourceInformationContextOfdefault.read();
                    int i11 = sourceInformationContextOfdefault.read();
                    int i12 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i10, i11, -871780639, sourceInformationContextOfdefault.read(), new Object[]{byteArrayInputStream, th3}, i12);
                    throw th4;
                }
            }
        }

        public static final drawOutlinehn5TExg RemoteActionCompatParcelizer(byte[] bArr) throws IOException {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 9;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            bArr.getClass();
            if (bArr.length == 0) {
                Object obj = null;
                drawOutlinehn5TExg drawoutlinehn5texg = new drawOutlinehn5TExg(null);
                int i4 = RemoteActionCompatParcelizer + 101;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return drawoutlinehn5texg;
                }
                obj.hashCode();
                throw null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i5 = objectInputStream.readInt();
                    int[] iArr = new int[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        iArr[i6] = objectInputStream.readInt();
                    }
                    int i7 = objectInputStream.readInt();
                    int[] iArr2 = new int[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        int i9 = RemoteActionCompatParcelizer + 63;
                        serializer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        iArr2[i8] = objectInputStream.readInt();
                    }
                    drawOutlinehn5TExg drawoutlinehn5texgRemoteActionCompatParcelizer = OutlineRounded.RemoteActionCompatParcelizer(iArr2, iArr);
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return drawoutlinehn5texgRemoteActionCompatParcelizer;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{objectInputStream, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{byteArrayInputStream, th3}, sourceInformationContextOfdefault.read());
                    throw th4;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:30:0x006a  */
        public static final void IconCompatParcelizer(final long j, final TextStyle textStyle, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i) {
            int i2;
            boolean z;
            int i3;
            int i4 = 2 % 2;
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-684938728);
            if ((i & 6) == 0) {
                i2 = (!getpostalcode.serializer(j) ? 2 : 4) | i;
                int i5 = RemoteActionCompatParcelizer + 1;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                if (getpostalcode.read(textStyle)) {
                    int i7 = RemoteActionCompatParcelizer + 1;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i3 = 32;
                } else {
                    i3 = 16;
                }
                i2 |= i3;
            }
            if ((i & 384) == 0) {
                int i9 = serializer + 71;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i2 & 147) != 146) {
                int i11 = RemoteActionCompatParcelizer + 13;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (getpostalcode.write(i2 & 1, z)) {
                getPhoneNumber getphonenumber = TextKt.IconCompatParcelizer;
                AndroidContentCaptureManagerCompanion.IconCompatParcelizer(new hideTranslatedText[]{UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(j)), getphonenumber.write(((TextStyle) getpostalcode.write((getNewPassword) getphonenumber)).merge(textStyle))}, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, ((i2 >> 3) & 112) | 8);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setContentDescription
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        Options.Companion.IconCompatParcelizer(j, textStyle, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }

        public static final Class IconCompatParcelizer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
            int i = 2 % 2;
            int i2 = serializer + 63;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                getunregisteredinappmessageannotations.getClass();
                ((r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY) getunregisteredinappmessageannotations).read().isPrimitive();
                obj.hashCode();
                throw null;
            }
            getunregisteredinappmessageannotations.getClass();
            Class cls = ((r8lambdapgshWUFJiL1iPT8NmOl0aIo92oY) getunregisteredinappmessageannotations).read();
            if (!cls.isPrimitive()) {
                return cls;
            }
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? cls : Double.class;
                case 104431:
                    return !name.equals("int") ? cls : Integer.class;
                case 3039496:
                    if (!name.equals("byte")) {
                        int i3 = RemoteActionCompatParcelizer + 47;
                        serializer = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        return cls;
                    }
                    int i5 = serializer + 23;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return Byte.class;
                    }
                    obj.hashCode();
                    throw null;
                case 3052374:
                    return !name.equals("char") ? cls : Character.class;
                case 3327612:
                    return !name.equals(Constants.LONG) ? cls : Long.class;
                case 3625364:
                    return !name.equals("void") ? cls : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? cls : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? cls : Float.class;
                case 109413500:
                    return !name.equals("short") ? cls : Short.class;
                default:
                    return cls;
            }
        }

        public static Options serializer(RequestBuilder... requestBuilderArr) {
            int i = 2 % 2;
            if (requestBuilderArr.length == 0) {
                return new Options(new RequestBuilder[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new r8lambdaY3Sk3_bCKw7cHfi7g4HzfmtF88Q(requestBuilderArr, false));
            BrazeContentCardsManagerCompanion.RatingCompat(arrayList);
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(-1);
            }
            int length = requestBuilderArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = RemoteActionCompatParcelizer + 51;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    arrayList2.set(SQLite.serializer(arrayList, requestBuilderArr[i3]), Integer.valueOf(i4));
                    i3 += 6;
                    i4 += 25;
                } else {
                    arrayList2.set(SQLite.serializer(arrayList, requestBuilderArr[i3]), Integer.valueOf(i4));
                    i3++;
                    i4++;
                }
            }
            if (((RequestBuilder) arrayList.get(0)).serializer() <= 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("the empty byte string is not a supported option");
                return null;
            }
            int i6 = 0;
            while (i6 < arrayList.size()) {
                int i7 = RemoteActionCompatParcelizer + 29;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                RequestBuilder requestBuilder = (RequestBuilder) arrayList.get(i6);
                int i9 = i6 + 1;
                int i10 = i9;
                while (i10 < arrayList.size()) {
                    RequestBuilder requestBuilder2 = (RequestBuilder) arrayList.get(i10);
                    requestBuilder2.getClass();
                    requestBuilder.getClass();
                    if (!requestBuilder2.write(0, requestBuilder, requestBuilder.serializer())) {
                        break;
                    }
                    if (requestBuilder2.serializer() == requestBuilder.serializer()) {
                        DrawableTransformation.serializer(requestBuilder2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList2.get(i10)).intValue() > ((Number) arrayList2.get(i6)).intValue()) {
                        arrayList.remove(i10);
                        ((Number) arrayList2.remove(i10)).intValue();
                    } else {
                        i10++;
                    }
                }
                i6 = i9;
            }
            RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
            IconCompatParcelizer(0L, registryMissingComponentException, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i11 = (int) (registryMissingComponentException.size / 4);
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = registryMissingComponentException.MediaSessionCompatResultReceiverWrapper();
            }
            Options options = new Options((RequestBuilder[]) Arrays.copyOf(requestBuilderArr, requestBuilderArr.length), iArr);
            int i13 = RemoteActionCompatParcelizer + 13;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return options;
        }

        public static resetMessageMarginslambda00 serializer(Map map) {
            String[] strArr;
            Iterator it;
            int i;
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 47;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                map.getClass();
                strArr = new String[map.size() / 2];
                it = map.entrySet().iterator();
                i = 1;
            } else {
                map.getClass();
                strArr = new String[map.size() * 2];
                it = map.entrySet().iterator();
                i = 0;
            }
            while (!(!it.hasNext())) {
                int i4 = RemoteActionCompatParcelizer + 21;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
                String string2 = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString();
                DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(string);
                DelayKt.serializer(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new resetMessageMarginslambda00(strArr);
        }

        public static resetMessageMarginslambda00 serializer(String... strArr) {
            int i = 2 % 2;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            int i2 = 0;
            if (strArr2.length % 2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expected alternating header names and values");
                int i3 = serializer + 67;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 57 / 0;
                }
                return null;
            }
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                if (strArr3[i5] == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Headers cannot be null");
                    return null;
                }
                int i6 = serializer + 31;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                strArr3[i5] = hideCurrentlyDisplayingInAppMessage.read((CharSequence) strArr2[i5]).toString();
            }
            int i8 = TuplesKt.read(0, strArr3.length - 1, 2);
            if (i8 >= 0) {
                int i9 = RemoteActionCompatParcelizer + 85;
                serializer = i9 % Fields.SpotShadowColor;
                while (true) {
                    int i10 = i9 % 2;
                    String str = strArr3[i2];
                    String str2 = strArr3[i2 + 1];
                    DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(str);
                    DelayKt.serializer(str2, str);
                    if (i2 == i8) {
                        break;
                    }
                    i2 += 2;
                    i9 = serializer + 87;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                }
            }
            return new resetMessageMarginslambda00(strArr3);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0177  */
        public static void IconCompatParcelizer(long j, RegistryMissingComponentException registryMissingComponentException, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            int i6;
            int iIntValue;
            Object obj;
            int i7 = i;
            int i8 = i2;
            int i9 = 2 % 2;
            if (i8 < i3) {
                int i10 = serializer + 59;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = 0;
                if (i10 % 2 != 0) {
                    int i12 = 44 / 0;
                }
                for (int i13 = i8; i13 < i3; i13++) {
                    int i14 = serializer + 23;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        if (((RequestBuilder) arrayList.get(i13)).serializer() < i7) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                            return;
                        }
                    } else {
                        int i15 = 10 / 0;
                        if (((RequestBuilder) arrayList.get(i13)).serializer() < i7) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                            return;
                        }
                    }
                }
                RequestBuilder requestBuilder = (RequestBuilder) arrayList.get(i2);
                RequestBuilder requestBuilder2 = (RequestBuilder) arrayList.get(i3 - 1);
                if (i7 == requestBuilder.serializer()) {
                    int i16 = serializer + 21;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        iIntValue = ((Number) arrayList2.get(i8)).intValue();
                        obj = arrayList.get(i2);
                    } else {
                        iIntValue = ((Number) arrayList2.get(i8)).intValue();
                        i8++;
                        obj = arrayList.get(i8);
                    }
                    RequestBuilder requestBuilder3 = (RequestBuilder) obj;
                    i4 = i8;
                    i5 = iIntValue;
                    requestBuilder = requestBuilder3;
                } else {
                    i4 = i8;
                    i5 = -1;
                }
                if (requestBuilder.write(i7) != requestBuilder2.write(i7)) {
                    int i17 = RemoteActionCompatParcelizer + 37;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    int i19 = 1;
                    for (int i20 = i4 + 1; i20 < i3; i20++) {
                        if (((RequestBuilder) arrayList.get(i20 - 1)).write(i7) != ((RequestBuilder) arrayList.get(i20)).write(i7)) {
                            i19++;
                        }
                    }
                    long j2 = ((long) (i19 * 2)) + (registryMissingComponentException.size / 4) + j + 2;
                    registryMissingComponentException.MediaMetadataCompat(i19);
                    registryMissingComponentException.MediaMetadataCompat(i5);
                    for (int i21 = i4; i21 < i3; i21++) {
                        int iWrite = ((RequestBuilder) arrayList.get(i21)).write(i7);
                        if (i21 == i4 || iWrite != ((RequestBuilder) arrayList.get(i21 - 1)).write(i7)) {
                            registryMissingComponentException.MediaMetadataCompat(iWrite & 255);
                        }
                    }
                    RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
                    int i22 = i4;
                    while (i22 < i3) {
                        byte bWrite = ((RequestBuilder) arrayList.get(i22)).write(i7);
                        int i23 = i22 + 1;
                        int i24 = i23;
                        while (true) {
                            if (i24 >= i3) {
                                i6 = i3;
                                break;
                            } else {
                                if (bWrite != ((RequestBuilder) arrayList.get(i24)).write(i7)) {
                                    i6 = i24;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i23 != i6) {
                            registryMissingComponentException.MediaMetadataCompat(((int) ((registryMissingComponentException2.size / 4) + j2)) * (-1));
                            IconCompatParcelizer(j2, registryMissingComponentException2, i7 + 1, arrayList, i22, i6, arrayList2);
                        } else {
                            int i25 = serializer + 17;
                            RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
                            if (i25 % 2 == 0 ? i7 + 1 == ((RequestBuilder) arrayList.get(i22)).serializer() : i7 == ((RequestBuilder) arrayList.get(i22)).serializer()) {
                                int i26 = RemoteActionCompatParcelizer + 21;
                                serializer = i26 % Fields.SpotShadowColor;
                                int i27 = i26 % 2;
                                registryMissingComponentException.MediaMetadataCompat(((Number) arrayList2.get(i22)).intValue());
                            } else {
                                registryMissingComponentException.MediaMetadataCompat(((int) ((registryMissingComponentException2.size / 4) + j2)) * (-1));
                                IconCompatParcelizer(j2, registryMissingComponentException2, i7 + 1, arrayList, i22, i6, arrayList2);
                            }
                        }
                        i22 = i6;
                    }
                    registryMissingComponentException.IconCompatParcelizer(registryMissingComponentException2);
                    return;
                }
                int iMin = Math.min(requestBuilder.serializer(), requestBuilder2.serializer());
                for (int i28 = i7; i28 < iMin; i28++) {
                    int i29 = RemoteActionCompatParcelizer + 119;
                    serializer = i29 % Fields.SpotShadowColor;
                    if (i29 % 2 == 0) {
                        requestBuilder.write(i28);
                        requestBuilder2.write(i28);
                        throw null;
                    }
                    if (requestBuilder.write(i28) != requestBuilder2.write(i28)) {
                        break;
                    }
                    i11++;
                }
                long j3 = (registryMissingComponentException.size / 4) + j + 2 + ((long) i11) + 1;
                registryMissingComponentException.MediaMetadataCompat(-i11);
                registryMissingComponentException.MediaMetadataCompat(i5);
                int i30 = i7 + i11;
                while (i7 < i30) {
                    int i31 = RemoteActionCompatParcelizer + 23;
                    serializer = i31 % Fields.SpotShadowColor;
                    if (i31 % 2 == 0) {
                        registryMissingComponentException.MediaMetadataCompat(requestBuilder.write(i7) & 5617);
                        i7 += 92;
                    } else {
                        registryMissingComponentException.MediaMetadataCompat(requestBuilder.write(i7) & 255);
                        i7++;
                    }
                }
                if (i4 + 1 == i3) {
                    if (i30 == ((RequestBuilder) arrayList.get(i4)).serializer()) {
                        registryMissingComponentException.MediaMetadataCompat(((Number) arrayList2.get(i4)).intValue());
                        return;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                        return;
                    }
                }
                RegistryMissingComponentException registryMissingComponentException3 = new RegistryMissingComponentException();
                registryMissingComponentException.MediaMetadataCompat(((int) ((registryMissingComponentException3.size / 4) + j3)) * (-1));
                IconCompatParcelizer(j3, registryMissingComponentException3, i30, arrayList, i4, i3, arrayList2);
                registryMissingComponentException.IconCompatParcelizer(registryMissingComponentException3);
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
        }

        public static final boolean read(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            return ((Boolean) read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        }

        public static final Object IconCompatParcelizer(Object obj) {
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            return read(iWrite, -1825394297, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{obj}, iWrite3, 1825394297);
        }

        public static getConfigfwf_client_release r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            return (getConfigfwf_client_release) read(iWrite, 2078535869, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], iWrite3, -2078535866);
        }

        public static Object write(Class cls, InvocationHandler invocationHandler) {
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            return read(iWrite, 1514248696, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{cls, invocationHandler}, iWrite3, -1514248694);
        }

        public static final void RemoteActionCompatParcelizer(View view) {
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            read(iWrite, -1890765613, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{view}, iWrite3, 1890765614);
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return this.read[i];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.read.length;
    }

    public Options(RequestBuilder[] requestBuilderArr, int[] iArr) {
        this.read = requestBuilderArr;
        this.RemoteActionCompatParcelizer = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof RequestBuilder) {
            return super.contains((RequestBuilder) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof RequestBuilder) {
            return super.indexOf((RequestBuilder) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof RequestBuilder) {
            return super.lastIndexOf((RequestBuilder) obj);
        }
        return -1;
    }
}
