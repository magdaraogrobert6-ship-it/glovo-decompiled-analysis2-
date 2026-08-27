package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.activity.compose.BackHandlerKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.d4$$ExternalSyntheticLambda2;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import kotlin.TuplesKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DefaultContentCardsUpdateHandlerCompanionCREATOR1 {
    public static volatile CombinedScopeView IconCompatParcelizer;
    public static Boolean MediaBrowserCompatMediaItem;
    public static Boolean MediaSessionCompatQueueItem;
    public static Boolean read;
    public static Boolean write;

    public static final double read(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public abstract void RemoteActionCompatParcelizer(ImageLoader$Builder imageLoader$Builder);

    public abstract void write(Throwable th);

    public static void IconCompatParcelizer(String str) {
        SentryLogcatAdapter.IconCompatParcelizer("FIAM.Headless", str);
    }

    public static void RemoteActionCompatParcelizer() {
        Log.isLoggable("FIAM.Headless", 3);
    }

    public static void serializer() {
        Log.isLoggable("FIAM.Headless", 4);
    }

    public static boolean RemoteActionCompatParcelizer(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (write == null) {
            write = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        write.booleanValue();
        if (read == null) {
            read = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return read.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final void IconCompatParcelizer(int i, int i2, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer());
    }

    public static final String IconCompatParcelizer(int i, long j) {
        if (j >= 0) {
            TuplesKt.RemoteActionCompatParcelizer(i);
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        TuplesKt.RemoteActionCompatParcelizer(i);
        String string2 = Long.toString(j3, i);
        string2.getClass();
        TuplesKt.RemoteActionCompatParcelizer(i);
        String string3 = Long.toString(j4, i);
        string3.getClass();
        return string2.concat(string3);
    }

    public static final void read(int i) {
        if (i > 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("px must be > 0.");
    }

    public static final CancellableContinuationImpl RemoteActionCompatParcelizer(ShortNewsContentCardView shortNewsContentCardView) {
        if (!(shortNewsContentCardView instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(1, shortNewsContentCardView);
        }
        CancellableContinuationImpl cancellableContinuationImplSerializer = ((DispatchedContinuation) shortNewsContentCardView).serializer();
        if (cancellableContinuationImplSerializer != null) {
            if (!cancellableContinuationImplSerializer.ParcelableVolumeInfo()) {
                cancellableContinuationImplSerializer = null;
            }
            if (cancellableContinuationImplSerializer != null) {
                return cancellableContinuationImplSerializer;
            }
        }
        return new CancellableContinuationImpl(2, shortNewsContentCardView);
    }

    public static final void IconCompatParcelizer(boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        final boolean z2;
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (getpostalcode.write(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i5 = 1;
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            Object objRemoteActionCompatParcelizer = evaluateX.RemoteActionCompatParcelizer(getpostalcode);
            if (objRemoteActionCompatParcelizer == null) {
                getpostalcode.serializer(535274673);
                objRemoteActionCompatParcelizer = addOnUserLeaveHintListener.read(getpostalcode);
            } else {
                getpostalcode.serializer(535271790);
            }
            getpostalcode.IconCompatParcelizer(false);
            if (objRemoteActionCompatParcelizer != null) {
                boolean z4 = getpostalcode.read(objRemoteActionCompatParcelizer);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z4 || objComponentActivity == androidContentCaptureManager) {
                    accesswriteValidRootInUnitRange accesswritevalidrootinunitrange = objRemoteActionCompatParcelizer instanceof accesswriteValidRootInUnitRange ? (accesswriteValidRootInUnitRange) objRemoteActionCompatParcelizer : null;
                    clampValidRootInUnitRange navigationEventDispatcher = accesswritevalidrootinunitrange != null ? accesswritevalidrootinunitrange.getNavigationEventDispatcher() : null;
                    fullyDrawnReporter_delegatelambda0 fullydrawnreporter_delegatelambda0 = objRemoteActionCompatParcelizer instanceof fullyDrawnReporter_delegatelambda0 ? (fullyDrawnReporter_delegatelambda0) objRemoteActionCompatParcelizer : null;
                    getLifecycle getlifecycle = new getLifecycle(navigationEventDispatcher, fullydrawnreporter_delegatelambda0 != null ? fullydrawnreporter_delegatelambda0.getOnBackPressedDispatcher() : null);
                    getpostalcode.write(getlifecycle);
                    objComponentActivity = getlifecycle;
                }
                getLifecycle getlifecycle2 = (getLifecycle) objComponentActivity;
                long j = getpostalcode.RatingCompat;
                boolean z5 = getpostalcode.read(getlifecycle2);
                boolean zSerializer = getpostalcode.serializer(j);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                Object obj = objComponentActivity2;
                if ((z5 | zSerializer) || objComponentActivity2 == androidContentCaptureManager) {
                    addOnConfigurationChangedListener addonconfigurationchangedlistener = new addOnConfigurationChangedListener(new onBackPressedInput_delegatelambda0(j, objRemoteActionCompatParcelizer));
                    addonconfigurationchangedlistener.serializer = new b8$$ExternalSyntheticLambda4(i5);
                    getpostalcode.write(addonconfigurationchangedlistener);
                    obj = addonconfigurationchangedlistener;
                }
                addOnConfigurationChangedListener addonconfigurationchangedlistener2 = (addOnConfigurationChangedListener) obj;
                getpostalcode.serializer(-585307852);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(addonconfigurationchangedlistener2);
                boolean z6 = (i3 & 112) == 32;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | z6) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new d4$$ExternalSyntheticLambda2(addonconfigurationchangedlistener2, i5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(addonconfigurationchangedlistener2);
                int i6 = i3 & 14;
                boolean z7 = i6 == 4;
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer2 | z7) || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new BackHandlerKt$$ExternalSyntheticLambda1(addonconfigurationchangedlistener2, z3, 0);
                    getpostalcode.write(objComponentActivity4);
                }
                RangesKt.write(Boolean.valueOf(z3), addonconfigurationchangedlistener2, (accessisRenderNodeCompatiblecp) null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, i6);
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getlifecycle2);
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(addonconfigurationchangedlistener2);
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new Recomposer$$ExternalSyntheticLambda4(getlifecycle2, i5, addonconfigurationchangedlistener2);
                    getpostalcode.write(objComponentActivity5);
                }
                getPhoneNumberNational.IconCompatParcelizer(getlifecycle2, addonconfigurationchangedlistener2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                z2 = z3;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.addOnMultiWindowModeChangedListener
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer, i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final int serializer(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
